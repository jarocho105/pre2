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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.EstadoDepreActiConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class EstadoDepreActiDetalleFormJInternalFrame extends EstadoDepreActiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDepreActi;
	
	protected JMenuBar jmenuBarDetalleEstadoDepreActi;
	
	protected JMenu jmenuDetalleEstadoDepreActi;
	protected JMenu jmenuDetalleArchivoEstadoDepreActi;
	protected JMenu jmenuDetalleAccionesEstadoDepreActi;
	protected JMenu jmenuDetalleDatosEstadoDepreActi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDepreActi;	
	protected GridBagConstraints gridBagConstraintsEstadoDepreActi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDepreActiBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDepreActi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDepreActiSessionBean estadodepreactiSessionBean;
	
	

	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame=null;
	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDepreciacionActivoFijo=false;
	public DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean;
	
		
	
	public EstadoDepreActiLogic estadodepreactiLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDepreActi;
	public JScrollPane jScrollPanelDatosEdicionEstadoDepreActi;
	public JScrollPane jScrollPanelDatosGeneralEstadoDepreActi;
	
	protected JPanel jPanelCamposEstadoDepreActi;    
	protected JPanel jPanelCamposOcultosEstadoDepreActi;    	
	protected JPanel jPanelAccionesEstadoDepreActi;
	protected JPanel jPanelAccionesFormularioEstadoDepreActi;
    
	
	
	protected Integer iXPanelCamposEstadoDepreActi=0;
	protected Integer iYPanelCamposEstadoDepreActi=0;
	
	protected Integer iXPanelCamposOcultosEstadoDepreActi=0;
	protected Integer iYPanelCamposOcultosEstadoDepreActi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDepreActi;
	public JButton jButtonModificarEstadoDepreActi;
	public JButton jButtonActualizarEstadoDepreActi;
    public JButton jButtonEliminarEstadoDepreActi;
	public JButton jButtonCancelarEstadoDepreActi;
    public JButton jButtonGuardarCambiosEstadoDepreActi;
	public JButton jButtonGuardarCambiosTablaEstadoDepreActi;
	protected JButton jButtonCerrarEstadoDepreActi;
	
	
	protected JButton jButtonProcesarInformacionEstadoDepreActi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDepreActi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDepreActi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDepreActi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDepreActi;
	protected JButton jButtonModificarToolBarEstadoDepreActi;
	protected JButton jButtonActualizarToolBarEstadoDepreActi;
    protected JButton jButtonEliminarToolBarEstadoDepreActi;
	protected JButton jButtonCancelarToolBarEstadoDepreActi;
    protected JButton jButtonGuardarCambiosToolBarEstadoDepreActi;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDepreActi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDepreActi;
	protected JButton jButtonCerrarToolBarEstadoDepreActi;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDepreActi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDepreActi;
	protected JMenuItem jMenuItemModificarEstadoDepreActi;
	protected JMenuItem jMenuItemActualizarEstadoDepreActi;
    protected JMenuItem jMenuItemEliminarEstadoDepreActi;
	protected JMenuItem jMenuItemCancelarEstadoDepreActi;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDepreActi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDepreActi;
	protected JMenuItem jMenuItemCerrarEstadoDepreActi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDepreActi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDepreActi;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDepreActi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDepreActi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDepreActi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDepreActi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDepreActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDepreActi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDepreActi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDepreActi;
	public JLabel jLabelIdEstadoDepreActi;
	public JTextFieldMe jTextFieldidEstadoDepreActi;
	public JButton jButtonidEstadoDepreActiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDepreActi;
	public JLabel jLabelcodigoEstadoDepreActi;
	public JTextField jTextFieldcodigoEstadoDepreActi;
	public JButton jButtoncodigoEstadoDepreActiBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDepreActi;
	public JLabel jLabelnombreEstadoDepreActi;
	public JTextArea jTextAreanombreEstadoDepreActi;
	public JScrollPane jscrollPanenombreEstadoDepreActi;
	public JButton jButtonnombreEstadoDepreActiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDepreActi;
	
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
	
	public EstadoDepreActiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDepreActi=new JPanel();
				this.jPanelAccionesFormularioEstadoDepreActi=new JPanel();
				this.jmenuBarDetalleEstadoDepreActi=new JMenuBar();
				this.jTtoolBarDetalleEstadoDepreActi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDepreActiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDepreActiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDepreActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDepreActi() {
		return this.jButtonActualizarToolBarEstadoDepreActi;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDepreActi() {
		return this.jButtonEliminarToolBarEstadoDepreActi;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDepreActi() {
		return this.jButtonCancelarToolBarEstadoDepreActi;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDepreActi() {
		return this.jButtonProcesarInformacionEstadoDepreActi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDepreActi)	{
		this.jButtonProcesarInformacionEstadoDepreActi = jButtonProcesarInformacionEstadoDepreActi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDepreActi() {
		return this.jComboBoxTiposAccionesEstadoDepreActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDepreActi(
			JComboBox jComboBoxTiposRelacionesEstadoDepreActi) {
		this.jComboBoxTiposRelacionesEstadoDepreActi = jComboBoxTiposRelacionesEstadoDepreActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDepreActi(
			JComboBox jComboBoxTiposAccionesEstadoDepreActi) {
		this.jComboBoxTiposAccionesEstadoDepreActi = jComboBoxTiposAccionesEstadoDepreActi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDepreActi() {
		return this.jComboBoxTiposAccionesFormularioEstadoDepreActi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDepreActi(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDepreActi) {
		this.jComboBoxTiposAccionesFormularioEstadoDepreActi = jComboBoxTiposAccionesFormularioEstadoDepreActi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		
		this.estadodepreactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodepreactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodepreactiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDepreActiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Depre Acti MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDepreActiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDepreActi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDepreActi=new JButtonMe();
				this.jButtonModificarToolBarEstadoDepreActi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi,
							"actualizar","actualizar","Actualizar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi,
							"eliminar","eliminar","Eliminar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi,
							"cancelar","cancelar","Cancelar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDepreActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDepreActi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDepreActi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDepreActi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDepreActi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDepreActi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDepreActi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDepreActi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDepreActi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDepreActi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDepreActi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDepreActi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDepreActi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDepreActi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDepreActi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDepreActi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDepreActi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDepreActi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDepreActi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDepreActi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDepreActi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDepreActi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDepreActi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDepreActi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDepreActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDepreActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDepreActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDepreActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDepreActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDepreActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDepreActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDepreActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDepreActi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDepreActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDepreActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDepreActi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDepreActi.add(this.jMenuItemDetalleCerrarEstadoDepreActi);
		
		this.jmenuDetalleAccionesEstadoDepreActi.add(this.jMenuItemActualizarEstadoDepreActi);
		this.jmenuDetalleAccionesEstadoDepreActi.add(this.jMenuItemEliminarEstadoDepreActi);
		this.jmenuDetalleAccionesEstadoDepreActi.add(this.jMenuItemCancelarEstadoDepreActi);		
		
		//this.jmenuDetalleDatosEstadoDepreActi.add(this.jMenuItemDetalleAbrirOrderByEstadoDepreActi);				
		this.jmenuDetalleDatosEstadoDepreActi.add(this.jMenuItemDetalleMostarOcultarEstadoDepreActi);				
				
		//this.jmenuDetalleAccionesEstadoDepreActi.add(this.jMenuItemGuardarCambiosEstadoDepreActi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDepreActi.add(this.jmenuDetalleArchivoEstadoDepreActi);		
		this.jmenuBarDetalleEstadoDepreActi.add(this.jmenuDetalleAccionesEstadoDepreActi);		
		this.jmenuBarDetalleEstadoDepreActi.add(this.jmenuDetalleDatosEstadoDepreActi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDepreActi.add(this.jmenuDetalleEstadoDepreActi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDepreActi);				
	}
	
	
	public void inicializarElementosCamposEstadoDepreActi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDepreActi = new JLabelMe();
		jLabelIdEstadoDepreActi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDepreActi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDepreActi.setToolTipText(EstadoDepreActiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDepreActi= new GridBagLayout();

		this.jPanelidEstadoDepreActi.setLayout(this.gridaBagLayoutEstadoDepreActi);

		jTextFieldidEstadoDepreActi = new JTextFieldMe();
		jTextFieldidEstadoDepreActi.setText("Id");

		jTextFieldidEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDepreActi = new JLabelMe();
		this.jLabelcodigoEstadoDepreActi.setText(""+EstadoDepreActiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDepreActi.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDepreActi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDepreActi.setToolTipText(EstadoDepreActiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDepreActi = new GridBagLayout();
		this.jPanelcodigoEstadoDepreActi.setLayout(this.gridaBagLayoutEstadoDepreActi);


		jTextFieldcodigoEstadoDepreActi= new JTextFieldMe();

		jTextFieldcodigoEstadoDepreActi.setEnabled(false);
		jTextFieldcodigoEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDepreActiBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDepreActiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDepreActiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDepreActiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDepreActiBusqueda.setText("U");
		this.jButtoncodigoEstadoDepreActiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDepreActiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDepreActiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDepreActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDepreActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDepreActiBusqueda"));

		if(this.estadodepreactiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDepreActiBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDepreActi = new JLabelMe();
		this.jLabelnombreEstadoDepreActi.setText(""+EstadoDepreActiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDepreActi.setToolTipText("Nombre");
		this.jLabelnombreEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDepreActi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDepreActi.setToolTipText(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDepreActi = new GridBagLayout();
		this.jPanelnombreEstadoDepreActi.setLayout(this.gridaBagLayoutEstadoDepreActi);


		jTextAreanombreEstadoDepreActi= new JTextAreaMe();
		jTextAreanombreEstadoDepreActi.setEnabled(false);
		jTextAreanombreEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDepreActi.setLineWrap(true);
		jTextAreanombreEstadoDepreActi.setWrapStyleWord(true);
		jTextAreanombreEstadoDepreActi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDepreActi.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDepreActi = new JScrollPane(jTextAreanombreEstadoDepreActi);
		jscrollPanenombreEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDepreActiBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDepreActiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDepreActiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDepreActiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDepreActiBusqueda.setText("U");
		this.jButtonnombreEstadoDepreActiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDepreActiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDepreActiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDepreActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDepreActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDepreActiBusqueda"));

		if(this.estadodepreactiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDepreActiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDepreActi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleEstadoDepreActi = new EstadoDepreActiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Depre Acti DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDepreActi= new GridBagLayout();
		

		
		String sToolTipEstadoDepreActi="";
		sToolTipEstadoDepreActi=EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDepreActi+="(ActivosFijos.EstadoDepreActi)";
		}
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDepreActi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDepreActi = new JButtonMe();
		this.jButtonModificarEstadoDepreActi = new JButtonMe();
        this.jButtonActualizarEstadoDepreActi = new JButtonMe();
        this.jButtonEliminarEstadoDepreActi = new JButtonMe();
        this.jButtonCancelarEstadoDepreActi = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDepreActi = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDepreActi = new JButtonMe();
		this.jButtonCerrarEstadoDepreActi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDepreActi = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDepreActi = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDepreActi = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Depre Acti";
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Depre Actis" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDepreActi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDepreActi.setName("jPanelCamposEstadoDepreActi"); 

		this.jPanelCamposOcultosEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDepreActi.setName("jPanelCamposOcultosEstadoDepreActi"); 

        this.jPanelAccionesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDepreActi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDepreActi.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDepreActi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDepreActi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDepreActi.setText("Nuevo");
		this.jButtonModificarEstadoDepreActi.setText("Editar");
        this.jButtonActualizarEstadoDepreActi.setText("Actualizar");
        this.jButtonEliminarEstadoDepreActi.setText("Eliminar");
        this.jButtonCancelarEstadoDepreActi.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDepreActi.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDepreActi.setText("Guardar");
		this.jButtonCerrarEstadoDepreActi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDepreActi,"nuevo_button","Nuevo",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDepreActi,"modificar_button","Editar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDepreActi,"actualizar_button","Actualizar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDepreActi,"eliminar_button","Eliminar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDepreActi,"cancelar_button","Cancelar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDepreActi,"guardarcambios_button","Guardar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDepreActi,"guardarcambiostabla_button","Guardar",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDepreActi,"cerrar_button","Salir",this.estadodepreactiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDepreActi.setToolTipText("Nuevo"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDepreActi.setToolTipText("Editar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDepreActi.setToolTipText("Actualizar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDepreActi.setToolTipText("Eliminar)"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDepreActi.setToolTipText("Cancelar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDepreActi.setToolTipText("Guardar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDepreActi.setToolTipText("Guardar"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDepreActi.setToolTipText("Salir"+" "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDepreActi";
		inputMap = this.jButtonNuevoEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDepreActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDepreActi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDepreActi";
		inputMap = this.jButtonActualizarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDepreActi"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDepreActi";
		inputMap = this.jButtonEliminarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDepreActi"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDepreActi";
		inputMap = this.jButtonCancelarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDepreActi"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDepreActi";
		inputMap = this.jButtonCerrarEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDepreActi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDepreActi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDepreActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDepreActi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDepreActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDepreActi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDepreActi.setToolTipText("Nuevo EstadoDepreActi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDepreActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDepreActi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDepreActi.setToolTipText("Sin Cerrar Ventana EstadoDepreActi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDepreActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDepreActi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDepreActi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDepreActi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDepreActi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDepreActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDepreActi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDepreActi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDepreActi = new JLabelMe();
		
		this.jLabelAccionesEstadoDepreActi.setText("Acciones");		
		this.jLabelAccionesEstadoDepreActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDepreActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDepreActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDepreActi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDepreActi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDepreActi=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDepreActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDepreActi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDepreActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDepreActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDepreActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDepreActi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDepreActi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDepreActi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDepreActi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDepreActi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDepreActi = new GridBagLayout();
		
		this.jPanelCamposEstadoDepreActi.setLayout(gridaBagLayoutCamposEstadoDepreActi);
		this.jPanelCamposOcultosEstadoDepreActi.setLayout(gridaBagLayoutCamposOcultosEstadoDepreActi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDepreActi.add(jLabelIdEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 1;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDepreActi.add(jTextFieldidEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);


	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDepreActi.add(jLabelcodigoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;
		this.gridBagConstraintsEstadoDepreActi.gridx = 2;
		this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
		this.gridBagConstraintsEstadoDepreActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDepreActi.add(jButtoncodigoEstadoDepreActiBusqueda, this.gridBagConstraintsEstadoDepreActi);
	}

	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 1;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDepreActi.add(jTextFieldcodigoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);


	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDepreActi.add(jLabelnombreEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;
		this.gridBagConstraintsEstadoDepreActi.gridx = 2;
		this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
		this.gridBagConstraintsEstadoDepreActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDepreActi.add(jButtonnombreEstadoDepreActiBusqueda, this.gridBagConstraintsEstadoDepreActi);
	}

	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDepreActi.gridy = 0;
	this.gridBagConstraintsEstadoDepreActi.gridx = 1;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDepreActi.add(jscrollPanenombreEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDepreActi.gridy = iYPanelCamposEstadoDepreActi;
	this.gridBagConstraintsEstadoDepreActi.gridx = iXPanelCamposEstadoDepreActi++;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDepreActi.add(this.jPanelidEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	if(iXPanelCamposEstadoDepreActi % 1==0) {
		iXPanelCamposEstadoDepreActi=0;
		iYPanelCamposEstadoDepreActi++;
	}
	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDepreActi.gridy = iYPanelCamposEstadoDepreActi;
	this.gridBagConstraintsEstadoDepreActi.gridx = iXPanelCamposEstadoDepreActi++;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDepreActi.add(this.jPanelcodigoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	if(iXPanelCamposEstadoDepreActi % 1==0) {
		iXPanelCamposEstadoDepreActi=0;
		iYPanelCamposEstadoDepreActi++;
	}
	this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDepreActi.gridy = iYPanelCamposEstadoDepreActi;
	this.gridBagConstraintsEstadoDepreActi.gridx = iXPanelCamposEstadoDepreActi++;
	this.gridBagConstraintsEstadoDepreActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDepreActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDepreActi.add(this.jPanelnombreEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);



	if(iXPanelCamposEstadoDepreActi % 1==0) {
		iXPanelCamposEstadoDepreActi=0;
		iYPanelCamposEstadoDepreActi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDepreActi= new GridBagLayout();
		this.jPanelAccionesEstadoDepreActi.setLayout(gridaBagLayoutAccionesEstadoDepreActi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDepreActi= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDepreActi.setLayout(gridaBagLayoutAccionesFormularioEstadoDepreActi);
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDepreActi.add(this.jComboBoxTiposAccionesFormularioEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);

		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDepreActi.add(this.jCheckBoxPostAccionNuevoEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDepreActi.add(this.jCheckBoxPostAccionSinCerrarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDepreActi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDepreActi.add(this.jCheckBoxPostAccionSinMensajeEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonModificarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);							

		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;
		this.gridBagConstraintsEstadoDepreActi.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonEliminarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonActualizarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);


		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;		
		this.gridBagConstraintsEstadoDepreActi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonGuardarCambiosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);	
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = 0;		
		this.gridBagConstraintsEstadoDepreActi.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDepreActi.add(this.jButtonCancelarEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDepreActi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDepreActi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;		
			//this.gridBagConstraintsEstadoDepreActi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDepreActi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDepreActi.gridx =0;
		this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDepreActi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDepreActi = new EstadoDepreActiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Depre Acti DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Depre Acti DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Depre Acti Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDepreActiModel estadodepreactiModel=new EstadoDepreActiModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDepreActiModel.EstadoDepreActiFocusTraversalPolicy estadodepreactiFocusTraversalPolicy = estadodepreactiModel.new EstadoDepreActiFocusTraversalPolicy(this);
			
			//estadodepreactiFocusTraversalPolicy.setestadodepreactiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodepreactiModel);
			
			
			this.jContentPaneDetalleEstadoDepreActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDepreActi = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDepreActi.setLayout(gridaBagLayoutDetalleEstadoDepreActi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDepreActi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
				this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDepreActi.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDepreActi.add(jTtoolBarDetalleEstadoDepreActi, gridBagConstraintsEstadoDepreActi);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDepreActi=   new JScrollPane(jContentPaneDetalleEstadoDepreActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDepreActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDepreActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDepreActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDepreActi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDepreActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDepreActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDepreActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDepreActi.add(jPanelCamposEstadoDepreActi, gridBagConstraintsEstadoDepreActi);
			
			
			
			
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
						&& estadodepreactiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(this.puedeCargarPorParteDepreciacionActivoFijo,false,-1);
					
					if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDepreActi= new GridBagConstraints();
						this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDepreActi.gridx = 0;
						this.jContentPaneDetalleEstadoDepreActi.add(this.jTabbedPaneRelacionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDepreActi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDepreActi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
					this.gridBagConstraintsEstadoDepreActi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDepreActi.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDepreActi.add(jPanelCamposOcultosEstadoDepreActi, gridBagConstraintsEstadoDepreActi);
				
					this.jPanelCamposOcultosEstadoDepreActi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	        this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDepreActi.add(this.jPanelAccionesFormularioEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);							
			
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoDepreActi.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDepreActi.add(this.jPanelAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDepreActi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDepreActi=   new JScrollPane(this.jPanelCamposEstadoDepreActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDepreActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDepreActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDepreActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;
			this.gridBagConstraintsEstadoDepreActi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDepreActi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDepreActi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);			
			
			this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
			this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDepreActi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
			
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		
			
		this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
		this.gridBagConstraintsEstadoDepreActi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDepreActi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDepreActi, this.gridBagConstraintsEstadoDepreActi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDepreActi;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDepreActi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {

				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL;
				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDepreActiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.depreciacionactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.depreciacionactivofijoBeanSwingJInternalFrame.setdepreciacionactivofijoSessionBean(this.depreciacionactivofijoSessionBean);

				//this.gridBagConstraintsEstadoDepreActi = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDepreActi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDepreActi.gridx = 0;
				//this.jContentPaneDetalleEstadoDepreActi.add(this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDepreActi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDepreActi.add("Depreciacion Activo Fijos",this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDepreActi.setComponentAt(iIndexTab,this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDepreciacionActivoFijo) {
					this.jTabbedPaneRelacionesEstadoDepreActi.add("Depreciacion Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDepreciacionActivoFijoBeanSwingJInternalFrame(List<EstadoDepreActi> estadodepreactis,EstadoDepreActi estadodepreacti,DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					depreciacionactivofijoBeanSwingJInternalFrame.getDepreciacionActivoFijoLogic().setConnexion(this.estadodepreactiLogic.getConnexion());

					depreciacionactivofijoBeanSwingJInternalFrame.setestadodepreactisForeignKey(estadodepreactis);
					depreciacionactivofijoBeanSwingJInternalFrame.setestadodepreactiForeignKey(estadodepreacti);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDepreActi(true);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setlidEstadoDepreActiActual(estadodepreacti.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					depreciacionactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDepreciacionActivoFijo(depreciacionactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDepreActi(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					depreciacionactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDepreActi");
					depreciacionactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDepreActi");
					depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(true);
					depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n",depreciacionactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, depreciacionactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					depreciacionactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("relacionado");
					} else {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("no_relacionado");
					}

					depreciacionactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDepreciacionActivoFijo().setVisible(false);

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
