import {Component} from '@angular/core';
import {Quote} from "../model/Quote";
import {QuotesService} from "../../services/quotes.service";

@Component({
  selector: 'app-maintenance',
  templateUrl: './maintenance.component.html',
  styleUrls: ['./maintenance.component.css']
})
export class MaintenanceComponent {

  quoteTitle = '';
  quoteText = '';
  quotes: Quote[] = [];
  quote: Quote = {} as Quote;

  constructor(private quotesService: QuotesService) {
    this.quotesService.getAll().subscribe((quotes) => this.quotes = quotes)
  }

  addQuote() {
    this.quote.title = this.quoteTitle
    this.quote.text = this.quoteText
    console.log('add quote', this.quoteTitle)
    this.quotesService.addQuote(this.quote).subscribe(quote => this.quotes.push(quote))
  }

}
