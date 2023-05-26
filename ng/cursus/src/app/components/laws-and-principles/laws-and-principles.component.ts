import {Component} from '@angular/core';
import {QuotesService} from "../../services/quotes.service";
import {Quote} from "../model/Quote";

@Component({
  selector: 'app-laws-and-principles',
  templateUrl: './laws-and-principles.component.html',
  styleUrls: ['./laws-and-principles.component.css']
})
export class LawsAndPrinciplesComponent {

  showText: string = 'The \"Peter Principle\"';
  showPicture: string = 'assets/peter.jpeg';
  iteratie: number = 0;

  quotes: Quote[] = [];

  quote: Quote = {} as Quote;


  constructor(private quotesService: QuotesService) {
    this.quotesService.getAll().subscribe((quotes) => this.quotes = quotes)
  }


  switchPrinciple() {
    let index = this.iteratie % this.quotes.length;
    this.showText = this.quotes[index].title;
    this.showPicture = this.quotes[index].picture;
    this.iteratie++;
  }


}


