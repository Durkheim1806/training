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
    /*
        return this.http.get<Quote[]>('http://localhost:3000/quotes')
    */
    return this.http.get<Quote[]>('http://localhost:9080/rest/api/quotes')
  }

  addQuote(quote: Quote): Observable<Quote> {
    return this.http.post<Quote>('http://localhost:3000/quotes', quote)
  }

  deleteQuote(id: number): Observable<Quote> {
    return this.http.delete<Quote>(`http://localhost:3000/quotes/${id}`)
  }

  getQuote(id: string | null) {
    return this.http.get<Quote>(`http://localhost:3000/quotes/${id}`)
  }
}
