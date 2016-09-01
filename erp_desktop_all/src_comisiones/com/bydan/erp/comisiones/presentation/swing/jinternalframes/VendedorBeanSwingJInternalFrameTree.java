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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.comisiones.util.VendedorConstantesFunciones;
import com.bydan.erp.comisiones.business.entity.Vendedor;

import com.bydan.erp.comisiones.business.logic.*;


//import com.bydan.erp.comisiones.business.entity.*;
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
public class VendedorBeanSwingJInternalFrameTree extends JInternalFrameBase implements TreeSelectionListener,TreeModelListener  //VendedorBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	protected JPanel jPanelTreeVendedor;
	public JScrollPane jScrollPaneDatosGeneralVendedor;
	public JScrollPane jScrollPaneTreeVendedor;
	private JTree treeVendedor;
	protected GridBagConstraints gridBagConstraintsVendedor;	
	protected DefaultMutableTreeNode defaultMutableTreeNode;
	protected DefaultTreeModel defaultTreeModel;
	
	protected List<Vendedor> vendedors;	
	VendedorLogic vendedorLogic;
	VendedorLogicAdditional vendedorLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  VendedorBeanSwingJInternalFrameTree(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			this.vendedors= new ArrayList<Vendedor>();
			
			vendedorLogic=new VendedorLogic();
			vendedorLogicAdditional=new VendedorLogicAdditional();
			
			this.initialize();
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public List<Vendedor> getVendedors() throws Exception {			
		return this.vendedors;
	}
	
	public void setVendedors(List<Vendedor> newVendedors) {
		this.vendedors = newVendedors;
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
        //this.CargarTreeVendedor(defaultMutableTreeNode);
 
		this.defaultTreeModel = new DefaultTreeModel(this.defaultMutableTreeNode);
		this.defaultTreeModel.addTreeModelListener(this);
	
        //Create a tree that allows one selection at a time.
        this.treeVendedor = new JTree(defaultTreeModel);//(defaultMutableTreeNode);
		
		this.treeVendedor.setMinimumSize(new Dimension(iWidth,iHeight));
		this.treeVendedor.setMaximumSize(new Dimension(iWidth,iHeight));
		this.treeVendedor.setPreferredSize(new Dimension(iWidth,iHeight));
		
        this.treeVendedor.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Listen for when the selection changes.
        this.treeVendedor.addTreeSelectionListener(this);
		
		this.jScrollPaneTreeVendedor = new JScrollPane(this.treeVendedor);
		
		this.jScrollPaneTreeVendedor.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeVendedor.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneTreeVendedor.setPreferredSize(new Dimension(iWidth,iHeight));
		
		this.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jPanelTreeVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jScrollPaneDatosGeneralVendedor = new JScrollPane();		                 
						       	
		//MUCHOS TITULOS
		//this.jPanelTreeVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL"));
        this.jPanelTreeVendedor.setToolTipText("ARBOL");
        this.jPanelTreeVendedor.setName("ARBOL"); 
		
		GridBagLayout gridaBagLayoutPrincipalVendedor = new GridBagLayout();		
		this.getContentPane().setLayout(gridaBagLayoutPrincipalVendedor);
		
		GridBagLayout gridaBagLayoutTreeVendedor= new GridBagLayout();
		this.jPanelTreeVendedor.setLayout(gridaBagLayoutTreeVendedor);
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = 0;		
		this.gridBagConstraintsVendedor.gridx =0;
		
		this.jPanelTreeVendedor.add(this.jScrollPaneTreeVendedor, this.gridBagConstraintsVendedor);
		
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
		//this.gridBagConstraintsVendedor.fill =GridBagConstraints.BOTH;
		//this.gridBagConstraintsVendedor.anchor=GridBagConstraints.NORTH;
		
		this.getContentPane().add(this.jPanelTreeVendedor, this.gridBagConstraintsVendedor);
		
		
		this.jScrollPaneDatosGeneralVendedor=   new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
		this.jScrollPaneTreeVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("ARBOL Vendedores"));		
		//MUCHOS TITULOS
		//this.jScrollPaneDatosGeneralVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
		
		this.jScrollPaneDatosGeneralVendedor.setMinimumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralVendedor.setMaximumSize(new Dimension(iWidth,iHeight));
		this.jScrollPaneDatosGeneralVendedor.setPreferredSize(new Dimension(iWidth,iHeight));
			
		return this.jScrollPaneDatosGeneralVendedor;
	}
		
	public void CargarTreeVendedor() {
		//this.defaultMutableTreeNode = new DefaultMutableTreeNode("Arbol");
		
		//INICIALIZA
		this.defaultMutableTreeNode.removeAllChildren();
		
		this.CargarTreeVendedor(this.defaultMutableTreeNode);
	}
	
	public void CargarTreeVendedor(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootVendedor = null;
        DefaultMutableTreeNode defaultMutableTreeNodeVendedor = null;
 
        defaultMutableTreeNodeRootVendedor = new DefaultMutableTreeNode("VendedorES");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootVendedor);
		
		ArrayList<Vendedor> vendedorsPrimerNivel=this.getPrimerNivelVendedors();
		ArrayList<Vendedor> vendedorsHijos=new ArrayList<Vendedor>();
		
		for(Vendedor vendedor:vendedorsPrimerNivel){//vendedors) {
			defaultMutableTreeNodeVendedor = new DefaultMutableTreeNode(vendedor);
			
			vendedorsHijos=this.getHijosVendedor(vendedor);
			
			if(vendedorsHijos.size()>0) {
				this.setHijosArbolVendedor(vendedorsHijos,defaultMutableTreeNodeVendedor);
			}
			
			defaultMutableTreeNodeRootVendedor.add(defaultMutableTreeNodeVendedor);
		}
	}	
	
	public void setHijosArbolVendedor(ArrayList<Vendedor> vendedorsAux,DefaultMutableTreeNode defaultMutableTreeNodeVendedorPadre) {
		ArrayList<Vendedor> vendedorsHijos=new ArrayList<Vendedor>();
		DefaultMutableTreeNode defaultMutableTreeNodeVendedor = null;
				 
		for(Vendedor vendedor:vendedorsAux) {
			defaultMutableTreeNodeVendedor = new DefaultMutableTreeNode(vendedor);
			
			vendedorsHijos=this.getHijosVendedor(vendedor);
			
			if(vendedorsHijos.size()>0) {
				this.setHijosArbolVendedor(vendedorsHijos,defaultMutableTreeNodeVendedor);
			}
			
			defaultMutableTreeNodeVendedorPadre.add(defaultMutableTreeNodeVendedor);
		}
	}
	
	public ArrayList<Vendedor> getHijosVendedor(Vendedor vendedorPadre) {
		ArrayList<Vendedor> vendedorsAux=new ArrayList<Vendedor>();
		
		for(Vendedor vendedor:vendedors) {
			if(vendedor.getid_vendedor()!=null && vendedor.getid_vendedor().equals(vendedorPadre.getId())) {
				vendedorsAux.add(vendedor);
			}
		}
		return vendedorsAux;
	}
	
	public ArrayList<Vendedor> getPrimerNivelVendedors() {
		ArrayList<Vendedor> vendedorsAux=new ArrayList<Vendedor>();
		
		for(Vendedor vendedor:vendedors) {
			if(vendedor.getid_vendedor()==null || vendedor.getid_vendedor()<=0) {
				vendedorsAux.add(vendedor);
			}
		}
		return vendedorsAux;
	}
	
	public void CargarTreeVendedorTest(DefaultMutableTreeNode defaultMutableTreeNodeTree) {
		DefaultMutableTreeNode defaultMutableTreeNodeRootVendedor = null;
        DefaultMutableTreeNode defaultMutableTreeNodeVendedor = null;
 
        defaultMutableTreeNodeRootVendedor = new DefaultMutableTreeNode("Root Arbol");
        defaultMutableTreeNodeTree.add(defaultMutableTreeNodeRootVendedor);
		
		for(int i=0;i<10;i++) {
			defaultMutableTreeNodeVendedor = new DefaultMutableTreeNode(i);
				
			defaultMutableTreeNodeRootVendedor.add(defaultMutableTreeNodeVendedor);
		}
		
		//NO NECESARIO
		//this.defaultTreeModel.reload();
	}	
	
	public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.treeVendedor.getLastSelectedPathComponent();
 
        if (defaultMutableTreeNode == null) return;
 
        Object userObject = defaultMutableTreeNode.getUserObject();
		
		Vendedor vendedor = (Vendedor)userObject;
           
        if (defaultMutableTreeNode.isLeaf()) {
            //displayURL(book.bookURL);
            System.out.print(vendedor.getId() + ":  \n    ");            
        } else {
            
        }
        
		//this.jInternalFrameParent.setIdActual(vendedor.getId());
		
		try {
			//this.jInternalFrameParent.procesarBusqueda("PorId");
			if(this.getsTipoProceso().equals("BUSQUEDA_NORMAL")) {
				this.jInternalFrameParent.buscarPorId(vendedor.getId());			
			} else if(this.getsTipoProceso().equals("BUSQUEDA_FK")) {
				this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(vendedor.getId(),this.sTipoBusqueda);			
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
        TreePath currentSelection = this.treeVendedor.getSelectionPath();
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
        TreePath parentPath = this.treeVendedor.getSelectionPath();

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
            this.treeVendedor.scrollPathToVisible(new TreePath(childNode.getPath()));
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

