package com.speedment.demo.sakila.sakila.film_text.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_text.FilmText;
import com.speedment.demo.sakila.sakila.film_text.FilmTextImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.demo.sakila.sakila.film_text.FilmText} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmTextSqlAdapter implements SqlAdapter<FilmText> {
    
    private final TableIdentifier<FilmText> tableIdentifier;
    
    protected GeneratedFilmTextSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_text");
    }
    
    protected FilmText apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setFilmId(      getShort(resultSet, 1 + offset))
            .setTitle(       resultSet.getString(2 + offset))
            .setDescription( resultSet.getString(3 + offset))
            ;
    }
    
    protected FilmTextImpl createEntity() {
        return new FilmTextImpl();
    }
    
    @Override
    public TableIdentifier<FilmText> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, FilmText> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, FilmText> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}