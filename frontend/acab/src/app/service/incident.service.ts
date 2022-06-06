import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import Incident from '../model/Incident';

@Injectable({
  providedIn: 'root'
})
export class IncidentService {

  constructor(private http: HttpClient) {}

  resolveIncident(incident : Incident){
    return this.http.post("http://localhost:8080/getResponse", incident)
  }
}
