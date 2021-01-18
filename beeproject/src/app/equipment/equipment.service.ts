import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Equipment } from './equipment'

@Injectable({
  providedIn: 'root'
})
export class EquipmentService {

  private url = "http://localhost:4200/equipment/findAll"
  constructor(private http: HttpClient) { }


  findAll() {
   return this.http.get<Equipment[]>(this.url);
  }

}
