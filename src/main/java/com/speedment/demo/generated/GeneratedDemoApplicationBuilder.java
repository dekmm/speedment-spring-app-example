package com.speedment.demo.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.demo.DemoApplication;
import com.speedment.demo.DemoApplicationBuilder;
import com.speedment.demo.DemoApplicationImpl;
import com.speedment.demo.DemoInjectorProxy;
import com.speedment.demo.sakila.sakila.actor.ActorManagerImpl;
import com.speedment.demo.sakila.sakila.actor.ActorSqlAdapter;
import com.speedment.demo.sakila.sakila.actor_genre.ActorGenreManagerImpl;
import com.speedment.demo.sakila.sakila.actor_genre.ActorGenreSqlAdapter;
import com.speedment.demo.sakila.sakila.actor_info.ActorInfoManagerImpl;
import com.speedment.demo.sakila.sakila.actor_info.ActorInfoSqlAdapter;
import com.speedment.demo.sakila.sakila.address.AddressManagerImpl;
import com.speedment.demo.sakila.sakila.address.AddressSqlAdapter;
import com.speedment.demo.sakila.sakila.category.CategoryManagerImpl;
import com.speedment.demo.sakila.sakila.category.CategorySqlAdapter;
import com.speedment.demo.sakila.sakila.city.CityManagerImpl;
import com.speedment.demo.sakila.sakila.city.CitySqlAdapter;
import com.speedment.demo.sakila.sakila.country.CountryManagerImpl;
import com.speedment.demo.sakila.sakila.country.CountrySqlAdapter;
import com.speedment.demo.sakila.sakila.customer.CustomerManagerImpl;
import com.speedment.demo.sakila.sakila.customer.CustomerSqlAdapter;
import com.speedment.demo.sakila.sakila.customer_list.CustomerListManagerImpl;
import com.speedment.demo.sakila.sakila.customer_list.CustomerListSqlAdapter;
import com.speedment.demo.sakila.sakila.datetime.DatetimeManagerImpl;
import com.speedment.demo.sakila.sakila.datetime.DatetimeSqlAdapter;
import com.speedment.demo.sakila.sakila.film.FilmManagerImpl;
import com.speedment.demo.sakila.sakila.film.FilmSqlAdapter;
import com.speedment.demo.sakila.sakila.film_actor.FilmActorManagerImpl;
import com.speedment.demo.sakila.sakila.film_actor.FilmActorSqlAdapter;
import com.speedment.demo.sakila.sakila.film_category.FilmCategoryManagerImpl;
import com.speedment.demo.sakila.sakila.film_category.FilmCategorySqlAdapter;
import com.speedment.demo.sakila.sakila.film_comment.FilmCommentManagerImpl;
import com.speedment.demo.sakila.sakila.film_comment.FilmCommentSqlAdapter;
import com.speedment.demo.sakila.sakila.film_genre.FilmGenreManagerImpl;
import com.speedment.demo.sakila.sakila.film_genre.FilmGenreSqlAdapter;
import com.speedment.demo.sakila.sakila.film_image.FilmImageManagerImpl;
import com.speedment.demo.sakila.sakila.film_image.FilmImageSqlAdapter;
import com.speedment.demo.sakila.sakila.film_list.FilmListManagerImpl;
import com.speedment.demo.sakila.sakila.film_list.FilmListSqlAdapter;
import com.speedment.demo.sakila.sakila.film_origin.FilmOriginManagerImpl;
import com.speedment.demo.sakila.sakila.film_origin.FilmOriginSqlAdapter;
import com.speedment.demo.sakila.sakila.film_rating.FilmRatingManagerImpl;
import com.speedment.demo.sakila.sakila.film_rating.FilmRatingSqlAdapter;
import com.speedment.demo.sakila.sakila.film_text.FilmTextManagerImpl;
import com.speedment.demo.sakila.sakila.film_text.FilmTextSqlAdapter;
import com.speedment.demo.sakila.sakila.inventory.InventoryManagerImpl;
import com.speedment.demo.sakila.sakila.inventory.InventorySqlAdapter;
import com.speedment.demo.sakila.sakila.language.LanguageManagerImpl;
import com.speedment.demo.sakila.sakila.language.LanguageSqlAdapter;
import com.speedment.demo.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmListManagerImpl;
import com.speedment.demo.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmListSqlAdapter;
import com.speedment.demo.sakila.sakila.payment.PaymentManagerImpl;
import com.speedment.demo.sakila.sakila.payment.PaymentSqlAdapter;
import com.speedment.demo.sakila.sakila.rental.RentalManagerImpl;
import com.speedment.demo.sakila.sakila.rental.RentalSqlAdapter;
import com.speedment.demo.sakila.sakila.sales_by_film_category.SalesByFilmCategoryManagerImpl;
import com.speedment.demo.sakila.sakila.sales_by_film_category.SalesByFilmCategorySqlAdapter;
import com.speedment.demo.sakila.sakila.sales_by_store.SalesByStoreManagerImpl;
import com.speedment.demo.sakila.sakila.sales_by_store.SalesByStoreSqlAdapter;
import com.speedment.demo.sakila.sakila.staff.StaffManagerImpl;
import com.speedment.demo.sakila.sakila.staff.StaffSqlAdapter;
import com.speedment.demo.sakila.sakila.staff_list.StaffListManagerImpl;
import com.speedment.demo.sakila.sakila.staff_list.StaffListSqlAdapter;
import com.speedment.demo.sakila.sakila.store.StoreManagerImpl;
import com.speedment.demo.sakila.sakila.store.StoreSqlAdapter;
import com.speedment.runtime.application.AbstractApplicationBuilder;
import com.speedment.runtime.connector.mysql.MySqlBundle;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named sakila.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedDemoApplicationBuilder extends AbstractApplicationBuilder<DemoApplication, DemoApplicationBuilder> {
    
    protected GeneratedDemoApplicationBuilder() {
        super(DemoApplicationImpl.class, GeneratedDemoMetadata.class);
        withManager(ActorManagerImpl.class);
        withManager(ActorGenreManagerImpl.class);
        withManager(AddressManagerImpl.class);
        withManager(CategoryManagerImpl.class);
        withManager(CityManagerImpl.class);
        withManager(CountryManagerImpl.class);
        withManager(CustomerManagerImpl.class);
        withManager(DatetimeManagerImpl.class);
        withManager(FilmManagerImpl.class);
        withManager(FilmActorManagerImpl.class);
        withManager(FilmCategoryManagerImpl.class);
        withManager(FilmCommentManagerImpl.class);
        withManager(FilmGenreManagerImpl.class);
        withManager(FilmImageManagerImpl.class);
        withManager(FilmOriginManagerImpl.class);
        withManager(FilmRatingManagerImpl.class);
        withManager(FilmTextManagerImpl.class);
        withManager(InventoryManagerImpl.class);
        withManager(LanguageManagerImpl.class);
        withManager(PaymentManagerImpl.class);
        withManager(RentalManagerImpl.class);
        withManager(StaffManagerImpl.class);
        withManager(StoreManagerImpl.class);
        withManager(ActorInfoManagerImpl.class);
        withManager(CustomerListManagerImpl.class);
        withManager(FilmListManagerImpl.class);
        withManager(NicerButSlowerFilmListManagerImpl.class);
        withManager(SalesByFilmCategoryManagerImpl.class);
        withManager(SalesByStoreManagerImpl.class);
        withManager(StaffListManagerImpl.class);
        withComponent(ActorSqlAdapter.class);
        withComponent(ActorGenreSqlAdapter.class);
        withComponent(AddressSqlAdapter.class);
        withComponent(CategorySqlAdapter.class);
        withComponent(CitySqlAdapter.class);
        withComponent(CountrySqlAdapter.class);
        withComponent(CustomerSqlAdapter.class);
        withComponent(DatetimeSqlAdapter.class);
        withComponent(FilmSqlAdapter.class);
        withComponent(FilmActorSqlAdapter.class);
        withComponent(FilmCategorySqlAdapter.class);
        withComponent(FilmCommentSqlAdapter.class);
        withComponent(FilmGenreSqlAdapter.class);
        withComponent(FilmImageSqlAdapter.class);
        withComponent(FilmOriginSqlAdapter.class);
        withComponent(FilmRatingSqlAdapter.class);
        withComponent(FilmTextSqlAdapter.class);
        withComponent(InventorySqlAdapter.class);
        withComponent(LanguageSqlAdapter.class);
        withComponent(PaymentSqlAdapter.class);
        withComponent(RentalSqlAdapter.class);
        withComponent(StaffSqlAdapter.class);
        withComponent(StoreSqlAdapter.class);
        withComponent(ActorInfoSqlAdapter.class);
        withComponent(CustomerListSqlAdapter.class);
        withComponent(FilmListSqlAdapter.class);
        withComponent(NicerButSlowerFilmListSqlAdapter.class);
        withComponent(SalesByFilmCategorySqlAdapter.class);
        withComponent(SalesByStoreSqlAdapter.class);
        withComponent(StaffListSqlAdapter.class);
        withBundle(MySqlBundle.class);
        withInjectorProxy(new DemoInjectorProxy());
    }
    
    @Override
    public DemoApplication build(Injector injector) {
        return injector.getOrThrow(DemoApplication.class);
    }
}