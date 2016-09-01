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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.ResumenCierreCajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ResumenCierreCajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ResumenCierreCajaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ResumenCierreCajaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ResumenCierreCajaBeanSwingJInternalFrame extends ResumenCierreCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResumenCierreCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ResumenCierreCaja> resumencierrecajaValidator = new ClassValidator<ResumenCierreCaja>(ResumenCierreCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ResumenCierreCaja resumencierrecaja;	
	public ResumenCierreCaja resumencierrecajaAux;
	public ResumenCierreCaja resumencierrecajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ResumenCierreCaja resumencierrecajaTotales;
	public Long idResumenCierreCajaActual;
	public Long iIdNuevoResumenCierreCaja=0L;
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
	
	public Boolean isPermisoTodoResumenCierreCaja;
	public Boolean isPermisoNuevoResumenCierreCaja;
	public Boolean isPermisoActualizarResumenCierreCaja;
	public Boolean isPermisoActualizarOriginalResumenCierreCaja;
	public Boolean isPermisoEliminarResumenCierreCaja;
	public Boolean isPermisoGuardarCambiosResumenCierreCaja;
	public Boolean isPermisoConsultaResumenCierreCaja;
	public Boolean isPermisoBusquedaResumenCierreCaja;
	public Boolean isPermisoReporteResumenCierreCaja;
	public Boolean isPermisoPaginacionMedioResumenCierreCaja;
	public Boolean isPermisoPaginacionAltoResumenCierreCaja;
	public Boolean isPermisoPaginacionTodoResumenCierreCaja;
	public Boolean isPermisoCopiarResumenCierreCaja;
	public Boolean isPermisoVerFormResumenCierreCaja;
	public Boolean isPermisoDuplicarResumenCierreCaja;
	public Boolean isPermisoOrdenResumenCierreCaja;
	
	
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
	
	public ResumenCierreCajaParameterReturnGeneral resumencierrecajaReturnGeneral;
	public ResumenCierreCajaParameterReturnGeneral resumencierrecajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResumenCierreCaja=false;
	public Boolean esParaAccionDesdeFormularioResumenCierreCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResumenCierreCajaSessionBeanAdditional resumencierrecajaSessionBeanAdditional=null;
	
	public ResumenCierreCajaSessionBeanAdditional getResumenCierreCajaSessionBeanAdditional() {
		return this.resumencierrecajaSessionBeanAdditional;
	}
	
	public void setResumenCierreCajaSessionBeanAdditional(ResumenCierreCajaSessionBeanAdditional resumencierrecajaSessionBeanAdditional) {
		try {
			this.resumencierrecajaSessionBeanAdditional=resumencierrecajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResumenCierreCajaBeanSwingJInternalFrameAdditional resumencierrecajaBeanSwingJInternalFrameAdditional=null;
	//public class ResumenCierreCajaBeanSwingJInternalFrame
	
	public ResumenCierreCajaBeanSwingJInternalFrameAdditional getResumenCierreCajaBeanSwingJInternalFrameAdditional() {
		return this.resumencierrecajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setResumenCierreCajaBeanSwingJInternalFrameAdditional(ResumenCierreCajaBeanSwingJInternalFrameAdditional resumencierrecajaBeanSwingJInternalFrameAdditional) {
		try {
			this.resumencierrecajaBeanSwingJInternalFrameAdditional=resumencierrecajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResumenCierreCajaLogic resumencierrecajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ResumenCierreCaja resumencierrecajaBean;
	public ResumenCierreCajaConstantesFunciones resumencierrecajaConstantesFunciones;
	//public ResumenCierreCajaParameterReturnGeneral resumencierrecajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<ResumenCierreCaja> resumencierrecajas;	
	//public List<ResumenCierreCaja> resumencierrecajasEliminados;
	//public List<ResumenCierreCaja> resumencierrecajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaDuplicarResumenCierreCaja=true;
	public Boolean isVisibilidadCeldaCopiarResumenCierreCaja=true;
	public Boolean isVisibilidadCeldaVerFormResumenCierreCaja=true;
	public Boolean isVisibilidadCeldaOrdenResumenCierreCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaModificarResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaActualizarResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaEliminarResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaCancelarResumenCierreCaja=false;
	public Boolean isVisibilidadCeldaGuardarResumenCierreCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaResumenCierreCaja=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoResumenCierreCaja() {
		return this.iIdNuevoResumenCierreCaja;
	}

	public void setiIdNuevoResumenCierreCaja(Long iIdNuevoResumenCierreCaja) {
		this.iIdNuevoResumenCierreCaja = iIdNuevoResumenCierreCaja;
	}
	
	public Long getidResumenCierreCajaActual() {
		return this.idResumenCierreCajaActual;
	}

	public void setidResumenCierreCajaActual(Long idResumenCierreCajaActual) {
		this.idResumenCierreCajaActual = idResumenCierreCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ResumenCierreCaja getresumencierrecaja() {
		return this.resumencierrecaja;
	}

	public void setresumencierrecaja(ResumenCierreCaja resumencierrecaja) {
		this.resumencierrecaja = resumencierrecaja;
	}
	
	public ResumenCierreCaja getresumencierrecajaAux() {
		return this.resumencierrecajaAux;
	}

	public void setresumencierrecajaAux(ResumenCierreCaja resumencierrecajaAux) {
		this.resumencierrecajaAux = resumencierrecajaAux;
	}				
	
	public ResumenCierreCaja getresumencierrecajaAnterior() {
		return this.resumencierrecajaAnterior;
	}

	public void setresumencierrecajaAnterior(ResumenCierreCaja resumencierrecajaAnterior) {
		this.resumencierrecajaAnterior = resumencierrecajaAnterior;
	}	
	
	public ResumenCierreCaja getresumencierrecajaTotales() {
		return this.resumencierrecajaTotales;
	}

	public void setresumencierrecajaTotales(ResumenCierreCaja resumencierrecajaTotales) {
		this.resumencierrecajaTotales = resumencierrecajaTotales;
	}	
	
	public ResumenCierreCaja getresumencierrecajaBean() {
		return this.resumencierrecajaBean;
	}

	public void setresumencierrecajaBean(ResumenCierreCaja resumencierrecajaBean) {
		this.resumencierrecajaBean = resumencierrecajaBean;
	}	
	
	public ResumenCierreCajaParameterReturnGeneral getresumencierrecajaReturnGeneral() {
		return this.resumencierrecajaReturnGeneral;
	}

	public void setresumencierrecajaReturnGeneral(ResumenCierreCajaParameterReturnGeneral resumencierrecajaReturnGeneral) {
		this.resumencierrecajaReturnGeneral = resumencierrecajaReturnGeneral;
	}	
	
	
	public Long id_usuarioBusquedaResumenCierreCaja=-1L;

	public Long getid_usuarioBusquedaResumenCierreCaja() {
		return this.id_usuarioBusquedaResumenCierreCaja;
	}

	public void setid_usuarioBusquedaResumenCierreCaja(Long id_usuarioBusquedaResumenCierreCaja) {
		this.id_usuarioBusquedaResumenCierreCaja = id_usuarioBusquedaResumenCierreCaja;
	}

;
	public Long id_cajaBusquedaResumenCierreCaja=-1L;

	public Long getid_cajaBusquedaResumenCierreCaja() {
		return this.id_cajaBusquedaResumenCierreCaja;
	}

	public void setid_cajaBusquedaResumenCierreCaja(Long id_cajaBusquedaResumenCierreCaja) {
		this.id_cajaBusquedaResumenCierreCaja = id_cajaBusquedaResumenCierreCaja;
	}

;
	public Date fechaBusquedaResumenCierreCaja=new Date();

	public Date getfechaBusquedaResumenCierreCaja() {
		return this.fechaBusquedaResumenCierreCaja;
	}

	public void setfechaBusquedaResumenCierreCaja(Date fechaBusquedaResumenCierreCaja) {
		this.fechaBusquedaResumenCierreCaja = fechaBusquedaResumenCierreCaja;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ResumenCierreCajaLogic getResumenCierreCajaLogic()	{		
		return resumencierrecajaLogic;
	}

	public void setResumenCierreCajaLogic(ResumenCierreCajaLogic resumencierrecajaLogic) {
		this.resumencierrecajaLogic = resumencierrecajaLogic;
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
	
	public Boolean getIsEsNuevoResumenCierreCaja() {
		return isEsNuevoResumenCierreCaja;
	}

	public void setIsEsNuevoResumenCierreCaja(Boolean isEsNuevoResumenCierreCaja) {
		this.isEsNuevoResumenCierreCaja = isEsNuevoResumenCierreCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioResumenCierreCaja() {
		return esParaAccionDesdeFormularioResumenCierreCaja;
	}
	
	public void setEsParaAccionDesdeFormularioResumenCierreCaja(Boolean esParaAccionDesdeFormularioResumenCierreCaja) {
		this.esParaAccionDesdeFormularioResumenCierreCaja = esParaAccionDesdeFormularioResumenCierreCaja;
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

			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			}

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(resumencierrecajaSessionBean.getlidEmpresaActual());
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

			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			}

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(resumencierrecajaSessionBean.getlidSucursalActual());
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

			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			}

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(resumencierrecajaSessionBean.getlidUsuarioActual());
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

			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			}

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
					cajaLogic.getEntityWithConnection(resumencierrecajaSessionBean.getlidCajaActual());
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

					if(this.resumencierrecaja!=null) {
						this.resumencierrecaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaResumenCierreCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaResumenCierreCajaGenerico)throws Exception
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
				jComboBoxid_empresaResumenCierreCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaResumenCierreCajaGenerico!=null && jComboBoxid_empresaResumenCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaResumenCierreCajaGenerico.setSelectedIndex(0);
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

					if(this.resumencierrecaja!=null) {
						this.resumencierrecaja.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalResumenCierreCaja.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalResumenCierreCajaGenerico)throws Exception
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
				jComboBoxid_sucursalResumenCierreCajaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalResumenCierreCajaGenerico!=null && jComboBoxid_sucursalResumenCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalResumenCierreCajaGenerico.setSelectedIndex(0);
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

					if(this.resumencierrecaja!=null) {
						this.resumencierrecaja.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioResumenCierreCaja.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaResumenCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja!=null) {
						jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja!=null) {
							//jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioResumenCierreCajaGenerico)throws Exception
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
				jComboBoxid_usuarioResumenCierreCajaGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioResumenCierreCajaGenerico!=null && jComboBoxid_usuarioResumenCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_usuarioResumenCierreCajaGenerico.setSelectedIndex(0);
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

					if(this.resumencierrecaja!=null) {
						this.resumencierrecaja.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaResumenCierreCaja.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaResumenCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja!=null) {
						jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja!=null) {
							//jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.getItemCount()>0) {
								jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setSelectedIndex(0);
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
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaResumenCierreCajaGenerico)throws Exception
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
				jComboBoxid_cajaResumenCierreCajaGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaResumenCierreCajaGenerico!=null && jComboBoxid_cajaResumenCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_cajaResumenCierreCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ResumenCierreCaja resumencierrecaja,JComboBox jComboBoxid_empresaResumenCierreCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaResumenCierreCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaResumenCierreCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				resumencierrecaja.setid_empresa(empresaAux.getId());
				resumencierrecaja.setempresa_descripcion(ResumenCierreCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				resumencierrecaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ResumenCierreCaja resumencierrecaja,JComboBox jComboBoxid_sucursalResumenCierreCajaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalResumenCierreCajaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalResumenCierreCajaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				resumencierrecaja.setid_sucursal(sucursalAux.getId());
				resumencierrecaja.setsucursal_descripcion(ResumenCierreCajaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				resumencierrecaja.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(ResumenCierreCaja resumencierrecaja,JComboBox jComboBoxid_usuarioResumenCierreCajaGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioResumenCierreCajaGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioResumenCierreCajaGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				resumencierrecaja.setid_usuario(usuarioAux.getId());
				resumencierrecaja.setusuario_descripcion(ResumenCierreCajaConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				resumencierrecaja.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(ResumenCierreCaja resumencierrecaja,JComboBox jComboBoxid_cajaResumenCierreCajaGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaResumenCierreCajaGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaResumenCierreCajaGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				resumencierrecaja.setid_caja(cajaAux.getId());
				resumencierrecaja.setcaja_descripcion(ResumenCierreCajaConstantesFunciones.getCajaDescripcion(cajaAux));
				resumencierrecaja.setCaja(cajaAux);			}
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

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
					}

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
					}

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
					}

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaResumenCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.addItem(usuario);
							}
						}

						if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { 
					}

					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaResumenCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.addItem(caja);
							}
						}

						if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesResumenCierreCaja() throws Exception {
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
		
	public ResumenCierreCajaParameterReturnGeneral getResumenCierreCajaParameterGeneral() {
		return this.resumencierrecajaParameterGeneral;
	}
	
	public void setResumenCierreCajaParameterGeneral(ResumenCierreCajaParameterReturnGeneral resumencierrecajaParameterGeneral) {
		this.resumencierrecajaParameterGeneral = resumencierrecajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResumenCierreCaja() {
		return isPermisoTodoResumenCierreCaja;
	}

	public void setIsPermisoTodoResumenCierreCaja(Boolean isPermisoTodoResumenCierreCaja) {
		this.isPermisoTodoResumenCierreCaja = isPermisoTodoResumenCierreCaja;
	}

	public Boolean getIsPermisoNuevoResumenCierreCaja() {
		return isPermisoNuevoResumenCierreCaja;
	}

	public void setIsPermisoNuevoResumenCierreCaja(Boolean isPermisoNuevoResumenCierreCaja) {
		this.isPermisoNuevoResumenCierreCaja = isPermisoNuevoResumenCierreCaja;
	}

	public Boolean getIsPermisoActualizarResumenCierreCaja() {
		return isPermisoActualizarResumenCierreCaja;
	}

	public void setIsPermisoActualizarResumenCierreCaja(Boolean isPermisoActualizarResumenCierreCaja) {
		this.isPermisoActualizarResumenCierreCaja = isPermisoActualizarResumenCierreCaja;
	}

	public Boolean getIsPermisoEliminarResumenCierreCaja() {
		return isPermisoEliminarResumenCierreCaja;
	}

	public void setIsPermisoEliminarResumenCierreCaja(Boolean isPermisoEliminarResumenCierreCaja) {
		this.isPermisoEliminarResumenCierreCaja = isPermisoEliminarResumenCierreCaja;
	}

	public Boolean getIsPermisoGuardarCambiosResumenCierreCaja() {
		return isPermisoGuardarCambiosResumenCierreCaja;
	}

	public void setIsPermisoGuardarCambiosResumenCierreCaja(Boolean isPermisoGuardarCambiosResumenCierreCaja) {
		this.isPermisoGuardarCambiosResumenCierreCaja = isPermisoGuardarCambiosResumenCierreCaja;
	}
	
	public Boolean getIsPermisoConsultaResumenCierreCaja() {
		return isPermisoConsultaResumenCierreCaja;
	}

	public void setIsPermisoConsultaResumenCierreCaja(Boolean isPermisoConsultaResumenCierreCaja) {
		this.isPermisoConsultaResumenCierreCaja = isPermisoConsultaResumenCierreCaja;
	}

	public Boolean getIsPermisoBusquedaResumenCierreCaja() {
		return isPermisoBusquedaResumenCierreCaja;
	}

	public void setIsPermisoBusquedaResumenCierreCaja(Boolean isPermisoBusquedaResumenCierreCaja) {
		this.isPermisoBusquedaResumenCierreCaja = isPermisoBusquedaResumenCierreCaja;
	}

	public Boolean getIsPermisoReporteResumenCierreCaja() {
		return isPermisoReporteResumenCierreCaja;
	}

	public void setIsPermisoReporteResumenCierreCaja(Boolean isPermisoReporteResumenCierreCaja) {
		this.isPermisoReporteResumenCierreCaja = isPermisoReporteResumenCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioResumenCierreCaja() {
		return isPermisoPaginacionMedioResumenCierreCaja;
	}

	public void setIsPermisoPaginacionMedioResumenCierreCaja(Boolean isPermisoPaginacionMedioResumenCierreCaja) {
		this.isPermisoPaginacionMedioResumenCierreCaja = isPermisoPaginacionMedioResumenCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoResumenCierreCaja() {
		return isPermisoPaginacionTodoResumenCierreCaja;
	}

	public void setIsPermisoPaginacionTodoResumenCierreCaja(Boolean isPermisoPaginacionTodoResumenCierreCaja) {
		this.isPermisoPaginacionTodoResumenCierreCaja = isPermisoPaginacionTodoResumenCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoResumenCierreCaja() {
		return isPermisoPaginacionAltoResumenCierreCaja;
	}

	public void setIsPermisoPaginacionAltoResumenCierreCaja(Boolean isPermisoPaginacionAltoResumenCierreCaja) {
		this.isPermisoPaginacionAltoResumenCierreCaja = isPermisoPaginacionAltoResumenCierreCaja;
	}
	
	public Boolean getIsPermisoCopiarResumenCierreCaja() {
		return isPermisoCopiarResumenCierreCaja;
	}

	public void setIsPermisoCopiarResumenCierreCaja(Boolean isPermisoCopiarResumenCierreCaja) {
		this.isPermisoCopiarResumenCierreCaja = isPermisoCopiarResumenCierreCaja;
	}
	
	public Boolean getIsPermisoVerFormResumenCierreCaja() {
		return isPermisoVerFormResumenCierreCaja;
	}

	public void setIsPermisoVerFormResumenCierreCaja(Boolean isPermisoVerFormResumenCierreCaja) {
		this.isPermisoVerFormResumenCierreCaja = isPermisoVerFormResumenCierreCaja;
	}
	
	public Boolean getIsPermisoDuplicarResumenCierreCaja() {
		return isPermisoDuplicarResumenCierreCaja;
	}

	public void setIsPermisoDuplicarResumenCierreCaja(Boolean isPermisoDuplicarResumenCierreCaja) {
		this.isPermisoDuplicarResumenCierreCaja = isPermisoDuplicarResumenCierreCaja;
	}
	
	public Boolean getIsPermisoOrdenResumenCierreCaja() {
		return isPermisoOrdenResumenCierreCaja;
	}

	public void setIsPermisoOrdenResumenCierreCaja(Boolean isPermisoOrdenResumenCierreCaja) {
		this.isPermisoOrdenResumenCierreCaja = isPermisoOrdenResumenCierreCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResumenCierreCaja() {
		return isVisibilidadCeldaNuevoResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoResumenCierreCaja(Boolean isVisibilidadCeldaNuevoResumenCierreCaja) {
		this.isVisibilidadCeldaNuevoResumenCierreCaja = isVisibilidadCeldaNuevoResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResumenCierreCaja() {
		return isVisibilidadCeldaDuplicarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaDuplicarResumenCierreCaja(Boolean isVisibilidadCeldaDuplicarResumenCierreCaja) {
		this.isVisibilidadCeldaDuplicarResumenCierreCaja = isVisibilidadCeldaDuplicarResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResumenCierreCaja() {
		return isVisibilidadCeldaCopiarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaCopiarResumenCierreCaja(Boolean isVisibilidadCeldaCopiarResumenCierreCaja) {
		this.isVisibilidadCeldaCopiarResumenCierreCaja = isVisibilidadCeldaCopiarResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResumenCierreCaja() {
		return isVisibilidadCeldaVerFormResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaVerFormResumenCierreCaja(Boolean isVisibilidadCeldaVerFormResumenCierreCaja) {
		this.isVisibilidadCeldaVerFormResumenCierreCaja = isVisibilidadCeldaVerFormResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResumenCierreCaja() {
		return isVisibilidadCeldaOrdenResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaOrdenResumenCierreCaja(Boolean isVisibilidadCeldaOrdenResumenCierreCaja) {
		this.isVisibilidadCeldaOrdenResumenCierreCaja = isVisibilidadCeldaOrdenResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResumenCierreCaja() {
		return isVisibilidadCeldaNuevoRelacionesResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResumenCierreCaja(Boolean isVisibilidadCeldaNuevoRelacionesResumenCierreCaja) {
		this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja = isVisibilidadCeldaNuevoRelacionesResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResumenCierreCaja() {
		return isVisibilidadCeldaModificarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaModificarResumenCierreCaja(Boolean isVisibilidadCeldaModificarResumenCierreCaja) {
		this.isVisibilidadCeldaModificarResumenCierreCaja = isVisibilidadCeldaModificarResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResumenCierreCaja() {
		return isVisibilidadCeldaActualizarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaActualizarResumenCierreCaja(Boolean isVisibilidadCeldaActualizarResumenCierreCaja) {
		this.isVisibilidadCeldaActualizarResumenCierreCaja = isVisibilidadCeldaActualizarResumenCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarResumenCierreCaja() {
		return isVisibilidadCeldaEliminarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaEliminarResumenCierreCaja(Boolean isVisibilidadCeldaEliminarResumenCierreCaja) {
		this.isVisibilidadCeldaEliminarResumenCierreCaja = isVisibilidadCeldaEliminarResumenCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarResumenCierreCaja() {
		return isVisibilidadCeldaCancelarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaCancelarResumenCierreCaja(Boolean isVisibilidadCeldaCancelarResumenCierreCaja) {
		this.isVisibilidadCeldaCancelarResumenCierreCaja = isVisibilidadCeldaCancelarResumenCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarResumenCierreCaja() {
		return isVisibilidadCeldaGuardarResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarResumenCierreCaja(Boolean isVisibilidadCeldaGuardarResumenCierreCaja) {
		this.isVisibilidadCeldaGuardarResumenCierreCaja = isVisibilidadCeldaGuardarResumenCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResumenCierreCaja() {
		return isVisibilidadCeldaGuardarCambiosResumenCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResumenCierreCaja(Boolean isVisibilidadCeldaGuardarCambiosResumenCierreCaja) {
		this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja = isVisibilidadCeldaGuardarCambiosResumenCierreCaja;
	}
		
	public ResumenCierreCajaSessionBean getresumencierrecajaSessionBean() {
		return this.resumencierrecajaSessionBean;
	}
	
	public void setresumencierrecajaSessionBean(ResumenCierreCajaSessionBean resumencierrecajaSessionBean) {
		this.resumencierrecajaSessionBean=resumencierrecajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaResumenCierreCaja() {
		return this.isVisibilidadBusquedaResumenCierreCaja;
	}

	public void setisVisibilidadBusquedaResumenCierreCaja(Boolean isVisibilidadBusquedaResumenCierreCaja) {
		this.isVisibilidadBusquedaResumenCierreCaja=isVisibilidadBusquedaResumenCierreCaja;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(ResumenCierreCaja resumencierrecaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(resumencierrecaja,null);
				this.setActualParaGuardarSucursalForeignKey(resumencierrecaja,null);
				this.setActualParaGuardarUsuarioForeignKey(resumencierrecaja,null);
				this.setActualParaGuardarCajaForeignKey(resumencierrecaja,null);
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
	
	public void bugActualizarReferenciaActual(ResumenCierreCaja resumencierrecaja,ResumenCierreCaja resumencierrecajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResumenCierreCaja(resumencierrecaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		resumencierrecajaAux.setId(resumencierrecaja.getId());
		resumencierrecajaAux.setVersionRow(resumencierrecaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ResumenCierreCaja resumencierrecajaLocal) throws Exception {
		
		if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ResumenCierreCaja resumencierrecajaLocal) throws Exception {	
		if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				resumencierrecajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				resumencierrecajaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				resumencierrecajaLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				resumencierrecajaLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResumenCierreCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = resumencierrecajaValidator.getInvalidValues(this.resumencierrecaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ResumenCierreCaja resumencierrecaja,List<ResumenCierreCaja> resumencierrecajas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ResumenCierreCaja resumencierrecaja,List<ResumenCierreCaja> resumencierrecajas) throws Exception {
		try	{			
			ResumenCierreCajaConstantesFunciones.actualizarSelectedLista(resumencierrecaja,resumencierrecajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ResumenCierreCaja> resumencierrecajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				resumencierrecajasLocal=this.resumencierrecajaLogic.getResumenCierreCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				resumencierrecajasLocal=this.resumencierrecajas;
			}
			//ARCHITECTURE
		
			for(ResumenCierreCaja resumencierrecajaLocal:resumencierrecajasLocal) {
				if(this.permiteMantenimiento(resumencierrecajaLocal) && resumencierrecajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResumenCierreCajaConstantesFunciones.getResumenCierreCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelid_usuarioResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelid_cajaResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.TIPOPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltipo_pagoResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.NOMBREUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_usuarioResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_cajaResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelvalorResumenCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenCierreCajaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltotalResumenCierreCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelid_usuarioResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelid_cajaResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltipo_pagoResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_usuarioResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_cajaResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelvalorResumenCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltotalResumenCierreCaja,"");
		
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
		this.iIdNuevoResumenCierreCaja--;	
		
		
		this.resumencierrecajaAux=new ResumenCierreCaja();
		
		this.resumencierrecajaAux.setId(this.iIdNuevoResumenCierreCaja);
		this.resumencierrecajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.resumencierrecajaLogic.getResumenCierreCajas().add(this.resumencierrecajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.resumencierrecajas.add(this.resumencierrecajaAux);
		}
		//ARCHITECTURE
		
		this.resumencierrecaja=this.resumencierrecajaAux;
		
		if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecaja);
			this.setVariablesObjetoActualToFormularioForeignKeyResumenCierreCaja(this.resumencierrecaja);
		}
				
		//this.setDefaultControlesResumenCierreCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResumenCierreCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResumenCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResumenCierreCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResumenCierreCaja(this.resumencierrecajaBean,this.resumencierrecaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResumenCierreCaja(this.resumencierrecajaReturnGeneral,this.resumencierrecajaBean,false);
		
		if(this.resumencierrecajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja());
		}
		
		if(this.resumencierrecajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja(),classes);//this.resumencierrecajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResumenCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResumenCierreCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.RecargarFormResumenCierreCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResumenCierreCaja(false);
						
			if(resumencierrecajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenCierreCaja();
			}
			
			this.actualizarVisualTableDatosResumenCierreCaja();
			
			this.jTableDatosResumenCierreCaja.setRowSelectionInterval(this.getIndiceNuevoResumenCierreCaja(), this.getIndiceNuevoResumenCierreCaja());
			
			this.seleccionarFilaTablaResumenCierreCajaActual();
						
			this.actualizarEstadoCeldasBotonesResumenCierreCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResumenCierreCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jDateChooserfechaResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarfechaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activartipo_pagoResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarnombre_usuarioResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarnombre_cajaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarvalorResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activartotalResumenCierreCaja);	
		//
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarid_empresaResumenCierreCaja);//
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarid_sucursalResumenCierreCaja);//
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarid_usuarioResumenCierreCaja);//
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setEnabled(isHabilitar && this.resumencierrecajaConstantesFunciones.activarid_cajaResumenCierreCaja);
	};
	
	public void setDefaultControlesResumenCierreCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResumenCierreCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.resumencierrecajaSessionBean.setConGuardarRelaciones(true);			
			this.resumencierrecajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.setVisible(true);
			
					
		} else {
			//this.resumencierrecajaSessionBean.setConGuardarRelaciones(false);			
			this.resumencierrecajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoResumenCierreCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
				if(resumencierrecajaAux.getId().equals(this.iIdNuevoResumenCierreCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajas) {
				if(resumencierrecajaAux.getId().equals(this.iIdNuevoResumenCierreCaja)) {
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
	
	public int getIndiceActualResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
				if(resumencierrecajaAux.getId().equals(resumencierrecaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajas) {
				if(resumencierrecajaAux.getId().equals(resumencierrecaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResumenCierreCaja(ResumenCierreCaja resumencierrecajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
				if(resumencierrecajaAux.getResumenCierreCajaOriginal().getId().equals(resumencierrecajaOriginal.getId())) {
					existe=true;
					resumencierrecajaOriginal.setId(resumencierrecajaAux.getId());
					resumencierrecajaOriginal.setVersionRow(resumencierrecajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajas) {
				if(resumencierrecajaAux.getResumenCierreCajaOriginal().getId().equals(resumencierrecajaOriginal.getId())) {
					existe=true;
					resumencierrecajaOriginal.setId(resumencierrecajaAux.getId());
					resumencierrecajaOriginal.setVersionRow(resumencierrecajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResumenCierreCaja(Boolean esParaCancelar) throws Exception {
		resumencierrecajasAux=new ArrayList<ResumenCierreCaja>();
		resumencierrecajaAux=new ResumenCierreCaja();
		
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
					if(resumencierrecajaAux.getId()<0) {
						resumencierrecajasAux.add(resumencierrecajaAux);
					}		
				}
				this.iIdNuevoResumenCierreCaja=0L;
				this.resumencierrecajaLogic.getResumenCierreCajas().removeAll(resumencierrecajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajas) {
					if(resumencierrecajaAux.getId()<0) {
						resumencierrecajasAux.add(resumencierrecajaAux);
					}		
				}
				this.iIdNuevoResumenCierreCaja=0L;
				this.resumencierrecajas.removeAll(resumencierrecajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResumenCierreCaja 
					&& this.resumencierrecajaLogic.getResumenCierreCajas().size()>0
					) {
					resumencierrecajaAux=this.resumencierrecajaLogic.getResumenCierreCajas().get(this.resumencierrecajaLogic.getResumenCierreCajas().size() - 1);
				
					if(resumencierrecajaAux.getId()<0) {
						this.resumencierrecajaLogic.getResumenCierreCajas().remove(resumencierrecajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResumenCierreCaja && this.resumencierrecajas.size()>0) {
					resumencierrecajaAux=this.resumencierrecajas.get(this.resumencierrecajas.size() - 1);
				
					if(resumencierrecajaAux.getId()<0) {
						this.resumencierrecajas.remove(resumencierrecajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResumenCierreCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(resumencierrecaja.getId()<0) {
				this.resumencierrecajaLogic.getResumenCierreCajas().remove(this.resumencierrecaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(resumencierrecaja.getId()<0) {
				this.resumencierrecajas.remove(this.resumencierrecaja);
			}
		}			
	}
	
	public void setEstadosInicialesResumenCierreCaja(List<ResumenCierreCaja> resumencierrecajasAux) throws Exception {
		ResumenCierreCajaConstantesFunciones.setEstadosInicialesResumenCierreCaja(resumencierrecajasAux);
	}
	
	public void setEstadosInicialesResumenCierreCaja(ResumenCierreCaja resumencierrecajaAux) throws Exception {
		ResumenCierreCajaConstantesFunciones.setEstadosInicialesResumenCierreCaja(resumencierrecajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResumenCierreCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResumenCierreCajaActual()) {
				if(!this.isEsNuevoResumenCierreCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResumenCierreCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResumenCierreCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Resumen Cierre Caja ?", "MANTENIMIENTO DE Resumen Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ResumenCierreCaja resumencierrecaja) throws Exception {
		ResumenCierreCajaConstantesFunciones.seleccionarAsignar(this.resumencierrecaja,resumencierrecaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResumenCierreCaja=this.isPermisoActualizarOriginalResumenCierreCaja;
			
			
			this.seleccionarAsignar(resumencierrecaja);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesResumenCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.resumencierrecajaSessionBean.setsFuncionBusquedaRapida(this.resumencierrecajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoResumenCierreCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResumenCierreCaja(esParaCancelar);				
				this.cancelarNuevoResumenCierreCaja(esParaCancelar);								
			}
			
			this.resumencierrecaja=new ResumenCierreCaja();
			
			this.inicializarResumenCierreCaja();
			
			this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResumenCierreCaja() throws Exception {
		try {
			ResumenCierreCajaConstantesFunciones.inicializarResumenCierreCaja(this.resumencierrecaja);
			
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
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.resumencierrecajaLogic.getResumenCierreCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResumenCierreCajas(String sAccionBusqueda,List<ResumenCierreCaja> resumencierrecajasParaReportes) throws Exception {
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
					sPathReporteFinal="ResumenCierreCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResumenCierreCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResumenCierreCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ResumenCierreCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Resumen Cierre Cajas");		
		parameters.put("busquedapor", ResumenCierreCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResumenCierreCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResumenCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResumenCierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResumenCierreCaja=new JRBeanArrayDataSource(ResumenCierreCajaJInternalFrame.TraerResumenCierreCajaBeans(resumencierrecajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResumenCierreCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResumenCierreCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResumenCierreCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResumenCierreCajaBean.TraerResumenCierreCajaBeans(resumencierrecajasParaReportes).toArray()));
							
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
				this.generarExcelReporteResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResumenCierreCajaActionPerformed(null);
					//this.generarExcelReporteResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResumenCierreCajas(sAccionBusqueda,sTipoArchivoReporte,resumencierrecajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResumenCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenCierreCaja> resumencierrecajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenCierreCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResumenCierreCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ResumenCierreCaja resumencierrecaja : resumencierrecajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResumenCierreCajaConstantesFunciones.generarExcelReporteDataResumenCierreCaja("NORMAL",row,workbook,resumencierrecaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResumenCierreCaja(String sTipo,Row row,Workbook workbook) {
		
		ResumenCierreCajaConstantesFunciones.generarExcelReporteHeaderResumenCierreCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResumenCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenCierreCaja> resumencierrecajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenCierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ResumenCierreCaja resumencierrecaja : resumencierrecajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResumenCierreCajaConstantesFunciones.getResumenCierreCajaDescripcion(resumencierrecaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.gettipo_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getnombre_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumencierrecaja.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResumenCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenCierreCaja> resumencierrecajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ResumenCierreCaja> resumencierrecajasRespaldo=null;
		
		classes=ResumenCierreCajaConstantesFunciones.getClassesRelationshipsOfResumenCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.resumencierrecajaLogic.setDatosCliente(this.datosCliente);
		this.resumencierrecajaLogic.setDatosDeep(this.datosDeep);
		this.resumencierrecajaLogic.setIsConDeep(true);
		
		resumencierrecajasRespaldo=this.resumencierrecajaLogic.getResumenCierreCajas();
		
		this.resumencierrecajaLogic.setResumenCierreCajas(resumencierrecajasParaReportes);	
		this.resumencierrecajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		resumencierrecajasParaReportes=this.resumencierrecajaLogic.getResumenCierreCajas();
		this.resumencierrecajaLogic.setResumenCierreCajas(resumencierrecajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenCierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResumenCierreCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ResumenCierreCaja resumencierrecaja : resumencierrecajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResumenCierreCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResumenCierreCajaConstantesFunciones.generarExcelReporteDataResumenCierreCaja("NORMAL",row,workbook,resumencierrecaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ResumenCierreCajaConstantesFunciones.getResumenCierreCajaDescripcion(resumencierrecaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResumenCierreCaja() throws Exception {		
		this.startProcessResumenCierreCaja(true);
	}
	
	public void startProcessResumenCierreCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResumenCierreCaja ,this.jPanelParametrosReportesResumenCierreCaja, this.jScrollPanelDatosResumenCierreCaja,this.jPanelPaginacionResumenCierreCaja, this.jScrollPanelDatosEdicionResumenCierreCaja, this.jPanelAccionesResumenCierreCaja,this.jPanelAccionesFormularioResumenCierreCaja,this.jmenuBarResumenCierreCaja,this.jmenuBarDetalleResumenCierreCaja,this.jTtoolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasResumenCierreCaja=this.jTabbedPaneBusquedasResumenCierreCaja; 
		
		final JPanel jPanelParametrosReportesResumenCierreCaja=this.jPanelParametrosReportesResumenCierreCaja;
		//final JScrollPane jScrollPanelDatosResumenCierreCaja=this.jScrollPanelDatosResumenCierreCaja;
		final JTable jTableDatosResumenCierreCaja=this.jTableDatosResumenCierreCaja;		
		final JPanel jPanelPaginacionResumenCierreCaja=this.jPanelPaginacionResumenCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionResumenCierreCaja=this.jScrollPanelDatosEdicionResumenCierreCaja;
		final JPanel jPanelAccionesResumenCierreCaja=this.jPanelAccionesResumenCierreCaja;
		
		JPanel jPanelCamposAuxiliarResumenCierreCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResumenCierreCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			jPanelCamposAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jPanelCamposResumenCierreCaja;
			jPanelAccionesFormularioAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jPanelAccionesFormularioResumenCierreCaja;
		}
		
		final JPanel jPanelCamposResumenCierreCaja=jPanelCamposAuxiliarResumenCierreCaja;
		final JPanel jPanelAccionesFormularioResumenCierreCaja=jPanelAccionesFormularioAuxiliarResumenCierreCaja;
		
		
		final JMenuBar jmenuBarResumenCierreCaja=this.jmenuBarResumenCierreCaja;
		final JToolBar jTtoolBarResumenCierreCaja=this.jTtoolBarResumenCierreCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResumenCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResumenCierreCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			jmenuBarDetalleAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jmenuBarDetalleResumenCierreCaja;
			jTtoolBarDetalleAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jTtoolBarDetalleResumenCierreCaja;
		}
		
		final JMenuBar jmenuBarDetalleResumenCierreCaja=jmenuBarDetalleAuxiliarResumenCierreCaja;
		final JToolBar jTtoolBarDetalleResumenCierreCaja=jTtoolBarDetalleAuxiliarResumenCierreCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResumenCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResumenCierreCaja;
			processRunnable.jTableDatos=jTableDatosResumenCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposResumenCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionResumenCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesResumenCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResumenCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarResumenCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResumenCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarResumenCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResumenCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResumenCierreCaja ,jPanelParametrosReportesResumenCierreCaja,jTableDatosResumenCierreCaja, /*jScrollPanelDatosResumenCierreCaja,*/jPanelCamposResumenCierreCaja,jPanelPaginacionResumenCierreCaja, /*jScrollPanelDatosEdicionResumenCierreCaja,*/ jPanelAccionesResumenCierreCaja,jPanelAccionesFormularioResumenCierreCaja,jmenuBarResumenCierreCaja,jmenuBarDetalleResumenCierreCaja,jTtoolBarResumenCierreCaja,jTtoolBarDetalleResumenCierreCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResumenCierreCaja ,jPanelParametrosReportesResumenCierreCaja, jScrollPanelDatosResumenCierreCaja,jPanelPaginacionResumenCierreCaja, jScrollPanelDatosEdicionResumenCierreCaja, jPanelAccionesResumenCierreCaja,jPanelAccionesFormularioResumenCierreCaja,jmenuBarResumenCierreCaja,jmenuBarDetalleResumenCierreCaja,jTtoolBarResumenCierreCaja,jTtoolBarDetalleResumenCierreCaja);
						
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
	
	public void finishProcessResumenCierreCaja() {// throws Exception 
		this.finishProcessResumenCierreCaja(true);
	}
	
	public void finishProcessResumenCierreCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResumenCierreCaja ,this.jPanelParametrosReportesResumenCierreCaja, this.jScrollPanelDatosResumenCierreCaja,this.jPanelPaginacionResumenCierreCaja, this.jScrollPanelDatosEdicionResumenCierreCaja, this.jPanelAccionesResumenCierreCaja,this.jPanelAccionesFormularioResumenCierreCaja,this.jmenuBarResumenCierreCaja,this.jmenuBarDetalleResumenCierreCaja,this.jTtoolBarResumenCierreCaja,this.jTtoolBarDetalleResumenCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasResumenCierreCaja=this.jTabbedPaneBusquedasResumenCierreCaja; 
		
		final JPanel jPanelParametrosReportesResumenCierreCaja=this.jPanelParametrosReportesResumenCierreCaja;
		//final JScrollPane jScrollPanelDatosResumenCierreCaja=this.jScrollPanelDatosResumenCierreCaja;
		final JTable jTableDatosResumenCierreCaja=this.jTableDatosResumenCierreCaja;		
		final JPanel jPanelPaginacionResumenCierreCaja=this.jPanelPaginacionResumenCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionResumenCierreCaja=this.jScrollPanelDatosEdicionResumenCierreCaja;
		final JPanel jPanelAccionesResumenCierreCaja=this.jPanelAccionesResumenCierreCaja;
		
		JPanel jPanelCamposAuxiliarResumenCierreCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResumenCierreCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			jPanelCamposAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jPanelCamposResumenCierreCaja;
			jPanelAccionesFormularioAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jPanelAccionesFormularioResumenCierreCaja;
		}
		
		final JPanel jPanelCamposResumenCierreCaja=jPanelCamposAuxiliarResumenCierreCaja;
		final JPanel jPanelAccionesFormularioResumenCierreCaja=jPanelAccionesFormularioAuxiliarResumenCierreCaja;
		
		
		final JMenuBar jmenuBarResumenCierreCaja=this.jmenuBarResumenCierreCaja;		
		final JToolBar jTtoolBarResumenCierreCaja=this.jTtoolBarResumenCierreCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarResumenCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResumenCierreCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			jmenuBarDetalleAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jmenuBarDetalleResumenCierreCaja;
			jTtoolBarDetalleAuxiliarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jTtoolBarDetalleResumenCierreCaja;		
		}
		
		final JMenuBar jmenuBarDetalleResumenCierreCaja=jmenuBarDetalleAuxiliarResumenCierreCaja;
		final JToolBar jTtoolBarDetalleResumenCierreCaja=jTtoolBarDetalleAuxiliarResumenCierreCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResumenCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResumenCierreCaja;
			processRunnable.jTableDatos=jTableDatosResumenCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposResumenCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionResumenCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesResumenCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResumenCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarResumenCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResumenCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarResumenCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResumenCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResumenCierreCaja ,jPanelParametrosReportesResumenCierreCaja, jTableDatosResumenCierreCaja,/*jScrollPanelDatosResumenCierreCaja,*/jPanelCamposResumenCierreCaja,jPanelPaginacionResumenCierreCaja, /*jScrollPanelDatosEdicionResumenCierreCaja,*/ jPanelAccionesResumenCierreCaja,jPanelAccionesFormularioResumenCierreCaja,jmenuBarResumenCierreCaja,jmenuBarDetalleResumenCierreCaja,jTtoolBarResumenCierreCaja,jTtoolBarDetalleResumenCierreCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResumenCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResumenCierreCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResumenCierreCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResumenCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResumenCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResumenCierreCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResumenCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResumenCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResumenCierreCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.resumencierrecajaConstantesFunciones.getsFinalQueryResumenCierreCaja();
		String  finalQueryPaginacionTodos=this.resumencierrecajaConstantesFunciones.getsFinalQueryResumenCierreCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResumenCierreCajaConstantesFunciones.getArrayColumnasGlobalesNoResumenCierreCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResumenCierreCajaConstantesFunciones.getArrayColumnasGlobalesResumenCierreCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResumenCierreCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.resumencierrecajasEliminados= new ArrayList<ResumenCierreCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResumenCierreCaja();
		
				///*ResumenCierreCajaSessionBean*/this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			
			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
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
					this.iNumeroPaginacion=ResumenCierreCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResumenCierreCajaConstantesFunciones.getClassesForeignKeysOfResumenCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/resumencierrecaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			resumencierrecajasAux= new ArrayList<ResumenCierreCaja>();
			
				
			resumencierrecajaLogic.setDatosCliente(this.datosCliente);
			resumencierrecajaLogic.setDatosDeep(this.datosDeep);
			resumencierrecajaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaResumenCierreCaja")) {
				this.sDetalleReporte=ResumenCierreCajaConstantesFunciones.getDetalleIndiceBusquedaResumenCierreCaja(id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					resumencierrecajaLogic.getResumenCierreCajasBusquedaResumenCierreCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResumenCierreCajaConstantesFunciones.getDetalleIndiceBusquedaResumenCierreCaja(id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResumenCierreCajaConstantesFunciones.getDetalleIndiceBusquedaResumenCierreCaja(id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=resumencierrecajaLogic.getResumenCierreCajas()==null||resumencierrecajaLogic.getResumenCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=resumencierrecajas==null|| resumencierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						resumencierrecajasAux=new ArrayList<ResumenCierreCaja>();
						resumencierrecajasAux.addAll(resumencierrecajaLogic.getResumenCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumencierrecajasAux=new ArrayList<ResumenCierreCaja>();
							resumencierrecajasAux.addAll(resumencierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							resumencierrecajaLogic.getResumenCierreCajasBusquedaResumenCierreCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResumenCierreCajaConstantesFunciones.getDetalleIndiceBusquedaResumenCierreCaja(id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResumenCierreCajaConstantesFunciones.getDetalleIndiceBusquedaResumenCierreCaja(id_usuarioBusquedaResumenCierreCaja,id_cajaBusquedaResumenCierreCaja,fechaBusquedaResumenCierreCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResumenCierreCajas("BusquedaResumenCierreCaja",resumencierrecajaLogic.getResumenCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResumenCierreCajas("BusquedaResumenCierreCaja",resumencierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						resumencierrecajaLogic.setResumenCierreCajas(new ArrayList<ResumenCierreCaja>());
						resumencierrecajaLogic.getResumenCierreCajas().addAll(resumencierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumencierrecajas=new ArrayList<ResumenCierreCaja>();
							resumencierrecajas.addAll(resumencierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResumenCierreCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResumenCierreCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=resumencierrecajaLogic.getResumenCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumencierrecajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=resumencierrecajaLogic.getResumenCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumencierrecajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ResumenCierreCaja resumencierrecaja) {
		Boolean permite=true;
		
		if(this.resumencierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResumenCierreCajaConstantesFunciones.getOrderByListaResumenCierreCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResumenCierreCajaConstantesFunciones.getOrderByListaResumenCierreCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenCierreCaja resumencierrecaja:resumencierrecajaLogic.getResumenCierreCajas()) {
				if(resumencierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					resumencierrecajaTotales=resumencierrecaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenCierreCaja resumencierrecaja:this.resumencierrecajas) {
				if(resumencierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					resumencierrecajaTotales=resumencierrecaja;
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
			this.resumencierrecajaAux=new ResumenCierreCaja();
			this.resumencierrecajaAux.setsType(Constantes2.S_TOTALES);
			this.resumencierrecajaAux.setIsNew(false);
			this.resumencierrecajaAux.setIsChanged(false);
			this.resumencierrecajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ResumenCierreCajaConstantesFunciones.TotalizarValoresFilaResumenCierreCaja(this.resumencierrecajaLogic.getResumenCierreCajas(),this.resumencierrecajaAux);
				
				//this.resumencierrecajaLogic.getResumenCierreCajas().add(this.resumencierrecajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResumenCierreCajaConstantesFunciones.TotalizarValoresFilaResumenCierreCaja(this.resumencierrecajas,this.resumencierrecajaAux);
				
				this.resumencierrecajas.add(this.resumencierrecajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		resumencierrecajaTotales=new ResumenCierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumencierrecajaLogic.getResumenCierreCajas().remove(resumencierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumencierrecajas.remove(resumencierrecajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		resumencierrecajaTotales=new ResumenCierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenCierreCaja resumencierrecaja:resumencierrecajaLogic.getResumenCierreCajas()) {
				if(resumencierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					resumencierrecajaTotales=resumencierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenCierreCajaConstantesFunciones.TotalizarValoresFilaResumenCierreCaja(this.resumencierrecajaLogic.getResumenCierreCajas(),resumencierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenCierreCaja resumencierrecaja:this.resumencierrecajas) {
				if(resumencierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					resumencierrecajaTotales=resumencierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenCierreCajaConstantesFunciones.TotalizarValoresFilaResumenCierreCaja(this.resumencierrecajas,resumencierrecajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResumenCierreCajasBusquedaResumenCierreCaja()throws Exception {
		try {
			sAccionBusqueda="BusquedaResumenCierreCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResumenCierreCajasFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResumenCierreCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResumenCierreCajasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResumenCierreCajasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getResumenCierreCajasBusquedaResumenCierreCaja(String sFinalQuery,Long id_usuario,Long id_caja,Date fecha)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//resumencierrecajaLogic.getResumenCierreCajasBusquedaResumenCierreCaja(sFinalQuery,this.pagination,id_usuario,id_caja,fecha);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResumenCierreCajasFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//resumencierrecajaLogic.getResumenCierreCajasFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResumenCierreCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//resumencierrecajaLogic.getResumenCierreCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResumenCierreCajasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//resumencierrecajaLogic.getResumenCierreCajasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResumenCierreCajasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//resumencierrecajaLogic.getResumenCierreCajasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosResumenCierreCaja() {
		this.isPermisoTodoResumenCierreCaja=false;
		this.isPermisoNuevoResumenCierreCaja=false;
		this.isPermisoActualizarResumenCierreCaja=false;
		this.isPermisoActualizarOriginalResumenCierreCaja=false;
		this.isPermisoEliminarResumenCierreCaja=false;
		this.isPermisoGuardarCambiosResumenCierreCaja=false;
		this.isPermisoConsultaResumenCierreCaja=true;
		this.isPermisoBusquedaResumenCierreCaja=true;
		this.isPermisoReporteResumenCierreCaja=true;
		this.isPermisoOrdenResumenCierreCaja=false;		
		this.isPermisoPaginacionMedioResumenCierreCaja=false;		
		this.isPermisoPaginacionAltoResumenCierreCaja=false;		
		this.isPermisoPaginacionTodoResumenCierreCaja=false;		
		this.isPermisoCopiarResumenCierreCaja=false;		
		this.isPermisoVerFormResumenCierreCaja=false;		
		this.isPermisoDuplicarResumenCierreCaja=false;
		this.isPermisoOrdenResumenCierreCaja=false;
	}
	
	public void setPermisosUsuarioResumenCierreCaja(Boolean isPermiso) {
		this.isPermisoTodoResumenCierreCaja=isPermiso;
		this.isPermisoNuevoResumenCierreCaja=isPermiso;
		this.isPermisoActualizarResumenCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalResumenCierreCaja=isPermiso;
		this.isPermisoEliminarResumenCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosResumenCierreCaja=isPermiso;
		this.isPermisoConsultaResumenCierreCaja=isPermiso;
		this.isPermisoBusquedaResumenCierreCaja=isPermiso;
		this.isPermisoReporteResumenCierreCaja=isPermiso;
		this.isPermisoOrdenResumenCierreCaja=isPermiso;		
		this.isPermisoPaginacionMedioResumenCierreCaja=isPermiso;		
		this.isPermisoPaginacionAltoResumenCierreCaja=isPermiso;		
		this.isPermisoPaginacionTodoResumenCierreCaja=isPermiso;		
		this.isPermisoCopiarResumenCierreCaja=isPermiso;		
		this.isPermisoVerFormResumenCierreCaja=isPermiso;		
		this.isPermisoDuplicarResumenCierreCaja=isPermiso;
		this.isPermisoOrdenResumenCierreCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResumenCierreCaja(Boolean isPermiso) {
		//this.isPermisoTodoResumenCierreCaja=isPermiso;
		this.isPermisoNuevoResumenCierreCaja=isPermiso;
		this.isPermisoActualizarResumenCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalResumenCierreCaja=isPermiso;
		this.isPermisoEliminarResumenCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosResumenCierreCaja=isPermiso;
		//this.isPermisoConsultaResumenCierreCaja=isPermiso;
		//this.isPermisoBusquedaResumenCierreCaja=isPermiso;
		//this.isPermisoReporteResumenCierreCaja=isPermiso;
		//this.isPermisoOrdenResumenCierreCaja=isPermiso;		
		//this.isPermisoPaginacionMedioResumenCierreCaja=isPermiso;		
		//this.isPermisoPaginacionAltoResumenCierreCaja=isPermiso;		
		//this.isPermisoPaginacionTodoResumenCierreCaja=isPermiso;		
		//this.isPermisoCopiarResumenCierreCaja=isPermiso;		
		//this.isPermisoDuplicarResumenCierreCaja=isPermiso;
		//this.isPermisoOrdenResumenCierreCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResumenCierreCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ResumenCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebResumenCierreCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResumenCierreCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioResumenCierreCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResumenCierreCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResumenCierreCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioResumenCierreCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResumenCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResumenCierreCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResumenCierreCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResumenCierreCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResumenCierreCaja=this.isPermisoActualizarResumenCierreCaja;
			this.isPermisoEliminarResumenCierreCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResumenCierreCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResumenCierreCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResumenCierreCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResumenCierreCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResumenCierreCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResumenCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResumenCierreCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResumenCierreCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResumenCierreCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResumenCierreCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResumenCierreCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResumenCierreCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResumenCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResumenCierreCaja.setToolTipText(this.jTableDatosResumenCierreCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResumenCierreCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResumenCierreCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResumenCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResumenCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResumenCierreCaja() throws Exception {
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
	public void inicializarCombosForeignKeyResumenCierreCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResumenCierreCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResumenCierreCajaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyResumenCierreCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.resumencierrecajaSessionBean==null) {
				this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean();
			}

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.resumencierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
	
	public void initActionsCombosTodosForeignKeyResumenCierreCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResumenCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResumenCierreCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResumenCierreCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResumenCierreCaja(ResumenCierreCaja resumencierrecaja)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(resumencierrecaja.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResumenCierreCaja(ResumenCierreCaja resumencierrecaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResumenCierreCaja()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.resumencierrecajaConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResumenCierreCaja()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResumenCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResumenCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResumenCierreCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResumenCierreCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResumenCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResumenCierreCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ResumenCierreCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResumenCierreCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResumenCierreCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.resumencierrecajaSessionBean=new ResumenCierreCajaSessionBean(); 
		this.resumencierrecajaConstantesFunciones=new ResumenCierreCajaConstantesFunciones(); 
		this.resumencierrecajaBean=new ResumenCierreCaja();//(this.resumencierrecajaConstantesFunciones); 		
		this.resumencierrecajaReturnGeneral=new ResumenCierreCajaParameterReturnGeneral(); 
		
		this.resumencierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumencierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResumenCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResumenCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResumenCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResumenCierreCaja(true);
			
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
			
			this.resumencierrecajaConstantesFunciones=new ResumenCierreCajaConstantesFunciones(); 
			this.resumencierrecajaBean=new ResumenCierreCaja();//this.resumencierrecajaConstantesFunciones); 			
			this.resumencierrecajaReturnGeneral=new ResumenCierreCajaParameterReturnGeneral(); 
		
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Resumen Cierre Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.resumencierrecaja=new ResumenCierreCaja();
			this.resumencierrecajas = new ArrayList<ResumenCierreCaja>();
			this.resumencierrecajasAux = new ArrayList<ResumenCierreCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic=new ResumenCierreCajaLogic();
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.resumencierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.resumencierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResumenCierreCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResumenCierreCaja);	
					}
					
					if(this.jInternalFrameImportacionResumenCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResumenCierreCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResumenCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResumenCierreCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResumenCierreCaja);
				this.jInternalFrameDetalleFormResumenCierreCaja.setVisible(false);
				this.jInternalFrameDetalleFormResumenCierreCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResumenCierreCaja);
					this.jInternalFrameReporteDinamicoResumenCierreCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoResumenCierreCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResumenCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResumenCierreCaja);
					this.jInternalFrameImportacionResumenCierreCaja.setVisible(false);
					this.jInternalFrameImportacionResumenCierreCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResumenCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResumenCierreCaja);
					this.jInternalFrameOrderByResumenCierreCaja.setVisible(false);
					this.jInternalFrameOrderByResumenCierreCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResumenCierreCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResumenCierreCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.resumencierrecajaReturnGeneral=new ResumenCierreCajaParameterReturnGeneral();
			
			this.resumencierrecajaParameterGeneral=new ResumenCierreCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.resumencierrecajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResumenCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResumenCierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),this.resumencierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResumenCierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),this.resumencierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaDuplicarResumenCierreCaja=true;
			this.isVisibilidadCeldaCopiarResumenCierreCaja=true;
			this.isVisibilidadCeldaVerFormResumenCierreCaja=true;
			this.isVisibilidadCeldaOrdenResumenCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			
			
			this.isVisibilidadBusquedaResumenCierreCaja=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResumenCierreCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResumenCierreCaja(false);
			
			this.setPermisosUsuarioResumenCierreCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado() 
				|| (this.resumencierrecajaSessionBean.getEsGuardarRelacionado() && this.resumencierrecajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResumenCierreCajaClasesRelacionadas();
			}
			
			if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResumenCierreCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResumenCierreCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResumenCierreCaja();
			}
			
			if(!this.isPermisoBusquedaResumenCierreCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResumenCierreCajaConstantesFunciones.getTiposSeleccionarResumenCierreCaja());
				
				this.tiposColumnasSelect=ResumenCierreCajaConstantesFunciones.getTiposSeleccionarResumenCierreCaja(true);
				
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
			//if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResumenCierreCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioResumenCierreCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioResumenCierreCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenCierreCaja() ;
			
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
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				resumencierrecajaImplementable= (ResumenCierreCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResumenCierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				resumencierrecajaImplementableHome= (ResumenCierreCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResumenCierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.resumencierrecajas= new ArrayList<ResumenCierreCaja>();
			this.resumencierrecajasEliminados= new ArrayList<ResumenCierreCaja>();
						
			this.isEsNuevoResumenCierreCaja=false;
			this.esParaAccionDesdeFormularioResumenCierreCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResumenCierreCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResumenCierreCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResumenCierreCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResumenCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResumenCierreCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResumenCierreCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResumenCierreCaja();
			}
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResumenCierreCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResumenCierreCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResumenCierreCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResumenCierreCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ResumenCierreCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResumenCierreCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesResumenCierreCaja")) {
				iIndex=this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResumenCierreCaja();	
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
	
	public void cargarCombosForeignKeyResumenCierreCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResumenCierreCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResumenCierreCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResumenCierreCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResumenCierreCaja();
		
		this.cargarCombosFrameForeignKeyResumenCierreCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResumenCierreCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResumenCierreCaja();
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
	
	public void jButtonNuevoResumenCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			
			if(jTableDatosResumenCierreCaja.getRowCount()>=1) {
				jTableDatosResumenCierreCaja.removeRowSelectionInterval(0, jTableDatosResumenCierreCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoResumenCierreCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResumenCierreCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResumenCierreCaja(true);			
			//this.resumencierrecaja=new ResumenCierreCaja();
			//this.resumencierrecaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenCierreCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenCierreCaja() ;
			
			if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenCierreCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.resumencierrecaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);				
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ResumenCierreCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResumenCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResumenCierreCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResumenCierreCaja.getSelectedRows().length;			
			}
			
			resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResumenCierreCaja--;			
				//ResumenCierreCaja resumencierrecajaAux= new ResumenCierreCaja();			
				//resumencierrecajaAux.setId(this.iIdNuevoResumenCierreCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ResumenCierreCaja resumencierrecajaOrigen=new ResumenCierreCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ResumenCierreCaja resumencierrecajaOrigen : resumencierrecajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							resumencierrecajaOrigen =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumencierrecajaOrigen =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResumenCierreCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.resumencierrecaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResumenCierreCaja(resumencierrecajaOrigen,this.resumencierrecaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.resumencierrecajaLogic.getResumenCierreCajas().add(this.resumencierrecajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.resumencierrecajas.add(this.resumencierrecajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
				
				this.jTableDatosResumenCierreCaja.setRowSelectionInterval(this.getIndiceNuevoResumenCierreCaja(), this.getIndiceNuevoResumenCierreCaja());
				
				int iLastRow =  this.jTableDatosResumenCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResumenCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResumenCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenCierreCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();									
		
			ResumenCierreCaja resumencierrecajaOrigen=new ResumenCierreCaja();
			ResumenCierreCaja resumencierrecajaDestino=new ResumenCierreCaja();
				
			resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResumenCierreCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || resumencierrecajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResumenCierreCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumencierrecajaOrigen =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						resumencierrecajaOrigen =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumencierrecajaDestino =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						resumencierrecajaDestino =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				resumencierrecajaOrigen =resumencierrecajasSeleccionados.get(0);
				resumencierrecajaDestino =resumencierrecajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResumenCierreCaja(resumencierrecajaOrigen,resumencierrecajaDestino,true,false);
				
				resumencierrecajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(resumencierrecajaDestino,resumencierrecajaLogic.getResumenCierreCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(resumencierrecajaDestino,resumencierrecajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
				
				//this.jTableDatosResumenCierreCaja.setRowSelectionInterval(this.getIndiceNuevoResumenCierreCaja(), this.getIndiceNuevoResumenCierreCaja());
				
				int iLastRow =  this.jTableDatosResumenCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResumenCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResumenCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenCierreCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResumenCierreCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResumenCierreCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResumenCierreCaja.setVisible(!isVisible);
			this.jPanelPaginacionResumenCierreCaja.setVisible(!isVisible);
			this.jPanelAccionesResumenCierreCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResumenCierreCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResumenCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResumenCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResumenCierreCaja();
			
			this.abrirFrameOrderByResumenCierreCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResumenCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResumenCierreCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResumenCierreCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResumenCierreCaja.isMaximum()) {
					this.jInternalFrameDetalleFormResumenCierreCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResumenCierreCaja.setSize(this.jInternalFrameDetalleFormResumenCierreCaja.iWidthFormulario,this.jInternalFrameDetalleFormResumenCierreCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResumenCierreCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResumenCierreCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResumenCierreCaja.isMaximum()) {
						this.jInternalFrameDetalleFormResumenCierreCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResumenCierreCaja.jContentPaneDetalleResumenCierreCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResumenCierreCaja.jContentPaneDetalleResumenCierreCaja.getWidth(),ResumenCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResumenCierreCaja.jContentPaneDetalleResumenCierreCaja.getWidth(),ResumenCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResumenCierreCaja.jContentPaneDetalleResumenCierreCaja.getWidth(),ResumenCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResumenCierreCaja.setVisible(true);
	        this.jInternalFrameDetalleFormResumenCierreCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResumenCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResumenCierreCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResumenCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenCierreCaja,false,this);
				} else {
					this.jInternalFrameOrderByResumenCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenCierreCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResumenCierreCaja);
				this.jInternalFrameOrderByResumenCierreCaja.setVisible(false);
				this.jInternalFrameOrderByResumenCierreCaja.setSelected(false);
				
				this.jInternalFrameOrderByResumenCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResumenCierreCaja"));
				
				this.inicializarActualizarBindingTablaOrderByResumenCierreCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResumenCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResumenCierreCaja==null) {
				
				this.jInternalFrameImportacionResumenCierreCaja=new ImportacionJInternalFrame(ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResumenCierreCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResumenCierreCaja);
				this.jInternalFrameImportacionResumenCierreCaja.setVisible(false);
				this.jInternalFrameImportacionResumenCierreCaja.setSelected(false);


				this.jInternalFrameImportacionResumenCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResumenCierreCaja"));
				this.jInternalFrameImportacionResumenCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResumenCierreCaja"));
				this.jInternalFrameImportacionResumenCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResumenCierreCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResumenCierreCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResumenCierreCaja==null) {
				this.jInternalFrameReporteDinamicoResumenCierreCaja=new ReporteDinamicoJInternalFrame(ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResumenCierreCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResumenCierreCaja);
				this.jInternalFrameReporteDinamicoResumenCierreCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoResumenCierreCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenCierreCaja"));
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenCierreCaja"));
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenCierreCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenCierreCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleResumenCierreCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResumenCierreCaja);
			
	       	this.jInternalFrameDetalleFormResumenCierreCaja.setVisible(false);
	        this.jInternalFrameDetalleFormResumenCierreCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormResumenCierreCaja.dispose();
			//this.jInternalFrameDetalleFormResumenCierreCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResumenCierreCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResumenCierreCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoResumenCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResumenCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResumenCierreCaja.setVisible(true);
	        this.jInternalFrameImportacionResumenCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResumenCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResumenCierreCaja.setVisible(true);
	        this.jInternalFrameOrderByResumenCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResumenCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResumenCierreCaja.setVisible(false);
	        this.jInternalFrameOrderByResumenCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResumenCierreCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResumenCierreCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoResumenCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResumenCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResumenCierreCaja.setVisible(false);
	        this.jInternalFrameImportacionResumenCierreCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResumenCierreCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResumenCierreCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResumenCierreCaja(true);
			//this.isEsNuevoResumenCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResumenCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenCierreCaja(false) ;
			
			if(resumencierrecajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenCierreCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResumenCierreCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResumenCierreCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResumenCierreCaja(true);
			//this.isEsNuevoResumenCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.resumencierrecaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResumenCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResumenCierreCaja(false) ;
			
			if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenCierreCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResumenCierreCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResumenCierreCaja(false);
			
			//if(!this.isEsNuevoResumenCierreCaja) {								
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				
			}
			
			if(this.permiteMantenimiento(this.resumencierrecaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResumenCierreCaja=true;
					this.inicializarActualizarBindingTablaResumenCierreCaja(false);
					this.isEsNuevoResumenCierreCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResumenCierreCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResumenCierreCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResumenCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenCierreCaja(false);
				
				this.habilitarDeshabilitarControlesResumenCierreCaja(false);
			
												
				
				if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResumenCierreCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResumenCierreCajaActionPerformed(evt,resumencierrecajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResumenCierreCaja(this.resumencierrecaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResumenCierreCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,resumencierrecajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.resumencierrecaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.resumencierrecaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.resumencierrecaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.resumencierrecaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResumenCierreCajaModel) this.jTableDatosResumenCierreCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResumenCierreCaja=true;
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
				this.isEsNuevoResumenCierreCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResumenCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenCierreCaja(false);
				
				this.habilitarDeshabilitarControlesResumenCierreCaja(false);
				
				
				
				if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResumenCierreCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResumenCierreCaja.getRowCount()>=1) {
				jTableDatosResumenCierreCaja.removeRowSelectionInterval(0, jTableDatosResumenCierreCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResumenCierreCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenCierreCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenCierreCaja(false) ;
			
			this.isEsNuevoResumenCierreCaja=false;
			
			if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResumenCierreCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResumenCierreCaja(false);
				
				//SI ES MANUAL
				if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResumenCierreCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResumenCierreCaja--;			
			//ResumenCierreCaja resumencierrecajaAux= new ResumenCierreCaja();			
			//resumencierrecajaAux.setId(this.iIdNuevoResumenCierreCaja);
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResumenCierreCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
			
			this.resumencierrecaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.resumencierrecajaLogic.getResumenCierreCajas().add(this.resumencierrecajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.resumencierrecajas.add(this.resumencierrecajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			
			this.jTableDatosResumenCierreCaja.setRowSelectionInterval(this.getIndiceNuevoResumenCierreCaja(), this.getIndiceNuevoResumenCierreCaja());
			
			int iLastRow =  this.jTableDatosResumenCierreCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResumenCierreCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResumenCierreCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenCierreCaja(false);
			
			//SI ES MANUAL
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenCierreCaja();
			}
			
			//this.abrirFrameTreeResumenCierreCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResumenCierreCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResumenCierreCaja.setFileImportacion(this.jInternalFrameImportacionResumenCierreCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResumenCierreCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResumenCierreCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResumenCierreCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResumenCierreCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		

		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResumenCierreCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResumenCierreCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO:
					sNombreCampoCategoria="tipo_pago";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoria="nombre_usuario";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO:
					sNombreCampoCategoriaValor="tipo_pago";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoriaValor="nombre_usuario";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_pago");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_usuario");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ResumenCierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.gettipo_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getnombre_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenCierreCajaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ResumenCierreCaja resumencierrecaja:resumencierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumencierrecaja.gettotal());
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
			//	this.getFilaCabeceraExportarExcelResumenCierreCaja(row);				
			//	iRow++;
			//}				
			
			//for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResumenCierreCaja(resumencierrecajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenCierreCaja(false);
			
			//SI ES MANUAL
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenCierreCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenCierreCaja(false);
			
			//SI ES MANUAL
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResumenCierreCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenCierreCaja(false);
			
			//SI ES MANUAL
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResumenCierreCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResumenCierreCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResumenCierreCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResumenCierreCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResumenCierreCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResumenCierreCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResumenCierreCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosResumenCierreCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosResumenCierreCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResumenCierreCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResumenCierreCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResumenCierreCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResumenCierreCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResumenCierreCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResumenCierreCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenCierreCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResumenCierreCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResumenCierreCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResumenCierreCaja();
		
		this.inicializarActualizarBindingBotonesManualResumenCierreCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResumenCierreCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenCierreCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResumenCierreCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResumenCierreCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResumenCierreCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResumenCierreCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResumenCierreCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionNuevoResumenCierreCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionSinCerrarResumenCierreCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionSinMensajeResumenCierreCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResumenCierreCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResumenCierreCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResumenCierreCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionNuevoResumenCierreCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionSinCerrarResumenCierreCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResumenCierreCaja.jCheckBoxPostAccionSinMensajeResumenCierreCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResumenCierreCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResumenCierreCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResumenCierreCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResumenCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResumenCierreCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResumenCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResumenCierreCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResumenCierreCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResumenCierreCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResumenCierreCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResumenCierreCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResumenCierreCaja() throws Exception {
		try	{
			if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResumenCierreCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResumenCierreCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResumenCierreCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResumenCierreCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResumenCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResumenCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResumenCierreCaja.addItem(reporte);
			}
			
			
			if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResumenCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResumenCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResumenCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResumenCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResumenCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResumenCierreCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResumenCierreCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenCierreCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenCierreCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ResumenCierreCajaConstantesFunciones.getTiposSeleccionarResumenCierreCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ResumenCierreCajaConstantesFunciones.getTiposSeleccionarResumenCierreCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ResumenCierreCajaConstantesFunciones.getTiposSeleccionarResumenCierreCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoResumenCierreCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResumenCierreCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.getSelectedItem()!=null){this.id_usuarioBusquedaResumenCierreCaja=((Usuario)this.jComboBoxid_usuarioBusquedaResumenCierreCajaResumenCierreCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.getSelectedItem()!=null){this.id_cajaBusquedaResumenCierreCaja=((Caja)this.jComboBoxid_cajaBusquedaResumenCierreCajaResumenCierreCaja.getSelectedItem()).getId();}
		this.fechaBusquedaResumenCierreCaja=new Date(this.jDateChooserfechaBusquedaResumenCierreCajaResumenCierreCaja.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResumenCierreCaja(Boolean esInicializar) throws Exception {				
		if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResumenCierreCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResumenCierreCaja() throws Exception {
		this.inicializarActualizarBindingTablaResumenCierreCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResumenCierreCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResumenCierreCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResumenCierreCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=resumencierrecajaLogic.getResumenCierreCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=resumencierrecajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResumenCierreCaja.setModel(new ResumenCierreCajaModel(this.resumencierrecajaLogic.getResumenCierreCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResumenCierreCaja.setModel(new ResumenCierreCajaModel(this.resumencierrecajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResumenCierreCaja!=null && this.jInternalFrameOrderByResumenCierreCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResumenCierreCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,resumencierrecajaConstantesFunciones.resaltarSeleccionarResumenCierreCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResumenCierreCajaConstantesFunciones.SCLASSWEBTITULO,resumencierrecajaConstantesFunciones.resaltarSeleccionarResumenCierreCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_ID));

		if(this.resumencierrecajaConstantesFunciones.mostraridResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumencierrecajaConstantesFunciones.resaltaridResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activaridResumenCierreCaja,iSizeTabla,this,true,"idResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltaridResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activaridResumenCierreCaja,this,true,"idResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO));

		if(this.resumencierrecajaConstantesFunciones.mostrartipo_pagoResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.resumencierrecajaConstantesFunciones.resaltartipo_pagoResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activartipo_pagoResumenCierreCaja,iSizeTabla,this,true,"tipo_pagoResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltartipo_pagoResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activartipo_pagoResumenCierreCaja,this,true,"tipo_pagoResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO));

		if(this.resumencierrecajaConstantesFunciones.mostrarnombre_usuarioResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.resumencierrecajaConstantesFunciones.resaltarnombre_usuarioResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarnombre_usuarioResumenCierreCaja,iSizeTabla,this,true,"nombre_usuarioResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltarnombre_usuarioResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarnombre_usuarioResumenCierreCaja,this,true,"nombre_usuarioResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.resumencierrecajaConstantesFunciones.mostrarnombre_cajaResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.resumencierrecajaConstantesFunciones.resaltarnombre_cajaResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarnombre_cajaResumenCierreCaja,iSizeTabla,this,true,"nombre_cajaResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltarnombre_cajaResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarnombre_cajaResumenCierreCaja,this,true,"nombre_cajaResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_VALOR));

		if(this.resumencierrecajaConstantesFunciones.mostrarvalorResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumencierrecajaConstantesFunciones.resaltarvalorResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarvalorResumenCierreCaja,iSizeTabla,this,true,"valorResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltarvalorResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activarvalorResumenCierreCaja,this,true,"valorResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,ResumenCierreCajaConstantesFunciones.LABEL_TOTAL));

		if(this.resumencierrecajaConstantesFunciones.mostrartotalResumenCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenCierreCajaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumencierrecajaConstantesFunciones.resaltartotalResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activartotalResumenCierreCaja,iSizeTabla,this,true,"totalResumenCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumencierrecajaConstantesFunciones.resaltartotalResumenCierreCaja,this.resumencierrecajaConstantesFunciones.activartotalResumenCierreCaja,this,true,"totalResumenCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResumenCierreCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResumenCierreCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResumenCierreCaja.addColumn(tableColumn);
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
			
			this.jTableDatosResumenCierreCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResumenCierreCaja.moveColumn(this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResumenCierreCaja.moveColumn(this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResumenCierreCaja.moveColumn(this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResumenCierreCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResumenCierreCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResumenCierreCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResumenCierreCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResumenCierreCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResumenCierreCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResumenCierreCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=resumencierrecajaLogic.getResumenCierreCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=resumencierrecajas.size()-1;
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
		//this.jTableDatosResumenCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResumenCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResumenCierreCaja();
			
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
				
				//this.isEsNuevoResumenCierreCaja=false;
					
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
				if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResumenCierreCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResumenCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResumenCierreCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.resumencierrecaja.getsType().equals("DUPLICADO")
				   || this.resumencierrecaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResumenCierreCaja=true;
				
				} else {
					this.isEsNuevoResumenCierreCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
					if(this.resumencierrecaja.getId()>=0 && !this.resumencierrecaja.getIsNew()) {						
						this.isEsNuevoResumenCierreCaja=false;
						
					} else {
						this.isEsNuevoResumenCierreCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResumenCierreCaja(esRelaciones);						
				
				this.seleccionarResumenCierreCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.resumencierrecaja.getId()<0) {
					this.isEsNuevoResumenCierreCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResumenCierreCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResumenCierreCaja(evt,rowIndex);
				}	
				
				if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ResumenCierreCaja: " + this.dDif); 
					}
				}								
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResumenCierreCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.resumencierrecaja)) {
					if(this.resumencierrecaja.getId()>0) {
						this.resumencierrecaja.setIsDeleted(true);
						
						this.resumencierrecajasEliminados.add(this.resumencierrecaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.resumencierrecajaLogic.getResumenCierreCajas().remove(this.resumencierrecaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.resumencierrecajas.remove(this.resumencierrecaja);				
					}
					
					
					((ResumenCierreCajaModel) this.jTableDatosResumenCierreCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenCierreCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResumenCierreCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResumenCierreCaja) {
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResumenCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResumenCierreCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.resumencierrecajaConstantesFunciones.cargarid_usuarioResumenCierreCaja || this.resumencierrecajaConstantesFunciones.event_dependid_usuarioResumenCierreCaja) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.resumencierrecaja.getid_usuario());
									//this.inicializarActualizarBindingResumenCierreCaja(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(resumencierrecaja.getUsuario()!=null) {
							this.usuariosForeignKey.add(resumencierrecaja.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.resumencierrecaja.getid_usuario(),false,"Formulario");

					//Caja
					if(!this.resumencierrecajaConstantesFunciones.cargarid_cajaResumenCierreCaja || this.resumencierrecajaConstantesFunciones.event_dependid_cajaResumenCierreCaja) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.resumencierrecaja.getid_caja());
									//this.inicializarActualizarBindingResumenCierreCaja(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(resumencierrecaja.getCaja()!=null) {
							this.cajasForeignKey.add(resumencierrecaja.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.resumencierrecaja.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResumenCierreCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResumenCierreCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenCierreCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResumenCierreCaja(ResumenCierreCaja resumencierrecaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResumenCierreCaja(resumencierrecaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResumenCierreCaja(resumencierrecaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResumenCierreCaja(resumencierrecaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResumenCierreCaja(resumencierrecaja);
	}
	
	public void setVariablesObjetoActualToFormularioResumenCierreCaja(ResumenCierreCaja resumencierrecaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setText(resumencierrecaja.getId().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setText(resumencierrecaja.gettipo_pago());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setText(resumencierrecaja.getnombre_usuario());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setText(resumencierrecaja.getnombre_caja());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setText(resumencierrecaja.getvalor().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setText(resumencierrecaja.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ResumenCierreCaja resumencierrecajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,resumencierrecajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ResumenCierreCaja resumencierrecajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				resumencierrecajaLocal=this.resumencierrecaja;
			} else {
				resumencierrecajaLocal=this.resumencierrecajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(resumencierrecajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResumenCierreCaja(resumencierrecajaLocal,true);
					
					if(resumencierrecajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(resumencierrecajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(resumencierrecajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResumenCierreCaja(resumencierrecaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(resumencierrecaja);
	}
	
	public void setVariablesFormularioToObjetoActualResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResumenCierreCaja(resumencierrecaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.getText()==null || this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.getText()=="" || this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setText("0");
			}

			if(conColumnasBase) {resumencierrecaja.setId(Long.parseLong(this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelIdResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumencierrecaja.settipo_pago(this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltipo_pagoResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumencierrecaja.setnombre_usuario(this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_usuarioResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumencierrecaja.setnombre_caja(this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelnombre_cajaResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumencierrecaja.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabelvalorResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumencierrecaja.settotal(Double.parseDouble(this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenCierreCajaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenCierreCaja.jLabeltotalResumenCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResumenCierreCaja(ResumenCierreCaja resumencierrecajaBean,ResumenCierreCaja resumencierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResumenCierreCaja(ResumenCierreCaja resumencierrecajaOrigen,ResumenCierreCaja resumencierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && resumencierrecajaOrigen.getId()!=null && !resumencierrecajaOrigen.getId().equals(0L))) {resumencierrecaja.setId(resumencierrecajaOrigen.getId());}}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.getid_caja()!=null && !resumencierrecajaOrigen.getid_caja().equals(-1L))) {resumencierrecaja.setid_caja(resumencierrecajaOrigen.getid_caja());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.getfecha()!=null && !resumencierrecajaOrigen.getfecha().equals(new Date()))) {resumencierrecaja.setfecha(resumencierrecajaOrigen.getfecha());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.gettipo_pago()!=null && !resumencierrecajaOrigen.gettipo_pago().equals(""))) {resumencierrecaja.settipo_pago(resumencierrecajaOrigen.gettipo_pago());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.getnombre_usuario()!=null && !resumencierrecajaOrigen.getnombre_usuario().equals(""))) {resumencierrecaja.setnombre_usuario(resumencierrecajaOrigen.getnombre_usuario());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.getnombre_caja()!=null && !resumencierrecajaOrigen.getnombre_caja().equals(""))) {resumencierrecaja.setnombre_caja(resumencierrecajaOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.getvalor()!=null && !resumencierrecajaOrigen.getvalor().equals(0.0))) {resumencierrecaja.setvalor(resumencierrecajaOrigen.getvalor());}
			if(conDefault || (!conDefault && resumencierrecajaOrigen.gettotal()!=null && !resumencierrecajaOrigen.gettotal().equals(0.0))) {resumencierrecaja.settotal(resumencierrecajaOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResumenCierreCaja(ResumenCierreCaja resumencierrecaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setText(resumencierrecaja.getId().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setText(resumencierrecaja.gettipo_pago());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setText(resumencierrecaja.getnombre_usuario());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setText(resumencierrecaja.getnombre_caja());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setText(resumencierrecaja.getvalor().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setText(resumencierrecaja.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResumenCierreCaja(ResumenCierreCajaBean resumencierrecajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setText(resumencierrecajaBean.getId().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setText(resumencierrecajaBean.gettipo_pago());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setText(resumencierrecajaBean.getnombre_usuario());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setText(resumencierrecajaBean.getnombre_caja());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setText(resumencierrecajaBean.getvalor().toString());
			this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setText(resumencierrecajaBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResumenCierreCaja(ResumenCierreCajaParameterReturnGeneral resumencierrecajaReturnGeneral,ResumenCierreCajaBean resumencierrecajaBean,Boolean conDefault) throws Exception { 
		try {
			ResumenCierreCaja resumencierrecajaLocal=new ResumenCierreCaja();
			
			resumencierrecajaLocal=resumencierrecajaReturnGeneral.getResumenCierreCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && resumencierrecajaLocal.getId()!=null && !resumencierrecajaLocal.getId().equals(0L))) {resumencierrecajaBean.setId(resumencierrecajaLocal.getId());}}
			if(conDefault || (!conDefault && resumencierrecajaLocal.gettipo_pago()!=null && !resumencierrecajaLocal.gettipo_pago().equals(""))) {resumencierrecajaBean.settipo_pago(resumencierrecajaLocal.gettipo_pago());}
			if(conDefault || (!conDefault && resumencierrecajaLocal.getnombre_usuario()!=null && !resumencierrecajaLocal.getnombre_usuario().equals(""))) {resumencierrecajaBean.setnombre_usuario(resumencierrecajaLocal.getnombre_usuario());}
			if(conDefault || (!conDefault && resumencierrecajaLocal.getnombre_caja()!=null && !resumencierrecajaLocal.getnombre_caja().equals(""))) {resumencierrecajaBean.setnombre_caja(resumencierrecajaLocal.getnombre_caja());}
			if(conDefault || (!conDefault && resumencierrecajaLocal.getvalor()!=null && !resumencierrecajaLocal.getvalor().equals(0.0))) {resumencierrecajaBean.setvalor(resumencierrecajaLocal.getvalor());}
			if(conDefault || (!conDefault && resumencierrecajaLocal.gettotal()!=null && !resumencierrecajaLocal.gettotal().equals(0.0))) {resumencierrecajaBean.settotal(resumencierrecajaLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResumenCierreCajaGenerico(Long idResumenCierreCajaSeleccionado,JComboBox jComboBoxResumenCierreCaja,List<ResumenCierreCaja> resumencierrecajasLocal)throws Exception {
		try {
			ResumenCierreCaja  resumencierrecajaTemp=null;

			for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasLocal) {
				if(resumencierrecajaAux.getId()!=null && resumencierrecajaAux.getId().equals(idResumenCierreCajaSeleccionado)) {
					resumencierrecajaTemp=resumencierrecajaAux;
					break;
				}
			}

			jComboBoxResumenCierreCaja.setSelectedItem(resumencierrecajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResumenCierreCajaGenerico(JComboBox jComboBoxResumenCierreCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenCierreCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResumenCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenCierreCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResumenCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResumenCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResumenCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumencierrecaja=(ResumenCierreCaja) resumencierrecajaLogic.getResumenCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			resumencierrecaja =(ResumenCierreCaja) resumencierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!resumencierrecaja.getIsNew() && !resumencierrecaja.getIsChanged() && !resumencierrecaja.getIsDeleted()) {
				sDescripcion=resumencierrecaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=resumencierrecaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!resumencierrecaja.getIsNew() && !resumencierrecaja.getIsChanged() && !resumencierrecaja.getIsDeleted()) {
				sDescripcion=resumencierrecaja.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=resumencierrecaja.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!resumencierrecaja.getIsNew() && !resumencierrecaja.getIsChanged() && !resumencierrecaja.getIsDeleted()) {
				sDescripcion=resumencierrecaja.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=resumencierrecaja.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!resumencierrecaja.getIsNew() && !resumencierrecaja.getIsChanged() && !resumencierrecaja.getIsDeleted()) {
				sDescripcion=resumencierrecaja.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=resumencierrecaja.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ResumenCierreCaja resumencierrecajaRow=new ResumenCierreCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumencierrecajaRow=(ResumenCierreCaja) resumencierrecajaLogic.getResumenCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			resumencierrecajaRow=(ResumenCierreCaja) resumencierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResumenCierreCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));			
			this.jButtonDuplicarResumenCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarResumenCierreCaja && this.isPermisoDuplicarResumenCierreCaja));			
			this.jButtonCopiarResumenCierreCaja.setVisible((this.isVisibilidadCeldaCopiarResumenCierreCaja && this.isPermisoCopiarResumenCierreCaja));
			this.jButtonVerFormResumenCierreCaja.setVisible((this.isVisibilidadCeldaVerFormResumenCierreCaja && this.isPermisoVerFormResumenCierreCaja));
			
			this.jButtonAbrirOrderByResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));			
			
			this.jButtonNuevoRelacionesResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));			
			this.jButtonNuevoGuardarCambiosResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarResumenCierreCaja.setVisible((this.isVisibilidadCeldaModificarResumenCierreCaja && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.setVisible((this.isVisibilidadCeldaActualizarResumenCierreCaja && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.setVisible((this.isVisibilidadCeldaEliminarResumenCierreCaja && this.isPermisoEliminarResumenCierreCaja));
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.setVisible(this.isVisibilidadCeldaCancelarResumenCierreCaja);							
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));						
			this.jButtonDuplicarToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarResumenCierreCaja && this.isPermisoDuplicarResumenCierreCaja));						
			this.jButtonCopiarToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaCopiarResumenCierreCaja && this.isPermisoCopiarResumenCierreCaja));			
			this.jButtonVerFormToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaVerFormResumenCierreCaja && this.isPermisoVerFormResumenCierreCaja));			
			this.jButtonAbrirOrderByToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));
			this.jButtonNuevoRelacionesToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));			
			this.jButtonNuevoGuardarCambiosToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));			
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaModificarResumenCierreCaja && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaActualizarResumenCierreCaja  && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaEliminarResumenCierreCaja && this.isPermisoEliminarResumenCierreCaja));
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarToolBarResumenCierreCaja.setVisible(this.isVisibilidadCeldaCancelarResumenCierreCaja);				
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));			
			this.jMenuItemDuplicarResumenCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarResumenCierreCaja && this.isPermisoDuplicarResumenCierreCaja));			
			this.jMenuItemCopiarResumenCierreCaja.setVisible((this.isVisibilidadCeldaCopiarResumenCierreCaja && this.isPermisoCopiarResumenCierreCaja));			
			this.jMenuItemVerFormResumenCierreCaja.setVisible((this.isVisibilidadCeldaVerFormResumenCierreCaja && this.isPermisoVerFormResumenCierreCaja));			
			this.jMenuItemAbrirOrderByResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));			
			//this.jMenuItemMostrarOcultarResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));
			this.jMenuItemDetalleAbrirOrderByResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));			
			//this.jMenuItemDetalleMostrarOcultarResumenCierreCaja.setVisible((this.isVisibilidadCeldaOrdenResumenCierreCaja && this.isPermisoOrdenResumenCierreCaja));			
			this.jMenuItemNuevoRelacionesResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja));			
			this.jMenuItemNuevoGuardarCambiosResumenCierreCaja.setVisible((this.isVisibilidadCeldaNuevoResumenCierreCaja && this.isPermisoNuevoResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));									
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemModificarResumenCierreCaja.setVisible((this.isVisibilidadCeldaModificarResumenCierreCaja && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemActualizarResumenCierreCaja.setVisible((this.isVisibilidadCeldaActualizarResumenCierreCaja && this.isPermisoActualizarResumenCierreCaja));	
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemEliminarResumenCierreCaja.setVisible((this.isVisibilidadCeldaEliminarResumenCierreCaja && this.isPermisoEliminarResumenCierreCaja));
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemCancelarResumenCierreCaja.setVisible(this.isVisibilidadCeldaCancelarResumenCierreCaja);				
			}
			
			this.jMenuItemGuardarCambiosResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));						
			this.jMenuItemGuardarCambiosTablaResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=this.jButtonNuevoResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaDuplicarResumenCierreCaja=this.jButtonDuplicarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaCopiarResumenCierreCaja=this.jButtonCopiarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaVerFormResumenCierreCaja=this.jButtonVerFormResumenCierreCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenResumenCierreCaja=this.jButtonAbrirOrderByResumenCierreCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=this.jButtonNuevoRelacionesResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaModificarResumenCierreCaja=this.jButtonModificarResumenCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.isVisibilidadCeldaActualizarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=this.jButtonGuardarCambiosTablaResumenCierreCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResumenCierreCaja=this.jButtonNuevoToolBarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=this.jButtonNuevoRelacionesToolBarResumenCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.isVisibilidadCeldaModificarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarToolBarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarToolBarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarToolBarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarToolBarResumenCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResumenCierreCaja=this.jButtonGuardarCambiosToolBarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResumenCierreCaja=this.jMenuItemNuevoResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=this.jMenuItemNuevoRelacionesResumenCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.isVisibilidadCeldaModificarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemModificarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemActualizarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemEliminarResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarResumenCierreCaja=this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemCancelarResumenCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResumenCierreCaja=this.jMenuItemGuardarCambiosResumenCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=this.jMenuItemGuardarCambiosTablaResumenCierreCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResumenCierreCaja(Boolean esInicializar) {
		if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
				//if(this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResumenCierreCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualResumenCierreCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResumenCierreCaja() {
		this.jButtonNuevoResumenCierreCaja.setVisible(this.isPermisoNuevoResumenCierreCaja);			
		this.jButtonDuplicarResumenCierreCaja.setVisible(this.isPermisoDuplicarResumenCierreCaja);			
		this.jButtonCopiarResumenCierreCaja.setVisible(this.isPermisoCopiarResumenCierreCaja);			
		this.jButtonVerFormResumenCierreCaja.setVisible(this.isPermisoVerFormResumenCierreCaja);			
		
		this.jButtonAbrirOrderByResumenCierreCaja.setVisible(this.isPermisoOrdenResumenCierreCaja);					
		
		this.jButtonNuevoRelacionesResumenCierreCaja.setVisible(this.isPermisoNuevoResumenCierreCaja);			
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarResumenCierreCaja.setVisible(this.isPermisoActualizarResumenCierreCaja);	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.setVisible(this.isPermisoActualizarResumenCierreCaja);	
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.setVisible(this.isPermisoEliminarResumenCierreCaja);
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.setVisible(this.isVisibilidadCeldaCancelarResumenCierreCaja);						
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.setVisible(this.isPermisoGuardarCambiosResumenCierreCaja);							
		}
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.setVisible(this.isPermisoActualizarResumenCierreCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResumenCierreCaja() {
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarResumenCierreCaja.setVisible(this.isPermisoActualizarResumenCierreCaja);	
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.setVisible(this.isPermisoActualizarResumenCierreCaja);	
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.setVisible(this.isPermisoEliminarResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.setVisible(this.isVisibilidadCeldaCancelarResumenCierreCaja);							
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.setVisible((this.isVisibilidadCeldaGuardarResumenCierreCaja && this.isPermisoGuardarCambiosResumenCierreCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResumenCierreCaja() {
		if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResumenCierreCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResumenCierreCaja() {
	}
	
	public void jTableDatosResumenCierreCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResumenCierreCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.resumencierrecaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaResumenCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebResumenCierreCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResumenCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResumenCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.resumencierrecajaLogic.getConnexion());

				if(this.resumencierrecaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.resumencierrecaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResumenCierreCaja=(TitledBorder)this.jScrollPanelDatosResumenCierreCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderResumenCierreCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.resumencierrecaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalResumenCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebResumenCierreCaja(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResumenCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResumenCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.resumencierrecajaLogic.getConnexion());

				if(this.resumencierrecaja.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.resumencierrecaja.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResumenCierreCaja=(TitledBorder)this.jScrollPanelDatosResumenCierreCaja.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderResumenCierreCaja.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.resumencierrecaja.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioResumenCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebResumenCierreCaja(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResumenCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResumenCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.resumencierrecajaLogic.getConnexion());

				if(this.resumencierrecaja.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.resumencierrecaja.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResumenCierreCaja=(TitledBorder)this.jScrollPanelDatosResumenCierreCaja.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderResumenCierreCaja.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.resumencierrecaja.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaResumenCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebResumenCierreCaja(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResumenCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResumenCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.resumencierrecajaLogic.getConnexion());

				if(this.resumencierrecaja.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.resumencierrecaja.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResumenCierreCaja=(TitledBorder)this.jScrollPanelDatosResumenCierreCaja.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderResumenCierreCaja.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.resumencierrecaja.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.resumencierrecaja.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_pagoResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.gettipo_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_pago like '%"+this.resumencierrecaja.gettipo_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_usuarioResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getnombre_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_usuario like '%"+this.resumencierrecaja.getnombre_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.resumencierrecaja.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.resumencierrecaja.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalResumenCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.getresumencierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumencierrecaja==null) {
						this.resumencierrecaja = new ResumenCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);
				}

				if(this.resumencierrecaja.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.resumencierrecaja.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaResumenCierreCajaResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenCierreCaja(false,false);

			this.getResumenCierreCajasBusquedaResumenCierreCaja();

			this.inicializarActualizarBindingResumenCierreCaja(false);

			//if(ResumenCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenCierreCaja(false,false);

			this.getResumenCierreCajasFK_IdCaja();

			this.inicializarActualizarBindingResumenCierreCaja(false);

			//if(ResumenCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenCierreCaja(false,false);

			this.getResumenCierreCajasFK_IdEmpresa();

			this.inicializarActualizarBindingResumenCierreCaja(false);

			//if(ResumenCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenCierreCaja(false,false);

			this.getResumenCierreCajasFK_IdSucursal();

			this.inicializarActualizarBindingResumenCierreCaja(false);

			//if(ResumenCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioResumenCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenCierreCaja(false,false);

			this.getResumenCierreCajasFK_IdUsuario();

			this.inicializarActualizarBindingResumenCierreCaja(false);

			//if(ResumenCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumencierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResumenCierreCaja() {
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
			this.jInternalFrameDetalleFormResumenCierreCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormResumenCierreCaja.dispose();
			this.jInternalFrameDetalleFormResumenCierreCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
			this.jInternalFrameReporteDinamicoResumenCierreCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResumenCierreCaja.dispose();
			this.jInternalFrameReporteDinamicoResumenCierreCaja=null;
		}
		
		if(this.jInternalFrameImportacionResumenCierreCaja!=null) {
			this.jInternalFrameImportacionResumenCierreCaja.setVisible(false);	    			
			this.jInternalFrameImportacionResumenCierreCaja.dispose();
			this.jInternalFrameImportacionResumenCierreCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResumenCierreCaja();
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResumenCierreCaja")) {
				jButtonDuplicarResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResumenCierreCaja")) {
				jButtonCopiarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormResumenCierreCaja")) {
				jButtonVerFormResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResumenCierreCaja")) {
				jButtonDuplicarResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResumenCierreCaja")) {
				jButtonDuplicarResumenCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResumenCierreCaja")) {
				jButtonModificarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResumenCierreCaja")) {
				jButtonModificarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResumenCierreCaja")) {
				jButtonModificarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResumenCierreCaja")) {
				jButtonActualizarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResumenCierreCaja")) {
				jButtonActualizarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResumenCierreCaja")) {
				jButtonActualizarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarResumenCierreCaja")) {
				jButtonEliminarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResumenCierreCaja")) {
				jButtonEliminarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResumenCierreCaja")) {
				jButtonEliminarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarResumenCierreCaja")) {
				jButtonCancelarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResumenCierreCaja")) {
				jButtonCancelarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResumenCierreCaja")) {
				jButtonCancelarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarResumenCierreCaja")) {
				jButtonCerrarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResumenCierreCaja")) {
				jButtonCerrarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResumenCierreCaja")) {
				jButtonCerrarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResumenCierreCaja")) {
				jButtonMostrarOcultarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResumenCierreCaja")) {
				jButtonCancelarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResumenCierreCaja")) {
				jButtonCopiarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResumenCierreCaja")) {
				jButtonVerFormResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResumenCierreCaja")) {
				jButtonCopiarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResumenCierreCaja")) {
				jButtonVerFormResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResumenCierreCaja")) {
				jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResumenCierreCaja")) {
				jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResumenCierreCaja")) {
				jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResumenCierreCaja")) {
				jButtonAnterioresResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResumenCierreCaja")) {
				jButtonAnterioresResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResumenCierreCaja")) {
				jButtonAnterioresResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResumenCierreCaja")) {
				jButtonSiguientesResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResumenCierreCaja")) {
				jButtonSiguientesResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResumenCierreCaja")) {
				jButtonSiguientesResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResumenCierreCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByResumenCierreCaja")) {
				jButtonAbrirOrderByResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResumenCierreCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarResumenCierreCaja")) {
				jButtonMostrarOcultarResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResumenCierreCaja")) {
				jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResumenCierreCaja")) {
				jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResumenCierreCaja")) {
				jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResumenCierreCaja")) {
				jButtonCerrarReporteDinamicoResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResumenCierreCaja")) {
				jButtonGenerarReporteDinamicoResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResumenCierreCaja")) {
				
				jButtonGenerarExcelReporteDinamicoResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResumenCierreCaja")) {
				jButtonCerrarImportacionResumenCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResumenCierreCaja")) {
				
				jButtonGenerarImportacionResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResumenCierreCaja")) {
				
				jButtonAbrirImportacionResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResumenCierreCaja")) {
				jComboBoxTiposAccionesResumenCierreCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResumenCierreCaja")) {
				jComboBoxTiposRelacionesResumenCierreCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResumenCierreCaja")) {
				jComboBoxTiposAccionesResumenCierreCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResumenCierreCaja")) {
				
				jComboBoxTiposSeleccionarResumenCierreCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResumenCierreCaja")) {
				jTextFieldValorCampoGeneralResumenCierreCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResumenCierreCaja")) {
				jButtonAbrirOrderByResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResumenCierreCaja")) {
				jButtonAbrirOrderByResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResumenCierreCaja")) {
				jButtonCerrarOrderByResumenCierreCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResumenCierreCajaBusqueda")) {
				this.jButtonidResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResumenCierreCajaUpdate")) {
				this.jButtonid_empresaResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResumenCierreCajaBusqueda")) {
				this.jButtonid_empresaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResumenCierreCajaUpdate")) {
				this.jButtonid_sucursalResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResumenCierreCajaBusqueda")) {
				this.jButtonid_sucursalResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResumenCierreCajaUpdate")) {
				this.jButtonid_usuarioResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResumenCierreCajaBusqueda")) {
				this.jButtonid_usuarioResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaResumenCierreCajaUpdate")) {
				this.jButtonid_cajaResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaResumenCierreCajaBusqueda")) {
				this.jButtonid_cajaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResumenCierreCajaBusqueda")) {
				this.jButtonfechaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_pagoResumenCierreCajaBusqueda")) {
				this.jButtontipo_pagoResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioResumenCierreCajaBusqueda")) {
				this.jButtonnombre_usuarioResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaResumenCierreCajaBusqueda")) {
				this.jButtonnombre_cajaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorResumenCierreCajaBusqueda")) {
				this.jButtonvalorResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalResumenCierreCajaBusqueda")) {
				this.jButtontotalResumenCierreCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaResumenCierreCajaResumenCierreCaja")) {
				this.jButtonBusquedaResumenCierreCajaResumenCierreCajaActionPerformed(evt);
			}
			
			;
			
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResumenCierreCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ResumenCierreCaja resumencierrecajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				resumencierrecajaLocal=this.resumencierrecaja;
			} else {
				resumencierrecajaLocal=this.resumencierrecajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
							
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
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
			
			


			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
								
						
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
								
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
							
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
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
			
			


			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
								
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResumenCierreCaja")) {
					jCheckBoxSeleccionarTodosResumenCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResumenCierreCaja")) {
					jCheckBoxSeleccionadosResumenCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResumenCierreCaja")) {
					
				}
				
				


				
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
												
				
				


				
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
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
			
			


			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumencierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumencierrecaja);
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
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
				
				


				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenCierreCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumencierrecajaAnterior =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResumenCierreCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResumenCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResumenCierreCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.resumencierrecaja =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.resumencierrecaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResumenCierreCaja")) {
				
				}
				
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResumenCierreCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResumenCierreCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResumenCierreCaja")) {
			
			}
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResumenCierreCaja();
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			if(sTipo.equals("NuevoResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResumenCierreCaja")) {
				jButtonDuplicarResumenCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResumenCierreCaja")) {
				jButtonCopiarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResumenCierreCaja")) {
				jButtonVerFormResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResumenCierreCaja")) {
				jButtonNuevoResumenCierreCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResumenCierreCaja")) {
				jButtonModificarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResumenCierreCaja")) {
				jButtonActualizarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResumenCierreCaja")) {
				jButtonEliminarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResumenCierreCaja")) {
				jButtonCancelarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResumenCierreCaja")) {
				jButtonCerrarResumenCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResumenCierreCaja")) {
				jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResumenCierreCaja")) {
				jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResumenCierreCaja")) {
				jButtonAbrirOrderByResumenCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResumenCierreCaja")) {
				jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResumenCierreCaja")) {
				jButtonAnterioresResumenCierreCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResumenCierreCaja")) {
				jButtonSiguientesResumenCierreCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResumenCierreCajaBusqueda")) {
				this.jButtonidResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResumenCierreCajaUpdate")) {
				this.jButtonid_empresaResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResumenCierreCajaBusqueda")) {
				this.jButtonid_empresaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResumenCierreCajaUpdate")) {
				this.jButtonid_sucursalResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResumenCierreCajaBusqueda")) {
				this.jButtonid_sucursalResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResumenCierreCajaUpdate")) {
				this.jButtonid_usuarioResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResumenCierreCajaBusqueda")) {
				this.jButtonid_usuarioResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaResumenCierreCajaUpdate")) {
				this.jButtonid_cajaResumenCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaResumenCierreCajaBusqueda")) {
				this.jButtonid_cajaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResumenCierreCajaBusqueda")) {
				this.jButtonfechaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_pagoResumenCierreCajaBusqueda")) {
				this.jButtontipo_pagoResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioResumenCierreCajaBusqueda")) {
				this.jButtonnombre_usuarioResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaResumenCierreCajaBusqueda")) {
				this.jButtonnombre_cajaResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorResumenCierreCajaBusqueda")) {
				this.jButtonvalorResumenCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalResumenCierreCajaBusqueda")) {
				this.jButtontotalResumenCierreCajaBusquedaActionPerformed(evt);
			}
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResumenCierreCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResumenCierreCaja")) {
				closingInternalFrameResumenCierreCaja();
				
			} else if(sTipo.equals("jButtonCancelarResumenCierreCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormResumenCierreCaja = (JInternalFrameBase)evt.getSource();
	            	
	            ResumenCierreCajaBeanSwingJInternalFrame jInternalFrameParent=(ResumenCierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormResumenCierreCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResumenCierreCajaActionPerformed(null);
			}
			
			ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumencierrecaja,new Object(),this.resumencierrecajaParameterGeneral,this.resumencierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResumenCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResumenCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResumenCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.resumencierrecaja)) {
			if(!esControlTabla) {
				if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);			
				}
				
				if(this.resumencierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResumenCierreCaja(this.resumencierrecaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResumenCierreCaja(this.resumencierrecajaReturnGeneral,this.resumencierrecajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.resumencierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResumenCierreCaja(classes,this.resumencierrecajaReturnGeneral,this.resumencierrecajaBean,false);
					}
						
					if(this.resumencierrecajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja());	
					}
						
					if(this.resumencierrecajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecajaReturnGeneral.getResumenCierreCaja(),classes);//this.resumencierrecajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResumenCierreCaja(this.resumencierrecaja,classes);//this.resumencierrecajaBean);									
				}
			
				if(ResumenCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResumenCierreCaja(this.resumencierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenCierreCaja(this.resumencierrecaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.resumencierrecajaAnterior!=null) {
						this.resumencierrecaja=this.resumencierrecajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.resumencierrecajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.resumencierrecajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.resumencierrecajaReturnGeneral.getResumenCierreCaja(),resumencierrecajaLogic.getResumenCierreCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.resumencierrecajaReturnGeneral.getResumenCierreCaja(),this.resumencierrecajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResumenCierreCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosResumenCierreCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResumenCierreCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosResumenCierreCaja() throws Exception {
		
		ResumenCierreCajaModel resumencierrecajaModel=(ResumenCierreCajaModel)this.jTableDatosResumenCierreCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumencierrecajaModel.resumencierrecajas=this.resumencierrecajaLogic.getResumenCierreCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			resumencierrecajaModel.resumencierrecajas=this.resumencierrecajas;
		}
		
		
		((ResumenCierreCajaModel) this.jTableDatosResumenCierreCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResumenCierreCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresumencierrecajaAnterior(),this.resumencierrecajaLogic.getResumenCierreCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresumencierrecajaAnterior(),this.resumencierrecajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResumenCierreCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResumenCierreCaja(ResumenCierreCaja resumencierrecaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
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
										
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumencierrecaja,new Object(),generalEntityParameterGeneral,this.resumencierrecajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.resumencierrecajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResumenCierreCajaConstantesFunciones.getClassesRelationshipsOfResumenCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResumenCierreCajaConstantesFunciones.getClassesRelationshipsFromStringsOfResumenCierreCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResumenCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResumenCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumencierrecaja,new Object(),generalEntityParameterGeneral,this.resumencierrecajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResumenCierreCaja(ResumenCierreCajaBean resumencierrecajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResumenCierreCaja(ArrayList<Classe> classes,ResumenCierreCajaReturnGeneral resumencierrecajaReturnGeneral,ResumenCierreCajaBean resumencierrecajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResumenCierreCaja(ResumenCierreCaja resumencierrecaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.resumencierrecaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResumenCierreCaja = new ResumenCierreCajaDetalleFormJInternalFrame(jDesktopPane,this.resumencierrecajaSessionBean.getConGuardarRelaciones(),this.resumencierrecajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.setVisible(false);
		this.jInternalFrameDetalleFormResumenCierreCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormResumenCierreCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResumenCierreCaja.resumencierrecajaLogic=this.resumencierrecajaLogic;
		
		this.cargarCombosFrameForeignKeyResumenCierreCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResumenCierreCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResumenCierreCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResumenCierreCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResumenCierreCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResumenCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResumenCierreCaja"));
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarResumenCierreCaja"));

		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarResumenCierreCaja"));
					
		this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemModificarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarResumenCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarResumenCierreCaja"));
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResumenCierreCaja"));
						
		this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemActualizarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResumenCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarResumenCierreCaja"));
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarResumenCierreCaja"));
								
		this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemEliminarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResumenCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarResumenCierreCaja"));
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarResumenCierreCaja"));
					
		this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemCancelarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResumenCierreCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemDetalleCerrarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResumenCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResumenCierreCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonidResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonfechaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontipo_pagoResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_pagoResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonvalorResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontotalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalResumenCierreCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResumenCierreCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResumenCierreCaja"));
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResumenCierreCaja"));
		}
		
		this.jTableDatosResumenCierreCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResumenCierreCaja"));
		
		this.jTableDatosResumenCierreCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResumenCierreCaja"));
		
		this.jButtonNuevoResumenCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoResumenCierreCaja"));
		
		this.jButtonDuplicarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarResumenCierreCaja"));
		
		this.jButtonCopiarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"CopiarResumenCierreCaja"));
		
		this.jButtonVerFormResumenCierreCaja.addActionListener(new ButtonActionListener(this,"VerFormResumenCierreCaja"));
		
		
		this.jButtonNuevoToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarResumenCierreCaja"));
			
		this.jButtonDuplicarToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResumenCierreCaja"));
			
		this.jMenuItemNuevoResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResumenCierreCaja"));
			
		this.jMenuItemDuplicarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResumenCierreCaja"));		
		
		
		this.jButtonNuevoRelacionesResumenCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResumenCierreCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResumenCierreCaja"));
			
		this.jMenuItemNuevoRelacionesResumenCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResumenCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarResumenCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonModificarToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarResumenCierreCaja"));
			
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemModificarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarResumenCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarResumenCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonActualizarToolBarResumenCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResumenCierreCaja"));
				
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemActualizarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResumenCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarResumenCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonEliminarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarResumenCierreCaja"));
						
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemEliminarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResumenCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarResumenCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonCancelarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarResumenCierreCaja"));
			
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemCancelarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResumenCierreCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResumenCierreCaja"));		
		
		
		this.jButtonCerrarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarResumenCierreCaja"));
		
		
		this.jButtonCerrarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarResumenCierreCaja"));
			
		this.jMenuItemCerrarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResumenCierreCaja"));
			
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jMenuItemDetalleCerrarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResumenCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosResumenCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenCierreCaja"));
		}
		
		this.jButtonCopiarToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarResumenCierreCaja"));
			
		this.jButtonVerFormToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarResumenCierreCaja"));
		
		this.jMenuItemGuardarCambiosResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResumenCierreCaja"));
			
		this.jMenuItemCopiarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResumenCierreCaja"));		
		
		this.jMenuItemVerFormResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResumenCierreCaja"));		
		
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResumenCierreCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResumenCierreCaja"));
			
		this.jMenuItemGuardarCambiosTablaResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResumenCierreCaja"));		
		
		
		
		this.jButtonRecargarInformacionResumenCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionResumenCierreCaja"));
					
		this.jButtonRecargarInformacionToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResumenCierreCaja"));
		
		this.jMenuItemRecargarInformacionResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResumenCierreCaja"));		
		
		
		
		this.jButtonAnterioresResumenCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresResumenCierreCaja"));
		
		
		this.jButtonAnterioresToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResumenCierreCaja"));
		
		this.jMenuItemAnterioresResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResumenCierreCaja"));		
		
		
		this.jButtonSiguientesResumenCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesResumenCierreCaja"));
		
		
		this.jButtonSiguientesToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResumenCierreCaja"));
			
		this.jMenuItemSiguientesResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResumenCierreCaja"));
			
		this.jMenuItemAbrirOrderByResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResumenCierreCaja"));
			
		this.jMenuItemMostrarOcultarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResumenCierreCaja"));
			
		this.jMenuItemDetalleAbrirOrderByResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResumenCierreCaja"));
			
		this.jMenuItemDetalleMostarOcultarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResumenCierreCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosResumenCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResumenCierreCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResumenCierreCaja"));
			
		this.jMenuItemNuevoGuardarCambiosResumenCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResumenCierreCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResumenCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResumenCierreCaja"));

		this.jCheckBoxSeleccionadosResumenCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResumenCierreCaja"));
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResumenCierreCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesResumenCierreCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesResumenCierreCaja"));
			
		this.jComboBoxTiposAccionesResumenCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesResumenCierreCaja"));
					
		this.jComboBoxTiposSeleccionarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResumenCierreCaja"));
			
		this.jTextFieldValorCampoGeneralResumenCierreCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResumenCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonidResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonfechaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontipo_pagoResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_pagoResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonvalorResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontotalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalResumenCierreCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaResumenCierreCajaResumenCierreCaja.addActionListener(new ButtonActionListener(this,"BusquedaResumenCierreCajaResumenCierreCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResumenCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenCierreCaja"));
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenCierreCaja"));
				this.jInternalFrameReporteDinamicoResumenCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenCierreCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoResumenCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenCierreCaja"));				
			//this.jButtonGenerarReporteDinamicoResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenCierreCaja"));
			//this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenCierreCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResumenCierreCaja!=null) {
				this.jInternalFrameImportacionResumenCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResumenCierreCaja"));
				this.jInternalFrameImportacionResumenCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResumenCierreCaja"));
				this.jInternalFrameImportacionResumenCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResumenCierreCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResumenCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByResumenCierreCaja"));
			
			this.jButtonAbrirOrderByToolBarResumenCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResumenCierreCaja"));			
			
			if(this.jInternalFrameOrderByResumenCierreCaja!=null) {
				this.jInternalFrameOrderByResumenCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResumenCierreCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenCierreCaja.jTabbedPaneRelacionesResumenCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResumenCierreCaja"));
		
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
            		closingInternalFrameResumenCierreCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResumenCierreCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResumenCierreCaja = (JInternalFrameBase)event.getSource();
	            	
	            ResumenCierreCajaBeanSwingJInternalFrame jInternalFrameParent=(ResumenCierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormResumenCierreCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResumenCierreCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResumenCierreCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResumenCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResumenCierreCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResumenCierreCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResumenCierreCaja";
		inputMap = this.jButtonNuevoResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResumenCierreCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResumenCierreCaja";
		inputMap = this.jButtonNuevoRelacionesResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResumenCierreCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResumenCierreCaja";
		inputMap = this.jButtonModificarResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResumenCierreCaja";
		inputMap = this.jButtonActualizarResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResumenCierreCaja";
		inputMap = this.jButtonEliminarResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResumenCierreCaja";
		inputMap = this.jButtonCancelarResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResumenCierreCaja";
		inputMap = this.jButtonCerrarResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResumenCierreCaja";
		inputMap = this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonGuardarCambiosResumenCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResumenCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResumenCierreCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResumenCierreCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResumenCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResumenCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResumenCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResumenCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResumenCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResumenCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonidResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_empresaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_sucursalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonid_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonfechaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontipo_pagoResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"tipo_pagoResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_usuarioResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonnombre_cajaResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtonvalorResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorResumenCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenCierreCaja.jButtontotalResumenCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalResumenCierreCajaBusqueda"));
		
		
		this.jButtonBusquedaResumenCierreCajaResumenCierreCaja.addActionListener(new ButtonActionListener(this,"BusquedaResumenCierreCajaResumenCierreCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResumenCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResumenCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResumenCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResumenCierreCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResumenCierreCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
					resumencierrecajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajas) {
					resumencierrecajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResumenCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
						resumencierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajas) {
						resumencierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResumenCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResumenCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResumenCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResumenCierreCaja.getSelectedRows();
			
			ResumenCierreCaja resumencierrecajaLocal=new ResumenCierreCaja();
			
			//this.seleccionarTodosResumenCierreCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					resumencierrecajaLocal =(ResumenCierreCaja) this.resumencierrecajaLogic.getResumenCierreCajas().toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					resumencierrecajaLocal =(ResumenCierreCaja) this.resumencierrecajas.toArray()[this.jTableDatosResumenCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				resumencierrecajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
						resumencierrecajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajas) {
						resumencierrecajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResumenCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResumenCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResumenCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResumenCierreCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResumenCierreCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResumenCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResumenCierreCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajaLogic.getResumenCierreCajas()) {
				
						if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							resumencierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO)) {
							existe=true;
							resumencierrecajaAux.settipo_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							resumencierrecajaAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							resumencierrecajaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							resumencierrecajaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							resumencierrecajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajas) {
					
						if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							resumencierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO)) {
							existe=true;
							resumencierrecajaAux.settipo_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							resumencierrecajaAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							resumencierrecajaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							resumencierrecajaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							resumencierrecajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResumenCierreCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResumenCierreCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResumenCierreCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResumenCierreCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessResumenCierreCaja(conSplash);
				
					this.generarReporteResumenCierreCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResumenCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResumenCierreCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResumenCierreCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResumenCierreCaja();
				
				this.exportarResumenCierreCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResumenCierreCajas();
				//this.importarResumenCierreCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResumenCierreCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResumenCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Resumen Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResumenCierreCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResumenCierreCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResumenCierreCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(ResumenCierreCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResumenCierreCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResumenCierreCaja(conSplash);
					
						//this.actualizarParametrosGeneralResumenCierreCaja();
						
						this.generarReporteProcesoAccionResumenCierreCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResumenCierreCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Resumen Cierre CajaS SELECCIONADOS?", "MANTENIMIENTO DE Resumen Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResumenCierreCaja();
				
						this.actualizarParametrosGeneralResumenCierreCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.resumencierrecajaReturnGeneral=resumencierrecajaLogic.procesarAccionResumenCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.resumencierrecajaLogic.getResumenCierreCajas(),this.resumencierrecajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResumenCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResumenCierreCaja();
					
					ResumenCierreCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResumenCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResumenCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxTiposAccionesFormularioResumenCierreCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResumenCierreCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResumenCierreCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResumenCierreCaja();
			
			if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
			ResumenCierreCaja resumencierrecaja=new ResumenCierreCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResumenCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResumenCierreCaja.getSelectedItem();
			
			
			
			
			resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(resumencierrecajasSeleccionados.size()==1) {
				for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
					resumencierrecaja=resumencierrecajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResumenCierreCaja();
			
      		//this.finishProcessResumenCierreCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResumenCierreCajaReturnGeneral() throws Exception {
		if(this.resumencierrecajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.resumencierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.resumencierrecajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.resumencierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.resumencierrecajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.resumencierrecajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResumenCierreCaja(false);
		}
		
		if(this.resumencierrecajaReturnGeneral.getConRetornoLista() || this.resumencierrecajaReturnGeneral.getConRetornoObjeto()) {
			if(this.resumencierrecajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumencierrecajaLogic.setResumenCierreCajas(this.resumencierrecajaReturnGeneral.getResumenCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingResumenCierreCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralResumenCierreCaja() throws Exception {
		
		
	}
	
	public ArrayList<ResumenCierreCaja> getResumenCierreCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResumenCierreCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajaLogic.getResumenCierreCajas()) {
					if(resumencierrecajaAux.getIsSelected()) {
						resumencierrecajasSeleccionados.add(resumencierrecajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenCierreCaja resumencierrecajaAux:this.resumencierrecajas) {
					if(resumencierrecajaAux.getIsSelected()) {
						resumencierrecajasSeleccionados.add(resumencierrecajaAux);				
					}
				}
			}
			
			if(resumencierrecajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						resumencierrecajasSeleccionados.addAll(this.resumencierrecajaLogic.getResumenCierreCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						resumencierrecajasSeleccionados.addAll(this.resumencierrecajas);				
					}
				}
			}
		} else {
			resumencierrecajasSeleccionados.add(this.resumencierrecaja);
		}
		
		return resumencierrecajasSeleccionados;
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
	
	public void generarReporteResumenCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResumenCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResumenCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResumenCierreCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResumenCierreCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Resumen Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados);
		
	}	
	
	public void generarReporteNormalResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResumenCierreCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResumenCierreCaja();
		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResumenCierreCaja();
		
		
		//this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados ,resumencierrecajaImplementable,resumencierrecajaImplementableHome);
	}
	
	public void mostrarImportacionResumenCierreCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResumenCierreCaja();
		
		this.abrirFrameImportacionResumenCierreCaja();		
		
			
		//this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados ,resumencierrecajaImplementable,resumencierrecajaImplementableHome);
	}
	
	public void importarResumenCierreCajas() throws Exception {		
	
	}
	
	public void exportarResumenCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResumenCierreCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResumenCierreCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResumenCierreCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Resumen Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResumenCierreCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResumenCierreCaja(resumencierrecajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//resumencierrecajaAux.setsDetalleGeneralEntityReporte(resumencierrecajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResumenCierreCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenCierreCajaConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResumenCierreCaja(ResumenCierreCaja resumencierrecaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=resumencierrecaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.gettipo_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getnombre_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumencierrecaja.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ResumenCierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResumenCierreCaja(row);				
				iRow++;
			}				
			
			for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResumenCierreCaja(resumencierrecajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResumenCierreCajasSeleccionados() throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();		
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumencierrecaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("resumencierrecajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("resumencierrecaja");
			//elementRoot.appendChild(element);
		
			for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
				element = document.createElement("resumencierrecaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResumenCierreCaja(resumencierrecajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResumenCierreCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenCierreCajaConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResumenCierreCaja(ResumenCierreCaja resumencierrecaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.gettipo_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getnombre_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(resumencierrecaja.gettotal());				
	}
	
	public void setFilaDatosExportarXmlResumenCierreCaja(ResumenCierreCaja resumencierrecaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResumenCierreCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(resumencierrecaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResumenCierreCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(resumencierrecaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ResumenCierreCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(resumencierrecaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ResumenCierreCajaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(resumencierrecaja.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(ResumenCierreCajaConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(resumencierrecaja.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcaja_descripcion = document.createElement(ResumenCierreCajaConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(resumencierrecaja.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha = document.createElement(ResumenCierreCajaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(resumencierrecaja.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtipo_pago = document.createElement(ResumenCierreCajaConstantesFunciones.TIPOPAGO);
		elementtipo_pago.appendChild(document.createTextNode(resumencierrecaja.gettipo_pago().trim()));
		element.appendChild(elementtipo_pago);

		Element elementnombre_usuario = document.createElement(ResumenCierreCajaConstantesFunciones.NOMBREUSUARIO);
		elementnombre_usuario.appendChild(document.createTextNode(resumencierrecaja.getnombre_usuario().trim()));
		element.appendChild(elementnombre_usuario);

		Element elementnombre_caja = document.createElement(ResumenCierreCajaConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(resumencierrecaja.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementvalor = document.createElement(ResumenCierreCajaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(resumencierrecaja.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementtotal = document.createElement(ResumenCierreCajaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(resumencierrecaja.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoResumenCierreCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados=new ArrayList<ResumenCierreCaja>();
		
		resumencierrecajasSeleccionados=this.getResumenCierreCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResumenCierreCaja(resumencierrecajasSeleccionados);
		
		this.generarReporteResumenCierreCajas("Todos",resumencierrecajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResumenCierreCaja(ArrayList<ResumenCierreCaja> resumencierrecajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ResumenCierreCaja resumencierrecajaAux:resumencierrecajasSeleccionados) {
				resumencierrecajaAux.setsDetalleGeneralEntityReporte(resumencierrecajaAux.toString());
			
				if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumencierrecajaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_TIPOPAGO)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.gettipo_pago());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBREUSUARIO)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getnombre_usuario());
				}
				 else if(sTipoSeleccionar.equals(ResumenCierreCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					resumencierrecajaAux.setsDescripcionGeneralEntityReporte1(resumencierrecajaAux.getnombre_caja());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResumenCierreCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResumenCierreCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=true;
				this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=true;
			}
			
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=true;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=true;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=true;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=true;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=true;
			this.isVisibilidadCeldaModificarResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
			this.isVisibilidadCeldaModificarResumenCierreCaja=true;
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
			this.isVisibilidadCeldaCancelarResumenCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResumenCierreCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResumenCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=true;
		} else {
			this.actualizarEstadoPanelsResumenCierreCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResumenCierreCaja=false;
			//this.isVisibilidadCeldaVerFormResumenCierreCaja=false;
			this.isVisibilidadCeldaDuplicarResumenCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!resumencierrecajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!resumencierrecajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;												
			}
			
			this.jButtonCerrarResumenCierreCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.resumencierrecaja)) {
			this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
			this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoResumenCierreCaja=false;
		this.isVisibilidadCeldaNuevoRelacionesResumenCierreCaja=false;
		this.isVisibilidadCeldaGuardarCambiosResumenCierreCaja=false;
		//this.isVisibilidadCeldaModificarResumenCierreCaja=true;
		this.isVisibilidadCeldaActualizarResumenCierreCaja=false;
		this.isVisibilidadCeldaEliminarResumenCierreCaja=false;
		//this.isVisibilidadCeldaCancelarResumenCierreCaja=true;			
		this.isVisibilidadCeldaGuardarResumenCierreCaja=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResumenCierreCaja() {
	}
	
	public void actualizarEstadoPanelsResumenCierreCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResumenCierreCaja!=null) {
				this.jScrollPanelDatosEdicionResumenCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenCierreCaja!=null) {
				this.jScrollPanelDatosResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenCierreCaja!=null) {
				this.jPanelPaginacionResumenCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
					this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.resumencierrecajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenCierreCaja!=null) {
				this.jTabbedPaneBusquedasResumenCierreCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResumenCierreCaja!=null) {
				this.jPanelParametrosReportesResumenCierreCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaResumenCierreCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaResumenCierreCaja) {this.jTabbedPaneBusquedasResumenCierreCaja.remove(jPanelBusquedaResumenCierreCajaResumenCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaResumenCierreCaja=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaResumenCierreCaja) {this.jTabbedPaneBusquedasResumenCierreCaja.remove(jPanelBusquedaResumenCierreCajaResumenCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaResumenCierreCaja=isParaUsuario;
			if(!this.isVisibilidadBusquedaResumenCierreCaja) {this.jTabbedPaneBusquedasResumenCierreCaja.remove(jPanelBusquedaResumenCierreCajaResumenCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaResumenCierreCaja=isParaCaja;
			if(!this.isVisibilidadBusquedaResumenCierreCaja) {this.jTabbedPaneBusquedasResumenCierreCaja.remove(jPanelBusquedaResumenCierreCajaResumenCierreCaja);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaResumenCierreCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResumenCierreCaja() {
		this.updateBorderResaltarBusquedasFormularioResumenCierreCaja();
		this.updateVisibilidadBusquedasFormularioResumenCierreCaja();
		this.updateHabilitarBusquedasFormularioResumenCierreCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioResumenCierreCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResumenCierreCaja.getComponents().length>0) {
	

		if(this.resumencierrecajaConstantesFunciones.resaltarBusquedaResumenCierreCajaResumenCierreCaja!=null) {
			index= this.jTabbedPaneBusquedasResumenCierreCaja.indexOfComponent(this.jPanelBusquedaResumenCierreCajaResumenCierreCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResumenCierreCaja.getComponent(index);
				jPanel.setBorder(this.resumencierrecajaConstantesFunciones.resaltarBusquedaResumenCierreCajaResumenCierreCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResumenCierreCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResumenCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResumenCierreCaja.indexOfComponent(this.jPanelBusquedaResumenCierreCajaResumenCierreCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResumenCierreCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.resumencierrecajaConstantesFunciones.mostrarBusquedaResumenCierreCajaResumenCierreCaja);
			if(!this.resumencierrecajaConstantesFunciones.mostrarBusquedaResumenCierreCajaResumenCierreCaja && index>-1) {
				this.jTabbedPaneBusquedasResumenCierreCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResumenCierreCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResumenCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResumenCierreCaja.indexOfComponent(this.jPanelBusquedaResumenCierreCajaResumenCierreCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResumenCierreCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.resumencierrecajaConstantesFunciones.activarBusquedaResumenCierreCajaResumenCierreCaja);
				this.jTabbedPaneBusquedasResumenCierreCaja.setEnabledAt(index,this.resumencierrecajaConstantesFunciones.activarBusquedaResumenCierreCajaResumenCierreCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResumenCierreCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaResumenCierreCaja")) {
			index= this.jTabbedPaneBusquedasResumenCierreCaja.indexOfComponent(this.jPanelBusquedaResumenCierreCajaResumenCierreCaja);

			this.jTabbedPaneBusquedasResumenCierreCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResumenCierreCaja.getComponent(index);

			this.resumencierrecajaConstantesFunciones.setResaltarBusquedaResumenCierreCajaResumenCierreCaja(resaltar);

			jPanel.setBorder(this.resumencierrecajaConstantesFunciones.resaltarBusquedaResumenCierreCajaResumenCierreCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarResumenCierreCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResumenCierreCaja() throws Exception {

		if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResumenCierreCaja();
		this.updateVisibilidadResaltarControlesFormularioResumenCierreCaja();
		this.updateHabilitarResaltarControlesFormularioResumenCierreCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioResumenCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.resumencierrecajaConstantesFunciones.resaltaridResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltaridResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarid_empresaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarid_empresaResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarid_sucursalResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarid_sucursalResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarid_usuarioResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarid_usuarioResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarid_cajaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarid_cajaResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarfechaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jDateChooserfechaResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarfechaResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltartipo_pagoResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltartipo_pagoResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarnombre_usuarioResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarnombre_usuarioResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarnombre_cajaResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarnombre_cajaResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltarvalorResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltarvalorResumenCierreCaja);}
		if(this.resumencierrecajaConstantesFunciones.resaltartotalResumenCierreCaja!=null && this.jInternalFrameDetalleFormResumenCierreCaja!=null) {this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setBorder(this.resumencierrecajaConstantesFunciones.resaltartotalResumenCierreCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResumenCierreCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
	
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostraridResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelidResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostraridResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_empresaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelid_empresaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_empresaResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_sucursalResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelid_sucursalResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_sucursalResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_usuarioResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelid_usuarioResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_usuarioResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_cajaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelid_cajaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarid_cajaResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jDateChooserfechaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarfechaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelfechaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarfechaResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrartipo_pagoResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPaneltipo_pagoResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrartipo_pagoResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarnombre_usuarioResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelnombre_usuarioResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarnombre_usuarioResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarnombre_cajaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelnombre_cajaResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarnombre_cajaResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarvalorResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPanelvalorResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrarvalorResumenCierreCaja);
		//this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrartotalResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jPaneltotalResumenCierreCaja.setVisible(this.resumencierrecajaConstantesFunciones.mostrartotalResumenCierreCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResumenCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormResumenCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResumenCierreCaja!=null) {
	
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldidResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activaridResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_empresaResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarid_empresaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_sucursalResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarid_sucursalResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_usuarioResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarid_usuarioResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jComboBoxid_cajaResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarid_cajaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jDateChooserfechaResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarfechaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtipo_pagoResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activartipo_pagoResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_usuarioResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarnombre_usuarioResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextAreanombre_cajaResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarnombre_cajaResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldvalorResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activarvalorResumenCierreCaja);
		this.jInternalFrameDetalleFormResumenCierreCaja.jTextFieldtotalResumenCierreCaja.setEnabled(this.resumencierrecajaConstantesFunciones.activartotalResumenCierreCaja);
		}
	}
	
		
}