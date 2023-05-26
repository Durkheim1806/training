import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Quote} from "../components/model/Quote";

@Injectable({
  providedIn: 'root'
})
export class QuotesService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Quote[]> {
    return this.http.get<Quote[]>('http://localhost:3000/quotes')
  }

  addQuote(quote: Quote): Observable<Quote> {
    return this.http.post<Quote>('http://localhost:3000/quotes', quote)
  }

  deleteQuote(id: number) {
    return this.http.delete(`http://localhost:3000/quotes/${id}`)
  }
}
