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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.ParametroTesoreriaDefectoConstantesFunciones;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaDefectoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.ParametroTesoreriaDefectoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.ParametroTesoreriaDefectoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroTesoreriaDefectoBeanSwingJInternalFrame extends ParametroTesoreriaDefectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroTesoreriaDefectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroTesoreriaDefecto> parametrotesoreriadefectoValidator = new ClassValidator<ParametroTesoreriaDefecto>(ParametroTesoreriaDefecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroTesoreriaDefecto parametrotesoreriadefecto;	
	public ParametroTesoreriaDefecto parametrotesoreriadefectoAux;
	public ParametroTesoreriaDefecto parametrotesoreriadefectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroTesoreriaDefecto parametrotesoreriadefectoTotales;
	public Long idParametroTesoreriaDefectoActual;
	public Long iIdNuevoParametroTesoreriaDefecto=0L;
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

	public String sFinalQueryComboTipoCuentaBancoGlobal="";

	public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey;

	public List<TipoCuentaBancoGlobal> gettipocuentabancoglobalsForeignKey() {
		return tipocuentabancoglobalsForeignKey;
	}

	public void settipocuentabancoglobalsForeignKey(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey) {
		this.tipocuentabancoglobalsForeignKey = tipocuentabancoglobalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuentaBancoGlobal tipocuentabancoglobalForeignKey;

	public TipoCuentaBancoGlobal gettipocuentabancoglobalForeignKey() {
		return tipocuentabancoglobalForeignKey;
	}

	public void settipocuentabancoglobalForeignKey(TipoCuentaBancoGlobal tipocuentabancoglobalForeignKey) {
		this.tipocuentabancoglobalForeignKey = tipocuentabancoglobalForeignKey;
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
	
	public Boolean isPermisoTodoParametroTesoreriaDefecto;
	public Boolean isPermisoNuevoParametroTesoreriaDefecto;
	public Boolean isPermisoActualizarParametroTesoreriaDefecto;
	public Boolean isPermisoActualizarOriginalParametroTesoreriaDefecto;
	public Boolean isPermisoEliminarParametroTesoreriaDefecto;
	public Boolean isPermisoGuardarCambiosParametroTesoreriaDefecto;
	public Boolean isPermisoConsultaParametroTesoreriaDefecto;
	public Boolean isPermisoBusquedaParametroTesoreriaDefecto;
	public Boolean isPermisoReporteParametroTesoreriaDefecto;
	public Boolean isPermisoPaginacionMedioParametroTesoreriaDefecto;
	public Boolean isPermisoPaginacionAltoParametroTesoreriaDefecto;
	public Boolean isPermisoPaginacionTodoParametroTesoreriaDefecto;
	public Boolean isPermisoCopiarParametroTesoreriaDefecto;
	public Boolean isPermisoVerFormParametroTesoreriaDefecto;
	public Boolean isPermisoDuplicarParametroTesoreriaDefecto;
	public Boolean isPermisoOrdenParametroTesoreriaDefecto;
	
	
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
	
	public ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoReturnGeneral;
	public ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroTesoreriaDefecto=false;
	public Boolean esParaAccionDesdeFormularioParametroTesoreriaDefecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroTesoreriaDefectoSessionBeanAdditional parametrotesoreriadefectoSessionBeanAdditional=null;
	
	public ParametroTesoreriaDefectoSessionBeanAdditional getParametroTesoreriaDefectoSessionBeanAdditional() {
		return this.parametrotesoreriadefectoSessionBeanAdditional;
	}
	
	public void setParametroTesoreriaDefectoSessionBeanAdditional(ParametroTesoreriaDefectoSessionBeanAdditional parametrotesoreriadefectoSessionBeanAdditional) {
		try {
			this.parametrotesoreriadefectoSessionBeanAdditional=parametrotesoreriadefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional parametrotesoreriadefectoBeanSwingJInternalFrameAdditional=null;
	//public class ParametroTesoreriaDefectoBeanSwingJInternalFrame
	
	public ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional getParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional() {
		return this.parametrotesoreriadefectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional(ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional parametrotesoreriadefectoBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrotesoreriadefectoBeanSwingJInternalFrameAdditional=parametrotesoreriadefectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroTesoreriaDefecto parametrotesoreriadefectoBean;
	public ParametroTesoreriaDefectoConstantesFunciones parametrotesoreriadefectoConstantesFunciones;
	//public ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroTesoreriaDefecto> parametrotesoreriadefectos;	
	//public List<ParametroTesoreriaDefecto> parametrotesoreriadefectosEliminados;
	//public List<ParametroTesoreriaDefecto> parametrotesoreriadefectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaDuplicarParametroTesoreriaDefecto=true;
	public Boolean isVisibilidadCeldaCopiarParametroTesoreriaDefecto=true;
	public Boolean isVisibilidadCeldaVerFormParametroTesoreriaDefecto=true;
	public Boolean isVisibilidadCeldaOrdenParametroTesoreriaDefecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaCancelarParametroTesoreriaDefecto=false;
	public Boolean isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCuentaBancoGlobal=false;
	
	public Long getiIdNuevoParametroTesoreriaDefecto() {
		return this.iIdNuevoParametroTesoreriaDefecto;
	}

	public void setiIdNuevoParametroTesoreriaDefecto(Long iIdNuevoParametroTesoreriaDefecto) {
		this.iIdNuevoParametroTesoreriaDefecto = iIdNuevoParametroTesoreriaDefecto;
	}
	
	public Long getidParametroTesoreriaDefectoActual() {
		return this.idParametroTesoreriaDefectoActual;
	}

	public void setidParametroTesoreriaDefectoActual(Long idParametroTesoreriaDefectoActual) {
		this.idParametroTesoreriaDefectoActual = idParametroTesoreriaDefectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroTesoreriaDefecto getparametrotesoreriadefecto() {
		return this.parametrotesoreriadefecto;
	}

	public void setparametrotesoreriadefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto) {
		this.parametrotesoreriadefecto = parametrotesoreriadefecto;
	}
	
	public ParametroTesoreriaDefecto getparametrotesoreriadefectoAux() {
		return this.parametrotesoreriadefectoAux;
	}

	public void setparametrotesoreriadefectoAux(ParametroTesoreriaDefecto parametrotesoreriadefectoAux) {
		this.parametrotesoreriadefectoAux = parametrotesoreriadefectoAux;
	}				
	
	public ParametroTesoreriaDefecto getparametrotesoreriadefectoAnterior() {
		return this.parametrotesoreriadefectoAnterior;
	}

	public void setparametrotesoreriadefectoAnterior(ParametroTesoreriaDefecto parametrotesoreriadefectoAnterior) {
		this.parametrotesoreriadefectoAnterior = parametrotesoreriadefectoAnterior;
	}	
	
	public ParametroTesoreriaDefecto getparametrotesoreriadefectoTotales() {
		return this.parametrotesoreriadefectoTotales;
	}

	public void setparametrotesoreriadefectoTotales(ParametroTesoreriaDefecto parametrotesoreriadefectoTotales) {
		this.parametrotesoreriadefectoTotales = parametrotesoreriadefectoTotales;
	}	
	
	public ParametroTesoreriaDefecto getparametrotesoreriadefectoBean() {
		return this.parametrotesoreriadefectoBean;
	}

	public void setparametrotesoreriadefectoBean(ParametroTesoreriaDefecto parametrotesoreriadefectoBean) {
		this.parametrotesoreriadefectoBean = parametrotesoreriadefectoBean;
	}	
	
	public ParametroTesoreriaDefectoParameterReturnGeneral getparametrotesoreriadefectoReturnGeneral() {
		return this.parametrotesoreriadefectoReturnGeneral;
	}

	public void setparametrotesoreriadefectoReturnGeneral(ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoReturnGeneral) {
		this.parametrotesoreriadefectoReturnGeneral = parametrotesoreriadefectoReturnGeneral;
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

	public Long id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal=-1L;

	public Long getid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal() {
		return this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal;
	}

	public void setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(Long id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal) {
		this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal = id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroTesoreriaDefectoLogic getParametroTesoreriaDefectoLogic()	{		
		return parametrotesoreriadefectoLogic;
	}

	public void setParametroTesoreriaDefectoLogic(ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic) {
		this.parametrotesoreriadefectoLogic = parametrotesoreriadefectoLogic;
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
	
	public Boolean getIsEsNuevoParametroTesoreriaDefecto() {
		return isEsNuevoParametroTesoreriaDefecto;
	}

	public void setIsEsNuevoParametroTesoreriaDefecto(Boolean isEsNuevoParametroTesoreriaDefecto) {
		this.isEsNuevoParametroTesoreriaDefecto = isEsNuevoParametroTesoreriaDefecto;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroTesoreriaDefecto() {
		return esParaAccionDesdeFormularioParametroTesoreriaDefecto;
	}
	
	public void setEsParaAccionDesdeFormularioParametroTesoreriaDefecto(Boolean esParaAccionDesdeFormularioParametroTesoreriaDefecto) {
		this.esParaAccionDesdeFormularioParametroTesoreriaDefecto = esParaAccionDesdeFormularioParametroTesoreriaDefecto;
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

			if(this.parametrotesoreriadefectoSessionBean==null) {
				this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			}

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrotesoreriadefectoSessionBean.getlidEmpresaActual());
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

			if(this.parametrotesoreriadefectoSessionBean==null) {
				this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			}

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parametrotesoreriadefectoSessionBean.getlidSucursalActual());
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

	public void cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic=new TipoCuentaBancoGlobalLogic();

			//tipocuentabancoglobalLogic.getTipoCuentaBancoGlobalDataAccess().setIsForForeingKeyData(true);

			if(this.parametrotesoreriadefectoSessionBean==null) {
				this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			}

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuentabancoglobalLogic.getTipoCuentaBancoGlobalDataAccess().setIsForForeingKeyData(true);

					tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobalsWithConnection(sFinalQuery,new Pagination());

					this.tipocuentabancoglobalsForeignKey=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoglobalLogic.getEntityWithConnection(parametrotesoreriadefectoSessionBean.getlidTipoCuentaBancoGlobalActual());
					this.tipocuentabancoglobalsForeignKey.add(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal());
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

					if(this.parametrotesoreriadefecto!=null) {
						this.parametrotesoreriadefecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroTesoreriaDefectoGenerico)throws Exception
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
				jComboBoxid_empresaParametroTesoreriaDefectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroTesoreriaDefectoGenerico!=null && jComboBoxid_empresaParametroTesoreriaDefectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroTesoreriaDefectoGenerico.setSelectedIndex(0);
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

					if(this.parametrotesoreriadefecto!=null) {
						this.parametrotesoreriadefecto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroTesoreriaDefectoGenerico)throws Exception
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
				jComboBoxid_sucursalParametroTesoreriaDefectoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroTesoreriaDefectoGenerico!=null && jComboBoxid_sucursalParametroTesoreriaDefectoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroTesoreriaDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuentaBancoGlobalForeignKey(Long idTipoCuentaBancoGlobalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuentabancoglobalTemp!=null) {

					if(this.parametrotesoreriadefecto!=null) {
						this.parametrotesoreriadefecto.setTipoCuentaBancoGlobal(tipocuentabancoglobalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobalTemp);
					}
				} else {
					//jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobalTemp);
					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuentabancoglobalTemp!=null && jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto!=null) {
						jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobalTemp);
					} else {
						if(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto!=null) {
							//jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobalTemp);
							if(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.getItemCount()>0) {
								jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setSelectedIndex(0);
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

	public String getActualTipoCuentaBancoGlobalForeignKeyDescripcion(Long idTipoCuentaBancoGlobalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}


			sDescripcion=TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuentaBancoGlobalForeignKeyGenerico(Long idTipoCuentaBancoGlobalSeleccionado,JComboBox jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsForeignKey) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}

			if(tipocuentabancoglobalTemp!=null) {
				jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico.setSelectedItem(tipocuentabancoglobalTemp);
			} else {
				if(jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico!=null && jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroTesoreriaDefecto parametrotesoreriadefecto,JComboBox jComboBoxid_empresaParametroTesoreriaDefectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroTesoreriaDefectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroTesoreriaDefectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrotesoreriadefecto.setid_empresa(empresaAux.getId());
				parametrotesoreriadefecto.setempresa_descripcion(ParametroTesoreriaDefectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrotesoreriadefecto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroTesoreriaDefecto parametrotesoreriadefecto,JComboBox jComboBoxid_sucursalParametroTesoreriaDefectoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroTesoreriaDefectoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroTesoreriaDefectoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametrotesoreriadefecto.setid_sucursal(sucursalAux.getId());
				parametrotesoreriadefecto.setsucursal_descripcion(ParametroTesoreriaDefectoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametrotesoreriadefecto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuentaBancoGlobalForeignKey(ParametroTesoreriaDefecto parametrotesoreriadefecto,JComboBox jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico)throws Exception
	{
		try
		{
			TipoCuentaBancoGlobal  tipocuentabancoglobalAux=new TipoCuentaBancoGlobal();

			if(jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico==null) {
				tipocuentabancoglobalAux=(TipoCuentaBancoGlobal)this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getSelectedItem();
			} else {
				tipocuentabancoglobalAux=(TipoCuentaBancoGlobal)jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefectoGenerico.getSelectedItem();
			}

			if(tipocuentabancoglobalAux!=null && tipocuentabancoglobalAux.getId()!=null) {
				parametrotesoreriadefecto.setid_tipo_cuenta_banco_global(tipocuentabancoglobalAux.getId());
				parametrotesoreriadefecto.settipocuentabancoglobal_descripcion(ParametroTesoreriaDefectoConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobalAux));
				parametrotesoreriadefecto.setTipoCuentaBancoGlobal(tipocuentabancoglobalAux);			}
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

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
					}

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
					}

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuentaBancoGlobal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.removeAllItems();

							for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobalsForeignKey) {
								this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.addItem(tipocuentabancoglobal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { 
					}

					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.removeAllItems();

							for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobalsForeignKey) {
								this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.addItem(tipocuentabancoglobal);
							}
						}

						if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(TipoCuentaBancoGlobal tipocuentabancoglobal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setSelectedItem(tipocuentabancoglobal);
						} else {
							this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroTesoreriaDefecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroTesoreriaDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroTesoreriaDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto(this.parametrotesoreriadefectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoCuentaBancoGlobal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(this.parametrotesoreriadefectos);
			parametrotesoreriadefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroTesoreriaDefectoParameterReturnGeneral getParametroTesoreriaDefectoParameterGeneral() {
		return this.parametrotesoreriadefectoParameterGeneral;
	}
	
	public void setParametroTesoreriaDefectoParameterGeneral(ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoParameterGeneral) {
		this.parametrotesoreriadefectoParameterGeneral = parametrotesoreriadefectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroTesoreriaDefecto() {
		return isPermisoTodoParametroTesoreriaDefecto;
	}

	public void setIsPermisoTodoParametroTesoreriaDefecto(Boolean isPermisoTodoParametroTesoreriaDefecto) {
		this.isPermisoTodoParametroTesoreriaDefecto = isPermisoTodoParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoNuevoParametroTesoreriaDefecto() {
		return isPermisoNuevoParametroTesoreriaDefecto;
	}

	public void setIsPermisoNuevoParametroTesoreriaDefecto(Boolean isPermisoNuevoParametroTesoreriaDefecto) {
		this.isPermisoNuevoParametroTesoreriaDefecto = isPermisoNuevoParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoActualizarParametroTesoreriaDefecto() {
		return isPermisoActualizarParametroTesoreriaDefecto;
	}

	public void setIsPermisoActualizarParametroTesoreriaDefecto(Boolean isPermisoActualizarParametroTesoreriaDefecto) {
		this.isPermisoActualizarParametroTesoreriaDefecto = isPermisoActualizarParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoEliminarParametroTesoreriaDefecto() {
		return isPermisoEliminarParametroTesoreriaDefecto;
	}

	public void setIsPermisoEliminarParametroTesoreriaDefecto(Boolean isPermisoEliminarParametroTesoreriaDefecto) {
		this.isPermisoEliminarParametroTesoreriaDefecto = isPermisoEliminarParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoGuardarCambiosParametroTesoreriaDefecto() {
		return isPermisoGuardarCambiosParametroTesoreriaDefecto;
	}

	public void setIsPermisoGuardarCambiosParametroTesoreriaDefecto(Boolean isPermisoGuardarCambiosParametroTesoreriaDefecto) {
		this.isPermisoGuardarCambiosParametroTesoreriaDefecto = isPermisoGuardarCambiosParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoConsultaParametroTesoreriaDefecto() {
		return isPermisoConsultaParametroTesoreriaDefecto;
	}

	public void setIsPermisoConsultaParametroTesoreriaDefecto(Boolean isPermisoConsultaParametroTesoreriaDefecto) {
		this.isPermisoConsultaParametroTesoreriaDefecto = isPermisoConsultaParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoBusquedaParametroTesoreriaDefecto() {
		return isPermisoBusquedaParametroTesoreriaDefecto;
	}

	public void setIsPermisoBusquedaParametroTesoreriaDefecto(Boolean isPermisoBusquedaParametroTesoreriaDefecto) {
		this.isPermisoBusquedaParametroTesoreriaDefecto = isPermisoBusquedaParametroTesoreriaDefecto;
	}

	public Boolean getIsPermisoReporteParametroTesoreriaDefecto() {
		return isPermisoReporteParametroTesoreriaDefecto;
	}

	public void setIsPermisoReporteParametroTesoreriaDefecto(Boolean isPermisoReporteParametroTesoreriaDefecto) {
		this.isPermisoReporteParametroTesoreriaDefecto = isPermisoReporteParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroTesoreriaDefecto() {
		return isPermisoPaginacionMedioParametroTesoreriaDefecto;
	}

	public void setIsPermisoPaginacionMedioParametroTesoreriaDefecto(Boolean isPermisoPaginacionMedioParametroTesoreriaDefecto) {
		this.isPermisoPaginacionMedioParametroTesoreriaDefecto = isPermisoPaginacionMedioParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroTesoreriaDefecto() {
		return isPermisoPaginacionTodoParametroTesoreriaDefecto;
	}

	public void setIsPermisoPaginacionTodoParametroTesoreriaDefecto(Boolean isPermisoPaginacionTodoParametroTesoreriaDefecto) {
		this.isPermisoPaginacionTodoParametroTesoreriaDefecto = isPermisoPaginacionTodoParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroTesoreriaDefecto() {
		return isPermisoPaginacionAltoParametroTesoreriaDefecto;
	}

	public void setIsPermisoPaginacionAltoParametroTesoreriaDefecto(Boolean isPermisoPaginacionAltoParametroTesoreriaDefecto) {
		this.isPermisoPaginacionAltoParametroTesoreriaDefecto = isPermisoPaginacionAltoParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoCopiarParametroTesoreriaDefecto() {
		return isPermisoCopiarParametroTesoreriaDefecto;
	}

	public void setIsPermisoCopiarParametroTesoreriaDefecto(Boolean isPermisoCopiarParametroTesoreriaDefecto) {
		this.isPermisoCopiarParametroTesoreriaDefecto = isPermisoCopiarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoVerFormParametroTesoreriaDefecto() {
		return isPermisoVerFormParametroTesoreriaDefecto;
	}

	public void setIsPermisoVerFormParametroTesoreriaDefecto(Boolean isPermisoVerFormParametroTesoreriaDefecto) {
		this.isPermisoVerFormParametroTesoreriaDefecto = isPermisoVerFormParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoDuplicarParametroTesoreriaDefecto() {
		return isPermisoDuplicarParametroTesoreriaDefecto;
	}

	public void setIsPermisoDuplicarParametroTesoreriaDefecto(Boolean isPermisoDuplicarParametroTesoreriaDefecto) {
		this.isPermisoDuplicarParametroTesoreriaDefecto = isPermisoDuplicarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsPermisoOrdenParametroTesoreriaDefecto() {
		return isPermisoOrdenParametroTesoreriaDefecto;
	}

	public void setIsPermisoOrdenParametroTesoreriaDefecto(Boolean isPermisoOrdenParametroTesoreriaDefecto) {
		this.isPermisoOrdenParametroTesoreriaDefecto = isPermisoOrdenParametroTesoreriaDefecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroTesoreriaDefecto() {
		return isVisibilidadCeldaNuevoParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaNuevoParametroTesoreriaDefecto(Boolean isVisibilidadCeldaNuevoParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto = isVisibilidadCeldaNuevoParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaDuplicarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaDuplicarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaDuplicarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto = isVisibilidadCeldaDuplicarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaCopiarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaCopiarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaCopiarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto = isVisibilidadCeldaCopiarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroTesoreriaDefecto() {
		return isVisibilidadCeldaVerFormParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaVerFormParametroTesoreriaDefecto(Boolean isVisibilidadCeldaVerFormParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto = isVisibilidadCeldaVerFormParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroTesoreriaDefecto() {
		return isVisibilidadCeldaOrdenParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaOrdenParametroTesoreriaDefecto(Boolean isVisibilidadCeldaOrdenParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto = isVisibilidadCeldaOrdenParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto() {
		return isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto(Boolean isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto = isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaModificarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaModificarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaModificarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaModificarParametroTesoreriaDefecto = isVisibilidadCeldaModificarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaActualizarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaActualizarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaActualizarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto = isVisibilidadCeldaActualizarParametroTesoreriaDefecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaEliminarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaEliminarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaEliminarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto = isVisibilidadCeldaEliminarParametroTesoreriaDefecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaCancelarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaCancelarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaCancelarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto = isVisibilidadCeldaCancelarParametroTesoreriaDefecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroTesoreriaDefecto() {
		return isVisibilidadCeldaGuardarParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaGuardarParametroTesoreriaDefecto(Boolean isVisibilidadCeldaGuardarParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto = isVisibilidadCeldaGuardarParametroTesoreriaDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto() {
		return isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto(Boolean isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto) {
		this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto = isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto;
	}
		
	public ParametroTesoreriaDefectoSessionBean getparametrotesoreriadefectoSessionBean() {
		return this.parametrotesoreriadefectoSessionBean;
	}
	
	public void setparametrotesoreriadefectoSessionBean(ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean) {
		this.parametrotesoreriadefectoSessionBean=parametrotesoreriadefectoSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoCuentaBancoGlobal() {
		return this.isVisibilidadFK_IdTipoCuentaBancoGlobal;
	}

	public void setisVisibilidadFK_IdTipoCuentaBancoGlobal(Boolean isVisibilidadFK_IdTipoCuentaBancoGlobal) {
		this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isVisibilidadFK_IdTipoCuentaBancoGlobal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrotesoreriadefecto,null);
				this.setActualParaGuardarSucursalForeignKey(parametrotesoreriadefecto,null);
				this.setActualParaGuardarTipoCuentaBancoGlobalForeignKey(parametrotesoreriadefecto,null);
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
	
	public void bugActualizarReferenciaActual(ParametroTesoreriaDefecto parametrotesoreriadefecto,ParametroTesoreriaDefecto parametrotesoreriadefectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroTesoreriaDefecto(parametrotesoreriadefecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrotesoreriadefectoAux.setId(parametrotesoreriadefecto.getId());
		parametrotesoreriadefectoAux.setVersionRow(parametrotesoreriadefecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroTesoreriaDefecto();
		
			int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrotesoreriadefectoValidator.getInvalidValues(this.parametrotesoreriadefecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrotesoreriadefectoLogic.setDatosCliente(datosCliente);
			parametrotesoreriadefectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrotesoreriadefectoAux=new  ParametroTesoreriaDefecto();
				
				parametrotesoreriadefectoAux.setIsNew(true);
				parametrotesoreriadefectoAux.setIsChanged(true);
				
				parametrotesoreriadefectoAux.setParametroTesoreriaDefectoOriginal(this.parametrotesoreriadefecto);
				
				parametrotesoreriadefectoAux.setId(this.parametrotesoreriadefecto.getId());	
				parametrotesoreriadefectoAux.setVersionRow(this.parametrotesoreriadefecto.getVersionRow());	
				parametrotesoreriadefectoAux.setid_empresa(this.parametrotesoreriadefecto.getid_empresa());	
				parametrotesoreriadefectoAux.setid_sucursal(this.parametrotesoreriadefecto.getid_sucursal());	
				parametrotesoreriadefectoAux.setid_tipo_cuenta_banco_global(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectos();//WithConnection
						//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectoRelaciones(parametrotesoreriadefectoAux);//WithConnection
								//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrotesoreriadefectoAux=new  ParametroTesoreriaDefecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() && this.parametrotesoreriadefecto.getId()>=0)) {
						
					parametrotesoreriadefectoAux.setIsNew(false);
				}
				
				parametrotesoreriadefectoAux.setIsDeleted(false);
			
				parametrotesoreriadefectoAux.setId(this.parametrotesoreriadefecto.getId());	
				parametrotesoreriadefectoAux.setVersionRow(this.parametrotesoreriadefecto.getVersionRow());	
				parametrotesoreriadefectoAux.setid_empresa(this.parametrotesoreriadefecto.getid_empresa());	
				parametrotesoreriadefectoAux.setid_sucursal(this.parametrotesoreriadefecto.getid_sucursal());	
				parametrotesoreriadefectoAux.setid_tipo_cuenta_banco_global(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectos();//WithConnection
						//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectoRelaciones(parametrotesoreriadefectoAux);//WithConnection
								//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrotesoreriadefecto,parametrotesoreriadefectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrotesoreriadefectoAux=new  ParametroTesoreriaDefecto();
				
				parametrotesoreriadefectoAux.setIsNew(false);
				parametrotesoreriadefectoAux.setIsChanged(false);
				
				parametrotesoreriadefectoAux.setIsDeleted(true);
				
				parametrotesoreriadefectoAux.setId(this.parametrotesoreriadefecto.getId());	
				parametrotesoreriadefectoAux.setVersionRow(this.parametrotesoreriadefecto.getVersionRow());	
				parametrotesoreriadefectoAux.setid_empresa(this.parametrotesoreriadefecto.getid_empresa());	
				parametrotesoreriadefectoAux.setid_sucursal(this.parametrotesoreriadefecto.getid_sucursal());	
				parametrotesoreriadefectoAux.setid_tipo_cuenta_banco_global(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global());	
				
				if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrotesoreriadefectoAux.getId()>=0) {	
						this.parametrotesoreriadefectosEliminados.add(parametrotesoreriadefectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectos();//WithConnection
						//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectoRelaciones(parametrotesoreriadefectoAux);//WithConnection
								//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
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
							if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrotesoreriadefectoAux,parametrotesoreriadefectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().addAll(this.parametrotesoreriadefectosEliminados);
					
					parametrotesoreriadefectoLogic.saveParametroTesoreriaDefectos();//WithConnection
					//parametrotesoreriadefectoLogic.getSetVersionRowParametroTesoreriaDefectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto();
				
				this.parametrotesoreriadefectosEliminados= new ArrayList<ParametroTesoreriaDefecto>();		
			}
			
			if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Tesoreria Defecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrotesoreriadefecto=parametrotesoreriadefectoAux;
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
      		//this.finishProcessParametroTesoreriaDefecto();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroTesoreriaDefecto parametrotesoreriadefectoLocal) throws Exception {
		
		if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroTesoreriaDefecto parametrotesoreriadefectoLocal) throws Exception {	
		if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrotesoreriadefectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametrotesoreriadefectoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuentaBancoGlobalDetalleFormJInternalFrame.class)) {
				TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrameLocal=(TipoCuentaBancoGlobalBeanSwingJInternalFrame) ((TipoCuentaBancoGlobalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuentabancoglobalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGlobal(tipocuentabancoglobalBeanSwingJInternalFrameLocal.gettipocuentabancoglobal(),true);
				tipocuentabancoglobalBeanSwingJInternalFrameLocal.actualizarLista(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal,this.tipocuentabancoglobalsForeignKey);

				tipocuentabancoglobalBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal);

				parametrotesoreriadefectoLocal.setTipoCuentaBancoGlobal(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal);

				this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
				this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Formulario");
				this.setActualTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobalBeanSwingJInternalFrameLocal.tipocuentabancoglobal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroTesoreriaDefectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrotesoreriadefectoValidator.getInvalidValues(this.parametrotesoreriadefecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroTesoreriaDefecto parametrotesoreriadefecto,List<ParametroTesoreriaDefecto> parametrotesoreriadefectos) throws Exception {
		try	{		
			ParametroTesoreriaDefectoConstantesFunciones.actualizarLista(parametrotesoreriadefecto,parametrotesoreriadefectos,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroTesoreriaDefecto parametrotesoreriadefecto,List<ParametroTesoreriaDefecto> parametrotesoreriadefectos) throws Exception {
		try	{			
			ParametroTesoreriaDefectoConstantesFunciones.actualizarSelectedLista(parametrotesoreriadefecto,parametrotesoreriadefectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroTesoreriaDefecto> parametrotesoreriadefectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrotesoreriadefectosLocal=this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrotesoreriadefectosLocal=this.parametrotesoreriadefectos;
			}
			//ARCHITECTURE
		
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoLocal:parametrotesoreriadefectosLocal) {
				if(this.permiteMantenimiento(parametrotesoreriadefectoLocal) && parametrotesoreriadefectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroTesoreriaDefectoConstantesFunciones.getParametroTesoreriaDefectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaDefectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_empresaParametroTesoreriaDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaDefectoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_sucursalParametroTesoreriaDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroTesoreriaDefectoConstantesFunciones.IDTIPOCUENTABANCOGLOBAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_empresaParametroTesoreriaDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_sucursalParametroTesoreriaDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,"");
		
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
		this.iIdNuevoParametroTesoreriaDefecto--;	
		
		
		this.parametrotesoreriadefectoAux=new ParametroTesoreriaDefecto();
		
		this.parametrotesoreriadefectoAux.setId(this.iIdNuevoParametroTesoreriaDefecto);
		this.parametrotesoreriadefectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().add(this.parametrotesoreriadefectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrotesoreriadefectos.add(this.parametrotesoreriadefectoAux);
		}
		//ARCHITECTURE
		
		this.parametrotesoreriadefecto=this.parametrotesoreriadefectoAux;
		
		if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
		}
				
		//this.setDefaultControlesParametroTesoreriaDefecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroTesoreriaDefecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroTesoreriaDefecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreriaDefecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefectoBean,this.parametrotesoreriadefecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
			classes=ParametroTesoreriaDefectoConstantesFunciones.getClassesRelationshipsOfParametroTesoreriaDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.procesarEventosParametroTesoreriaDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this.parametrotesoreriadefecto,this.parametrotesoreriadefectoParameterGeneral,this.isEsNuevoParametroTesoreriaDefecto,classes);//this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral,this.parametrotesoreriadefectoBean,false);
		
		if(this.parametrotesoreriadefectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto());
		}
		
		if(this.parametrotesoreriadefectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto(),classes);//this.parametrotesoreriadefectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroTesoreriaDefecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroTesoreriaDefecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.RecargarFormParametroTesoreriaDefecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
						
			if(parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();
			}
			
			this.actualizarVisualTableDatosParametroTesoreriaDefecto();
			
			this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreriaDefecto(), this.getIndiceNuevoParametroTesoreriaDefecto());
			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
						
			this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroTesoreriaDefecto(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setEnabled(isHabilitar && this.parametrotesoreriadefectoConstantesFunciones.activarid_empresaParametroTesoreriaDefecto);//
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setEnabled(isHabilitar && this.parametrotesoreriadefectoConstantesFunciones.activarid_sucursalParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setEnabled(isHabilitar && this.parametrotesoreriadefectoConstantesFunciones.activarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto);
	};
	
	public void setDefaultControlesParametroTesoreriaDefecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroTesoreriaDefecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(true);			
			this.parametrotesoreriadefectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.setVisible(true);
			
					
		} else {
			//this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(false);			
			this.parametrotesoreriadefectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroTesoreriaDefecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				if(parametrotesoreriadefectoAux.getId().equals(this.iIdNuevoParametroTesoreriaDefecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectos) {
				if(parametrotesoreriadefectoAux.getId().equals(this.iIdNuevoParametroTesoreriaDefecto)) {
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
	
	public int getIndiceActualParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				if(parametrotesoreriadefectoAux.getId().equals(parametrotesoreriadefecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectos) {
				if(parametrotesoreriadefectoAux.getId().equals(parametrotesoreriadefecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				if(parametrotesoreriadefectoAux.getParametroTesoreriaDefectoOriginal().getId().equals(parametrotesoreriadefectoOriginal.getId())) {
					existe=true;
					parametrotesoreriadefectoOriginal.setId(parametrotesoreriadefectoAux.getId());
					parametrotesoreriadefectoOriginal.setVersionRow(parametrotesoreriadefectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectos) {
				if(parametrotesoreriadefectoAux.getParametroTesoreriaDefectoOriginal().getId().equals(parametrotesoreriadefectoOriginal.getId())) {
					existe=true;
					parametrotesoreriadefectoOriginal.setId(parametrotesoreriadefectoAux.getId());
					parametrotesoreriadefectoOriginal.setVersionRow(parametrotesoreriadefectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroTesoreriaDefecto(Boolean esParaCancelar) throws Exception {
		parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
		parametrotesoreriadefectoAux=new ParametroTesoreriaDefecto();
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
					if(parametrotesoreriadefectoAux.getId()<0) {
						parametrotesoreriadefectosAux.add(parametrotesoreriadefectoAux);
					}		
				}
				this.iIdNuevoParametroTesoreriaDefecto=0L;
				this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().removeAll(parametrotesoreriadefectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectos) {
					if(parametrotesoreriadefectoAux.getId()<0) {
						parametrotesoreriadefectosAux.add(parametrotesoreriadefectoAux);
					}		
				}
				this.iIdNuevoParametroTesoreriaDefecto=0L;
				this.parametrotesoreriadefectos.removeAll(parametrotesoreriadefectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroTesoreriaDefecto 
					&& this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()>0
					) {
					parametrotesoreriadefectoAux=this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().get(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size() - 1);
				
					if(parametrotesoreriadefectoAux.getId()<0) {
						this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().remove(parametrotesoreriadefectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroTesoreriaDefecto && this.parametrotesoreriadefectos.size()>0) {
					parametrotesoreriadefectoAux=this.parametrotesoreriadefectos.get(this.parametrotesoreriadefectos.size() - 1);
				
					if(parametrotesoreriadefectoAux.getId()<0) {
						this.parametrotesoreriadefectos.remove(parametrotesoreriadefectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroTesoreriaDefecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrotesoreriadefecto.getId()<0) {
				this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().remove(this.parametrotesoreriadefecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrotesoreriadefecto.getId()<0) {
				this.parametrotesoreriadefectos.remove(this.parametrotesoreriadefecto);
			}
		}			
	}
	
	public void setEstadosInicialesParametroTesoreriaDefecto(List<ParametroTesoreriaDefecto> parametrotesoreriadefectosAux) throws Exception {
		ParametroTesoreriaDefectoConstantesFunciones.setEstadosInicialesParametroTesoreriaDefecto(parametrotesoreriadefectosAux);
	}
	
	public void setEstadosInicialesParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefectoAux) throws Exception {
		ParametroTesoreriaDefectoConstantesFunciones.setEstadosInicialesParametroTesoreriaDefecto(parametrotesoreriadefectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroTesoreriaDefectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroTesoreriaDefectoActual()) {
				if(!this.isEsNuevoParametroTesoreriaDefecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroTesoreriaDefecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroTesoreriaDefectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Tesoreria Defecto ?", "MANTENIMIENTO DE Parametro Tesoreria Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroTesoreriaDefecto parametrotesoreriadefecto) throws Exception {
		ParametroTesoreriaDefectoConstantesFunciones.seleccionarAsignar(this.parametrotesoreriadefecto,parametrotesoreriadefecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroTesoreriaDefecto=this.isPermisoActualizarOriginalParametroTesoreriaDefecto;
			
			
			this.seleccionarAsignar(parametrotesoreriadefecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroTesoreriaDefectoConstantesFunciones.quitarEspaciosParametroTesoreriaDefecto(this.parametrotesoreriadefecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrotesoreriadefectoSessionBean.setsFuncionBusquedaRapida(this.parametrotesoreriadefectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroTesoreriaDefecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroTesoreriaDefecto(esParaCancelar);				
				this.cancelarNuevoParametroTesoreriaDefecto(esParaCancelar);								
			}
			
			this.parametrotesoreriadefecto=new ParametroTesoreriaDefecto();
			
			this.inicializarParametroTesoreriaDefecto();
			
			this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroTesoreriaDefecto() throws Exception {
		try {
			ParametroTesoreriaDefectoConstantesFunciones.inicializarParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroTesoreriaDefectos(String sAccionBusqueda,List<ParametroTesoreriaDefecto> parametrotesoreriadefectosParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroTesoreriaDefecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroTesoreriaDefectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroTesoreriaDefectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroTesoreriaDefecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Tesoreria Defectos");		
		parameters.put("busquedapor", ParametroTesoreriaDefectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroTesoreriaDefecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroTesoreriaDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroTesoreriaDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroTesoreriaDefecto=new JRBeanArrayDataSource(ParametroTesoreriaDefectoJInternalFrame.TraerParametroTesoreriaDefectoBeans(parametrotesoreriadefectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroTesoreriaDefecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroTesoreriaDefectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroTesoreriaDefectoBean.TraerParametroTesoreriaDefectoBeans(parametrotesoreriadefectosParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefectoActionPerformed(null);
					//this.generarExcelReporteParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroTesoreriaDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrotesoreriadefectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroTesoreriaDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreriaDefecto> parametrotesoreriadefectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesoreriaDefectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroTesoreriaDefecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroTesoreriaDefecto parametrotesoreriadefecto : parametrotesoreriadefectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroTesoreriaDefectoConstantesFunciones.generarExcelReporteDataParametroTesoreriaDefecto("NORMAL",row,workbook,parametrotesoreriadefecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroTesoreriaDefecto(String sTipo,Row row,Workbook workbook) {
		
		ParametroTesoreriaDefectoConstantesFunciones.generarExcelReporteHeaderParametroTesoreriaDefecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroTesoreriaDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreriaDefecto> parametrotesoreriadefectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesoreriaDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroTesoreriaDefecto parametrotesoreriadefecto : parametrotesoreriadefectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.getParametroTesoreriaDefectoDescripcion(parametrotesoreriadefecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreriadefecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreriadefecto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroTesoreriaDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroTesoreriaDefecto> parametrotesoreriadefectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroTesoreriaDefecto> parametrotesoreriadefectosRespaldo=null;
		
		classes=ParametroTesoreriaDefectoConstantesFunciones.getClassesRelationshipsOfParametroTesoreriaDefecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrotesoreriadefectoLogic.setDatosCliente(this.datosCliente);
		this.parametrotesoreriadefectoLogic.setDatosDeep(this.datosDeep);
		this.parametrotesoreriadefectoLogic.setIsConDeep(true);
		
		parametrotesoreriadefectosRespaldo=this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos();
		
		this.parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(parametrotesoreriadefectosParaReportes);	
		this.parametrotesoreriadefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrotesoreriadefectosParaReportes=this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos();
		this.parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(parametrotesoreriadefectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroTesoreriaDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroTesoreriaDefecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroTesoreriaDefecto parametrotesoreriadefecto : parametrotesoreriadefectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroTesoreriaDefecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroTesoreriaDefectoConstantesFunciones.generarExcelReporteDataParametroTesoreriaDefecto("NORMAL",row,workbook,parametrotesoreriadefecto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.getParametroTesoreriaDefectoDescripcion(parametrotesoreriadefecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroTesoreriaDefecto() throws Exception {		
		this.startProcessParametroTesoreriaDefecto(true);
	}
	
	public void startProcessParametroTesoreriaDefecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroTesoreriaDefecto ,this.jPanelParametrosReportesParametroTesoreriaDefecto, this.jScrollPanelDatosParametroTesoreriaDefecto,this.jPanelPaginacionParametroTesoreriaDefecto, this.jScrollPanelDatosEdicionParametroTesoreriaDefecto, this.jPanelAccionesParametroTesoreriaDefecto,this.jPanelAccionesFormularioParametroTesoreriaDefecto,this.jmenuBarParametroTesoreriaDefecto,this.jmenuBarDetalleParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroTesoreriaDefecto=this.jTabbedPaneBusquedasParametroTesoreriaDefecto; 
		
		final JPanel jPanelParametrosReportesParametroTesoreriaDefecto=this.jPanelParametrosReportesParametroTesoreriaDefecto;
		//final JScrollPane jScrollPanelDatosParametroTesoreriaDefecto=this.jScrollPanelDatosParametroTesoreriaDefecto;
		final JTable jTableDatosParametroTesoreriaDefecto=this.jTableDatosParametroTesoreriaDefecto;		
		final JPanel jPanelPaginacionParametroTesoreriaDefecto=this.jPanelPaginacionParametroTesoreriaDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroTesoreriaDefecto=this.jScrollPanelDatosEdicionParametroTesoreriaDefecto;
		final JPanel jPanelAccionesParametroTesoreriaDefecto=this.jPanelAccionesParametroTesoreriaDefecto;
		
		JPanel jPanelCamposAuxiliarParametroTesoreriaDefecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			jPanelCamposAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelCamposParametroTesoreriaDefecto;
			jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelAccionesFormularioParametroTesoreriaDefecto;
		}
		
		final JPanel jPanelCamposParametroTesoreriaDefecto=jPanelCamposAuxiliarParametroTesoreriaDefecto;
		final JPanel jPanelAccionesFormularioParametroTesoreriaDefecto=jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto;
		
		
		final JMenuBar jmenuBarParametroTesoreriaDefecto=this.jmenuBarParametroTesoreriaDefecto;
		final JToolBar jTtoolBarParametroTesoreriaDefecto=this.jTtoolBarParametroTesoreriaDefecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroTesoreriaDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jmenuBarDetalleParametroTesoreriaDefecto;
			jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTtoolBarDetalleParametroTesoreriaDefecto;
		}
		
		final JMenuBar jmenuBarDetalleParametroTesoreriaDefecto=jmenuBarDetalleAuxiliarParametroTesoreriaDefecto;
		final JToolBar jTtoolBarDetalleParametroTesoreriaDefecto=jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroTesoreriaDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroTesoreriaDefecto;
			processRunnable.jTableDatos=jTableDatosParametroTesoreriaDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroTesoreriaDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroTesoreriaDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroTesoreriaDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroTesoreriaDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroTesoreriaDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroTesoreriaDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroTesoreriaDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroTesoreriaDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroTesoreriaDefecto ,jPanelParametrosReportesParametroTesoreriaDefecto,jTableDatosParametroTesoreriaDefecto, /*jScrollPanelDatosParametroTesoreriaDefecto,*/jPanelCamposParametroTesoreriaDefecto,jPanelPaginacionParametroTesoreriaDefecto, /*jScrollPanelDatosEdicionParametroTesoreriaDefecto,*/ jPanelAccionesParametroTesoreriaDefecto,jPanelAccionesFormularioParametroTesoreriaDefecto,jmenuBarParametroTesoreriaDefecto,jmenuBarDetalleParametroTesoreriaDefecto,jTtoolBarParametroTesoreriaDefecto,jTtoolBarDetalleParametroTesoreriaDefecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroTesoreriaDefecto ,jPanelParametrosReportesParametroTesoreriaDefecto, jScrollPanelDatosParametroTesoreriaDefecto,jPanelPaginacionParametroTesoreriaDefecto, jScrollPanelDatosEdicionParametroTesoreriaDefecto, jPanelAccionesParametroTesoreriaDefecto,jPanelAccionesFormularioParametroTesoreriaDefecto,jmenuBarParametroTesoreriaDefecto,jmenuBarDetalleParametroTesoreriaDefecto,jTtoolBarParametroTesoreriaDefecto,jTtoolBarDetalleParametroTesoreriaDefecto);
						
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
	
	public void finishProcessParametroTesoreriaDefecto() {// throws Exception 
		this.finishProcessParametroTesoreriaDefecto(true);
	}
	
	public void finishProcessParametroTesoreriaDefecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroTesoreriaDefecto ,this.jPanelParametrosReportesParametroTesoreriaDefecto, this.jScrollPanelDatosParametroTesoreriaDefecto,this.jPanelPaginacionParametroTesoreriaDefecto, this.jScrollPanelDatosEdicionParametroTesoreriaDefecto, this.jPanelAccionesParametroTesoreriaDefecto,this.jPanelAccionesFormularioParametroTesoreriaDefecto,this.jmenuBarParametroTesoreriaDefecto,this.jmenuBarDetalleParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroTesoreriaDefecto=this.jTabbedPaneBusquedasParametroTesoreriaDefecto; 
		
		final JPanel jPanelParametrosReportesParametroTesoreriaDefecto=this.jPanelParametrosReportesParametroTesoreriaDefecto;
		//final JScrollPane jScrollPanelDatosParametroTesoreriaDefecto=this.jScrollPanelDatosParametroTesoreriaDefecto;
		final JTable jTableDatosParametroTesoreriaDefecto=this.jTableDatosParametroTesoreriaDefecto;		
		final JPanel jPanelPaginacionParametroTesoreriaDefecto=this.jPanelPaginacionParametroTesoreriaDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroTesoreriaDefecto=this.jScrollPanelDatosEdicionParametroTesoreriaDefecto;
		final JPanel jPanelAccionesParametroTesoreriaDefecto=this.jPanelAccionesParametroTesoreriaDefecto;
		
		JPanel jPanelCamposAuxiliarParametroTesoreriaDefecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			jPanelCamposAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelCamposParametroTesoreriaDefecto;
			jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelAccionesFormularioParametroTesoreriaDefecto;
		}
		
		final JPanel jPanelCamposParametroTesoreriaDefecto=jPanelCamposAuxiliarParametroTesoreriaDefecto;
		final JPanel jPanelAccionesFormularioParametroTesoreriaDefecto=jPanelAccionesFormularioAuxiliarParametroTesoreriaDefecto;
		
		
		final JMenuBar jmenuBarParametroTesoreriaDefecto=this.jmenuBarParametroTesoreriaDefecto;		
		final JToolBar jTtoolBarParametroTesoreriaDefecto=this.jTtoolBarParametroTesoreriaDefecto;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroTesoreriaDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jmenuBarDetalleParametroTesoreriaDefecto;
			jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTtoolBarDetalleParametroTesoreriaDefecto;		
		}
		
		final JMenuBar jmenuBarDetalleParametroTesoreriaDefecto=jmenuBarDetalleAuxiliarParametroTesoreriaDefecto;
		final JToolBar jTtoolBarDetalleParametroTesoreriaDefecto=jTtoolBarDetalleAuxiliarParametroTesoreriaDefecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroTesoreriaDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroTesoreriaDefecto;
			processRunnable.jTableDatos=jTableDatosParametroTesoreriaDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroTesoreriaDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroTesoreriaDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroTesoreriaDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroTesoreriaDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroTesoreriaDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroTesoreriaDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroTesoreriaDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroTesoreriaDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroTesoreriaDefecto ,jPanelParametrosReportesParametroTesoreriaDefecto, jTableDatosParametroTesoreriaDefecto,/*jScrollPanelDatosParametroTesoreriaDefecto,*/jPanelCamposParametroTesoreriaDefecto,jPanelPaginacionParametroTesoreriaDefecto, /*jScrollPanelDatosEdicionParametroTesoreriaDefecto,*/ jPanelAccionesParametroTesoreriaDefecto,jPanelAccionesFormularioParametroTesoreriaDefecto,jmenuBarParametroTesoreriaDefecto,jmenuBarDetalleParametroTesoreriaDefecto,jTtoolBarParametroTesoreriaDefecto,jTtoolBarDetalleParametroTesoreriaDefecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroTesoreriaDefecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroTesoreriaDefecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroTesoreriaDefecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroTesoreriaDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroTesoreriaDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroTesoreriaDefecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroTesoreriaDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroTesoreriaDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroTesoreriaDefecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrotesoreriadefectoConstantesFunciones.getsFinalQueryParametroTesoreriaDefecto();
		String  finalQueryPaginacionTodos=this.parametrotesoreriadefectoConstantesFunciones.getsFinalQueryParametroTesoreriaDefecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroTesoreriaDefectoConstantesFunciones.getArrayColumnasGlobalesNoParametroTesoreriaDefecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroTesoreriaDefectoConstantesFunciones.getArrayColumnasGlobalesParametroTesoreriaDefecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroTesoreriaDefectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrotesoreriadefectosEliminados= new ArrayList<ParametroTesoreriaDefecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroTesoreriaDefecto();
		
				///*ParametroTesoreriaDefectoSessionBean*/this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			
			if(this.parametrotesoreriadefectoSessionBean==null) {
				this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
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
					this.iNumeroPaginacion=ParametroTesoreriaDefectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroTesoreriaDefectoConstantesFunciones.getClassesForeignKeysOfParametroTesoreriaDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrotesoreriadefecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrotesoreriadefectosAux= new ArrayList<ParametroTesoreriaDefecto>();
			
				
			parametrotesoreriadefectoLogic.setDatosCliente(this.datosCliente);
			parametrotesoreriadefectoLogic.setDatosDeep(this.datosDeep);
			parametrotesoreriadefectoLogic.setIsConDeep(true);
			
			
			parametrotesoreriadefectoLogic.getParametroTesoreriaDefectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrotesoreriadefectoLogic.getTodosParametroTesoreriaDefectos(finalQueryGlobal,pagination);
					
					//parametrotesoreriadefectoLogic.getTodosParametroTesoreriaDefectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()==null|| parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriadefectosAux= new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectosAux= new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriadefectoLogic.getTodosParametroTesoreriaDefectos(finalQueryGlobal+"",this.pagination);												
							
							//parametrotesoreriadefectoLogic.getTodosParametroTesoreriaDefectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(new ArrayList<ParametroTesoreriaDefecto>());					
							parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().addAll(parametrotesoreriadefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectos.addAll(parametrotesoreriadefectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroTesoreriaDefecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroTesoreriaDefecto=this.idActual;
				
				} else if(this.idParametroTesoreriaDefectoActual!=null && this.idParametroTesoreriaDefectoActual!=0L) {
					idParametroTesoreriaDefecto=idParametroTesoreriaDefectoActual;
				}
				
					
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndicePorId(idParametroTesoreriaDefecto);
				
				this.parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrotesoreriadefectoLogic.getEntity(idParametroTesoreriaDefecto);
					
					//parametrotesoreriadefectoLogic.getEntityWithConnection(idParametroTesoreriaDefecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(new ArrayList<ParametroTesoreriaDefecto>());
					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().add(parametrotesoreriadefectoLogic.getParametroTesoreriaDefecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
					this.parametrotesoreriadefectos.add(parametrotesoreriadefecto);
				}
				
				if(parametrotesoreriadefectoLogic.getParametroTesoreriaDefecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()==null||parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesoreriadefectos==null|| parametrotesoreriadefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
						parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesoreriaDefectos("FK_IdEmpresa",parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesoreriaDefectos("FK_IdEmpresa",parametrotesoreriadefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(new ArrayList<ParametroTesoreriaDefecto>());
						parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().addAll(parametrotesoreriadefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectos.addAll(parametrotesoreriadefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()==null||parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesoreriadefectos==null|| parametrotesoreriadefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
						parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesoreriaDefectos("FK_IdSucursal",parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesoreriaDefectos("FK_IdSucursal",parametrotesoreriadefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(new ArrayList<ParametroTesoreriaDefecto>());
						parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().addAll(parametrotesoreriadefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectos.addAll(parametrotesoreriadefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuentaBancoGlobal")) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal(finalQueryGlobal,pagination,id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()==null||parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrotesoreriadefectos==null|| parametrotesoreriadefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
						parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectosAux=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectosAux.addAll(parametrotesoreriadefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal(finalQueryGlobal,pagination,id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroTesoreriaDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBancoGlobal(id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroTesoreriaDefectos("FK_IdTipoCuentaBancoGlobal",parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroTesoreriaDefectos("FK_IdTipoCuentaBancoGlobal",parametrotesoreriadefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(new ArrayList<ParametroTesoreriaDefecto>());
						parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().addAll(parametrotesoreriadefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectos=new ArrayList<ParametroTesoreriaDefecto>();
							parametrotesoreriadefectos.addAll(parametrotesoreriadefectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroTesoreriaDefecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroTesoreriaDefecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesoreriadefectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesoreriadefectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroTesoreriaDefecto parametrotesoreriadefecto) {
		Boolean permite=true;
		
		if(this.parametrotesoreriadefecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroTesoreriaDefectoConstantesFunciones.getOrderByListaParametroTesoreriaDefecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroTesoreriaDefectoConstantesFunciones.getOrderByListaParametroTesoreriaDefecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				if(parametrotesoreriadefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriadefectoTotales=parametrotesoreriadefecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefecto:this.parametrotesoreriadefectos) {
				if(parametrotesoreriadefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriadefectoTotales=parametrotesoreriadefecto;
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
			this.parametrotesoreriadefectoAux=new ParametroTesoreriaDefecto();
			this.parametrotesoreriadefectoAux.setsType(Constantes2.S_TOTALES);
			this.parametrotesoreriadefectoAux.setIsNew(false);
			this.parametrotesoreriadefectoAux.setIsChanged(false);
			this.parametrotesoreriadefectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroTesoreriaDefectoConstantesFunciones.TotalizarValoresFilaParametroTesoreriaDefecto(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this.parametrotesoreriadefectoAux);
				
				this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().add(this.parametrotesoreriadefectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroTesoreriaDefectoConstantesFunciones.TotalizarValoresFilaParametroTesoreriaDefecto(this.parametrotesoreriadefectos,this.parametrotesoreriadefectoAux);
				
				this.parametrotesoreriadefectos.add(this.parametrotesoreriadefectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrotesoreriadefectoTotales=new ParametroTesoreriaDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().remove(parametrotesoreriadefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrotesoreriadefectos.remove(parametrotesoreriadefectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrotesoreriadefectoTotales=new ParametroTesoreriaDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				if(parametrotesoreriadefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriadefectoTotales=parametrotesoreriadefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroTesoreriaDefectoConstantesFunciones.TotalizarValoresFilaParametroTesoreriaDefecto(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),parametrotesoreriadefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroTesoreriaDefecto parametrotesoreriadefecto:this.parametrotesoreriadefectos) {
				if(parametrotesoreriadefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrotesoreriadefectoTotales=parametrotesoreriadefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroTesoreriaDefectoConstantesFunciones.TotalizarValoresFilaParametroTesoreriaDefecto(this.parametrotesoreriadefectos,parametrotesoreriadefectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroTesoreriaDefectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriaDefectosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuentaBancoGlobal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroTesoreriaDefectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriaDefectosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal(String sFinalQuery,Long id_tipo_cuenta_banco_global)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriadefectoLogic.getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal(sFinalQuery,this.pagination,id_tipo_cuenta_banco_global);
				
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
	
	public void inicializarPermisosParametroTesoreriaDefecto() {
		this.isPermisoTodoParametroTesoreriaDefecto=false;
		this.isPermisoNuevoParametroTesoreriaDefecto=false;
		this.isPermisoActualizarParametroTesoreriaDefecto=false;
		this.isPermisoActualizarOriginalParametroTesoreriaDefecto=false;
		this.isPermisoEliminarParametroTesoreriaDefecto=false;
		this.isPermisoGuardarCambiosParametroTesoreriaDefecto=false;
		this.isPermisoConsultaParametroTesoreriaDefecto=false;
		this.isPermisoBusquedaParametroTesoreriaDefecto=false;
		this.isPermisoReporteParametroTesoreriaDefecto=false;		
		this.isPermisoOrdenParametroTesoreriaDefecto=false;		
		this.isPermisoPaginacionMedioParametroTesoreriaDefecto=false;		
		this.isPermisoPaginacionAltoParametroTesoreriaDefecto=false;
		this.isPermisoPaginacionTodoParametroTesoreriaDefecto=false;
		this.isPermisoCopiarParametroTesoreriaDefecto=false;		
		this.isPermisoVerFormParametroTesoreriaDefecto=false;		
		this.isPermisoDuplicarParametroTesoreriaDefecto=false;		
		this.isPermisoOrdenParametroTesoreriaDefecto=false;		
	}
	
	public void setPermisosUsuarioParametroTesoreriaDefecto(Boolean isPermiso) {
		this.isPermisoTodoParametroTesoreriaDefecto=isPermiso;
		this.isPermisoNuevoParametroTesoreriaDefecto=isPermiso;
		this.isPermisoActualizarParametroTesoreriaDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroTesoreriaDefecto=isPermiso;
		this.isPermisoEliminarParametroTesoreriaDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroTesoreriaDefecto=isPermiso;
		this.isPermisoConsultaParametroTesoreriaDefecto=isPermiso;
		this.isPermisoBusquedaParametroTesoreriaDefecto=isPermiso;
		this.isPermisoReporteParametroTesoreriaDefecto=isPermiso;
		this.isPermisoOrdenParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoPaginacionMedioParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoPaginacionAltoParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoPaginacionTodoParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoCopiarParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoVerFormParametroTesoreriaDefecto=isPermiso;		
		this.isPermisoDuplicarParametroTesoreriaDefecto=isPermiso;
		this.isPermisoOrdenParametroTesoreriaDefecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroTesoreriaDefecto(Boolean isPermiso) {
		//this.isPermisoTodoParametroTesoreriaDefecto=isPermiso;
		this.isPermisoNuevoParametroTesoreriaDefecto=isPermiso;
		this.isPermisoActualizarParametroTesoreriaDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroTesoreriaDefecto=isPermiso;
		this.isPermisoEliminarParametroTesoreriaDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroTesoreriaDefecto=isPermiso;
		//this.isPermisoConsultaParametroTesoreriaDefecto=isPermiso;
		//this.isPermisoBusquedaParametroTesoreriaDefecto=isPermiso;
		//this.isPermisoReporteParametroTesoreriaDefecto=isPermiso;
		//this.isPermisoOrdenParametroTesoreriaDefecto=isPermiso;		
		//this.isPermisoPaginacionMedioParametroTesoreriaDefecto=isPermiso;		
		//this.isPermisoPaginacionAltoParametroTesoreriaDefecto=isPermiso;		
		//this.isPermisoPaginacionTodoParametroTesoreriaDefecto=isPermiso;		
		//this.isPermisoCopiarParametroTesoreriaDefecto=isPermiso;		
		//this.isPermisoDuplicarParametroTesoreriaDefecto=isPermiso;
		//this.isPermisoOrdenParametroTesoreriaDefecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroTesoreriaDefectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroTesoreriaDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroTesoreriaDefecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroTesoreriaDefectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroTesoreriaDefectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroTesoreriaDefectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroTesoreriaDefectoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroTesoreriaDefecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroTesoreriaDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroTesoreriaDefecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroTesoreriaDefecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroTesoreriaDefecto=this.isPermisoActualizarParametroTesoreriaDefecto;
			this.isPermisoEliminarParametroTesoreriaDefecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroTesoreriaDefecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroTesoreriaDefecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroTesoreriaDefecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroTesoreriaDefecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroTesoreriaDefecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroTesoreriaDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroTesoreriaDefecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroTesoreriaDefecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroTesoreriaDefecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroTesoreriaDefecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroTesoreriaDefecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroTesoreriaDefecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroTesoreriaDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroTesoreriaDefecto.setToolTipText(this.jTableDatosParametroTesoreriaDefecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroTesoreriaDefecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroTesoreriaDefecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroTesoreriaDefecto() throws Exception {
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
	public void inicializarCombosForeignKeyParametroTesoreriaDefectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipocuentabancoglobalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroTesoreriaDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroTesoreriaDefectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroTesoreriaDefectoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuentaBancoGlobalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuentabancoglobalsForeignKey==null||this.tipocuentabancoglobalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGlobal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoGlobalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuentaBancoGlobalConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroTesoreriaDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoReturnGeneral=new ParametroTesoreriaDefectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrotesoreriadefectoConstantesFunciones.cargarid_empresaParametroTesoreriaDefecto)
					 || (this.esRecargarFks && this.parametrotesoreriadefectoConstantesFunciones.cargarid_empresaParametroTesoreriaDefecto)) {

					if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriadefectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametrotesoreriadefectoConstantesFunciones.cargarid_sucursalParametroTesoreriaDefecto)
					 || (this.esRecargarFks && this.parametrotesoreriadefectoConstantesFunciones.cargarid_sucursalParametroTesoreriaDefecto)) {

					if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriadefectoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoCuentaBancoGlobal="";

				if(((this.tipocuentabancoglobalsForeignKey==null||this.tipocuentabancoglobalsForeignKey.size()<=0) && this.parametrotesoreriadefectoConstantesFunciones.cargarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto)
					 || (this.esRecargarFks && this.parametrotesoreriadefectoConstantesFunciones.cargarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto)) {

					if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGlobal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuentaBancoGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoGlobalConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuentaBancoGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuentaBancoGlobal, "");
						finalQueryGlobalTipoCuentaBancoGlobal+=TipoCuentaBancoGlobalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuentaBancoGlobal=" WHERE " + ConstantesSql.ID + "="+parametrotesoreriadefectoSessionBean.getlidTipoCuentaBancoGlobalActual();
					}
				} else {
					finalQueryGlobalTipoCuentaBancoGlobal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.cargarCombosLoteForeignKeyParametroTesoreriaDefecto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoCuentaBancoGlobal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrotesoreriadefectoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametrotesoreriadefectoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoCuentaBancoGlobal.equals("NONE")) {
				this.tipocuentabancoglobalsForeignKey=parametrotesoreriadefectoReturnGeneral.gettipocuentabancoglobalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroTesoreriaDefecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrotesoreriadefectoSessionBean==null) {
				this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			}

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {

			if(!this.parametrotesoreriadefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal()) {
				TipoCuentaBancoGlobal tipocuentabancoglobal=new TipoCuentaBancoGlobal();
				TipoCuentaBancoGlobalConstantesFunciones.setTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobal,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuentabancoglobal.setId(null);

				if(!TipoCuentaBancoGlobalConstantesFunciones.ExisteEnLista(this.tipocuentabancoglobalsForeignKey,tipocuentabancoglobal,true)) {

					this.tipocuentabancoglobalsForeignKey.add(0,tipocuentabancoglobal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroTesoreriaDefecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroTesoreriaDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroTesoreriaDefecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreriaDefecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto)throws Exception {	
		try {
			
			this.setActualTipoCuentaBancoGlobalForeignKey(parametrotesoreriadefecto.getid_tipo_cuenta_banco_global(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroTesoreriaDefecto()throws Exception {	
		try {
			
			this.setActualTipoCuentaBancoGlobalForeignKey(this.parametrotesoreriadefectoConstantesFunciones.getid_tipo_cuenta_banco_global(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroTesoreriaDefecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroTesoreriaDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroTesoreriaDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroTesoreriaDefecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroTesoreriaDefecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroTesoreriaDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroTesoreriaDefecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ParametroTesoreriaDefectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean(); 
		this.parametrotesoreriadefectoConstantesFunciones=new ParametroTesoreriaDefectoConstantesFunciones(); 
		this.parametrotesoreriadefectoBean=new ParametroTesoreriaDefecto();//(this.parametrotesoreriadefectoConstantesFunciones); 		
		this.parametrotesoreriadefectoReturnGeneral=new ParametroTesoreriaDefectoParameterReturnGeneral(); 
		
		this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroTesoreriaDefecto(true);
			
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
			
			this.parametrotesoreriadefectoConstantesFunciones=new ParametroTesoreriaDefectoConstantesFunciones(); 
			this.parametrotesoreriadefectoBean=new ParametroTesoreriaDefecto();//this.parametrotesoreriadefectoConstantesFunciones); 			
			this.parametrotesoreriadefectoReturnGeneral=new ParametroTesoreriaDefectoParameterReturnGeneral(); 
		
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Tesoreria Defecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrotesoreriadefecto=new ParametroTesoreriaDefecto();
			this.parametrotesoreriadefectos = new ArrayList<ParametroTesoreriaDefecto>();
			this.parametrotesoreriadefectosAux = new ArrayList<ParametroTesoreriaDefecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic=new ParametroTesoreriaDefectoLogic();
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroTesoreriaDefecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto);	
					}
					
					if(this.jInternalFrameImportacionParametroTesoreriaDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroTesoreriaDefecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroTesoreriaDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroTesoreriaDefecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroTesoreriaDefecto);
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setVisible(false);
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto);
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroTesoreriaDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroTesoreriaDefecto);
					this.jInternalFrameImportacionParametroTesoreriaDefecto.setVisible(false);
					this.jInternalFrameImportacionParametroTesoreriaDefecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroTesoreriaDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroTesoreriaDefecto);
					this.jInternalFrameOrderByParametroTesoreriaDefecto.setVisible(false);
					this.jInternalFrameOrderByParametroTesoreriaDefecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroTesoreriaDefectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroTesoreriaDefectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrotesoreriadefectoReturnGeneral=new ParametroTesoreriaDefectoParameterReturnGeneral();
			
			this.parametrotesoreriadefectoParameterGeneral=new ParametroTesoreriaDefectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrotesoreriadefectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado(),this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado(),this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroTesoreriaDefecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroTesoreriaDefecto(false);
			
			this.setPermisosUsuarioParametroTesoreriaDefecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() && this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroTesoreriaDefectoClasesRelacionadas();
			}
			
			if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroTesoreriaDefectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroTesoreriaDefecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroTesoreriaDefecto();
			}
			
			if(!this.isPermisoBusquedaParametroTesoreriaDefecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroTesoreriaDefecto,this.isPermisoPaginacionMedioParametroTesoreriaDefecto,this.isPermisoPaginacionTodoParametroTesoreriaDefecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroTesoreriaDefectoConstantesFunciones.getTiposSeleccionarParametroTesoreriaDefecto());
				
				this.tiposColumnasSelect=ParametroTesoreriaDefectoConstantesFunciones.getTiposSeleccionarParametroTesoreriaDefecto(true);
				
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
			//if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroTesoreriaDefecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroTesoreriaDefecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroTesoreriaDefecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreriaDefecto() ;
			
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
			this.tipocuentabancoglobalLogic=new TipoCuentaBancoGlobalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrotesoreriadefectoImplementable= (ParametroTesoreriaDefectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroTesoreriaDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrotesoreriadefectoImplementableHome= (ParametroTesoreriaDefectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroTesoreriaDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrotesoreriadefectos= new ArrayList<ParametroTesoreriaDefecto>();
			this.parametrotesoreriadefectosEliminados= new ArrayList<ParametroTesoreriaDefecto>();
						
			this.isEsNuevoParametroTesoreriaDefecto=false;
			this.esParaAccionDesdeFormularioParametroTesoreriaDefecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroTesoreriaDefecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroTesoreriaDefecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroTesoreriaDefectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroTesoreriaDefecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroTesoreriaDefecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroTesoreriaDefecto();
			}
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroTesoreriaDefecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroTesoreriaDefecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroTesoreriaDefecto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroTesoreriaDefecto")) {
				iIndex=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroTesoreriaDefecto();	
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
	
	public void cargarCombosForeignKeyParametroTesoreriaDefecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroTesoreriaDefecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroTesoreriaDefecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroTesoreriaDefectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroTesoreriaDefecto();
		
		this.cargarCombosFrameForeignKeyParametroTesoreriaDefecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroTesoreriaDefecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroTesoreriaDefecto();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoCuentaBancoGlobal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuentaBancoGlobalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
				this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuentaBancoGlobal(this.tipocuentabancoglobalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroTesoreriaDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			
			if(jTableDatosParametroTesoreriaDefecto.getRowCount()>=1) {
				jTableDatosParametroTesoreriaDefecto.removeRowSelectionInterval(0, jTableDatosParametroTesoreriaDefecto.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroTesoreriaDefecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroTesoreriaDefecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(true);			
			//this.parametrotesoreriadefecto=new ParametroTesoreriaDefecto();
			//this.parametrotesoreriadefecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto() ;
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreriaDefecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrotesoreriadefecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);				
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroTesoreriaDefecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroTesoreriaDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroTesoreriaDefecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroTesoreriaDefecto.getSelectedRows().length;			
			}
			
			parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroTesoreriaDefecto--;			
				//ParametroTesoreriaDefecto parametrotesoreriadefectoAux= new ParametroTesoreriaDefecto();			
				//parametrotesoreriadefectoAux.setId(this.iIdNuevoParametroTesoreriaDefecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroTesoreriaDefecto parametrotesoreriadefectoOrigen=new ParametroTesoreriaDefecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoOrigen : parametrotesoreriadefectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrotesoreriadefectoOrigen =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrotesoreriadefectoOrigen =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroTesoreriaDefecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrotesoreriadefecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroTesoreriaDefecto(parametrotesoreriadefectoOrigen,this.parametrotesoreriadefecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().add(this.parametrotesoreriadefectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefectos.add(this.parametrotesoreriadefectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
				
				this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreriaDefecto(), this.getIndiceNuevoParametroTesoreriaDefecto());
				
				int iLastRow =  this.jTableDatosParametroTesoreriaDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroTesoreriaDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroTesoreriaDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();									
		
			ParametroTesoreriaDefecto parametrotesoreriadefectoOrigen=new ParametroTesoreriaDefecto();
			ParametroTesoreriaDefecto parametrotesoreriadefectoDestino=new ParametroTesoreriaDefecto();
				
			parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroTesoreriaDefecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrotesoreriadefectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroTesoreriaDefecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoOrigen =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrotesoreriadefectoOrigen =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrotesoreriadefectoDestino =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrotesoreriadefectoDestino =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrotesoreriadefectoOrigen =parametrotesoreriadefectosSeleccionados.get(0);
				parametrotesoreriadefectoDestino =parametrotesoreriadefectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroTesoreriaDefecto(parametrotesoreriadefectoOrigen,parametrotesoreriadefectoDestino,true,false);
				
				parametrotesoreriadefectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrotesoreriadefectoDestino,parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrotesoreriadefectoDestino,parametrotesoreriadefectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
				
				//this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreriaDefecto(), this.getIndiceNuevoParametroTesoreriaDefecto());
				
				int iLastRow =  this.jTableDatosParametroTesoreriaDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroTesoreriaDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroTesoreriaDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroTesoreriaDefecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(!isVisible);
			this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(!isVisible);
			this.jPanelAccionesParametroTesoreriaDefecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroTesoreriaDefecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroTesoreriaDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroTesoreriaDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroTesoreriaDefecto();
			
			this.abrirFrameOrderByParametroTesoreriaDefecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroTesoreriaDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroTesoreriaDefecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroTesoreriaDefecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.isMaximum()) {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSize(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.iWidthFormulario,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroTesoreriaDefecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroTesoreriaDefecto.isMaximum()) {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jContentPaneDetalleParametroTesoreriaDefecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jContentPaneDetalleParametroTesoreriaDefecto.getWidth(),ParametroTesoreriaDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jContentPaneDetalleParametroTesoreriaDefecto.getWidth(),ParametroTesoreriaDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jContentPaneDetalleParametroTesoreriaDefecto.getWidth(),ParametroTesoreriaDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setVisible(true);
	        this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroTesoreriaDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroTesoreriaDefecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroTesoreriaDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreriaDefecto,false,this);
				} else {
					this.jInternalFrameOrderByParametroTesoreriaDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreriaDefecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroTesoreriaDefecto);
				this.jInternalFrameOrderByParametroTesoreriaDefecto.setVisible(false);
				this.jInternalFrameOrderByParametroTesoreriaDefecto.setSelected(false);
				
				this.jInternalFrameOrderByParametroTesoreriaDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroTesoreriaDefecto"));
				
				this.inicializarActualizarBindingTablaOrderByParametroTesoreriaDefecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroTesoreriaDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroTesoreriaDefecto==null) {
				
				this.jInternalFrameImportacionParametroTesoreriaDefecto=new ImportacionJInternalFrame(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroTesoreriaDefecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroTesoreriaDefecto);
				this.jInternalFrameImportacionParametroTesoreriaDefecto.setVisible(false);
				this.jInternalFrameImportacionParametroTesoreriaDefecto.setSelected(false);


				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroTesoreriaDefecto"));
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroTesoreriaDefecto"));
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroTesoreriaDefecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroTesoreriaDefecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto==null) {
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto=new ReporteDinamicoJInternalFrame(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto);
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreriaDefecto"));
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreriaDefecto"));
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreriaDefecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreriaDefecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroTesoreriaDefecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroTesoreriaDefecto);
			
	       	this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setVisible(false);
	        this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroTesoreriaDefecto.dispose();
			//this.jInternalFrameDetalleFormParametroTesoreriaDefecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroTesoreriaDefecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroTesoreriaDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroTesoreriaDefecto.setVisible(true);
	        this.jInternalFrameImportacionParametroTesoreriaDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroTesoreriaDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setVisible(true);
	        this.jInternalFrameOrderByParametroTesoreriaDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroTesoreriaDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setVisible(false);
	        this.jInternalFrameOrderByParametroTesoreriaDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroTesoreriaDefecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroTesoreriaDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroTesoreriaDefecto.setVisible(false);
	        this.jInternalFrameImportacionParametroTesoreriaDefecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroTesoreriaDefecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroTesoreriaDefecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(true);
			//this.isEsNuevoParametroTesoreriaDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false) ;
			
			if(parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreriaDefecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroTesoreriaDefectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroTesoreriaDefecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(true);
			//this.isEsNuevoParametroTesoreriaDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrotesoreriadefecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false) ;
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroTesoreriaDefecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoCuentaBancoGlobal(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsForeignKey)throws Exception{
		TableColumn tableColumnTipoCuentaBancoGlobal=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL));
		TableCellEditor tableCellEditorTipoCuentaBancoGlobal =tableColumnTipoCuentaBancoGlobal.getCellEditor();

		TipoCuentaBancoGlobalTableCell tipocuentabancoglobalTableCellFk=(TipoCuentaBancoGlobalTableCell)tableCellEditorTipoCuentaBancoGlobal;

		if(tipocuentabancoglobalTableCellFk!=null) {
			tipocuentabancoglobalTableCellFk.settipocuentabancoglobalsForeignKey(tipocuentabancoglobalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuentabancoglobalTableCellFk.setRowActual(intSelectedRow);
			//tipocuentabancoglobalTableCellFk.settipocuentabancoglobalsForeignKeyActual(tipocuentabancoglobalsForeignKey);
		//}


		if(tipocuentabancoglobalTableCellFk!=null) {
			tipocuentabancoglobalTableCellFk.RecargarTipoCuentaBancoGlobalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroTesoreriaDefecto(false);
			
			//if(!this.isEsNuevoParametroTesoreriaDefecto) {								
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				
			}
			
			if(this.permiteMantenimiento(this.parametrotesoreriadefecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroTesoreriaDefecto=true;
					this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
					this.isEsNuevoParametroTesoreriaDefecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroTesoreriaDefecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroTesoreriaDefecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(false);
			
												
				
				if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroTesoreriaDefecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,parametrotesoreriadefectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrotesoreriadefecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrotesoreriadefecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrotesoreriadefecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrotesoreriadefecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroTesoreriaDefectoModel) this.jTableDatosParametroTesoreriaDefecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroTesoreriaDefecto=true;
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
				this.isEsNuevoParametroTesoreriaDefecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(false);
				
				
				
				if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroTesoreriaDefecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroTesoreriaDefecto.getRowCount()>=1) {
				jTableDatosParametroTesoreriaDefecto.removeRowSelectionInterval(0, jTableDatosParametroTesoreriaDefecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroTesoreriaDefecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(false) ;
			
			this.isEsNuevoParametroTesoreriaDefecto=false;
			
			if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroTesoreriaDefecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
				
				//SI ES MANUAL
				if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroTesoreriaDefecto--;			
			//ParametroTesoreriaDefecto parametrotesoreriadefectoAux= new ParametroTesoreriaDefecto();			
			//parametrotesoreriadefectoAux.setId(this.iIdNuevoParametroTesoreriaDefecto);
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroTesoreriaDefecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
			
			this.parametrotesoreriadefecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().add(this.parametrotesoreriadefectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrotesoreriadefectos.add(this.parametrotesoreriadefectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			
			this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroTesoreriaDefecto(), this.getIndiceNuevoParametroTesoreriaDefecto());
			
			int iLastRow =  this.jTableDatosParametroTesoreriaDefecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroTesoreriaDefecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroTesoreriaDefecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();
			}
			
			//this.abrirFrameTreeParametroTesoreriaDefecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro Tesoreria DefectoS ?", "MANTENIMIENTO DE Parametro Tesoreria Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroTesoreriaDefecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroTesoreriaDefecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.procesarImportacionParametroTesoreriaDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrotesoreriadefectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroTesoreriaDefectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroTesoreriaDefecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroTesoreriaDefecto.setFileImportacion(this.jInternalFrameImportacionParametroTesoreriaDefecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroTesoreriaDefecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroTesoreriaDefecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		

		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroTesoreriaDefectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroTesoreriaDefectoBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuentaBancoGlobal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuentaBancoGlobal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuentaBancoGlobal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuentaBancoGlobal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoria="id_tipo_cuenta_banco_global";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					sNombreCampoCategoriaValor="id_tipo_cuenta_banco_global";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_cuenta_banco_global");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroTesoreriaDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreriadefecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreriadefecto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
					iRow++;

					for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroTesoreriaDefecto(row);				
			//	iRow++;
			//}				
			
			//for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroTesoreriaDefecto(parametrotesoreriadefectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
			
			//SI ES MANUAL
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroTesoreriaDefecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroTesoreriaDefecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroTesoreriaDefecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroTesoreriaDefecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroTesoreriaDefecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroTesoreriaDefecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroTesoreriaDefecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroTesoreriaDefecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroTesoreriaDefecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroTesoreriaDefecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroTesoreriaDefecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroTesoreriaDefecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroTesoreriaDefecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreriaDefecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroTesoreriaDefecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroTesoreriaDefecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroTesoreriaDefecto();
		
		this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroTesoreriaDefecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreriaDefecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreriaDefecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreriaDefecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroTesoreriaDefecto(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroTesoreriaDefecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroTesoreriaDefecto() throws Exception {
		try	{
			if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroTesoreriaDefecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroTesoreriaDefecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroTesoreriaDefecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroTesoreriaDefecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.addItem(reporte);
			}
			
			
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroTesoreriaDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreriaDefecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroTesoreriaDefecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroTesoreriaDefecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.getSelectedItem()!=null){this.id_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal=((TipoCuentaBancoGlobal)this.jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroTesoreriaDefecto(Boolean esInicializar) throws Exception {				
		if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroTesoreriaDefecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroTesoreriaDefecto() throws Exception {
		this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroTesoreriaDefecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroTesoreriaDefectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroTesoreriaDefecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrotesoreriadefectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroTesoreriaDefecto.setModel(new ParametroTesoreriaDefectoModel(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroTesoreriaDefecto.setModel(new ParametroTesoreriaDefectoModel(this.parametrotesoreriadefectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroTesoreriaDefecto!=null && this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroTesoreriaDefecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,parametrotesoreriadefectoConstantesFunciones.resaltarSeleccionarParametroTesoreriaDefecto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,parametrotesoreriadefectoConstantesFunciones.resaltarSeleccionarParametroTesoreriaDefecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID));

		if(this.parametrotesoreriadefectoConstantesFunciones.mostraridParametroTesoreriaDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrotesoreriadefectoConstantesFunciones.resaltaridParametroTesoreriaDefecto,this.parametrotesoreriadefectoConstantesFunciones.activaridParametroTesoreriaDefecto,this,true,"idParametroTesoreriaDefecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrotesoreriadefectoConstantesFunciones.resaltaridParametroTesoreriaDefecto,this.parametrotesoreriadefectoConstantesFunciones.activaridParametroTesoreriaDefecto,this,true,"idParametroTesoreriaDefecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_empresaParametroTesoreriaDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_empresaParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_empresaParametroTesoreriaDefecto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_empresaParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_empresaParametroTesoreriaDefecto,false,"id_empresaParametroTesoreriaDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_sucursalParametroTesoreriaDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_sucursalParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_sucursalParametroTesoreriaDefecto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_sucursalParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_sucursalParametroTesoreriaDefecto,false,"id_sucursalParametroTesoreriaDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL));

		if(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuentaBancoGlobalTableCell(this.tipocuentabancoglobalsForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto));
			tableColumn.setCellEditor(new TipoCuentaBancoGlobalTableCell(this.tipocuentabancoglobalsForeignKey,this.parametrotesoreriadefectoConstantesFunciones.resaltarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,this,this.parametrotesoreriadefectoConstantesFunciones.activarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,true,"id_tipo_cuenta_banco_globalParametroTesoreriaDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroTesoreriaDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroTesoreriaDefecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroTesoreriaDefecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroTesoreriaDefecto.addColumn(tableColumn);
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
			
			this.jTableDatosParametroTesoreriaDefecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroTesoreriaDefecto.moveColumn(this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroTesoreriaDefecto.moveColumn(this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroTesoreriaDefecto.moveColumn(this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroTesoreriaDefecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroTesoreriaDefecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroTesoreriaDefecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroTesoreriaDefecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroTesoreriaDefecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroTesoreriaDefecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrotesoreriadefectos.size()-1;
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
		//this.jTableDatosParametroTesoreriaDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroTesoreriaDefecto();
			
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
				
				//this.isEsNuevoParametroTesoreriaDefecto=false;
					
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
				if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroTesoreriaDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrotesoreriadefecto.getsType().equals("DUPLICADO")
				   || this.parametrotesoreriadefecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroTesoreriaDefecto=true;
				
				} else {
					this.isEsNuevoParametroTesoreriaDefecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrotesoreriadefecto.getId()>=0 && !this.parametrotesoreriadefecto.getIsNew()) {						
						this.isEsNuevoParametroTesoreriaDefecto=false;
						
					} else {
						this.isEsNuevoParametroTesoreriaDefecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroTesoreriaDefecto(esRelaciones);						
				
				this.seleccionarParametroTesoreriaDefecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrotesoreriadefecto.getId()<0) {
					this.isEsNuevoParametroTesoreriaDefecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroTesoreriaDefecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroTesoreriaDefecto(evt,rowIndex);
				}	
				
				if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroTesoreriaDefecto: " + this.dDif); 
					}
				}								
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroTesoreriaDefecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrotesoreriadefecto)) {
					if(this.parametrotesoreriadefecto.getId()>0) {
						this.parametrotesoreriadefecto.setIsDeleted(true);
						
						this.parametrotesoreriadefectosEliminados.add(this.parametrotesoreriadefecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().remove(this.parametrotesoreriadefecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefectos.remove(this.parametrotesoreriadefecto);				
					}
					
					
					((ParametroTesoreriaDefectoModel) this.jTableDatosParametroTesoreriaDefecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroTesoreriaDefecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroTesoreriaDefecto) {
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroTesoreriaDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrotesoreriadefectoConstantesFunciones.cargarid_empresaParametroTesoreriaDefecto || this.parametrotesoreriadefectoConstantesFunciones.event_dependid_empresaParametroTesoreriaDefecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrotesoreriadefecto.getid_empresa());
									//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrotesoreriadefecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrotesoreriadefecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrotesoreriadefecto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametrotesoreriadefectoConstantesFunciones.cargarid_sucursalParametroTesoreriaDefecto || this.parametrotesoreriadefectoConstantesFunciones.event_dependid_sucursalParametroTesoreriaDefecto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametrotesoreriadefecto.getid_sucursal());
									//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametrotesoreriadefecto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametrotesoreriadefecto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametrotesoreriadefecto.getid_sucursal(),false,"Formulario");

					//TipoCuentaBancoGlobal
					if(!this.parametrotesoreriadefectoConstantesFunciones.cargarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto || this.parametrotesoreriadefectoConstantesFunciones.event_dependid_tipo_cuenta_banco_globalParametroTesoreriaDefecto) {
						//this.cargarCombosTipoCuentaBancoGlobalsForeignKeyLista(" where id="+this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global());
									//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
						this.tipocuentabancoglobalsForeignKey=new ArrayList<TipoCuentaBancoGlobal>();

						if(parametrotesoreriadefecto.getTipoCuentaBancoGlobal()!=null) {
							this.tipocuentabancoglobalsForeignKey.add(parametrotesoreriadefecto.getTipoCuentaBancoGlobal());
						}

						this.addItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
						this.cargarCombosFrameTipoCuentaBancoGlobalsForeignKey("Todos");
					}
					this.setActualTipoCuentaBancoGlobalForeignKey(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroTesoreriaDefecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroTesoreriaDefecto(parametrotesoreriadefecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(parametrotesoreriadefecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroTesoreriaDefecto(parametrotesoreriadefecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreriaDefecto(parametrotesoreriadefecto);
	}
	
	public void setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setText(parametrotesoreriadefecto.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroTesoreriaDefecto parametrotesoreriadefectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrotesoreriadefectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroTesoreriaDefecto parametrotesoreriadefectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrotesoreriadefectoLocal=this.parametrotesoreriadefecto;
			} else {
				parametrotesoreriadefectoLocal=this.parametrotesoreriadefectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrotesoreriadefectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroTesoreriaDefecto(parametrotesoreriadefectoLocal,true);
					
					if(parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrotesoreriadefectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrotesoreriadefectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(parametrotesoreriadefecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(parametrotesoreriadefecto);
	}
	
	public void setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(parametrotesoreriadefecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.getText()==null || this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.getText()=="" || this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setText("0");
			}

			if(conColumnasBase) {parametrotesoreriadefecto.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelIdParametroTesoreriaDefecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefectoBean,ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrotesoreriadefectoBean.getid_tipo_cuenta_banco_global()!=null && !parametrotesoreriadefectoBean.getid_tipo_cuenta_banco_global().equals(-1L))) {parametrotesoreriadefecto.setid_tipo_cuenta_banco_global(parametrotesoreriadefectoBean.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefectoOrigen,ParametroTesoreriaDefecto parametrotesoreriadefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrotesoreriadefectoOrigen.getId()!=null && !parametrotesoreriadefectoOrigen.getId().equals(0L))) {parametrotesoreriadefecto.setId(parametrotesoreriadefectoOrigen.getId());}}
			if(conDefault || (!conDefault && parametrotesoreriadefectoOrigen.getid_tipo_cuenta_banco_global()!=null && !parametrotesoreriadefectoOrigen.getid_tipo_cuenta_banco_global().equals(-1L))) {parametrotesoreriadefecto.setid_tipo_cuenta_banco_global(parametrotesoreriadefectoOrigen.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setText(parametrotesoreriadefecto.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroTesoreriaDefecto(ParametroTesoreriaDefectoBean parametrotesoreriadefectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setText(parametrotesoreriadefectoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroTesoreriaDefecto(ParametroTesoreriaDefectoParameterReturnGeneral parametrotesoreriadefectoReturnGeneral,ParametroTesoreriaDefectoBean parametrotesoreriadefectoBean,Boolean conDefault) throws Exception { 
		try {
			ParametroTesoreriaDefecto parametrotesoreriadefectoLocal=new ParametroTesoreriaDefecto();
			
			parametrotesoreriadefectoLocal=parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrotesoreriadefectoLocal.getId()!=null && !parametrotesoreriadefectoLocal.getId().equals(0L))) {parametrotesoreriadefectoBean.setId(parametrotesoreriadefectoLocal.getId());}}
			if(conDefault || (!conDefault && parametrotesoreriadefectoLocal.getid_tipo_cuenta_banco_global()!=null && !parametrotesoreriadefectoLocal.getid_tipo_cuenta_banco_global().equals(-1L))) {parametrotesoreriadefectoBean.setid_tipo_cuenta_banco_global(parametrotesoreriadefectoLocal.getid_tipo_cuenta_banco_global());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroTesoreriaDefectoGenerico(Long idParametroTesoreriaDefectoSeleccionado,JComboBox jComboBoxParametroTesoreriaDefecto,List<ParametroTesoreriaDefecto> parametrotesoreriadefectosLocal)throws Exception {
		try {
			ParametroTesoreriaDefecto  parametrotesoreriadefectoTemp=null;

			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosLocal) {
				if(parametrotesoreriadefectoAux.getId()!=null && parametrotesoreriadefectoAux.getId().equals(idParametroTesoreriaDefectoSeleccionado)) {
					parametrotesoreriadefectoTemp=parametrotesoreriadefectoAux;
					break;
				}
			}

			jComboBoxParametroTesoreriaDefecto.setSelectedItem(parametrotesoreriadefectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroTesoreriaDefectoGenerico(JComboBox jComboBoxParametroTesoreriaDefecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroTesoreriaDefecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroTesoreriaDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroTesoreriaDefecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroTesoreriaDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreriadefecto=(ParametroTesoreriaDefecto) parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrotesoreriadefecto =(ParametroTesoreriaDefecto) parametrotesoreriadefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrotesoreriadefecto.getIsNew() && !parametrotesoreriadefecto.getIsChanged() && !parametrotesoreriadefecto.getIsDeleted()) {
				sDescripcion=parametrotesoreriadefecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreriadefecto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametrotesoreriadefecto.getIsNew() && !parametrotesoreriadefecto.getIsChanged() && !parametrotesoreriadefecto.getIsDeleted()) {
				sDescripcion=parametrotesoreriadefecto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreriadefecto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoCuentaBancoGlobal")) {
			//sDescripcion=this.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value);
			if(!parametrotesoreriadefecto.getIsNew() && !parametrotesoreriadefecto.getIsChanged() && !parametrotesoreriadefecto.getIsDeleted()) {
				sDescripcion=parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroTesoreriaDefecto parametrotesoreriadefectoRow=new ParametroTesoreriaDefecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreriadefectoRow=(ParametroTesoreriaDefecto) parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrotesoreriadefectoRow=(ParametroTesoreriaDefecto) parametrotesoreriadefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));			
			this.jButtonDuplicarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto && this.isPermisoDuplicarParametroTesoreriaDefecto));			
			this.jButtonCopiarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto && this.isPermisoCopiarParametroTesoreriaDefecto));
			this.jButtonVerFormParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto && this.isPermisoVerFormParametroTesoreriaDefecto));
			
			this.jButtonAbrirOrderByParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));			
			
			this.jButtonNuevoRelacionesParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));			
			this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaModificarParametroTesoreriaDefecto && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto && this.isPermisoEliminarParametroTesoreriaDefecto));
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto);							
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));						
			this.jButtonDuplicarToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto && this.isPermisoDuplicarParametroTesoreriaDefecto));						
			this.jButtonCopiarToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto && this.isPermisoCopiarParametroTesoreriaDefecto));			
			this.jButtonVerFormToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto && this.isPermisoVerFormParametroTesoreriaDefecto));			
			this.jButtonAbrirOrderByToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));
			this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));			
			this.jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));			
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaModificarParametroTesoreriaDefecto && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto  && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto && this.isPermisoEliminarParametroTesoreriaDefecto));
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarToolBarParametroTesoreriaDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto);				
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));			
			this.jMenuItemDuplicarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto && this.isPermisoDuplicarParametroTesoreriaDefecto));			
			this.jMenuItemCopiarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto && this.isPermisoCopiarParametroTesoreriaDefecto));			
			this.jMenuItemVerFormParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto && this.isPermisoVerFormParametroTesoreriaDefecto));			
			this.jMenuItemAbrirOrderByParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));			
			//this.jMenuItemMostrarOcultarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));
			this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));			
			//this.jMenuItemDetalleMostrarOcultarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto && this.isPermisoOrdenParametroTesoreriaDefecto));			
			this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto));			
			this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto && this.isPermisoNuevoParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));									
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemModificarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaModificarParametroTesoreriaDefecto && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemActualizarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto && this.isPermisoActualizarParametroTesoreriaDefecto));	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemEliminarParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto && this.isPermisoEliminarParametroTesoreriaDefecto));
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemCancelarParametroTesoreriaDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto);				
			}
			
			this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));						
			this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=this.jButtonNuevoParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto=this.jButtonDuplicarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto=this.jButtonCopiarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto=this.jButtonVerFormParametroTesoreriaDefecto.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroTesoreriaDefecto=this.jButtonAbrirOrderByParametroTesoreriaDefecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=this.jButtonNuevoRelacionesParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=this.jButtonModificarParametroTesoreriaDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=this.jButtonNuevoToolBarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarToolBarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarToolBarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarToolBarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarToolBarParametroTesoreriaDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=this.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=this.jMenuItemNuevoParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemModificarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemActualizarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemEliminarParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemCancelarParametroTesoreriaDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroTesoreriaDefecto(Boolean esInicializar) {
		if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroTesoreriaDefecto();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroTesoreriaDefecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroTesoreriaDefecto() {
		this.jButtonNuevoParametroTesoreriaDefecto.setVisible(this.isPermisoNuevoParametroTesoreriaDefecto);			
		this.jButtonDuplicarParametroTesoreriaDefecto.setVisible(this.isPermisoDuplicarParametroTesoreriaDefecto);			
		this.jButtonCopiarParametroTesoreriaDefecto.setVisible(this.isPermisoCopiarParametroTesoreriaDefecto);			
		this.jButtonVerFormParametroTesoreriaDefecto.setVisible(this.isPermisoVerFormParametroTesoreriaDefecto);			
		
		this.jButtonAbrirOrderByParametroTesoreriaDefecto.setVisible(this.isPermisoOrdenParametroTesoreriaDefecto);					
		
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.setVisible(this.isPermisoNuevoParametroTesoreriaDefecto);			
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarParametroTesoreriaDefecto.setVisible(this.isPermisoActualizarParametroTesoreriaDefecto);	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.setVisible(this.isPermisoActualizarParametroTesoreriaDefecto);	
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.setVisible(this.isPermisoEliminarParametroTesoreriaDefecto);
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto);						
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.setVisible(this.isPermisoGuardarCambiosParametroTesoreriaDefecto);							
		}
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setVisible(this.isPermisoActualizarParametroTesoreriaDefecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroTesoreriaDefecto() {
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarParametroTesoreriaDefecto.setVisible(this.isPermisoActualizarParametroTesoreriaDefecto);	
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.setVisible(this.isPermisoActualizarParametroTesoreriaDefecto);	
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.setVisible(this.isPermisoEliminarParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto);							
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto && this.isPermisoGuardarCambiosParametroTesoreriaDefecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroTesoreriaDefecto() {
		if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroTesoreriaDefecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroTesoreriaDefecto() {
	}
	
	public void jTableDatosParametroTesoreriaDefectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroTesoreriaDefecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroTesoreriaDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreriadefecto==null) {
						this.parametrotesoreriadefecto = new ParametroTesoreriaDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				}

				if(this.parametrotesoreriadefecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrotesoreriadefecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroTesoreriaDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroTesoreriaDefecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreriaDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrotesoreriadefectoLogic.getConnexion());

				if(this.parametrotesoreriadefecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrotesoreriadefecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreriaDefecto=(TitledBorder)this.jScrollPanelDatosParametroTesoreriaDefecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroTesoreriaDefecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroTesoreriaDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreriadefecto==null) {
						this.parametrotesoreriadefecto = new ParametroTesoreriaDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				}

				if(this.parametrotesoreriadefecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrotesoreriadefecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroTesoreriaDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroTesoreriaDefecto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreriaDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametrotesoreriadefectoLogic.getConnexion());

				if(this.parametrotesoreriadefecto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametrotesoreriadefecto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreriaDefecto=(TitledBorder)this.jScrollPanelDatosParametroTesoreriaDefecto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroTesoreriaDefecto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroTesoreriaDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreriadefecto==null) {
						this.parametrotesoreriadefecto = new ParametroTesoreriaDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				}

				if(this.parametrotesoreriadefecto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametrotesoreriadefecto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuentabancoglobal=true;

			idTienePermisotipocuentabancoglobal=this.tienePermisosUsuarioEnPaginaWebParametroTesoreriaDefecto(TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuentabancoglobal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroTesoreriaDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroTesoreriaDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);

				this.tipocuentabancoglobalBeanSwingJInternalFrame=new TipoCuentaBancoGlobalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuentabancoglobalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuentabancoglobalBeanSwingJInternalFrame.getTipoCuentaBancoGlobalLogic().setConnexion(this.parametrotesoreriadefectoLogic.getConnexion());

				if(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global()!=null) {
					this.tipocuentabancoglobalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuentabancoglobalBeanSwingJInternalFrame.setIdActual(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global());
					this.tipocuentabancoglobalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuentabancoglobalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuentabancoglobalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGlobal();
				}

				JInternalFrameBase jinternalFrame =this.tipocuentabancoglobalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroTesoreriaDefecto=(TitledBorder)this.jScrollPanelDatosParametroTesoreriaDefecto.getBorder();
				TitledBorder titledBordertipocuentabancoglobal=(TitledBorder)this.tipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();

				titledBordertipocuentabancoglobal.setTitle(titledBorderParametroTesoreriaDefecto.getTitle() + " -> Tipo Cuenta Banco Global");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.getparametrotesoreriadefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrotesoreriadefecto==null) {
						this.parametrotesoreriadefecto = new ParametroTesoreriaDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);
				}

				if(this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cuenta_banco_global = "+this.parametrotesoreriadefecto.getid_tipo_cuenta_banco_global().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);

			this.getParametroTesoreriaDefectosFK_IdEmpresa();

			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);

			//if(ParametroTesoreriaDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);

			this.getParametroTesoreriaDefectosFK_IdSucursal();

			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);

			//if(ParametroTesoreriaDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);

			this.getParametroTesoreriaDefectosFK_IdTipoCuentaBancoGlobal();

			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);

			//if(ParametroTesoreriaDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrotesoreriadefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroTesoreriaDefecto() {
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.dispose();
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
			this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.dispose();
			this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto=null;
		}
		
		if(this.jInternalFrameImportacionParametroTesoreriaDefecto!=null) {
			this.jInternalFrameImportacionParametroTesoreriaDefecto.setVisible(false);	    			
			this.jInternalFrameImportacionParametroTesoreriaDefecto.dispose();
			this.jInternalFrameImportacionParametroTesoreriaDefecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroTesoreriaDefecto();
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroTesoreriaDefecto")) {
				jButtonDuplicarParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroTesoreriaDefecto")) {
				jButtonCopiarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroTesoreriaDefecto")) {
				jButtonVerFormParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroTesoreriaDefecto")) {
				jButtonDuplicarParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroTesoreriaDefecto")) {
				jButtonDuplicarParametroTesoreriaDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroTesoreriaDefecto")) {
				jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroTesoreriaDefecto")) {
				jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroTesoreriaDefecto")) {
				jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroTesoreriaDefecto")) {
				jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroTesoreriaDefecto")) {
				jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroTesoreriaDefecto")) {
				jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroTesoreriaDefecto")) {
				jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroTesoreriaDefecto")) {
				jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroTesoreriaDefecto")) {
				jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroTesoreriaDefecto")) {
				jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroTesoreriaDefecto")) {
				jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroTesoreriaDefecto")) {
				jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroTesoreriaDefecto")) {
				jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroTesoreriaDefecto")) {
				jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroTesoreriaDefecto")) {
				jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroTesoreriaDefecto")) {
				jButtonMostrarOcultarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroTesoreriaDefecto")) {
				jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroTesoreriaDefecto")) {
				jButtonCopiarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroTesoreriaDefecto")) {
				jButtonVerFormParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroTesoreriaDefecto")) {
				jButtonCopiarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroTesoreriaDefecto")) {
				jButtonVerFormParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroTesoreriaDefecto")) {
				jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroTesoreriaDefecto")) {
				jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroTesoreriaDefecto")) {
				jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroTesoreriaDefecto")) {
				jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroTesoreriaDefecto")) {
				jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroTesoreriaDefecto")) {
				jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroTesoreriaDefecto")) {
				jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroTesoreriaDefecto")) {
				jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroTesoreriaDefecto")) {
				jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroTesoreriaDefecto") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroTesoreriaDefecto")) {
				jButtonAbrirOrderByParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroTesoreriaDefecto") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroTesoreriaDefecto")) {
				jButtonMostrarOcultarParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroTesoreriaDefecto")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroTesoreriaDefecto")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroTesoreriaDefecto")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroTesoreriaDefecto")) {
				jButtonCerrarReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroTesoreriaDefecto")) {
				jButtonGenerarReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroTesoreriaDefecto")) {
				
				jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroTesoreriaDefecto")) {
				jButtonCerrarImportacionParametroTesoreriaDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroTesoreriaDefecto")) {
				
				jButtonGenerarImportacionParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroTesoreriaDefecto")) {
				
				jButtonAbrirImportacionParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroTesoreriaDefecto")) {
				jComboBoxTiposAccionesParametroTesoreriaDefectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroTesoreriaDefecto")) {
				jComboBoxTiposRelacionesParametroTesoreriaDefectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroTesoreriaDefecto")) {
				jComboBoxTiposAccionesParametroTesoreriaDefectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroTesoreriaDefecto")) {
				
				jComboBoxTiposSeleccionarParametroTesoreriaDefectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroTesoreriaDefecto")) {
				jTextFieldValorCampoGeneralParametroTesoreriaDefectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroTesoreriaDefecto")) {
				jButtonAbrirOrderByParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroTesoreriaDefecto")) {
				jButtonAbrirOrderByParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroTesoreriaDefecto")) {
				jButtonCerrarOrderByParametroTesoreriaDefectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroTesoreriaDefectoBusqueda")) {
				this.jButtonidParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_empresaParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_empresaParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_sucursalParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_sucursalParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto")) {
				this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefectoActionPerformed(evt);
			}
			
			;
			
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroTesoreriaDefecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroTesoreriaDefecto parametrotesoreriadefectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrotesoreriadefectoLocal=this.parametrotesoreriadefecto;
			} else {
				parametrotesoreriadefectoLocal=this.parametrotesoreriadefectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
							
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
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
			
			


			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
								
						
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
								
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
							
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
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
			
			


			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
								
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroTesoreriaDefecto")) {
					jCheckBoxSeleccionarTodosParametroTesoreriaDefectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroTesoreriaDefecto")) {
					jCheckBoxSeleccionadosParametroTesoreriaDefectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroTesoreriaDefecto")) {
					
				}
				
				


				
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
												
				
				


				
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
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
			
			


			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrotesoreriadefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrotesoreriadefecto);
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
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
				
				


				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroTesoreriaDefecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroTesoreriaDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroTesoreriaDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrotesoreriadefectoAnterior =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroTesoreriaDefecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroTesoreriaDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroTesoreriaDefecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrotesoreriadefecto =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrotesoreriadefecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroTesoreriaDefecto")) {
				
				}
				
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroTesoreriaDefecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroTesoreriaDefecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroTesoreriaDefecto")) {
			
			}
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroTesoreriaDefecto();
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			if(sTipo.equals("NuevoParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroTesoreriaDefecto")) {
				jButtonDuplicarParametroTesoreriaDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroTesoreriaDefecto")) {
				jButtonCopiarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroTesoreriaDefecto")) {
				jButtonVerFormParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroTesoreriaDefecto")) {
				jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroTesoreriaDefecto")) {
				jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroTesoreriaDefecto")) {
				jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroTesoreriaDefecto")) {
				jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroTesoreriaDefecto")) {
				jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroTesoreriaDefecto")) {
				jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroTesoreriaDefecto")) {
				jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroTesoreriaDefecto")) {
				jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroTesoreriaDefecto")) {
				jButtonAbrirOrderByParametroTesoreriaDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroTesoreriaDefecto")) {
				jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroTesoreriaDefecto")) {
				jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroTesoreriaDefecto")) {
				jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroTesoreriaDefectoBusqueda")) {
				this.jButtonidParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_empresaParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_empresaParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_sucursalParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_sucursalParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate")) {
				this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda")) {
				this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusquedaActionPerformed(evt);
			}
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroTesoreriaDefecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroTesoreriaDefecto")) {
				closingInternalFrameParametroTesoreriaDefecto();
				
			} else if(sTipo.equals("jButtonCancelarParametroTesoreriaDefecto")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroTesoreriaDefecto = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroTesoreriaDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroTesoreriaDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroTesoreriaDefecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroTesoreriaDefectoActionPerformed(null);
			}
			
			ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrotesoreriadefecto,new Object(),this.parametrotesoreriadefectoParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroTesoreriaDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroTesoreriaDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroTesoreriaDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrotesoreriadefecto)) {
			if(!esControlTabla) {
				if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);			
				}
				
				if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.procesarEventosParametroTesoreriaDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this.parametrotesoreriadefecto,this.parametrotesoreriadefectoParameterGeneral,this.isEsNuevoParametroTesoreriaDefecto,classes);//this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral,this.parametrotesoreriadefectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroTesoreriaDefecto(classes,this.parametrotesoreriadefectoReturnGeneral,this.parametrotesoreriadefectoBean,false);
					}
						
					if(this.parametrotesoreriadefectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto());	
					}
						
					if(this.parametrotesoreriadefectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto(),classes);//this.parametrotesoreriadefectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroTesoreriaDefecto(this.parametrotesoreriadefecto,classes);//this.parametrotesoreriadefectoBean);									
				}
			
				if(ParametroTesoreriaDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroTesoreriaDefecto(this.parametrotesoreriadefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroTesoreriaDefecto(this.parametrotesoreriadefecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrotesoreriadefectoAnterior!=null) {
						this.parametrotesoreriadefecto=this.parametrotesoreriadefectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.procesarEventosParametroTesoreriaDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this.parametrotesoreriadefecto,this.parametrotesoreriadefectoParameterGeneral,this.isEsNuevoParametroTesoreriaDefecto,classes);//this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto(),parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto(),this.parametrotesoreriadefectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroTesoreriaDefecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroTesoreriaDefecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroTesoreriaDefecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroTesoreriaDefecto() throws Exception {
		
		ParametroTesoreriaDefectoModel parametrotesoreriadefectoModel=(ParametroTesoreriaDefectoModel)this.jTableDatosParametroTesoreriaDefecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrotesoreriadefectoModel.parametrotesoreriadefectos=this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrotesoreriadefectoModel.parametrotesoreriadefectos=this.parametrotesoreriadefectos;
		}
		
		
		((ParametroTesoreriaDefectoModel) this.jTableDatosParametroTesoreriaDefecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroTesoreriaDefecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrotesoreriadefectoAnterior(),this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrotesoreriadefectoAnterior(),this.parametrotesoreriadefectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroTesoreriaDefecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
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
										
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriadefecto,new Object(),generalEntityParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroTesoreriaDefectoConstantesFunciones.getClassesRelationshipsOfParametroTesoreriaDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroTesoreriaDefectoConstantesFunciones.getClassesRelationshipsFromStringsOfParametroTesoreriaDefecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroTesoreriaDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrotesoreriadefecto,new Object(),generalEntityParameterGeneral,this.parametrotesoreriadefectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroTesoreriaDefecto(ParametroTesoreriaDefectoBean parametrotesoreriadefectoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroTesoreriaDefecto(ArrayList<Classe> classes,ParametroTesoreriaDefectoReturnGeneral parametrotesoreriadefectoReturnGeneral,ParametroTesoreriaDefectoBean parametrotesoreriadefectoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrotesoreriadefecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto = new ParametroTesoreriaDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setVisible(false);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.parametrotesoreriadefectoLogic=this.parametrotesoreriadefectoLogic;
		
		this.cargarCombosFrameForeignKeyParametroTesoreriaDefecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroTesoreriaDefecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroTesoreriaDefecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroTesoreriaDefecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroTesoreriaDefecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroTesoreriaDefecto"));
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroTesoreriaDefecto"));

		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroTesoreriaDefecto"));
					
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemModificarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroTesoreriaDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroTesoreriaDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroTesoreriaDefecto"));
						
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemActualizarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroTesoreriaDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroTesoreriaDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroTesoreriaDefecto"));
								
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemEliminarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroTesoreriaDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroTesoreriaDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroTesoreriaDefecto"));
					
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemCancelarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroTesoreriaDefecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemDetalleCerrarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroTesoreriaDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreriaDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreriaDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroTesoreriaDefecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonidParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroTesoreriaDefecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroTesoreriaDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroTesoreriaDefecto"));
		}
		
		this.jTableDatosParametroTesoreriaDefecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroTesoreriaDefecto"));
		
		this.jTableDatosParametroTesoreriaDefecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroTesoreriaDefecto"));
		
		this.jButtonNuevoParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"NuevoParametroTesoreriaDefecto"));
		
		this.jButtonDuplicarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"DuplicarParametroTesoreriaDefecto"));
		
		this.jButtonCopiarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"CopiarParametroTesoreriaDefecto"));
		
		this.jButtonVerFormParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"VerFormParametroTesoreriaDefecto"));
		
		
		this.jButtonNuevoToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroTesoreriaDefecto"));
			
		this.jButtonDuplicarToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemNuevoParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroTesoreriaDefecto"));
			
		this.jMenuItemDuplicarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroTesoreriaDefecto"));		
		
		
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroTesoreriaDefecto"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroTesoreriaDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroTesoreriaDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonModificarToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroTesoreriaDefecto"));
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemModificarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroTesoreriaDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroTesoreriaDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonActualizarToolBarParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroTesoreriaDefecto"));
				
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemActualizarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroTesoreriaDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroTesoreriaDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonEliminarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroTesoreriaDefecto"));
						
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemEliminarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroTesoreriaDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroTesoreriaDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonCancelarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroTesoreriaDefecto"));
			
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemCancelarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroTesoreriaDefecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroTesoreriaDefecto"));		
		
		
		this.jButtonCerrarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CerrarParametroTesoreriaDefecto"));
		
		
		this.jButtonCerrarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemCerrarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroTesoreriaDefecto"));
			
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jMenuItemDetalleCerrarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroTesoreriaDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroTesoreriaDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroTesoreriaDefecto"));
		}
		
		this.jButtonCopiarToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroTesoreriaDefecto"));
			
		this.jButtonVerFormToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroTesoreriaDefecto"));
		
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroTesoreriaDefecto"));
			
		this.jMenuItemCopiarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroTesoreriaDefecto"));		
		
		this.jMenuItemVerFormParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroTesoreriaDefecto"));		
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroTesoreriaDefecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroTesoreriaDefecto"));		
		
		
		
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroTesoreriaDefecto"));
					
		this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroTesoreriaDefecto"));
		
		this.jMenuItemRecargarInformacionParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroTesoreriaDefecto"));		
		
		
		
		this.jButtonAnterioresParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"AnterioresParametroTesoreriaDefecto"));
		
		
		this.jButtonAnterioresToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroTesoreriaDefecto"));
		
		this.jMenuItemAnterioresParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroTesoreriaDefecto"));		
		
		
		this.jButtonSiguientesParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"SiguientesParametroTesoreriaDefecto"));
		
		
		this.jButtonSiguientesToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemSiguientesParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroTesoreriaDefecto"));
			
		this.jMenuItemAbrirOrderByParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroTesoreriaDefecto"));
			
		this.jMenuItemMostrarOcultarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroTesoreriaDefecto"));
			
		this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroTesoreriaDefecto"));
			
		this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroTesoreriaDefecto"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroTesoreriaDefecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroTesoreriaDefecto"));
			
		this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroTesoreriaDefecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroTesoreriaDefecto"));

		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroTesoreriaDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroTesoreriaDefecto"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroTesoreriaDefecto"));
			
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroTesoreriaDefecto"));
					
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroTesoreriaDefecto"));
			
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroTesoreriaDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonidParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreriaDefecto"));
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreriaDefecto"));
				this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreriaDefecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroTesoreriaDefecto"));				
			//this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroTesoreriaDefecto"));
			//this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroTesoreriaDefecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroTesoreriaDefecto!=null) {
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroTesoreriaDefecto"));
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroTesoreriaDefecto"));
				this.jInternalFrameImportacionParametroTesoreriaDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroTesoreriaDefecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroTesoreriaDefecto"));
			
			this.jButtonAbrirOrderByToolBarParametroTesoreriaDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroTesoreriaDefecto"));			
			
			if(this.jInternalFrameOrderByParametroTesoreriaDefecto!=null) {
				this.jInternalFrameOrderByParametroTesoreriaDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroTesoreriaDefecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jTabbedPaneRelacionesParametroTesoreriaDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroTesoreriaDefecto"));
		
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
            		closingInternalFrameParametroTesoreriaDefecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroTesoreriaDefecto = (JInternalFrameBase)event.getSource();
	            	
	            ParametroTesoreriaDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroTesoreriaDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroTesoreriaDefecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroTesoreriaDefectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroTesoreriaDefecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroTesoreriaDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroTesoreriaDefecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroTesoreriaDefecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroTesoreriaDefectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroTesoreriaDefecto";
		inputMap = this.jButtonModificarParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroTesoreriaDefecto";
		inputMap = this.jButtonActualizarParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroTesoreriaDefecto";
		inputMap = this.jButtonEliminarParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroTesoreriaDefecto";
		inputMap = this.jButtonCancelarParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroTesoreriaDefecto";
		inputMap = this.jButtonCerrarParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroTesoreriaDefecto";
		inputMap = this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonGuardarCambiosParametroTesoreriaDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroTesoreriaDefectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroTesoreriaDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroTesoreriaDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroTesoreriaDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonidParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_empresaParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroTesoreriaDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda"));
		
		
		this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroTesoreriaDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroTesoreriaDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroTesoreriaDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroTesoreriaDefecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
					parametrotesoreriadefectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectos) {
					parametrotesoreriadefectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroTesoreriaDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
						parametrotesoreriadefectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectos) {
						parametrotesoreriadefectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroTesoreriaDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroTesoreriaDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroTesoreriaDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroTesoreriaDefecto.getSelectedRows();
			
			ParametroTesoreriaDefecto parametrotesoreriadefectoLocal=new ParametroTesoreriaDefecto();
			
			//this.seleccionarTodosParametroTesoreriaDefecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrotesoreriadefectoLocal =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrotesoreriadefectoLocal =(ParametroTesoreriaDefecto) this.parametrotesoreriadefectos.toArray()[this.jTableDatosParametroTesoreriaDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrotesoreriadefectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
						parametrotesoreriadefectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectos) {
						parametrotesoreriadefectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroTesoreriaDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroTesoreriaDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroTesoreriaDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroTesoreriaDefectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroTesoreriaDefectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroTesoreriaDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroTesoreriaDefectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroTesoreriaDefecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroTesoreriaDefecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroTesoreriaDefecto) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroTesoreriaDefecto(conSplash);
				
					this.generarReporteParametroTesoreriaDefectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroTesoreriaDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroTesoreriaDefectosSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroTesoreriaDefectosSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroTesoreriaDefecto();
				
				this.exportarParametroTesoreriaDefectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroTesoreriaDefectos();
				//this.importarParametroTesoreriaDefectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroTesoreriaDefecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroTesoreriaDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Tesoreria Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroTesoreriaDefecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroTesoreriaDefecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroTesoreriaDefecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroTesoreriaDefectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroTesoreriaDefecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroTesoreriaDefecto(conSplash);
					
						//this.actualizarParametrosGeneralParametroTesoreriaDefecto();
						
						this.generarReporteProcesoAccionParametroTesoreriaDefectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro Tesoreria DefectoS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Tesoreria Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroTesoreriaDefecto();
				
						this.actualizarParametrosGeneralParametroTesoreriaDefecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrotesoreriadefectoReturnGeneral=parametrotesoreriadefectoLogic.procesarAccionParametroTesoreriaDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos(),this.parametrotesoreriadefectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroTesoreriaDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroTesoreriaDefecto();
					
					ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroTesoreriaDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroTesoreriaDefecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroTesoreriaDefectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroTesoreriaDefecto();
			
			if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
			ParametroTesoreriaDefecto parametrotesoreriadefecto=new ParametroTesoreriaDefecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.getSelectedItem();
			
			
			
			
			parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrotesoreriadefectosSeleccionados.size()==1) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
					parametrotesoreriadefecto=parametrotesoreriadefectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroTesoreriaDefecto();
			
      		//this.finishProcessParametroTesoreriaDefecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroTesoreriaDefectoReturnGeneral() throws Exception {
		if(this.parametrotesoreriadefectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrotesoreriadefectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrotesoreriadefectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrotesoreriadefectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrotesoreriadefectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrotesoreriadefectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
		}
		
		if(this.parametrotesoreriadefectoReturnGeneral.getConRetornoLista() || this.parametrotesoreriadefectoReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrotesoreriadefectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrotesoreriadefectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrotesoreriadefectoLogic.setParametroTesoreriaDefecto(this.parametrotesoreriadefectoReturnGeneral.getParametroTesoreriaDefecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroTesoreriaDefecto(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroTesoreriaDefecto() throws Exception {
		
		
	}
	
	public ArrayList<ParametroTesoreriaDefecto> getParametroTesoreriaDefectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroTesoreriaDefecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos()) {
					if(parametrotesoreriadefectoAux.getIsSelected()) {
						parametrotesoreriadefectosSeleccionados.add(parametrotesoreriadefectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:this.parametrotesoreriadefectos) {
					if(parametrotesoreriadefectoAux.getIsSelected()) {
						parametrotesoreriadefectosSeleccionados.add(parametrotesoreriadefectoAux);				
					}
				}
			}
			
			if(parametrotesoreriadefectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrotesoreriadefectosSeleccionados.addAll(this.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrotesoreriadefectosSeleccionados.addAll(this.parametrotesoreriadefectos);				
					}
				}
			}
		} else {
			parametrotesoreriadefectosSeleccionados.add(this.parametrotesoreriadefecto);
		}
		
		return parametrotesoreriadefectosSeleccionados;
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
	
	public void generarReporteParametroTesoreriaDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroTesoreriaDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroTesoreriaDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroTesoreriaDefectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroTesoreriaDefectosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Tesoreria Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroTesoreriaDefectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroTesoreriaDefecto();
		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroTesoreriaDefecto();
		
		
		//this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados ,parametrotesoreriadefectoImplementable,parametrotesoreriadefectoImplementableHome);
	}
	
	public void mostrarImportacionParametroTesoreriaDefectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroTesoreriaDefecto();
		
		this.abrirFrameImportacionParametroTesoreriaDefecto();		
		
			
		//this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados ,parametrotesoreriadefectoImplementable,parametrotesoreriadefectoImplementableHome);
	}
	
	public void importarParametroTesoreriaDefectos() throws Exception {		
	
	}
	
	public void exportarParametroTesoreriaDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroTesoreriaDefectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroTesoreriaDefectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroTesoreriaDefectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Tesoreria Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroTesoreriaDefecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroTesoreriaDefecto(parametrotesoreriadefectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrotesoreriadefectoAux.setsDetalleGeneralEntityReporte(parametrotesoreriadefectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroTesoreriaDefecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaDefectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrotesoreriadefecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreriadefecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreriadefecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreriadefecto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroTesoreriaDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroTesoreriaDefecto(row);				
				iRow++;
			}				
			
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroTesoreriaDefecto(parametrotesoreriadefectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroTesoreriaDefectosSeleccionados() throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();		
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrotesoreriadefecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrotesoreriadefectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrotesoreriadefecto");
			//elementRoot.appendChild(element);
		
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
				element = document.createElement("parametrotesoreriadefecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroTesoreriaDefecto(parametrotesoreriadefectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Tesoreria Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroTesoreriaDefecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreriadefecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreriadefecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreriadefecto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroTesoreriaDefecto(ParametroTesoreriaDefecto parametrotesoreriadefecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroTesoreriaDefectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrotesoreriadefecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroTesoreriaDefectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrotesoreriadefecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroTesoreriaDefectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrotesoreriadefecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroTesoreriaDefectoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametrotesoreriadefecto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipocuentabancoglobal_descripcion = document.createElement(ParametroTesoreriaDefectoConstantesFunciones.IDTIPOCUENTABANCOGLOBAL);
		elementtipocuentabancoglobal_descripcion.appendChild(document.createTextNode(parametrotesoreriadefecto.gettipocuentabancoglobal_descripcion()));
		element.appendChild(elementtipocuentabancoglobal_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroTesoreriaDefectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados=new ArrayList<ParametroTesoreriaDefecto>();
		
		parametrotesoreriadefectosSeleccionados=this.getParametroTesoreriaDefectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroTesoreriaDefecto(parametrotesoreriadefectosSeleccionados);
		
		this.generarReporteParametroTesoreriaDefectos("Todos",parametrotesoreriadefectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroTesoreriaDefecto(ArrayList<ParametroTesoreriaDefecto> parametrotesoreriadefectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroTesoreriaDefecto parametrotesoreriadefectoAux:parametrotesoreriadefectosSeleccionados) {
				parametrotesoreriadefectoAux.setsDetalleGeneralEntityReporte(parametrotesoreriadefectoAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrotesoreriadefectoAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriadefectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametrotesoreriadefectoAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriadefectoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL)) {
					existe=true;
					parametrotesoreriadefectoAux.setsDescripcionGeneralEntityReporte1(parametrotesoreriadefectoAux.gettipocuentabancoglobal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroTesoreriaDefecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=true;
				this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=true;
			}
			
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaModificarParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaCancelarParametroTesoreriaDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroTesoreriaDefecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=true;
		} else {
			this.actualizarEstadoPanelsParametroTesoreriaDefecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroTesoreriaDefecto=false;
			//this.isVisibilidadCeldaVerFormParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroTesoreriaDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroTesoreriaDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			if(!parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;												
			}
			
			this.jButtonCerrarParametroTesoreriaDefecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroTesoreriaDefecto=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrotesoreriadefecto)) {
			this.isVisibilidadCeldaActualizarParametroTesoreriaDefecto=false;
			this.isVisibilidadCeldaEliminarParametroTesoreriaDefecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroTesoreriaDefecto() {
	}
	
	public void actualizarEstadoPanelsParametroTesoreriaDefecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroTesoreriaDefecto!=null) {
				this.jScrollPanelDatosParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroTesoreriaDefecto!=null) {
				this.jPanelPaginacionParametroTesoreriaDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
					this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto!=null) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroTesoreriaDefecto!=null) {
				this.jPanelParametrosReportesParametroTesoreriaDefecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasParametroTesoreriaDefecto.remove(jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasParametroTesoreriaDefecto.remove(jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuentaBancoGlobal(Boolean isParaTipoCuentaBancoGlobal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuentaBancoGlobalNegation=!isParaTipoCuentaBancoGlobal;

			this.isVisibilidadFK_IdTipoCuentaBancoGlobal=isParaTipoCuentaBancoGlobal;
			if(!this.isVisibilidadFK_IdTipoCuentaBancoGlobal) {this.jTabbedPaneBusquedasParametroTesoreriaDefecto.remove(jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		
		if(this.parametrotesoreriadefectoSessionBean==null) {
			this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		}
		
		this.parametrotesoreriadefectoSessionBean.setsUltimaBusquedaParametroTesoreriaDefecto(this.getsAccionBusqueda());
		this.parametrotesoreriadefectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrotesoreriadefectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrotesoreriadefectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametrotesoreriadefectoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBancoGlobal")) {
			parametrotesoreriadefectoSessionBean.setid_tipo_cuenta_banco_global(this.getid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		
		if(this.parametrotesoreriadefectoSessionBean==null) {
			this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		}
		
		if(this.parametrotesoreriadefectoSessionBean.getsUltimaBusquedaParametroTesoreriaDefecto()!=null&&!this.parametrotesoreriadefectoSessionBean.getsUltimaBusquedaParametroTesoreriaDefecto().equals("")) {
			this.setsAccionBusqueda(parametrotesoreriadefectoSessionBean.getsUltimaBusquedaParametroTesoreriaDefecto());
			this.setiNumeroPaginacion(parametrotesoreriadefectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrotesoreriadefectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrotesoreriadefectoSessionBean.getid_empresa());
				parametrotesoreriadefectoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametrotesoreriadefectoSessionBean.getid_sucursal());
				parametrotesoreriadefectoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBancoGlobal")) {
				this.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(parametrotesoreriadefectoSessionBean.getid_tipo_cuenta_banco_global());
				parametrotesoreriadefectoSessionBean.setid_tipo_cuenta_banco_global(-1L);
			}
		}
		
		this.parametrotesoreriadefectoSessionBean.setsUltimaBusquedaParametroTesoreriaDefecto("");
		this.parametrotesoreriadefectoSessionBean.setiNumeroPaginacion(ParametroTesoreriaDefectoConstantesFunciones.INUMEROPAGINACION);
		this.parametrotesoreriadefectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroTesoreriaDefecto() {
		this.updateBorderResaltarBusquedasFormularioParametroTesoreriaDefecto();
		this.updateVisibilidadBusquedasFormularioParametroTesoreriaDefecto();
		this.updateHabilitarBusquedasFormularioParametroTesoreriaDefecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroTesoreriaDefecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponents().length>0) {
	

		if(this.parametrotesoreriadefectoConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroTesoreriaDefecto.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponent(index);
				jPanel.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroTesoreriaDefecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroTesoreriaDefecto.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			if(!this.parametrotesoreriadefectoConstantesFunciones.mostrarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroTesoreriaDefecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroTesoreriaDefecto.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrotesoreriadefectoConstantesFunciones.activarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
				this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setEnabledAt(index,this.parametrotesoreriadefectoConstantesFunciones.activarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroTesoreriaDefecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoCuentaBancoGlobal")) {
			index= this.jTabbedPaneBusquedasParametroTesoreriaDefecto.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);

			this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroTesoreriaDefecto.getComponent(index);

			this.parametrotesoreriadefectoConstantesFunciones.setResaltarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto(resaltar);

			jPanel.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltarFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroTesoreriaDefecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroTesoreriaDefecto() throws Exception {

		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroTesoreriaDefecto();
		this.updateVisibilidadResaltarControlesFormularioParametroTesoreriaDefecto();
		this.updateHabilitarResaltarControlesFormularioParametroTesoreriaDefecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroTesoreriaDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrotesoreriadefectoConstantesFunciones.resaltaridParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltaridParametroTesoreriaDefecto);}
		if(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_empresaParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_empresaParametroTesoreriaDefecto);}
		if(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_sucursalParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_sucursalParametroTesoreriaDefecto);}
		if(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto!=null && this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setBorder(this.parametrotesoreriadefectoConstantesFunciones.resaltarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroTesoreriaDefecto() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
	
		//this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostraridParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelidParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostraridParametroTesoreriaDefecto);
		//this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_empresaParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelid_empresaParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_empresaParametroTesoreriaDefecto);
		//this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_sucursalParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelid_sucursalParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_sucursalParametroTesoreriaDefecto);
		//this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setVisible(this.parametrotesoreriadefectoConstantesFunciones.mostrarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroTesoreriaDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroTesoreriaDefecto!=null) {
	
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jLabelidParametroTesoreriaDefecto.setEnabled(this.parametrotesoreriadefectoConstantesFunciones.activaridParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_empresaParametroTesoreriaDefecto.setEnabled(this.parametrotesoreriadefectoConstantesFunciones.activarid_empresaParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_sucursalParametroTesoreriaDefecto.setEnabled(this.parametrotesoreriadefectoConstantesFunciones.activarid_sucursalParametroTesoreriaDefecto);
		this.jInternalFrameDetalleFormParametroTesoreriaDefecto.jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setEnabled(this.parametrotesoreriadefectoConstantesFunciones.activarid_tipo_cuenta_banco_globalParametroTesoreriaDefecto);
		}
	}
	
		
}