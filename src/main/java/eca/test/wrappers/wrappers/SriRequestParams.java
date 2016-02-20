package eca.test.wrappers.wrappers;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

//old way
public class SriRequestParams {

    private Optional<String> query;

    public SriRequestParams(String query) {
        checkNotNull(query);
        this.query = Optional.of(query);
    }

    public String getQuery() {
        return query.or("");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SriRequestParams that = (SriRequestParams) o;
        return Objects.equal(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(query);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("query", query)
                .toString();
    }
}
