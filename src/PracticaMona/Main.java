package PracticaMona;

class Mona {
    String form = "Octocat";
    String outfit;
    String editor;
    String activity;
    final String creator = "Simon Oxley";

    public Mona() {
        this.outfit = "None";
        this.form = "Octocat";
    }
    public Mona(String form, String outfit) {
        this.form = form;
        this.outfit = outfit;
    }
    public void hello() {
        System.out.println("Hello, I'm Mona the " + form);
    }
    public void origin() {
        System.out.println("From the old concept of 'Octopus merge' The founders bought a stock illustration\n" +
                "Half cat and half octopus for the pages to show when the server has a problem");
    }
    public void creator() {
        System.out.println("The octopuss was created by " + creator);
    }
    public void iDo() {
        System.out.println("I tell the cybernauts when the server throws an error");
    }
}

class Nyantocat extends Mona {

    public Nyantocat() {
        super("Nyantocat", "Nyancat");
        this.editor = "Cameron McEfee";
    }

    @Override
    public void iDo() {
        System.out.println("I fly around with a rainbow trail");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class LosMuertos extends Mona {
    public LosMuertos() {
        super("Octocat de los muertos", "catrina");
        this.editor = "Cameron McEfee";
    }

    @Override
    public void iDo() {
        System.out.println("I play guitar at the Día de los muertos");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class Octonaut extends Mona {
    public Octonaut() {
        super("Octonaut", "Astronaut");
        this.editor = "Cameron McEfee";
    }

    @Override
    public void iDo() {
        System.out.println("I go out in space missions");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class Codertocat extends Mona {
    public Codertocat() {
        super("Female codertocat", "developer");
        this.editor = "James Kang";
    }

    @Override
    public void iDo() {
        System.out.println("I develop software");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class Cherryontopocat extends Mona {
    public Cherryontopocat() {
        super("Cherryontop-o-cat", "Ice cream attendant");
        this.editor = "Jason Costello";
    }

    @Override
    public void iDo() {
        System.out.println("I serve as much icecream as you want");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class Droidtocat extends Mona {
    public Droidtocat() {
        super("Droidtocat", "android");
        this.editor = "Tony Jaramillo";
    }

    @Override
    public void iDo() {
        System.out.println("I'am an emotional support android");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

class OctobiWanCatnobi extends Mona {
    public OctobiWanCatnobi() {
        super("Octobi Wan Catnobi", "Jedi");
        this.editor = "Cameron McEfee";
    }

    @Override
    public void iDo() {
        System.out.println("Im not the octocat you're looking for");
    }

    @Override
    public void creator() {
        super.creator();
        System.out.println("The version using the outfit from " + this.outfit +
                " was created by " + this.editor);
    }
}

public class Main {
    public static void main(String[] args) {
        Mona Lisa = new Mona();
        OctobiWanCatnobi Jedi = new OctobiWanCatnobi();
        Jedi.hello();
        Jedi.iDo();
        Jedi.creator();
        System.out.println("");
        Lisa.hello();
        Lisa.origin();
        Lisa.iDo();
        Lisa.creator();
    }
}