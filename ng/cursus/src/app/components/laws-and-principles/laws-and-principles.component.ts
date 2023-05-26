import {Component} from '@angular/core';
import {QuotesService} from "../../services/quotes.service";
import {Quote} from "../model/Quote";

@Component({
  selector: 'app-laws-and-principles',
  templateUrl: './laws-and-principles.component.html',
  styleUrls: ['./laws-and-principles.component.css']
})
export class LawsAndPrinciplesComponent {


  showTitle: string = ''
  showPicture: string = ''
  showLink: string = ''
  showText: string = ''
  quotes: Quote[] = []
  quote: Quote = {} as Quote
  iteratie: number = 0
  index: number = 0


  constructor(private quotesService: QuotesService) {
    this.quotesService.getAll().subscribe((quotes) => {
      this.quotes = quotes
      this.switchPrinciple()
    });
  }


  switchPrinciple() {
    this.index = this.iteratie % this.quotes.length
    this.showTitle = this.quotes[this.index].title
    this.showText = this.quotes[this.index].text
    this.showPicture = this.quotes[this.index].picture
    this.showLink = this.quotes[this.index].link
    this.iteratie++
  }


}


