import {Injectable} from '@angular/core';
import {Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private _isLoggedIn: boolean = false; // Make this private so we can expose it via a get/set
  private loggedInChange$ = new Subject<boolean>(); // This will be used to create our Observable
  public isLoggedIn$ = this.loggedInChange$.asObservable(); // This is our Observable

  constructor() {
  }

  set isLoggedIn(val: boolean) {
    this._isLoggedIn = val; // Set the new value
    this.loggedInChange$.next(val); // Trigger the subject, which triggers the Observable
  }

  get isLoggedIn() {
    return this._isLoggedIn;
  }


}
