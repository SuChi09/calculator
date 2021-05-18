import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CalculationObject, CalculationResult } from '../models/calculation.model';

@Injectable({
  providedIn: 'root',
})
export class BackendService {
  constructor(private http: HttpClient) {}

  calculate(calculationObject: CalculationObject): Observable<CalculationResult> {
    let params = new HttpParams();
    params = params.append('op', calculationObject.operator);
    params = params.append('a', calculationObject.parameterOne);
    params = params.append('b', calculationObject.parameterTwo);

    return this.http.get<CalculationResult>('http://localhost:8080/calc/', { params: params });
  }
}
