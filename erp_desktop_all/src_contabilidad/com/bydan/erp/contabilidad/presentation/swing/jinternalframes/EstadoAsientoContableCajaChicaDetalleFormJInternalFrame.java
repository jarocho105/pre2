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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.EstadoAsientoContableCajaChicaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class EstadoAsientoContableCajaChicaDetalleFormJInternalFrame extends EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarDetalleEstadoAsientoContableCajaChica;
	
	protected JMenu jmenuDetalleEstadoAsientoContableCajaChica;
	protected JMenu jmenuDetalleArchivoEstadoAsientoContableCajaChica;
	protected JMenu jmenuDetalleAccionesEstadoAsientoContableCajaChica;
	protected JMenu jmenuDetalleDatosEstadoAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsEstadoAsientoContableCajaChica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoAsientoContableCajaChica;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean;
	
	
	
		
	
	public EstadoAsientoContableCajaChicaLogic estadoasientocontablecajachicaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionEstadoAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralEstadoAsientoContableCajaChica;
	
	protected JPanel jPanelCamposEstadoAsientoContableCajaChica;    
	protected JPanel jPanelCamposOcultosEstadoAsientoContableCajaChica;    	
	protected JPanel jPanelAccionesEstadoAsientoContableCajaChica;
	protected JPanel jPanelAccionesFormularioEstadoAsientoContableCajaChica;
    
	
	
	protected Integer iXPanelCamposEstadoAsientoContableCajaChica=0;
	protected Integer iYPanelCamposEstadoAsientoContableCajaChica=0;
	
	protected Integer iXPanelCamposOcultosEstadoAsientoContableCajaChica=0;
	protected Integer iYPanelCamposOcultosEstadoAsientoContableCajaChica=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoAsientoContableCajaChica;
	public JButton jButtonModificarEstadoAsientoContableCajaChica;
	public JButton jButtonActualizarEstadoAsientoContableCajaChica;
    public JButton jButtonEliminarEstadoAsientoContableCajaChica;
	public JButton jButtonCancelarEstadoAsientoContableCajaChica;
    public JButton jButtonGuardarCambiosEstadoAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica;
	protected JButton jButtonCerrarEstadoAsientoContableCajaChica;
	
	
	protected JButton jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonModificarToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonActualizarToolBarEstadoAsientoContableCajaChica;
    protected JButton jButtonEliminarToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonCancelarToolBarEstadoAsientoContableCajaChica;
    protected JButton jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarEstadoAsientoContableCajaChica;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemModificarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemActualizarEstadoAsientoContableCajaChica;
    protected JMenuItem jMenuItemEliminarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemCancelarEstadoAsientoContableCajaChica;
    protected JMenuItem jMenuItemGuardarCambiosEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAsientoContableCajaChica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoAsientoContableCajaChica;
	public JLabel jLabelIdEstadoAsientoContableCajaChica;
	public JTextFieldMe jTextFieldidEstadoAsientoContableCajaChica;
	public JButton jButtonidEstadoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoAsientoContableCajaChica;
	public JLabel jLabelcodigoEstadoAsientoContableCajaChica;
	public JTextField jTextFieldcodigoEstadoAsientoContableCajaChica;
	public JButton jButtoncodigoEstadoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoAsientoContableCajaChica;
	public JLabel jLabelnombreEstadoAsientoContableCajaChica;
	public JTextArea jTextAreanombreEstadoAsientoContableCajaChica;
	public JScrollPane jscrollPanenombreEstadoAsientoContableCajaChica;
	public JButton jButtonnombreEstadoAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoAsientoContableCajaChica;
	
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
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoAsientoContableCajaChica=new JPanel();
				this.jPanelAccionesFormularioEstadoAsientoContableCajaChica=new JPanel();
				this.jmenuBarDetalleEstadoAsientoContableCajaChica=new JMenuBar();
				this.jTtoolBarDetalleEstadoAsientoContableCajaChica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableCajaChicaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoAsientoContableCajaChica() {
		return this.jButtonActualizarToolBarEstadoAsientoContableCajaChica;
	}
	
	public JButton getjButtonEliminarToolBarEstadoAsientoContableCajaChica() {
		return this.jButtonEliminarToolBarEstadoAsientoContableCajaChica;
	}
	
	public JButton getjButtonCancelarToolBarEstadoAsientoContableCajaChica() {
		return this.jButtonCancelarToolBarEstadoAsientoContableCajaChica;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionEstadoAsientoContableCajaChica = jButtonProcesarInformacionEstadoAsientoContableCajaChica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesEstadoAsientoContableCajaChica = jComboBoxTiposRelacionesEstadoAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica = jComboBoxTiposAccionesEstadoAsientoContableCajaChica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica = jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoasientocontablecajachicaSessionBean=new EstadoAsientoContableCajaChicaSessionBean();
		
		this.estadoasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoAsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoAsientoContableCajaChica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoAsientoContableCajaChica=new JButtonMe();
				this.jButtonModificarToolBarEstadoAsientoContableCajaChica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica,
							"actualizar","actualizar","Actualizar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica,
							"eliminar","eliminar","Eliminar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica,
							"cancelar","cancelar","Cancelar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoAsientoContableCajaChica,this.jTtoolBarDetalleEstadoAsientoContableCajaChica,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoAsientoContableCajaChica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoAsientoContableCajaChica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoAsientoContableCajaChica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoAsientoContableCajaChica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoAsientoContableCajaChica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoAsientoContableCajaChica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoAsientoContableCajaChica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoAsientoContableCajaChica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoAsientoContableCajaChica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoAsientoContableCajaChica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoAsientoContableCajaChica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoAsientoContableCajaChica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoAsientoContableCajaChica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoAsientoContableCajaChica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoAsientoContableCajaChica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoAsientoContableCajaChica.add(this.jMenuItemDetalleCerrarEstadoAsientoContableCajaChica);
		
		this.jmenuDetalleAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemActualizarEstadoAsientoContableCajaChica);
		this.jmenuDetalleAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemEliminarEstadoAsientoContableCajaChica);
		this.jmenuDetalleAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemCancelarEstadoAsientoContableCajaChica);		
		
		//this.jmenuDetalleDatosEstadoAsientoContableCajaChica.add(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContableCajaChica);				
		this.jmenuDetalleDatosEstadoAsientoContableCajaChica.add(this.jMenuItemDetalleMostarOcultarEstadoAsientoContableCajaChica);				
				
		//this.jmenuDetalleAccionesEstadoAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosEstadoAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoAsientoContableCajaChica.add(this.jmenuDetalleArchivoEstadoAsientoContableCajaChica);		
		this.jmenuBarDetalleEstadoAsientoContableCajaChica.add(this.jmenuDetalleAccionesEstadoAsientoContableCajaChica);		
		this.jmenuBarDetalleEstadoAsientoContableCajaChica.add(this.jmenuDetalleDatosEstadoAsientoContableCajaChica);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoAsientoContableCajaChica);				
	}
	
	
	public void inicializarElementosCamposEstadoAsientoContableCajaChica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoAsientoContableCajaChica = new JLabelMe();
		jLabelIdEstadoAsientoContableCajaChica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoAsientoContableCajaChica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoAsientoContableCajaChica.setToolTipText(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoAsientoContableCajaChica= new GridBagLayout();

		this.jPanelidEstadoAsientoContableCajaChica.setLayout(this.gridaBagLayoutEstadoAsientoContableCajaChica);

		jTextFieldidEstadoAsientoContableCajaChica = new JTextFieldMe();
		jTextFieldidEstadoAsientoContableCajaChica.setText("Id");

		jTextFieldidEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoAsientoContableCajaChica = new JLabelMe();
		this.jLabelcodigoEstadoAsientoContableCajaChica.setText(""+EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoAsientoContableCajaChica.setToolTipText("Codigo");
		this.jLabelcodigoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoAsientoContableCajaChica.setToolTipText(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoAsientoContableCajaChica = new GridBagLayout();
		this.jPanelcodigoEstadoAsientoContableCajaChica.setLayout(this.gridaBagLayoutEstadoAsientoContableCajaChica);


		jTextFieldcodigoEstadoAsientoContableCajaChica= new JTextFieldMe();

		jTextFieldcodigoEstadoAsientoContableCajaChica.setEnabled(false);
		jTextFieldcodigoEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoAsientoContableCajaChicaBusqueda"));

		if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoAsientoContableCajaChica = new JLabelMe();
		this.jLabelnombreEstadoAsientoContableCajaChica.setText(""+EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoAsientoContableCajaChica.setToolTipText("Nombre");
		this.jLabelnombreEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoAsientoContableCajaChica.setToolTipText(EstadoAsientoContableCajaChicaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoAsientoContableCajaChica = new GridBagLayout();
		this.jPanelnombreEstadoAsientoContableCajaChica.setLayout(this.gridaBagLayoutEstadoAsientoContableCajaChica);


		jTextAreanombreEstadoAsientoContableCajaChica= new JTextAreaMe();
		jTextAreanombreEstadoAsientoContableCajaChica.setEnabled(false);
		jTextAreanombreEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContableCajaChica.setLineWrap(true);
		jTextAreanombreEstadoAsientoContableCajaChica.setWrapStyleWord(true);
		jTextAreanombreEstadoAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoAsientoContableCajaChica.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoAsientoContableCajaChica = new JScrollPane(jTextAreanombreEstadoAsientoContableCajaChica);
		jscrollPanenombreEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoAsientoContableCajaChicaBusqueda"));

		if(this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoAsientoContableCajaChicaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoAsientoContableCajaChica() {
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
		//this.jInternalFrameDetalleEstadoAsientoContableCajaChica = new EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Asiento Contable Caja Chica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAsientoContableCajaChica= new GridBagLayout();
		

		
		String sToolTipEstadoAsientoContableCajaChica="";
		sToolTipEstadoAsientoContableCajaChica=EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAsientoContableCajaChica+="(Contabilidad.EstadoAsientoContableCajaChica)";
		}
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonModificarEstadoAsientoContableCajaChica = new JButtonMe();
        this.jButtonActualizarEstadoAsientoContableCajaChica = new JButtonMe();
        this.jButtonEliminarEstadoAsientoContableCajaChica = new JButtonMe();
        this.jButtonCancelarEstadoAsientoContableCajaChica = new JButtonMe();
        this.jButtonGuardarCambiosEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarEstadoAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Asiento Contable Caja Chica";
		
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoAsientoContableCajaChica.setName("jPanelCamposEstadoAsientoContableCajaChica"); 

		this.jPanelCamposOcultosEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoAsientoContableCajaChica.setName("jPanelCamposOcultosEstadoAsientoContableCajaChica"); 

        this.jPanelAccionesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAsientoContableCajaChica.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoAsientoContableCajaChica.setText("Nuevo");
		this.jButtonModificarEstadoAsientoContableCajaChica.setText("Editar");
        this.jButtonActualizarEstadoAsientoContableCajaChica.setText("Actualizar");
        this.jButtonEliminarEstadoAsientoContableCajaChica.setText("Eliminar");
        this.jButtonCancelarEstadoAsientoContableCajaChica.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoAsientoContableCajaChica.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarEstadoAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAsientoContableCajaChica,"nuevo_button","Nuevo",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoAsientoContableCajaChica,"modificar_button","Editar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoAsientoContableCajaChica,"actualizar_button","Actualizar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoAsientoContableCajaChica,"eliminar_button","Eliminar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoAsientoContableCajaChica,"cancelar_button","Cancelar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoAsientoContableCajaChica,"guardarcambios_button","Guardar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAsientoContableCajaChica,"cerrar_button","Salir",this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoAsientoContableCajaChica.setToolTipText("Nuevo"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoAsientoContableCajaChica.setToolTipText("Editar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoAsientoContableCajaChica.setToolTipText("Actualizar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoAsientoContableCajaChica.setToolTipText("Eliminar)"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoAsientoContableCajaChica.setToolTipText("Cancelar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoAsientoContableCajaChica.setToolTipText("Guardar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.setToolTipText("Guardar"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAsientoContableCajaChica.setToolTipText("Salir"+" "+EstadoAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAsientoContableCajaChica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonActualizarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoAsientoContableCajaChica"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonEliminarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoAsientoContableCajaChica"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCancelarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoAsientoContableCajaChica"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoAsientoContableCajaChica";
		inputMap = this.jButtonCerrarEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAsientoContableCajaChica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica.setToolTipText("Nuevo EstadoAsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica.setToolTipText("Sin Cerrar Ventana EstadoAsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesEstadoAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoAsientoContableCajaChica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoAsientoContableCajaChica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoAsientoContableCajaChica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoAsientoContableCajaChica = new GridBagLayout();
		
		this.jPanelCamposEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutCamposEstadoAsientoContableCajaChica);
		this.jPanelCamposOcultosEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutCamposOcultosEstadoAsientoContableCajaChica);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoAsientoContableCajaChica.add(jLabelIdEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoAsientoContableCajaChica.add(jTextFieldidEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);


	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoAsientoContableCajaChica.add(jLabelcodigoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoAsientoContableCajaChica.add(jButtoncodigoEstadoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsEstadoAsientoContableCajaChica);
	}

	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoAsientoContableCajaChica.add(jTextFieldcodigoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);


	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoAsientoContableCajaChica.add(jLabelnombreEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoAsientoContableCajaChica.add(jButtonnombreEstadoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsEstadoAsientoContableCajaChica);
	}

	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoAsientoContableCajaChica.add(jscrollPanenombreEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iYPanelCamposEstadoAsientoContableCajaChica;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iXPanelCamposEstadoAsientoContableCajaChica++;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContableCajaChica.add(this.jPanelidEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	if(iXPanelCamposEstadoAsientoContableCajaChica % 1==0) {
		iXPanelCamposEstadoAsientoContableCajaChica=0;
		iYPanelCamposEstadoAsientoContableCajaChica++;
	}
	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iYPanelCamposEstadoAsientoContableCajaChica;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iXPanelCamposEstadoAsientoContableCajaChica++;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContableCajaChica.add(this.jPanelcodigoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	if(iXPanelCamposEstadoAsientoContableCajaChica % 1==0) {
		iXPanelCamposEstadoAsientoContableCajaChica=0;
		iYPanelCamposEstadoAsientoContableCajaChica++;
	}
	this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iYPanelCamposEstadoAsientoContableCajaChica;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iXPanelCamposEstadoAsientoContableCajaChica++;
	this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContableCajaChica.add(this.jPanelnombreEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);



	if(iXPanelCamposEstadoAsientoContableCajaChica % 1==0) {
		iXPanelCamposEstadoAsientoContableCajaChica=0;
		iYPanelCamposEstadoAsientoContableCajaChica++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesEstadoAsientoContableCajaChica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesFormularioEstadoAsientoContableCajaChica);
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.add(this.jComboBoxTiposAccionesFormularioEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);

		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.add(this.jCheckBoxPostAccionNuevoEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinCerrarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinMensajeEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonModificarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);							

		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonEliminarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonActualizarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);


		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonGuardarCambiosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);	
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContableCajaChica.add(this.jButtonCancelarEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAsientoContableCajaChica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsEstadoAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAsientoContableCajaChica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoAsientoContableCajaChica = new EstadoAsientoContableCajaChicaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Asiento Contable Caja Chica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Asiento Contable Caja Chica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Asiento Contable Caja Chica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoAsientoContableCajaChicaModel estadoasientocontablecajachicaModel=new EstadoAsientoContableCajaChicaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoAsientoContableCajaChicaModel.EstadoAsientoContableCajaChicaFocusTraversalPolicy estadoasientocontablecajachicaFocusTraversalPolicy = estadoasientocontablecajachicaModel.new EstadoAsientoContableCajaChicaFocusTraversalPolicy(this);
			
			//estadoasientocontablecajachicaFocusTraversalPolicy.setestadoasientocontablecajachicaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoasientocontablecajachicaModel);
			
			
			this.jContentPaneDetalleEstadoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoAsientoContableCajaChica = new GridBagLayout();	
			this.jContentPaneDetalleEstadoAsientoContableCajaChica.setLayout(gridaBagLayoutDetalleEstadoAsientoContableCajaChica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAsientoContableCajaChica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(jTtoolBarDetalleEstadoAsientoContableCajaChica, gridBagConstraintsEstadoAsientoContableCajaChica);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica=   new JScrollPane(jContentPaneDetalleEstadoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	        
			this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(jPanelCamposEstadoAsientoContableCajaChica, gridBagConstraintsEstadoAsientoContableCajaChica);
			
			
			
			
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
						&& estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadoasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoAsientoContableCajaChica= new GridBagConstraints();
						this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
						this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(this.jTabbedPaneRelacionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoAsientoContableCajaChica.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoAsientoContableCajaChica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
					this.gridBagConstraintsEstadoAsientoContableCajaChica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(jPanelCamposOcultosEstadoAsientoContableCajaChica, gridBagConstraintsEstadoAsientoContableCajaChica);
				
					this.jPanelCamposOcultosEstadoAsientoContableCajaChica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(this.jPanelAccionesFormularioEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);							
			
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoAsientoContableCajaChica.add(this.jPanelAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoAsientoContableCajaChica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica=   new JScrollPane(this.jPanelCamposEstadoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);			
			
			this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
			
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		
			
		this.gridBagConstraintsEstadoAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAsientoContableCajaChica, this.gridBagConstraintsEstadoAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoAsientoContableCajaChica;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoAsientoContableCajaChica;
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
