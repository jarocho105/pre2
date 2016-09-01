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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.LineaNegocioConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class LineaNegocioDetalleFormJInternalFrame extends LineaNegocioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLineaNegocio;
	
	protected JMenuBar jmenuBarDetalleLineaNegocio;
	
	protected JMenu jmenuDetalleLineaNegocio;
	protected JMenu jmenuDetalleArchivoLineaNegocio;
	protected JMenu jmenuDetalleAccionesLineaNegocio;
	protected JMenu jmenuDetalleDatosLineaNegocio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaNegocio;	
	protected GridBagConstraints gridBagConstraintsLineaNegocio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LineaNegocioBeanSwingJInternalFrameAdditional jInternalFrameDetalleLineaNegocio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public LineaNegocioSessionBean lineanegocioSessionBean;
	
	

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public LineaNegocioLogic lineanegocioLogic;
	
	public JScrollPane jScrollPanelDatosLineaNegocio;
	public JScrollPane jScrollPanelDatosEdicionLineaNegocio;
	public JScrollPane jScrollPanelDatosGeneralLineaNegocio;
	
	protected JPanel jPanelCamposLineaNegocio;    
	protected JPanel jPanelCamposOcultosLineaNegocio;    	
	protected JPanel jPanelAccionesLineaNegocio;
	protected JPanel jPanelAccionesFormularioLineaNegocio;
    
	
	
	protected Integer iXPanelCamposLineaNegocio=0;
	protected Integer iYPanelCamposLineaNegocio=0;
	
	protected Integer iXPanelCamposOcultosLineaNegocio=0;
	protected Integer iYPanelCamposOcultosLineaNegocio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLineaNegocio;
	public JButton jButtonModificarLineaNegocio;
	public JButton jButtonActualizarLineaNegocio;
    public JButton jButtonEliminarLineaNegocio;
	public JButton jButtonCancelarLineaNegocio;
    public JButton jButtonGuardarCambiosLineaNegocio;
	public JButton jButtonGuardarCambiosTablaLineaNegocio;
	protected JButton jButtonCerrarLineaNegocio;
	
	
	protected JButton jButtonProcesarInformacionLineaNegocio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLineaNegocio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLineaNegocio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLineaNegocio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaNegocio;
	protected JButton jButtonModificarToolBarLineaNegocio;
	protected JButton jButtonActualizarToolBarLineaNegocio;
    protected JButton jButtonEliminarToolBarLineaNegocio;
	protected JButton jButtonCancelarToolBarLineaNegocio;
    protected JButton jButtonGuardarCambiosToolBarLineaNegocio;
	protected JButton jButtonGuardarCambiosTablaToolBarLineaNegocio;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaNegocio;
	protected JButton jButtonCerrarToolBarLineaNegocio;
	
	protected JButton jButtonProcesarInformacionToolBarLineaNegocio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaNegocio;
	protected JMenuItem jMenuItemModificarLineaNegocio;
	protected JMenuItem jMenuItemActualizarLineaNegocio;
    protected JMenuItem jMenuItemEliminarLineaNegocio;
	protected JMenuItem jMenuItemCancelarLineaNegocio;
    protected JMenuItem jMenuItemGuardarCambiosLineaNegocio;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaNegocio;
	protected JMenuItem jMenuItemCerrarLineaNegocio;
	protected JMenuItem jMenuItemDetalleCerrarLineaNegocio;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaNegocio;
	
	protected JMenuItem jMenuItemProcesarInformacionLineaNegocio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaNegocio;
	protected JMenuItem jMenuItemMostrarOcultarLineaNegocio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaNegocio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaNegocio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLineaNegocio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLineaNegocio;
	public JLabel jLabelIdLineaNegocio;
	public JLabel jLabelidLineaNegocio;
	public JButton jButtonidLineaNegocioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoLineaNegocio;
	public JLabel jLabelcodigoLineaNegocio;
	public JTextField jTextFieldcodigoLineaNegocio;
	public JButton jButtoncodigoLineaNegocioBusqueda= new JButtonMe();

	public JPanel jPanelnombreLineaNegocio;
	public JLabel jLabelnombreLineaNegocio;
	public JTextArea jTextAreanombreLineaNegocio;
	public JScrollPane jscrollPanenombreLineaNegocio;
	public JButton jButtonnombreLineaNegocioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLineaNegocio;
	public JLabel jLabelid_empresaLineaNegocio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLineaNegocio;
	public JButton jButtonid_empresaLineaNegocio= new JButtonMe();
	public JButton jButtonid_empresaLineaNegocioUpdate= new JButtonMe();
	public JButton jButtonid_empresaLineaNegocioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLineaNegocio;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LineaNegocioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLineaNegocio=new JPanel();
				this.jPanelAccionesFormularioLineaNegocio=new JPanel();
				this.jmenuBarDetalleLineaNegocio=new JMenuBar();
				this.jTtoolBarDetalleLineaNegocio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LineaNegocioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarLineaNegocio() {
		return this.jButtonActualizarToolBarLineaNegocio;
	}
	
	public JButton getjButtonEliminarToolBarLineaNegocio() {
		return this.jButtonEliminarToolBarLineaNegocio;
	}
	
	public JButton getjButtonCancelarToolBarLineaNegocio() {
		return this.jButtonCancelarToolBarLineaNegocio;
	}		
	
	public JButton getjButtonProcesarInformacionLineaNegocio() {
		return this.jButtonProcesarInformacionLineaNegocio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaNegocio)	{
		this.jButtonProcesarInformacionLineaNegocio = jButtonProcesarInformacionLineaNegocio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaNegocio() {
		return this.jComboBoxTiposAccionesLineaNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaNegocio(
			JComboBox jComboBoxTiposRelacionesLineaNegocio) {
		this.jComboBoxTiposRelacionesLineaNegocio = jComboBoxTiposRelacionesLineaNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaNegocio(
			JComboBox jComboBoxTiposAccionesLineaNegocio) {
		this.jComboBoxTiposAccionesLineaNegocio = jComboBoxTiposAccionesLineaNegocio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLineaNegocio() {
		return this.jComboBoxTiposAccionesFormularioLineaNegocio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLineaNegocio(
			JComboBox jComboBoxTiposAccionesFormularioLineaNegocio) {
		this.jComboBoxTiposAccionesFormularioLineaNegocio = jComboBoxTiposAccionesFormularioLineaNegocio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.lineanegocioSessionBean=new LineaNegocioSessionBean();
		
		this.lineanegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineanegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineanegocioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaNegocioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea_negocio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		LineaNegocioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLineaNegocio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLineaNegocio=new JButtonMe();
				this.jButtonModificarToolBarLineaNegocio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio,
							"actualizar","actualizar","Actualizar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio,
							"eliminar","eliminar","Eliminar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio,
							"cancelar","cancelar","Cancelar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLineaNegocio,this.jTtoolBarDetalleLineaNegocio,
							"guardarcambios","guardarcambios","Guardar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLineaNegocio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLineaNegocio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLineaNegocio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLineaNegocio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLineaNegocio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaNegocio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaNegocio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaNegocio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLineaNegocio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLineaNegocio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLineaNegocio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLineaNegocio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLineaNegocio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLineaNegocio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLineaNegocio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLineaNegocio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLineaNegocio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLineaNegocio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLineaNegocio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLineaNegocio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLineaNegocio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaNegocio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaNegocio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLineaNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLineaNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLineaNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaNegocio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaNegocio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLineaNegocio.add(this.jMenuItemDetalleCerrarLineaNegocio);
		
		this.jmenuDetalleAccionesLineaNegocio.add(this.jMenuItemActualizarLineaNegocio);
		this.jmenuDetalleAccionesLineaNegocio.add(this.jMenuItemEliminarLineaNegocio);
		this.jmenuDetalleAccionesLineaNegocio.add(this.jMenuItemCancelarLineaNegocio);		
		
		//this.jmenuDetalleDatosLineaNegocio.add(this.jMenuItemDetalleAbrirOrderByLineaNegocio);				
		this.jmenuDetalleDatosLineaNegocio.add(this.jMenuItemDetalleMostarOcultarLineaNegocio);				
				
		//this.jmenuDetalleAccionesLineaNegocio.add(this.jMenuItemGuardarCambiosLineaNegocio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLineaNegocio.add(this.jmenuDetalleArchivoLineaNegocio);		
		this.jmenuBarDetalleLineaNegocio.add(this.jmenuDetalleAccionesLineaNegocio);		
		this.jmenuBarDetalleLineaNegocio.add(this.jmenuDetalleDatosLineaNegocio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLineaNegocio.add(this.jmenuDetalleLineaNegocio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLineaNegocio);				
	}
	
	
	public void inicializarElementosCamposLineaNegocio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLineaNegocio = new JLabelMe();
		jLabelIdLineaNegocio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLineaNegocio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLineaNegocio.setToolTipText(LineaNegocioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLineaNegocio= new GridBagLayout();

		this.jPanelidLineaNegocio.setLayout(this.gridaBagLayoutLineaNegocio);

		jLabelidLineaNegocio = new JLabel();
		jLabelidLineaNegocio.setText("Id");

		jLabelidLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoLineaNegocio = new JLabelMe();
		this.jLabelcodigoLineaNegocio.setText(""+LineaNegocioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoLineaNegocio.setToolTipText("Codigo");
		this.jLabelcodigoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoLineaNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoLineaNegocio.setToolTipText(LineaNegocioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutLineaNegocio = new GridBagLayout();
		this.jPanelcodigoLineaNegocio.setLayout(this.gridaBagLayoutLineaNegocio);


		jTextFieldcodigoLineaNegocio= new JTextFieldMe();

		jTextFieldcodigoLineaNegocio.setEnabled(false);
		jTextFieldcodigoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoLineaNegocioBusqueda= new JButtonMe();
		this.jButtoncodigoLineaNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoLineaNegocioBusqueda.setText("U");
		this.jButtoncodigoLineaNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoLineaNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoLineaNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoLineaNegocioBusqueda"));

		if(this.lineanegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoLineaNegocioBusqueda.setVisible(false);		}


					
		this.jLabelnombreLineaNegocio = new JLabelMe();
		this.jLabelnombreLineaNegocio.setText(""+LineaNegocioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLineaNegocio.setToolTipText("Nombre");
		this.jLabelnombreLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLineaNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLineaNegocio.setToolTipText(LineaNegocioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLineaNegocio = new GridBagLayout();
		this.jPanelnombreLineaNegocio.setLayout(this.gridaBagLayoutLineaNegocio);


		jTextAreanombreLineaNegocio= new JTextAreaMe();
		jTextAreanombreLineaNegocio.setEnabled(false);
		jTextAreanombreLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaNegocio.setLineWrap(true);
		jTextAreanombreLineaNegocio.setWrapStyleWord(true);
		jTextAreanombreLineaNegocio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLineaNegocio.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLineaNegocio = new JScrollPane(jTextAreanombreLineaNegocio);
		jscrollPanenombreLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreLineaNegocioBusqueda= new JButtonMe();
		this.jButtonnombreLineaNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLineaNegocioBusqueda.setText("U");
		this.jButtonnombreLineaNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLineaNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLineaNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLineaNegocioBusqueda"));

		if(this.lineanegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLineaNegocioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLineaNegocio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLineaNegocio = new JLabelMe();
		this.jLabelid_empresaLineaNegocio.setText(""+LineaNegocioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLineaNegocio.setToolTipText("Empresa");
		this.jLabelid_empresaLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLineaNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLineaNegocio.setToolTipText(LineaNegocioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLineaNegocio = new GridBagLayout();
		this.jPanelid_empresaLineaNegocio.setLayout(this.gridaBagLayoutLineaNegocio);


		jComboBoxid_empresaLineaNegocio= new JComboBoxMe();
		jComboBoxid_empresaLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLineaNegocio.setEnabled(false);

		this.jButtonid_empresaLineaNegocio= new JButtonMe();
		this.jButtonid_empresaLineaNegocio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaNegocio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaNegocio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaNegocio.setText("Buscar");
		this.jButtonid_empresaLineaNegocio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLineaNegocio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaNegocio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaNegocio"));

		this.jButtonid_empresaLineaNegocioBusqueda= new JButtonMe();
		this.jButtonid_empresaLineaNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaNegocioBusqueda.setText("U");
		this.jButtonid_empresaLineaNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLineaNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaNegocioBusqueda"));

		if(this.lineanegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLineaNegocioBusqueda.setVisible(false);		}

		this.jButtonid_empresaLineaNegocioUpdate= new JButtonMe();
		this.jButtonid_empresaLineaNegocioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaNegocioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaNegocioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaNegocioUpdate.setText("U");
		this.jButtonid_empresaLineaNegocioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLineaNegocioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaNegocioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLineaNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaNegocioUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleLineaNegocio = new LineaNegocioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Linea_negocio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaNegocio= new GridBagLayout();
		

		
		String sToolTipLineaNegocio="";
		sToolTipLineaNegocio=LineaNegocioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaNegocio+="(Cartera.LineaNegocio)";
		}
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaNegocio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLineaNegocio = new JButtonMe();
		this.jButtonModificarLineaNegocio = new JButtonMe();
        this.jButtonActualizarLineaNegocio = new JButtonMe();
        this.jButtonEliminarLineaNegocio = new JButtonMe();
        this.jButtonCancelarLineaNegocio = new JButtonMe();
        this.jButtonGuardarCambiosLineaNegocio = new JButtonMe();
		this.jButtonGuardarCambiosTablaLineaNegocio = new JButtonMe();
		this.jButtonCerrarLineaNegocio = new JButtonMe();
		
		this.jScrollPanelDatosLineaNegocio = new JScrollPane();   
        this.jScrollPanelDatosEdicionLineaNegocio = new JScrollPane();
		this.jScrollPanelDatosGeneralLineaNegocio = new JScrollPane();
				
		
		
		this.jPanelCamposLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Linea_negocio";
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLineaNegocio.setName("jPanelCamposLineaNegocio"); 

		this.jPanelCamposOcultosLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLineaNegocio.setName("jPanelCamposOcultosLineaNegocio"); 

        this.jPanelAccionesLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaNegocio.setToolTipText("Acciones");
        this.jPanelAccionesLineaNegocio.setName("Acciones"); 

		this.jPanelAccionesFormularioLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLineaNegocio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLineaNegocio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLineaNegocio.setText("Nuevo");
		this.jButtonModificarLineaNegocio.setText("Editar");
        this.jButtonActualizarLineaNegocio.setText("Actualizar");
        this.jButtonEliminarLineaNegocio.setText("Eliminar");
        this.jButtonCancelarLineaNegocio.setText("Cancelar");
        this.jButtonGuardarCambiosLineaNegocio.setText("Guardar");
		this.jButtonGuardarCambiosTablaLineaNegocio.setText("Guardar");
		this.jButtonCerrarLineaNegocio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaNegocio,"nuevo_button","Nuevo",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLineaNegocio,"modificar_button","Editar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLineaNegocio,"actualizar_button","Actualizar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLineaNegocio,"eliminar_button","Eliminar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLineaNegocio,"cancelar_button","Cancelar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLineaNegocio,"guardarcambios_button","Guardar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaNegocio,"guardarcambiostabla_button","Guardar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaNegocio,"cerrar_button","Salir",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLineaNegocio.setToolTipText("Nuevo"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLineaNegocio.setToolTipText("Editar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLineaNegocio.setToolTipText("Actualizar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLineaNegocio.setToolTipText("Eliminar)"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLineaNegocio.setToolTipText("Cancelar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLineaNegocio.setToolTipText("Guardar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLineaNegocio.setToolTipText("Guardar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaNegocio.setToolTipText("Salir"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoLineaNegocio";
		inputMap = this.jButtonNuevoLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaNegocio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLineaNegocio";
		inputMap = this.jButtonActualizarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLineaNegocio"));
		
		//ELIMINAR
		sMapKey = "EliminarLineaNegocio";
		inputMap = this.jButtonEliminarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLineaNegocio"));
		
		//CANCELAR	
		sMapKey = "CancelarLineaNegocio";
		inputMap = this.jButtonCancelarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLineaNegocio"));
		
		//CERRAR		
		sMapKey = "CerrarLineaNegocio";
		inputMap = this.jButtonCerrarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaNegocio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaNegocio";
		inputMap = this.jButtonGuardarCambiosTablaLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaNegocio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLineaNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLineaNegocio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLineaNegocio.setToolTipText("Nuevo LineaNegocio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLineaNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLineaNegocio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLineaNegocio.setToolTipText("Sin Cerrar Ventana LineaNegocio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLineaNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLineaNegocio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLineaNegocio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaNegocio.setText("Accion");
		this.jComboBoxTiposAccionesLineaNegocio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLineaNegocio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLineaNegocio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLineaNegocio = new JLabelMe();
		
		this.jLabelAccionesLineaNegocio.setText("Acciones");		
		this.jLabelAccionesLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLineaNegocio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLineaNegocio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLineaNegocio=new JTabbedPane();
		this.jTabbedPaneRelacionesLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLineaNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLineaNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLineaNegocio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaNegocio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaNegocio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLineaNegocio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLineaNegocio = new GridBagLayout();
		
		this.jPanelCamposLineaNegocio.setLayout(gridaBagLayoutCamposLineaNegocio);
		this.jPanelCamposOcultosLineaNegocio.setLayout(gridaBagLayoutCamposOcultosLineaNegocio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 0;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLineaNegocio.add(jLabelIdLineaNegocio, this.gridBagConstraintsLineaNegocio);



	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 1;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLineaNegocio.add(jLabelidLineaNegocio, this.gridBagConstraintsLineaNegocio);


	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 0;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLineaNegocio.add(jLabelid_empresaLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		//this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = 2;
		this.gridBagConstraintsLineaNegocio.ipadx = 0;
		this.gridBagConstraintsLineaNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaNegocio.add(jButtonid_empresaLineaNegocioBusqueda, this.gridBagConstraintsLineaNegocio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		//this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = 3;
		this.gridBagConstraintsLineaNegocio.ipadx = 0;
		this.gridBagConstraintsLineaNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaNegocio.add(jButtonid_empresaLineaNegocioUpdate, this.gridBagConstraintsLineaNegocio);
	}

	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 1;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLineaNegocio.add(jComboBoxid_empresaLineaNegocio, this.gridBagConstraintsLineaNegocio);


	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 0;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoLineaNegocio.add(jLabelcodigoLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		//this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = 2;
		this.gridBagConstraintsLineaNegocio.ipadx = 0;
		this.gridBagConstraintsLineaNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoLineaNegocio.add(jButtoncodigoLineaNegocioBusqueda, this.gridBagConstraintsLineaNegocio);
	}

	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 1;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoLineaNegocio.add(jTextFieldcodigoLineaNegocio, this.gridBagConstraintsLineaNegocio);


	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 0;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLineaNegocio.add(jLabelnombreLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		//this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = 2;
		this.gridBagConstraintsLineaNegocio.ipadx = 0;
		this.gridBagConstraintsLineaNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLineaNegocio.add(jButtonnombreLineaNegocioBusqueda, this.gridBagConstraintsLineaNegocio);
	}

	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaNegocio.gridy = 0;
	this.gridBagConstraintsLineaNegocio.gridx = 1;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLineaNegocio.add(jscrollPanenombreLineaNegocio, this.gridBagConstraintsLineaNegocio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaNegocio.gridy = iYPanelCamposLineaNegocio;
	this.gridBagConstraintsLineaNegocio.gridx = iXPanelCamposLineaNegocio++;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaNegocio.add(this.jPanelidLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(iXPanelCamposLineaNegocio % 1==0) {
		iXPanelCamposLineaNegocio=0;
		iYPanelCamposLineaNegocio++;
	}
	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaNegocio.gridy = iYPanelCamposLineaNegocio;
	this.gridBagConstraintsLineaNegocio.gridx = iXPanelCamposLineaNegocio++;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaNegocio.add(this.jPanelcodigoLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(iXPanelCamposLineaNegocio % 1==0) {
		iXPanelCamposLineaNegocio=0;
		iYPanelCamposLineaNegocio++;
	}
	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaNegocio.gridy = iYPanelCamposLineaNegocio;
	this.gridBagConstraintsLineaNegocio.gridx = iXPanelCamposLineaNegocio++;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaNegocio.add(this.jPanelnombreLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(iXPanelCamposLineaNegocio % 1==0) {
		iXPanelCamposLineaNegocio=0;
		iYPanelCamposLineaNegocio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaNegocio.gridy = iYPanelCamposOcultosLineaNegocio;
	this.gridBagConstraintsLineaNegocio.gridx = iXPanelCamposOcultosLineaNegocio++;
	this.gridBagConstraintsLineaNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLineaNegocio.add(this.jPanelid_empresaLineaNegocio, this.gridBagConstraintsLineaNegocio);



	if(iXPanelCamposOcultosLineaNegocio % 1==0) {
		iXPanelCamposOcultosLineaNegocio=0;
		iYPanelCamposOcultosLineaNegocio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLineaNegocio= new GridBagLayout();
		this.jPanelAccionesLineaNegocio.setLayout(gridaBagLayoutAccionesLineaNegocio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLineaNegocio= new GridBagLayout();
		this.jPanelAccionesFormularioLineaNegocio.setLayout(gridaBagLayoutAccionesFormularioLineaNegocio);
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaNegocio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaNegocio.add(this.jComboBoxTiposAccionesFormularioLineaNegocio, this.gridBagConstraintsLineaNegocio);

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaNegocio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaNegocio.add(this.jCheckBoxPostAccionNuevoLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaNegocio.add(this.jCheckBoxPostAccionSinCerrarLineaNegocio, this.gridBagConstraintsLineaNegocio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.lineanegocioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaNegocio.add(this.jCheckBoxPostAccionSinMensajeLineaNegocio, this.gridBagConstraintsLineaNegocio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXAccion++;
			
		this.jPanelAccionesLineaNegocio.add(this.jButtonModificarLineaNegocio, this.gridBagConstraintsLineaNegocio);							

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx =iPosXAccion++;
			
		this.jPanelAccionesLineaNegocio.add(this.jButtonEliminarLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = 0;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaNegocio.add(this.jButtonActualizarLineaNegocio, this.gridBagConstraintsLineaNegocio);


		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = 0;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaNegocio.add(this.jButtonGuardarCambiosLineaNegocio, this.gridBagConstraintsLineaNegocio);	
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = 0;		
		this.gridBagConstraintsLineaNegocio.gridx =iPosXAccion++;
		
		this.jPanelAccionesLineaNegocio.add(this.jButtonCancelarLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaNegocio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaNegocio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();						
			this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaNegocio.gridx = 0;		
			//this.gridBagConstraintsLineaNegocio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaNegocio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaNegocio.gridx =0;
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaNegocio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaNegocio, this.gridBagConstraintsLineaNegocio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLineaNegocio = new LineaNegocioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Linea_negocio DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Linea_negocio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea_negocio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LineaNegocioModel lineanegocioModel=new LineaNegocioModel(this);
			
			//SI USARA CLASE INTERNA
			//LineaNegocioModel.LineaNegocioFocusTraversalPolicy lineanegocioFocusTraversalPolicy = lineanegocioModel.new LineaNegocioFocusTraversalPolicy(this);
			
			//lineanegocioFocusTraversalPolicy.setlineanegocioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(lineanegocioModel);
			
			
			this.jContentPaneDetalleLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLineaNegocio = new GridBagLayout();	
			this.jContentPaneDetalleLineaNegocio.setLayout(gridaBagLayoutDetalleLineaNegocio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaNegocio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
				this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLineaNegocio.gridx = 0;
					
				
				this.jContentPaneDetalleLineaNegocio.add(jTtoolBarDetalleLineaNegocio, gridBagConstraintsLineaNegocio);								
				
}
			
			this.jScrollPanelDatosEdicionLineaNegocio=   new JScrollPane(jContentPaneDetalleLineaNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLineaNegocio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLineaNegocio.gridx = 0;
	        
			this.jContentPaneDetalleLineaNegocio.add(jPanelCamposLineaNegocio, gridBagConstraintsLineaNegocio);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& lineanegocioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					
					if(this.lineanegocioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLineaNegocio= new GridBagConstraints();
						this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLineaNegocio.gridx = 0;
						this.jContentPaneDetalleLineaNegocio.add(this.jTabbedPaneRelacionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLineaNegocio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLineaNegocio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
					this.gridBagConstraintsLineaNegocio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLineaNegocio.gridx = 0;
					
				
					this.jContentPaneDetalleLineaNegocio.add(jPanelCamposOcultosLineaNegocio, gridBagConstraintsLineaNegocio);
				
					this.jPanelCamposOcultosLineaNegocio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsLineaNegocio.gridx = 0;
	        this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLineaNegocio.add(this.jPanelAccionesFormularioLineaNegocio, this.gridBagConstraintsLineaNegocio);							
			
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
	        this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsLineaNegocio.gridx = 0;
	        
			
			this.jContentPaneDetalleLineaNegocio.add(this.jPanelAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLineaNegocio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLineaNegocio=   new JScrollPane(this.jPanelCamposLineaNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLineaNegocio.gridx = 0;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLineaNegocio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaNegocio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLineaNegocio, this.gridBagConstraintsLineaNegocio);			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaNegocio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLineaNegocio;//jContentPane;
		
		return jScrollPanelDatosEdicionLineaNegocio;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePoliticasCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		this.politicasclienteSessionBean.setConGuardarRelaciones(false);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicasclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
				//this.gridBagConstraintsLineaNegocio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLineaNegocio.gridx = 0;
				//this.jContentPaneDetalleLineaNegocio.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLineaNegocio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLineaNegocio.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLineaNegocio.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesLineaNegocio.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<LineaNegocio> lineanegocios,LineaNegocio lineanegocio,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.lineanegocioLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.setlineanegociosForeignKey(lineanegocios);
					politicasclienteBeanSwingJInternalFrame.setlineanegocioForeignKey(lineanegocio);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionLineaNegocio(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidLineaNegocioActual(lineanegocio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaLineaNegocio(true);
					politicasclienteBeanSwingJInternalFrame.setid_linea_negocioFK_IdLineaNegocio(lineanegocio.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameLineaNegocioForeignKey(lineanegocio,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdLineaNegocio");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLineaNegocio");
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticasCliente("n",politicasclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicasclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingPoliticasCliente(false);
					politicasclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicasclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("relacionado");
					} else {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");
					}

					politicasclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticasCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
