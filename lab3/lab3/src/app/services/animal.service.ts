import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Animals } from '../interfaces/animals';
import { Url } from '../interfaces/url';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  list = new BehaviorSubject< Animals[]>([]);
  url = new Url().tomcat;

  constructor(private http:HttpClient) { }

  getAnimals():Observable< Animals[]>{
    return this.http.get< Animals[]>(this.url);
  }

  postAnimals(animal: Animals):Observable< Animals[]>{
    return this.http.post< Animals[]>(this.url,animal);
  }

  putAnimals(animal: Animals):Observable< Animals[]>{
    return this.http.put< Animals[]>(this.url+"/"+animal.title,animal);
  }

  deleteAnimals(animal: Animals):Observable< Animals[]>{
    return this.http.delete< Animals[]>(this.url+"/"+animal.title);
  }

  setList(list: Animals[]){
    this.list.next(list);
  }


}
