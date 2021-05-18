import { Component, OnInit } from '@angular/core';
import { CalculationObject, CalculationResult } from './shared/models/calculation.model';
import { BackendService } from './shared/services/backend.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  title = 'calculator-gui';

  paramOne: string;
  paramTwo: string;
  operator: string;

  result: CalculationResult;

  constructor(private backendService: BackendService) {}

  ngOnInit(): void {}

  onCalculate() {
    const request: CalculationObject = {
      parameterOne: this.paramOne,
      parameterTwo: this.paramTwo,
      operator: this.operator,
    };
    this.backendService.calculate(request).subscribe((result) => {
      this.result = result;
    });
  }
}
