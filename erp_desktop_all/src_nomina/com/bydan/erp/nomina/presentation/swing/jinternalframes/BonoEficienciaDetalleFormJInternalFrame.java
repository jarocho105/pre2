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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.BonoEficienciaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class BonoEficienciaDetalleFormJInternalFrame extends BonoEficienciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBonoEficiencia;
	
	protected JMenuBar jmenuBarDetalleBonoEficiencia;
	
	protected JMenu jmenuDetalleBonoEficiencia;
	protected JMenu jmenuDetalleArchivoBonoEficiencia;
	protected JMenu jmenuDetalleAccionesBonoEficiencia;
	protected JMenu jmenuDetalleDatosBonoEficiencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBonoEficiencia;	
	protected GridBagConstraints gridBagConstraintsBonoEficiencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BonoEficienciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleBonoEficiencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public BonoEficienciaSessionBean bonoeficienciaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public BonoEficienciaLogic bonoeficienciaLogic;
	
	public JScrollPane jScrollPanelDatosBonoEficiencia;
	public JScrollPane jScrollPanelDatosEdicionBonoEficiencia;
	public JScrollPane jScrollPanelDatosGeneralBonoEficiencia;
	
	protected JPanel jPanelCamposBonoEficiencia;    
	protected JPanel jPanelCamposOcultosBonoEficiencia;    	
	protected JPanel jPanelAccionesBonoEficiencia;
	protected JPanel jPanelAccionesFormularioBonoEficiencia;
    
	
	
	protected Integer iXPanelCamposBonoEficiencia=0;
	protected Integer iYPanelCamposBonoEficiencia=0;
	
	protected Integer iXPanelCamposOcultosBonoEficiencia=0;
	protected Integer iYPanelCamposOcultosBonoEficiencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBonoEficiencia;
	public JButton jButtonModificarBonoEficiencia;
	public JButton jButtonActualizarBonoEficiencia;
    public JButton jButtonEliminarBonoEficiencia;
	public JButton jButtonCancelarBonoEficiencia;
    public JButton jButtonGuardarCambiosBonoEficiencia;
	public JButton jButtonGuardarCambiosTablaBonoEficiencia;
	protected JButton jButtonCerrarBonoEficiencia;
	
	
	protected JButton jButtonProcesarInformacionBonoEficiencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBonoEficiencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBonoEficiencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBonoEficiencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBonoEficiencia;
	protected JButton jButtonModificarToolBarBonoEficiencia;
	protected JButton jButtonActualizarToolBarBonoEficiencia;
    protected JButton jButtonEliminarToolBarBonoEficiencia;
	protected JButton jButtonCancelarToolBarBonoEficiencia;
    protected JButton jButtonGuardarCambiosToolBarBonoEficiencia;
	protected JButton jButtonGuardarCambiosTablaToolBarBonoEficiencia;
	protected JButton jButtonMostrarOcultarTablaToolBarBonoEficiencia;
	protected JButton jButtonCerrarToolBarBonoEficiencia;
	
	protected JButton jButtonProcesarInformacionToolBarBonoEficiencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBonoEficiencia;
	protected JMenuItem jMenuItemModificarBonoEficiencia;
	protected JMenuItem jMenuItemActualizarBonoEficiencia;
    protected JMenuItem jMenuItemEliminarBonoEficiencia;
	protected JMenuItem jMenuItemCancelarBonoEficiencia;
    protected JMenuItem jMenuItemGuardarCambiosBonoEficiencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaBonoEficiencia;
	protected JMenuItem jMenuItemCerrarBonoEficiencia;
	protected JMenuItem jMenuItemDetalleCerrarBonoEficiencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarBonoEficiencia;
	
	protected JMenuItem jMenuItemProcesarInformacionBonoEficiencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBonoEficiencia;
	protected JMenuItem jMenuItemMostrarOcultarBonoEficiencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBonoEficiencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBonoEficiencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBonoEficiencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBonoEficiencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBonoEficiencia;
	public JLabel jLabelIdBonoEficiencia;
	public JLabel jLabelidBonoEficiencia;
	public JButton jButtonidBonoEficienciaBusqueda= new JButtonMe();

	public JPanel jPaneldiasBonoEficiencia;
	public JLabel jLabeldiasBonoEficiencia;
	public JTextField jTextFielddiasBonoEficiencia;
	public JButton jButtondiasBonoEficienciaBusqueda= new JButtonMe();

	public JPanel jPanelvalorBonoEficiencia;
	public JLabel jLabelvalorBonoEficiencia;
	public JTextField jTextFieldvalorBonoEficiencia;
	public JButton jButtonvalorBonoEficienciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBonoEficiencia;
	public JLabel jLabelid_empresaBonoEficiencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBonoEficiencia;
	public JButton jButtonid_empresaBonoEficiencia= new JButtonMe();
	public JButton jButtonid_empresaBonoEficienciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaBonoEficienciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBonoEficiencia;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BonoEficienciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBonoEficiencia=new JPanel();
				this.jPanelAccionesFormularioBonoEficiencia=new JPanel();
				this.jmenuBarDetalleBonoEficiencia=new JMenuBar();
				this.jTtoolBarDetalleBonoEficiencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BonoEficienciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBonoEficiencia() {
		return this.jButtonActualizarToolBarBonoEficiencia;
	}
	
	public JButton getjButtonEliminarToolBarBonoEficiencia() {
		return this.jButtonEliminarToolBarBonoEficiencia;
	}
	
	public JButton getjButtonCancelarToolBarBonoEficiencia() {
		return this.jButtonCancelarToolBarBonoEficiencia;
	}		
	
	public JButton getjButtonProcesarInformacionBonoEficiencia() {
		return this.jButtonProcesarInformacionBonoEficiencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBonoEficiencia)	{
		this.jButtonProcesarInformacionBonoEficiencia = jButtonProcesarInformacionBonoEficiencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBonoEficiencia() {
		return this.jComboBoxTiposAccionesBonoEficiencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBonoEficiencia(
			JComboBox jComboBoxTiposRelacionesBonoEficiencia) {
		this.jComboBoxTiposRelacionesBonoEficiencia = jComboBoxTiposRelacionesBonoEficiencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBonoEficiencia(
			JComboBox jComboBoxTiposAccionesBonoEficiencia) {
		this.jComboBoxTiposAccionesBonoEficiencia = jComboBoxTiposAccionesBonoEficiencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBonoEficiencia() {
		return this.jComboBoxTiposAccionesFormularioBonoEficiencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBonoEficiencia(
			JComboBox jComboBoxTiposAccionesFormularioBonoEficiencia) {
		this.jComboBoxTiposAccionesFormularioBonoEficiencia = jComboBoxTiposAccionesFormularioBonoEficiencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		
		this.bonoeficienciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bonoeficienciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bonoeficienciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BonoEficienciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bono Eficiencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
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
	
		BonoEficienciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBonoEficiencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBonoEficiencia=new JButtonMe();
				this.jButtonModificarToolBarBonoEficiencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia,
							"actualizar","actualizar","Actualizar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia,
							"eliminar","eliminar","Eliminar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia,
							"cancelar","cancelar","Cancelar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia,
							"guardarcambios","guardarcambios","Guardar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBonoEficiencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBonoEficiencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBonoEficiencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBonoEficiencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBonoEficiencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBonoEficiencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBonoEficiencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBonoEficiencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBonoEficiencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBonoEficiencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBonoEficiencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBonoEficiencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBonoEficiencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBonoEficiencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBonoEficiencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBonoEficiencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBonoEficiencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBonoEficiencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBonoEficiencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBonoEficiencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBonoEficiencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBonoEficiencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBonoEficiencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBonoEficiencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBonoEficiencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBonoEficiencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBonoEficiencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBonoEficiencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBonoEficiencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBonoEficiencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBonoEficiencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBonoEficiencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBonoEficiencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBonoEficiencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBonoEficiencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBonoEficiencia.add(this.jMenuItemDetalleCerrarBonoEficiencia);
		
		this.jmenuDetalleAccionesBonoEficiencia.add(this.jMenuItemActualizarBonoEficiencia);
		this.jmenuDetalleAccionesBonoEficiencia.add(this.jMenuItemEliminarBonoEficiencia);
		this.jmenuDetalleAccionesBonoEficiencia.add(this.jMenuItemCancelarBonoEficiencia);		
		
		//this.jmenuDetalleDatosBonoEficiencia.add(this.jMenuItemDetalleAbrirOrderByBonoEficiencia);				
		this.jmenuDetalleDatosBonoEficiencia.add(this.jMenuItemDetalleMostarOcultarBonoEficiencia);				
				
		//this.jmenuDetalleAccionesBonoEficiencia.add(this.jMenuItemGuardarCambiosBonoEficiencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBonoEficiencia.add(this.jmenuDetalleArchivoBonoEficiencia);		
		this.jmenuBarDetalleBonoEficiencia.add(this.jmenuDetalleAccionesBonoEficiencia);		
		this.jmenuBarDetalleBonoEficiencia.add(this.jmenuDetalleDatosBonoEficiencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBonoEficiencia);				
	}
	
	
	public void inicializarElementosCamposBonoEficiencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBonoEficiencia = new JLabelMe();
		jLabelIdBonoEficiencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBonoEficiencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBonoEficiencia.setToolTipText(BonoEficienciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBonoEficiencia= new GridBagLayout();

		this.jPanelidBonoEficiencia.setLayout(this.gridaBagLayoutBonoEficiencia);

		jLabelidBonoEficiencia = new JLabel();
		jLabelidBonoEficiencia.setText("Id");

		jLabelidBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldiasBonoEficiencia = new JLabelMe();
		this.jLabeldiasBonoEficiencia.setText(""+BonoEficienciaConstantesFunciones.LABEL_DIAS+" : *");
		this.jLabeldiasBonoEficiencia.setToolTipText("Dias");
		this.jLabeldiasBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiasBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiasBonoEficiencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiasBonoEficiencia.setToolTipText(BonoEficienciaConstantesFunciones.LABEL_DIAS);
		this.gridaBagLayoutBonoEficiencia = new GridBagLayout();
		this.jPaneldiasBonoEficiencia.setLayout(this.gridaBagLayoutBonoEficiencia);


		jTextFielddiasBonoEficiencia= new JTextFieldMe();
		jTextFielddiasBonoEficiencia.setEnabled(false);
		jTextFielddiasBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiasBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiasBonoEficiencia.setText("0");

		this.jButtondiasBonoEficienciaBusqueda= new JButtonMe();
		this.jButtondiasBonoEficienciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasBonoEficienciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasBonoEficienciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiasBonoEficienciaBusqueda.setText("U");
		this.jButtondiasBonoEficienciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiasBonoEficienciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiasBonoEficienciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiasBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiasBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diasBonoEficienciaBusqueda"));

		if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiasBonoEficienciaBusqueda.setVisible(false);		}


					
		this.jLabelvalorBonoEficiencia = new JLabelMe();
		this.jLabelvalorBonoEficiencia.setText(""+BonoEficienciaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorBonoEficiencia.setToolTipText("Valor");
		this.jLabelvalorBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorBonoEficiencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorBonoEficiencia.setToolTipText(BonoEficienciaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutBonoEficiencia = new GridBagLayout();
		this.jPanelvalorBonoEficiencia.setLayout(this.gridaBagLayoutBonoEficiencia);


		jTextFieldvalorBonoEficiencia= new JTextFieldMe();
		jTextFieldvalorBonoEficiencia.setEnabled(false);
		jTextFieldvalorBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorBonoEficiencia.setText("0.0");

		this.jButtonvalorBonoEficienciaBusqueda= new JButtonMe();
		this.jButtonvalorBonoEficienciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorBonoEficienciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorBonoEficienciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorBonoEficienciaBusqueda.setText("U");
		this.jButtonvalorBonoEficienciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorBonoEficienciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorBonoEficienciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorBonoEficienciaBusqueda"));

		if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorBonoEficienciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBonoEficiencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBonoEficiencia = new JLabelMe();
		this.jLabelid_empresaBonoEficiencia.setText(""+BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBonoEficiencia.setToolTipText("Empresa");
		this.jLabelid_empresaBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBonoEficiencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBonoEficiencia.setToolTipText(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBonoEficiencia = new GridBagLayout();
		this.jPanelid_empresaBonoEficiencia.setLayout(this.gridaBagLayoutBonoEficiencia);


		jComboBoxid_empresaBonoEficiencia= new JComboBoxMe();
		jComboBoxid_empresaBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBonoEficiencia.setEnabled(false);

		this.jButtonid_empresaBonoEficiencia= new JButtonMe();
		this.jButtonid_empresaBonoEficiencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBonoEficiencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBonoEficiencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBonoEficiencia.setText("Buscar");
		this.jButtonid_empresaBonoEficiencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBonoEficiencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBonoEficiencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBonoEficiencia"));

		this.jButtonid_empresaBonoEficienciaBusqueda= new JButtonMe();
		this.jButtonid_empresaBonoEficienciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBonoEficienciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBonoEficienciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBonoEficienciaBusqueda.setText("U");
		this.jButtonid_empresaBonoEficienciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBonoEficienciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBonoEficienciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBonoEficienciaBusqueda"));

		if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBonoEficienciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaBonoEficienciaUpdate= new JButtonMe();
		this.jButtonid_empresaBonoEficienciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBonoEficienciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBonoEficienciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBonoEficienciaUpdate.setText("U");
		this.jButtonid_empresaBonoEficienciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBonoEficienciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBonoEficienciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBonoEficienciaUpdate"));



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
		//this.jInternalFrameDetalleBonoEficiencia = new BonoEficienciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bono Eficiencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBonoEficiencia= new GridBagLayout();
		

		
		String sToolTipBonoEficiencia="";
		sToolTipBonoEficiencia=BonoEficienciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBonoEficiencia+="(Nomina.BonoEficiencia)";
		}
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipBonoEficiencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBonoEficiencia = new JButtonMe();
		this.jButtonModificarBonoEficiencia = new JButtonMe();
        this.jButtonActualizarBonoEficiencia = new JButtonMe();
        this.jButtonEliminarBonoEficiencia = new JButtonMe();
        this.jButtonCancelarBonoEficiencia = new JButtonMe();
        this.jButtonGuardarCambiosBonoEficiencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaBonoEficiencia = new JButtonMe();
		this.jButtonCerrarBonoEficiencia = new JButtonMe();
		
		this.jScrollPanelDatosBonoEficiencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionBonoEficiencia = new JScrollPane();
		this.jScrollPanelDatosGeneralBonoEficiencia = new JScrollPane();
				
		
		
		this.jPanelCamposBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Bono Eficiencia";
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias" + this.sPath));
		} else {
			this.jScrollPanelDatosBonoEficiencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBonoEficiencia.setName("jPanelCamposBonoEficiencia"); 

		this.jPanelCamposOcultosBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBonoEficiencia.setName("jPanelCamposOcultosBonoEficiencia"); 

        this.jPanelAccionesBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBonoEficiencia.setToolTipText("Acciones");
        this.jPanelAccionesBonoEficiencia.setName("Acciones"); 

		this.jPanelAccionesFormularioBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBonoEficiencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBonoEficiencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBonoEficiencia.setText("Nuevo");
		this.jButtonModificarBonoEficiencia.setText("Editar");
        this.jButtonActualizarBonoEficiencia.setText("Actualizar");
        this.jButtonEliminarBonoEficiencia.setText("Eliminar");
        this.jButtonCancelarBonoEficiencia.setText("Cancelar");
        this.jButtonGuardarCambiosBonoEficiencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaBonoEficiencia.setText("Guardar");
		this.jButtonCerrarBonoEficiencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBonoEficiencia,"nuevo_button","Nuevo",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBonoEficiencia,"modificar_button","Editar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBonoEficiencia,"actualizar_button","Actualizar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBonoEficiencia,"eliminar_button","Eliminar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBonoEficiencia,"cancelar_button","Cancelar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBonoEficiencia,"guardarcambios_button","Guardar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBonoEficiencia,"guardarcambiostabla_button","Guardar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBonoEficiencia,"cerrar_button","Salir",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBonoEficiencia.setToolTipText("Nuevo"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBonoEficiencia.setToolTipText("Editar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBonoEficiencia.setToolTipText("Actualizar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBonoEficiencia.setToolTipText("Eliminar)"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBonoEficiencia.setToolTipText("Cancelar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBonoEficiencia.setToolTipText("Guardar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBonoEficiencia.setToolTipText("Guardar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBonoEficiencia.setToolTipText("Salir"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBonoEficiencia";
		inputMap = this.jButtonNuevoBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBonoEficiencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBonoEficiencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBonoEficiencia";
		inputMap = this.jButtonActualizarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBonoEficiencia"));
		
		//ELIMINAR
		sMapKey = "EliminarBonoEficiencia";
		inputMap = this.jButtonEliminarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBonoEficiencia"));
		
		//CANCELAR	
		sMapKey = "CancelarBonoEficiencia";
		inputMap = this.jButtonCancelarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBonoEficiencia"));
		
		//CERRAR		
		sMapKey = "CerrarBonoEficiencia";
		inputMap = this.jButtonCerrarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBonoEficiencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBonoEficiencia";
		inputMap = this.jButtonGuardarCambiosTablaBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBonoEficiencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBonoEficiencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBonoEficiencia.setToolTipText("Nuevo BonoEficiencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBonoEficiencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBonoEficiencia.setToolTipText("Sin Cerrar Ventana BonoEficiencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBonoEficiencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBonoEficiencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBonoEficiencia.setText("Accion");
		this.jComboBoxTiposAccionesBonoEficiencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBonoEficiencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBonoEficiencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBonoEficiencia = new JLabelMe();
		
		this.jLabelAccionesBonoEficiencia.setText("Acciones");		
		this.jLabelAccionesBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBonoEficiencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBonoEficiencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBonoEficiencia=new JTabbedPane();
		this.jTabbedPaneRelacionesBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBonoEficiencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBonoEficiencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBonoEficiencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBonoEficiencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBonoEficiencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBonoEficiencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBonoEficiencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBonoEficiencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBonoEficiencia = new GridBagLayout();
		
		this.jPanelCamposBonoEficiencia.setLayout(gridaBagLayoutCamposBonoEficiencia);
		this.jPanelCamposOcultosBonoEficiencia.setLayout(gridaBagLayoutCamposOcultosBonoEficiencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 0;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBonoEficiencia.add(jLabelIdBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 1;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBonoEficiencia.add(jLabelidBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 0;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBonoEficiencia.add(jLabelid_empresaBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		//this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = 2;
		this.gridBagConstraintsBonoEficiencia.ipadx = 0;
		this.gridBagConstraintsBonoEficiencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBonoEficiencia.add(jButtonid_empresaBonoEficienciaBusqueda, this.gridBagConstraintsBonoEficiencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		//this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = 3;
		this.gridBagConstraintsBonoEficiencia.ipadx = 0;
		this.gridBagConstraintsBonoEficiencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBonoEficiencia.add(jButtonid_empresaBonoEficienciaUpdate, this.gridBagConstraintsBonoEficiencia);
	}

	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 1;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBonoEficiencia.add(jComboBoxid_empresaBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 0;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiasBonoEficiencia.add(jLabeldiasBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		//this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = 2;
		this.gridBagConstraintsBonoEficiencia.ipadx = 0;
		this.gridBagConstraintsBonoEficiencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiasBonoEficiencia.add(jButtondiasBonoEficienciaBusqueda, this.gridBagConstraintsBonoEficiencia);
	}

	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 1;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiasBonoEficiencia.add(jTextFielddiasBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 0;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorBonoEficiencia.add(jLabelvalorBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		//this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = 2;
		this.gridBagConstraintsBonoEficiencia.ipadx = 0;
		this.gridBagConstraintsBonoEficiencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorBonoEficiencia.add(jButtonvalorBonoEficienciaBusqueda, this.gridBagConstraintsBonoEficiencia);
	}

	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBonoEficiencia.gridy = 0;
	this.gridBagConstraintsBonoEficiencia.gridx = 1;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorBonoEficiencia.add(jTextFieldvalorBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBonoEficiencia.gridy = iYPanelCamposBonoEficiencia;
	this.gridBagConstraintsBonoEficiencia.gridx = iXPanelCamposBonoEficiencia++;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBonoEficiencia.add(this.jPanelidBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(iXPanelCamposBonoEficiencia % 1==0) {
		iXPanelCamposBonoEficiencia=0;
		iYPanelCamposBonoEficiencia++;
	}
	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBonoEficiencia.gridy = iYPanelCamposBonoEficiencia;
	this.gridBagConstraintsBonoEficiencia.gridx = iXPanelCamposBonoEficiencia++;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBonoEficiencia.add(this.jPaneldiasBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(iXPanelCamposBonoEficiencia % 1==0) {
		iXPanelCamposBonoEficiencia=0;
		iYPanelCamposBonoEficiencia++;
	}
	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBonoEficiencia.gridy = iYPanelCamposBonoEficiencia;
	this.gridBagConstraintsBonoEficiencia.gridx = iXPanelCamposBonoEficiencia++;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBonoEficiencia.add(this.jPanelvalorBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(iXPanelCamposBonoEficiencia % 1==0) {
		iXPanelCamposBonoEficiencia=0;
		iYPanelCamposBonoEficiencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBonoEficiencia.gridy = iYPanelCamposOcultosBonoEficiencia;
	this.gridBagConstraintsBonoEficiencia.gridx = iXPanelCamposOcultosBonoEficiencia++;
	this.gridBagConstraintsBonoEficiencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBonoEficiencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBonoEficiencia.add(this.jPanelid_empresaBonoEficiencia, this.gridBagConstraintsBonoEficiencia);



	if(iXPanelCamposOcultosBonoEficiencia % 1==0) {
		iXPanelCamposOcultosBonoEficiencia=0;
		iYPanelCamposOcultosBonoEficiencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesBonoEficiencia= new GridBagLayout();
		this.jPanelAccionesBonoEficiencia.setLayout(gridaBagLayoutAccionesBonoEficiencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBonoEficiencia= new GridBagLayout();
		this.jPanelAccionesFormularioBonoEficiencia.setLayout(gridaBagLayoutAccionesFormularioBonoEficiencia);
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBonoEficiencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBonoEficiencia.add(this.jComboBoxTiposAccionesFormularioBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBonoEficiencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBonoEficiencia.add(this.jCheckBoxPostAccionNuevoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBonoEficiencia.add(this.jCheckBoxPostAccionSinCerrarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBonoEficiencia.add(this.jCheckBoxPostAccionSinMensajeBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesBonoEficiencia.add(this.jButtonModificarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);							

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesBonoEficiencia.add(this.jButtonEliminarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = 0;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesBonoEficiencia.add(this.jButtonActualizarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = 0;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesBonoEficiencia.add(this.jButtonGuardarCambiosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);	
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = 0;		
		this.gridBagConstraintsBonoEficiencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesBonoEficiencia.add(this.jButtonCancelarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBonoEficiencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBonoEficiencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();						
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBonoEficiencia.gridx = 0;		
			//this.gridBagConstraintsBonoEficiencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBonoEficiencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBonoEficiencia.gridx =0;
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBonoEficiencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBonoEficiencia = new BonoEficienciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bono Eficiencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bono Eficiencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bono Eficiencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BonoEficienciaModel bonoeficienciaModel=new BonoEficienciaModel(this);
			
			//SI USARA CLASE INTERNA
			//BonoEficienciaModel.BonoEficienciaFocusTraversalPolicy bonoeficienciaFocusTraversalPolicy = bonoeficienciaModel.new BonoEficienciaFocusTraversalPolicy(this);
			
			//bonoeficienciaFocusTraversalPolicy.setbonoeficienciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bonoeficienciaModel);
			
			
			this.jContentPaneDetalleBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBonoEficiencia = new GridBagLayout();	
			this.jContentPaneDetalleBonoEficiencia.setLayout(gridaBagLayoutDetalleBonoEficiencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBonoEficiencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
				this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBonoEficiencia.gridx = 0;
					
				
				this.jContentPaneDetalleBonoEficiencia.add(jTtoolBarDetalleBonoEficiencia, gridBagConstraintsBonoEficiencia);								
				
}
			
			this.jScrollPanelDatosEdicionBonoEficiencia=   new JScrollPane(jContentPaneDetalleBonoEficiencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBonoEficiencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBonoEficiencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBonoEficiencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBonoEficiencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBonoEficiencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBonoEficiencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBonoEficiencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBonoEficiencia.gridx = 0;
	        
			this.jContentPaneDetalleBonoEficiencia.add(jPanelCamposBonoEficiencia, gridBagConstraintsBonoEficiencia);
			
			
			
			
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
						&& bonoeficienciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBonoEficiencia= new GridBagConstraints();
						this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBonoEficiencia.gridx = 0;
						this.jContentPaneDetalleBonoEficiencia.add(this.jTabbedPaneRelacionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBonoEficiencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBonoEficiencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
					this.gridBagConstraintsBonoEficiencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBonoEficiencia.gridx = 0;
					
				
					this.jContentPaneDetalleBonoEficiencia.add(jPanelCamposOcultosBonoEficiencia, gridBagConstraintsBonoEficiencia);
				
					this.jPanelCamposOcultosBonoEficiencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBonoEficiencia.gridx = 0;
	        this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBonoEficiencia.add(this.jPanelAccionesFormularioBonoEficiencia, this.gridBagConstraintsBonoEficiencia);							
			
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
	        this.gridBagConstraintsBonoEficiencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBonoEficiencia.gridx = 0;
	        
			
			this.jContentPaneDetalleBonoEficiencia.add(this.jPanelAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBonoEficiencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBonoEficiencia=   new JScrollPane(this.jPanelCamposBonoEficiencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBonoEficiencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBonoEficiencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBonoEficiencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBonoEficiencia.gridx = 0;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBonoEficiencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBonoEficiencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBonoEficiencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBonoEficiencia;//jContentPane;
		
		return jScrollPanelDatosEdicionBonoEficiencia;
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
