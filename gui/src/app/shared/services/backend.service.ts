import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CalculationObject, CalculationResult } from '../models/calculation.model';

@Injectable({
  providedIn: 'root',
})
export class BackendService {
  constructor(private http: HttpClient) {}

  calculate(calculationObject: CalculationObject) {
    return this.http.post<CalculationResult>('dummy/url', calculationObject, undefined);
  }
}
