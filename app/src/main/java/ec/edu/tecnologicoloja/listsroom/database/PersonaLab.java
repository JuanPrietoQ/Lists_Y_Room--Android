package ec.edu.tecnologicoloja.listsroom.database;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.room.Room;

import java.util.List;

public class PersonaLab {
    @SuppressLint("StaticFieldLeak")
    private static PersonaLab sPersonaLab;

    private PersonaDao mPersonaDao;

    public PersonaLab(Context context) {
        Context appContext = context.getApplicationContext();
        PersonaDataBase database = Room.databaseBuilder(appContext, PersonaDataBase.class, "personas")
                .allowMainThreadQueries().build();
        mPersonaDao = database.getPersonaDao();
    }

    public static PersonaLab get(Context context) {
        if (sPersonaLab == null) {
            sPersonaLab = new PersonaLab(context);
        }
        return sPersonaLab;
    }

    public List<Persona> getPersonas() {
        return mPersonaDao.getPersona();
    }

    public Persona getPersona(String id) {
        return mPersonaDao.getPersona(id);
    }

    public void addPersona(Persona persona) {
        mPersonaDao.addPersona(persona);
    }

    public void updatePersona(Persona persona) {
        mPersonaDao.updatePersona(persona);
    }

    public void deletePersona(Persona persona) {
        mPersonaDao.deleteAllPersona();
    }
    public void deleteAllPersona() {
        mPersonaDao.deleteAllPersona();
    }
}
