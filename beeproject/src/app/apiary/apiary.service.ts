import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Apiary } from './apiary.model';
import { BeehiveDTO } from './beehive.model';

@Injectable({
  providedIn: 'root'
})
export class ApiaryService {

  private getAllURL = "http://localhost:4200/apiary/findAll";
  private createURL = "http://localhost:4200/apiary/add";
  private deleteURL = "http://localhost:4200/apiary/delete";
  private getAllBURL = "http://localhost:4200/beehive/findAll";
  private createBURL = "http://localhost:4200/beehive/add"

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get<Apiary[]>(this.getAllURL);
  }

  findAllBeehives() {
    return this.http.get<BeehiveDTO[]>(this.getAllBURL);
  }

  create(aps: Apiary) {
    return this.http.post<Apiary>(this.createURL, aps);
  }

  delete(aps: number) {
    return this.http.delete<Apiary>(this.deleteURL + '/' + aps);
  }
  
  createBeeHive(bh: BeehiveDTO) {
    return this.http.post<BeehiveDTO>(this.createBURL, bh);
  }
 
}
