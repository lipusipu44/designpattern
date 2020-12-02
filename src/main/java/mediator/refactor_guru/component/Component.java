package mediator.refactor_guru.component;

import mediator.refactor_guru.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
