package Stage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import textrpg.GameManager;

public abstract class Stage {

	protected StringBuffer buffer = new StringBuffer();
    protected BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    protected BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


    public boolean update() {
        return false;
    }

    public void init() {
    }

    protected BufferedReader getReader() {
        return GameManager.getReader(); 
    }

    protected BufferedWriter getWriter() {
        return GameManager.getWriter();  
    }
}
