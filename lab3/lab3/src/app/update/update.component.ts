import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Animals } from '../interfaces/animals';
import { AnimalService } from '../services/animal.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.scss']
})
export class UpdateComponent implements OnInit {

  @Input() animal?:Animals
  @Output() updated:EventEmitter<null>= new EventEmitter();
  constructor(private service:AnimalService) { }

  ngOnInit(): void {
  }

  updateAnimal(){
    if(this.animal) {
      console.log(this.animal);
      this.service.putAnimals(this.animal).subscribe(
      ()=>{
        this.updated.emit();        
      }
    );}

  }


}