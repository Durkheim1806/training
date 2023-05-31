import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {LawsAndPrinciplesComponent} from './components/laws-and-principles/laws-and-principles.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {MaintenanceComponent} from './components/maintenance/maintenance.component';
import {
  LawsAndPrinciplesDetailsComponent
} from './components/laws-and-principles-details/laws-and-principles-details.component';
import {LoginComponent} from './components/login/login.component';
import {AuthGuard} from "./auth/auth-guard";
import {SearchComponent} from './components/search/search.component';


@NgModule({
  declarations: [
    AppComponent,
    LawsAndPrinciplesComponent,
    MaintenanceComponent,
    LawsAndPrinciplesDetailsComponent,
    LoginComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginComponent},
      {path: 'laws-and-principles', component: LawsAndPrinciplesComponent, canActivate: [AuthGuard]},
      {path: 'maintenance', component: MaintenanceComponent, canActivate: [AuthGuard]},
      {path: 'quotes/:id', component: LawsAndPrinciplesDetailsComponent, canActivate: [AuthGuard]},
      {path: '**', redirectTo: 'login'}
    ])
  ],
  providers: [
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule {


}
