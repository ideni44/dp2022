import { Component, OnInit } from '@angular/core';
import { Animals } from '../interfaces/animals';
import { AnimalService } from '../services/animal.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  title:string="List of Animals";
  animalsList:Animals[]=[];
  showAddForm:boolean=false;
  selectedAnimal?:Animals;


  constructor(private service:AnimalService) { }

  ngOnInit(): void {
    this.updateAnimals();
  }

  updateAnimals(){
    this.service.getAnimals().subscribe(
      (animals)=>{
        this.animalsList=animals;
        this.service.setList(animals);
      }
    );
  }

  addAnimal(animal:Animals){
    this.service.postAnimals(animal).subscribe(
      (animal)=>{
        this.updateAnimals();
      }
    );
  }

  onSelect(animal:Animals){
    console.log(animal);
    if(this.selectedAnimal && animal.title==this.selectedAnimal.title){
      this.selectedAnimal=undefined;
    } else {
      this.selectedAnimal=animal;
    }
  }

  deleteAnimal(animal:Animals){
    this.service.deleteAnimals(animal).subscribe(
      ()=>{
        this.updateAnimals();
      }
    );
  }

}
