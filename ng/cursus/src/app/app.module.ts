import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {LawsAndPrinciplesComponent} from './components/laws-and-principles/laws-and-principles.component';
import {NavbarSearchComponent} from './components/navbar-search/navbar-search.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {MaintenanceComponent} from './components/maintenance/maintenance.component';


@NgModule({
  declarations: [
    AppComponent,
    LawsAndPrinciplesComponent,
    NavbarSearchComponent,
    MaintenanceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'laws-and-principles', component: LawsAndPrinciplesComponent},
      {path: 'maintenance', component: MaintenanceComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
