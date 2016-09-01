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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import java.sql.Time;


import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.puntoventa.util.CajeroTurnoConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajeroTurnoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajeroTurnoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajeroTurnoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajeroTurnoBeanSwingJInternalFrame extends CajeroTurnoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajeroTurnoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajeroTurno> cajeroturnoValidator = new ClassValidator<CajeroTurno>(CajeroTurno.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajeroTurno cajeroturno;	
	public CajeroTurno cajeroturnoAux;
	public CajeroTurno cajeroturnoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajeroTurno cajeroturnoTotales;
	public Long idCajeroTurnoActual;
	public Long iIdNuevoCajeroTurno=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
	}

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
	}

	public String sFinalQueryComboMesa="";

	public List<Mesa> mesasForeignKey;

	public List<Mesa> getmesasForeignKey() {
		return mesasForeignKey;
	}

	public void setmesasForeignKey(List<Mesa> mesasForeignKey) {
		this.mesasForeignKey = mesasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mesa mesaForeignKey;

	public Mesa getmesaForeignKey() {
		return mesaForeignKey;
	}

	public void setmesaForeignKey(Mesa mesaForeignKey) {
		this.mesaForeignKey = mesaForeignKey;
	}

	public String sFinalQueryComboTurnoPunVen="";

	public List<TurnoPunVen> turnopunvensForeignKey;

	public List<TurnoPunVen> getturnopunvensForeignKey() {
		return turnopunvensForeignKey;
	}

	public void setturnopunvensForeignKey(List<TurnoPunVen> turnopunvensForeignKey) {
		this.turnopunvensForeignKey = turnopunvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TurnoPunVen turnopunvenForeignKey;

	public TurnoPunVen getturnopunvenForeignKey() {
		return turnopunvenForeignKey;
	}

	public void setturnopunvenForeignKey(TurnoPunVen turnopunvenForeignKey) {
		this.turnopunvenForeignKey = turnopunvenForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoCajeroTurno;
	public Boolean isPermisoNuevoCajeroTurno;
	public Boolean isPermisoActualizarCajeroTurno;
	public Boolean isPermisoActualizarOriginalCajeroTurno;
	public Boolean isPermisoEliminarCajeroTurno;
	public Boolean isPermisoGuardarCambiosCajeroTurno;
	public Boolean isPermisoConsultaCajeroTurno;
	public Boolean isPermisoBusquedaCajeroTurno;
	public Boolean isPermisoReporteCajeroTurno;
	public Boolean isPermisoPaginacionMedioCajeroTurno;
	public Boolean isPermisoPaginacionAltoCajeroTurno;
	public Boolean isPermisoPaginacionTodoCajeroTurno;
	public Boolean isPermisoCopiarCajeroTurno;
	public Boolean isPermisoVerFormCajeroTurno;
	public Boolean isPermisoDuplicarCajeroTurno;
	public Boolean isPermisoOrdenCajeroTurno;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public CajeroTurnoParameterReturnGeneral cajeroturnoReturnGeneral;
	public CajeroTurnoParameterReturnGeneral cajeroturnoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajeroTurno=false;
	public Boolean esParaAccionDesdeFormularioCajeroTurno=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajeroTurnoSessionBeanAdditional cajeroturnoSessionBeanAdditional=null;
	
	public CajeroTurnoSessionBeanAdditional getCajeroTurnoSessionBeanAdditional() {
		return this.cajeroturnoSessionBeanAdditional;
	}
	
	public void setCajeroTurnoSessionBeanAdditional(CajeroTurnoSessionBeanAdditional cajeroturnoSessionBeanAdditional) {
		try {
			this.cajeroturnoSessionBeanAdditional=cajeroturnoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajeroTurnoBeanSwingJInternalFrameAdditional cajeroturnoBeanSwingJInternalFrameAdditional=null;
	//public class CajeroTurnoBeanSwingJInternalFrame
	
	public CajeroTurnoBeanSwingJInternalFrameAdditional getCajeroTurnoBeanSwingJInternalFrameAdditional() {
		return this.cajeroturnoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajeroTurnoBeanSwingJInternalFrameAdditional(CajeroTurnoBeanSwingJInternalFrameAdditional cajeroturnoBeanSwingJInternalFrameAdditional) {
		try {
			this.cajeroturnoBeanSwingJInternalFrameAdditional=cajeroturnoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajeroTurnoLogic cajeroturnoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajeroTurno cajeroturnoBean;
	public CajeroTurnoConstantesFunciones cajeroturnoConstantesFunciones;
	//public CajeroTurnoParameterReturnGeneral cajeroturnoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public VendedorLogic vendedorLogic;
	public CajaLogic cajaLogic;
	public MesaLogic mesaLogic;
	public TurnoPunVenLogic turnopunvenLogic;
	
	//PARAMETROS
	
	
	//public List<CajeroTurno> cajeroturnos;	
	//public List<CajeroTurno> cajeroturnosEliminados;
	//public List<CajeroTurno> cajeroturnosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajeroTurno=false;
	public Boolean isVisibilidadCeldaDuplicarCajeroTurno=true;
	public Boolean isVisibilidadCeldaCopiarCajeroTurno=true;
	public Boolean isVisibilidadCeldaVerFormCajeroTurno=true;
	public Boolean isVisibilidadCeldaOrdenCajeroTurno=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
	public Boolean isVisibilidadCeldaModificarCajeroTurno=false;
	public Boolean isVisibilidadCeldaActualizarCajeroTurno=false;
	public Boolean isVisibilidadCeldaEliminarCajeroTurno=false;
	public Boolean isVisibilidadCeldaCancelarCajeroTurno=false;
	public Boolean isVisibilidadCeldaGuardarCajeroTurno=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajeroTurno=false;	
	
	
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMesa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTurnoPunVen=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoCajeroTurno() {
		return this.iIdNuevoCajeroTurno;
	}

	public void setiIdNuevoCajeroTurno(Long iIdNuevoCajeroTurno) {
		this.iIdNuevoCajeroTurno = iIdNuevoCajeroTurno;
	}
	
	public Long getidCajeroTurnoActual() {
		return this.idCajeroTurnoActual;
	}

	public void setidCajeroTurnoActual(Long idCajeroTurnoActual) {
		this.idCajeroTurnoActual = idCajeroTurnoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajeroTurno getcajeroturno() {
		return this.cajeroturno;
	}

	public void setcajeroturno(CajeroTurno cajeroturno) {
		this.cajeroturno = cajeroturno;
	}
	
	public CajeroTurno getcajeroturnoAux() {
		return this.cajeroturnoAux;
	}

	public void setcajeroturnoAux(CajeroTurno cajeroturnoAux) {
		this.cajeroturnoAux = cajeroturnoAux;
	}				
	
	public CajeroTurno getcajeroturnoAnterior() {
		return this.cajeroturnoAnterior;
	}

	public void setcajeroturnoAnterior(CajeroTurno cajeroturnoAnterior) {
		this.cajeroturnoAnterior = cajeroturnoAnterior;
	}	
	
	public CajeroTurno getcajeroturnoTotales() {
		return this.cajeroturnoTotales;
	}

	public void setcajeroturnoTotales(CajeroTurno cajeroturnoTotales) {
		this.cajeroturnoTotales = cajeroturnoTotales;
	}	
	
	public CajeroTurno getcajeroturnoBean() {
		return this.cajeroturnoBean;
	}

	public void setcajeroturnoBean(CajeroTurno cajeroturnoBean) {
		this.cajeroturnoBean = cajeroturnoBean;
	}	
	
	public CajeroTurnoParameterReturnGeneral getcajeroturnoReturnGeneral() {
		return this.cajeroturnoReturnGeneral;
	}

	public void setcajeroturnoReturnGeneral(CajeroTurnoParameterReturnGeneral cajeroturnoReturnGeneral) {
		this.cajeroturnoReturnGeneral = cajeroturnoReturnGeneral;
	}	
	
	
	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesaFK_IdMesa=-1L;

	public Long getid_mesaFK_IdMesa() {
		return this.id_mesaFK_IdMesa;
	}

	public void setid_mesaFK_IdMesa(Long id_mesaFK_IdMesa) {
		this.id_mesaFK_IdMesa = id_mesaFK_IdMesa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_turno_pun_venFK_IdTurnoPunVen=-1L;

	public Long getid_turno_pun_venFK_IdTurnoPunVen() {
		return this.id_turno_pun_venFK_IdTurnoPunVen;
	}

	public void setid_turno_pun_venFK_IdTurnoPunVen(Long id_turno_pun_venFK_IdTurnoPunVen) {
		this.id_turno_pun_venFK_IdTurnoPunVen = id_turno_pun_venFK_IdTurnoPunVen;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CajeroTurnoLogic getCajeroTurnoLogic()	{		
		return cajeroturnoLogic;
	}

	public void setCajeroTurnoLogic(CajeroTurnoLogic cajeroturnoLogic) {
		this.cajeroturnoLogic = cajeroturnoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoCajeroTurno() {
		return isEsNuevoCajeroTurno;
	}

	public void setIsEsNuevoCajeroTurno(Boolean isEsNuevoCajeroTurno) {
		this.isEsNuevoCajeroTurno = isEsNuevoCajeroTurno;
	}

	public Boolean getEsParaAccionDesdeFormularioCajeroTurno() {
		return esParaAccionDesdeFormularioCajeroTurno;
	}
	
	public void setEsParaAccionDesdeFormularioCajeroTurno(Boolean esParaAccionDesdeFormularioCajeroTurno) {
		this.esParaAccionDesdeFormularioCajeroTurno = esParaAccionDesdeFormularioCajeroTurno;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosMesasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesasForeignKey=new ArrayList<Mesa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesaLogic mesaLogic=new MesaLogic();

			//mesaLogic.getMesaDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionMesa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesaLogic.getMesaDataAccess().setIsForForeingKeyData(true);

					mesaLogic.getTodosMesasWithConnection(sFinalQuery,new Pagination());

					this.mesasForeignKey=mesaLogic.getMesas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesaLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidMesaActual());
					this.mesasForeignKey.add(mesaLogic.getMesa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTurnoPunVensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TurnoPunVenLogic turnopunvenLogic=new TurnoPunVenLogic();

			//turnopunvenLogic.getTurnoPunVenDataAccess().setIsForForeingKeyData(true);

			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//turnopunvenLogic.getTurnoPunVenDataAccess().setIsForForeingKeyData(true);

					turnopunvenLogic.getTodosTurnoPunVensWithConnection(sFinalQuery,new Pagination());

					this.turnopunvensForeignKey=turnopunvenLogic.getTurnoPunVens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTurnoPunVen(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnopunvenLogic.getEntityWithConnection(cajeroturnoSessionBean.getlidTurnoPunVenActual());
					this.turnopunvensForeignKey.add(turnopunvenLogic.getTurnoPunVen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajeroTurno.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCajeroTurnoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajeroTurnoGenerico!=null && jComboBoxid_empresaCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajeroTurno.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalCajeroTurnoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajeroTurnoGenerico!=null && jComboBoxid_sucursalCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioCajeroTurno.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioCajeroTurnoGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioCajeroTurnoGenerico!=null && jComboBoxid_usuarioCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_usuarioCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorCajeroTurno.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorFK_IdVendedorCajeroTurno!=null) {
						jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorFK_IdVendedorCajeroTurno!=null) {
							//jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorFK_IdVendedorCajeroTurno.getItemCount()>0) {
								jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorCajeroTurnoGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorCajeroTurnoGenerico!=null && jComboBoxid_vendedorCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_vendedorCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajeroTurno.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaFK_IdCajaCajeroTurno!=null) {
						jComboBoxid_cajaFK_IdCajaCajeroTurno.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaFK_IdCajaCajeroTurno!=null) {
							//jComboBoxid_cajaFK_IdCajaCajeroTurno.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaFK_IdCajaCajeroTurno.getItemCount()>0) {
								jComboBoxid_cajaFK_IdCajaCajeroTurno.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaCajeroTurnoGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajeroTurnoGenerico!=null && jComboBoxid_cajaCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesaForeignKey(Long idMesaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mesa  mesaTemp=null;

			for(Mesa mesaAux:mesasForeignKey) {
				if(mesaAux.getId()!=null && mesaAux.getId().equals(idMesaSeleccionado)) {
					mesaTemp=mesaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesaTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setMesa(mesaTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setSelectedItem(mesaTemp);
					}
				} else {
					//jComboBoxid_mesaCajeroTurno.setSelectedItem(mesaTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMesa") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesaTemp!=null && jComboBoxid_mesaFK_IdMesaCajeroTurno!=null) {
						jComboBoxid_mesaFK_IdMesaCajeroTurno.setSelectedItem(mesaTemp);
					} else {
						if(jComboBoxid_mesaFK_IdMesaCajeroTurno!=null) {
							//jComboBoxid_mesaFK_IdMesaCajeroTurno.setSelectedItem(mesaTemp);
							if(jComboBoxid_mesaFK_IdMesaCajeroTurno.getItemCount()>0) {
								jComboBoxid_mesaFK_IdMesaCajeroTurno.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualMesaForeignKeyDescripcion(Long idMesaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mesa  mesaTemp=null;

			for(Mesa mesaAux:mesasForeignKey) {
				if(mesaAux.getId()!=null && mesaAux.getId().equals(idMesaSeleccionado)) {
					mesaTemp=mesaAux;
					break;
				}
			}


			sDescripcion=MesaConstantesFunciones.getMesaDescripcion(mesaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesaForeignKeyGenerico(Long idMesaSeleccionado,JComboBox jComboBoxid_mesaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Mesa  mesaTemp=null;

			for(Mesa mesaAux:mesasForeignKey) {
				if(mesaAux.getId()!=null && mesaAux.getId().equals(idMesaSeleccionado)) {
					mesaTemp=mesaAux;
					break;
				}
			}

			if(mesaTemp!=null) {
				jComboBoxid_mesaCajeroTurnoGenerico.setSelectedItem(mesaTemp);
			} else {
				if(jComboBoxid_mesaCajeroTurnoGenerico!=null && jComboBoxid_mesaCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_mesaCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTurnoPunVenForeignKey(Long idTurnoPunVenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(turnopunvenTemp!=null) {

					if(this.cajeroturno!=null) {
						this.cajeroturno.setTurnoPunVen(turnopunvenTemp);
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setSelectedItem(turnopunvenTemp);
					}
				} else {
					//jComboBoxid_turno_pun_venCajeroTurno.setSelectedItem(turnopunvenTemp);
					if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
						if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){
					if(turnopunvenTemp!=null && jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno!=null) {
						jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setSelectedItem(turnopunvenTemp);
					} else {
						if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno!=null) {
							//jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setSelectedItem(turnopunvenTemp);
							if(jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.getItemCount()>0) {
								jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTurnoPunVenForeignKeyDescripcion(Long idTurnoPunVenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}


			sDescripcion=TurnoPunVenConstantesFunciones.getTurnoPunVenDescripcion(turnopunvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTurnoPunVenForeignKeyGenerico(Long idTurnoPunVenSeleccionado,JComboBox jComboBoxid_turno_pun_venCajeroTurnoGenerico)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenTemp=null;

			for(TurnoPunVen turnopunvenAux:turnopunvensForeignKey) {
				if(turnopunvenAux.getId()!=null && turnopunvenAux.getId().equals(idTurnoPunVenSeleccionado)) {
					turnopunvenTemp=turnopunvenAux;
					break;
				}
			}

			if(turnopunvenTemp!=null) {
				jComboBoxid_turno_pun_venCajeroTurnoGenerico.setSelectedItem(turnopunvenTemp);
			} else {
				if(jComboBoxid_turno_pun_venCajeroTurnoGenerico!=null && jComboBoxid_turno_pun_venCajeroTurnoGenerico.getItemCount()>0) {
					jComboBoxid_turno_pun_venCajeroTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_empresaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajeroTurnoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajeroTurnoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajeroturno.setid_empresa(empresaAux.getId());
				cajeroturno.setempresa_descripcion(CajeroTurnoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajeroturno.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_sucursalCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajeroTurnoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajeroTurnoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajeroturno.setid_sucursal(sucursalAux.getId());
				cajeroturno.setsucursal_descripcion(CajeroTurnoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajeroturno.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_usuarioCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioCajeroTurnoGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioCajeroTurnoGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				cajeroturno.setid_usuario(usuarioAux.getId());
				cajeroturno.setusuario_descripcion(CajeroTurnoConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				cajeroturno.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_vendedorCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorCajeroTurnoGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorCajeroTurnoGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				cajeroturno.setid_vendedor(vendedorAux.getId());
				cajeroturno.setvendedor_descripcion(CajeroTurnoConstantesFunciones.getVendedorDescripcion(vendedorAux));
				cajeroturno.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_cajaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajeroTurnoGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajeroTurnoGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajeroturno.setid_caja(cajaAux.getId());
				cajeroturno.setcaja_descripcion(CajeroTurnoConstantesFunciones.getCajaDescripcion(cajaAux));
				cajeroturno.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesaForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_mesaCajeroTurnoGenerico)throws Exception
	{
		try
		{
			Mesa  mesaAux=new Mesa();

			if(jComboBoxid_mesaCajeroTurnoGenerico==null) {
				mesaAux=(Mesa)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.getSelectedItem();
			} else {
				mesaAux=(Mesa)jComboBoxid_mesaCajeroTurnoGenerico.getSelectedItem();
			}

			if(mesaAux!=null && mesaAux.getId()!=null) {
				cajeroturno.setid_mesa(mesaAux.getId());
				cajeroturno.setmesa_descripcion(CajeroTurnoConstantesFunciones.getMesaDescripcion(mesaAux));
				cajeroturno.setMesa(mesaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTurnoPunVenForeignKey(CajeroTurno cajeroturno,JComboBox jComboBoxid_turno_pun_venCajeroTurnoGenerico)throws Exception
	{
		try
		{
			TurnoPunVen  turnopunvenAux=new TurnoPunVen();

			if(jComboBoxid_turno_pun_venCajeroTurnoGenerico==null) {
				turnopunvenAux=(TurnoPunVen)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.getSelectedItem();
			} else {
				turnopunvenAux=(TurnoPunVen)jComboBoxid_turno_pun_venCajeroTurnoGenerico.getSelectedItem();
			}

			if(turnopunvenAux!=null && turnopunvenAux.getId()!=null) {
				cajeroturno.setid_turno_pun_ven(turnopunvenAux.getId());
				cajeroturno.setturnopunven_descripcion(CajeroTurnoConstantesFunciones.getTurnoPunVenDescripcion(turnopunvenAux));
				cajeroturno.setTurnoPunVen(turnopunvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.addItem(vendedor);
							}
						}

						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajeroTurno.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaFK_IdCajaCajeroTurno.addItem(caja);
							}
						}

						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMesa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.removeAllItems();

							for(Mesa mesa:this.mesasForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.addItem(mesa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMesa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesaFK_IdMesaCajeroTurno.removeAllItems();

							for(Mesa mesa:this.mesasForeignKey) {
								this.jComboBoxid_mesaFK_IdMesaCajeroTurno.addItem(mesa);
							}
						}

						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTurnoPunVensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTurnoPunVen=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.addItem(turnopunven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajeroTurno!=null) { 
					}

					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTurnoPunVen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.removeAllItems();

							for(TurnoPunVen turnopunven:this.turnopunvensForeignKey) {
								this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.addItem(turnopunven);
							}
						}

						if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaFK_IdCajaCajeroTurno.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajeroTurno.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesaForeignKey(Mesa mesa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setSelectedItem(mesa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesaFK_IdMesaCajeroTurno.setSelectedItem(mesa);
						} else {
							this.jComboBoxid_mesaFK_IdMesaCajeroTurno.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTurnoPunVenForeignKey(TurnoPunVen turnopunven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setSelectedItem(turnopunven);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setSelectedItem(turnopunven);
						} else {
							this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajeroTurno() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajeroTurnoConstantesFunciones.refrescarForeignKeysDescripcionesCajeroTurno(this.cajeroturnoLogic.getCajeroTurnos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajeroTurnoConstantesFunciones.refrescarForeignKeysDescripcionesCajeroTurno(this.cajeroturnos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Caja.class));
		classes.add(new Classe(Mesa.class));
		classes.add(new Classe(TurnoPunVen.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cajeroturnoLogic.setCajeroTurnos(this.cajeroturnos);
			cajeroturnoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public CajeroTurnoParameterReturnGeneral getCajeroTurnoParameterGeneral() {
		return this.cajeroturnoParameterGeneral;
	}
	
	public void setCajeroTurnoParameterGeneral(CajeroTurnoParameterReturnGeneral cajeroturnoParameterGeneral) {
		this.cajeroturnoParameterGeneral = cajeroturnoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoCajeroTurno() {
		return isPermisoTodoCajeroTurno;
	}

	public void setIsPermisoTodoCajeroTurno(Boolean isPermisoTodoCajeroTurno) {
		this.isPermisoTodoCajeroTurno = isPermisoTodoCajeroTurno;
	}

	public Boolean getIsPermisoNuevoCajeroTurno() {
		return isPermisoNuevoCajeroTurno;
	}

	public void setIsPermisoNuevoCajeroTurno(Boolean isPermisoNuevoCajeroTurno) {
		this.isPermisoNuevoCajeroTurno = isPermisoNuevoCajeroTurno;
	}

	public Boolean getIsPermisoActualizarCajeroTurno() {
		return isPermisoActualizarCajeroTurno;
	}

	public void setIsPermisoActualizarCajeroTurno(Boolean isPermisoActualizarCajeroTurno) {
		this.isPermisoActualizarCajeroTurno = isPermisoActualizarCajeroTurno;
	}

	public Boolean getIsPermisoEliminarCajeroTurno() {
		return isPermisoEliminarCajeroTurno;
	}

	public void setIsPermisoEliminarCajeroTurno(Boolean isPermisoEliminarCajeroTurno) {
		this.isPermisoEliminarCajeroTurno = isPermisoEliminarCajeroTurno;
	}

	public Boolean getIsPermisoGuardarCambiosCajeroTurno() {
		return isPermisoGuardarCambiosCajeroTurno;
	}

	public void setIsPermisoGuardarCambiosCajeroTurno(Boolean isPermisoGuardarCambiosCajeroTurno) {
		this.isPermisoGuardarCambiosCajeroTurno = isPermisoGuardarCambiosCajeroTurno;
	}
	
	public Boolean getIsPermisoConsultaCajeroTurno() {
		return isPermisoConsultaCajeroTurno;
	}

	public void setIsPermisoConsultaCajeroTurno(Boolean isPermisoConsultaCajeroTurno) {
		this.isPermisoConsultaCajeroTurno = isPermisoConsultaCajeroTurno;
	}

	public Boolean getIsPermisoBusquedaCajeroTurno() {
		return isPermisoBusquedaCajeroTurno;
	}

	public void setIsPermisoBusquedaCajeroTurno(Boolean isPermisoBusquedaCajeroTurno) {
		this.isPermisoBusquedaCajeroTurno = isPermisoBusquedaCajeroTurno;
	}

	public Boolean getIsPermisoReporteCajeroTurno() {
		return isPermisoReporteCajeroTurno;
	}

	public void setIsPermisoReporteCajeroTurno(Boolean isPermisoReporteCajeroTurno) {
		this.isPermisoReporteCajeroTurno = isPermisoReporteCajeroTurno;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajeroTurno() {
		return isPermisoPaginacionMedioCajeroTurno;
	}

	public void setIsPermisoPaginacionMedioCajeroTurno(Boolean isPermisoPaginacionMedioCajeroTurno) {
		this.isPermisoPaginacionMedioCajeroTurno = isPermisoPaginacionMedioCajeroTurno;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajeroTurno() {
		return isPermisoPaginacionTodoCajeroTurno;
	}

	public void setIsPermisoPaginacionTodoCajeroTurno(Boolean isPermisoPaginacionTodoCajeroTurno) {
		this.isPermisoPaginacionTodoCajeroTurno = isPermisoPaginacionTodoCajeroTurno;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajeroTurno() {
		return isPermisoPaginacionAltoCajeroTurno;
	}

	public void setIsPermisoPaginacionAltoCajeroTurno(Boolean isPermisoPaginacionAltoCajeroTurno) {
		this.isPermisoPaginacionAltoCajeroTurno = isPermisoPaginacionAltoCajeroTurno;
	}
	
	public Boolean getIsPermisoCopiarCajeroTurno() {
		return isPermisoCopiarCajeroTurno;
	}

	public void setIsPermisoCopiarCajeroTurno(Boolean isPermisoCopiarCajeroTurno) {
		this.isPermisoCopiarCajeroTurno = isPermisoCopiarCajeroTurno;
	}
	
	public Boolean getIsPermisoVerFormCajeroTurno() {
		return isPermisoVerFormCajeroTurno;
	}

	public void setIsPermisoVerFormCajeroTurno(Boolean isPermisoVerFormCajeroTurno) {
		this.isPermisoVerFormCajeroTurno = isPermisoVerFormCajeroTurno;
	}
	
	public Boolean getIsPermisoDuplicarCajeroTurno() {
		return isPermisoDuplicarCajeroTurno;
	}

	public void setIsPermisoDuplicarCajeroTurno(Boolean isPermisoDuplicarCajeroTurno) {
		this.isPermisoDuplicarCajeroTurno = isPermisoDuplicarCajeroTurno;
	}
	
	public Boolean getIsPermisoOrdenCajeroTurno() {
		return isPermisoOrdenCajeroTurno;
	}

	public void setIsPermisoOrdenCajeroTurno(Boolean isPermisoOrdenCajeroTurno) {
		this.isPermisoOrdenCajeroTurno = isPermisoOrdenCajeroTurno;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoCajeroTurno() {
		return isVisibilidadCeldaNuevoCajeroTurno;
	}

	public void setIsVisibilidadCeldaNuevoCajeroTurno(Boolean isVisibilidadCeldaNuevoCajeroTurno) {
		this.isVisibilidadCeldaNuevoCajeroTurno = isVisibilidadCeldaNuevoCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajeroTurno() {
		return isVisibilidadCeldaDuplicarCajeroTurno;
	}

	public void setIsVisibilidadCeldaDuplicarCajeroTurno(Boolean isVisibilidadCeldaDuplicarCajeroTurno) {
		this.isVisibilidadCeldaDuplicarCajeroTurno = isVisibilidadCeldaDuplicarCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajeroTurno() {
		return isVisibilidadCeldaCopiarCajeroTurno;
	}

	public void setIsVisibilidadCeldaCopiarCajeroTurno(Boolean isVisibilidadCeldaCopiarCajeroTurno) {
		this.isVisibilidadCeldaCopiarCajeroTurno = isVisibilidadCeldaCopiarCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajeroTurno() {
		return isVisibilidadCeldaVerFormCajeroTurno;
	}

	public void setIsVisibilidadCeldaVerFormCajeroTurno(Boolean isVisibilidadCeldaVerFormCajeroTurno) {
		this.isVisibilidadCeldaVerFormCajeroTurno = isVisibilidadCeldaVerFormCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajeroTurno() {
		return isVisibilidadCeldaOrdenCajeroTurno;
	}

	public void setIsVisibilidadCeldaOrdenCajeroTurno(Boolean isVisibilidadCeldaOrdenCajeroTurno) {
		this.isVisibilidadCeldaOrdenCajeroTurno = isVisibilidadCeldaOrdenCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajeroTurno() {
		return isVisibilidadCeldaNuevoRelacionesCajeroTurno;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajeroTurno(Boolean isVisibilidadCeldaNuevoRelacionesCajeroTurno) {
		this.isVisibilidadCeldaNuevoRelacionesCajeroTurno = isVisibilidadCeldaNuevoRelacionesCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajeroTurno() {
		return isVisibilidadCeldaModificarCajeroTurno;
	}

	public void setIsVisibilidadCeldaModificarCajeroTurno(Boolean isVisibilidadCeldaModificarCajeroTurno) {
		this.isVisibilidadCeldaModificarCajeroTurno = isVisibilidadCeldaModificarCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajeroTurno() {
		return isVisibilidadCeldaActualizarCajeroTurno;
	}

	public void setIsVisibilidadCeldaActualizarCajeroTurno(Boolean isVisibilidadCeldaActualizarCajeroTurno) {
		this.isVisibilidadCeldaActualizarCajeroTurno = isVisibilidadCeldaActualizarCajeroTurno;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajeroTurno() {
		return isVisibilidadCeldaEliminarCajeroTurno;
	}

	public void setIsVisibilidadCeldaEliminarCajeroTurno(Boolean isVisibilidadCeldaEliminarCajeroTurno) {
		this.isVisibilidadCeldaEliminarCajeroTurno = isVisibilidadCeldaEliminarCajeroTurno;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajeroTurno() {
		return isVisibilidadCeldaCancelarCajeroTurno;
	}

	public void setIsVisibilidadCeldaCancelarCajeroTurno(Boolean isVisibilidadCeldaCancelarCajeroTurno) {
		this.isVisibilidadCeldaCancelarCajeroTurno = isVisibilidadCeldaCancelarCajeroTurno;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajeroTurno() {
		return isVisibilidadCeldaGuardarCajeroTurno;
	}

	public void setIsVisibilidadCeldaGuardarCajeroTurno(Boolean isVisibilidadCeldaGuardarCajeroTurno) {
		this.isVisibilidadCeldaGuardarCajeroTurno = isVisibilidadCeldaGuardarCajeroTurno;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajeroTurno() {
		return isVisibilidadCeldaGuardarCambiosCajeroTurno;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajeroTurno(Boolean isVisibilidadCeldaGuardarCambiosCajeroTurno) {
		this.isVisibilidadCeldaGuardarCambiosCajeroTurno = isVisibilidadCeldaGuardarCambiosCajeroTurno;
	}
		
	public CajeroTurnoSessionBean getcajeroturnoSessionBean() {
		return this.cajeroturnoSessionBean;
	}
	
	public void setcajeroturnoSessionBean(CajeroTurnoSessionBean cajeroturnoSessionBean) {
		this.cajeroturnoSessionBean=cajeroturnoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMesa() {
		return this.isVisibilidadFK_IdMesa;
	}

	public void setisVisibilidadFK_IdMesa(Boolean isVisibilidadFK_IdMesa) {
		this.isVisibilidadFK_IdMesa=isVisibilidadFK_IdMesa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTurnoPunVen() {
		return this.isVisibilidadFK_IdTurnoPunVen;
	}

	public void setisVisibilidadFK_IdTurnoPunVen(Boolean isVisibilidadFK_IdTurnoPunVen) {
		this.isVisibilidadFK_IdTurnoPunVen=isVisibilidadFK_IdTurnoPunVen;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(CajeroTurno cajeroturno)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajeroturno,null);
				this.setActualParaGuardarSucursalForeignKey(cajeroturno,null);
				this.setActualParaGuardarUsuarioForeignKey(cajeroturno,null);
				this.setActualParaGuardarVendedorForeignKey(cajeroturno,null);
				this.setActualParaGuardarCajaForeignKey(cajeroturno,null);
				this.setActualParaGuardarMesaForeignKey(cajeroturno,null);
				this.setActualParaGuardarTurnoPunVenForeignKey(cajeroturno,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(CajeroTurno cajeroturno,CajeroTurno cajeroturnoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajeroTurno(cajeroturno);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajeroturnoAux.setId(cajeroturno.getId());
		cajeroturnoAux.setVersionRow(cajeroturno.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajeroTurno();
		
			int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajeroturnoValidator.getInvalidValues(this.cajeroturno);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajeroturnoLogic.setDatosCliente(datosCliente);
			cajeroturnoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajeroturnoAux=new  CajeroTurno();
				
				cajeroturnoAux.setIsNew(true);
				cajeroturnoAux.setIsChanged(true);
				
				cajeroturnoAux.setCajeroTurnoOriginal(this.cajeroturno);
				
				cajeroturnoAux.setId(this.cajeroturno.getId());	
				cajeroturnoAux.setVersionRow(this.cajeroturno.getVersionRow());	
				cajeroturnoAux.setid_empresa(this.cajeroturno.getid_empresa());	
				cajeroturnoAux.setid_sucursal(this.cajeroturno.getid_sucursal());	
				cajeroturnoAux.setid_usuario(this.cajeroturno.getid_usuario());	
				cajeroturnoAux.setid_vendedor(this.cajeroturno.getid_vendedor());	
				cajeroturnoAux.setid_caja(this.cajeroturno.getid_caja());	
				cajeroturnoAux.setid_mesa(this.cajeroturno.getid_mesa());	
				cajeroturnoAux.setid_turno_pun_ven(this.cajeroturno.getid_turno_pun_ven());	
				cajeroturnoAux.sethora_inicio(this.cajeroturno.gethora_inicio());	
				cajeroturnoAux.sethora_fin(this.cajeroturno.gethora_fin());	
				cajeroturnoAux.sethora_servicio(this.cajeroturno.gethora_servicio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajeroturnoAux,cajeroturnos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.saveCajeroTurnos();//WithConnection
						//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);
					
					this.refrescarForeignKeysDescripcionesCajeroTurno();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajeroturnoLogic.saveCajeroTurnoRelaciones(cajeroturnoAux);//WithConnection
								//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajeroturnoAux,cajeroturnos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajeroturnoAux=new  CajeroTurno();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado() 
					|| (this.cajeroturnoSessionBean.getEsGuardarRelacionado() && this.cajeroturno.getId()>=0)) {
						
					cajeroturnoAux.setIsNew(false);
				}
				
				cajeroturnoAux.setIsDeleted(false);
			
				cajeroturnoAux.setId(this.cajeroturno.getId());	
				cajeroturnoAux.setVersionRow(this.cajeroturno.getVersionRow());	
				cajeroturnoAux.setid_empresa(this.cajeroturno.getid_empresa());	
				cajeroturnoAux.setid_sucursal(this.cajeroturno.getid_sucursal());	
				cajeroturnoAux.setid_usuario(this.cajeroturno.getid_usuario());	
				cajeroturnoAux.setid_vendedor(this.cajeroturno.getid_vendedor());	
				cajeroturnoAux.setid_caja(this.cajeroturno.getid_caja());	
				cajeroturnoAux.setid_mesa(this.cajeroturno.getid_mesa());	
				cajeroturnoAux.setid_turno_pun_ven(this.cajeroturno.getid_turno_pun_ven());	
				cajeroturnoAux.sethora_inicio(this.cajeroturno.gethora_inicio());	
				cajeroturnoAux.sethora_fin(this.cajeroturno.gethora_fin());	
				cajeroturnoAux.sethora_servicio(this.cajeroturno.gethora_servicio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajeroturnoAux,cajeroturnos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.saveCajeroTurnos();//WithConnection
						//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);
					
					this.refrescarForeignKeysDescripcionesCajeroTurno();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajeroturnoLogic.saveCajeroTurnoRelaciones(cajeroturnoAux);//WithConnection
								//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajeroturnoAux,cajeroturnos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajeroturno,cajeroturnoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajeroturnoAux=new  CajeroTurno();
				
				cajeroturnoAux.setIsNew(false);
				cajeroturnoAux.setIsChanged(false);
				
				cajeroturnoAux.setIsDeleted(true);
				
				cajeroturnoAux.setId(this.cajeroturno.getId());	
				cajeroturnoAux.setVersionRow(this.cajeroturno.getVersionRow());	
				cajeroturnoAux.setid_empresa(this.cajeroturno.getid_empresa());	
				cajeroturnoAux.setid_sucursal(this.cajeroturno.getid_sucursal());	
				cajeroturnoAux.setid_usuario(this.cajeroturno.getid_usuario());	
				cajeroturnoAux.setid_vendedor(this.cajeroturno.getid_vendedor());	
				cajeroturnoAux.setid_caja(this.cajeroturno.getid_caja());	
				cajeroturnoAux.setid_mesa(this.cajeroturno.getid_mesa());	
				cajeroturnoAux.setid_turno_pun_ven(this.cajeroturno.getid_turno_pun_ven());	
				cajeroturnoAux.sethora_inicio(this.cajeroturno.gethora_inicio());	
				cajeroturnoAux.sethora_fin(this.cajeroturno.gethora_fin());	
				cajeroturnoAux.sethora_servicio(this.cajeroturno.gethora_servicio());	
				
				if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajeroturnoAux.getId()>=0) {	
						this.cajeroturnosEliminados.add(cajeroturnoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajeroturnoAux,cajeroturnos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.saveCajeroTurnos();//WithConnection
						//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajeroturnoLogic.saveCajeroTurnoRelaciones(cajeroturnoAux);//WithConnection
								//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajeroturnoAux,cajeroturnoLogic.getCajeroTurnos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajeroturnoAux,cajeroturnos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getCajeroTurnos().addAll(this.cajeroturnosEliminados);
					
					cajeroturnoLogic.saveCajeroTurnos();//WithConnection
					//cajeroturnoLogic.getSetVersionRowCajeroTurnos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajeroTurno();
				
				this.cajeroturnosEliminados= new ArrayList<CajeroTurno>();		
			}
			
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cajero Turno GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajeroturno=cajeroturnoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessCajeroTurno();
      	}
		
	}	
	
	public void actualizarRelaciones(CajeroTurno cajeroturnoLocal) throws Exception {
		
		if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajeroTurno cajeroturnoLocal) throws Exception {	
		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajeroturnoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajeroturnoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				cajeroturnoLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				cajeroturnoLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajeroturnoLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesaDetalleFormJInternalFrame.class)) {
				MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrameLocal=(MesaBeanSwingJInternalFrame) ((MesaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMesa(mesaBeanSwingJInternalFrameLocal.getmesa(),true);
				mesaBeanSwingJInternalFrameLocal.actualizarLista(mesaBeanSwingJInternalFrameLocal.mesa,this.mesasForeignKey);

				mesaBeanSwingJInternalFrameLocal.actualizarRelaciones(mesaBeanSwingJInternalFrameLocal.mesa);

				cajeroturnoLocal.setMesa(mesaBeanSwingJInternalFrameLocal.mesa);

				this.addItemDefectoCombosForeignKeyMesa();
				this.cargarCombosFrameMesasForeignKey("Formulario");
				this.setActualMesaForeignKey(mesaBeanSwingJInternalFrameLocal.mesa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TurnoPunVenDetalleFormJInternalFrame.class)) {
				TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrameLocal=(TurnoPunVenBeanSwingJInternalFrame) ((TurnoPunVenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				turnopunvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.getturnopunven(),true);
				turnopunvenBeanSwingJInternalFrameLocal.actualizarLista(turnopunvenBeanSwingJInternalFrameLocal.turnopunven,this.turnopunvensForeignKey);

				turnopunvenBeanSwingJInternalFrameLocal.actualizarRelaciones(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				cajeroturnoLocal.setTurnoPunVen(turnopunvenBeanSwingJInternalFrameLocal.turnopunven);

				this.addItemDefectoCombosForeignKeyTurnoPunVen();
				this.cargarCombosFrameTurnoPunVensForeignKey("Formulario");
				this.setActualTurnoPunVenForeignKey(turnopunvenBeanSwingJInternalFrameLocal.turnopunven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajeroTurnoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajeroturnoValidator.getInvalidValues(this.cajeroturno);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajeroTurno cajeroturno,List<CajeroTurno> cajeroturnos) throws Exception {
		try	{		
			CajeroTurnoConstantesFunciones.actualizarLista(cajeroturno,cajeroturnos,this.cajeroturnoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajeroTurno cajeroturno,List<CajeroTurno> cajeroturnos) throws Exception {
		try	{			
			CajeroTurnoConstantesFunciones.actualizarSelectedLista(cajeroturno,cajeroturnos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajeroTurno> cajeroturnosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajeroturnosLocal=this.cajeroturnoLogic.getCajeroTurnos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajeroturnosLocal=this.cajeroturnos;
			}
			//ARCHITECTURE
		
			for(CajeroTurno cajeroturnoLocal:cajeroturnosLocal) {
				if(this.permiteMantenimiento(cajeroturnoLocal) && cajeroturnoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+CajeroTurnoConstantesFunciones.getCajeroTurnoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_empresaCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_sucursalCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_usuarioCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_vendedorCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_cajaCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDMESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_mesaCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.IDTURNOPUNVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_turno_pun_venCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.HORAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_inicioCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.HORAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_finCajeroTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajeroTurnoConstantesFunciones.HORASERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_servicioCajeroTurno,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_empresaCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_sucursalCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_usuarioCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_vendedorCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_cajaCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_mesaCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelid_turno_pun_venCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_inicioCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_finCajeroTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_servicioCajeroTurno,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCajeroTurno--;	
		
		
		this.cajeroturnoAux=new CajeroTurno();
		
		this.cajeroturnoAux.setId(this.iIdNuevoCajeroTurno);
		this.cajeroturnoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajeroturnoLogic.getCajeroTurnos().add(this.cajeroturnoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajeroturnos.add(this.cajeroturnoAux);
		}
		//ARCHITECTURE
		
		this.cajeroturno=this.cajeroturnoAux;
		
		if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajeroTurno(this.cajeroturno);
			this.setVariablesObjetoActualToFormularioForeignKeyCajeroTurno(this.cajeroturno);
		}
				
		//this.setDefaultControlesCajeroTurno();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajeroTurno();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajeroTurno();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajeroTurno();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajeroTurno(this.cajeroturnoBean,this.cajeroturno,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajeroTurnoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
			classes=CajeroTurnoConstantesFunciones.getClassesRelationshipsOfCajeroTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajeroturnoReturnGeneral=cajeroturnoLogic.procesarEventosCajeroTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajeroturnoLogic.getCajeroTurnos(),this.cajeroturno,this.cajeroturnoParameterGeneral,this.isEsNuevoCajeroTurno,classes);//this.cajeroturnoLogic.getCajeroTurno()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajeroTurno(this.cajeroturnoReturnGeneral,this.cajeroturnoBean,false);
		
		if(this.cajeroturnoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno());
		}
		
		if(this.cajeroturnoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno(),classes);//this.cajeroturnoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajeroTurno();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajeroTurno();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.RecargarFormCajeroTurno(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajeroTurno(false);
						
			if(cajeroturnoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeroTurno();
			}
			
			this.actualizarVisualTableDatosCajeroTurno();
			
			this.jTableDatosCajeroTurno.setRowSelectionInterval(this.getIndiceNuevoCajeroTurno(), this.getIndiceNuevoCajeroTurno());
			
			this.seleccionarFilaTablaCajeroTurnoActual();
						
			this.actualizarEstadoCeldasBotonesCajeroTurno("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajeroTurno(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarhora_inicioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarhora_finCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarhora_servicioCajeroTurno);	
		//
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_empresaCajeroTurno);//
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_sucursalCajeroTurno);//
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_usuarioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_vendedorCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_cajaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_mesaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setEnabled(isHabilitar && this.cajeroturnoConstantesFunciones.activarid_turno_pun_venCajeroTurno);
	};
	
	public void setDefaultControlesCajeroTurno() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajeroTurno(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajeroturnoSessionBean.setConGuardarRelaciones(true);			
			this.cajeroturnoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.setVisible(true);
			
					
		} else {
			//this.cajeroturnoSessionBean.setConGuardarRelaciones(false);			
			this.cajeroturnoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajeroTurno() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
				if(cajeroturnoAux.getId().equals(this.iIdNuevoCajeroTurno)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnos) {
				if(cajeroturnoAux.getId().equals(this.iIdNuevoCajeroTurno)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualCajeroTurno(CajeroTurno cajeroturno,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
				if(cajeroturnoAux.getId().equals(cajeroturno.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnos) {
				if(cajeroturnoAux.getId().equals(cajeroturno.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalCajeroTurno(CajeroTurno cajeroturnoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
				if(cajeroturnoAux.getCajeroTurnoOriginal().getId().equals(cajeroturnoOriginal.getId())) {
					existe=true;
					cajeroturnoOriginal.setId(cajeroturnoAux.getId());
					cajeroturnoOriginal.setVersionRow(cajeroturnoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajeroTurno cajeroturnoAux:this.cajeroturnos) {
				if(cajeroturnoAux.getCajeroTurnoOriginal().getId().equals(cajeroturnoOriginal.getId())) {
					existe=true;
					cajeroturnoOriginal.setId(cajeroturnoAux.getId());
					cajeroturnoOriginal.setVersionRow(cajeroturnoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajeroTurno(Boolean esParaCancelar) throws Exception {
		cajeroturnosAux=new ArrayList<CajeroTurno>();
		cajeroturnoAux=new CajeroTurno();
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
					if(cajeroturnoAux.getId()<0) {
						cajeroturnosAux.add(cajeroturnoAux);
					}		
				}
				this.iIdNuevoCajeroTurno=0L;
				this.cajeroturnoLogic.getCajeroTurnos().removeAll(cajeroturnosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajeroTurno cajeroturnoAux:this.cajeroturnos) {
					if(cajeroturnoAux.getId()<0) {
						cajeroturnosAux.add(cajeroturnoAux);
					}		
				}
				this.iIdNuevoCajeroTurno=0L;
				this.cajeroturnos.removeAll(cajeroturnosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajeroTurno 
					&& this.cajeroturnoLogic.getCajeroTurnos().size()>0
					) {
					cajeroturnoAux=this.cajeroturnoLogic.getCajeroTurnos().get(this.cajeroturnoLogic.getCajeroTurnos().size() - 1);
				
					if(cajeroturnoAux.getId()<0) {
						this.cajeroturnoLogic.getCajeroTurnos().remove(cajeroturnoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajeroTurno && this.cajeroturnos.size()>0) {
					cajeroturnoAux=this.cajeroturnos.get(this.cajeroturnos.size() - 1);
				
					if(cajeroturnoAux.getId()<0) {
						this.cajeroturnos.remove(cajeroturnoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajeroTurno(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajeroturno.getId()<0) {
				this.cajeroturnoLogic.getCajeroTurnos().remove(this.cajeroturno);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajeroturno.getId()<0) {
				this.cajeroturnos.remove(this.cajeroturno);
			}
		}			
	}
	
	public void setEstadosInicialesCajeroTurno(List<CajeroTurno> cajeroturnosAux) throws Exception {
		CajeroTurnoConstantesFunciones.setEstadosInicialesCajeroTurno(cajeroturnosAux);
	}
	
	public void setEstadosInicialesCajeroTurno(CajeroTurno cajeroturnoAux) throws Exception {
		CajeroTurnoConstantesFunciones.setEstadosInicialesCajeroTurno(cajeroturnoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajeroTurnoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajeroTurnoActual()) {
				if(!this.isEsNuevoCajeroTurno) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajeroTurno=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajeroTurnoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cajero Turno ?", "MANTENIMIENTO DE Cajero Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajeroTurno cajeroturno) throws Exception {
		CajeroTurnoConstantesFunciones.seleccionarAsignar(this.cajeroturno,cajeroturno);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajeroTurno=this.isPermisoActualizarOriginalCajeroTurno;
			
			
			this.seleccionarAsignar(cajeroturno);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajeroTurnoConstantesFunciones.quitarEspaciosCajeroTurno(this.cajeroturno,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajeroTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajeroturnoSessionBean.setsFuncionBusquedaRapida(this.cajeroturnoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajeroTurno) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajeroTurno(esParaCancelar);				
				this.cancelarNuevoCajeroTurno(esParaCancelar);								
			}
			
			this.cajeroturno=new CajeroTurno();
			
			this.inicializarCajeroTurno();
			
			this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajeroTurno() throws Exception {
		try {
			CajeroTurnoConstantesFunciones.inicializarCajeroTurno(this.cajeroturno);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajeroturnoLogic.getCajeroTurnos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajeroTurnos(String sAccionBusqueda,List<CajeroTurno> cajeroturnosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="CajeroTurno"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajeroTurnoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajeroTurnoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajeroTurno"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Cajero Turnos");		
		parameters.put("busquedapor", CajeroTurnoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajeroTurno=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajeroTurnoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajeroTurnoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajeroTurno=new JRBeanArrayDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(cajeroturnosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajeroTurno);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajeroTurnoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajeroTurnoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajeroTurnoBean.TraerCajeroTurnoBeans(cajeroturnosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajeroTurnoActionPerformed(null);
					//this.generarExcelReporteCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajeroTurnos(sAccionBusqueda,sTipoArchivoReporte,cajeroturnosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajeroTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajeroTurno> cajeroturnosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajeroTurnos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajeroTurno("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajeroTurno cajeroturno : cajeroturnosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajeroTurnoConstantesFunciones.generarExcelReporteDataCajeroTurno("NORMAL",row,workbook,cajeroturno,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajeroTurno(String sTipo,Row row,Workbook workbook) {
		
		CajeroTurnoConstantesFunciones.generarExcelReporteHeaderCajeroTurno(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajeroTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajeroTurno> cajeroturnosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajeroTurnos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajeroTurno cajeroturno : cajeroturnosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajeroTurnoConstantesFunciones.getCajeroTurnoDescripcion(cajeroturno));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDMESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDMESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getmesa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.getturnopunven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.gethora_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_HORAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.gethora_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajeroturno.gethora_servicio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajeroTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<CajeroTurno> cajeroturnosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajeroTurno> cajeroturnosRespaldo=null;
		
		classes=CajeroTurnoConstantesFunciones.getClassesRelationshipsOfCajeroTurno(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajeroturnoLogic.setDatosCliente(this.datosCliente);
		this.cajeroturnoLogic.setDatosDeep(this.datosDeep);
		this.cajeroturnoLogic.setIsConDeep(true);
		
		cajeroturnosRespaldo=this.cajeroturnoLogic.getCajeroTurnos();
		
		this.cajeroturnoLogic.setCajeroTurnos(cajeroturnosParaReportes);	
		this.cajeroturnoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajeroturnosParaReportes=this.cajeroturnoLogic.getCajeroTurnos();
		this.cajeroturnoLogic.setCajeroTurnos(cajeroturnosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajeroTurnos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajeroTurno("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajeroTurno cajeroturno : cajeroturnosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajeroTurno("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajeroTurnoConstantesFunciones.generarExcelReporteDataCajeroTurno("NORMAL",row,workbook,cajeroturno,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajeroTurnoConstantesFunciones.getCajeroTurnoDescripcion(cajeroturno));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajeroTurno.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajeroTurno() throws Exception {		
		this.startProcessCajeroTurno(true);
	}
	
	public void startProcessCajeroTurno(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajeroTurno ,this.jPanelParametrosReportesCajeroTurno, this.jScrollPanelDatosCajeroTurno,this.jPanelPaginacionCajeroTurno, this.jScrollPanelDatosEdicionCajeroTurno, this.jPanelAccionesCajeroTurno,this.jPanelAccionesFormularioCajeroTurno,this.jmenuBarCajeroTurno,this.jmenuBarDetalleCajeroTurno,this.jTtoolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno);		
		
		final JTabbedPane jTabbedPaneBusquedasCajeroTurno=this.jTabbedPaneBusquedasCajeroTurno; 
		
		final JPanel jPanelParametrosReportesCajeroTurno=this.jPanelParametrosReportesCajeroTurno;
		//final JScrollPane jScrollPanelDatosCajeroTurno=this.jScrollPanelDatosCajeroTurno;
		final JTable jTableDatosCajeroTurno=this.jTableDatosCajeroTurno;		
		final JPanel jPanelPaginacionCajeroTurno=this.jPanelPaginacionCajeroTurno;
		//final JScrollPane jScrollPanelDatosEdicionCajeroTurno=this.jScrollPanelDatosEdicionCajeroTurno;
		final JPanel jPanelAccionesCajeroTurno=this.jPanelAccionesCajeroTurno;
		
		JPanel jPanelCamposAuxiliarCajeroTurno=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajeroTurno=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			jPanelCamposAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jPanelCamposCajeroTurno;
			jPanelAccionesFormularioAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jPanelAccionesFormularioCajeroTurno;
		}
		
		final JPanel jPanelCamposCajeroTurno=jPanelCamposAuxiliarCajeroTurno;
		final JPanel jPanelAccionesFormularioCajeroTurno=jPanelAccionesFormularioAuxiliarCajeroTurno;
		
		
		final JMenuBar jmenuBarCajeroTurno=this.jmenuBarCajeroTurno;
		final JToolBar jTtoolBarCajeroTurno=this.jTtoolBarCajeroTurno;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajeroTurno=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajeroTurno=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			jmenuBarDetalleAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jmenuBarDetalleCajeroTurno;
			jTtoolBarDetalleAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jTtoolBarDetalleCajeroTurno;
		}
		
		final JMenuBar jmenuBarDetalleCajeroTurno=jmenuBarDetalleAuxiliarCajeroTurno;
		final JToolBar jTtoolBarDetalleCajeroTurno=jTtoolBarDetalleAuxiliarCajeroTurno;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajeroTurno;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajeroTurno;
			processRunnable.jTableDatos=jTableDatosCajeroTurno;
			processRunnable.jPanelCampos=jPanelCamposCajeroTurno;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajeroTurno;
			processRunnable.jPanelAcciones=jPanelAccionesCajeroTurno;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajeroTurno;
			
			
			processRunnable.jmenuBar=jmenuBarCajeroTurno;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajeroTurno;
			processRunnable.jTtoolBar=jTtoolBarCajeroTurno;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajeroTurno;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajeroTurno ,jPanelParametrosReportesCajeroTurno,jTableDatosCajeroTurno, /*jScrollPanelDatosCajeroTurno,*/jPanelCamposCajeroTurno,jPanelPaginacionCajeroTurno, /*jScrollPanelDatosEdicionCajeroTurno,*/ jPanelAccionesCajeroTurno,jPanelAccionesFormularioCajeroTurno,jmenuBarCajeroTurno,jmenuBarDetalleCajeroTurno,jTtoolBarCajeroTurno,jTtoolBarDetalleCajeroTurno);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajeroTurno ,jPanelParametrosReportesCajeroTurno, jScrollPanelDatosCajeroTurno,jPanelPaginacionCajeroTurno, jScrollPanelDatosEdicionCajeroTurno, jPanelAccionesCajeroTurno,jPanelAccionesFormularioCajeroTurno,jmenuBarCajeroTurno,jmenuBarDetalleCajeroTurno,jTtoolBarCajeroTurno,jTtoolBarDetalleCajeroTurno);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessCajeroTurno() {// throws Exception 
		this.finishProcessCajeroTurno(true);
	}
	
	public void finishProcessCajeroTurno(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajeroTurno ,this.jPanelParametrosReportesCajeroTurno, this.jScrollPanelDatosCajeroTurno,this.jPanelPaginacionCajeroTurno, this.jScrollPanelDatosEdicionCajeroTurno, this.jPanelAccionesCajeroTurno,this.jPanelAccionesFormularioCajeroTurno,this.jmenuBarCajeroTurno,this.jmenuBarDetalleCajeroTurno,this.jTtoolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno);		
		
		final JTabbedPane jTabbedPaneBusquedasCajeroTurno=this.jTabbedPaneBusquedasCajeroTurno; 
		
		final JPanel jPanelParametrosReportesCajeroTurno=this.jPanelParametrosReportesCajeroTurno;
		//final JScrollPane jScrollPanelDatosCajeroTurno=this.jScrollPanelDatosCajeroTurno;
		final JTable jTableDatosCajeroTurno=this.jTableDatosCajeroTurno;		
		final JPanel jPanelPaginacionCajeroTurno=this.jPanelPaginacionCajeroTurno;
		//final JScrollPane jScrollPanelDatosEdicionCajeroTurno=this.jScrollPanelDatosEdicionCajeroTurno;
		final JPanel jPanelAccionesCajeroTurno=this.jPanelAccionesCajeroTurno;
		
		JPanel jPanelCamposAuxiliarCajeroTurno=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajeroTurno=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			jPanelCamposAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jPanelCamposCajeroTurno;
			jPanelAccionesFormularioAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jPanelAccionesFormularioCajeroTurno;
		}
		
		final JPanel jPanelCamposCajeroTurno=jPanelCamposAuxiliarCajeroTurno;
		final JPanel jPanelAccionesFormularioCajeroTurno=jPanelAccionesFormularioAuxiliarCajeroTurno;
		
		
		final JMenuBar jmenuBarCajeroTurno=this.jmenuBarCajeroTurno;		
		final JToolBar jTtoolBarCajeroTurno=this.jTtoolBarCajeroTurno;
				
		JMenuBar jmenuBarDetalleAuxiliarCajeroTurno=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajeroTurno=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			jmenuBarDetalleAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jmenuBarDetalleCajeroTurno;
			jTtoolBarDetalleAuxiliarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jTtoolBarDetalleCajeroTurno;		
		}
		
		final JMenuBar jmenuBarDetalleCajeroTurno=jmenuBarDetalleAuxiliarCajeroTurno;
		final JToolBar jTtoolBarDetalleCajeroTurno=jTtoolBarDetalleAuxiliarCajeroTurno;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajeroTurno;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajeroTurno;
			processRunnable.jTableDatos=jTableDatosCajeroTurno;
			processRunnable.jPanelCampos=jPanelCamposCajeroTurno;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajeroTurno;
			processRunnable.jPanelAcciones=jPanelAccionesCajeroTurno;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajeroTurno;
			
			
			processRunnable.jmenuBar=jmenuBarCajeroTurno;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajeroTurno;
			processRunnable.jTtoolBar=jTtoolBarCajeroTurno;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajeroTurno;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajeroTurno ,jPanelParametrosReportesCajeroTurno, jTableDatosCajeroTurno,/*jScrollPanelDatosCajeroTurno,*/jPanelCamposCajeroTurno,jPanelPaginacionCajeroTurno, /*jScrollPanelDatosEdicionCajeroTurno,*/ jPanelAccionesCajeroTurno,jPanelAccionesFormularioCajeroTurno,jmenuBarCajeroTurno,jmenuBarDetalleCajeroTurno,jTtoolBarCajeroTurno,jTtoolBarDetalleCajeroTurno));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajeroTurno(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajeroTurno(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajeroTurno(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajeroTurno(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajeroTurno,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajeroTurno,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajeroTurno(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajeroTurno,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajeroTurno,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajeroturnoConstantesFunciones.getsFinalQueryCajeroTurno();
		String  finalQueryPaginacionTodos=this.cajeroturnoConstantesFunciones.getsFinalQueryCajeroTurno();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=CajeroTurnoConstantesFunciones.getArrayColumnasGlobalesNoCajeroTurno(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajeroTurnoConstantesFunciones.getArrayColumnasGlobalesCajeroTurno(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajeroTurnoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajeroturnosEliminados= new ArrayList<CajeroTurno>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajeroTurno();
		
				///*CajeroTurnoSessionBean*/this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			
			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=CajeroTurnoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajeroTurnoConstantesFunciones.getClassesForeignKeysOfCajeroTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajeroturno."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajeroturnosAux= new ArrayList<CajeroTurno>();
			
				
			cajeroturnoLogic.setDatosCliente(this.datosCliente);
			cajeroturnoLogic.setDatosDeep(this.datosDeep);
			cajeroturnoLogic.setIsConDeep(true);
			
			
			cajeroturnoLogic.getCajeroTurnoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajeroturnoLogic.getTodosCajeroTurnos(finalQueryGlobal,pagination);
					
					//cajeroturnoLogic.getTodosCajeroTurnosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajeroturnoLogic.getCajeroTurnos()==null|| cajeroturnoLogic.getCajeroTurnos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajeroturnosAux= new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux= new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajeroturnoLogic.getTodosCajeroTurnos(finalQueryGlobal+"",this.pagination);												
							
							//cajeroturnoLogic.getTodosCajeroTurnosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajeroTurnos("Todos",cajeroturnoLogic.getCajeroTurnos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());					
							cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajeroTurno=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajeroTurno=this.idActual;
				
				} else if(this.idCajeroTurnoActual!=null && this.idCajeroTurnoActual!=0L) {
					idCajeroTurno=idCajeroTurnoActual;
				}
				
					
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndicePorId(idCajeroTurno);
				
				this.cajeroturnos=new ArrayList<CajeroTurno>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajeroturnoLogic.getEntity(idCajeroTurno);
					
					//cajeroturnoLogic.getEntityWithConnection(idCajeroTurno);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
					cajeroturnoLogic.getCajeroTurnos().add(cajeroturnoLogic.getCajeroTurno());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturnos=new ArrayList<CajeroTurno>();
					this.cajeroturnos.add(cajeroturno);
				}
				
				if(cajeroturnoLogic.getCajeroTurno()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCaja")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdCaja",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdCaja",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdEmpresa",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdEmpresa",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMesa")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdMesa(id_mesaFK_IdMesa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdMesa(finalQueryGlobal,pagination,id_mesaFK_IdMesa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdMesa(id_mesaFK_IdMesa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdMesa(id_mesaFK_IdMesa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdMesa(finalQueryGlobal,pagination,id_mesaFK_IdMesa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdMesa(id_mesaFK_IdMesa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdMesa(id_mesaFK_IdMesa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdMesa",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdMesa",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdSucursal",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdSucursal",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTurnoPunVen")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdTurnoPunVen(finalQueryGlobal,pagination,id_turno_pun_venFK_IdTurnoPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdTurnoPunVen(id_turno_pun_venFK_IdTurnoPunVen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdTurnoPunVen",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdTurnoPunVen",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdUsuario",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdUsuario",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdVendedor")) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajeroturnoLogic.getCajeroTurnosFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajeroturnoLogic.getCajeroTurnos()==null||cajeroturnoLogic.getCajeroTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajeroturnos==null|| cajeroturnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnosAux=new ArrayList<CajeroTurno>();
						cajeroturnosAux.addAll(cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnosAux=new ArrayList<CajeroTurno>();
							cajeroturnosAux.addAll(cajeroturnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajeroturnoLogic.getCajeroTurnosFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajeroTurnoConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajeroTurnos("FK_IdVendedor",cajeroturnoLogic.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajeroTurnos("FK_IdVendedor",cajeroturnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoLogic.setCajeroTurnos(new ArrayList<CajeroTurno>());
						cajeroturnoLogic.getCajeroTurnos().addAll(cajeroturnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnos=new ArrayList<CajeroTurno>();
							cajeroturnos.addAll(cajeroturnosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajeroTurno();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajeroTurno();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajeroturnoLogic.getCajeroTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeroturnos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajeroturnoLogic.getCajeroTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajeroturnos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajeroTurno cajeroturno) {
		Boolean permite=true;
		
		if(this.cajeroturno.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajeroTurnoConstantesFunciones.getOrderByListaCajeroTurno();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajeroTurnoConstantesFunciones.getOrderByListaCajeroTurno();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajeroTurno cajeroturno:cajeroturnoLogic.getCajeroTurnos()) {
				if(cajeroturno.getsType().equals(Constantes2.S_TOTALES)) {
					cajeroturnoTotales=cajeroturno;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajeroTurno cajeroturno:this.cajeroturnos) {
				if(cajeroturno.getsType().equals(Constantes2.S_TOTALES)) {
					cajeroturnoTotales=cajeroturno;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.cajeroturnoAux=new CajeroTurno();
			this.cajeroturnoAux.setsType(Constantes2.S_TOTALES);
			this.cajeroturnoAux.setIsNew(false);
			this.cajeroturnoAux.setIsChanged(false);
			this.cajeroturnoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajeroTurnoConstantesFunciones.TotalizarValoresFilaCajeroTurno(this.cajeroturnoLogic.getCajeroTurnos(),this.cajeroturnoAux);
				
				this.cajeroturnoLogic.getCajeroTurnos().add(this.cajeroturnoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajeroTurnoConstantesFunciones.TotalizarValoresFilaCajeroTurno(this.cajeroturnos,this.cajeroturnoAux);
				
				this.cajeroturnos.add(this.cajeroturnoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajeroturnoTotales=new CajeroTurno();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajeroturnoLogic.getCajeroTurnos().remove(cajeroturnoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajeroturnos.remove(cajeroturnoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajeroturnoTotales=new CajeroTurno();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajeroTurno cajeroturno:cajeroturnoLogic.getCajeroTurnos()) {
				if(cajeroturno.getsType().equals(Constantes2.S_TOTALES)) {
					cajeroturnoTotales=cajeroturno;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajeroTurnoConstantesFunciones.TotalizarValoresFilaCajeroTurno(this.cajeroturnoLogic.getCajeroTurnos(),cajeroturnoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajeroTurno cajeroturno:this.cajeroturnos) {
				if(cajeroturno.getsType().equals(Constantes2.S_TOTALES)) {
					cajeroturnoTotales=cajeroturno;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajeroTurnoConstantesFunciones.TotalizarValoresFilaCajeroTurno(this.cajeroturnos,cajeroturnoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajeroTurnosFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdMesa()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdTurnoPunVen()throws Exception {
		try {
			sAccionBusqueda="FK_IdTurnoPunVen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajeroTurnosFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajeroTurnosFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdMesa(String sFinalQuery,Long id_mesa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdMesa(sFinalQuery,this.pagination,id_mesa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdTurnoPunVen(String sFinalQuery,Long id_turno_pun_ven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdTurnoPunVen(sFinalQuery,this.pagination,id_turno_pun_ven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajeroTurnosFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLogic.getCajeroTurnosFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCajeroTurno() {
		this.isPermisoTodoCajeroTurno=false;
		this.isPermisoNuevoCajeroTurno=false;
		this.isPermisoActualizarCajeroTurno=false;
		this.isPermisoActualizarOriginalCajeroTurno=false;
		this.isPermisoEliminarCajeroTurno=false;
		this.isPermisoGuardarCambiosCajeroTurno=false;
		this.isPermisoConsultaCajeroTurno=false;
		this.isPermisoBusquedaCajeroTurno=false;
		this.isPermisoReporteCajeroTurno=false;		
		this.isPermisoOrdenCajeroTurno=false;		
		this.isPermisoPaginacionMedioCajeroTurno=false;		
		this.isPermisoPaginacionAltoCajeroTurno=false;
		this.isPermisoPaginacionTodoCajeroTurno=false;
		this.isPermisoCopiarCajeroTurno=false;		
		this.isPermisoVerFormCajeroTurno=false;		
		this.isPermisoDuplicarCajeroTurno=false;		
		this.isPermisoOrdenCajeroTurno=false;		
	}
	
	public void setPermisosUsuarioCajeroTurno(Boolean isPermiso) {
		this.isPermisoTodoCajeroTurno=isPermiso;
		this.isPermisoNuevoCajeroTurno=isPermiso;
		this.isPermisoActualizarCajeroTurno=isPermiso;
		this.isPermisoActualizarOriginalCajeroTurno=isPermiso;
		this.isPermisoEliminarCajeroTurno=isPermiso;
		this.isPermisoGuardarCambiosCajeroTurno=isPermiso;
		this.isPermisoConsultaCajeroTurno=isPermiso;
		this.isPermisoBusquedaCajeroTurno=isPermiso;
		this.isPermisoReporteCajeroTurno=isPermiso;
		this.isPermisoOrdenCajeroTurno=isPermiso;		
		this.isPermisoPaginacionMedioCajeroTurno=isPermiso;		
		this.isPermisoPaginacionAltoCajeroTurno=isPermiso;		
		this.isPermisoPaginacionTodoCajeroTurno=isPermiso;		
		this.isPermisoCopiarCajeroTurno=isPermiso;		
		this.isPermisoVerFormCajeroTurno=isPermiso;		
		this.isPermisoDuplicarCajeroTurno=isPermiso;
		this.isPermisoOrdenCajeroTurno=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajeroTurno(Boolean isPermiso) {
		//this.isPermisoTodoCajeroTurno=isPermiso;
		this.isPermisoNuevoCajeroTurno=isPermiso;
		this.isPermisoActualizarCajeroTurno=isPermiso;
		this.isPermisoActualizarOriginalCajeroTurno=isPermiso;
		this.isPermisoEliminarCajeroTurno=isPermiso;
		this.isPermisoGuardarCambiosCajeroTurno=isPermiso;
		//this.isPermisoConsultaCajeroTurno=isPermiso;
		//this.isPermisoBusquedaCajeroTurno=isPermiso;
		//this.isPermisoReporteCajeroTurno=isPermiso;
		//this.isPermisoOrdenCajeroTurno=isPermiso;		
		//this.isPermisoPaginacionMedioCajeroTurno=isPermiso;		
		//this.isPermisoPaginacionAltoCajeroTurno=isPermiso;		
		//this.isPermisoPaginacionTodoCajeroTurno=isPermiso;		
		//this.isPermisoCopiarCajeroTurno=isPermiso;		
		//this.isPermisoDuplicarCajeroTurno=isPermiso;
		//this.isPermisoOrdenCajeroTurno=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajeroTurnoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajeroTurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajeroTurno(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajeroTurnoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajeroTurnoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajeroTurnoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajeroTurnoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajeroTurno() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajeroTurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajeroTurnoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajeroTurno=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajeroTurno=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajeroTurno=this.isPermisoActualizarCajeroTurno;
			this.isPermisoEliminarCajeroTurno=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajeroTurno=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajeroTurno=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajeroTurno=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajeroTurno=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajeroTurno=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajeroTurno=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajeroTurno=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajeroTurno=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajeroTurno=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajeroTurno=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajeroTurno=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajeroTurno=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajeroTurno=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajeroTurno.setToolTipText(this.jTableDatosCajeroTurno.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajeroTurno(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajeroTurno(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajeroTurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(CajeroTurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioCajeroTurno() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyCajeroTurnoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
				this.mesasForeignKey=new ArrayList();
				this.turnopunvensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajeroTurnoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajeroTurnoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajeroTurnoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTurnoPunVenListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesasForeignKey==null||this.mesasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesaConstantesFunciones.getArrayColumnasGlobalesMesa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTurnoPunVenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.turnopunvensForeignKey==null||this.turnopunvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TurnoPunVenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTurnoPunVensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCajeroTurnoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajeroTurnoParameterReturnGeneral cajeroturnoReturnGeneral=new CajeroTurnoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_empresaCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_empresaCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_sucursalCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_sucursalCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_usuarioCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_usuarioCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_vendedorCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_vendedorCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalCaja="";

				if(((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_cajaCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_cajaCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCaja, "");
						finalQueryGlobalCaja+=CajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCaja=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidCajaActual();
					}
				} else {
					finalQueryGlobalCaja="NONE";
				}


				String finalQueryGlobalMesa="";

				if(((this.mesasForeignKey==null||this.mesasForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_mesaCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_mesaCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionMesa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesaConstantesFunciones.getArrayColumnasGlobalesMesa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMesa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesaConstantesFunciones.TABLENAME);

						finalQueryGlobalMesa=Funciones.GetFinalQueryAppend(finalQueryGlobalMesa, "");
						finalQueryGlobalMesa+=MesaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMesasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMesa=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidMesaActual();
					}
				} else {
					finalQueryGlobalMesa="NONE";
				}


				String finalQueryGlobalTurnoPunVen="";

				if(((this.turnopunvensForeignKey==null||this.turnopunvensForeignKey.size()<=0) && this.cajeroturnoConstantesFunciones.cargarid_turno_pun_venCajeroTurno)
					 || (this.esRecargarFks && this.cajeroturnoConstantesFunciones.cargarid_turno_pun_venCajeroTurno)) {

					if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TurnoPunVenConstantesFunciones.getArrayColumnasGlobalesTurnoPunVen(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTurnoPunVen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TurnoPunVenConstantesFunciones.TABLENAME);

						finalQueryGlobalTurnoPunVen=Funciones.GetFinalQueryAppend(finalQueryGlobalTurnoPunVen, "");
						finalQueryGlobalTurnoPunVen+=TurnoPunVenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTurnoPunVensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTurnoPunVen=" WHERE " + ConstantesSql.ID + "="+cajeroturnoSessionBean.getlidTurnoPunVenActual();
					}
				} else {
					finalQueryGlobalTurnoPunVen="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajeroturnoReturnGeneral=cajeroturnoLogic.cargarCombosLoteForeignKeyCajeroTurno(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalVendedor,finalQueryGlobalCaja,finalQueryGlobalMesa,finalQueryGlobalTurnoPunVen);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajeroturnoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajeroturnoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=cajeroturnoReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=cajeroturnoReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalCaja.equals("NONE")) {
				this.cajasForeignKey=cajeroturnoReturnGeneral.getcajasForeignKey();
			}

			if(!finalQueryGlobalMesa.equals("NONE")) {
				this.mesasForeignKey=cajeroturnoReturnGeneral.getmesasForeignKey();
			}

			if(!finalQueryGlobalTurnoPunVen.equals("NONE")) {
				this.turnopunvensForeignKey=cajeroturnoReturnGeneral.getturnopunvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajeroTurno()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyCaja();
			this.addItemDefectoCombosForeignKeyMesa();
			this.addItemDefectoCombosForeignKeyTurnoPunVen();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajeroturnoSessionBean==null) {
				this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
			}

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesa()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionMesa()) {
				Mesa mesa=new Mesa();
				MesaConstantesFunciones.setMesaDescripcion(mesa,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesa.setId(null);

				if(!MesaConstantesFunciones.ExisteEnLista(this.mesasForeignKey,mesa,true)) {

					this.mesasForeignKey.add(0,mesa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTurnoPunVen()throws Exception {
		try {

			if(!this.cajeroturnoSessionBean.getisBusquedaDesdeForeignKeySesionTurnoPunVen()) {
				TurnoPunVen turnopunven=new TurnoPunVen();
				TurnoPunVenConstantesFunciones.setTurnoPunVenDescripcion(turnopunven,Constantes.SMENSAJE_ESCOJA_OPCION);
				turnopunven.setId(null);

				if(!TurnoPunVenConstantesFunciones.ExisteEnLista(this.turnopunvensForeignKey,turnopunven,true)) {

					this.turnopunvensForeignKey.add(0,turnopunven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCajeroTurno()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajeroTurno(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajeroTurno()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajeroTurno();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajeroTurno(CajeroTurno cajeroturno)throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(cajeroturno.getid_vendedor(),false,"Formulario");
			this.setActualCajaForeignKey(cajeroturno.getid_caja(),false,"Formulario");
			this.setActualMesaForeignKey(cajeroturno.getid_mesa(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(cajeroturno.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajeroTurno(CajeroTurno cajeroturno,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajeroTurno()throws Exception {	
		try {
			
			this.setActualVendedorForeignKey(this.cajeroturnoConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualCajaForeignKey(this.cajeroturnoConstantesFunciones.getid_caja(),false,"Formulario");
			this.setActualMesaForeignKey(this.cajeroturnoConstantesFunciones.getid_mesa(),false,"Formulario");
			this.setActualTurnoPunVenForeignKey(this.cajeroturnoConstantesFunciones.getid_turno_pun_ven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajeroTurno()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajeroTurno()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajeroTurno()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajeroTurno()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajeroTurno()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");
			this.cargarCombosFrameMesasForeignKey("Todos");
			this.cargarCombosFrameTurnoPunVensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajeroTurno(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTurnoPunVensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajeroTurno()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public CajeroTurnoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajeroTurnoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajeroTurnoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean(); 
		this.cajeroturnoConstantesFunciones=new CajeroTurnoConstantesFunciones(); 
		this.cajeroturnoBean=new CajeroTurno();//(this.cajeroturnoConstantesFunciones); 		
		this.cajeroturnoReturnGeneral=new CajeroTurnoParameterReturnGeneral(); 
		
		this.cajeroturnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajeroTurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajeroTurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajeroTurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajeroTurno(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.cajeroturnoConstantesFunciones=new CajeroTurnoConstantesFunciones(); 
			this.cajeroturnoBean=new CajeroTurno();//this.cajeroturnoConstantesFunciones); 			
			this.cajeroturnoReturnGeneral=new CajeroTurnoParameterReturnGeneral(); 
		
			CajeroTurnoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cajero Turno Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cajeroturno=new CajeroTurno();
			this.cajeroturnos = new ArrayList<CajeroTurno>();
			this.cajeroturnosAux = new ArrayList<CajeroTurno>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic=new CajeroTurnoLogic();
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			//this.cajeroturnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajeroturnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajeroTurno);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajeroTurno);	
					}
					
					if(this.jInternalFrameImportacionCajeroTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajeroTurno);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajeroTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajeroTurno);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajeroTurno);
				this.jInternalFrameDetalleFormCajeroTurno.setVisible(false);
				this.jInternalFrameDetalleFormCajeroTurno.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajeroTurno);
					this.jInternalFrameReporteDinamicoCajeroTurno.setVisible(false);
					this.jInternalFrameReporteDinamicoCajeroTurno.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajeroTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajeroTurno);
					this.jInternalFrameImportacionCajeroTurno.setVisible(false);
					this.jInternalFrameImportacionCajeroTurno.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajeroTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajeroTurno);
					this.jInternalFrameOrderByCajeroTurno.setVisible(false);
					this.jInternalFrameOrderByCajeroTurno.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajeroTurnoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajeroTurnoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.cajeroturnoReturnGeneral=new CajeroTurnoParameterReturnGeneral();
			
			this.cajeroturnoParameterGeneral=new CajeroTurnoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajeroturnoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(CajeroTurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajeroTurnoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajeroturnoSessionBean.getEsGuardarRelacionado(),this.cajeroturnoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajeroTurnoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajeroturnoSessionBean.getEsGuardarRelacionado(),this.cajeroturnoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaDuplicarCajeroTurno=true;
			this.isVisibilidadCeldaCopiarCajeroTurno=true;
			this.isVisibilidadCeldaVerFormCajeroTurno=true;
			this.isVisibilidadCeldaOrdenCajeroTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			
			
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMesa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTurnoPunVen=true;
			this.isVisibilidadFK_IdUsuario=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajeroTurno();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajeroTurno(false);
			
			this.setPermisosUsuarioCajeroTurno();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado() 
				|| (this.cajeroturnoSessionBean.getEsGuardarRelacionado() && this.cajeroturnoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajeroTurnoClasesRelacionadas();
			}
			
			if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajeroTurnoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajeroTurno();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajeroTurno();
			}
			
			if(!this.isPermisoBusquedaCajeroTurno) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajeroTurno,this.isPermisoPaginacionMedioCajeroTurno,this.isPermisoPaginacionTodoCajeroTurno);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajeroTurnoConstantesFunciones.getTiposSeleccionarCajeroTurno());
				
				this.tiposColumnasSelect=CajeroTurnoConstantesFunciones.getTiposSeleccionarCajeroTurno(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajeroTurno();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCajeroTurno(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCajeroTurno(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeroTurno() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.usuarioLogic=new UsuarioLogic();
			this.vendedorLogic=new VendedorLogic();
			this.cajaLogic=new CajaLogic();
			this.mesaLogic=new MesaLogic();
			this.turnopunvenLogic=new TurnoPunVenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajeroturnoImplementable= (CajeroTurnoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajeroTurnoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajeroturnoImplementableHome= (CajeroTurnoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajeroTurnoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajeroturnos= new ArrayList<CajeroTurno>();
			this.cajeroturnosEliminados= new ArrayList<CajeroTurno>();
						
			this.isEsNuevoCajeroTurno=false;
			this.esParaAccionDesdeFormularioCajeroTurno=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			this.mesasForeignKey=new ArrayList<Mesa>() ;
			this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajeroTurno(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajeroTurno();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajeroTurnoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajeroTurnoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajeroTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajeroTurno(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajeroTurno();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajeroTurno();
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajeroTurno.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajeroTurno(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajeroTurno: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajeroTurno() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajeroTurno")) {
				iIndex=this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajeroTurno();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyCajeroTurno(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajeroTurno(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajeroTurno(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajeroTurnoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajeroTurno();
		
		this.cargarCombosFrameForeignKeyCajeroTurno();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajeroTurno();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajeroTurno();
		}
	}
	
	

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesa();
				this.cargarCombosFrameMesasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesa(this.mesasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTurnoPunVen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTurnoPunVenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTurnoPunVen();
				this.cargarCombosFrameTurnoPunVensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTurnoPunVen(this.turnopunvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCajeroTurnoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			
			if(jTableDatosCajeroTurno.getRowCount()>=1) {
				jTableDatosCajeroTurno.removeRowSelectionInterval(0, jTableDatosCajeroTurno.getRowCount()-1);						
			}
			
			this.isEsNuevoCajeroTurno=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajeroTurno(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajeroTurno(true);			
			//this.cajeroturno=new CajeroTurno();
			//this.cajeroturno.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeroTurno(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeroTurno() ;
			
			if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeroTurno(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajeroturno);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);				
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajeroTurno: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajeroTurnoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajeroTurno.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajeroTurno.getSelectedRows().length;			
			}
			
			cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajeroTurno--;			
				//CajeroTurno cajeroturnoAux= new CajeroTurno();			
				//cajeroturnoAux.setId(this.iIdNuevoCajeroTurno);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajeroTurno cajeroturnoOrigen=new CajeroTurno();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajeroTurno cajeroturnoOrigen : cajeroturnosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajeroturnoOrigen =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajeroturnoOrigen =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajeroTurno();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajeroturno.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajeroTurno(cajeroturnoOrigen,this.cajeroturno,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajeroturnoLogic.getCajeroTurnos().add(this.cajeroturnoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajeroturnos.add(this.cajeroturnoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajeroTurno(false);
				
				this.jTableDatosCajeroTurno.setRowSelectionInterval(this.getIndiceNuevoCajeroTurno(), this.getIndiceNuevoCajeroTurno());
				
				int iLastRow =  this.jTableDatosCajeroTurno.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajeroTurno.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajeroTurno.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeroTurno(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();									
		
			CajeroTurno cajeroturnoOrigen=new CajeroTurno();
			CajeroTurno cajeroturnoDestino=new CajeroTurno();
				
			cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajeroTurno.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajeroturnosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajeroTurno.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoOrigen =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajeroturnoOrigen =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajeroturnoDestino =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajeroturnoDestino =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajeroturnoOrigen =cajeroturnosSeleccionados.get(0);
				cajeroturnoDestino =cajeroturnosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajeroTurno(cajeroturnoOrigen,cajeroturnoDestino,true,false);
				
				cajeroturnoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajeroturnoDestino,cajeroturnoLogic.getCajeroTurnos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajeroturnoDestino,cajeroturnos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajeroTurno(false);
				
				//this.jTableDatosCajeroTurno.setRowSelectionInterval(this.getIndiceNuevoCajeroTurno(), this.getIndiceNuevoCajeroTurno());
				
				int iLastRow =  this.jTableDatosCajeroTurno.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajeroTurno.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajeroTurno.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeroTurno(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajeroTurno.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajeroTurno.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajeroTurno.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajeroTurno.setVisible(!isVisible);
			this.jPanelPaginacionCajeroTurno.setVisible(!isVisible);
			this.jPanelAccionesCajeroTurno.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajeroTurno();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajeroTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajeroTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajeroTurno();
			
			this.abrirFrameOrderByCajeroTurno();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajeroTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajeroTurno(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajeroTurno);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajeroTurno.isMaximum()) {
					this.jInternalFrameDetalleFormCajeroTurno.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajeroTurno.setSize(this.jInternalFrameDetalleFormCajeroTurno.iWidthFormulario,this.jInternalFrameDetalleFormCajeroTurno.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajeroTurno.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajeroTurno.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajeroTurno.isMaximum()) {
						this.jInternalFrameDetalleFormCajeroTurno.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajeroTurno.jContentPaneDetalleCajeroTurno.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajeroTurno.jContentPaneDetalleCajeroTurno.getWidth(),CajeroTurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajeroTurno.jContentPaneDetalleCajeroTurno.getWidth(),CajeroTurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajeroTurno.jContentPaneDetalleCajeroTurno.getWidth(),CajeroTurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajeroTurno.setVisible(true);
	        this.jInternalFrameDetalleFormCajeroTurno.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajeroTurno() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajeroTurno==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajeroTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeroTurno,false,this);
				} else {
					this.jInternalFrameOrderByCajeroTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajeroTurno,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajeroTurno);
				this.jInternalFrameOrderByCajeroTurno.setVisible(false);
				this.jInternalFrameOrderByCajeroTurno.setSelected(false);
				
				this.jInternalFrameOrderByCajeroTurno.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajeroTurno"));
				
				this.inicializarActualizarBindingTablaOrderByCajeroTurno();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajeroTurno() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajeroTurno==null) {
				
				this.jInternalFrameImportacionCajeroTurno=new ImportacionJInternalFrame(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajeroTurno);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajeroTurno);
				this.jInternalFrameImportacionCajeroTurno.setVisible(false);
				this.jInternalFrameImportacionCajeroTurno.setSelected(false);


				this.jInternalFrameImportacionCajeroTurno.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajeroTurno"));
				this.jInternalFrameImportacionCajeroTurno.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajeroTurno"));
				this.jInternalFrameImportacionCajeroTurno.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajeroTurno"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajeroTurno() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajeroTurno==null) {
				this.jInternalFrameReporteDinamicoCajeroTurno=new ReporteDinamicoJInternalFrame(CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajeroTurno);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajeroTurno);
				this.jInternalFrameReporteDinamicoCajeroTurno.setVisible(false);
				this.jInternalFrameReporteDinamicoCajeroTurno.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeroTurno"));
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeroTurno"));
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeroTurno"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeroTurno();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajeroTurno() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajeroTurno);
			
	       	this.jInternalFrameDetalleFormCajeroTurno.setVisible(false);
	        this.jInternalFrameDetalleFormCajeroTurno.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajeroTurno.dispose();
			//this.jInternalFrameDetalleFormCajeroTurno=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajeroTurno() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajeroTurno.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajeroTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajeroTurno() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajeroTurno.setVisible(true);
	        this.jInternalFrameImportacionCajeroTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajeroTurno() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajeroTurno.setVisible(true);
	        this.jInternalFrameOrderByCajeroTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajeroTurno() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajeroTurno.setVisible(false);
	        this.jInternalFrameOrderByCajeroTurno.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajeroTurno() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajeroTurno.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajeroTurno.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajeroTurno() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajeroTurno.setVisible(false);
	        this.jInternalFrameImportacionCajeroTurno.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderCajeroTurno.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajeroTurno(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajeroTurno(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajeroTurno(true);
			//this.isEsNuevoCajeroTurno=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajeroTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeroTurno(false) ;
			
			if(cajeroturnoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeroTurno(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeroTurno(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajeroTurnoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajeroTurno(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajeroTurno(true);
			//this.isEsNuevoCajeroTurno=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajeroturno.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajeroTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajeroTurno(false) ;
			
			if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajeroTurno(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeroTurno(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesa(List<Mesa> mesasForeignKey)throws Exception{
		TableColumn tableColumnMesa=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDMESA));
		TableCellEditor tableCellEditorMesa =tableColumnMesa.getCellEditor();

		MesaTableCell mesaTableCellFk=(MesaTableCell)tableCellEditorMesa;

		if(mesaTableCellFk!=null) {
			mesaTableCellFk.setmesasForeignKey(mesasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesaTableCellFk.setRowActual(intSelectedRow);
			//mesaTableCellFk.setmesasForeignKeyActual(mesasForeignKey);
		//}


		if(mesaTableCellFk!=null) {
			mesaTableCellFk.RecargarMesasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTurnoPunVen(List<TurnoPunVen> turnopunvensForeignKey)throws Exception{
		TableColumn tableColumnTurnoPunVen=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN));
		TableCellEditor tableCellEditorTurnoPunVen =tableColumnTurnoPunVen.getCellEditor();

		TurnoPunVenTableCell turnopunvenTableCellFk=(TurnoPunVenTableCell)tableCellEditorTurnoPunVen;

		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.setturnopunvensForeignKey(turnopunvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();

		//if(intSelectedRow<=0) {
			//turnopunvenTableCellFk.setRowActual(intSelectedRow);
			//turnopunvenTableCellFk.setturnopunvensForeignKeyActual(turnopunvensForeignKey);
		//}


		if(turnopunvenTableCellFk!=null) {
			turnopunvenTableCellFk.RecargarTurnoPunVensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajeroTurno(false);
			
			//if(!this.isEsNuevoCajeroTurno) {								
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				
			}
			
			if(this.permiteMantenimiento(this.cajeroturno)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajeroTurno=true;
					this.inicializarActualizarBindingTablaCajeroTurno(false);
					this.isEsNuevoCajeroTurno=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajeroTurno=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajeroTurno=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajeroTurno(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeroTurno(false);
				
				this.habilitarDeshabilitarControlesCajeroTurno(false);
			
												
				
				if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajeroTurno();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajeroTurnoActionPerformed(evt,cajeroturnoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajeroTurno(this.cajeroturno,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajeroturnoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajeroturno.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				this.cajeroturno.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				this.cajeroturno.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajeroturno)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajeroTurnoModel) this.jTableDatosCajeroTurno.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajeroTurno=true;
				this.inicializarActualizarBindingTablaCajeroTurno(false);
				this.isEsNuevoCajeroTurno=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajeroTurno(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeroTurno(false);
				
				this.habilitarDeshabilitarControlesCajeroTurno(false);
				
				
				
				if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajeroTurno();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajeroTurno.getRowCount()>=1) {
				jTableDatosCajeroTurno.removeRowSelectionInterval(0, jTableDatosCajeroTurno.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajeroTurno(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajeroTurno(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajeroTurno(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajeroTurno(false) ;
			
			this.isEsNuevoCajeroTurno=false;
			
			if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajeroTurno();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajeroTurno(false);
				
				//SI ES MANUAL
				if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajeroTurno();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajeroTurno--;			
			//CajeroTurno cajeroturnoAux= new CajeroTurno();			
			//cajeroturnoAux.setId(this.iIdNuevoCajeroTurno);
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajeroTurno();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
			
			this.cajeroturno.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajeroturnoLogic.getCajeroTurnos().add(this.cajeroturnoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajeroturnos.add(this.cajeroturnoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajeroTurno(false);
			
			this.jTableDatosCajeroTurno.setRowSelectionInterval(this.getIndiceNuevoCajeroTurno(), this.getIndiceNuevoCajeroTurno());
			
			int iLastRow =  this.jTableDatosCajeroTurno.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajeroTurno.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajeroTurno.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajeroTurno(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeroTurno(false);
			
			//SI ES MANUAL
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeroTurno();
			}
			
			//this.abrirFrameTreeCajeroTurno();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cajero TurnoS ?", "MANTENIMIENTO DE Cajero Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajeroTurno.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajeroTurno();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajeroturnoReturnGeneral=cajeroturnoLogic.procesarImportacionCajeroTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajeroturnoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajeroTurnoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajeroTurno.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajeroTurno.setFileImportacion(this.jInternalFrameImportacionCajeroTurno.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajeroTurno.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajeroTurno.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajeroTurno.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajeroTurno.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		

		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajeroTurnoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajeroTurnoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDMESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mesa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mesa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mesa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mesa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TurnoPunVen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TurnoPunVen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TurnoPunVen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TurnoPunVen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raServicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raServicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raServicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raServicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoCajeroTurno.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDMESA:
					sNombreCampoCategoria="id_mesa";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoria="id_turno_pun_ven";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAINICIO:
					sNombreCampoCategoria="hora_inicio";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAFIN:
					sNombreCampoCategoria="hora_fin";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO:
					sNombreCampoCategoria="hora_servicio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDMESA:
					sNombreCampoCategoriaValor="id_mesa";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					sNombreCampoCategoriaValor="id_turno_pun_ven";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAINICIO:
					sNombreCampoCategoriaValor="hora_inicio";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAFIN:
					sNombreCampoCategoriaValor="hora_fin";
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO:
					sNombreCampoCategoriaValor="hora_servicio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDMESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mesa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mesa");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Turno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_turno_pun_ven");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_inicio");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_fin");
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_servicio");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("CajeroTurnos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDMESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDMESA);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getmesa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.getturnopunven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.gethora_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAFIN);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.gethora_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO);
					iRow++;

					for(CajeroTurno cajeroturno:cajeroturnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajeroturno.gethora_servicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelCajeroTurno(row);				
			//	iRow++;
			//}				
			
			//for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajeroTurno(cajeroturnoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeroTurno(false);
			
			//SI ES MANUAL
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajeroTurno();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeroTurno(false);
			
			//SI ES MANUAL
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajeroTurno();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajeroTurno(false);
			
			//SI ES MANUAL
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajeroTurno();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajeroTurno() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajeroTurno.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajeroTurno.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajeroTurno.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajeroTurno.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajeroTurno.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajeroTurno.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajeroTurno.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajeroTurno(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajeroTurno(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajeroTurno(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajeroTurno(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajeroTurno(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajeroTurno(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeroTurno(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajeroTurno(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajeroTurno() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajeroTurno();
		
		this.inicializarActualizarBindingBotonesManualCajeroTurno(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajeroTurno();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajeroTurno() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajeroTurno(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajeroTurno(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajeroTurno.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajeroTurno.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajeroTurno.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionNuevoCajeroTurno.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionSinCerrarCajeroTurno.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionSinMensajeCajeroTurno.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajeroTurno.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajeroTurno.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajeroTurno.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
				this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionNuevoCajeroTurno.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionSinCerrarCajeroTurno.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajeroTurno.jCheckBoxPostAccionSinMensajeCajeroTurno.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajeroTurno.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajeroTurno.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajeroTurno.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajeroTurno.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajeroTurno.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajeroTurno.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajeroTurno.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajeroTurno.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajeroTurno.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajeroTurno(Boolean esInicializar) throws Exception {
		try	{	
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajeroTurno(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajeroTurno() throws Exception {
		try	{
			if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajeroTurno();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajeroTurno() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajeroTurno() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajeroTurno.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajeroTurno.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajeroTurno.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajeroTurno.addItem(reporte);
			}
			
			
			if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajeroTurno.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajeroTurno.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajeroTurno.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajeroTurno.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajeroTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajeroTurno.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajeroTurno.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeroTurno();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajeroTurno() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
				this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
				this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajeroTurno.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajeroTurno.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajeroTurno.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajeroTurno.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajeroTurno.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajeroTurno()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaFK_IdCajaCajeroTurno.getSelectedItem()!=null){this.id_cajaFK_IdCaja=((Caja)this.jComboBoxid_cajaFK_IdCajaCajeroTurno.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesaFK_IdMesaCajeroTurno.getSelectedItem()!=null){this.id_mesaFK_IdMesa=((Mesa)this.jComboBoxid_mesaFK_IdMesaCajeroTurno.getSelectedItem()).getId();}
		if(this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.getSelectedItem()!=null){this.id_turno_pun_venFK_IdTurnoPunVen=((TurnoPunVen)this.jComboBoxid_turno_pun_venFK_IdTurnoPunVenCajeroTurno.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.getSelectedItem()!=null){this.id_vendedorFK_IdVendedor=((Vendedor)this.jComboBoxid_vendedorFK_IdVendedorCajeroTurno.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajeroTurno(Boolean esInicializar) throws Exception {				
		if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajeroTurno();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajeroTurno() throws Exception {
		this.inicializarActualizarBindingTablaCajeroTurno(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajeroTurno() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajeroTurnoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurnoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajeroTurno(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajeroturnoLogic.getCajeroTurnos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajeroturnos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajeroTurno.setModel(new CajeroTurnoModel(this.cajeroturnoLogic.getCajeroTurnos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajeroTurno.setModel(new CajeroTurnoModel(this.cajeroturnos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajeroTurno!=null && this.jInternalFrameOrderByCajeroTurno.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajeroTurno();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,cajeroturnoConstantesFunciones.resaltarSeleccionarCajeroTurno,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO,cajeroturnoConstantesFunciones.resaltarSeleccionarCajeroTurno,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_ID));

		if(this.cajeroturnoConstantesFunciones.mostraridCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajeroturnoConstantesFunciones.resaltaridCajeroTurno,this.cajeroturnoConstantesFunciones.activaridCajeroTurno,this,true,"idCajeroTurno","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajeroturnoConstantesFunciones.resaltaridCajeroTurno,this.cajeroturnoConstantesFunciones.activaridCajeroTurno,this,true,"idCajeroTurno","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajeroturnoConstantesFunciones.mostrarid_empresaCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_empresaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_empresaCajeroTurno));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_empresaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_empresaCajeroTurno,false,"id_empresaCajeroTurno","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajeroturnoConstantesFunciones.mostrarid_sucursalCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_sucursalCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_sucursalCajeroTurno));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_sucursalCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_sucursalCajeroTurno,false,"id_sucursalCajeroTurno","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO));

		if(this.cajeroturnoConstantesFunciones.mostrarid_usuarioCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_usuarioCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_usuarioCajeroTurno));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_usuarioCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_usuarioCajeroTurno,false,"id_usuarioCajeroTurno","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.cajeroturnoConstantesFunciones.mostrarid_vendedorCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_vendedorCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_vendedorCajeroTurno));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_vendedorCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_vendedorCajeroTurno,true,"id_vendedorCajeroTurno","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDCAJA));

		if(this.cajeroturnoConstantesFunciones.mostrarid_cajaCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_cajaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_cajaCajeroTurno));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_cajaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_cajaCajeroTurno,true,"id_cajaCajeroTurno","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDMESA));

		if(this.cajeroturnoConstantesFunciones.mostrarid_mesaCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDMESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesaTableCell(this.mesasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_mesaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_mesaCajeroTurno));
			tableColumn.setCellEditor(new MesaTableCell(this.mesasForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_mesaCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_mesaCajeroTurno,true,"id_mesaCajeroTurno","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN));

		if(this.cajeroturnoConstantesFunciones.mostrarid_turno_pun_venCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_turno_pun_venCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_turno_pun_venCajeroTurno));
			tableColumn.setCellEditor(new TurnoPunVenTableCell(this.turnopunvensForeignKey,this.cajeroturnoConstantesFunciones.resaltarid_turno_pun_venCajeroTurno,this,this.cajeroturnoConstantesFunciones.activarid_turno_pun_venCajeroTurno,true,"id_turno_pun_venCajeroTurno","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_HORAINICIO));

		if(this.cajeroturnoConstantesFunciones.mostrarhora_inicioCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_HORAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_inicioCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_inicioCajeroTurno,this,true,"hora_inicioCajeroTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_inicioCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_inicioCajeroTurno,this,true,"hora_inicioCajeroTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_HORAFIN));

		if(this.cajeroturnoConstantesFunciones.mostrarhora_finCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_HORAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_finCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_finCajeroTurno,this,true,"hora_finCajeroTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_finCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_finCajeroTurno,this,true,"hora_finCajeroTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO));

		if(this.cajeroturnoConstantesFunciones.mostrarhora_servicioCajeroTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_servicioCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_servicioCajeroTurno,this,true,"hora_servicioCajeroTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajeroturnoConstantesFunciones.resaltarhora_servicioCajeroTurno,this.cajeroturnoConstantesFunciones.activarhora_servicioCajeroTurno,this,true,"hora_servicioCajeroTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajeroTurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajeroTurno.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajeroTurno.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajeroturnoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajeroTurno.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosCajeroTurno.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajeroTurno.moveColumn(this.jTableDatosCajeroTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajeroTurno.moveColumn(this.jTableDatosCajeroTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajeroTurno.moveColumn(this.jTableDatosCajeroTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajeroTurno.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajeroTurno.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajeroTurno,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajeroTurno.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajeroTurno.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajeroTurno.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajeroTurno.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajeroTurno.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=cajeroturnoLogic.getCajeroTurnos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajeroturnos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosCajeroTurno.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajeroTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajeroTurno();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoCajeroTurno=false;
					
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
				if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajeroTurno==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajeroTurno.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajeroturno.getsType().equals("DUPLICADO")
				   || this.cajeroturno.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajeroTurno=true;
				
				} else {
					this.isEsNuevoCajeroTurno=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					if(this.cajeroturno.getId()>=0 && !this.cajeroturno.getIsNew()) {						
						this.isEsNuevoCajeroTurno=false;
						
					} else {
						this.isEsNuevoCajeroTurno=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajeroTurno(esRelaciones);						
				
				this.seleccionarCajeroTurno(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajeroturno.getId()<0) {
					this.isEsNuevoCajeroTurno=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajeroTurno(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajeroTurno(evt,rowIndex);
				}	
				
				if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajeroTurno: " + this.dDif); 
					}
				}								
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajeroTurno(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajeroturno)) {
					if(this.cajeroturno.getId()>0) {
						this.cajeroturno.setIsDeleted(true);
						
						this.cajeroturnosEliminados.add(this.cajeroturno);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajeroturnoLogic.getCajeroTurnos().remove(this.cajeroturno);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajeroturnos.remove(this.cajeroturno);				
					}
					
					
					((CajeroTurnoModel) this.jTableDatosCajeroTurno.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajeroTurno(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajeroTurno(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajeroTurno) {
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajeroTurno.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajeroTurno.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajeroTurno(this.cajeroturno);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cajeroturnoConstantesFunciones.cargarid_empresaCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_empresaCajeroTurno) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajeroturno.getid_empresa());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajeroturno.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajeroturno.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajeroturno.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajeroturnoConstantesFunciones.cargarid_sucursalCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_sucursalCajeroTurno) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajeroturno.getid_sucursal());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajeroturno.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajeroturno.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajeroturno.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.cajeroturnoConstantesFunciones.cargarid_usuarioCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_usuarioCajeroTurno) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.cajeroturno.getid_usuario());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(cajeroturno.getUsuario()!=null) {
							this.usuariosForeignKey.add(cajeroturno.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.cajeroturno.getid_usuario(),false,"Formulario");

					//Vendedor
					if(!this.cajeroturnoConstantesFunciones.cargarid_vendedorCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_vendedorCajeroTurno) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.cajeroturno.getid_vendedor());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(cajeroturno.getVendedor()!=null) {
							this.vendedorsForeignKey.add(cajeroturno.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.cajeroturno.getid_vendedor(),false,"Formulario");

					//Caja
					if(!this.cajeroturnoConstantesFunciones.cargarid_cajaCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_cajaCajeroTurno) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajeroturno.getid_caja());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajeroturno.getCaja()!=null) {
							this.cajasForeignKey.add(cajeroturno.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajeroturno.getid_caja(),false,"Formulario");

					//Mesa
					if(!this.cajeroturnoConstantesFunciones.cargarid_mesaCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_mesaCajeroTurno) {
						//this.cargarCombosMesasForeignKeyLista(" where id="+this.cajeroturno.getid_mesa());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.mesasForeignKey=new ArrayList<Mesa>();

						if(cajeroturno.getMesa()!=null) {
							this.mesasForeignKey.add(cajeroturno.getMesa());
						}

						this.addItemDefectoCombosForeignKeyMesa();
						this.cargarCombosFrameMesasForeignKey("Todos");
					}
					this.setActualMesaForeignKey(this.cajeroturno.getid_mesa(),false,"Formulario");

					//TurnoPunVen
					if(!this.cajeroturnoConstantesFunciones.cargarid_turno_pun_venCajeroTurno || this.cajeroturnoConstantesFunciones.event_dependid_turno_pun_venCajeroTurno) {
						//this.cargarCombosTurnoPunVensForeignKeyLista(" where id="+this.cajeroturno.getid_turno_pun_ven());
									//this.inicializarActualizarBindingCajeroTurno(false,false);
						this.turnopunvensForeignKey=new ArrayList<TurnoPunVen>();

						if(cajeroturno.getTurnoPunVen()!=null) {
							this.turnopunvensForeignKey.add(cajeroturno.getTurnoPunVen());
						}

						this.addItemDefectoCombosForeignKeyTurnoPunVen();
						this.cargarCombosFrameTurnoPunVensForeignKey("Todos");
					}
					this.setActualTurnoPunVenForeignKey(this.cajeroturno.getid_turno_pun_ven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajeroTurno("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajeroTurno(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajeroTurno() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajeroTurno(CajeroTurno cajeroturno) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajeroTurno(cajeroturno,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajeroTurno(CajeroTurno cajeroturno,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajeroTurno(cajeroturno);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajeroTurno(cajeroturno,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajeroTurno(cajeroturno);
	}
	
	public void setVariablesObjetoActualToFormularioCajeroTurno(CajeroTurno cajeroturno) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setText(cajeroturno.getId().toString());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setValue(cajeroturno.gethora_inicio());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setValue(cajeroturno.gethora_fin());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setValue(cajeroturno.gethora_servicio());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajeroTurno cajeroturnoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajeroturnoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajeroTurno cajeroturnoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajeroturnoLocal=this.cajeroturno;
			} else {
				cajeroturnoLocal=this.cajeroturnoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajeroturnoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajeroTurno(cajeroturnoLocal,true);
					
					if(cajeroturnoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajeroturnoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajeroturnoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajeroTurno(CajeroTurno cajeroturno,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajeroTurno(cajeroturno,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(cajeroturno);
	}
	
	public void setVariablesFormularioToObjetoActualCajeroTurno(CajeroTurno cajeroturno,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajeroTurno(cajeroturno,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajeroTurno(CajeroTurno cajeroturno,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.getText()==null || this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.getText()=="" || this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.getText()=="Id") {
				this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setText("0");
			}

			if(conColumnasBase) {cajeroturno.setId(Long.parseLong(this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajeroTurnoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelIdCajeroTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeroturno.sethora_inicio(new Time(((Date)this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajeroTurnoConstantesFunciones.LABEL_HORAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_inicioCajeroTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeroturno.sethora_fin(new Time(((Date)this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajeroTurnoConstantesFunciones.LABEL_HORAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_finCajeroTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajeroturno.sethora_servicio(new Time(((Date)this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajeroTurno.jLabelhora_servicioCajeroTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajeroTurno(CajeroTurno cajeroturnoBean,CajeroTurno cajeroturno,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajeroturnoBean.getid_vendedor()!=null && !cajeroturnoBean.getid_vendedor().equals(-1L))) {cajeroturno.setid_vendedor(cajeroturnoBean.getid_vendedor());}
			if(conDefault || (!conDefault && cajeroturnoBean.getid_caja()!=null && !cajeroturnoBean.getid_caja().equals(-1L))) {cajeroturno.setid_caja(cajeroturnoBean.getid_caja());}
			if(conDefault || (!conDefault && cajeroturnoBean.getid_mesa()!=null && !cajeroturnoBean.getid_mesa().equals(-1L))) {cajeroturno.setid_mesa(cajeroturnoBean.getid_mesa());}
			if(conDefault || (!conDefault && cajeroturnoBean.getid_turno_pun_ven()!=null && !cajeroturnoBean.getid_turno_pun_ven().equals(-1L))) {cajeroturno.setid_turno_pun_ven(cajeroturnoBean.getid_turno_pun_ven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajeroTurno(CajeroTurno cajeroturnoOrigen,CajeroTurno cajeroturno,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajeroturnoOrigen.getId()!=null && !cajeroturnoOrigen.getId().equals(0L))) {cajeroturno.setId(cajeroturnoOrigen.getId());}}
			if(conDefault || (!conDefault && cajeroturnoOrigen.getid_vendedor()!=null && !cajeroturnoOrigen.getid_vendedor().equals(-1L))) {cajeroturno.setid_vendedor(cajeroturnoOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.getid_caja()!=null && !cajeroturnoOrigen.getid_caja().equals(-1L))) {cajeroturno.setid_caja(cajeroturnoOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.getid_mesa()!=null && !cajeroturnoOrigen.getid_mesa().equals(-1L))) {cajeroturno.setid_mesa(cajeroturnoOrigen.getid_mesa());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.getid_turno_pun_ven()!=null && !cajeroturnoOrigen.getid_turno_pun_ven().equals(-1L))) {cajeroturno.setid_turno_pun_ven(cajeroturnoOrigen.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.gethora_inicio()!=null && !cajeroturnoOrigen.gethora_inicio().equals(new Time((new Date()).getTime())))) {cajeroturno.sethora_inicio(cajeroturnoOrigen.gethora_inicio());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.gethora_fin()!=null && !cajeroturnoOrigen.gethora_fin().equals(new Time((new Date()).getTime())))) {cajeroturno.sethora_fin(cajeroturnoOrigen.gethora_fin());}
			if(conDefault || (!conDefault && cajeroturnoOrigen.gethora_servicio()!=null && !cajeroturnoOrigen.gethora_servicio().equals(new Time((new Date()).getTime())))) {cajeroturno.sethora_servicio(cajeroturnoOrigen.gethora_servicio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajeroTurno(CajeroTurno cajeroturno) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setText(cajeroturno.getId().toString());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setValue(cajeroturno.gethora_inicio());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setValue(cajeroturno.gethora_fin());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setValue(cajeroturno.gethora_servicio());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajeroTurno(CajeroTurnoBean cajeroturnoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setText(cajeroturnoBean.getId().toString());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setValue(cajeroturnoBean.gethora_inicio());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setValue(cajeroturnoBean.gethora_fin());
			this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setValue(cajeroturnoBean.gethora_servicio());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajeroTurno(CajeroTurnoParameterReturnGeneral cajeroturnoReturnGeneral,CajeroTurnoBean cajeroturnoBean,Boolean conDefault) throws Exception { 
		try {
			CajeroTurno cajeroturnoLocal=new CajeroTurno();
			
			cajeroturnoLocal=cajeroturnoReturnGeneral.getCajeroTurno();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajeroturnoLocal.getId()!=null && !cajeroturnoLocal.getId().equals(0L))) {cajeroturnoBean.setId(cajeroturnoLocal.getId());}}
			if(conDefault || (!conDefault && cajeroturnoLocal.getid_vendedor()!=null && !cajeroturnoLocal.getid_vendedor().equals(-1L))) {cajeroturnoBean.setid_vendedor(cajeroturnoLocal.getid_vendedor());}
			if(conDefault || (!conDefault && cajeroturnoLocal.getid_caja()!=null && !cajeroturnoLocal.getid_caja().equals(-1L))) {cajeroturnoBean.setid_caja(cajeroturnoLocal.getid_caja());}
			if(conDefault || (!conDefault && cajeroturnoLocal.getid_mesa()!=null && !cajeroturnoLocal.getid_mesa().equals(-1L))) {cajeroturnoBean.setid_mesa(cajeroturnoLocal.getid_mesa());}
			if(conDefault || (!conDefault && cajeroturnoLocal.getid_turno_pun_ven()!=null && !cajeroturnoLocal.getid_turno_pun_ven().equals(-1L))) {cajeroturnoBean.setid_turno_pun_ven(cajeroturnoLocal.getid_turno_pun_ven());}
			if(conDefault || (!conDefault && cajeroturnoLocal.gethora_inicio()!=null && !cajeroturnoLocal.gethora_inicio().equals(new Time((new Date()).getTime())))) {cajeroturnoBean.sethora_inicio(cajeroturnoLocal.gethora_inicio());}
			if(conDefault || (!conDefault && cajeroturnoLocal.gethora_fin()!=null && !cajeroturnoLocal.gethora_fin().equals(new Time((new Date()).getTime())))) {cajeroturnoBean.sethora_fin(cajeroturnoLocal.gethora_fin());}
			if(conDefault || (!conDefault && cajeroturnoLocal.gethora_servicio()!=null && !cajeroturnoLocal.gethora_servicio().equals(new Time((new Date()).getTime())))) {cajeroturnoBean.sethora_servicio(cajeroturnoLocal.gethora_servicio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajeroTurnoGenerico(Long idCajeroTurnoSeleccionado,JComboBox jComboBoxCajeroTurno,List<CajeroTurno> cajeroturnosLocal)throws Exception {
		try {
			CajeroTurno  cajeroturnoTemp=null;

			for(CajeroTurno cajeroturnoAux:cajeroturnosLocal) {
				if(cajeroturnoAux.getId()!=null && cajeroturnoAux.getId().equals(idCajeroTurnoSeleccionado)) {
					cajeroturnoTemp=cajeroturnoAux;
					break;
				}
			}

			jComboBoxCajeroTurno.setSelectedItem(cajeroturnoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajeroTurnoGenerico(JComboBox jComboBoxCajeroTurno,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajeroTurno.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajeroTurno.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajeroTurno.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajeroTurno.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajeroturno=(CajeroTurno) cajeroturnoLogic.getCajeroTurnos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajeroturno =(CajeroTurno) cajeroturnos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getcaja_descripcion();
			}
		}

		if(sTipo.equals("Mesa")) {
			//sDescripcion=this.getActualMesaForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getmesa_descripcion();
			} else {
				//sDescripcion=this.getActualMesaForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getmesa_descripcion();
			}
		}

		if(sTipo.equals("TurnoPunVen")) {
			//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
			if(!cajeroturno.getIsNew() && !cajeroturno.getIsChanged() && !cajeroturno.getIsDeleted()) {
				sDescripcion=cajeroturno.getturnopunven_descripcion();
			} else {
				//sDescripcion=this.getActualTurnoPunVenForeignKeyDescripcion((Long)value);
				sDescripcion=cajeroturno.getturnopunven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajeroTurno cajeroturnoRow=new CajeroTurno();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajeroturnoRow=(CajeroTurno) cajeroturnoLogic.getCajeroTurnos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajeroturnoRow=(CajeroTurno) cajeroturnos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajeroTurno(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno));			
			this.jButtonDuplicarCajeroTurno.setVisible((this.isVisibilidadCeldaDuplicarCajeroTurno && this.isPermisoDuplicarCajeroTurno));			
			this.jButtonCopiarCajeroTurno.setVisible((this.isVisibilidadCeldaCopiarCajeroTurno && this.isPermisoCopiarCajeroTurno));
			this.jButtonVerFormCajeroTurno.setVisible((this.isVisibilidadCeldaVerFormCajeroTurno && this.isPermisoVerFormCajeroTurno));
			
			this.jButtonAbrirOrderByCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));			
			
			this.jButtonNuevoRelacionesCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeroTurno && this.isPermisoNuevoCajeroTurno));			
			this.jButtonNuevoGuardarCambiosCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarCajeroTurno.setVisible((this.isVisibilidadCeldaModificarCajeroTurno && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.setVisible((this.isVisibilidadCeldaActualizarCajeroTurno && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.setVisible((this.isVisibilidadCeldaEliminarCajeroTurno && this.isPermisoEliminarCajeroTurno));
			this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.setVisible(this.isVisibilidadCeldaCancelarCajeroTurno);							
			this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno));						
			this.jButtonDuplicarToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaDuplicarCajeroTurno && this.isPermisoDuplicarCajeroTurno));						
			this.jButtonCopiarToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaCopiarCajeroTurno && this.isPermisoCopiarCajeroTurno));			
			this.jButtonVerFormToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaVerFormCajeroTurno && this.isPermisoVerFormCajeroTurno));			
			this.jButtonAbrirOrderByToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));
			this.jButtonNuevoRelacionesToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeroTurno && this.isPermisoNuevoCajeroTurno));			
			this.jButtonNuevoGuardarCambiosToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));			
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaModificarCajeroTurno && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaActualizarCajeroTurno  && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaEliminarCajeroTurno && this.isPermisoEliminarCajeroTurno));
			this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarToolBarCajeroTurno.setVisible(this.isVisibilidadCeldaCancelarCajeroTurno);				
			this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno));			
			this.jMenuItemDuplicarCajeroTurno.setVisible((this.isVisibilidadCeldaDuplicarCajeroTurno && this.isPermisoDuplicarCajeroTurno));			
			this.jMenuItemCopiarCajeroTurno.setVisible((this.isVisibilidadCeldaCopiarCajeroTurno && this.isPermisoCopiarCajeroTurno));			
			this.jMenuItemVerFormCajeroTurno.setVisible((this.isVisibilidadCeldaVerFormCajeroTurno && this.isPermisoVerFormCajeroTurno));			
			this.jMenuItemAbrirOrderByCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));			
			//this.jMenuItemMostrarOcultarCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));
			this.jMenuItemDetalleAbrirOrderByCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));			
			//this.jMenuItemDetalleMostrarOcultarCajeroTurno.setVisible((this.isVisibilidadCeldaOrdenCajeroTurno && this.isPermisoOrdenCajeroTurno));			
			this.jMenuItemNuevoRelacionesCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajeroTurno && this.isPermisoNuevoCajeroTurno));			
			this.jMenuItemNuevoGuardarCambiosCajeroTurno.setVisible((this.isVisibilidadCeldaNuevoCajeroTurno && this.isPermisoNuevoCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));									
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemModificarCajeroTurno.setVisible((this.isVisibilidadCeldaModificarCajeroTurno && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemActualizarCajeroTurno.setVisible((this.isVisibilidadCeldaActualizarCajeroTurno && this.isPermisoActualizarCajeroTurno));	
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemEliminarCajeroTurno.setVisible((this.isVisibilidadCeldaEliminarCajeroTurno && this.isPermisoEliminarCajeroTurno));
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemCancelarCajeroTurno.setVisible(this.isVisibilidadCeldaCancelarCajeroTurno);				
			}
			
			this.jMenuItemGuardarCambiosCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));						
			this.jMenuItemGuardarCambiosTablaCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajeroTurno=this.jButtonNuevoCajeroTurno.isVisible();
			this.isVisibilidadCeldaDuplicarCajeroTurno=this.jButtonDuplicarCajeroTurno.isVisible();
			this.isVisibilidadCeldaCopiarCajeroTurno=this.jButtonCopiarCajeroTurno.isVisible();
			this.isVisibilidadCeldaVerFormCajeroTurno=this.jButtonVerFormCajeroTurno.isVisible();
			
			this.isVisibilidadCeldaOrdenCajeroTurno=this.jButtonAbrirOrderByCajeroTurno.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=this.jButtonNuevoRelacionesCajeroTurno.isVisible();
			this.isVisibilidadCeldaModificarCajeroTurno=this.jButtonModificarCajeroTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.isVisibilidadCeldaActualizarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.isVisible();
			this.isVisibilidadCeldaEliminarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.isVisible();
			this.isVisibilidadCeldaCancelarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.isVisible();
			this.isVisibilidadCeldaGuardarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=this.jButtonGuardarCambiosTablaCajeroTurno.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajeroTurno=this.jButtonNuevoToolBarCajeroTurno.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=this.jButtonNuevoRelacionesToolBarCajeroTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.isVisibilidadCeldaModificarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarToolBarCajeroTurno.isVisible();
			this.isVisibilidadCeldaActualizarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarToolBarCajeroTurno.isVisible();
			this.isVisibilidadCeldaEliminarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarToolBarCajeroTurno.isVisible();
			this.isVisibilidadCeldaCancelarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarToolBarCajeroTurno.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajeroTurno=this.jButtonGuardarCambiosToolBarCajeroTurno.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=this.jButtonGuardarCambiosTablaToolBarCajeroTurno.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajeroTurno=this.jMenuItemNuevoCajeroTurno.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=this.jMenuItemNuevoRelacionesCajeroTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.isVisibilidadCeldaModificarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jMenuItemModificarCajeroTurno.isVisible();
			this.isVisibilidadCeldaActualizarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jMenuItemActualizarCajeroTurno.isVisible();
			this.isVisibilidadCeldaEliminarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jMenuItemEliminarCajeroTurno.isVisible();
			this.isVisibilidadCeldaCancelarCajeroTurno=this.jInternalFrameDetalleFormCajeroTurno.jMenuItemCancelarCajeroTurno.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajeroTurno=this.jMenuItemGuardarCambiosCajeroTurno.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=this.jMenuItemGuardarCambiosTablaCajeroTurno.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajeroTurno(Boolean esInicializar) {
		if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
				//if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajeroTurno();
			}
			
			this.inicializarActualizarBindingBotonesManualCajeroTurno(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajeroTurno() {
		this.jButtonNuevoCajeroTurno.setVisible(this.isPermisoNuevoCajeroTurno);			
		this.jButtonDuplicarCajeroTurno.setVisible(this.isPermisoDuplicarCajeroTurno);			
		this.jButtonCopiarCajeroTurno.setVisible(this.isPermisoCopiarCajeroTurno);			
		this.jButtonVerFormCajeroTurno.setVisible(this.isPermisoVerFormCajeroTurno);			
		
		this.jButtonAbrirOrderByCajeroTurno.setVisible(this.isPermisoOrdenCajeroTurno);					
		
		this.jButtonNuevoRelacionesCajeroTurno.setVisible(this.isPermisoNuevoCajeroTurno);			
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarCajeroTurno.setVisible(this.isPermisoActualizarCajeroTurno);	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.setVisible(this.isPermisoActualizarCajeroTurno);	
			this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.setVisible(this.isPermisoEliminarCajeroTurno);
			this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.setVisible(this.isVisibilidadCeldaCancelarCajeroTurno);						
			this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.setVisible(this.isPermisoGuardarCambiosCajeroTurno);							
		}
		
		this.jButtonGuardarCambiosTablaCajeroTurno.setVisible(this.isPermisoActualizarCajeroTurno);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajeroTurno() {
		this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarCajeroTurno.setVisible(this.isPermisoActualizarCajeroTurno);	
		this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.setVisible(this.isPermisoActualizarCajeroTurno);	
		this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.setVisible(this.isPermisoEliminarCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.setVisible(this.isVisibilidadCeldaCancelarCajeroTurno);							
		this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.setVisible((this.isVisibilidadCeldaGuardarCajeroTurno && this.isPermisoGuardarCambiosCajeroTurno));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajeroTurno() {
		if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajeroTurno();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajeroTurno() {
	}
	
	public void jTableDatosCajeroTurnoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajeroTurno(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajeroturno.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajeroTurno.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajeroturno.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajeroTurno.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajeroturno.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderCajeroTurno.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.cajeroturno.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderCajeroTurno.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.cajeroturno.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajeroTurno.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajeroturno.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesaCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesa=true;

			idTienePermisomesa=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(MesaConstantesFunciones.CLASSNAME);

			if(idTienePermisomesa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.mesaBeanSwingJInternalFrame=new MesaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesaBeanSwingJInternalFrame.getMesaLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_mesa()!=null) {
					this.mesaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesaBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_mesa());
					this.mesaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMesa();
				}

				JInternalFrameBase jinternalFrame =this.mesaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBordermesa=(TitledBorder)this.mesaBeanSwingJInternalFrame.jScrollPanelDatosMesa.getBorder();

				titledBordermesa.setTitle(titledBorderCajeroTurno.getTitle() + " -> Mesa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesaCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_mesa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mesa = "+this.cajeroturno.getid_mesa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_turno_pun_venCajeroTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoturnopunven=true;

			idTienePermisoturnopunven=this.tienePermisosUsuarioEnPaginaWebCajeroTurno(TurnoPunVenConstantesFunciones.CLASSNAME);

			if(idTienePermisoturnopunven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajeroTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajeroTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);

				this.turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.turnopunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.turnopunvenBeanSwingJInternalFrame.getTurnoPunVenLogic().setConnexion(this.cajeroturnoLogic.getConnexion());

				if(this.cajeroturno.getid_turno_pun_ven()!=null) {
					this.turnopunvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.turnopunvenBeanSwingJInternalFrame.setIdActual(this.cajeroturno.getid_turno_pun_ven());
					this.turnopunvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.turnopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTurnoPunVen();
				}

				JInternalFrameBase jinternalFrame =this.turnopunvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajeroTurno=(TitledBorder)this.jScrollPanelDatosCajeroTurno.getBorder();
				TitledBorder titledBorderturnopunven=(TitledBorder)this.turnopunvenBeanSwingJInternalFrame.jScrollPanelDatosTurnoPunVen.getBorder();

				titledBorderturnopunven.setTitle(titledBorderCajeroTurno.getTitle() + " -> Turno Pun Ven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_turno_pun_venCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.getid_turno_pun_ven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_turno_pun_ven = "+this.cajeroturno.getid_turno_pun_ven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_inicioCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.gethora_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_inicio = "+this.cajeroturno.gethora_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_finCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.gethora_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_fin = "+this.cajeroturno.gethora_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_servicioCajeroTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.getcajeroturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajeroturno==null) {
						this.cajeroturno = new CajeroTurno();
					}

					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);
				}

				if(this.cajeroturno.gethora_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_servicio = "+this.cajeroturno.gethora_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajeroTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdCaja();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdEmpresa();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesaCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdMesa();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdSucursal();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTurnoPunVenCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdTurnoPunVen();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdUsuario();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorCajeroTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajeroTurno(false,false);

			this.getCajeroTurnosFK_IdVendedor();

			this.inicializarActualizarBindingCajeroTurno(false);

			//if(CajeroTurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajeroTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajeroturnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajeroTurno() {
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
			this.jInternalFrameDetalleFormCajeroTurno.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajeroTurno.dispose();
			this.jInternalFrameDetalleFormCajeroTurno=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
			this.jInternalFrameReporteDinamicoCajeroTurno.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajeroTurno.dispose();
			this.jInternalFrameReporteDinamicoCajeroTurno=null;
		}
		
		if(this.jInternalFrameImportacionCajeroTurno!=null) {
			this.jInternalFrameImportacionCajeroTurno.setVisible(false);	    			
			this.jInternalFrameImportacionCajeroTurno.dispose();
			this.jInternalFrameImportacionCajeroTurno=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajeroTurno();
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajeroTurno")) {
				jButtonDuplicarCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajeroTurno")) {
				jButtonCopiarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajeroTurno")) {
				jButtonVerFormCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajeroTurno")) {
				jButtonDuplicarCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajeroTurno")) {
				jButtonDuplicarCajeroTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajeroTurno")) {
				jButtonModificarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajeroTurno")) {
				jButtonModificarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajeroTurno")) {
				jButtonModificarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajeroTurno")) {
				jButtonActualizarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajeroTurno")) {
				jButtonActualizarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajeroTurno")) {
				jButtonActualizarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajeroTurno")) {
				jButtonEliminarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajeroTurno")) {
				jButtonEliminarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajeroTurno")) {
				jButtonEliminarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajeroTurno")) {
				jButtonCancelarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajeroTurno")) {
				jButtonCancelarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajeroTurno")) {
				jButtonCancelarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajeroTurno")) {
				jButtonCerrarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajeroTurno")) {
				jButtonCerrarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajeroTurno")) {
				jButtonCerrarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajeroTurno")) {
				jButtonMostrarOcultarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajeroTurno")) {
				jButtonCancelarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajeroTurno")) {
				jButtonCopiarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajeroTurno")) {
				jButtonVerFormCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajeroTurno")) {
				jButtonCopiarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajeroTurno")) {
				jButtonVerFormCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajeroTurno")) {
				jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajeroTurno")) {
				jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajeroTurno")) {
				jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajeroTurno")) {
				jButtonAnterioresCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajeroTurno")) {
				jButtonAnterioresCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajeroTurno")) {
				jButtonAnterioresCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajeroTurno")) {
				jButtonSiguientesCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajeroTurno")) {
				jButtonSiguientesCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajeroTurno")) {
				jButtonSiguientesCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajeroTurno") || sTipo.equals("MenuItemDetalleAbrirOrderByCajeroTurno")) {
				jButtonAbrirOrderByCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajeroTurno") || sTipo.equals("MenuItemDetalleMostrarOcultarCajeroTurno")) {
				jButtonMostrarOcultarCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajeroTurno")) {
				jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajeroTurno")) {
				jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajeroTurno")) {
				jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajeroTurno")) {
				jButtonCerrarReporteDinamicoCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajeroTurno")) {
				jButtonGenerarReporteDinamicoCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajeroTurno")) {
				
				jButtonGenerarExcelReporteDinamicoCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajeroTurno")) {
				jButtonCerrarImportacionCajeroTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajeroTurno")) {
				
				jButtonGenerarImportacionCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajeroTurno")) {
				
				jButtonAbrirImportacionCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajeroTurno")) {
				jComboBoxTiposAccionesCajeroTurnoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajeroTurno")) {
				jComboBoxTiposRelacionesCajeroTurnoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajeroTurno")) {
				jComboBoxTiposAccionesCajeroTurnoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajeroTurno")) {
				
				jComboBoxTiposSeleccionarCajeroTurnoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajeroTurno")) {
				jTextFieldValorCampoGeneralCajeroTurnoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajeroTurno")) {
				jButtonAbrirOrderByCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajeroTurno")) {
				jButtonAbrirOrderByCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajeroTurno")) {
				jButtonCerrarOrderByCajeroTurnoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajeroTurnoBusqueda")) {
				this.jButtonidCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajeroTurnoUpdate")) {
				this.jButtonid_empresaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajeroTurnoBusqueda")) {
				this.jButtonid_empresaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajeroTurnoUpdate")) {
				this.jButtonid_sucursalCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajeroTurnoBusqueda")) {
				this.jButtonid_sucursalCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajeroTurnoUpdate")) {
				this.jButtonid_usuarioCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajeroTurnoBusqueda")) {
				this.jButtonid_usuarioCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCajeroTurnoUpdate")) {
				this.jButtonid_vendedorCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCajeroTurnoBusqueda")) {
				this.jButtonid_vendedorCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajeroTurnoUpdate")) {
				this.jButtonid_cajaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajeroTurnoBusqueda")) {
				this.jButtonid_cajaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesaCajeroTurnoUpdate")) {
				this.jButtonid_mesaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesaCajeroTurnoBusqueda")) {
				this.jButtonid_mesaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajeroTurnoUpdate")) {
				this.jButtonid_turno_pun_venCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajeroTurnoBusqueda")) {
				this.jButtonid_turno_pun_venCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_inicioCajeroTurnoBusqueda")) {
				this.jButtonhora_inicioCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_finCajeroTurnoBusqueda")) {
				this.jButtonhora_finCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_servicioCajeroTurnoBusqueda")) {
				this.jButtonhora_servicioCajeroTurnoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCajaCajeroTurno")) {
				this.jButtonFK_IdCajaCajeroTurnoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesaCajeroTurno")) {
				this.jButtonFK_IdMesaCajeroTurnoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTurnoPunVenCajeroTurno")) {
				this.jButtonFK_IdTurnoPunVenCajeroTurnoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdVendedorCajeroTurno")) {
				this.jButtonFK_IdVendedorCajeroTurnoActionPerformed(evt);
			}
			
			;
			
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajeroTurno();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajeroTurno cajeroturnoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajeroturnoLocal=this.cajeroturno;
			} else {
				cajeroturnoLocal=this.cajeroturnoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
							
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
								
						
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
								
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
							
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
								
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajeroTurno")) {
					jCheckBoxSeleccionarTodosCajeroTurnoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajeroTurno")) {
					jCheckBoxSeleccionadosCajeroTurnoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajeroTurno")) {
					
				}
				
				


				
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
												
				
				


				
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajeroTurnoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajeroturno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajeroturno);
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajeroTurno.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajeroTurno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajeroTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajeroturnoAnterior =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajeroTurno")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajeroTurnoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajeroTurno.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajeroturno =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajeroturno =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajeroturno);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajeroTurno")) {
				
				}
				
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajeroTurno")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajeroTurno.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajeroTurno")) {
			
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajeroTurno();
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			if(sTipo.equals("NuevoCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajeroTurno")) {
				jButtonDuplicarCajeroTurnoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajeroTurno")) {
				jButtonCopiarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajeroTurno")) {
				jButtonVerFormCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajeroTurno")) {
				jButtonNuevoCajeroTurnoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajeroTurno")) {
				jButtonModificarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajeroTurno")) {
				jButtonActualizarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajeroTurno")) {
				jButtonEliminarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajeroTurno")) {
				jButtonCancelarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajeroTurno")) {
				jButtonCerrarCajeroTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajeroTurno")) {
				jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajeroTurno")) {
				jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajeroTurno")) {
				jButtonAbrirOrderByCajeroTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajeroTurno")) {
				jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajeroTurno")) {
				jButtonAnterioresCajeroTurnoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajeroTurno")) {
				jButtonSiguientesCajeroTurnoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajeroTurnoBusqueda")) {
				this.jButtonidCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajeroTurnoUpdate")) {
				this.jButtonid_empresaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajeroTurnoBusqueda")) {
				this.jButtonid_empresaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajeroTurnoUpdate")) {
				this.jButtonid_sucursalCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajeroTurnoBusqueda")) {
				this.jButtonid_sucursalCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajeroTurnoUpdate")) {
				this.jButtonid_usuarioCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajeroTurnoBusqueda")) {
				this.jButtonid_usuarioCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCajeroTurnoUpdate")) {
				this.jButtonid_vendedorCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCajeroTurnoBusqueda")) {
				this.jButtonid_vendedorCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajeroTurnoUpdate")) {
				this.jButtonid_cajaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajeroTurnoBusqueda")) {
				this.jButtonid_cajaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesaCajeroTurnoUpdate")) {
				this.jButtonid_mesaCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesaCajeroTurnoBusqueda")) {
				this.jButtonid_mesaCajeroTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_turno_pun_venCajeroTurnoUpdate")) {
				this.jButtonid_turno_pun_venCajeroTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_turno_pun_venCajeroTurnoBusqueda")) {
				this.jButtonid_turno_pun_venCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_inicioCajeroTurnoBusqueda")) {
				this.jButtonhora_inicioCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_finCajeroTurnoBusqueda")) {
				this.jButtonhora_finCajeroTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_servicioCajeroTurnoBusqueda")) {
				this.jButtonhora_servicioCajeroTurnoBusquedaActionPerformed(evt);
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajeroTurno();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajeroTurno")) {
				closingInternalFrameCajeroTurno();
				
			} else if(sTipo.equals("jButtonCancelarCajeroTurno")) {
				JInternalFrameBase jInternalFrameDetalleFormCajeroTurno = (JInternalFrameBase)evt.getSource();
	            	
	            CajeroTurnoBeanSwingJInternalFrame jInternalFrameParent=(CajeroTurnoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajeroTurno.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajeroTurnoActionPerformed(null);
			}
			
			CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajeroturno,new Object(),this.cajeroturnoParameterGeneral,this.cajeroturnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajeroTurno(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajeroTurno(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajeroTurno(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajeroturno)) {
			if(!esControlTabla) {
				if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);			
				}
				
				if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajeroTurno(this.cajeroturno,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajeroturnoReturnGeneral=cajeroturnoLogic.procesarEventosCajeroTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeroturnoLogic.getCajeroTurnos(),this.cajeroturno,this.cajeroturnoParameterGeneral,this.isEsNuevoCajeroTurno,classes);//this.cajeroturnoLogic.getCajeroTurno()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajeroTurno(this.cajeroturnoReturnGeneral,this.cajeroturnoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajeroTurno(classes,this.cajeroturnoReturnGeneral,this.cajeroturnoBean,false);
					}
						
					if(this.cajeroturnoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno());	
					}
						
					if(this.cajeroturnoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno(),classes);//this.cajeroturnoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajeroTurno(this.cajeroturno,classes);//this.cajeroturnoBean);									
				}
			
				if(CajeroTurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajeroTurno(this.cajeroturno,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajeroTurno(this.cajeroturno);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajeroturnoAnterior!=null) {
						this.cajeroturno=this.cajeroturnoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajeroturnoReturnGeneral=cajeroturnoLogic.procesarEventosCajeroTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeroturnoLogic.getCajeroTurnos(),this.cajeroturno,this.cajeroturnoParameterGeneral,this.isEsNuevoCajeroTurno,classes);//this.cajeroturnoLogic.getCajeroTurno()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajeroturnoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajeroturnoReturnGeneral.getCajeroTurno(),cajeroturnoLogic.getCajeroTurnos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajeroturnoReturnGeneral.getCajeroTurno(),this.cajeroturnos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajeroTurno.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajeroTurno.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajeroTurno();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajeroTurno() throws Exception {
		
		CajeroTurnoModel cajeroturnoModel=(CajeroTurnoModel)this.jTableDatosCajeroTurno.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajeroturnoModel.cajeroturnos=this.cajeroturnoLogic.getCajeroTurnos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajeroturnoModel.cajeroturnos=this.cajeroturnos;
		}
		
		
		((CajeroTurnoModel) this.jTableDatosCajeroTurno.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajeroTurno() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajeroturnoAnterior(),this.cajeroturnoLogic.getCajeroTurnos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajeroturnoAnterior(),this.cajeroturnos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajeroTurno();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajeroTurno(CajeroTurno cajeroturno,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeroturno,new Object(),generalEntityParameterGeneral,this.cajeroturnoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajeroTurnoConstantesFunciones.getClassesRelationshipsOfCajeroTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajeroTurnoConstantesFunciones.getClassesRelationshipsFromStringsOfCajeroTurno(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajeroTurno(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajeroTurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajeroturno,new Object(),generalEntityParameterGeneral,this.cajeroturnoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajeroTurno(CajeroTurnoBean cajeroturnoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajeroTurno(ArrayList<Classe> classes,CajeroTurnoReturnGeneral cajeroturnoReturnGeneral,CajeroTurnoBean cajeroturnoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajeroTurno(CajeroTurno cajeroturno,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajeroturno)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajeroTurno = new CajeroTurnoDetalleFormJInternalFrame(jDesktopPane,this.cajeroturnoSessionBean.getConGuardarRelaciones(),this.cajeroturnoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.setVisible(false);
		this.jInternalFrameDetalleFormCajeroTurno.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajeroTurno.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajeroTurno.cajeroturnoLogic=this.cajeroturnoLogic;
		
		this.cargarCombosFrameForeignKeyCajeroTurno("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajeroTurno();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajeroTurno();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajeroTurno("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajeroTurno();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajeroTurno.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajeroTurno"));
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarCajeroTurno.addActionListener(new ButtonActionListener(this,"ModificarCajeroTurno"));

		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajeroTurno"));
					
		this.jInternalFrameDetalleFormCajeroTurno.jMenuItemModificarCajeroTurno.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajeroTurno"));		
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.addActionListener (new ButtonActionListener(this,"ActualizarCajeroTurno"));
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajeroTurno"));
						
		this.jInternalFrameDetalleFormCajeroTurno.jMenuItemActualizarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajeroTurno"));		
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.addActionListener (new ButtonActionListener(this,"EliminarCajeroTurno"));
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajeroTurno"));
								
		this.jInternalFrameDetalleFormCajeroTurno.jMenuItemEliminarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajeroTurno"));		
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.addActionListener (new ButtonActionListener(this,"CancelarCajeroTurno"));
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajeroTurno"));
					
		this.jInternalFrameDetalleFormCajeroTurno.jMenuItemCancelarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajeroTurno"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jMenuItemDetalleCerrarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajeroTurno"));		
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeroTurno"));
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeroTurno"));
		
		
		
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajeroTurno"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonidCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_inicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_finCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_finCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_servicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_servicioCajeroTurnoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajeroTurno"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajeroTurno"));
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajeroTurno"));
		}
		
		this.jTableDatosCajeroTurno.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajeroTurno"));
		
		this.jTableDatosCajeroTurno.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajeroTurno"));
		
		this.jButtonNuevoCajeroTurno.addActionListener(new ButtonActionListener(this,"NuevoCajeroTurno"));
		
		this.jButtonDuplicarCajeroTurno.addActionListener(new ButtonActionListener(this,"DuplicarCajeroTurno"));
		
		this.jButtonCopiarCajeroTurno.addActionListener(new ButtonActionListener(this,"CopiarCajeroTurno"));
		
		this.jButtonVerFormCajeroTurno.addActionListener(new ButtonActionListener(this,"VerFormCajeroTurno"));
		
		
		this.jButtonNuevoToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajeroTurno"));
			
		this.jButtonDuplicarToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajeroTurno"));
			
		this.jMenuItemNuevoCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajeroTurno"));
			
		this.jMenuItemDuplicarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajeroTurno"));		
		
		
		this.jButtonNuevoRelacionesCajeroTurno.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajeroTurno"));
		
		
		this.jButtonNuevoRelacionesToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajeroTurno"));
			
		this.jMenuItemNuevoRelacionesCajeroTurno.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajeroTurno"));		
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarCajeroTurno.addActionListener(new ButtonActionListener(this,"ModificarCajeroTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonModificarToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajeroTurno"));
			
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemModificarCajeroTurno.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajeroTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarCajeroTurno.addActionListener (new ButtonActionListener(this,"ActualizarCajeroTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonActualizarToolBarCajeroTurno.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajeroTurno"));
				
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemActualizarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajeroTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarCajeroTurno.addActionListener (new ButtonActionListener(this,"EliminarCajeroTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonEliminarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajeroTurno"));
						
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemEliminarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajeroTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarCajeroTurno.addActionListener (new ButtonActionListener(this,"CancelarCajeroTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonCancelarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajeroTurno"));
			
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemCancelarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajeroTurno"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajeroTurno"));		
		
		
		this.jButtonCerrarCajeroTurno.addActionListener (new ButtonActionListener(this,"CerrarCajeroTurno"));
		
		
		this.jButtonCerrarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajeroTurno"));
			
		this.jMenuItemCerrarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajeroTurno"));
			
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jMenuItemDetalleCerrarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajeroTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajeroTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajeroTurno"));
		}
		
		this.jButtonCopiarToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajeroTurno"));
			
		this.jButtonVerFormToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajeroTurno"));
		
		this.jMenuItemGuardarCambiosCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajeroTurno"));
			
		this.jMenuItemCopiarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajeroTurno"));		
		
		this.jMenuItemVerFormCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajeroTurno"));		
		
		
		this.jButtonGuardarCambiosTablaCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajeroTurno"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajeroTurno"));
			
		this.jMenuItemGuardarCambiosTablaCajeroTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajeroTurno"));		
		
		
		
		this.jButtonRecargarInformacionCajeroTurno.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajeroTurno"));
					
		this.jButtonRecargarInformacionToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajeroTurno"));
		
		this.jMenuItemRecargarInformacionCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajeroTurno"));		
		
		
		
		this.jButtonAnterioresCajeroTurno.addActionListener (new ButtonActionListener(this,"AnterioresCajeroTurno"));
		
		
		this.jButtonAnterioresToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajeroTurno"));
		
		this.jMenuItemAnterioresCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajeroTurno"));		
		
		
		this.jButtonSiguientesCajeroTurno.addActionListener (new ButtonActionListener(this,"SiguientesCajeroTurno"));
		
		
		this.jButtonSiguientesToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajeroTurno"));
			
		this.jMenuItemSiguientesCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajeroTurno"));
			
		this.jMenuItemAbrirOrderByCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajeroTurno"));
			
		this.jMenuItemMostrarOcultarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajeroTurno"));
			
		this.jMenuItemDetalleAbrirOrderByCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajeroTurno"));
			
		this.jMenuItemDetalleMostarOcultarCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajeroTurno"));		
		
		
		this.jButtonNuevoGuardarCambiosCajeroTurno.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajeroTurno"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajeroTurno"));
			
		this.jMenuItemNuevoGuardarCambiosCajeroTurno.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajeroTurno"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajeroTurno.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajeroTurno"));

		this.jCheckBoxSeleccionadosCajeroTurno.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajeroTurno"));
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajeroTurno"));
		}
		
		
		this.jComboBoxTiposRelacionesCajeroTurno.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajeroTurno"));
			
		this.jComboBoxTiposAccionesCajeroTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesCajeroTurno"));
					
		this.jComboBoxTiposSeleccionarCajeroTurno.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajeroTurno"));
			
		this.jTextFieldValorCampoGeneralCajeroTurno.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajeroTurno"));		
		
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonidCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_inicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_finCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_finCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_servicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_servicioCajeroTurnoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajeroTurno"));

			this.jButtonFK_IdMesaCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdMesaCajeroTurno"));

			this.jButtonFK_IdTurnoPunVenCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajeroTurno"));

			this.jButtonFK_IdVendedorCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdVendedorCajeroTurno"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajeroTurno!=null) {
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeroTurno"));
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeroTurno"));
				this.jInternalFrameReporteDinamicoCajeroTurno.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeroTurno"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajeroTurno.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajeroTurno"));				
			//this.jButtonGenerarReporteDinamicoCajeroTurno.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajeroTurno"));
			//this.jButtonGenerarExcelReporteDinamicoCajeroTurno.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajeroTurno"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajeroTurno!=null) {
				this.jInternalFrameImportacionCajeroTurno.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajeroTurno"));
				this.jInternalFrameImportacionCajeroTurno.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajeroTurno"));
				this.jInternalFrameImportacionCajeroTurno.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajeroTurno"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajeroTurno.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajeroTurno"));
			
			this.jButtonAbrirOrderByToolBarCajeroTurno.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajeroTurno"));			
			
			if(this.jInternalFrameOrderByCajeroTurno!=null) {
				this.jInternalFrameOrderByCajeroTurno.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajeroTurno"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajeroTurno.jTabbedPaneRelacionesCajeroTurno.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajeroTurno"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameCajeroTurno();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajeroTurno.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajeroTurno = (JInternalFrameBase)event.getSource();
	            	
	            CajeroTurnoBeanSwingJInternalFrame jInternalFrameParent=(CajeroTurnoBeanSwingJInternalFrame)jInternalFrameDetalleFormCajeroTurno.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajeroTurnoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajeroTurno.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajeroTurnoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajeroTurno.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajeroTurno.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajeroTurno";
		inputMap = this.jButtonNuevoCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajeroTurnoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajeroTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajeroTurno";
		inputMap = this.jButtonNuevoRelacionesCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajeroTurnoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajeroTurno";
		inputMap = this.jButtonModificarCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajeroTurno";
		inputMap = this.jButtonActualizarCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajeroTurno";
		inputMap = this.jButtonEliminarCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajeroTurno";
		inputMap = this.jButtonCancelarCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajeroTurno";
		inputMap = this.jButtonCerrarCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajeroTurno";
		inputMap = this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajeroTurno.jButtonGuardarCambiosCajeroTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajeroTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajeroTurno.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajeroTurnoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajeroTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajeroTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajeroTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajeroTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajeroTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajeroTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonidCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_empresaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_sucursalCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_usuarioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_vendedorCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_cajaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_mesaCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesaCajeroTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonid_turno_pun_venCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_turno_pun_venCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_inicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_inicioCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_finCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_finCajeroTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajeroTurno.jButtonhora_servicioCajeroTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_servicioCajeroTurnoBusqueda"));
		
		
		this.jButtonFK_IdCajaCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajeroTurno"));

		this.jButtonFK_IdMesaCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdMesaCajeroTurno"));

		this.jButtonFK_IdTurnoPunVenCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdTurnoPunVenCajeroTurno"));

		this.jButtonFK_IdVendedorCajeroTurno.addActionListener(new ButtonActionListener(this,"FK_IdVendedorCajeroTurno"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajeroTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajeroTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajeroTurnoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajeroTurno.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajeroTurno(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
					cajeroturnoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajeroTurno cajeroturnoAux:cajeroturnos) {
					cajeroturnoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajeroTurnoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
						cajeroturnoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajeroTurno cajeroturnoAux:cajeroturnos) {
						cajeroturnoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajeroTurno cajeroturnoAux:cajeroturnos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajeroTurno(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajeroTurno.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajeroTurno.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajeroTurnoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajeroTurno.getSelectedRows();
			
			CajeroTurno cajeroturnoLocal=new CajeroTurno();
			
			//this.seleccionarTodosCajeroTurno(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajeroturnoLocal =(CajeroTurno) this.cajeroturnoLogic.getCajeroTurnos().toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajeroturnoLocal =(CajeroTurno) this.cajeroturnos.toArray()[this.jTableDatosCajeroTurno.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajeroturnoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
						cajeroturnoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajeroTurno cajeroturnoAux:cajeroturnos) {
						cajeroturnoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajeroTurno(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajeroTurno.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajeroTurno.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajeroTurno,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajeroTurnoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajeroTurnoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajeroTurnoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajeroTurno.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajeroTurno cajeroturnoAux:this.cajeroturnoLogic.getCajeroTurnos()) {
				
						if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO)) {
							existe=true;
							cajeroturnoAux.sethora_inicio(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAFIN)) {
							existe=true;
							cajeroturnoAux.sethora_fin(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO)) {
							existe=true;
							cajeroturnoAux.sethora_servicio(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajeroTurno cajeroturnoAux:cajeroturnos) {
					
						if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO)) {
							existe=true;
							cajeroturnoAux.sethora_inicio(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAFIN)) {
							existe=true;
							cajeroturnoAux.sethora_fin(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO)) {
							existe=true;
							cajeroturnoAux.sethora_servicio(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajeroTurno(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajeroTurnoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajeroTurno=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajeroTurno.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajeroTurno) {				
					conSplash=true;//false;										
					
					//this.startProcessCajeroTurno(conSplash);
				
					this.generarReporteCajeroTurnosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajeroTurnosSeleccionados();
				//this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajeroTurnosSeleccionados(false);
				//this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajeroTurnosSeleccionados(true);
				//this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajeroTurno();
				
				this.exportarCajeroTurnosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajeroTurnos();
				//this.importarCajeroTurnos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajeroTurno();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajeroTurnosSeleccionados();
				//this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cajero Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajeroTurno();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajeroTurno)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajeroTurno(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
				}	
			} 			
			else if(CajeroTurnoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajeroTurno) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajeroTurno(conSplash);
					
						//this.actualizarParametrosGeneralCajeroTurno();
						
						this.generarReporteProcesoAccionCajeroTurnosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajeroTurnoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cajero TurnoS SELECCIONADOS?", "MANTENIMIENTO DE Cajero Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajeroTurno();
				
						this.actualizarParametrosGeneralCajeroTurno();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajeroturnoReturnGeneral=cajeroturnoLogic.procesarAccionCajeroTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajeroturnoLogic.getCajeroTurnos(),this.cajeroturnoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajeroTurnoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajeroTurno();
					
					CajeroTurnoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajeroTurnoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajeroTurno.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajeroTurno.jComboBoxTiposAccionesFormularioCajeroTurno.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajeroTurno(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajeroTurnoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajeroTurno();
			
			if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
			CajeroTurno cajeroturno=new CajeroTurno();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajeroTurno(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajeroTurno.getSelectedItem();
			
			
			
			
			cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajeroturnosSeleccionados.size()==1) {
				for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
					cajeroturno=cajeroturnoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajeroTurno();
			
      		//this.finishProcessCajeroTurno(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajeroTurnoReturnGeneral() throws Exception {
		if(this.cajeroturnoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajeroturnoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajeroturnoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajeroturnoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajeroturnoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajeroturnoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajeroTurno(false);
		}
		
		if(this.cajeroturnoReturnGeneral.getConRetornoLista() || this.cajeroturnoReturnGeneral.getConRetornoObjeto()) {
			if(this.cajeroturnoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajeroturnoLogic.setCajeroTurnos(this.cajeroturnoReturnGeneral.getCajeroTurnos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajeroturnoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajeroturnoLogic.setCajeroTurno(this.cajeroturnoReturnGeneral.getCajeroTurno());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajeroTurno(false);
		}
	}
	
	public void actualizarParametrosGeneralCajeroTurno() throws Exception {
		
		
	}
	
	public ArrayList<CajeroTurno> getCajeroTurnosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajeroTurno) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajeroTurno cajeroturnoAux:cajeroturnoLogic.getCajeroTurnos()) {
					if(cajeroturnoAux.getIsSelected()) {
						cajeroturnosSeleccionados.add(cajeroturnoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajeroTurno cajeroturnoAux:this.cajeroturnos) {
					if(cajeroturnoAux.getIsSelected()) {
						cajeroturnosSeleccionados.add(cajeroturnoAux);				
					}
				}
			}
			
			if(cajeroturnosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajeroturnosSeleccionados.addAll(this.cajeroturnoLogic.getCajeroTurnos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajeroturnosSeleccionados.addAll(this.cajeroturnos);				
					}
				}
			}
		} else {
			cajeroturnosSeleccionados.add(this.cajeroturno);
		}
		
		return cajeroturnosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteCajeroTurnosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajeroTurnosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajeroTurnosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajeroTurnosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajeroTurnosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cajero Turno",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados);
		
	}	
	
	public void generarReporteNormalCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajeroTurnosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajeroTurno();
		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajeroTurno();
		
		
		//this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados ,cajeroturnoImplementable,cajeroturnoImplementableHome);
	}
	
	public void mostrarImportacionCajeroTurnos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajeroTurno();
		
		this.abrirFrameImportacionCajeroTurno();		
		
			
		//this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados ,cajeroturnoImplementable,cajeroturnoImplementableHome);
	}
	
	public void importarCajeroTurnos() throws Exception {		
	
	}
	
	public void exportarCajeroTurnosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajeroTurnosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajeroTurnosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajeroTurnosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cajero Turno",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajeroTurno(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajeroTurno(cajeroturnoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajeroturnoAux.setsDetalleGeneralEntityReporte(cajeroturnoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajeroTurno(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDMESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_HORAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_HORAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajeroTurno(CajeroTurno cajeroturno,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajeroturno.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getmesa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.getturnopunven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.gethora_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.gethora_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajeroturno.gethora_servicio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajeroTurnos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajeroTurno(row);				
				iRow++;
			}				
			
			for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajeroTurno(cajeroturnoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajeroTurnosSeleccionados() throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();		
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajeroturno.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajeroturnos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajeroturno");
			//elementRoot.appendChild(element);
		
			for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
				element = document.createElement("cajeroturno");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajeroTurno(cajeroturnoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cajero Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajeroTurno(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDMESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajeroTurno(CajeroTurno cajeroturno,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getmesa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.getturnopunven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.gethora_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.gethora_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(cajeroturno.gethora_servicio());				
	}
	
	public void setFilaDatosExportarXmlCajeroTurno(CajeroTurno cajeroturno,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajeroTurnoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajeroturno.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajeroTurnoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajeroturno.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajeroturno.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajeroturno.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(cajeroturno.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementvendedor_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(cajeroturno.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementcaja_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajeroturno.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementmesa_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDMESA);
		elementmesa_descripcion.appendChild(document.createTextNode(cajeroturno.getmesa_descripcion()));
		element.appendChild(elementmesa_descripcion);

		Element elementturnopunven_descripcion = document.createElement(CajeroTurnoConstantesFunciones.IDTURNOPUNVEN);
		elementturnopunven_descripcion.appendChild(document.createTextNode(cajeroturno.getturnopunven_descripcion()));
		element.appendChild(elementturnopunven_descripcion);

		Element elementhora_inicio = document.createElement(CajeroTurnoConstantesFunciones.HORAINICIO);
		elementhora_inicio.appendChild(document.createTextNode(cajeroturno.gethora_inicio().toString().trim()));
		element.appendChild(elementhora_inicio);

		Element elementhora_fin = document.createElement(CajeroTurnoConstantesFunciones.HORAFIN);
		elementhora_fin.appendChild(document.createTextNode(cajeroturno.gethora_fin().toString().trim()));
		element.appendChild(elementhora_fin);

		Element elementhora_servicio = document.createElement(CajeroTurnoConstantesFunciones.HORASERVICIO);
		elementhora_servicio.appendChild(document.createTextNode(cajeroturno.gethora_servicio().toString().trim()));
		element.appendChild(elementhora_servicio);
	}
	
	public void generarReporteGroupGenericoCajeroTurnosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajeroTurno> cajeroturnosSeleccionados=new ArrayList<CajeroTurno>();
		
		cajeroturnosSeleccionados=this.getCajeroTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoCajeroTurno(cajeroturnosSeleccionados);
		
		this.generarReporteCajeroTurnos("Todos",cajeroturnosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajeroTurno(ArrayList<CajeroTurno> cajeroturnosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajeroTurno cajeroturnoAux:cajeroturnosSeleccionados) {
				cajeroturnoAux.setsDetalleGeneralEntityReporte(cajeroturnoAux.toString());
			
				if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDMESA)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getmesa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.getturnopunven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.gethora_inicio().toString());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORAFIN)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.gethora_fin().toString());
				}
				 else if(sTipoSeleccionar.equals(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO)) {
					existe=true;
					cajeroturnoAux.setsDescripcionGeneralEntityReporte1(cajeroturnoAux.gethora_servicio().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajeroTurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajeroTurno(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajeroTurno=true;
				this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=true;
				this.isVisibilidadCeldaGuardarCambiosCajeroTurno=true;
			}
			
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=true;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=true;
			this.isVisibilidadCeldaEliminarCajeroTurno=true;
			this.isVisibilidadCeldaCancelarCajeroTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=true;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajeroTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=true;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=true;
			this.isVisibilidadCeldaModificarCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
			this.isVisibilidadCeldaModificarCajeroTurno=true;
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
			this.isVisibilidadCeldaCancelarCajeroTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarCajeroTurno=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajeroTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=true;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=true;
		} else {
			this.actualizarEstadoPanelsCajeroTurno(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajeroTurno=false;
			//this.isVisibilidadCeldaVerFormCajeroTurno=false;
			this.isVisibilidadCeldaDuplicarCajeroTurno=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajeroturnoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
		} else {
			this.isVisibilidadCeldaNuevoCajeroTurno=false;
			this.isVisibilidadCeldaGuardarCambiosCajeroTurno=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			if(!cajeroturnoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;												
			}
			
			this.jButtonCerrarCajeroTurno.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajeroTurno=false;
		}
		
		if(!this.permiteMantenimiento(this.cajeroturno)) {
			this.isVisibilidadCeldaActualizarCajeroTurno=false;
			this.isVisibilidadCeldaEliminarCajeroTurno=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajeroTurno() {
	}
	
	public void actualizarEstadoPanelsCajeroTurno(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajeroTurno!=null) {
				this.jScrollPanelDatosEdicionCajeroTurno.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajeroTurno!=null) {
				this.jScrollPanelDatosCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajeroTurno!=null) {
				this.jPanelPaginacionCajeroTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
					this.jTabbedPaneBusquedasCajeroTurno.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajeroTurno!=null) {
				this.jTabbedPaneBusquedasCajeroTurno.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajeroTurno!=null) {
				this.jPanelParametrosReportesCajeroTurno.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCaja=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCaja=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdCaja=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaVendedor;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadFK_IdCaja=isParaCaja;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaCajaNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaCajaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaCajaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesa(Boolean isParaMesa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesaNegation=!isParaMesa;

			this.isVisibilidadFK_IdCaja=isParaMesaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaMesa;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaMesaNegation;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaMesaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}

	public void setVisibilidadBusquedasParaTurnoPunVen(Boolean isParaTurnoPunVen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTurnoPunVenNegation=!isParaTurnoPunVen;

			this.isVisibilidadFK_IdCaja=isParaTurnoPunVenNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdCajaCajeroTurno);}

			this.isVisibilidadFK_IdMesa=isParaTurnoPunVenNegation;
			if(!this.isVisibilidadFK_IdMesa) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdMesaCajeroTurno);}

			this.isVisibilidadFK_IdTurnoPunVen=isParaTurnoPunVen;
			if(!this.isVisibilidadFK_IdTurnoPunVen) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdTurnoPunVenCajeroTurno);}

			this.isVisibilidadFK_IdVendedor=isParaTurnoPunVenNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasCajeroTurno.remove(jPanelFK_IdVendedorCajeroTurno);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajeroTurnoSessionBean cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		
		if(this.cajeroturnoSessionBean==null) {
			this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		}
		
		this.cajeroturnoSessionBean.setsUltimaBusquedaCajeroTurno(this.getsAccionBusqueda());
		this.cajeroturnoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajeroturnoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
			cajeroturnoSessionBean.setid_caja(this.getid_cajaFK_IdCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajeroturnoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMesa")) {
			cajeroturnoSessionBean.setid_mesa(this.getid_mesaFK_IdMesa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajeroturnoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
			cajeroturnoSessionBean.setid_turno_pun_ven(this.getid_turno_pun_venFK_IdTurnoPunVen());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			cajeroturnoSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
			cajeroturnoSessionBean.setid_vendedor(this.getid_vendedorFK_IdVendedor());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajeroTurnoSessionBean cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		
		if(this.cajeroturnoSessionBean==null) {
			this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		}
		
		if(this.cajeroturnoSessionBean.getsUltimaBusquedaCajeroTurno()!=null&&!this.cajeroturnoSessionBean.getsUltimaBusquedaCajeroTurno().equals("")) {
			this.setsAccionBusqueda(cajeroturnoSessionBean.getsUltimaBusquedaCajeroTurno());
			this.setiNumeroPaginacion(cajeroturnoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajeroturnoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
				this.setid_cajaFK_IdCaja(cajeroturnoSessionBean.getid_caja());
				cajeroturnoSessionBean.setid_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajeroturnoSessionBean.getid_empresa());
				cajeroturnoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMesa")) {
				this.setid_mesaFK_IdMesa(cajeroturnoSessionBean.getid_mesa());
				cajeroturnoSessionBean.setid_mesa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajeroturnoSessionBean.getid_sucursal());
				cajeroturnoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTurnoPunVen")) {
				this.setid_turno_pun_venFK_IdTurnoPunVen(cajeroturnoSessionBean.getid_turno_pun_ven());
				cajeroturnoSessionBean.setid_turno_pun_ven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(cajeroturnoSessionBean.getid_usuario());
				cajeroturnoSessionBean.setid_usuario(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
				this.setid_vendedorFK_IdVendedor(cajeroturnoSessionBean.getid_vendedor());
				cajeroturnoSessionBean.setid_vendedor(-1L);
			}
		}
		
		this.cajeroturnoSessionBean.setsUltimaBusquedaCajeroTurno("");
		this.cajeroturnoSessionBean.setiNumeroPaginacion(CajeroTurnoConstantesFunciones.INUMEROPAGINACION);
		this.cajeroturnoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajeroTurno(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajeroTurno() {
		this.updateBorderResaltarBusquedasFormularioCajeroTurno();
		this.updateVisibilidadBusquedasFormularioCajeroTurno();
		this.updateHabilitarBusquedasFormularioCajeroTurno();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajeroTurno() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajeroTurno.getComponents().length>0) {
	

		if(this.cajeroturnoConstantesFunciones.resaltarFK_IdCajaCajeroTurno!=null) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdCajaCajeroTurno);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdCajaCajeroTurno);
			}
		}

		if(this.cajeroturnoConstantesFunciones.resaltarFK_IdMesaCajeroTurno!=null) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdMesaCajeroTurno);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdMesaCajeroTurno);
			}
		}

		if(this.cajeroturnoConstantesFunciones.resaltarFK_IdTurnoPunVenCajeroTurno!=null) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajeroTurno);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdTurnoPunVenCajeroTurno);
			}
		}

		if(this.cajeroturnoConstantesFunciones.resaltarFK_IdVendedorCajeroTurno!=null) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdVendedorCajeroTurno);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdVendedorCajeroTurno);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajeroTurno() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajeroTurno.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdCajaCajeroTurno);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajeroturnoConstantesFunciones.mostrarFK_IdCajaCajeroTurno);
			if(!this.cajeroturnoConstantesFunciones.mostrarFK_IdCajaCajeroTurno && index>-1) {
				this.jTabbedPaneBusquedasCajeroTurno.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdMesaCajeroTurno);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajeroturnoConstantesFunciones.mostrarFK_IdMesaCajeroTurno);
			if(!this.cajeroturnoConstantesFunciones.mostrarFK_IdMesaCajeroTurno && index>-1) {
				this.jTabbedPaneBusquedasCajeroTurno.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajeroTurno);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajeroturnoConstantesFunciones.mostrarFK_IdTurnoPunVenCajeroTurno);
			if(!this.cajeroturnoConstantesFunciones.mostrarFK_IdTurnoPunVenCajeroTurno && index>-1) {
				this.jTabbedPaneBusquedasCajeroTurno.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdVendedorCajeroTurno);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajeroturnoConstantesFunciones.mostrarFK_IdVendedorCajeroTurno);
			if(!this.cajeroturnoConstantesFunciones.mostrarFK_IdVendedorCajeroTurno && index>-1) {
				this.jTabbedPaneBusquedasCajeroTurno.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajeroTurno() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajeroTurno.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdCajaCajeroTurno);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajeroturnoConstantesFunciones.activarFK_IdCajaCajeroTurno);
				this.jTabbedPaneBusquedasCajeroTurno.setEnabledAt(index,this.cajeroturnoConstantesFunciones.activarFK_IdCajaCajeroTurno);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdMesaCajeroTurno);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajeroturnoConstantesFunciones.activarFK_IdMesaCajeroTurno);
				this.jTabbedPaneBusquedasCajeroTurno.setEnabledAt(index,this.cajeroturnoConstantesFunciones.activarFK_IdMesaCajeroTurno);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajeroTurno);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajeroturnoConstantesFunciones.activarFK_IdTurnoPunVenCajeroTurno);
				this.jTabbedPaneBusquedasCajeroTurno.setEnabledAt(index,this.cajeroturnoConstantesFunciones.activarFK_IdTurnoPunVenCajeroTurno);
			}

			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdVendedorCajeroTurno);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajeroturnoConstantesFunciones.activarFK_IdVendedorCajeroTurno);
				this.jTabbedPaneBusquedasCajeroTurno.setEnabledAt(index,this.cajeroturnoConstantesFunciones.activarFK_IdVendedorCajeroTurno);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajeroTurno(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCaja")) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdCajaCajeroTurno);

			this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);

			this.cajeroturnoConstantesFunciones.setResaltarFK_IdCajaCajeroTurno(resaltar);

			jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdCajaCajeroTurno);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMesa")) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdMesaCajeroTurno);

			this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);

			this.cajeroturnoConstantesFunciones.setResaltarFK_IdMesaCajeroTurno(resaltar);

			jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdMesaCajeroTurno);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTurnoPunVen")) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdTurnoPunVenCajeroTurno);

			this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);

			this.cajeroturnoConstantesFunciones.setResaltarFK_IdTurnoPunVenCajeroTurno(resaltar);

			jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdTurnoPunVenCajeroTurno);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdVendedor")) {
			index= this.jTabbedPaneBusquedasCajeroTurno.indexOfComponent(this.jPanelFK_IdVendedorCajeroTurno);

			this.jTabbedPaneBusquedasCajeroTurno.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajeroTurno.getComponent(index);

			this.cajeroturnoConstantesFunciones.setResaltarFK_IdVendedorCajeroTurno(resaltar);

			jPanel.setBorder(this.cajeroturnoConstantesFunciones.resaltarFK_IdVendedorCajeroTurno);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajeroTurno.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioCajeroTurno() throws Exception {

		if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajeroTurno();
		this.updateVisibilidadResaltarControlesFormularioCajeroTurno();
		this.updateHabilitarResaltarControlesFormularioCajeroTurno();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajeroTurno() throws Exception {
		if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajeroturnoConstantesFunciones.resaltaridCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltaridCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_empresaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_empresaCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_sucursalCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_sucursalCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_usuarioCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_usuarioCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_vendedorCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_vendedorCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_cajaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_cajaCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_mesaCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_mesaCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarid_turno_pun_venCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarid_turno_pun_venCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarhora_inicioCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarhora_inicioCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarhora_finCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarhora_finCajeroTurno);}
		if(this.cajeroturnoConstantesFunciones.resaltarhora_servicioCajeroTurno!=null && this.jInternalFrameDetalleFormCajeroTurno!=null) {this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setBorder(this.cajeroturnoConstantesFunciones.resaltarhora_servicioCajeroTurno);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajeroTurno() throws Exception {		
		if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
	
		//this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostraridCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelidCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostraridCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_empresaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_empresaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_empresaCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_sucursalCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_sucursalCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_sucursalCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_usuarioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_usuarioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_usuarioCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_vendedorCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_vendedorCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_vendedorCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_cajaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_cajaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_cajaCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_mesaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_mesaCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_mesaCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_turno_pun_venCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelid_turno_pun_venCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarid_turno_pun_venCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_inicioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelhora_inicioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_inicioCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_finCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelhora_finCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_finCajeroTurno);
		//this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_servicioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jPanelhora_servicioCajeroTurno.setVisible(this.cajeroturnoConstantesFunciones.mostrarhora_servicioCajeroTurno);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajeroTurno() throws Exception {
		if(this.jInternalFrameDetalleFormCajeroTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajeroTurno!=null) {
	
		this.jInternalFrameDetalleFormCajeroTurno.jLabelidCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activaridCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_empresaCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_empresaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_sucursalCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_sucursalCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_usuarioCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_usuarioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_vendedorCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_vendedorCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_cajaCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_cajaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_mesaCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_mesaCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jComboBoxid_turno_pun_venCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarid_turno_pun_venCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_inicioCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarhora_inicioCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_finCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarhora_finCajeroTurno);
		this.jInternalFrameDetalleFormCajeroTurno.jSpinnerhora_servicioCajeroTurno.setEnabled(this.cajeroturnoConstantesFunciones.activarhora_servicioCajeroTurno);
		}
	}
	
		
}