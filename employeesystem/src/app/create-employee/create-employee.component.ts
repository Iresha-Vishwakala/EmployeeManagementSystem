import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  employee: Employee = new Employee();
  submitted = false;

  constructor(private employeeService: EmployeeService, private router: Router) {

  }

  ngOnInit() {
  }

  newEmployee() {
    this.submitted = false;
    this.employee = new Employee();
  }

  // save employee data
  save() {
    this.employeeService.createEmployee(this.employee)
      .subscribe(data => console.log(data), error => console.log(error));
    this.gotoList();
  }

  // submit form function
  onSubmit() {
    this.submitted = true;
    this.save();
  }

  // get employee list
  gotoList() {
    this.router.navigate(['/employees']);
  }

}
