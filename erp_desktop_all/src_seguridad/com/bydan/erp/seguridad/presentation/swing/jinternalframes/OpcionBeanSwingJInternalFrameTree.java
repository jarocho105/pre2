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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.seguridad.util.OpcionConstantesFunciones;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.erp.seguridad.business.logic.*;


//import com.bydan.erp.seguridad.business.entity.*;
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
public class OpcionBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //OpcionBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeOpcion;
	public JScrollPane jScrollPaneDatosGeneralOpcion;
	public JScrollPane jScrollPaneTreeOpcion;
	private JTree treeOpcion;
	protected GridBagConstraints gridBagConstraintsOpcion;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<Opcion> opcions;	
	OpcionLogic opcionLogic;
	OpcionLogicAdditional opcionLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  OpcionBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.opcions= new ArrayList<Opcion>();
			
			opcionLogic=new OpcionLogic();
			opcionLogicAdditional=new OpcionLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<Opcion> getOpcions() throws Exception {			
		return this.opcions;
	}
	
	public void setOpcions(List<Opcion> newOpcions) {
		this.opcions = newOpcions;
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
        //this.CargarTreeOpcion(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeOpcion = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeOpcion.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeOpcion.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeOpcion.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeOpcion.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeOpcion.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeOpcion = new JScrollPane(this.treeOpcion);
		
		this.jScrollPaneTreeOpcion.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeOpcion.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeOpcion.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralOpcion = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeOpcion.setToolTipText("ARBOL");
        this.jPanelTreeOpcion.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalOpcion = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalOpcion);
		
		GridBagLayout gridaBagLayoutTreeOpcion= new GridBagLayout();
		this.jPanelTreeOpcion.setLayout(gridaBagLayoutTreeOpcion);
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = 0;		
		this.gridBagConstraintsOpcion.gridx =0;
		
		this.jPanelTreeOpcion.add(this.jScrollPaneTreeOpcion, this.gridBagConstraintsOpcion);
		
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
		//this.gridBagConstraintsOpcion.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsOpcion.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeOpcion, this.gridBagConstraintsOpcion);
		
		
		this.jScrollPaneDatosGeneralOpcion=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Opciones"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralOpcion.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralOpcion.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralOpcion.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralOpcion;
	}
		
	public void CargarTreeOpcion() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeOpcion(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeOpcion(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootOpcion = null;
        DefaultMutableTreeNode defaultMutableTreeNodeOpcion = null;
 
        defaultMutableTreeNodeRootOpcion = new DefaultMutableTreeNode("OpcionES");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootOpcion);
		
		ArrayList<Opcion> opcionsPrimerNivel=this.getPrimerNivelOpcions();
		ArrayList<Opcion> opcionsHijos=new ArrayList<Opcion>();
		
		for(Opcion opcion:opcionsPrimerNivel){//opcions) {
			defaultMutableTreeNodeOpcion = new DefaultMutableTreeNode(opcion);
			
			opcionsHijos=this.getHijosOpcion(opcion);
			
			if(opcionsHijos.size()>0) {
				this.setHijosArbolOpcion(opcionsHijos,defaultMutableTreeNodeOpcion);
			}
			
			defaultMutableTreeNodeRootOpcion.add(defaultMutableTreeNodeOpcion);
		}
	}	
	
	public void setHijosArbolOpcion(ArrayList<Opcion> opcionsAux,DefaultMutableTreeNode defaultMutableTreeNodeOpcionPadre) {
		ArrayList<Opcion> opcionsHijos=new ArrayList<Opcion>();
		DefaultMutableTreeNode defaultMutableTreeNodeOpcion = null;
				 
		for(Opcion opcion:opcionsAux) {
			defaultMutableTreeNodeOpcion = new DefaultMutableTreeNode(opcion);
			
			opcionsHijos=this.getHijosOpcion(opcion);
			
			if(opcionsHijos.size()>0) {
				this.setHijosArbolOpcion(opcionsHijos,defaultMutableTreeNodeOpcion);
			}
			
			defaultMutableTreeNodeOpcionPadre.add(defaultMutableTreeNodeOpcion);
		}
	}
	
	public ArrayList<Opcion> getHijosOpcion(Opcion opcionPadre) {
		ArrayList<Opcion> opcionsAux=new ArrayList<Opcion>();
		
		for(Opcion opcion:opcions) {
			if(opcion.getid_opcion()!=null && opcion.getid_opcion().equals(opcionPadre.getId())) {
				opcionsAux.add(opcion);
			}
		}
		return opcionsAux;
	}
	
	public ArrayList<Opcion> getPrimerNivelOpcions() {
		ArrayList<Opcion> opcionsAux=new ArrayList<Opcion>();
		
		for(Opcion opcion:opcions) {
			if(opcion.getid_opcion()==null || opcion.getid_opcion()<=0) {
				opcionsAux.add(opcion);
			}
		}
		return opcionsAux;
	}
	
	public void CargarTreeOpcionTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootOpcion = null;
        DefaultMutableTreeNode defaultMutableTreeNodeOpcion = null;
 
        defaultMutableTreeNodeRootOpcion = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootOpcion);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeOpcion = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootOpcion.add(defaultMutableTreeNodeOpcion);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeOpcion.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		Opcion opcion = (Opcion)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(opcion.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(opcion.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(opcion.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(opcion.getId(),this.sTipoBusqueda);			
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
        TreePath currentSelection = this.treeOpcion.getSelectionPath();
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
        TreePath parentPath = this.treeOpcion.getSelectionPath();

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
            this.treeOpcion.scrollPathToVisible(new TreePath(childNode.getPath()));
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

