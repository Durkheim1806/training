import {Component} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Quote} from "../model/Quote";
import {QuotesService} from "../../services/quotes.service";

@Component({
  selector: 'app-laws-and-principles-details',
  templateUrl: './laws-and-principles-details.component.html',
  styleUrls: ['./laws-and-principles-details.component.css']
})
export class LawsAndPrinciplesDetailsComponent {

  quote: Quote = {} as Quote

  constructor(private quotesService: QuotesService, private route: ActivatedRoute) {
    const quoteId = this.route.snapshot.paramMap.get('id');
    this.quotesService.getQuote(quoteId).subscribe((quote) => {
      this.quote = quote
    });
  }

  /*  quotes$: Observable<Quote[]>;
    selectedId: number;

    /!*
      quotes = QUOTES;
    *!/

    ngOnInit() {
      this.quotes$ = this.route.paramMap.pipe(
        switchMap(params => {
          this.selectedId = Number(params.get('id'));
          return this.quotesService.getHeroes();
        })
      );
    }*/


}
