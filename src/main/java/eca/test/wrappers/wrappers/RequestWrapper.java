package eca.test.wrappers.wrappers;

import com.google.auto.value.AutoValue;
import com.google.common.base.Optional;

import javax.annotation.Nullable;

@AutoValue
public abstract class RequestWrapper {

    public abstract String getName();

    public abstract String getSurname();

    @Nullable
    abstract public Optional<String> getPhone();

    @Nullable
    abstract public Optional<String> getGroup();

    public static Builder builder() {
        return new AutoValue_RequestWrapper.Builder()
                .setPhone(Optional.<String>absent())
                .setGroup(Optional.<String>absent());
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setName(String value);
        public abstract Builder setSurname(String value);
        @Nullable abstract Builder setPhone(Optional<String> value);
        @Nullable public Builder setPhone(String value) {
            return setPhone(Optional.fromNullable(value));
        }
        @Nullable abstract Builder setGroup(Optional<String> value);
        @Nullable public Builder setGroup(String value) {
            return setGroup(Optional.fromNullable(value));
        }
        public abstract RequestWrapper build();
    }

}
