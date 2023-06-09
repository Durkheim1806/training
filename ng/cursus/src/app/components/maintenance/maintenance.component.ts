import {Component} from '@angular/core';
import {Quote} from "../model/Quote";
import {QuotesService} from "../../services/quotes.service";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-maintenance',
  templateUrl: './maintenance.component.html',
  styleUrls: ['./maintenance.component.css']
})
export class MaintenanceComponent {

  quoteTitle = ''
  quoteText = ''
  quoteLink = ''
  quotes: Quote[] = []
  quote: Quote = {} as Quote

  constructor(private quotesService: QuotesService) {
    this.quotesService.getAll().subscribe((quotes) => this.quotes = quotes)
  }

  addQuote(form: NgForm) {
    if (form.valid) {
      this.quote.title = this.quoteTitle
      this.quote.text = this.quoteText
      this.quote.link = this.quoteLink
      this.quoteTitle = ''
      this.quoteText = ''
      this.quoteLink = ''
      console.log('add quote', this.quoteTitle)
      this.quotesService.addQuote(this.quote).subscribe(quote => {
        this.quotes.push(quote);
      })
    }
  }


  deleteQuote(quoteId: number) {
    console.log('quote id is:', quoteId)
    this.quotesService.deleteQuote(quoteId).subscribe({
        next: (result) => {
          console.log('quote added')
        },
        error: (error) => {
          console.log(error)
        }
      }
    );
    this.quotesService.getAll().subscribe((quotes) => this.quotes = quotes) // nog eens checken dit, zelfde doen als addQuote beter?
  }


}
