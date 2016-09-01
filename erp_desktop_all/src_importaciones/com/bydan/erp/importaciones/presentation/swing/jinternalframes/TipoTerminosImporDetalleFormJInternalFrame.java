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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoTerminosImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoTerminosImporDetalleFormJInternalFrame extends TipoTerminosImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTerminosImpor;
	
	protected JMenuBar jmenuBarDetalleTipoTerminosImpor;
	
	protected JMenu jmenuDetalleTipoTerminosImpor;
	protected JMenu jmenuDetalleArchivoTipoTerminosImpor;
	protected JMenu jmenuDetalleAccionesTipoTerminosImpor;
	protected JMenu jmenuDetalleDatosTipoTerminosImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTerminosImpor;	
	protected GridBagConstraints gridBagConstraintsTipoTerminosImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTerminosImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTerminosImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTerminosImporSessionBean tipoterminosimporSessionBean;
	
	
	
		
	
	public TipoTerminosImporLogic tipoterminosimporLogic;
	
	public JScrollPane jScrollPanelDatosTipoTerminosImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoTerminosImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoTerminosImpor;
	
	protected JPanel jPanelCamposTipoTerminosImpor;    
	protected JPanel jPanelCamposOcultosTipoTerminosImpor;    	
	protected JPanel jPanelAccionesTipoTerminosImpor;
	protected JPanel jPanelAccionesFormularioTipoTerminosImpor;
    
	
	
	protected Integer iXPanelCamposTipoTerminosImpor=0;
	protected Integer iYPanelCamposTipoTerminosImpor=0;
	
	protected Integer iXPanelCamposOcultosTipoTerminosImpor=0;
	protected Integer iYPanelCamposOcultosTipoTerminosImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTerminosImpor;
	public JButton jButtonModificarTipoTerminosImpor;
	public JButton jButtonActualizarTipoTerminosImpor;
    public JButton jButtonEliminarTipoTerminosImpor;
	public JButton jButtonCancelarTipoTerminosImpor;
    public JButton jButtonGuardarCambiosTipoTerminosImpor;
	public JButton jButtonGuardarCambiosTablaTipoTerminosImpor;
	protected JButton jButtonCerrarTipoTerminosImpor;
	
	
	protected JButton jButtonProcesarInformacionTipoTerminosImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTerminosImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTerminosImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTerminosImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTerminosImpor;
	protected JButton jButtonModificarToolBarTipoTerminosImpor;
	protected JButton jButtonActualizarToolBarTipoTerminosImpor;
    protected JButton jButtonEliminarToolBarTipoTerminosImpor;
	protected JButton jButtonCancelarToolBarTipoTerminosImpor;
    protected JButton jButtonGuardarCambiosToolBarTipoTerminosImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTerminosImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTerminosImpor;
	protected JButton jButtonCerrarToolBarTipoTerminosImpor;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTerminosImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTerminosImpor;
	protected JMenuItem jMenuItemModificarTipoTerminosImpor;
	protected JMenuItem jMenuItemActualizarTipoTerminosImpor;
    protected JMenuItem jMenuItemEliminarTipoTerminosImpor;
	protected JMenuItem jMenuItemCancelarTipoTerminosImpor;
    protected JMenuItem jMenuItemGuardarCambiosTipoTerminosImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTerminosImpor;
	protected JMenuItem jMenuItemCerrarTipoTerminosImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoTerminosImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTerminosImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTerminosImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTerminosImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoTerminosImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTerminosImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTerminosImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTerminosImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTerminosImpor;
	public JLabel jLabelIdTipoTerminosImpor;
	public JTextFieldMe jTextFieldidTipoTerminosImpor;
	public JButton jButtonidTipoTerminosImporBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoTerminosImpor;
	public JLabel jLabelcodigoTipoTerminosImpor;
	public JTextField jTextFieldcodigoTipoTerminosImpor;
	public JButton jButtoncodigoTipoTerminosImporBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTerminosImpor;
	public JLabel jLabelnombreTipoTerminosImpor;
	public JTextArea jTextAreanombreTipoTerminosImpor;
	public JScrollPane jscrollPanenombreTipoTerminosImpor;
	public JButton jButtonnombreTipoTerminosImporBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTerminosImpor;
	
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
	
	public TipoTerminosImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTerminosImpor=new JPanel();
				this.jPanelAccionesFormularioTipoTerminosImpor=new JPanel();
				this.jmenuBarDetalleTipoTerminosImpor=new JMenuBar();
				this.jTtoolBarDetalleTipoTerminosImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTerminosImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTerminosImpor() {
		return this.jButtonActualizarToolBarTipoTerminosImpor;
	}
	
	public JButton getjButtonEliminarToolBarTipoTerminosImpor() {
		return this.jButtonEliminarToolBarTipoTerminosImpor;
	}
	
	public JButton getjButtonCancelarToolBarTipoTerminosImpor() {
		return this.jButtonCancelarToolBarTipoTerminosImpor;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTerminosImpor() {
		return this.jButtonProcesarInformacionTipoTerminosImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTerminosImpor)	{
		this.jButtonProcesarInformacionTipoTerminosImpor = jButtonProcesarInformacionTipoTerminosImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTerminosImpor() {
		return this.jComboBoxTiposAccionesTipoTerminosImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTerminosImpor(
			JComboBox jComboBoxTiposRelacionesTipoTerminosImpor) {
		this.jComboBoxTiposRelacionesTipoTerminosImpor = jComboBoxTiposRelacionesTipoTerminosImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTerminosImpor(
			JComboBox jComboBoxTiposAccionesTipoTerminosImpor) {
		this.jComboBoxTiposAccionesTipoTerminosImpor = jComboBoxTiposAccionesTipoTerminosImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTerminosImpor() {
		return this.jComboBoxTiposAccionesFormularioTipoTerminosImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTerminosImpor(
			JComboBox jComboBoxTiposAccionesFormularioTipoTerminosImpor) {
		this.jComboBoxTiposAccionesFormularioTipoTerminosImpor = jComboBoxTiposAccionesFormularioTipoTerminosImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		
		this.tipoterminosimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoterminosimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoterminosimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTerminosImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Terminos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTerminosImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTerminosImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTerminosImpor=new JButtonMe();
				this.jButtonModificarToolBarTipoTerminosImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor,
							"actualizar","actualizar","Actualizar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor,
							"eliminar","eliminar","Eliminar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor,
							"cancelar","cancelar","Cancelar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTerminosImpor,this.jTtoolBarDetalleTipoTerminosImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTerminosImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTerminosImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTerminosImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTerminosImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTerminosImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTerminosImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTerminosImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTerminosImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTerminosImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTerminosImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTerminosImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTerminosImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTerminosImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTerminosImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTerminosImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTerminosImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTerminosImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTerminosImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTerminosImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTerminosImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTerminosImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTerminosImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTerminosImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTerminosImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTerminosImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTerminosImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTerminosImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTerminosImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTerminosImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTerminosImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTerminosImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTerminosImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTerminosImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTerminosImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTerminosImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTerminosImpor.add(this.jMenuItemDetalleCerrarTipoTerminosImpor);
		
		this.jmenuDetalleAccionesTipoTerminosImpor.add(this.jMenuItemActualizarTipoTerminosImpor);
		this.jmenuDetalleAccionesTipoTerminosImpor.add(this.jMenuItemEliminarTipoTerminosImpor);
		this.jmenuDetalleAccionesTipoTerminosImpor.add(this.jMenuItemCancelarTipoTerminosImpor);		
		
		//this.jmenuDetalleDatosTipoTerminosImpor.add(this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor);				
		this.jmenuDetalleDatosTipoTerminosImpor.add(this.jMenuItemDetalleMostarOcultarTipoTerminosImpor);				
				
		//this.jmenuDetalleAccionesTipoTerminosImpor.add(this.jMenuItemGuardarCambiosTipoTerminosImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTerminosImpor.add(this.jmenuDetalleArchivoTipoTerminosImpor);		
		this.jmenuBarDetalleTipoTerminosImpor.add(this.jmenuDetalleAccionesTipoTerminosImpor);		
		this.jmenuBarDetalleTipoTerminosImpor.add(this.jmenuDetalleDatosTipoTerminosImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTerminosImpor);				
	}
	
	
	public void inicializarElementosCamposTipoTerminosImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTerminosImpor = new JLabelMe();
		jLabelIdTipoTerminosImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTerminosImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTerminosImpor.setToolTipText(TipoTerminosImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTerminosImpor= new GridBagLayout();

		this.jPanelidTipoTerminosImpor.setLayout(this.gridaBagLayoutTipoTerminosImpor);

		jTextFieldidTipoTerminosImpor = new JTextFieldMe();
		jTextFieldidTipoTerminosImpor.setText("Id");

		jTextFieldidTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoTerminosImpor = new JLabelMe();
		this.jLabelcodigoTipoTerminosImpor.setText(""+TipoTerminosImporConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoTerminosImpor.setToolTipText("Codigo");
		this.jLabelcodigoTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoTerminosImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoTerminosImpor.setToolTipText(TipoTerminosImporConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoTerminosImpor = new GridBagLayout();
		this.jPanelcodigoTipoTerminosImpor.setLayout(this.gridaBagLayoutTipoTerminosImpor);


		jTextFieldcodigoTipoTerminosImpor= new JTextFieldMe();

		jTextFieldcodigoTipoTerminosImpor.setEnabled(false);
		jTextFieldcodigoTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoTerminosImporBusqueda= new JButtonMe();
		this.jButtoncodigoTipoTerminosImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTerminosImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTerminosImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoTerminosImporBusqueda.setText("U");
		this.jButtoncodigoTipoTerminosImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoTerminosImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoTerminosImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoTerminosImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoTerminosImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoTerminosImporBusqueda"));

		if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoTerminosImporBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoTerminosImpor = new JLabelMe();
		this.jLabelnombreTipoTerminosImpor.setText(""+TipoTerminosImporConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTerminosImpor.setToolTipText("Nombre");
		this.jLabelnombreTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTerminosImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTerminosImpor.setToolTipText(TipoTerminosImporConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTerminosImpor = new GridBagLayout();
		this.jPanelnombreTipoTerminosImpor.setLayout(this.gridaBagLayoutTipoTerminosImpor);


		jTextAreanombreTipoTerminosImpor= new JTextAreaMe();
		jTextAreanombreTipoTerminosImpor.setEnabled(false);
		jTextAreanombreTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTerminosImpor.setLineWrap(true);
		jTextAreanombreTipoTerminosImpor.setWrapStyleWord(true);
		jTextAreanombreTipoTerminosImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTerminosImpor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTerminosImpor = new JScrollPane(jTextAreanombreTipoTerminosImpor);
		jscrollPanenombreTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoTerminosImporBusqueda= new JButtonMe();
		this.jButtonnombreTipoTerminosImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTerminosImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTerminosImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTerminosImporBusqueda.setText("U");
		this.jButtonnombreTipoTerminosImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTerminosImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTerminosImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTerminosImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTerminosImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTerminosImporBusqueda"));

		if(this.tipoterminosimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTerminosImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTerminosImpor() {
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
		//this.jInternalFrameDetalleTipoTerminosImpor = new TipoTerminosImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Terminos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTerminosImpor= new GridBagLayout();
		

		
		String sToolTipTipoTerminosImpor="";
		sToolTipTipoTerminosImpor=TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTerminosImpor+="(Importaciones.TipoTerminosImpor)";
		}
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTerminosImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTerminosImpor = new JButtonMe();
		this.jButtonModificarTipoTerminosImpor = new JButtonMe();
        this.jButtonActualizarTipoTerminosImpor = new JButtonMe();
        this.jButtonEliminarTipoTerminosImpor = new JButtonMe();
        this.jButtonCancelarTipoTerminosImpor = new JButtonMe();
        this.jButtonGuardarCambiosTipoTerminosImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTerminosImpor = new JButtonMe();
		this.jButtonCerrarTipoTerminosImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoTerminosImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTerminosImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTerminosImpor = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Terminos";
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTerminosImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTerminosImpor.setName("jPanelCamposTipoTerminosImpor"); 

		this.jPanelCamposOcultosTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTerminosImpor.setName("jPanelCamposOcultosTipoTerminosImpor"); 

        this.jPanelAccionesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTerminosImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoTerminosImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTerminosImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTerminosImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTerminosImpor.setText("Nuevo");
		this.jButtonModificarTipoTerminosImpor.setText("Editar");
        this.jButtonActualizarTipoTerminosImpor.setText("Actualizar");
        this.jButtonEliminarTipoTerminosImpor.setText("Eliminar");
        this.jButtonCancelarTipoTerminosImpor.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTerminosImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.setText("Guardar");
		this.jButtonCerrarTipoTerminosImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTerminosImpor,"nuevo_button","Nuevo",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTerminosImpor,"modificar_button","Editar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTerminosImpor,"actualizar_button","Actualizar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTerminosImpor,"eliminar_button","Eliminar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTerminosImpor,"cancelar_button","Cancelar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTerminosImpor,"guardarcambios_button","Guardar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTerminosImpor,"guardarcambiostabla_button","Guardar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTerminosImpor,"cerrar_button","Salir",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTerminosImpor.setToolTipText("Nuevo"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTerminosImpor.setToolTipText("Editar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTerminosImpor.setToolTipText("Actualizar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTerminosImpor.setToolTipText("Eliminar)"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTerminosImpor.setToolTipText("Cancelar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTerminosImpor.setToolTipText("Guardar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.setToolTipText("Guardar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTerminosImpor.setToolTipText("Salir"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTerminosImpor";
		inputMap = this.jButtonNuevoTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTerminosImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTerminosImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTerminosImpor";
		inputMap = this.jButtonActualizarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTerminosImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTerminosImpor";
		inputMap = this.jButtonEliminarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTerminosImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTerminosImpor";
		inputMap = this.jButtonCancelarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTerminosImpor"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTerminosImpor";
		inputMap = this.jButtonCerrarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTerminosImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTerminosImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTerminosImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTerminosImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTerminosImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTerminosImpor.setToolTipText("Nuevo TipoTerminosImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTerminosImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTerminosImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTerminosImpor.setToolTipText("Sin Cerrar Ventana TipoTerminosImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTerminosImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTerminosImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTerminosImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTerminosImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoTerminosImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTerminosImpor = new JLabelMe();
		
		this.jLabelAccionesTipoTerminosImpor.setText("Acciones");		
		this.jLabelAccionesTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTerminosImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTerminosImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTerminosImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTerminosImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTerminosImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTerminosImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTerminosImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTerminosImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTerminosImpor = new GridBagLayout();
		
		this.jPanelCamposTipoTerminosImpor.setLayout(gridaBagLayoutCamposTipoTerminosImpor);
		this.jPanelCamposOcultosTipoTerminosImpor.setLayout(gridaBagLayoutCamposOcultosTipoTerminosImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTerminosImpor.add(jLabelIdTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 1;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTerminosImpor.add(jTextFieldidTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);


	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoTerminosImpor.add(jLabelcodigoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
		this.gridBagConstraintsTipoTerminosImpor.gridx = 2;
		this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
		this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoTerminosImpor.add(jButtoncodigoTipoTerminosImporBusqueda, this.gridBagConstraintsTipoTerminosImpor);
	}

	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 1;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoTerminosImpor.add(jTextFieldcodigoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);


	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTerminosImpor.add(jLabelnombreTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
		this.gridBagConstraintsTipoTerminosImpor.gridx = 2;
		this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
		this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTerminosImpor.add(jButtonnombreTipoTerminosImporBusqueda, this.gridBagConstraintsTipoTerminosImpor);
	}

	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
	this.gridBagConstraintsTipoTerminosImpor.gridx = 1;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTerminosImpor.add(jscrollPanenombreTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTerminosImpor.gridy = iYPanelCamposTipoTerminosImpor;
	this.gridBagConstraintsTipoTerminosImpor.gridx = iXPanelCamposTipoTerminosImpor++;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTerminosImpor.add(this.jPanelidTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	if(iXPanelCamposTipoTerminosImpor % 1==0) {
		iXPanelCamposTipoTerminosImpor=0;
		iYPanelCamposTipoTerminosImpor++;
	}
	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTerminosImpor.gridy = iYPanelCamposTipoTerminosImpor;
	this.gridBagConstraintsTipoTerminosImpor.gridx = iXPanelCamposTipoTerminosImpor++;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTerminosImpor.add(this.jPanelcodigoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	if(iXPanelCamposTipoTerminosImpor % 1==0) {
		iXPanelCamposTipoTerminosImpor=0;
		iYPanelCamposTipoTerminosImpor++;
	}
	this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTerminosImpor.gridy = iYPanelCamposTipoTerminosImpor;
	this.gridBagConstraintsTipoTerminosImpor.gridx = iXPanelCamposTipoTerminosImpor++;
	this.gridBagConstraintsTipoTerminosImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTerminosImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTerminosImpor.add(this.jPanelnombreTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);



	if(iXPanelCamposTipoTerminosImpor % 1==0) {
		iXPanelCamposTipoTerminosImpor=0;
		iYPanelCamposTipoTerminosImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTerminosImpor= new GridBagLayout();
		this.jPanelAccionesTipoTerminosImpor.setLayout(gridaBagLayoutAccionesTipoTerminosImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTerminosImpor= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTerminosImpor.setLayout(gridaBagLayoutAccionesFormularioTipoTerminosImpor);
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTerminosImpor.add(this.jComboBoxTiposAccionesFormularioTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);

		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTerminosImpor.add(this.jCheckBoxPostAccionNuevoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTerminosImpor.add(this.jCheckBoxPostAccionSinCerrarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoterminosimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTerminosImpor.add(this.jCheckBoxPostAccionSinMensajeTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonModificarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);							

		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
		this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonEliminarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonActualizarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);


		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonGuardarCambiosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);	
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;		
		this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonCancelarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTerminosImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTerminosImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;		
			//this.gridBagConstraintsTipoTerminosImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTerminosImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTerminosImpor.gridx =0;
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTerminosImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTerminosImpor = new TipoTerminosImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Terminos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Terminos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Terminos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTerminosImporModel tipoterminosimporModel=new TipoTerminosImporModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTerminosImporModel.TipoTerminosImporFocusTraversalPolicy tipoterminosimporFocusTraversalPolicy = tipoterminosimporModel.new TipoTerminosImporFocusTraversalPolicy(this);
			
			//tipoterminosimporFocusTraversalPolicy.settipoterminosimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoterminosimporModel);
			
			
			this.jContentPaneDetalleTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTerminosImpor = new GridBagLayout();	
			this.jContentPaneDetalleTipoTerminosImpor.setLayout(gridaBagLayoutDetalleTipoTerminosImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTerminosImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTerminosImpor.add(jTtoolBarDetalleTipoTerminosImpor, gridBagConstraintsTipoTerminosImpor);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTerminosImpor=   new JScrollPane(jContentPaneDetalleTipoTerminosImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTerminosImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	        
			this.jContentPaneDetalleTipoTerminosImpor.add(jPanelCamposTipoTerminosImpor, gridBagConstraintsTipoTerminosImpor);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoterminosimporSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoterminosimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTerminosImpor= new GridBagConstraints();
						this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
						this.jContentPaneDetalleTipoTerminosImpor.add(this.jTabbedPaneRelacionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTerminosImpor.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTerminosImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
					this.gridBagConstraintsTipoTerminosImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTerminosImpor.add(jPanelCamposOcultosTipoTerminosImpor, gridBagConstraintsTipoTerminosImpor);
				
					this.jPanelCamposOcultosTipoTerminosImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	        this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTerminosImpor.add(this.jPanelAccionesFormularioTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);							
			
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
	        this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTerminosImpor.add(this.jPanelAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTerminosImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTerminosImpor=   new JScrollPane(this.jPanelCamposTipoTerminosImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTerminosImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTerminosImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTerminosImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTerminosImpor;
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
