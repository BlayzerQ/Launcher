package ru.gravit.launcher.events.request;

import ru.gravit.launcher.hasher.HashedDir;
import ru.gravit.launcher.request.ResultInterface;
import ru.gravit.utils.event.EventInterface;

import java.util.UUID;

public class UpdateListRequestEvent implements EventInterface, ResultInterface {
    private static final UUID uuid = UUID.fromString("5fa836ae-6b61-401c-96ac-d8396f07ec6b");
    public final String type;
    public final HashedDir dir;

    public UpdateListRequestEvent(HashedDir dir) {
        this.dir = dir;
        type = "success";
    }
    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public String getType() {
        return "updateList";
    }
}
