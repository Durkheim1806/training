import {Component} from '@angular/core';
import {AuthService} from "./services/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  backgroundColor = 'light';
  title = 'laws-and-principles';
  isLoggedIn = false


  constructor(private router: Router, private authService: AuthService) {
    this.authService.isLoggedIn$.subscribe((isLoggedIn) => this.isLoggedIn = isLoggedIn)
  }

  logout() {
    this.authService.isLoggedIn = false
    this.router.navigate(['/login'])
  }
}
