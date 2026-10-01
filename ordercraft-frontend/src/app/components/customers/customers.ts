import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { CustomerService } from '../../services/customer';
import { Customer } from '../../models/customer';

@Component({
  selector: 'app-customers',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './customers.html',
  styleUrl: './customers.css'
})
export class Customers implements OnInit {

  customers: Customer[] = [];

  newCustomer: Customer = {
    companyName: '',
    customerName: '',
    email: '',
    phone: ''
  };

  constructor(private customerService: CustomerService) {}

  ngOnInit(): void {
    this.loadCustomers();
  }

  loadCustomers(): void {

    this.customerService.getCustomers().subscribe({

      next: (data) => {
        this.customers = data;
        console.log('Customers:', data);
      },

      error: (error) => {
        console.error('Error loading customers:', error);
      }

    });

  }

  addCustomer(): void {

    this.customerService.createCustomer(this.newCustomer).subscribe({

      next: (customer) => {

        console.log('Customer added:', customer);

        this.customers.push(customer);

        this.newCustomer = {
          companyName: '',
          customerName: '',
          email: '',
          phone: ''
        };

      },

      error: (error) => {
        console.error('Error adding customer:', error);
      }

    });

  }

}