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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.cartera.util.report.CobrarSaldosVencidosConstantesFunciones;

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
public class CobrarSaldosVencidosDetalleFormJInternalFrame extends CobrarSaldosVencidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarSaldosVencidos;
	
	protected JMenuBar jmenuBarDetalleCobrarSaldosVencidos;
	
	protected JMenu jmenuDetalleCobrarSaldosVencidos;
	protected JMenu jmenuDetalleArchivoCobrarSaldosVencidos;
	protected JMenu jmenuDetalleAccionesCobrarSaldosVencidos;
	protected JMenu jmenuDetalleDatosCobrarSaldosVencidos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarSaldosVencidos;	
	protected GridBagConstraints gridBagConstraintsCobrarSaldosVencidos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarSaldosVencidosBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarSaldosVencidos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarSaldosVencidosSessionBean cobrarsaldosvencidosSessionBean;
	
	
	
	
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarSaldosVencidosLogic cobrarsaldosvencidosLogic;
	
	public JScrollPane jScrollPanelDatosCobrarSaldosVencidos;
	public JScrollPane jScrollPanelDatosEdicionCobrarSaldosVencidos;
	public JScrollPane jScrollPanelDatosGeneralCobrarSaldosVencidos;
	
	protected JPanel jPanelCamposCobrarSaldosVencidos;    
	protected JPanel jPanelCamposOcultosCobrarSaldosVencidos;    	
	protected JPanel jPanelAccionesCobrarSaldosVencidos;
	protected JPanel jPanelAccionesFormularioCobrarSaldosVencidos;
    
	
	
	protected Integer iXPanelCamposCobrarSaldosVencidos=0;
	protected Integer iYPanelCamposCobrarSaldosVencidos=0;
	
	protected Integer iXPanelCamposOcultosCobrarSaldosVencidos=0;
	protected Integer iYPanelCamposOcultosCobrarSaldosVencidos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarSaldosVencidos;
	public JButton jButtonModificarCobrarSaldosVencidos;
	public JButton jButtonActualizarCobrarSaldosVencidos;
    public JButton jButtonEliminarCobrarSaldosVencidos;
	public JButton jButtonCancelarCobrarSaldosVencidos;
    public JButton jButtonGuardarCambiosCobrarSaldosVencidos;
	public JButton jButtonGuardarCambiosTablaCobrarSaldosVencidos;
	protected JButton jButtonCerrarCobrarSaldosVencidos;
	
	
	protected JButton jButtonProcesarInformacionCobrarSaldosVencidos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarSaldosVencidos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarSaldosVencidos;
	protected JButton jButtonModificarToolBarCobrarSaldosVencidos;
	protected JButton jButtonActualizarToolBarCobrarSaldosVencidos;
    protected JButton jButtonEliminarToolBarCobrarSaldosVencidos;
	protected JButton jButtonCancelarToolBarCobrarSaldosVencidos;
    protected JButton jButtonGuardarCambiosToolBarCobrarSaldosVencidos;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarSaldosVencidos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarSaldosVencidos;
	protected JButton jButtonCerrarToolBarCobrarSaldosVencidos;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarSaldosVencidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarSaldosVencidos;
	protected JMenuItem jMenuItemModificarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemActualizarCobrarSaldosVencidos;
    protected JMenuItem jMenuItemEliminarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemCancelarCobrarSaldosVencidos;
    protected JMenuItem jMenuItemGuardarCambiosCobrarSaldosVencidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarSaldosVencidos;
	protected JMenuItem jMenuItemCerrarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarSaldosVencidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarSaldosVencidos;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarSaldosVencidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarSaldosVencidos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarSaldosVencidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarSaldosVencidos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarSaldosVencidos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarSaldosVencidos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarSaldosVencidos;
	public JLabel jLabelIdCobrarSaldosVencidos;
	public JLabel jLabelidCobrarSaldosVencidos;
	public JButton jButtonidCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaCobrarSaldosVencidos;
	public JLabel jLabelnumero_facturaCobrarSaldosVencidos;
	public JTextField jTextFieldnumero_facturaCobrarSaldosVencidos;
	public JButton jButtonnumero_facturaCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteCobrarSaldosVencidos;
	public JLabel jLabelnombre_grupo_clienteCobrarSaldosVencidos;
	public JTextArea jTextAreanombre_grupo_clienteCobrarSaldosVencidos;
	public JScrollPane jscrollPanenombre_grupo_clienteCobrarSaldosVencidos;
	public JButton jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarSaldosVencidos;
	public JLabel jLabelcodigoCobrarSaldosVencidos;
	public JTextField jTextFieldcodigoCobrarSaldosVencidos;
	public JButton jButtoncodigoCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrarSaldosVencidos;
	public JLabel jLabelnombreCobrarSaldosVencidos;
	public JTextArea jTextAreanombreCobrarSaldosVencidos;
	public JScrollPane jscrollPanenombreCobrarSaldosVencidos;
	public JButton jButtonnombreCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelfechaCobrarSaldosVencidos;
	public JLabel jLabelfechaCobrarSaldosVencidos;
	//public JFormattedTextField jDateChooserfechaCobrarSaldosVencidos;

	public JDateChooser jDateChooserfechaCobrarSaldosVencidos;
	public JButton jButtonfechaCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceCobrarSaldosVencidos;
	public JLabel jLabelfecha_venceCobrarSaldosVencidos;
	//public JFormattedTextField jDateChooserfecha_venceCobrarSaldosVencidos;

	public JDateChooser jDateChooserfecha_venceCobrarSaldosVencidos;
	public JButton jButtonfecha_venceCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionCobrarSaldosVencidos;
	public JLabel jLabelfecha_emisionCobrarSaldosVencidos;
	//public JFormattedTextField jDateChooserfecha_emisionCobrarSaldosVencidos;

	public JDateChooser jDateChooserfecha_emisionCobrarSaldosVencidos;
	public JButton jButtonfecha_emisionCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCobrarSaldosVencidos;
	public JLabel jLabelsaldoCobrarSaldosVencidos;
	public JTextField jTextFieldsaldoCobrarSaldosVencidos;
	public JButton jButtonsaldoCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarSaldosVencidos;
	public JLabel jLabeltelefono_telefonoCobrarSaldosVencidos;
	public JTextArea jTextAreatelefono_telefonoCobrarSaldosVencidos;
	public JScrollPane jscrollPanetelefono_telefonoCobrarSaldosVencidos;
	public JButton jButtontelefono_telefonoCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCobrarSaldosVencidos;
	public JLabel jLabeldescripcionCobrarSaldosVencidos;
	public JTextArea jTextAreadescripcionCobrarSaldosVencidos;
	public JScrollPane jscrollPanedescripcionCobrarSaldosVencidos;
	public JButton jButtondescripcionCobrarSaldosVencidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteCobrarSaldosVencidos;
	public JLabel jLabelid_grupo_clienteCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteCobrarSaldosVencidos;
	public JButton jButtonid_grupo_clienteCobrarSaldosVencidos= new JButtonMe();
	public JButton jButtonid_grupo_clienteCobrarSaldosVencidosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaCobrarSaldosVencidos;
	public JLabel jLabelid_empresaCobrarSaldosVencidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarSaldosVencidos;
	public JButton jButtonid_empresaCobrarSaldosVencidos= new JButtonMe();
	public JButton jButtonid_empresaCobrarSaldosVencidosUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarSaldosVencidosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarSaldosVencidos;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarSaldosVencidos=new JPanel();
				this.jPanelAccionesFormularioCobrarSaldosVencidos=new JPanel();
				this.jmenuBarDetalleCobrarSaldosVencidos=new JMenuBar();
				this.jTtoolBarDetalleCobrarSaldosVencidos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarSaldosVencidosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarSaldosVencidosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarSaldosVencidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarSaldosVencidos() {
		return this.jButtonActualizarToolBarCobrarSaldosVencidos;
	}
	
	public JButton getjButtonEliminarToolBarCobrarSaldosVencidos() {
		return this.jButtonEliminarToolBarCobrarSaldosVencidos;
	}
	
	public JButton getjButtonCancelarToolBarCobrarSaldosVencidos() {
		return this.jButtonCancelarToolBarCobrarSaldosVencidos;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarSaldosVencidos() {
		return this.jButtonProcesarInformacionCobrarSaldosVencidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarSaldosVencidos)	{
		this.jButtonProcesarInformacionCobrarSaldosVencidos = jButtonProcesarInformacionCobrarSaldosVencidos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarSaldosVencidos() {
		return this.jComboBoxTiposAccionesCobrarSaldosVencidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposRelacionesCobrarSaldosVencidos) {
		this.jComboBoxTiposRelacionesCobrarSaldosVencidos = jComboBoxTiposRelacionesCobrarSaldosVencidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarSaldosVencidos(
			JComboBox jComboBoxTiposAccionesCobrarSaldosVencidos) {
		this.jComboBoxTiposAccionesCobrarSaldosVencidos = jComboBoxTiposAccionesCobrarSaldosVencidos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarSaldosVencidos() {
		return this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarSaldosVencidos(
			JComboBox jComboBoxTiposAccionesFormularioCobrarSaldosVencidos) {
		this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos = jComboBoxTiposAccionesFormularioCobrarSaldosVencidos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarsaldosvencidosSessionBean=new CobrarSaldosVencidosSessionBean();
		
		this.cobrarsaldosvencidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarsaldosvencidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarSaldosVencidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarSaldosVencidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Saldos Vencidos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarSaldosVencidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarSaldosVencidos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarSaldosVencidos=new JButtonMe();
				this.jButtonModificarToolBarCobrarSaldosVencidos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos,
							"actualizar","actualizar","Actualizar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos,
							"eliminar","eliminar","Eliminar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos,
							"cancelar","cancelar","Cancelar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarSaldosVencidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarSaldosVencidos,this.jTtoolBarDetalleCobrarSaldosVencidos,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarSaldosVencidos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarSaldosVencidos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarSaldosVencidos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarSaldosVencidos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarSaldosVencidos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarSaldosVencidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarSaldosVencidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarSaldosVencidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarSaldosVencidos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarSaldosVencidos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarSaldosVencidos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarSaldosVencidos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarSaldosVencidos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarSaldosVencidos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarSaldosVencidos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarSaldosVencidos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarSaldosVencidos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarSaldosVencidos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarSaldosVencidos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarSaldosVencidos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarSaldosVencidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarSaldosVencidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarSaldosVencidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarSaldosVencidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarSaldosVencidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarSaldosVencidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarSaldosVencidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarSaldosVencidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarSaldosVencidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarSaldosVencidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarSaldosVencidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarSaldosVencidos.add(this.jMenuItemDetalleCerrarCobrarSaldosVencidos);
		
		this.jmenuDetalleAccionesCobrarSaldosVencidos.add(this.jMenuItemActualizarCobrarSaldosVencidos);
		this.jmenuDetalleAccionesCobrarSaldosVencidos.add(this.jMenuItemEliminarCobrarSaldosVencidos);
		this.jmenuDetalleAccionesCobrarSaldosVencidos.add(this.jMenuItemCancelarCobrarSaldosVencidos);		
		
		//this.jmenuDetalleDatosCobrarSaldosVencidos.add(this.jMenuItemDetalleAbrirOrderByCobrarSaldosVencidos);				
		this.jmenuDetalleDatosCobrarSaldosVencidos.add(this.jMenuItemDetalleMostarOcultarCobrarSaldosVencidos);				
				
		//this.jmenuDetalleAccionesCobrarSaldosVencidos.add(this.jMenuItemGuardarCambiosCobrarSaldosVencidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarSaldosVencidos.add(this.jmenuDetalleArchivoCobrarSaldosVencidos);		
		this.jmenuBarDetalleCobrarSaldosVencidos.add(this.jmenuDetalleAccionesCobrarSaldosVencidos);		
		this.jmenuBarDetalleCobrarSaldosVencidos.add(this.jmenuDetalleDatosCobrarSaldosVencidos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarSaldosVencidos);				
	}
	
	
	public void inicializarElementosCamposCobrarSaldosVencidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarSaldosVencidos = new JLabelMe();
		jLabelIdCobrarSaldosVencidos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarSaldosVencidos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarSaldosVencidos= new GridBagLayout();

		this.jPanelidCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);

		jLabelidCobrarSaldosVencidos = new JLabel();
		jLabelidCobrarSaldosVencidos.setText("Id");

		jLabelidCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaCobrarSaldosVencidos = new JLabelMe();
		this.jLabelnumero_facturaCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaCobrarSaldosVencidos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelnumero_facturaCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextFieldnumero_facturaCobrarSaldosVencidos= new JTextFieldMe();

		jTextFieldnumero_facturaCobrarSaldosVencidos.setEnabled(false);
		jTextFieldnumero_facturaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos = new JLabelMe();
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelnombre_grupo_clienteCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextAreanombre_grupo_clienteCobrarSaldosVencidos= new JTextAreaMe();
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setEnabled(false);
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setLineWrap(true);
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteCobrarSaldosVencidos = new JScrollPane(jTextAreanombre_grupo_clienteCobrarSaldosVencidos);
		jscrollPanenombre_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarSaldosVencidos = new JLabelMe();
		this.jLabelcodigoCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarSaldosVencidos.setToolTipText("Codigo");
		this.jLabelcodigoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelcodigoCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextFieldcodigoCobrarSaldosVencidos= new JTextFieldMe();

		jTextFieldcodigoCobrarSaldosVencidos.setEnabled(false);
		jTextFieldcodigoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrarSaldosVencidos = new JLabelMe();
		this.jLabelnombreCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrarSaldosVencidos.setToolTipText("Nombre");
		this.jLabelnombreCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelnombreCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextAreanombreCobrarSaldosVencidos= new JTextAreaMe();
		jTextAreanombreCobrarSaldosVencidos.setEnabled(false);
		jTextAreanombreCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCobrarSaldosVencidos.setLineWrap(true);
		jTextAreanombreCobrarSaldosVencidos.setWrapStyleWord(true);
		jTextAreanombreCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCobrarSaldosVencidos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCobrarSaldosVencidos = new JScrollPane(jTextAreanombreCobrarSaldosVencidos);
		jscrollPanenombreCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelfechaCobrarSaldosVencidos = new JLabelMe();
		this.jLabelfechaCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCobrarSaldosVencidos.setToolTipText("Fecha");
		this.jLabelfechaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelfechaCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		//jFormattedTextFieldfechaCobrarSaldosVencidos= new JFormattedTextFieldMe();

		jDateChooserfechaCobrarSaldosVencidos= new JDateChooser();
		jDateChooserfechaCobrarSaldosVencidos.setEnabled(false);
		jDateChooserfechaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCobrarSaldosVencidos.setDate(new Date());
		jDateChooserfechaCobrarSaldosVencidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCobrarSaldosVencidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceCobrarSaldosVencidos = new JLabelMe();
		this.jLabelfecha_venceCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceCobrarSaldosVencidos.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelfecha_venceCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		//jFormattedTextFieldfecha_venceCobrarSaldosVencidos= new JFormattedTextFieldMe();

		jDateChooserfecha_venceCobrarSaldosVencidos= new JDateChooser();
		jDateChooserfecha_venceCobrarSaldosVencidos.setEnabled(false);
		jDateChooserfecha_venceCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceCobrarSaldosVencidos.setDate(new Date());
		jDateChooserfecha_venceCobrarSaldosVencidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceCobrarSaldosVencidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionCobrarSaldosVencidos = new JLabelMe();
		this.jLabelfecha_emisionCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionCobrarSaldosVencidos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelfecha_emisionCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		//jFormattedTextFieldfecha_emisionCobrarSaldosVencidos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionCobrarSaldosVencidos= new JDateChooser();
		jDateChooserfecha_emisionCobrarSaldosVencidos.setEnabled(false);
		jDateChooserfecha_emisionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionCobrarSaldosVencidos.setDate(new Date());
		jDateChooserfecha_emisionCobrarSaldosVencidos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionCobrarSaldosVencidos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCobrarSaldosVencidos = new JLabelMe();
		this.jLabelsaldoCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCobrarSaldosVencidos.setToolTipText("Saldo");
		this.jLabelsaldoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelsaldoCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextFieldsaldoCobrarSaldosVencidos= new JTextFieldMe();
		jTextFieldsaldoCobrarSaldosVencidos.setEnabled(false);
		jTextFieldsaldoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCobrarSaldosVencidos.setText("0.0");

		this.jButtonsaldoCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarSaldosVencidos = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarSaldosVencidos.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextAreatelefono_telefonoCobrarSaldosVencidos= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setEnabled(false);
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarSaldosVencidos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarSaldosVencidos = new JScrollPane(jTextAreatelefono_telefonoCobrarSaldosVencidos);
		jscrollPanetelefono_telefonoCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarSaldosVencidosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCobrarSaldosVencidos = new JLabelMe();
		this.jLabeldescripcionCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCobrarSaldosVencidos.setToolTipText("Descripcion");
		this.jLabeldescripcionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPaneldescripcionCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jTextAreadescripcionCobrarSaldosVencidos= new JTextAreaMe();
		jTextAreadescripcionCobrarSaldosVencidos.setEnabled(false);
		jTextAreadescripcionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCobrarSaldosVencidos.setLineWrap(true);
		jTextAreadescripcionCobrarSaldosVencidos.setWrapStyleWord(true);
		jTextAreadescripcionCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCobrarSaldosVencidos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCobrarSaldosVencidos = new JScrollPane(jTextAreadescripcionCobrarSaldosVencidos);
		jscrollPanedescripcionCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCobrarSaldosVencidosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarSaldosVencidos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_grupo_clienteCobrarSaldosVencidos = new JLabelMe();
		this.jLabelid_grupo_clienteCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteCobrarSaldosVencidos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelid_grupo_clienteCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jComboBoxid_grupo_clienteCobrarSaldosVencidos= new JComboBoxMe();
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteCobrarSaldosVencidos= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setText("Buscar");
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteCobrarSaldosVencidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarSaldosVencidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarSaldosVencidos"));

		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setText("U");
		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCobrarSaldosVencidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCobrarSaldosVencidosUpdate"));



					
		this.jLabelid_empresaCobrarSaldosVencidos = new JLabelMe();
		this.jLabelid_empresaCobrarSaldosVencidos.setText(""+CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarSaldosVencidos.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarSaldosVencidos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarSaldosVencidos.setToolTipText(CobrarSaldosVencidosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		this.jPanelid_empresaCobrarSaldosVencidos.setLayout(this.gridaBagLayoutCobrarSaldosVencidos);


		jComboBoxid_empresaCobrarSaldosVencidos= new JComboBoxMe();
		jComboBoxid_empresaCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarSaldosVencidos.setEnabled(false);

		this.jButtonid_empresaCobrarSaldosVencidos= new JButtonMe();
		this.jButtonid_empresaCobrarSaldosVencidos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarSaldosVencidos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarSaldosVencidos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarSaldosVencidos.setText("Buscar");
		this.jButtonid_empresaCobrarSaldosVencidos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarSaldosVencidos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarSaldosVencidos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarSaldosVencidos"));

		this.jButtonid_empresaCobrarSaldosVencidosBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setText("U");
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarSaldosVencidosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarSaldosVencidosBusqueda"));

		if(this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarSaldosVencidosBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarSaldosVencidosUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarSaldosVencidosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarSaldosVencidosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarSaldosVencidosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarSaldosVencidosUpdate.setText("U");
		this.jButtonid_empresaCobrarSaldosVencidosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarSaldosVencidosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarSaldosVencidosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarSaldosVencidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarSaldosVencidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarSaldosVencidosUpdate"));



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
		//this.jInternalFrameDetalleCobrarSaldosVencidos = new CobrarSaldosVencidosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Saldos Vencidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarSaldosVencidos= new GridBagLayout();
		

		
		String sToolTipCobrarSaldosVencidos="";
		sToolTipCobrarSaldosVencidos=CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarSaldosVencidos+="(Cartera.CobrarSaldosVencidos)";
		}
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarSaldosVencidos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarSaldosVencidos = new JButtonMe();
		this.jButtonModificarCobrarSaldosVencidos = new JButtonMe();
        this.jButtonActualizarCobrarSaldosVencidos = new JButtonMe();
        this.jButtonEliminarCobrarSaldosVencidos = new JButtonMe();
        this.jButtonCancelarCobrarSaldosVencidos = new JButtonMe();
        this.jButtonGuardarCambiosCobrarSaldosVencidos = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos = new JButtonMe();
		this.jButtonCerrarCobrarSaldosVencidos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarSaldosVencidos = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarSaldosVencidos = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarSaldosVencidos = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Saldos Vencidos";
		
		if(!this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Saldos Vencidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarSaldosVencidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarSaldosVencidos.setName("jPanelCamposCobrarSaldosVencidos"); 

		this.jPanelCamposOcultosCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarSaldosVencidos.setName("jPanelCamposOcultosCobrarSaldosVencidos"); 

        this.jPanelAccionesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarSaldosVencidos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarSaldosVencidos.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarSaldosVencidos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarSaldosVencidos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarSaldosVencidos.setText("Nuevo");
		this.jButtonModificarCobrarSaldosVencidos.setText("Editar");
        this.jButtonActualizarCobrarSaldosVencidos.setText("Actualizar");
        this.jButtonEliminarCobrarSaldosVencidos.setText("Eliminar");
        this.jButtonCancelarCobrarSaldosVencidos.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarSaldosVencidos.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setText("Guardar");
		this.jButtonCerrarCobrarSaldosVencidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarSaldosVencidos,"nuevo_button","Nuevo",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarSaldosVencidos,"modificar_button","Editar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarSaldosVencidos,"actualizar_button","Actualizar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarSaldosVencidos,"eliminar_button","Eliminar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarSaldosVencidos,"cancelar_button","Cancelar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarSaldosVencidos,"guardarcambios_button","Guardar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarSaldosVencidos,"guardarcambiostabla_button","Guardar",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarSaldosVencidos,"cerrar_button","Salir",this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarSaldosVencidos.setToolTipText("Nuevo"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarSaldosVencidos.setToolTipText("Editar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarSaldosVencidos.setToolTipText("Actualizar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarSaldosVencidos.setToolTipText("Eliminar)"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarSaldosVencidos.setToolTipText("Cancelar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarSaldosVencidos.setToolTipText("Guardar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.setToolTipText("Guardar"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarSaldosVencidos.setToolTipText("Salir"+" "+CobrarSaldosVencidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarSaldosVencidos";
		inputMap = this.jButtonNuevoCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarSaldosVencidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarSaldosVencidos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarSaldosVencidos";
		inputMap = this.jButtonActualizarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarSaldosVencidos"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarSaldosVencidos";
		inputMap = this.jButtonEliminarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarSaldosVencidos"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarSaldosVencidos";
		inputMap = this.jButtonCancelarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarSaldosVencidos"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarSaldosVencidos";
		inputMap = this.jButtonCerrarCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarSaldosVencidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarSaldosVencidos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarSaldosVencidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarSaldosVencidos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarSaldosVencidos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarSaldosVencidos.setToolTipText("Nuevo CobrarSaldosVencidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos.setToolTipText("Sin Cerrar Ventana CobrarSaldosVencidos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarSaldosVencidos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarSaldosVencidos = new JLabelMe();
		
		this.jLabelAccionesCobrarSaldosVencidos.setText("Acciones");		
		this.jLabelAccionesCobrarSaldosVencidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarSaldosVencidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarSaldosVencidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarSaldosVencidos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarSaldosVencidos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarSaldosVencidos=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarSaldosVencidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarSaldosVencidos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarSaldosVencidos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarSaldosVencidos = new GridBagLayout();
		
		this.jPanelCamposCobrarSaldosVencidos.setLayout(gridaBagLayoutCamposCobrarSaldosVencidos);
		this.jPanelCamposOcultosCobrarSaldosVencidos.setLayout(gridaBagLayoutCamposOcultosCobrarSaldosVencidos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarSaldosVencidos.add(jLabelIdCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarSaldosVencidos.add(jLabelidCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteCobrarSaldosVencidos.add(jLabelid_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCobrarSaldosVencidos.add(jButtonid_grupo_clienteCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 3;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCobrarSaldosVencidos.add(jButtonid_grupo_clienteCobrarSaldosVencidosUpdate, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteCobrarSaldosVencidos.add(jComboBoxid_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarSaldosVencidos.add(jLabelid_empresaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarSaldosVencidos.add(jButtonid_empresaCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 3;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarSaldosVencidos.add(jButtonid_empresaCobrarSaldosVencidosUpdate, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarSaldosVencidos.add(jComboBoxid_empresaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaCobrarSaldosVencidos.add(jLabelnumero_facturaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaCobrarSaldosVencidos.add(jButtonnumero_facturaCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaCobrarSaldosVencidos.add(jTextFieldnumero_facturaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteCobrarSaldosVencidos.add(jLabelnombre_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteCobrarSaldosVencidos.add(jButtonnombre_grupo_clienteCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteCobrarSaldosVencidos.add(jscrollPanenombre_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarSaldosVencidos.add(jLabelcodigoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarSaldosVencidos.add(jButtoncodigoCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarSaldosVencidos.add(jTextFieldcodigoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrarSaldosVencidos.add(jLabelnombreCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrarSaldosVencidos.add(jButtonnombreCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrarSaldosVencidos.add(jscrollPanenombreCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCobrarSaldosVencidos.add(jLabelfechaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCobrarSaldosVencidos.add(jButtonfechaCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCobrarSaldosVencidos.add(jDateChooserfechaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceCobrarSaldosVencidos.add(jLabelfecha_venceCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceCobrarSaldosVencidos.add(jButtonfecha_venceCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceCobrarSaldosVencidos.add(jDateChooserfecha_venceCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionCobrarSaldosVencidos.add(jLabelfecha_emisionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionCobrarSaldosVencidos.add(jButtonfecha_emisionCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionCobrarSaldosVencidos.add(jDateChooserfecha_emisionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCobrarSaldosVencidos.add(jLabelsaldoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCobrarSaldosVencidos.add(jButtonsaldoCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCobrarSaldosVencidos.add(jTextFieldsaldoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarSaldosVencidos.add(jLabeltelefono_telefonoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarSaldosVencidos.add(jButtontelefono_telefonoCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarSaldosVencidos.add(jscrollPanetelefono_telefonoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCobrarSaldosVencidos.add(jLabeldescripcionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 2;
		this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCobrarSaldosVencidos.add(jButtondescripcionCobrarSaldosVencidosBusqueda, this.gridBagConstraintsCobrarSaldosVencidos);
	}

	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = 1;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCobrarSaldosVencidos.add(jscrollPanedescripcionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelidCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelid_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelnumero_facturaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelnombre_grupo_clienteCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelcodigoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelnombreCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelfechaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelfecha_venceCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelfecha_emisionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPanelsaldoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPaneltelefono_telefonoCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarSaldosVencidos.add(this.jPaneldescripcionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposCobrarSaldosVencidos % 2==0) {
		iXPanelCamposCobrarSaldosVencidos=0;
		iYPanelCamposCobrarSaldosVencidos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarSaldosVencidos.gridy = iYPanelCamposOcultosCobrarSaldosVencidos;
	this.gridBagConstraintsCobrarSaldosVencidos.gridx = iXPanelCamposOcultosCobrarSaldosVencidos++;
	this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarSaldosVencidos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarSaldosVencidos.add(this.jPanelid_empresaCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);



	if(iXPanelCamposOcultosCobrarSaldosVencidos % 2==0) {
		iXPanelCamposOcultosCobrarSaldosVencidos=0;
		iYPanelCamposOcultosCobrarSaldosVencidos++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarSaldosVencidos= new GridBagLayout();
		this.jPanelAccionesCobrarSaldosVencidos.setLayout(gridaBagLayoutAccionesCobrarSaldosVencidos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarSaldosVencidos= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarSaldosVencidos.setLayout(gridaBagLayoutAccionesFormularioCobrarSaldosVencidos);
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarSaldosVencidos.add(this.jComboBoxTiposAccionesFormularioCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonModificarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);							

		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonEliminarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonActualizarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);


		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonGuardarCambiosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);	
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = 0;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarSaldosVencidos.add(this.jButtonCancelarCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarSaldosVencidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarSaldosVencidos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarsaldosvencidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;		
			//this.gridBagConstraintsCobrarSaldosVencidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarSaldosVencidos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =0;
		this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarSaldosVencidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarSaldosVencidosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarSaldosVencidos = new CobrarSaldosVencidosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Saldos Vencidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Saldos Vencidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Saldos Vencidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarSaldosVencidosModel cobrarsaldosvencidosModel=new CobrarSaldosVencidosModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarSaldosVencidosModel.CobrarSaldosVencidosFocusTraversalPolicy cobrarsaldosvencidosFocusTraversalPolicy = cobrarsaldosvencidosModel.new CobrarSaldosVencidosFocusTraversalPolicy(this);
			
			//cobrarsaldosvencidosFocusTraversalPolicy.setcobrarsaldosvencidosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarsaldosvencidosModel);
			
			
			this.jContentPaneDetalleCobrarSaldosVencidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarSaldosVencidos = new GridBagLayout();	
			this.jContentPaneDetalleCobrarSaldosVencidos.setLayout(gridaBagLayoutDetalleCobrarSaldosVencidos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarSaldosVencidos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
				this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarSaldosVencidos.add(jTtoolBarDetalleCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos=   new JScrollPane(jContentPaneDetalleCobrarSaldosVencidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	        
			this.jContentPaneDetalleCobrarSaldosVencidos.add(jPanelCamposCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);
			
			
			
			
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
						//&& cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarsaldosvencidosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarSaldosVencidos= new GridBagConstraints();
						this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
						this.jContentPaneDetalleCobrarSaldosVencidos.add(this.jTabbedPaneRelacionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarSaldosVencidos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarSaldosVencidos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
					this.gridBagConstraintsCobrarSaldosVencidos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarSaldosVencidos.add(jPanelCamposOcultosCobrarSaldosVencidos, gridBagConstraintsCobrarSaldosVencidos);
				
					this.jPanelCamposOcultosCobrarSaldosVencidos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	        this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarSaldosVencidos.add(this.jPanelAccionesFormularioCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);							
			
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
	        this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarSaldosVencidos.add(this.jPanelAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarSaldosVencidos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos=   new JScrollPane(this.jPanelCamposCobrarSaldosVencidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarSaldosVencidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
			this.gridBagConstraintsCobrarSaldosVencidos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarSaldosVencidos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarSaldosVencidos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);			
			
			this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
			this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
			
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		
			
		this.gridBagConstraintsCobrarSaldosVencidos = new GridBagConstraints();
		this.gridBagConstraintsCobrarSaldosVencidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarSaldosVencidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarSaldosVencidos, this.gridBagConstraintsCobrarSaldosVencidos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarSaldosVencidos;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarSaldosVencidos;
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
