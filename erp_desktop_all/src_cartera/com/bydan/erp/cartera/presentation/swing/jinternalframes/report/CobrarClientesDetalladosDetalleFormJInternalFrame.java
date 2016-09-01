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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesDetalladosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesDetalladosDetalleFormJInternalFrame extends CobrarClientesDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarClientesDetallados;
	
	protected JMenuBar jmenuBarDetalleCobrarClientesDetallados;
	
	protected JMenu jmenuDetalleCobrarClientesDetallados;
	protected JMenu jmenuDetalleArchivoCobrarClientesDetallados;
	protected JMenu jmenuDetalleAccionesCobrarClientesDetallados;
	protected JMenu jmenuDetalleDatosCobrarClientesDetallados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesDetallados;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesDetallados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarClientesDetalladosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarClientesDetallados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarClientesDetalladosSessionBean cobrarclientesdetalladosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarClientesDetalladosLogic cobrarclientesdetalladosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarClientesDetallados;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesDetallados;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesDetallados;
	
	protected JPanel jPanelCamposCobrarClientesDetallados;    
	protected JPanel jPanelCamposOcultosCobrarClientesDetallados;    	
	protected JPanel jPanelAccionesCobrarClientesDetallados;
	protected JPanel jPanelAccionesFormularioCobrarClientesDetallados;
    
	
	
	protected Integer iXPanelCamposCobrarClientesDetallados=0;
	protected Integer iYPanelCamposCobrarClientesDetallados=0;
	
	protected Integer iXPanelCamposOcultosCobrarClientesDetallados=0;
	protected Integer iYPanelCamposOcultosCobrarClientesDetallados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarClientesDetallados;
	public JButton jButtonModificarCobrarClientesDetallados;
	public JButton jButtonActualizarCobrarClientesDetallados;
    public JButton jButtonEliminarCobrarClientesDetallados;
	public JButton jButtonCancelarCobrarClientesDetallados;
    public JButton jButtonGuardarCambiosCobrarClientesDetallados;
	public JButton jButtonGuardarCambiosTablaCobrarClientesDetallados;
	protected JButton jButtonCerrarCobrarClientesDetallados;
	
	
	protected JButton jButtonProcesarInformacionCobrarClientesDetallados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarClientesDetallados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarClientesDetallados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarClientesDetallados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesDetallados;
	protected JButton jButtonModificarToolBarCobrarClientesDetallados;
	protected JButton jButtonActualizarToolBarCobrarClientesDetallados;
    protected JButton jButtonEliminarToolBarCobrarClientesDetallados;
	protected JButton jButtonCancelarToolBarCobrarClientesDetallados;
    protected JButton jButtonGuardarCambiosToolBarCobrarClientesDetallados;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesDetallados;
	protected JButton jButtonCerrarToolBarCobrarClientesDetallados;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesDetallados;
	protected JMenuItem jMenuItemModificarCobrarClientesDetallados;
	protected JMenuItem jMenuItemActualizarCobrarClientesDetallados;
    protected JMenuItem jMenuItemEliminarCobrarClientesDetallados;
	protected JMenuItem jMenuItemCancelarCobrarClientesDetallados;
    protected JMenuItem jMenuItemGuardarCambiosCobrarClientesDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesDetallados;
	protected JMenuItem jMenuItemCerrarCobrarClientesDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesDetallados;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesDetallados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesDetallados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarClientesDetallados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarClientesDetallados;
	public JLabel jLabelIdCobrarClientesDetallados;
	public JLabel jLabelidCobrarClientesDetallados;
	public JButton jButtonidCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarClientesDetallados;
	public JLabel jLabelnombre_ciudadCobrarClientesDetallados;
	public JTextArea jTextAreanombre_ciudadCobrarClientesDetallados;
	public JScrollPane jscrollPanenombre_ciudadCobrarClientesDetallados;
	public JButton jButtonnombre_ciudadCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaCobrarClientesDetallados;
	public JLabel jLabelnombre_zonaCobrarClientesDetallados;
	public JTextField jTextFieldnombre_zonaCobrarClientesDetallados;
	public JButton jButtonnombre_zonaCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteCobrarClientesDetallados;
	public JLabel jLabelnombre_grupo_clienteCobrarClientesDetallados;
	public JTextArea jTextAreanombre_grupo_clienteCobrarClientesDetallados;
	public JScrollPane jscrollPanenombre_grupo_clienteCobrarClientesDetallados;
	public JButton jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_titulo_clienteCobrarClientesDetallados;
	public JLabel jLabelnombre_titulo_clienteCobrarClientesDetallados;
	public JTextArea jTextAreanombre_titulo_clienteCobrarClientesDetallados;
	public JScrollPane jscrollPanenombre_titulo_clienteCobrarClientesDetallados;
	public JButton jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarClientesDetallados;
	public JLabel jLabelcodigoCobrarClientesDetallados;
	public JTextField jTextFieldcodigoCobrarClientesDetallados;
	public JButton jButtoncodigoCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarClientesDetallados;
	public JLabel jLabelnombreCobrarClientesDetallados;
	public JTextArea jTextAreanombreCobrarClientesDetallados;
	public JScrollPane jscrollPanenombreCobrarClientesDetallados;
	public JButton jButtonnombreCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCobrarClientesDetallados;
	public JLabel jLabelapellidoCobrarClientesDetallados;
	public JTextArea jTextAreaapellidoCobrarClientesDetallados;
	public JScrollPane jscrollPaneapellidoCobrarClientesDetallados;
	public JButton jButtonapellidoCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelrucCobrarClientesDetallados;
	public JLabel jLabelrucCobrarClientesDetallados;
	public JTextField jTextFieldrucCobrarClientesDetallados;
	public JButton jButtonrucCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_contacto_clienteCobrarClientesDetallados;
	public JLabel jLabelnombre_contacto_clienteCobrarClientesDetallados;
	public JTextArea jTextAreanombre_contacto_clienteCobrarClientesDetallados;
	public JScrollPane jscrollPanenombre_contacto_clienteCobrarClientesDetallados;
	public JButton jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarClientesDetallados;
	public JLabel jLabeldireccion_direccionCobrarClientesDetallados;
	public JTextArea jTextAreadireccion_direccionCobrarClientesDetallados;
	public JScrollPane jscrollPanedireccion_direccionCobrarClientesDetallados;
	public JButton jButtondireccion_direccionCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPanele_mail_e_mailCobrarClientesDetallados;
	public JLabel jLabele_mail_e_mailCobrarClientesDetallados;
	public JTextArea jTextAreae_mail_e_mailCobrarClientesDetallados;
	public JScrollPane jscrollPanee_mail_e_mailCobrarClientesDetallados;
	public JButton jButtone_mail_e_mailCobrarClientesDetalladosBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarClientesDetallados;
	public JLabel jLabeltelefono_telefonoCobrarClientesDetallados;
	public JTextArea jTextAreatelefono_telefonoCobrarClientesDetallados;
	public JScrollPane jscrollPanetelefono_telefonoCobrarClientesDetallados;
	public JButton jButtontelefono_telefonoCobrarClientesDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarClientesDetallados;
	public JLabel jLabelid_empresaCobrarClientesDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarClientesDetallados;
	public JButton jButtonid_empresaCobrarClientesDetallados= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarClientesDetalladosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarClientesDetallados;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarClientesDetallados=new JPanel();
				this.jPanelAccionesFormularioCobrarClientesDetallados=new JPanel();
				this.jmenuBarDetalleCobrarClientesDetallados=new JMenuBar();
				this.jTtoolBarDetalleCobrarClientesDetallados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarClientesDetalladosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesDetalladosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarClientesDetallados() {
		return this.jButtonActualizarToolBarCobrarClientesDetallados;
	}
	
	public JButton getjButtonEliminarToolBarCobrarClientesDetallados() {
		return this.jButtonEliminarToolBarCobrarClientesDetallados;
	}
	
	public JButton getjButtonCancelarToolBarCobrarClientesDetallados() {
		return this.jButtonCancelarToolBarCobrarClientesDetallados;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarClientesDetallados() {
		return this.jButtonProcesarInformacionCobrarClientesDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesDetallados)	{
		this.jButtonProcesarInformacionCobrarClientesDetallados = jButtonProcesarInformacionCobrarClientesDetallados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesDetallados() {
		return this.jComboBoxTiposAccionesCobrarClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesDetallados(
			JComboBox jComboBoxTiposRelacionesCobrarClientesDetallados) {
		this.jComboBoxTiposRelacionesCobrarClientesDetallados = jComboBoxTiposRelacionesCobrarClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesDetallados(
			JComboBox jComboBoxTiposAccionesCobrarClientesDetallados) {
		this.jComboBoxTiposAccionesCobrarClientesDetallados = jComboBoxTiposAccionesCobrarClientesDetallados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarClientesDetallados() {
		return this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarClientesDetallados(
			JComboBox jComboBoxTiposAccionesFormularioCobrarClientesDetallados) {
		this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados = jComboBoxTiposAccionesFormularioCobrarClientesDetallados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
		
		this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarClientesDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarClientesDetallados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarClientesDetallados=new JButtonMe();
				this.jButtonModificarToolBarCobrarClientesDetallados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados,
							"actualizar","actualizar","Actualizar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados,
							"eliminar","eliminar","Eliminar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados,
							"cancelar","cancelar","Cancelar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarClientesDetallados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarClientesDetallados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarClientesDetallados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarClientesDetallados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarClientesDetallados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarClientesDetallados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarClientesDetallados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarClientesDetallados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarClientesDetallados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarClientesDetallados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarClientesDetallados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarClientesDetallados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarClientesDetallados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarClientesDetallados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarClientesDetallados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarClientesDetallados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarClientesDetallados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarClientesDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarClientesDetallados.add(this.jMenuItemDetalleCerrarCobrarClientesDetallados);
		
		this.jmenuDetalleAccionesCobrarClientesDetallados.add(this.jMenuItemActualizarCobrarClientesDetallados);
		this.jmenuDetalleAccionesCobrarClientesDetallados.add(this.jMenuItemEliminarCobrarClientesDetallados);
		this.jmenuDetalleAccionesCobrarClientesDetallados.add(this.jMenuItemCancelarCobrarClientesDetallados);		
		
		//this.jmenuDetalleDatosCobrarClientesDetallados.add(this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados);				
		this.jmenuDetalleDatosCobrarClientesDetallados.add(this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados);				
				
		//this.jmenuDetalleAccionesCobrarClientesDetallados.add(this.jMenuItemGuardarCambiosCobrarClientesDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarClientesDetallados.add(this.jmenuDetalleArchivoCobrarClientesDetallados);		
		this.jmenuBarDetalleCobrarClientesDetallados.add(this.jmenuDetalleAccionesCobrarClientesDetallados);		
		this.jmenuBarDetalleCobrarClientesDetallados.add(this.jmenuDetalleDatosCobrarClientesDetallados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarClientesDetallados);				
	}
	
	
	public void inicializarElementosCamposCobrarClientesDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarClientesDetallados = new JLabelMe();
		jLabelIdCobrarClientesDetallados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarClientesDetallados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarClientesDetallados= new GridBagLayout();

		this.jPanelidCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);

		jLabelidCobrarClientesDetallados = new JLabel();
		jLabelidCobrarClientesDetallados.setText("Id");

		jLabelidCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_ciudadCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombre_ciudadCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarClientesDetallados.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreanombre_ciudadCobrarClientesDetallados= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarClientesDetallados.setEnabled(false);
		jTextAreanombre_ciudadCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarClientesDetallados.setLineWrap(true);
		jTextAreanombre_ciudadCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarClientesDetallados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarClientesDetallados = new JScrollPane(jTextAreanombre_ciudadCobrarClientesDetallados);
		jscrollPanenombre_ciudadCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombre_zonaCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaCobrarClientesDetallados.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombre_zonaCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextFieldnombre_zonaCobrarClientesDetallados= new JTextFieldMe();

		jTextFieldnombre_zonaCobrarClientesDetallados.setEnabled(false);
		jTextFieldnombre_zonaCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombre_grupo_clienteCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreanombre_grupo_clienteCobrarClientesDetallados= new JTextAreaMe();
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setEnabled(false);
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setLineWrap(true);
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteCobrarClientesDetallados = new JScrollPane(jTextAreanombre_grupo_clienteCobrarClientesDetallados);
		jscrollPanenombre_grupo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE+" : *");
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados.setToolTipText("Nombre Titulo Cliente");
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_titulo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_titulo_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_titulo_clienteCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_titulo_clienteCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombre_titulo_clienteCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreanombre_titulo_clienteCobrarClientesDetallados= new JTextAreaMe();
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setEnabled(false);
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setLineWrap(true);
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_titulo_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_titulo_clienteCobrarClientesDetallados = new JScrollPane(jTextAreanombre_titulo_clienteCobrarClientesDetallados);
		jscrollPanenombre_titulo_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_titulo_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_titulo_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_titulo_clienteCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_titulo_clienteCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarClientesDetallados = new JLabelMe();
		this.jLabelcodigoCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarClientesDetallados.setToolTipText("Codigo");
		this.jLabelcodigoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelcodigoCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextFieldcodigoCobrarClientesDetallados= new JTextFieldMe();

		jTextFieldcodigoCobrarClientesDetallados.setEnabled(false);
		jTextFieldcodigoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombreCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarClientesDetallados.setToolTipText("Nombre");
		this.jLabelnombreCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombreCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreanombreCobrarClientesDetallados= new JTextAreaMe();
		jTextAreanombreCobrarClientesDetallados.setEnabled(false);
		jTextAreanombreCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarClientesDetallados.setLineWrap(true);
		jTextAreanombreCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreanombreCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarClientesDetallados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarClientesDetallados = new JScrollPane(jTextAreanombreCobrarClientesDetallados);
		jscrollPanenombreCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCobrarClientesDetallados = new JLabelMe();
		this.jLabelapellidoCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCobrarClientesDetallados.setToolTipText("Apello");
		this.jLabelapellidoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelapellidoCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreaapellidoCobrarClientesDetallados= new JTextAreaMe();
		jTextAreaapellidoCobrarClientesDetallados.setEnabled(false);
		jTextAreaapellidoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCobrarClientesDetallados.setLineWrap(true);
		jTextAreaapellidoCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreaapellidoCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCobrarClientesDetallados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCobrarClientesDetallados = new JScrollPane(jTextAreaapellidoCobrarClientesDetallados);
		jscrollPaneapellidoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelrucCobrarClientesDetallados = new JLabelMe();
		this.jLabelrucCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucCobrarClientesDetallados.setToolTipText("Ruc");
		this.jLabelrucCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelrucCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextFieldrucCobrarClientesDetallados= new JTextFieldMe();

		jTextFieldrucCobrarClientesDetallados.setEnabled(false);
		jTextFieldrucCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonrucCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonrucCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados = new JLabelMe();
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE+" : *");
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados.setToolTipText("Nombre Contacto Cliente");
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_contacto_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_contacto_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_contacto_clienteCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_contacto_clienteCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelnombre_contacto_clienteCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreanombre_contacto_clienteCobrarClientesDetallados= new JTextAreaMe();
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setEnabled(false);
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setLineWrap(true);
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_contacto_clienteCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_contacto_clienteCobrarClientesDetallados = new JScrollPane(jTextAreanombre_contacto_clienteCobrarClientesDetallados);
		jscrollPanenombre_contacto_clienteCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_contacto_clienteCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_contacto_clienteCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_contacto_clienteCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_contacto_clienteCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarClientesDetallados = new JLabelMe();
		this.jLabeldireccion_direccionCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarClientesDetallados.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreadireccion_direccionCobrarClientesDetallados= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarClientesDetallados.setEnabled(false);
		jTextAreadireccion_direccionCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarClientesDetallados.setLineWrap(true);
		jTextAreadireccion_direccionCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarClientesDetallados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarClientesDetallados = new JScrollPane(jTextAreadireccion_direccionCobrarClientesDetallados);
		jscrollPanedireccion_direccionCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabele_mail_e_mailCobrarClientesDetallados = new JLabelMe();
		this.jLabele_mail_e_mailCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL+" : *");
		this.jLabele_mail_e_mailCobrarClientesDetallados.setToolTipText("E Mail E Mail");
		this.jLabele_mail_e_mailCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mail_e_mailCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mail_e_mailCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mail_e_mailCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mail_e_mailCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mail_e_mailCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanele_mail_e_mailCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreae_mail_e_mailCobrarClientesDetallados= new JTextAreaMe();
		jTextAreae_mail_e_mailCobrarClientesDetallados.setEnabled(false);
		jTextAreae_mail_e_mailCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mail_e_mailCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mail_e_mailCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mail_e_mailCobrarClientesDetallados.setLineWrap(true);
		jTextAreae_mail_e_mailCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreae_mail_e_mailCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreae_mail_e_mailCobrarClientesDetallados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreae_mail_e_mailCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanee_mail_e_mailCobrarClientesDetallados = new JScrollPane(jTextAreae_mail_e_mailCobrarClientesDetallados);
		jscrollPanee_mail_e_mailCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mail_e_mailCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mail_e_mailCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreae_mail_e_mailCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreae_mail_e_mailCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mail_e_mailCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarClientesDetallados = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarClientesDetallados.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jTextAreatelefono_telefonoCobrarClientesDetallados= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarClientesDetallados.setEnabled(false);
		jTextAreatelefono_telefonoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarClientesDetallados.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarClientesDetallados.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarClientesDetallados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarClientesDetallados = new JScrollPane(jTextAreatelefono_telefonoCobrarClientesDetallados);
		jscrollPanetelefono_telefonoCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarClientesDetallados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarClientesDetallados = new JLabelMe();
		this.jLabelid_empresaCobrarClientesDetallados.setText(""+CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarClientesDetallados.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarClientesDetallados.setToolTipText(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		this.jPanelid_empresaCobrarClientesDetallados.setLayout(this.gridaBagLayoutCobrarClientesDetallados);


		jComboBoxid_empresaCobrarClientesDetallados= new JComboBoxMe();
		jComboBoxid_empresaCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarClientesDetallados.setEnabled(false);

		this.jButtonid_empresaCobrarClientesDetallados= new JButtonMe();
		this.jButtonid_empresaCobrarClientesDetallados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesDetallados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesDetallados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarClientesDetallados.setText("Buscar");
		this.jButtonid_empresaCobrarClientesDetallados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarClientesDetallados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesDetallados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesDetallados"));

		this.jButtonid_empresaCobrarClientesDetalladosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setText("U");
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesDetalladosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesDetalladosBusqueda"));

		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarClientesDetalladosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarClientesDetalladosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarClientesDetalladosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesDetalladosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarClientesDetalladosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarClientesDetalladosUpdate.setText("U");
		this.jButtonid_empresaCobrarClientesDetalladosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarClientesDetalladosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarClientesDetalladosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarClientesDetalladosUpdate"));



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
		//this.jInternalFrameDetalleCobrarClientesDetallados = new CobrarClientesDetalladosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Clientes Detallados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesDetallados= new GridBagLayout();
		

		
		String sToolTipCobrarClientesDetallados="";
		sToolTipCobrarClientesDetallados=CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesDetallados+="(Cartera.CobrarClientesDetallados)";
		}
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesDetallados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarClientesDetallados = new JButtonMe();
		this.jButtonModificarCobrarClientesDetallados = new JButtonMe();
        this.jButtonActualizarCobrarClientesDetallados = new JButtonMe();
        this.jButtonEliminarCobrarClientesDetallados = new JButtonMe();
        this.jButtonCancelarCobrarClientesDetallados = new JButtonMe();
        this.jButtonGuardarCambiosCobrarClientesDetallados = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados = new JButtonMe();
		this.jButtonCerrarCobrarClientesDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesDetallados = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarClientesDetallados = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarClientesDetallados = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Detallados";
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarClientesDetallados.setName("jPanelCamposCobrarClientesDetallados"); 

		this.jPanelCamposOcultosCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarClientesDetallados.setName("jPanelCamposOcultosCobrarClientesDetallados"); 

        this.jPanelAccionesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesDetallados.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarClientesDetallados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarClientesDetallados.setText("Nuevo");
		this.jButtonModificarCobrarClientesDetallados.setText("Editar");
        this.jButtonActualizarCobrarClientesDetallados.setText("Actualizar");
        this.jButtonEliminarCobrarClientesDetallados.setText("Eliminar");
        this.jButtonCancelarCobrarClientesDetallados.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarClientesDetallados.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setText("Guardar");
		this.jButtonCerrarCobrarClientesDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesDetallados,"nuevo_button","Nuevo",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarClientesDetallados,"modificar_button","Editar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarClientesDetallados,"actualizar_button","Actualizar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarClientesDetallados,"eliminar_button","Eliminar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarClientesDetallados,"cancelar_button","Cancelar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarClientesDetallados,"guardarcambios_button","Guardar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesDetallados,"guardarcambiostabla_button","Guardar",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesDetallados,"cerrar_button","Salir",this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarClientesDetallados.setToolTipText("Nuevo"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarClientesDetallados.setToolTipText("Editar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarClientesDetallados.setToolTipText("Actualizar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarClientesDetallados.setToolTipText("Eliminar)"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarClientesDetallados.setToolTipText("Cancelar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarClientesDetallados.setToolTipText("Guardar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setToolTipText("Guardar"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesDetallados.setToolTipText("Salir"+" "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesDetallados";
		inputMap = this.jButtonNuevoCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesDetallados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarClientesDetallados";
		inputMap = this.jButtonActualizarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarClientesDetallados"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarClientesDetallados";
		inputMap = this.jButtonEliminarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarClientesDetallados"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarClientesDetallados";
		inputMap = this.jButtonCancelarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarClientesDetallados"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesDetallados";
		inputMap = this.jButtonCerrarCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesDetallados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarClientesDetallados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarClientesDetallados.setToolTipText("Nuevo CobrarClientesDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados.setToolTipText("Sin Cerrar Ventana CobrarClientesDetallados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarClientesDetallados = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesDetallados.setText("Acciones");		
		this.jLabelAccionesCobrarClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarClientesDetallados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarClientesDetallados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarClientesDetallados=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarClientesDetallados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarClientesDetallados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarClientesDetallados = new GridBagLayout();
		
		this.jPanelCamposCobrarClientesDetallados.setLayout(gridaBagLayoutCamposCobrarClientesDetallados);
		this.jPanelCamposOcultosCobrarClientesDetallados.setLayout(gridaBagLayoutCamposOcultosCobrarClientesDetallados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarClientesDetallados.add(jLabelIdCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarClientesDetallados.add(jLabelidCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarClientesDetallados.add(jLabelid_empresaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesDetallados.add(jButtonid_empresaCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 3;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarClientesDetallados.add(jButtonid_empresaCobrarClientesDetalladosUpdate, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarClientesDetallados.add(jComboBoxid_empresaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarClientesDetallados.add(jLabelnombre_ciudadCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarClientesDetallados.add(jButtonnombre_ciudadCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarClientesDetallados.add(jscrollPanenombre_ciudadCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaCobrarClientesDetallados.add(jLabelnombre_zonaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaCobrarClientesDetallados.add(jButtonnombre_zonaCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaCobrarClientesDetallados.add(jTextFieldnombre_zonaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteCobrarClientesDetallados.add(jLabelnombre_grupo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteCobrarClientesDetallados.add(jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteCobrarClientesDetallados.add(jscrollPanenombre_grupo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_titulo_clienteCobrarClientesDetallados.add(jLabelnombre_titulo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_titulo_clienteCobrarClientesDetallados.add(jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_titulo_clienteCobrarClientesDetallados.add(jscrollPanenombre_titulo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarClientesDetallados.add(jLabelcodigoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarClientesDetallados.add(jButtoncodigoCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarClientesDetallados.add(jTextFieldcodigoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarClientesDetallados.add(jLabelnombreCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarClientesDetallados.add(jButtonnombreCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarClientesDetallados.add(jscrollPanenombreCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCobrarClientesDetallados.add(jLabelapellidoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCobrarClientesDetallados.add(jButtonapellidoCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCobrarClientesDetallados.add(jscrollPaneapellidoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucCobrarClientesDetallados.add(jLabelrucCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucCobrarClientesDetallados.add(jButtonrucCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucCobrarClientesDetallados.add(jTextFieldrucCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_contacto_clienteCobrarClientesDetallados.add(jLabelnombre_contacto_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_contacto_clienteCobrarClientesDetallados.add(jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_contacto_clienteCobrarClientesDetallados.add(jscrollPanenombre_contacto_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarClientesDetallados.add(jLabeldireccion_direccionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarClientesDetallados.add(jButtondireccion_direccionCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarClientesDetallados.add(jscrollPanedireccion_direccionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mail_e_mailCobrarClientesDetallados.add(jLabele_mail_e_mailCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mail_e_mailCobrarClientesDetallados.add(jButtone_mail_e_mailCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mail_e_mailCobrarClientesDetallados.add(jscrollPanee_mail_e_mailCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarClientesDetallados.add(jLabeltelefono_telefonoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 2;
		this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
		this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarClientesDetallados.add(jButtontelefono_telefonoCobrarClientesDetalladosBusqueda, this.gridBagConstraintsCobrarClientesDetallados);
	}

	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = 1;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarClientesDetallados.add(jscrollPanetelefono_telefonoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelidCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombre_ciudadCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombre_zonaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombre_grupo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombre_titulo_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelcodigoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombreCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelapellidoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelrucCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanelnombre_contacto_clienteCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPaneldireccion_direccionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPanele_mail_e_mailCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarClientesDetallados.add(this.jPaneltelefono_telefonoCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposCobrarClientesDetallados % 2==0) {
		iXPanelCamposCobrarClientesDetallados=0;
		iYPanelCamposCobrarClientesDetallados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarClientesDetallados.gridy = iYPanelCamposOcultosCobrarClientesDetallados;
	this.gridBagConstraintsCobrarClientesDetallados.gridx = iXPanelCamposOcultosCobrarClientesDetallados++;
	this.gridBagConstraintsCobrarClientesDetallados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarClientesDetallados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarClientesDetallados.add(this.jPanelid_empresaCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);



	if(iXPanelCamposOcultosCobrarClientesDetallados % 2==0) {
		iXPanelCamposOcultosCobrarClientesDetallados=0;
		iYPanelCamposOcultosCobrarClientesDetallados++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesDetallados= new GridBagLayout();
		this.jPanelAccionesCobrarClientesDetallados.setLayout(gridaBagLayoutAccionesCobrarClientesDetallados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarClientesDetallados= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarClientesDetallados.setLayout(gridaBagLayoutAccionesFormularioCobrarClientesDetallados);
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarClientesDetallados.add(this.jComboBoxTiposAccionesFormularioCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonModificarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);							

		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonEliminarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonActualizarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);


		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonGuardarCambiosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);	
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = 0;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarClientesDetallados.add(this.jButtonCancelarCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesDetallados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesDetallados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesDetallados.gridx =0;
		this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarClientesDetallados = new CobrarClientesDetalladosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Clientes Detallados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Clientes Detallados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Detallados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarClientesDetalladosModel cobrarclientesdetalladosModel=new CobrarClientesDetalladosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarClientesDetalladosModel.CobrarClientesDetalladosFocusTraversalPolicy cobrarclientesdetalladosFocusTraversalPolicy = cobrarclientesdetalladosModel.new CobrarClientesDetalladosFocusTraversalPolicy(this);
			
			//cobrarclientesdetalladosFocusTraversalPolicy.setcobrarclientesdetalladosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarclientesdetalladosModel);
			
			
			this.jContentPaneDetalleCobrarClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarClientesDetallados = new GridBagLayout();	
			this.jContentPaneDetalleCobrarClientesDetallados.setLayout(gridaBagLayoutDetalleCobrarClientesDetallados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesDetallados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarClientesDetallados.add(jTtoolBarDetalleCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarClientesDetallados=   new JScrollPane(jContentPaneDetalleCobrarClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarClientesDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	        
			this.jContentPaneDetalleCobrarClientesDetallados.add(jPanelCamposCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);
			
			
			
			
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
						//&& cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarClientesDetallados= new GridBagConstraints();
						this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
						this.jContentPaneDetalleCobrarClientesDetallados.add(this.jTabbedPaneRelacionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarClientesDetallados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarClientesDetallados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
					this.gridBagConstraintsCobrarClientesDetallados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarClientesDetallados.add(jPanelCamposOcultosCobrarClientesDetallados, gridBagConstraintsCobrarClientesDetallados);
				
					this.jPanelCamposOcultosCobrarClientesDetallados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	        this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarClientesDetallados.add(this.jPanelAccionesFormularioCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);							
			
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
	        this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarClientesDetallados.add(this.jPanelAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarClientesDetallados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarClientesDetallados=   new JScrollPane(this.jPanelCamposCobrarClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
			this.gridBagConstraintsCobrarClientesDetallados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarClientesDetallados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarClientesDetallados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);			
			
			this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
			
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		
			
		this.gridBagConstraintsCobrarClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesDetallados, this.gridBagConstraintsCobrarClientesDetallados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarClientesDetallados;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarClientesDetallados;
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
