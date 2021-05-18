import { Component, OnInit } from '@angular/core';
import { CalculationResult } from './shared/models/calculation.model';
import { BackendService } from './shared/services/backend.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  title = 'calculator-gui';
  result: CalculationResult;

  constructor(private backendService: BackendService) {}

  ngOnInit(): void {
    this.backendService.calculate(undefined).subscribe((result) => {
      this.result = result;
    });
  }
}
