package org.keefeteam.atlantis;

import com.badlogic.gdx.graphics.Texture;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@EqualsAndHashCode
public class Item {
    private String description;
    private Texture picture;
    private Map<Item, Item> recipes;
}
