import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { WeeklyEvidenceModule } from './weekly-evidence.module';

@Injectable({
  providedIn: 'root'
})
export class WeeklyEvidenceService {

private urlAll = "http://localhost:4200/weekly/findAll";
private urlCrt = "http://localhost:4200/weekly/add";

constructor(private http: HttpClient) { }

findAll() {
  return this.http.get<WeeklyEvidenceModule[]>(this.urlAll);
}

create(component: WeeklyEvidenceModule) {
  return this.http.post<WeeklyEvidenceModule>(this.urlCrt, component);
}
}
