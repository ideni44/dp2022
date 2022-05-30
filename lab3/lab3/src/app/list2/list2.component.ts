import { Component, OnInit } from '@angular/core';
import { Animals } from '../interfaces/animals';
import { AnimalService } from '../services/animal.service';

@Component({
  selector: 'app-list2',
  templateUrl: './list2.component.html',
  styleUrls: ['./list2.component.scss']
})
export class List2Component implements OnInit {

  animalsList:Animals[]=[]

  constructor(private service:AnimalService) { }

  ngOnInit(): void {
    this.service.list.subscribe(
      (list:Animals[])=>{this.animalsList=list}
    )
  }

}
