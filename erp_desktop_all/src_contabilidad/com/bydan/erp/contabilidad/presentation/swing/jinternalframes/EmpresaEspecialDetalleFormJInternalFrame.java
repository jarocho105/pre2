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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.contabilidad.util.EmpresaEspecialConstantesFunciones;

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
public class EmpresaEspecialDetalleFormJInternalFrame extends EmpresaEspecialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpresaEspecial;
	
	protected JMenuBar jmenuBarDetalleEmpresaEspecial;
	
	protected JMenu jmenuDetalleEmpresaEspecial;
	protected JMenu jmenuDetalleArchivoEmpresaEspecial;
	protected JMenu jmenuDetalleAccionesEmpresaEspecial;
	protected JMenu jmenuDetalleDatosEmpresaEspecial;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpresaEspecial;	
	protected GridBagConstraints gridBagConstraintsEmpresaEspecial;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpresaEspecialBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpresaEspecial;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EmpresaEspecialSessionBean empresaespecialSessionBean;
	
	
	
		
	
	public EmpresaEspecialLogic empresaespecialLogic;
	
	public JScrollPane jScrollPanelDatosEmpresaEspecial;
	public JScrollPane jScrollPanelDatosEdicionEmpresaEspecial;
	public JScrollPane jScrollPanelDatosGeneralEmpresaEspecial;
	
	protected JPanel jPanelCamposEmpresaEspecial;    
	protected JPanel jPanelCamposOcultosEmpresaEspecial;    	
	protected JPanel jPanelAccionesEmpresaEspecial;
	protected JPanel jPanelAccionesFormularioEmpresaEspecial;
    
	
	
	protected Integer iXPanelCamposEmpresaEspecial=0;
	protected Integer iYPanelCamposEmpresaEspecial=0;
	
	protected Integer iXPanelCamposOcultosEmpresaEspecial=0;
	protected Integer iYPanelCamposOcultosEmpresaEspecial=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpresaEspecial;
	public JButton jButtonModificarEmpresaEspecial;
	public JButton jButtonActualizarEmpresaEspecial;
    public JButton jButtonEliminarEmpresaEspecial;
	public JButton jButtonCancelarEmpresaEspecial;
    public JButton jButtonGuardarCambiosEmpresaEspecial;
	public JButton jButtonGuardarCambiosTablaEmpresaEspecial;
	protected JButton jButtonCerrarEmpresaEspecial;
	
	
	protected JButton jButtonProcesarInformacionEmpresaEspecial;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpresaEspecial;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpresaEspecial;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpresaEspecial;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpresaEspecial;
	protected JButton jButtonModificarToolBarEmpresaEspecial;
	protected JButton jButtonActualizarToolBarEmpresaEspecial;
    protected JButton jButtonEliminarToolBarEmpresaEspecial;
	protected JButton jButtonCancelarToolBarEmpresaEspecial;
    protected JButton jButtonGuardarCambiosToolBarEmpresaEspecial;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpresaEspecial;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpresaEspecial;
	protected JButton jButtonCerrarToolBarEmpresaEspecial;
	
	protected JButton jButtonProcesarInformacionToolBarEmpresaEspecial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpresaEspecial;
	protected JMenuItem jMenuItemModificarEmpresaEspecial;
	protected JMenuItem jMenuItemActualizarEmpresaEspecial;
    protected JMenuItem jMenuItemEliminarEmpresaEspecial;
	protected JMenuItem jMenuItemCancelarEmpresaEspecial;
    protected JMenuItem jMenuItemGuardarCambiosEmpresaEspecial;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpresaEspecial;
	protected JMenuItem jMenuItemCerrarEmpresaEspecial;
	protected JMenuItem jMenuItemDetalleCerrarEmpresaEspecial;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpresaEspecial;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpresaEspecial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpresaEspecial;
	protected JMenuItem jMenuItemMostrarOcultarEmpresaEspecial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpresaEspecial;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpresaEspecial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpresaEspecial;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpresaEspecial;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpresaEspecial;
	public JLabel jLabelIdEmpresaEspecial;
	public JLabel jLabelidEmpresaEspecial;
	public JButton jButtonidEmpresaEspecialBusqueda= new JButtonMe();

	public JPanel jPanelnumero_resolucionEmpresaEspecial;
	public JLabel jLabelnumero_resolucionEmpresaEspecial;
	public JTextField jTextFieldnumero_resolucionEmpresaEspecial;
	public JButton jButtonnumero_resolucionEmpresaEspecialBusqueda= new JButtonMe();

	public JPanel jPanelfecha_resolucionEmpresaEspecial;
	public JLabel jLabelfecha_resolucionEmpresaEspecial;
	//public JFormattedTextField jDateChooserfecha_resolucionEmpresaEspecial;

	public JDateChooser jDateChooserfecha_resolucionEmpresaEspecial;
	public JButton jButtonfecha_resolucionEmpresaEspecialBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpresaEspecial;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpresaEspecialDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpresaEspecial=new JPanel();
				this.jPanelAccionesFormularioEmpresaEspecial=new JPanel();
				this.jmenuBarDetalleEmpresaEspecial=new JMenuBar();
				this.jTtoolBarDetalleEmpresaEspecial=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpresaEspecialDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpresaEspecial() {
		return this.jButtonActualizarToolBarEmpresaEspecial;
	}
	
	public JButton getjButtonEliminarToolBarEmpresaEspecial() {
		return this.jButtonEliminarToolBarEmpresaEspecial;
	}
	
	public JButton getjButtonCancelarToolBarEmpresaEspecial() {
		return this.jButtonCancelarToolBarEmpresaEspecial;
	}		
	
	public JButton getjButtonProcesarInformacionEmpresaEspecial() {
		return this.jButtonProcesarInformacionEmpresaEspecial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpresaEspecial)	{
		this.jButtonProcesarInformacionEmpresaEspecial = jButtonProcesarInformacionEmpresaEspecial;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpresaEspecial() {
		return this.jComboBoxTiposAccionesEmpresaEspecial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpresaEspecial(
			JComboBox jComboBoxTiposRelacionesEmpresaEspecial) {
		this.jComboBoxTiposRelacionesEmpresaEspecial = jComboBoxTiposRelacionesEmpresaEspecial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpresaEspecial(
			JComboBox jComboBoxTiposAccionesEmpresaEspecial) {
		this.jComboBoxTiposAccionesEmpresaEspecial = jComboBoxTiposAccionesEmpresaEspecial;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpresaEspecial() {
		return this.jComboBoxTiposAccionesFormularioEmpresaEspecial;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpresaEspecial(
			JComboBox jComboBoxTiposAccionesFormularioEmpresaEspecial) {
		this.jComboBoxTiposAccionesFormularioEmpresaEspecial = jComboBoxTiposAccionesFormularioEmpresaEspecial;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		
		this.empresaespecialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaespecialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empresaespecialSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpresaEspecialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empresa Especial MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpresaEspecialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpresaEspecial= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpresaEspecial=new JButtonMe();
				this.jButtonModificarToolBarEmpresaEspecial=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial,
							"actualizar","actualizar","Actualizar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial,
							"eliminar","eliminar","Eliminar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial,
							"cancelar","cancelar","Cancelar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpresaEspecial=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpresaEspecial=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpresaEspecial=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpresaEspecial=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpresaEspecial=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpresaEspecial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpresaEspecial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpresaEspecial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpresaEspecial= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpresaEspecial.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpresaEspecial,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpresaEspecial= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpresaEspecial.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpresaEspecial,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpresaEspecial= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpresaEspecial.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpresaEspecial,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpresaEspecial= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpresaEspecial.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpresaEspecial,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpresaEspecial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpresaEspecial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpresaEspecial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpresaEspecial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpresaEspecial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpresaEspecial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpresaEspecial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpresaEspecial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpresaEspecial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpresaEspecial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpresaEspecial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpresaEspecial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpresaEspecial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpresaEspecial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpresaEspecial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpresaEspecial.add(this.jMenuItemDetalleCerrarEmpresaEspecial);
		
		this.jmenuDetalleAccionesEmpresaEspecial.add(this.jMenuItemActualizarEmpresaEspecial);
		this.jmenuDetalleAccionesEmpresaEspecial.add(this.jMenuItemEliminarEmpresaEspecial);
		this.jmenuDetalleAccionesEmpresaEspecial.add(this.jMenuItemCancelarEmpresaEspecial);		
		
		//this.jmenuDetalleDatosEmpresaEspecial.add(this.jMenuItemDetalleAbrirOrderByEmpresaEspecial);				
		this.jmenuDetalleDatosEmpresaEspecial.add(this.jMenuItemDetalleMostarOcultarEmpresaEspecial);				
				
		//this.jmenuDetalleAccionesEmpresaEspecial.add(this.jMenuItemGuardarCambiosEmpresaEspecial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpresaEspecial.add(this.jmenuDetalleArchivoEmpresaEspecial);		
		this.jmenuBarDetalleEmpresaEspecial.add(this.jmenuDetalleAccionesEmpresaEspecial);		
		this.jmenuBarDetalleEmpresaEspecial.add(this.jmenuDetalleDatosEmpresaEspecial);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpresaEspecial);				
	}
	
	
	public void inicializarElementosCamposEmpresaEspecial() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpresaEspecial = new JLabelMe();
		jLabelIdEmpresaEspecial.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpresaEspecial = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpresaEspecial.setToolTipText(EmpresaEspecialConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpresaEspecial= new GridBagLayout();

		this.jPanelidEmpresaEspecial.setLayout(this.gridaBagLayoutEmpresaEspecial);

		jLabelidEmpresaEspecial = new JLabel();
		jLabelidEmpresaEspecial.setText("Id");

		jLabelidEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_resolucionEmpresaEspecial = new JLabelMe();
		this.jLabelnumero_resolucionEmpresaEspecial.setText(""+EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION+" : *");
		this.jLabelnumero_resolucionEmpresaEspecial.setToolTipText("Numero Resolucion");
		this.jLabelnumero_resolucionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_resolucionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_resolucionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_resolucionEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_resolucionEmpresaEspecial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_resolucionEmpresaEspecial.setToolTipText(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION);
		this.gridaBagLayoutEmpresaEspecial = new GridBagLayout();
		this.jPanelnumero_resolucionEmpresaEspecial.setLayout(this.gridaBagLayoutEmpresaEspecial);


		jTextFieldnumero_resolucionEmpresaEspecial= new JTextFieldMe();

		jTextFieldnumero_resolucionEmpresaEspecial.setEnabled(false);
		jTextFieldnumero_resolucionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_resolucionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_resolucionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_resolucionEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_resolucionEmpresaEspecialBusqueda= new JButtonMe();
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setText("U");
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_resolucionEmpresaEspecialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_resolucionEmpresaEspecial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_resolucionEmpresaEspecial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_resolucionEmpresaEspecialBusqueda"));

		if(this.empresaespecialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_resolucionEmpresaEspecialBusqueda.setVisible(false);		}


					
		this.jLabelfecha_resolucionEmpresaEspecial = new JLabelMe();
		this.jLabelfecha_resolucionEmpresaEspecial.setText(""+EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION+" : *");
		this.jLabelfecha_resolucionEmpresaEspecial.setToolTipText("Fecha Resolucion");
		this.jLabelfecha_resolucionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_resolucionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_resolucionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_resolucionEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_resolucionEmpresaEspecial=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_resolucionEmpresaEspecial.setToolTipText(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION);
		this.gridaBagLayoutEmpresaEspecial = new GridBagLayout();
		this.jPanelfecha_resolucionEmpresaEspecial.setLayout(this.gridaBagLayoutEmpresaEspecial);


		//jFormattedTextFieldfecha_resolucionEmpresaEspecial= new JFormattedTextFieldMe();

		jDateChooserfecha_resolucionEmpresaEspecial= new JDateChooser();
		jDateChooserfecha_resolucionEmpresaEspecial.setEnabled(false);
		jDateChooserfecha_resolucionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_resolucionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_resolucionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_resolucionEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_resolucionEmpresaEspecial.setDate(new Date());
		jDateChooserfecha_resolucionEmpresaEspecial.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_resolucionEmpresaEspecial.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_resolucionEmpresaEspecialBusqueda= new JButtonMe();
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setText("U");
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_resolucionEmpresaEspecialBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_resolucionEmpresaEspecial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_resolucionEmpresaEspecial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_resolucionEmpresaEspecialBusqueda"));

		if(this.empresaespecialSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_resolucionEmpresaEspecialBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpresaEspecial() {
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
		//this.jInternalFrameDetalleEmpresaEspecial = new EmpresaEspecialBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empresa Especial DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpresaEspecial= new GridBagLayout();
		

		
		String sToolTipEmpresaEspecial="";
		sToolTipEmpresaEspecial=EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpresaEspecial+="(Contabilidad.EmpresaEspecial)";
		}
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpresaEspecial+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpresaEspecial = new JButtonMe();
		this.jButtonModificarEmpresaEspecial = new JButtonMe();
        this.jButtonActualizarEmpresaEspecial = new JButtonMe();
        this.jButtonEliminarEmpresaEspecial = new JButtonMe();
        this.jButtonCancelarEmpresaEspecial = new JButtonMe();
        this.jButtonGuardarCambiosEmpresaEspecial = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpresaEspecial = new JButtonMe();
		this.jButtonCerrarEmpresaEspecial = new JButtonMe();
		
		this.jScrollPanelDatosEmpresaEspecial = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpresaEspecial = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpresaEspecial = new JScrollPane();
				
		
		
		this.jPanelCamposEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empresa Especial";
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpresaEspecial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpresaEspecial.setName("jPanelCamposEmpresaEspecial"); 

		this.jPanelCamposOcultosEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpresaEspecial.setName("jPanelCamposOcultosEmpresaEspecial"); 

        this.jPanelAccionesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpresaEspecial.setToolTipText("Acciones");
        this.jPanelAccionesEmpresaEspecial.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpresaEspecial.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpresaEspecial.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpresaEspecial.setText("Nuevo");
		this.jButtonModificarEmpresaEspecial.setText("Editar");
        this.jButtonActualizarEmpresaEspecial.setText("Actualizar");
        this.jButtonEliminarEmpresaEspecial.setText("Eliminar");
        this.jButtonCancelarEmpresaEspecial.setText("Cancelar");
        this.jButtonGuardarCambiosEmpresaEspecial.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpresaEspecial.setText("Guardar");
		this.jButtonCerrarEmpresaEspecial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpresaEspecial,"nuevo_button","Nuevo",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpresaEspecial,"modificar_button","Editar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpresaEspecial,"actualizar_button","Actualizar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpresaEspecial,"eliminar_button","Eliminar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpresaEspecial,"cancelar_button","Cancelar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpresaEspecial,"guardarcambios_button","Guardar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpresaEspecial,"guardarcambiostabla_button","Guardar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpresaEspecial,"cerrar_button","Salir",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpresaEspecial.setToolTipText("Nuevo"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpresaEspecial.setToolTipText("Editar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpresaEspecial.setToolTipText("Actualizar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpresaEspecial.setToolTipText("Eliminar)"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpresaEspecial.setToolTipText("Cancelar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpresaEspecial.setToolTipText("Guardar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpresaEspecial.setToolTipText("Guardar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpresaEspecial.setToolTipText("Salir"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpresaEspecial";
		inputMap = this.jButtonNuevoEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpresaEspecial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpresaEspecial"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpresaEspecial";
		inputMap = this.jButtonActualizarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpresaEspecial"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpresaEspecial";
		inputMap = this.jButtonEliminarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpresaEspecial"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpresaEspecial";
		inputMap = this.jButtonCancelarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpresaEspecial"));
		
		//CERRAR		
		sMapKey = "CerrarEmpresaEspecial";
		inputMap = this.jButtonCerrarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpresaEspecial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpresaEspecial";
		inputMap = this.jButtonGuardarCambiosTablaEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpresaEspecial"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpresaEspecial = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpresaEspecial.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpresaEspecial.setToolTipText("Nuevo EmpresaEspecial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpresaEspecial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpresaEspecial.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpresaEspecial.setToolTipText("Sin Cerrar Ventana EmpresaEspecial");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpresaEspecial = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpresaEspecial.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpresaEspecial.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpresaEspecial.setText("Accion");
		this.jComboBoxTiposAccionesEmpresaEspecial.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpresaEspecial.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpresaEspecial.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpresaEspecial = new JLabelMe();
		
		this.jLabelAccionesEmpresaEspecial.setText("Acciones");		
		this.jLabelAccionesEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpresaEspecial();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpresaEspecial();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpresaEspecial=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpresaEspecial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresaEspecial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresaEspecial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpresaEspecial.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpresaEspecial.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpresaEspecial.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpresaEspecial = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpresaEspecial = new GridBagLayout();
		
		this.jPanelCamposEmpresaEspecial.setLayout(gridaBagLayoutCamposEmpresaEspecial);
		this.jPanelCamposOcultosEmpresaEspecial.setLayout(gridaBagLayoutCamposOcultosEmpresaEspecial);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpresaEspecial.add(jLabelIdEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 1;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpresaEspecial.add(jLabelidEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);


	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_resolucionEmpresaEspecial.add(jLabelnumero_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		//this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;
		this.gridBagConstraintsEmpresaEspecial.gridx = 2;
		this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
		this.gridBagConstraintsEmpresaEspecial.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_resolucionEmpresaEspecial.add(jButtonnumero_resolucionEmpresaEspecialBusqueda, this.gridBagConstraintsEmpresaEspecial);
	}

	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 1;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_resolucionEmpresaEspecial.add(jTextFieldnumero_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);


	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_resolucionEmpresaEspecial.add(jLabelfecha_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		//this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;
		this.gridBagConstraintsEmpresaEspecial.gridx = 2;
		this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
		this.gridBagConstraintsEmpresaEspecial.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_resolucionEmpresaEspecial.add(jButtonfecha_resolucionEmpresaEspecialBusqueda, this.gridBagConstraintsEmpresaEspecial);
	}

	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresaEspecial.gridy = 0;
	this.gridBagConstraintsEmpresaEspecial.gridx = 1;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_resolucionEmpresaEspecial.add(jDateChooserfecha_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresaEspecial.gridy = iYPanelCamposEmpresaEspecial;
	this.gridBagConstraintsEmpresaEspecial.gridx = iXPanelCamposEmpresaEspecial++;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpresaEspecial.add(this.jPanelidEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	if(iXPanelCamposEmpresaEspecial % 1==0) {
		iXPanelCamposEmpresaEspecial=0;
		iYPanelCamposEmpresaEspecial++;
	}
	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresaEspecial.gridy = iYPanelCamposEmpresaEspecial;
	this.gridBagConstraintsEmpresaEspecial.gridx = iXPanelCamposEmpresaEspecial++;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpresaEspecial.add(this.jPanelnumero_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	if(iXPanelCamposEmpresaEspecial % 1==0) {
		iXPanelCamposEmpresaEspecial=0;
		iYPanelCamposEmpresaEspecial++;
	}
	this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresaEspecial.gridy = iYPanelCamposEmpresaEspecial;
	this.gridBagConstraintsEmpresaEspecial.gridx = iXPanelCamposEmpresaEspecial++;
	this.gridBagConstraintsEmpresaEspecial.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresaEspecial.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpresaEspecial.add(this.jPanelfecha_resolucionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);



	if(iXPanelCamposEmpresaEspecial % 1==0) {
		iXPanelCamposEmpresaEspecial=0;
		iYPanelCamposEmpresaEspecial++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpresaEspecial= new GridBagLayout();
		this.jPanelAccionesEmpresaEspecial.setLayout(gridaBagLayoutAccionesEmpresaEspecial);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpresaEspecial= new GridBagLayout();
		this.jPanelAccionesFormularioEmpresaEspecial.setLayout(gridaBagLayoutAccionesFormularioEmpresaEspecial);
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpresaEspecial.add(this.jComboBoxTiposAccionesFormularioEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);

		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpresaEspecial.add(this.jCheckBoxPostAccionNuevoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpresaEspecial.add(this.jCheckBoxPostAccionSinCerrarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpresaEspecial.add(this.jCheckBoxPostAccionSinMensajeEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonModificarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);							

		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;
		this.gridBagConstraintsEmpresaEspecial.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonEliminarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonActualizarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);


		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonGuardarCambiosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);	
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;		
		this.gridBagConstraintsEmpresaEspecial.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonCancelarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpresaEspecial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpresaEspecial);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();						
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;		
			//this.gridBagConstraintsEmpresaEspecial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpresaEspecial.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpresaEspecial.gridx =0;
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpresaEspecial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpresaEspecial = new EmpresaEspecialBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empresa Especial DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empresa Especial DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empresa Especial Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpresaEspecialModel empresaespecialModel=new EmpresaEspecialModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpresaEspecialModel.EmpresaEspecialFocusTraversalPolicy empresaespecialFocusTraversalPolicy = empresaespecialModel.new EmpresaEspecialFocusTraversalPolicy(this);
			
			//empresaespecialFocusTraversalPolicy.setempresaespecialJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empresaespecialModel);
			
			
			this.jContentPaneDetalleEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpresaEspecial = new GridBagLayout();	
			this.jContentPaneDetalleEmpresaEspecial.setLayout(gridaBagLayoutDetalleEmpresaEspecial);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpresaEspecial = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
				this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpresaEspecial.gridx = 0;
					
				
				this.jContentPaneDetalleEmpresaEspecial.add(jTtoolBarDetalleEmpresaEspecial, gridBagConstraintsEmpresaEspecial);								
				
}
			
			this.jScrollPanelDatosEdicionEmpresaEspecial=   new JScrollPane(jContentPaneDetalleEmpresaEspecial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpresaEspecial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresaEspecial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresaEspecial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpresaEspecial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpresaEspecial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresaEspecial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresaEspecial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	        
			this.jContentPaneDetalleEmpresaEspecial.add(jPanelCamposEmpresaEspecial, gridBagConstraintsEmpresaEspecial);
			
			
			
			
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
						&& empresaespecialSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpresaEspecial= new GridBagConstraints();
						this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpresaEspecial.gridx = 0;
						this.jContentPaneDetalleEmpresaEspecial.add(this.jTabbedPaneRelacionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpresaEspecial.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpresaEspecial.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
					this.gridBagConstraintsEmpresaEspecial.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpresaEspecial.gridx = 0;
					
				
					this.jContentPaneDetalleEmpresaEspecial.add(jPanelCamposOcultosEmpresaEspecial, gridBagConstraintsEmpresaEspecial);
				
					this.jPanelCamposOcultosEmpresaEspecial.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	        this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpresaEspecial.add(this.jPanelAccionesFormularioEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);							
			
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
	        this.gridBagConstraintsEmpresaEspecial.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpresaEspecial.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpresaEspecial.add(this.jPanelAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpresaEspecial);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpresaEspecial=   new JScrollPane(this.jPanelCamposEmpresaEspecial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpresaEspecial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresaEspecial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresaEspecial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpresaEspecial.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpresaEspecial;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpresaEspecial;
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
