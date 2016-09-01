/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.nomina.util.EstructuraConstantesFunciones;
import com.bydan.erp.nomina.business.entity.Estructura;

import com.bydan.erp.nomina.business.logic.*;


//import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityReturnGeneral;


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class EstructuraBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //EstructuraBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeEstructura;
	public JScrollPane jScrollPaneDatosGeneralEstructura;
	public JScrollPane jScrollPaneTreeEstructura;
	private JTree treeEstructura;
	protected GridBagConstraints gridBagConstraintsEstructura;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<Estructura> estructuras;	
	EstructuraLogic estructuraLogic;
	EstructuraLogicAdditional estructuraLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  EstructuraBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.estructuras= new ArrayList<Estructura>();
			
			estructuraLogic=new EstructuraLogic();
			estructuraLogicAdditional=new EstructuraLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<Estructura> getEstructuras() throws Exception {			
		return this.estructuras;
	}
	
	public void setEstructuras(List<Estructura> newEstructuras) {
		this.estructuras = newEstructuras;
	}
	
	private void initialize() throws Exception {	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
		int iWidth=(screenSize.width-screenSize.width/3);
		int iHeight=(screenSize.height-screenSize.height/2);		
		
		this.setSize(iWidth,iHeight);
		
		this.setContentPane(this.getJContentPane(iWidth,iHeight));
	
		this.setResizable(true);
	    this.setClosable(true);
	    this.setMaximizable(true);
	    this.iconable=true;
		
		this.setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		
		if(Constantes.CON_VARIAS_VENTANAS) {
			openFrameCount++;
			
			if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
				openFrameCount=0;
			}
		}
	
	}
	
	public JScrollPane getJContentPane(int iWidth,int iHeight) throws Exception {	
		int iGridyPrincipal=0;
		
		this.defaultMutableTreeNode = new DefaultMutableTreeNode("ARBOL");
        //this.CargarTreeEstructura(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeEstructura = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeEstructura.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeEstructura.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeEstructura.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeEstructura.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeEstructura.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeEstructura = new JScrollPane(this.treeEstructura);
		
		this.jScrollPaneTreeEstructura.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeEstructura.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeEstructura.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralEstructura = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeEstructura.setToolTipText("ARBOL");
        this.jPanelTreeEstructura.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalEstructura = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalEstructura);
		
		GridBagLayout gridaBagLayoutTreeEstructura= new GridBagLayout();
		this.jPanelTreeEstructura.setLayout(gridaBagLayoutTreeEstructura);
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = 0;		
		this.gridBagConstraintsEstructura.gridx =0;
		
		this.jPanelTreeEstructura.add(this.jScrollPaneTreeEstructura, this.gridBagConstraintsEstructura);
		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
		//this.gridBagConstraintsEstructura.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsEstructura.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeEstructura, this.gridBagConstraintsEstructura);
		
		
		this.jScrollPaneDatosGeneralEstructura=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Estructuras"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralEstructura.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralEstructura.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralEstructura.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralEstructura;
	}
		
	public void CargarTreeEstructura() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeEstructura(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeEstructura(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootEstructura = null;
        DefaultMutableTreeNode defaultMutableTreeNodeEstructura = null;
 
        defaultMutableTreeNodeRootEstructura = new DefaultMutableTreeNode("EstructuraS");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootEstructura);
		
		ArrayList<Estructura> estructurasPrimerNivel=this.getPrimerNivelEstructuras();
		ArrayList<Estructura> estructurasHijos=new ArrayList<Estructura>();
		
		for(Estructura estructura:estructurasPrimerNivel){//estructuras) {
			defaultMutableTreeNodeEstructura = new DefaultMutableTreeNode(estructura);
			
			estructurasHijos=this.getHijosEstructura(estructura);
			
			if(estructurasHijos.size()>0) {
				this.setHijosArbolEstructura(estructurasHijos,defaultMutableTreeNodeEstructura);
			}
			
			defaultMutableTreeNodeRootEstructura.add(defaultMutableTreeNodeEstructura);
		}
	}	
	
	public void setHijosArbolEstructura(ArrayList<Estructura> estructurasAux,DefaultMutableTreeNode defaultMutableTreeNodeEstructuraPadre) {
		ArrayList<Estructura> estructurasHijos=new ArrayList<Estructura>();
		DefaultMutableTreeNode defaultMutableTreeNodeEstructura = null;
				 
		for(Estructura estructura:estructurasAux) {
			defaultMutableTreeNodeEstructura = new DefaultMutableTreeNode(estructura);
			
			estructurasHijos=this.getHijosEstructura(estructura);
			
			if(estructurasHijos.size()>0) {
				this.setHijosArbolEstructura(estructurasHijos,defaultMutableTreeNodeEstructura);
			}
			
			defaultMutableTreeNodeEstructuraPadre.add(defaultMutableTreeNodeEstructura);
		}
	}
	
	public ArrayList<Estructura> getHijosEstructura(Estructura estructuraPadre) {
		ArrayList<Estructura> estructurasAux=new ArrayList<Estructura>();
		
		for(Estructura estructura:estructuras) {
			if(estructura.getid_estructura()!=null && estructura.getid_estructura().equals(estructuraPadre.getId())) {
				estructurasAux.add(estructura);
			}
		}
		return estructurasAux;
	}
	
	public ArrayList<Estructura> getPrimerNivelEstructuras() {
		ArrayList<Estructura> estructurasAux=new ArrayList<Estructura>();
		
		for(Estructura estructura:estructuras) {
			if(estructura.getid_estructura()==null || estructura.getid_estructura()<=0) {
				estructurasAux.add(estructura);
			}
		}
		return estructurasAux;
	}
	
	public void CargarTreeEstructuraTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootEstructura = null;
        DefaultMutableTreeNode defaultMutableTreeNodeEstructura = null;
 
        defaultMutableTreeNodeRootEstructura = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootEstructura);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeEstructura = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootEstructura.add(defaultMutableTreeNodeEstructura);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeEstructura.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		Estructura estructura = (Estructura)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(estructura.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(estructura.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(estructura.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(estructura.getId(),this.sTipoBusqueda);			
			}
			
			//CERRAR VENTANA
			//this.jDesktopPane.add(this);			
	       	this.setVisible(false);
	        this.setSelected(false);			
			//this.dispose();
			//this=null;
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(userObject.toString());        
    }
	
	 public void clear() {
        this.defaultMutableTreeNode.removeAllChildren();
        this.defaultTreeModel.reload();
    }

	/** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = this.treeEstructura.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                this.defaultTreeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 

        // Either there was no selection, or the root was selected.
        //toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.treeEstructura.getSelectionPath();

        if (parentPath == null) {
            parentNode = this.defaultMutableTreeNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = this.defaultMutableTreeNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        this.defaultTreeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            this.treeEstructura.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }
	
	 public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
		
	//CONTROL_FUNCION2
}

