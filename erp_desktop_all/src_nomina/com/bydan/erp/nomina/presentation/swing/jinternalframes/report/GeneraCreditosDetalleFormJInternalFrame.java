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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.GeneraCreditosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class GeneraCreditosDetalleFormJInternalFrame extends GeneraCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGeneraCreditos;
	
	protected JMenuBar jmenuBarDetalleGeneraCreditos;
	
	protected JMenu jmenuDetalleGeneraCreditos;
	protected JMenu jmenuDetalleArchivoGeneraCreditos;
	protected JMenu jmenuDetalleAccionesGeneraCreditos;
	protected JMenu jmenuDetalleDatosGeneraCreditos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGeneraCreditos;	
	protected GridBagConstraints gridBagConstraintsGeneraCreditos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GeneraCreditosBeanSwingJInternalFrameAdditional jInternalFrameDetalleGeneraCreditos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GeneraCreditosSessionBean generacreditosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public GeneraCreditosLogic generacreditosLogic;
	
	public JScrollPane jScrollPanelDatosGeneraCreditos;
	public JScrollPane jScrollPanelDatosEdicionGeneraCreditos;
	public JScrollPane jScrollPanelDatosGeneralGeneraCreditos;
	
	protected JPanel jPanelCamposGeneraCreditos;    
	protected JPanel jPanelCamposOcultosGeneraCreditos;    	
	protected JPanel jPanelAccionesGeneraCreditos;
	protected JPanel jPanelAccionesFormularioGeneraCreditos;
    
	
	
	protected Integer iXPanelCamposGeneraCreditos=0;
	protected Integer iYPanelCamposGeneraCreditos=0;
	
	protected Integer iXPanelCamposOcultosGeneraCreditos=0;
	protected Integer iYPanelCamposOcultosGeneraCreditos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGeneraCreditos;
	public JButton jButtonModificarGeneraCreditos;
	public JButton jButtonActualizarGeneraCreditos;
    public JButton jButtonEliminarGeneraCreditos;
	public JButton jButtonCancelarGeneraCreditos;
    public JButton jButtonGuardarCambiosGeneraCreditos;
	public JButton jButtonGuardarCambiosTablaGeneraCreditos;
	protected JButton jButtonCerrarGeneraCreditos;
	
	
	protected JButton jButtonProcesarInformacionGeneraCreditos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGeneraCreditos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGeneraCreditos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGeneraCreditos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGeneraCreditos;
	protected JButton jButtonModificarToolBarGeneraCreditos;
	protected JButton jButtonActualizarToolBarGeneraCreditos;
    protected JButton jButtonEliminarToolBarGeneraCreditos;
	protected JButton jButtonCancelarToolBarGeneraCreditos;
    protected JButton jButtonGuardarCambiosToolBarGeneraCreditos;
	protected JButton jButtonGuardarCambiosTablaToolBarGeneraCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarGeneraCreditos;
	protected JButton jButtonCerrarToolBarGeneraCreditos;
	
	protected JButton jButtonProcesarInformacionToolBarGeneraCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGeneraCreditos;
	protected JMenuItem jMenuItemModificarGeneraCreditos;
	protected JMenuItem jMenuItemActualizarGeneraCreditos;
    protected JMenuItem jMenuItemEliminarGeneraCreditos;
	protected JMenuItem jMenuItemCancelarGeneraCreditos;
    protected JMenuItem jMenuItemGuardarCambiosGeneraCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaGeneraCreditos;
	protected JMenuItem jMenuItemCerrarGeneraCreditos;
	protected JMenuItem jMenuItemDetalleCerrarGeneraCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarGeneraCreditos;
	
	protected JMenuItem jMenuItemProcesarInformacionGeneraCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGeneraCreditos;
	protected JMenuItem jMenuItemMostrarOcultarGeneraCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGeneraCreditos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGeneraCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGeneraCreditos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGeneraCreditos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGeneraCreditos;
	public JLabel jLabelIdGeneraCreditos;
	public JLabel jLabelidGeneraCreditos;
	public JButton jButtonidGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoGeneraCreditos;
	public JLabel jLabelcodigoGeneraCreditos;
	public JTextField jTextFieldcodigoGeneraCreditos;
	public JButton jButtoncodigoGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoGeneraCreditos;
	public JLabel jLabelnombre_completoGeneraCreditos;
	public JTextArea jTextAreanombre_completoGeneraCreditos;
	public JScrollPane jscrollPanenombre_completoGeneraCreditos;
	public JButton jButtonnombre_completoGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceGeneraCreditos;
	public JLabel jLabelfecha_venceGeneraCreditos;
	//public JFormattedTextField jDateChooserfecha_venceGeneraCreditos;

	public JDateChooser jDateChooserfecha_venceGeneraCreditos;
	public JButton jButtonfecha_venceGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionGeneraCreditos;
	public JLabel jLabelfecha_emisionGeneraCreditos;
	//public JFormattedTextField jDateChooserfecha_emisionGeneraCreditos;

	public JDateChooser jDateChooserfecha_emisionGeneraCreditos;
	public JButton jButtonfecha_emisionGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaGeneraCreditos;
	public JLabel jLabelnumero_facturaGeneraCreditos;
	public JTextField jTextFieldnumero_facturaGeneraCreditos;
	public JButton jButtonnumero_facturaGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localGeneraCreditos;
	public JLabel jLabeldebito_mone_localGeneraCreditos;
	public JTextField jTextFielddebito_mone_localGeneraCreditos;
	public JButton jButtondebito_mone_localGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localGeneraCreditos;
	public JLabel jLabelcredito_mone_localGeneraCreditos;
	public JTextField jTextFieldcredito_mone_localGeneraCreditos;
	public JButton jButtoncredito_mone_localGeneraCreditosBusqueda= new JButtonMe();

	public JPanel jPanelsaldoGeneraCreditos;
	public JLabel jLabelsaldoGeneraCreditos;
	public JTextField jTextFieldsaldoGeneraCreditos;
	public JButton jButtonsaldoGeneraCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGeneraCreditos;
	public JLabel jLabelid_empresaGeneraCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGeneraCreditos;
	public JButton jButtonid_empresaGeneraCreditos= new JButtonMe();
	public JButton jButtonid_empresaGeneraCreditosUpdate= new JButtonMe();
	public JButton jButtonid_empresaGeneraCreditosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGeneraCreditos;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GeneraCreditosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGeneraCreditos=new JPanel();
				this.jPanelAccionesFormularioGeneraCreditos=new JPanel();
				this.jmenuBarDetalleGeneraCreditos=new JMenuBar();
				this.jTtoolBarDetalleGeneraCreditos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GeneraCreditosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GeneraCreditosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GeneraCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGeneraCreditos() {
		return this.jButtonActualizarToolBarGeneraCreditos;
	}
	
	public JButton getjButtonEliminarToolBarGeneraCreditos() {
		return this.jButtonEliminarToolBarGeneraCreditos;
	}
	
	public JButton getjButtonCancelarToolBarGeneraCreditos() {
		return this.jButtonCancelarToolBarGeneraCreditos;
	}		
	
	public JButton getjButtonProcesarInformacionGeneraCreditos() {
		return this.jButtonProcesarInformacionGeneraCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGeneraCreditos)	{
		this.jButtonProcesarInformacionGeneraCreditos = jButtonProcesarInformacionGeneraCreditos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGeneraCreditos() {
		return this.jComboBoxTiposAccionesGeneraCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGeneraCreditos(
			JComboBox jComboBoxTiposRelacionesGeneraCreditos) {
		this.jComboBoxTiposRelacionesGeneraCreditos = jComboBoxTiposRelacionesGeneraCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGeneraCreditos(
			JComboBox jComboBoxTiposAccionesGeneraCreditos) {
		this.jComboBoxTiposAccionesGeneraCreditos = jComboBoxTiposAccionesGeneraCreditos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGeneraCreditos() {
		return this.jComboBoxTiposAccionesFormularioGeneraCreditos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGeneraCreditos(
			JComboBox jComboBoxTiposAccionesFormularioGeneraCreditos) {
		this.jComboBoxTiposAccionesFormularioGeneraCreditos = jComboBoxTiposAccionesFormularioGeneraCreditos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.generacreditosSessionBean=new GeneraCreditosSessionBean();
		
		this.generacreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.generacreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.generacreditosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GeneraCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GeneraCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Genera Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
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
	
		GeneraCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGeneraCreditos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGeneraCreditos=new JButtonMe();
				this.jButtonModificarToolBarGeneraCreditos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos,
							"actualizar","actualizar","Actualizar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos,
							"eliminar","eliminar","Eliminar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos,
							"cancelar","cancelar","Cancelar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGeneraCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos,
							"guardarcambios","guardarcambios","Guardar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGeneraCreditos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGeneraCreditos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGeneraCreditos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGeneraCreditos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGeneraCreditos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGeneraCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGeneraCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGeneraCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGeneraCreditos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGeneraCreditos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGeneraCreditos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGeneraCreditos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGeneraCreditos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGeneraCreditos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGeneraCreditos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGeneraCreditos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGeneraCreditos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGeneraCreditos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGeneraCreditos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGeneraCreditos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGeneraCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGeneraCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGeneraCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGeneraCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGeneraCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGeneraCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGeneraCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGeneraCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGeneraCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGeneraCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGeneraCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGeneraCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGeneraCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGeneraCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGeneraCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGeneraCreditos.add(this.jMenuItemDetalleCerrarGeneraCreditos);
		
		this.jmenuDetalleAccionesGeneraCreditos.add(this.jMenuItemActualizarGeneraCreditos);
		this.jmenuDetalleAccionesGeneraCreditos.add(this.jMenuItemEliminarGeneraCreditos);
		this.jmenuDetalleAccionesGeneraCreditos.add(this.jMenuItemCancelarGeneraCreditos);		
		
		//this.jmenuDetalleDatosGeneraCreditos.add(this.jMenuItemDetalleAbrirOrderByGeneraCreditos);				
		this.jmenuDetalleDatosGeneraCreditos.add(this.jMenuItemDetalleMostarOcultarGeneraCreditos);				
				
		//this.jmenuDetalleAccionesGeneraCreditos.add(this.jMenuItemGuardarCambiosGeneraCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGeneraCreditos.add(this.jmenuDetalleArchivoGeneraCreditos);		
		this.jmenuBarDetalleGeneraCreditos.add(this.jmenuDetalleAccionesGeneraCreditos);		
		this.jmenuBarDetalleGeneraCreditos.add(this.jmenuDetalleDatosGeneraCreditos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGeneraCreditos);				
	}
	
	
	public void inicializarElementosCamposGeneraCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGeneraCreditos = new JLabelMe();
		jLabelIdGeneraCreditos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGeneraCreditos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGeneraCreditos= new GridBagLayout();

		this.jPanelidGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);

		jLabelidGeneraCreditos = new JLabel();
		jLabelidGeneraCreditos.setText("Id");

		jLabelidGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoGeneraCreditos = new JLabelMe();
		this.jLabelcodigoGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoGeneraCreditos.setToolTipText("Codigo");
		this.jLabelcodigoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelcodigoGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextFieldcodigoGeneraCreditos= new JTextFieldMe();

		jTextFieldcodigoGeneraCreditos.setEnabled(false);
		jTextFieldcodigoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoGeneraCreditosBusqueda= new JButtonMe();
		this.jButtoncodigoGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoGeneraCreditosBusqueda.setText("U");
		this.jButtoncodigoGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoGeneraCreditos = new JLabelMe();
		this.jLabelnombre_completoGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoGeneraCreditos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelnombre_completoGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextAreanombre_completoGeneraCreditos= new JTextAreaMe();
		jTextAreanombre_completoGeneraCreditos.setEnabled(false);
		jTextAreanombre_completoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoGeneraCreditos.setLineWrap(true);
		jTextAreanombre_completoGeneraCreditos.setWrapStyleWord(true);
		jTextAreanombre_completoGeneraCreditos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoGeneraCreditos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoGeneraCreditos = new JScrollPane(jTextAreanombre_completoGeneraCreditos);
		jscrollPanenombre_completoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonnombre_completoGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoGeneraCreditosBusqueda.setText("U");
		this.jButtonnombre_completoGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceGeneraCreditos = new JLabelMe();
		this.jLabelfecha_venceGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceGeneraCreditos.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelfecha_venceGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		//jFormattedTextFieldfecha_venceGeneraCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_venceGeneraCreditos= new JDateChooser();
		jDateChooserfecha_venceGeneraCreditos.setEnabled(false);
		jDateChooserfecha_venceGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceGeneraCreditos.setDate(new Date());
		jDateChooserfecha_venceGeneraCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceGeneraCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_venceGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceGeneraCreditosBusqueda.setText("U");
		this.jButtonfecha_venceGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionGeneraCreditos = new JLabelMe();
		this.jLabelfecha_emisionGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionGeneraCreditos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelfecha_emisionGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		//jFormattedTextFieldfecha_emisionGeneraCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionGeneraCreditos= new JDateChooser();
		jDateChooserfecha_emisionGeneraCreditos.setEnabled(false);
		jDateChooserfecha_emisionGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionGeneraCreditos.setDate(new Date());
		jDateChooserfecha_emisionGeneraCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionGeneraCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionGeneraCreditosBusqueda.setText("U");
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaGeneraCreditos = new JLabelMe();
		this.jLabelnumero_facturaGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaGeneraCreditos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelnumero_facturaGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextFieldnumero_facturaGeneraCreditos= new JTextFieldMe();

		jTextFieldnumero_facturaGeneraCreditos.setEnabled(false);
		jTextFieldnumero_facturaGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaGeneraCreditosBusqueda.setText("U");
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localGeneraCreditos = new JLabelMe();
		this.jLabeldebito_mone_localGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localGeneraCreditos.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPaneldebito_mone_localGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextFielddebito_mone_localGeneraCreditos= new JTextFieldMe();
		jTextFielddebito_mone_localGeneraCreditos.setEnabled(false);
		jTextFielddebito_mone_localGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localGeneraCreditos.setText("0.0");

		this.jButtondebito_mone_localGeneraCreditosBusqueda= new JButtonMe();
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localGeneraCreditosBusqueda.setText("U");
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localGeneraCreditos = new JLabelMe();
		this.jLabelcredito_mone_localGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localGeneraCreditos.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelcredito_mone_localGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextFieldcredito_mone_localGeneraCreditos= new JTextFieldMe();
		jTextFieldcredito_mone_localGeneraCreditos.setEnabled(false);
		jTextFieldcredito_mone_localGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localGeneraCreditos.setText("0.0");

		this.jButtoncredito_mone_localGeneraCreditosBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localGeneraCreditosBusqueda.setText("U");
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localGeneraCreditosBusqueda.setVisible(false);		}


					
		this.jLabelsaldoGeneraCreditos = new JLabelMe();
		this.jLabelsaldoGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoGeneraCreditos.setToolTipText("Saldo");
		this.jLabelsaldoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelsaldoGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jTextFieldsaldoGeneraCreditos= new JTextFieldMe();
		jTextFieldsaldoGeneraCreditos.setEnabled(false);
		jTextFieldsaldoGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoGeneraCreditos.setText("0.0");

		this.jButtonsaldoGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonsaldoGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoGeneraCreditosBusqueda.setText("U");
		this.jButtonsaldoGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoGeneraCreditosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGeneraCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGeneraCreditos = new JLabelMe();
		this.jLabelid_empresaGeneraCreditos.setText(""+GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGeneraCreditos.setToolTipText("Empresa");
		this.jLabelid_empresaGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGeneraCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGeneraCreditos.setToolTipText(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGeneraCreditos = new GridBagLayout();
		this.jPanelid_empresaGeneraCreditos.setLayout(this.gridaBagLayoutGeneraCreditos);


		jComboBoxid_empresaGeneraCreditos= new JComboBoxMe();
		jComboBoxid_empresaGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGeneraCreditos.setEnabled(false);

		this.jButtonid_empresaGeneraCreditos= new JButtonMe();
		this.jButtonid_empresaGeneraCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGeneraCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGeneraCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGeneraCreditos.setText("Buscar");
		this.jButtonid_empresaGeneraCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGeneraCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGeneraCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGeneraCreditos"));

		this.jButtonid_empresaGeneraCreditosBusqueda= new JButtonMe();
		this.jButtonid_empresaGeneraCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGeneraCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGeneraCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGeneraCreditosBusqueda.setText("U");
		this.jButtonid_empresaGeneraCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGeneraCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGeneraCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGeneraCreditosBusqueda"));

		if(this.generacreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGeneraCreditosBusqueda.setVisible(false);		}

		this.jButtonid_empresaGeneraCreditosUpdate= new JButtonMe();
		this.jButtonid_empresaGeneraCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGeneraCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGeneraCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGeneraCreditosUpdate.setText("U");
		this.jButtonid_empresaGeneraCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGeneraCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGeneraCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGeneraCreditosUpdate"));



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
		//this.jInternalFrameDetalleGeneraCreditos = new GeneraCreditosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Genera Creditos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGeneraCreditos= new GridBagLayout();
		

		
		String sToolTipGeneraCreditos="";
		sToolTipGeneraCreditos=GeneraCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGeneraCreditos+="(Nomina.GeneraCreditos)";
		}
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipGeneraCreditos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGeneraCreditos = new JButtonMe();
		this.jButtonModificarGeneraCreditos = new JButtonMe();
        this.jButtonActualizarGeneraCreditos = new JButtonMe();
        this.jButtonEliminarGeneraCreditos = new JButtonMe();
        this.jButtonCancelarGeneraCreditos = new JButtonMe();
        this.jButtonGuardarCambiosGeneraCreditos = new JButtonMe();
		this.jButtonGuardarCambiosTablaGeneraCreditos = new JButtonMe();
		this.jButtonCerrarGeneraCreditos = new JButtonMe();
		
		this.jScrollPanelDatosGeneraCreditos = new JScrollPane();   
        this.jScrollPanelDatosEdicionGeneraCreditos = new JScrollPane();
		this.jScrollPanelDatosGeneralGeneraCreditos = new JScrollPane();
				
		
		
		this.jPanelCamposGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Genera Creditos";
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Genera Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosGeneraCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGeneraCreditos.setName("jPanelCamposGeneraCreditos"); 

		this.jPanelCamposOcultosGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGeneraCreditos.setName("jPanelCamposOcultosGeneraCreditos"); 

        this.jPanelAccionesGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGeneraCreditos.setToolTipText("Acciones");
        this.jPanelAccionesGeneraCreditos.setName("Acciones"); 

		this.jPanelAccionesFormularioGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGeneraCreditos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGeneraCreditos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGeneraCreditos.setText("Nuevo");
		this.jButtonModificarGeneraCreditos.setText("Editar");
        this.jButtonActualizarGeneraCreditos.setText("Actualizar");
        this.jButtonEliminarGeneraCreditos.setText("Eliminar");
        this.jButtonCancelarGeneraCreditos.setText("Cancelar");
        this.jButtonGuardarCambiosGeneraCreditos.setText("Guardar");
		this.jButtonGuardarCambiosTablaGeneraCreditos.setText("Guardar");
		this.jButtonCerrarGeneraCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGeneraCreditos,"nuevo_button","Nuevo",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGeneraCreditos,"modificar_button","Editar",this.generacreditosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGeneraCreditos,"actualizar_button","Actualizar",this.generacreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGeneraCreditos,"eliminar_button","Eliminar",this.generacreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGeneraCreditos,"cancelar_button","Cancelar",this.generacreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGeneraCreditos,"guardarcambios_button","Guardar",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGeneraCreditos,"guardarcambiostabla_button","Guardar",this.generacreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGeneraCreditos,"cerrar_button","Salir",this.generacreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGeneraCreditos.setToolTipText("Nuevo"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGeneraCreditos.setToolTipText("Editar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGeneraCreditos.setToolTipText("Actualizar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGeneraCreditos.setToolTipText("Eliminar)"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGeneraCreditos.setToolTipText("Cancelar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGeneraCreditos.setToolTipText("Guardar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGeneraCreditos.setToolTipText("Guardar"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGeneraCreditos.setToolTipText("Salir"+" "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGeneraCreditos";
		inputMap = this.jButtonNuevoGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGeneraCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGeneraCreditos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGeneraCreditos";
		inputMap = this.jButtonActualizarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGeneraCreditos"));
		
		//ELIMINAR
		sMapKey = "EliminarGeneraCreditos";
		inputMap = this.jButtonEliminarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGeneraCreditos"));
		
		//CANCELAR	
		sMapKey = "CancelarGeneraCreditos";
		inputMap = this.jButtonCancelarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGeneraCreditos"));
		
		//CERRAR		
		sMapKey = "CerrarGeneraCreditos";
		inputMap = this.jButtonCerrarGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGeneraCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGeneraCreditos";
		inputMap = this.jButtonGuardarCambiosTablaGeneraCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGeneraCreditos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGeneraCreditos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGeneraCreditos.setToolTipText("Nuevo GeneraCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGeneraCreditos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGeneraCreditos.setToolTipText("Sin Cerrar Ventana GeneraCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGeneraCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGeneraCreditos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGeneraCreditos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGeneraCreditos.setText("Accion");
		this.jComboBoxTiposAccionesGeneraCreditos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGeneraCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGeneraCreditos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGeneraCreditos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGeneraCreditos = new JLabelMe();
		
		this.jLabelAccionesGeneraCreditos.setText("Acciones");		
		this.jLabelAccionesGeneraCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGeneraCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGeneraCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGeneraCreditos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGeneraCreditos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGeneraCreditos=new JTabbedPane();
		this.jTabbedPaneRelacionesGeneraCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGeneraCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGeneraCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGeneraCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGeneraCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGeneraCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGeneraCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGeneraCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGeneraCreditos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGeneraCreditos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGeneraCreditos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGeneraCreditos = new GridBagLayout();
		
		this.jPanelCamposGeneraCreditos.setLayout(gridaBagLayoutCamposGeneraCreditos);
		this.jPanelCamposOcultosGeneraCreditos.setLayout(gridaBagLayoutCamposOcultosGeneraCreditos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGeneraCreditos.add(jLabelIdGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGeneraCreditos.add(jLabelidGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGeneraCreditos.add(jLabelid_empresaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGeneraCreditos.add(jButtonid_empresaGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 3;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGeneraCreditos.add(jButtonid_empresaGeneraCreditosUpdate, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGeneraCreditos.add(jComboBoxid_empresaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoGeneraCreditos.add(jLabelcodigoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoGeneraCreditos.add(jButtoncodigoGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoGeneraCreditos.add(jTextFieldcodigoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoGeneraCreditos.add(jLabelnombre_completoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoGeneraCreditos.add(jButtonnombre_completoGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoGeneraCreditos.add(jscrollPanenombre_completoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceGeneraCreditos.add(jLabelfecha_venceGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceGeneraCreditos.add(jButtonfecha_venceGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceGeneraCreditos.add(jDateChooserfecha_venceGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionGeneraCreditos.add(jLabelfecha_emisionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionGeneraCreditos.add(jButtonfecha_emisionGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionGeneraCreditos.add(jDateChooserfecha_emisionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaGeneraCreditos.add(jLabelnumero_facturaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaGeneraCreditos.add(jButtonnumero_facturaGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaGeneraCreditos.add(jTextFieldnumero_facturaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localGeneraCreditos.add(jLabeldebito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localGeneraCreditos.add(jButtondebito_mone_localGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localGeneraCreditos.add(jTextFielddebito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localGeneraCreditos.add(jLabelcredito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localGeneraCreditos.add(jButtoncredito_mone_localGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localGeneraCreditos.add(jTextFieldcredito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 0;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoGeneraCreditos.add(jLabelsaldoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		//this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = 2;
		this.gridBagConstraintsGeneraCreditos.ipadx = 0;
		this.gridBagConstraintsGeneraCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoGeneraCreditos.add(jButtonsaldoGeneraCreditosBusqueda, this.gridBagConstraintsGeneraCreditos);
	}

	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGeneraCreditos.gridy = 0;
	this.gridBagConstraintsGeneraCreditos.gridx = 1;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoGeneraCreditos.add(jTextFieldsaldoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelidGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelcodigoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelnombre_completoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelfecha_venceGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelfecha_emisionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelnumero_facturaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPaneldebito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelcredito_mone_localGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGeneraCreditos.add(this.jPanelsaldoGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposGeneraCreditos % 1==0) {
		iXPanelCamposGeneraCreditos=0;
		iYPanelCamposGeneraCreditos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGeneraCreditos.gridy = iYPanelCamposOcultosGeneraCreditos;
	this.gridBagConstraintsGeneraCreditos.gridx = iXPanelCamposOcultosGeneraCreditos++;
	this.gridBagConstraintsGeneraCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGeneraCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGeneraCreditos.add(this.jPanelid_empresaGeneraCreditos, this.gridBagConstraintsGeneraCreditos);



	if(iXPanelCamposOcultosGeneraCreditos % 1==0) {
		iXPanelCamposOcultosGeneraCreditos=0;
		iYPanelCamposOcultosGeneraCreditos++;
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
			
		GridBagLayout gridaBagLayoutAccionesGeneraCreditos= new GridBagLayout();
		this.jPanelAccionesGeneraCreditos.setLayout(gridaBagLayoutAccionesGeneraCreditos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGeneraCreditos= new GridBagLayout();
		this.jPanelAccionesFormularioGeneraCreditos.setLayout(gridaBagLayoutAccionesFormularioGeneraCreditos);
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGeneraCreditos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGeneraCreditos.add(this.jComboBoxTiposAccionesFormularioGeneraCreditos, this.gridBagConstraintsGeneraCreditos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccion++;
			
		this.jPanelAccionesGeneraCreditos.add(this.jButtonModificarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);							

		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGeneraCreditos.gridy = 0;
		this.gridBagConstraintsGeneraCreditos.gridx =iPosXAccion++;
			
		this.jPanelAccionesGeneraCreditos.add(this.jButtonEliminarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = 0;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesGeneraCreditos.add(this.jButtonActualizarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);


		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = 0;		
		this.gridBagConstraintsGeneraCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesGeneraCreditos.add(this.jButtonGuardarCambiosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);	
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = 0;		
		this.gridBagConstraintsGeneraCreditos.gridx =iPosXAccion++;
		
		this.jPanelAccionesGeneraCreditos.add(this.jButtonCancelarGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGeneraCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGeneraCreditos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();						
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGeneraCreditos.gridx = 0;		
			//this.gridBagConstraintsGeneraCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGeneraCreditos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGeneraCreditos.gridx =0;
		this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGeneraCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGeneraCreditos = new GeneraCreditosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Genera Creditos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Genera Creditos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Genera Creditos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GeneraCreditosModel generacreditosModel=new GeneraCreditosModel(this);
			
			//SI USARA CLASE INTERNA
			//GeneraCreditosModel.GeneraCreditosFocusTraversalPolicy generacreditosFocusTraversalPolicy = generacreditosModel.new GeneraCreditosFocusTraversalPolicy(this);
			
			//generacreditosFocusTraversalPolicy.setgeneracreditosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(generacreditosModel);
			
			
			this.jContentPaneDetalleGeneraCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGeneraCreditos = new GridBagLayout();	
			this.jContentPaneDetalleGeneraCreditos.setLayout(gridaBagLayoutDetalleGeneraCreditos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGeneraCreditos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
				this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGeneraCreditos.gridx = 0;
					
				
				this.jContentPaneDetalleGeneraCreditos.add(jTtoolBarDetalleGeneraCreditos, gridBagConstraintsGeneraCreditos);								
				
}
			
			this.jScrollPanelDatosEdicionGeneraCreditos=   new JScrollPane(jContentPaneDetalleGeneraCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGeneraCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGeneraCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGeneraCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGeneraCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGeneraCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGeneraCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGeneraCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGeneraCreditos.gridx = 0;
	        
			this.jContentPaneDetalleGeneraCreditos.add(jPanelCamposGeneraCreditos, gridBagConstraintsGeneraCreditos);
			
			
			
			
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
						//&& generacreditosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGeneraCreditos= new GridBagConstraints();
						this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGeneraCreditos.gridx = 0;
						this.jContentPaneDetalleGeneraCreditos.add(this.jTabbedPaneRelacionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGeneraCreditos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGeneraCreditos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
					this.gridBagConstraintsGeneraCreditos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGeneraCreditos.gridx = 0;
					
				
					this.jContentPaneDetalleGeneraCreditos.add(jPanelCamposOcultosGeneraCreditos, gridBagConstraintsGeneraCreditos);
				
					this.jPanelCamposOcultosGeneraCreditos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGeneraCreditos.gridx = 0;
	        this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGeneraCreditos.add(this.jPanelAccionesFormularioGeneraCreditos, this.gridBagConstraintsGeneraCreditos);							
			
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
	        this.gridBagConstraintsGeneraCreditos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGeneraCreditos.gridx = 0;
	        
			
			this.jContentPaneDetalleGeneraCreditos.add(this.jPanelAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGeneraCreditos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGeneraCreditos=   new JScrollPane(this.jPanelCamposGeneraCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGeneraCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGeneraCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGeneraCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGeneraCreditos.gridx = 0;
			this.gridBagConstraintsGeneraCreditos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGeneraCreditos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGeneraCreditos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGeneraCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGeneraCreditos, this.gridBagConstraintsGeneraCreditos);			
			
			this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
			this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGeneraCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
			
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		
			
		this.gridBagConstraintsGeneraCreditos = new GridBagConstraints();
		this.gridBagConstraintsGeneraCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGeneraCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGeneraCreditos, this.gridBagConstraintsGeneraCreditos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGeneraCreditos;//jContentPane;
		
		return jScrollPanelDatosEdicionGeneraCreditos;
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
