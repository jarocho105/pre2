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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TransaccionIngresoEgresoConstantesFunciones;
import com.bydan.erp.inventario.util.TransaccionIngresoEgresoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TransaccionIngresoEgresoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TransaccionIngresoEgresoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransaccionIngresoEgresoBeanSwingJInternalFrame extends TransaccionIngresoEgresoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransaccionIngresoEgresoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransaccionIngresoEgreso> transaccioningresoegresoValidator = new ClassValidator<TransaccionIngresoEgreso>(TransaccionIngresoEgreso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransaccionIngresoEgreso transaccioningresoegreso;	
	public TransaccionIngresoEgreso transaccioningresoegresoAux;
	public TransaccionIngresoEgreso transaccioningresoegresoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransaccionIngresoEgreso transaccioningresoegresoTotales;
	public Long idTransaccionIngresoEgresoActual;
	public Long iIdNuevoTransaccionIngresoEgreso=0L;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
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
	
	public Boolean isPermisoTodoTransaccionIngresoEgreso;
	public Boolean isPermisoNuevoTransaccionIngresoEgreso;
	public Boolean isPermisoActualizarTransaccionIngresoEgreso;
	public Boolean isPermisoActualizarOriginalTransaccionIngresoEgreso;
	public Boolean isPermisoEliminarTransaccionIngresoEgreso;
	public Boolean isPermisoGuardarCambiosTransaccionIngresoEgreso;
	public Boolean isPermisoConsultaTransaccionIngresoEgreso;
	public Boolean isPermisoBusquedaTransaccionIngresoEgreso;
	public Boolean isPermisoReporteTransaccionIngresoEgreso;
	public Boolean isPermisoPaginacionMedioTransaccionIngresoEgreso;
	public Boolean isPermisoPaginacionAltoTransaccionIngresoEgreso;
	public Boolean isPermisoPaginacionTodoTransaccionIngresoEgreso;
	public Boolean isPermisoCopiarTransaccionIngresoEgreso;
	public Boolean isPermisoVerFormTransaccionIngresoEgreso;
	public Boolean isPermisoDuplicarTransaccionIngresoEgreso;
	public Boolean isPermisoOrdenTransaccionIngresoEgreso;
	
	
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
	
	public TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoReturnGeneral;
	public TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransaccionIngresoEgreso=false;
	public Boolean esParaAccionDesdeFormularioTransaccionIngresoEgreso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransaccionIngresoEgresoSessionBeanAdditional transaccioningresoegresoSessionBeanAdditional=null;
	
	public TransaccionIngresoEgresoSessionBeanAdditional getTransaccionIngresoEgresoSessionBeanAdditional() {
		return this.transaccioningresoegresoSessionBeanAdditional;
	}
	
	public void setTransaccionIngresoEgresoSessionBeanAdditional(TransaccionIngresoEgresoSessionBeanAdditional transaccioningresoegresoSessionBeanAdditional) {
		try {
			this.transaccioningresoegresoSessionBeanAdditional=transaccioningresoegresoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional transaccioningresoegresoBeanSwingJInternalFrameAdditional=null;
	//public class TransaccionIngresoEgresoBeanSwingJInternalFrame
	
	public TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional getTransaccionIngresoEgresoBeanSwingJInternalFrameAdditional() {
		return this.transaccioningresoegresoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransaccionIngresoEgresoBeanSwingJInternalFrameAdditional(TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional transaccioningresoegresoBeanSwingJInternalFrameAdditional) {
		try {
			this.transaccioningresoegresoBeanSwingJInternalFrameAdditional=transaccioningresoegresoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransaccionIngresoEgresoLogic transaccioningresoegresoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransaccionIngresoEgreso transaccioningresoegresoBean;
	public TransaccionIngresoEgresoConstantesFunciones transaccioningresoegresoConstantesFunciones;
	//public TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TransaccionLogic transaccionLogic;
	
	//PARAMETROS
	
	
	//public List<TransaccionIngresoEgreso> transaccioningresoegresos;	
	//public List<TransaccionIngresoEgreso> transaccioningresoegresosEliminados;
	//public List<TransaccionIngresoEgreso> transaccioningresoegresosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaDuplicarTransaccionIngresoEgreso=true;
	public Boolean isVisibilidadCeldaCopiarTransaccionIngresoEgreso=true;
	public Boolean isVisibilidadCeldaVerFormTransaccionIngresoEgreso=true;
	public Boolean isVisibilidadCeldaOrdenTransaccionIngresoEgreso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaCancelarTransaccionIngresoEgreso=false;
	public Boolean isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoTransaccionIngresoEgreso() {
		return this.iIdNuevoTransaccionIngresoEgreso;
	}

	public void setiIdNuevoTransaccionIngresoEgreso(Long iIdNuevoTransaccionIngresoEgreso) {
		this.iIdNuevoTransaccionIngresoEgreso = iIdNuevoTransaccionIngresoEgreso;
	}
	
	public Long getidTransaccionIngresoEgresoActual() {
		return this.idTransaccionIngresoEgresoActual;
	}

	public void setidTransaccionIngresoEgresoActual(Long idTransaccionIngresoEgresoActual) {
		this.idTransaccionIngresoEgresoActual = idTransaccionIngresoEgresoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransaccionIngresoEgreso gettransaccioningresoegreso() {
		return this.transaccioningresoegreso;
	}

	public void settransaccioningresoegreso(TransaccionIngresoEgreso transaccioningresoegreso) {
		this.transaccioningresoegreso = transaccioningresoegreso;
	}
	
	public TransaccionIngresoEgreso gettransaccioningresoegresoAux() {
		return this.transaccioningresoegresoAux;
	}

	public void settransaccioningresoegresoAux(TransaccionIngresoEgreso transaccioningresoegresoAux) {
		this.transaccioningresoegresoAux = transaccioningresoegresoAux;
	}				
	
	public TransaccionIngresoEgreso gettransaccioningresoegresoAnterior() {
		return this.transaccioningresoegresoAnterior;
	}

	public void settransaccioningresoegresoAnterior(TransaccionIngresoEgreso transaccioningresoegresoAnterior) {
		this.transaccioningresoegresoAnterior = transaccioningresoegresoAnterior;
	}	
	
	public TransaccionIngresoEgreso gettransaccioningresoegresoTotales() {
		return this.transaccioningresoegresoTotales;
	}

	public void settransaccioningresoegresoTotales(TransaccionIngresoEgreso transaccioningresoegresoTotales) {
		this.transaccioningresoegresoTotales = transaccioningresoegresoTotales;
	}	
	
	public TransaccionIngresoEgreso gettransaccioningresoegresoBean() {
		return this.transaccioningresoegresoBean;
	}

	public void settransaccioningresoegresoBean(TransaccionIngresoEgreso transaccioningresoegresoBean) {
		this.transaccioningresoegresoBean = transaccioningresoegresoBean;
	}	
	
	public TransaccionIngresoEgresoParameterReturnGeneral gettransaccioningresoegresoReturnGeneral() {
		return this.transaccioningresoegresoReturnGeneral;
	}

	public void settransaccioningresoegresoReturnGeneral(TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoReturnGeneral) {
		this.transaccioningresoegresoReturnGeneral = transaccioningresoegresoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransaccionIngresoEgresoLogic getTransaccionIngresoEgresoLogic()	{		
		return transaccioningresoegresoLogic;
	}

	public void setTransaccionIngresoEgresoLogic(TransaccionIngresoEgresoLogic transaccioningresoegresoLogic) {
		this.transaccioningresoegresoLogic = transaccioningresoegresoLogic;
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
	
	public Boolean getIsEsNuevoTransaccionIngresoEgreso() {
		return isEsNuevoTransaccionIngresoEgreso;
	}

	public void setIsEsNuevoTransaccionIngresoEgreso(Boolean isEsNuevoTransaccionIngresoEgreso) {
		this.isEsNuevoTransaccionIngresoEgreso = isEsNuevoTransaccionIngresoEgreso;
	}

	public Boolean getEsParaAccionDesdeFormularioTransaccionIngresoEgreso() {
		return esParaAccionDesdeFormularioTransaccionIngresoEgreso;
	}
	
	public void setEsParaAccionDesdeFormularioTransaccionIngresoEgreso(Boolean esParaAccionDesdeFormularioTransaccionIngresoEgreso) {
		this.esParaAccionDesdeFormularioTransaccionIngresoEgreso = esParaAccionDesdeFormularioTransaccionIngresoEgreso;
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

			if(this.transaccioningresoegresoSessionBean==null) {
				this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
			}

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transaccioningresoegresoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.transaccioningresoegresoSessionBean==null) {
				this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
			}

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(transaccioningresoegresoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transaccioningresoegresoSessionBean==null) {
				this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
			}

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transaccioningresoegresoSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

					if(this.transaccioningresoegreso!=null) {
						this.transaccioningresoegreso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransaccionIngresoEgresoGenerico)throws Exception
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
				jComboBoxid_empresaTransaccionIngresoEgresoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransaccionIngresoEgresoGenerico!=null && jComboBoxid_empresaTransaccionIngresoEgresoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransaccionIngresoEgresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.transaccioningresoegreso!=null) {
						this.transaccioningresoegreso.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTransaccionIngresoEgresoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTransaccionIngresoEgresoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTransaccionIngresoEgresoGenerico!=null && jComboBoxid_moduloTransaccionIngresoEgresoGenerico.getItemCount()>0) {
					jComboBoxid_moduloTransaccionIngresoEgresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.transaccioningresoegreso!=null) {
						this.transaccioningresoegreso.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso!=null) {
						jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso!=null) {
							//jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.getItemCount()>0) {
								jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionTransaccionIngresoEgresoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionTransaccionIngresoEgresoGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionTransaccionIngresoEgresoGenerico!=null && jComboBoxid_transaccionTransaccionIngresoEgresoGenerico.getItemCount()>0) {
					jComboBoxid_transaccionTransaccionIngresoEgresoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TransaccionIngresoEgreso transaccioningresoegreso,JComboBox jComboBoxid_empresaTransaccionIngresoEgresoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransaccionIngresoEgresoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransaccionIngresoEgresoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transaccioningresoegreso.setid_empresa(empresaAux.getId());
				transaccioningresoegreso.setempresa_descripcion(TransaccionIngresoEgresoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transaccioningresoegreso.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TransaccionIngresoEgreso transaccioningresoegreso,JComboBox jComboBoxid_moduloTransaccionIngresoEgresoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTransaccionIngresoEgresoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTransaccionIngresoEgresoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				transaccioningresoegreso.setid_modulo(moduloAux.getId());
				transaccioningresoegreso.setmodulo_descripcion(TransaccionIngresoEgresoConstantesFunciones.getModuloDescripcion(moduloAux));
				transaccioningresoegreso.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(TransaccionIngresoEgreso transaccioningresoegreso,JComboBox jComboBoxid_transaccionTransaccionIngresoEgresoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionTransaccionIngresoEgresoGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionTransaccionIngresoEgresoGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				transaccioningresoegreso.setid_transaccion(transaccionAux.getId());
				transaccioningresoegreso.settransaccion_descripcion(TransaccionIngresoEgresoConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				transaccioningresoegreso.setTransaccion(transaccionAux);			}
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

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
					}

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
					}

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { 
					}

					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.addItem(transaccion);
							}
						}

						if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransaccionIngresoEgreso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransaccionIngresoEgresoConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransaccionIngresoEgresoConstantesFunciones.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso(this.transaccioningresoegresos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Transaccion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transaccioningresoegresoLogic.setTransaccionIngresoEgresos(this.transaccioningresoegresos);
			transaccioningresoegresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TransaccionIngresoEgresoParameterReturnGeneral getTransaccionIngresoEgresoParameterGeneral() {
		return this.transaccioningresoegresoParameterGeneral;
	}
	
	public void setTransaccionIngresoEgresoParameterGeneral(TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoParameterGeneral) {
		this.transaccioningresoegresoParameterGeneral = transaccioningresoegresoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransaccionIngresoEgreso() {
		return isPermisoTodoTransaccionIngresoEgreso;
	}

	public void setIsPermisoTodoTransaccionIngresoEgreso(Boolean isPermisoTodoTransaccionIngresoEgreso) {
		this.isPermisoTodoTransaccionIngresoEgreso = isPermisoTodoTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoNuevoTransaccionIngresoEgreso() {
		return isPermisoNuevoTransaccionIngresoEgreso;
	}

	public void setIsPermisoNuevoTransaccionIngresoEgreso(Boolean isPermisoNuevoTransaccionIngresoEgreso) {
		this.isPermisoNuevoTransaccionIngresoEgreso = isPermisoNuevoTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoActualizarTransaccionIngresoEgreso() {
		return isPermisoActualizarTransaccionIngresoEgreso;
	}

	public void setIsPermisoActualizarTransaccionIngresoEgreso(Boolean isPermisoActualizarTransaccionIngresoEgreso) {
		this.isPermisoActualizarTransaccionIngresoEgreso = isPermisoActualizarTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoEliminarTransaccionIngresoEgreso() {
		return isPermisoEliminarTransaccionIngresoEgreso;
	}

	public void setIsPermisoEliminarTransaccionIngresoEgreso(Boolean isPermisoEliminarTransaccionIngresoEgreso) {
		this.isPermisoEliminarTransaccionIngresoEgreso = isPermisoEliminarTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoGuardarCambiosTransaccionIngresoEgreso() {
		return isPermisoGuardarCambiosTransaccionIngresoEgreso;
	}

	public void setIsPermisoGuardarCambiosTransaccionIngresoEgreso(Boolean isPermisoGuardarCambiosTransaccionIngresoEgreso) {
		this.isPermisoGuardarCambiosTransaccionIngresoEgreso = isPermisoGuardarCambiosTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoConsultaTransaccionIngresoEgreso() {
		return isPermisoConsultaTransaccionIngresoEgreso;
	}

	public void setIsPermisoConsultaTransaccionIngresoEgreso(Boolean isPermisoConsultaTransaccionIngresoEgreso) {
		this.isPermisoConsultaTransaccionIngresoEgreso = isPermisoConsultaTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoBusquedaTransaccionIngresoEgreso() {
		return isPermisoBusquedaTransaccionIngresoEgreso;
	}

	public void setIsPermisoBusquedaTransaccionIngresoEgreso(Boolean isPermisoBusquedaTransaccionIngresoEgreso) {
		this.isPermisoBusquedaTransaccionIngresoEgreso = isPermisoBusquedaTransaccionIngresoEgreso;
	}

	public Boolean getIsPermisoReporteTransaccionIngresoEgreso() {
		return isPermisoReporteTransaccionIngresoEgreso;
	}

	public void setIsPermisoReporteTransaccionIngresoEgreso(Boolean isPermisoReporteTransaccionIngresoEgreso) {
		this.isPermisoReporteTransaccionIngresoEgreso = isPermisoReporteTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransaccionIngresoEgreso() {
		return isPermisoPaginacionMedioTransaccionIngresoEgreso;
	}

	public void setIsPermisoPaginacionMedioTransaccionIngresoEgreso(Boolean isPermisoPaginacionMedioTransaccionIngresoEgreso) {
		this.isPermisoPaginacionMedioTransaccionIngresoEgreso = isPermisoPaginacionMedioTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransaccionIngresoEgreso() {
		return isPermisoPaginacionTodoTransaccionIngresoEgreso;
	}

	public void setIsPermisoPaginacionTodoTransaccionIngresoEgreso(Boolean isPermisoPaginacionTodoTransaccionIngresoEgreso) {
		this.isPermisoPaginacionTodoTransaccionIngresoEgreso = isPermisoPaginacionTodoTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransaccionIngresoEgreso() {
		return isPermisoPaginacionAltoTransaccionIngresoEgreso;
	}

	public void setIsPermisoPaginacionAltoTransaccionIngresoEgreso(Boolean isPermisoPaginacionAltoTransaccionIngresoEgreso) {
		this.isPermisoPaginacionAltoTransaccionIngresoEgreso = isPermisoPaginacionAltoTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoCopiarTransaccionIngresoEgreso() {
		return isPermisoCopiarTransaccionIngresoEgreso;
	}

	public void setIsPermisoCopiarTransaccionIngresoEgreso(Boolean isPermisoCopiarTransaccionIngresoEgreso) {
		this.isPermisoCopiarTransaccionIngresoEgreso = isPermisoCopiarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoVerFormTransaccionIngresoEgreso() {
		return isPermisoVerFormTransaccionIngresoEgreso;
	}

	public void setIsPermisoVerFormTransaccionIngresoEgreso(Boolean isPermisoVerFormTransaccionIngresoEgreso) {
		this.isPermisoVerFormTransaccionIngresoEgreso = isPermisoVerFormTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoDuplicarTransaccionIngresoEgreso() {
		return isPermisoDuplicarTransaccionIngresoEgreso;
	}

	public void setIsPermisoDuplicarTransaccionIngresoEgreso(Boolean isPermisoDuplicarTransaccionIngresoEgreso) {
		this.isPermisoDuplicarTransaccionIngresoEgreso = isPermisoDuplicarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsPermisoOrdenTransaccionIngresoEgreso() {
		return isPermisoOrdenTransaccionIngresoEgreso;
	}

	public void setIsPermisoOrdenTransaccionIngresoEgreso(Boolean isPermisoOrdenTransaccionIngresoEgreso) {
		this.isPermisoOrdenTransaccionIngresoEgreso = isPermisoOrdenTransaccionIngresoEgreso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransaccionIngresoEgreso() {
		return isVisibilidadCeldaNuevoTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaNuevoTransaccionIngresoEgreso(Boolean isVisibilidadCeldaNuevoTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso = isVisibilidadCeldaNuevoTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaDuplicarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaDuplicarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaDuplicarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso = isVisibilidadCeldaDuplicarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaCopiarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaCopiarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaCopiarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso = isVisibilidadCeldaCopiarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransaccionIngresoEgreso() {
		return isVisibilidadCeldaVerFormTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaVerFormTransaccionIngresoEgreso(Boolean isVisibilidadCeldaVerFormTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso = isVisibilidadCeldaVerFormTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransaccionIngresoEgreso() {
		return isVisibilidadCeldaOrdenTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaOrdenTransaccionIngresoEgreso(Boolean isVisibilidadCeldaOrdenTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso = isVisibilidadCeldaOrdenTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso() {
		return isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso(Boolean isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso = isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaModificarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaModificarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaModificarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaModificarTransaccionIngresoEgreso = isVisibilidadCeldaModificarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaActualizarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaActualizarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaActualizarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso = isVisibilidadCeldaActualizarTransaccionIngresoEgreso;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaEliminarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaEliminarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaEliminarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso = isVisibilidadCeldaEliminarTransaccionIngresoEgreso;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaCancelarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaCancelarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaCancelarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso = isVisibilidadCeldaCancelarTransaccionIngresoEgreso;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransaccionIngresoEgreso() {
		return isVisibilidadCeldaGuardarTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaGuardarTransaccionIngresoEgreso(Boolean isVisibilidadCeldaGuardarTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso = isVisibilidadCeldaGuardarTransaccionIngresoEgreso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso() {
		return isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso(Boolean isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso) {
		this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso = isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso;
	}
		
	public TransaccionIngresoEgresoSessionBean gettransaccioningresoegresoSessionBean() {
		return this.transaccioningresoegresoSessionBean;
	}
	
	public void settransaccioningresoegresoSessionBean(TransaccionIngresoEgresoSessionBean transaccioningresoegresoSessionBean) {
		this.transaccioningresoegresoSessionBean=transaccioningresoegresoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transaccioningresoegreso,null);
				this.setActualParaGuardarModuloForeignKey(transaccioningresoegreso,null);
				this.setActualParaGuardarTransaccionForeignKey(transaccioningresoegreso,null);
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
	
	public void bugActualizarReferenciaActual(TransaccionIngresoEgreso transaccioningresoegreso,TransaccionIngresoEgreso transaccioningresoegresoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransaccionIngresoEgreso(transaccioningresoegreso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transaccioningresoegresoAux.setId(transaccioningresoegreso.getId());
		transaccioningresoegresoAux.setVersionRow(transaccioningresoegreso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransaccionIngresoEgreso();
		
			int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transaccioningresoegresoValidator.getInvalidValues(this.transaccioningresoegreso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transaccioningresoegresoLogic.setDatosCliente(datosCliente);
			transaccioningresoegresoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transaccioningresoegresoAux=new  TransaccionIngresoEgreso();
				
				transaccioningresoegresoAux.setIsNew(true);
				transaccioningresoegresoAux.setIsChanged(true);
				
				transaccioningresoegresoAux.setTransaccionIngresoEgresoOriginal(this.transaccioningresoegreso);
				
				transaccioningresoegresoAux.setId(this.transaccioningresoegreso.getId());	
				transaccioningresoegresoAux.setVersionRow(this.transaccioningresoegreso.getVersionRow());	
				transaccioningresoegresoAux.setid_empresa(this.transaccioningresoegreso.getid_empresa());	
				transaccioningresoegresoAux.setid_modulo(this.transaccioningresoegreso.getid_modulo());	
				transaccioningresoegresoAux.setid_transaccion(this.transaccioningresoegreso.getid_transaccion());	
				transaccioningresoegresoAux.setes_ingreso(this.transaccioningresoegreso.getes_ingreso());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.saveTransaccionIngresoEgresos();//WithConnection
						//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);
					
					this.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioningresoegresoLogic.saveTransaccionIngresoEgresoRelaciones(transaccioningresoegresoAux);//WithConnection
								//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transaccioningresoegresoAux=new  TransaccionIngresoEgreso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() 
					|| (this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() && this.transaccioningresoegreso.getId()>=0)) {
						
					transaccioningresoegresoAux.setIsNew(false);
				}
				
				transaccioningresoegresoAux.setIsDeleted(false);
			
				transaccioningresoegresoAux.setId(this.transaccioningresoegreso.getId());	
				transaccioningresoegresoAux.setVersionRow(this.transaccioningresoegreso.getVersionRow());	
				transaccioningresoegresoAux.setid_empresa(this.transaccioningresoegreso.getid_empresa());	
				transaccioningresoegresoAux.setid_modulo(this.transaccioningresoegreso.getid_modulo());	
				transaccioningresoegresoAux.setid_transaccion(this.transaccioningresoegreso.getid_transaccion());	
				transaccioningresoegresoAux.setes_ingreso(this.transaccioningresoegreso.getes_ingreso());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.saveTransaccionIngresoEgresos();//WithConnection
						//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);
					
					this.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioningresoegresoLogic.saveTransaccionIngresoEgresoRelaciones(transaccioningresoegresoAux);//WithConnection
								//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.transaccioningresoegreso,transaccioningresoegresoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transaccioningresoegresoAux=new  TransaccionIngresoEgreso();
				
				transaccioningresoegresoAux.setIsNew(false);
				transaccioningresoegresoAux.setIsChanged(false);
				
				transaccioningresoegresoAux.setIsDeleted(true);
				
				transaccioningresoegresoAux.setId(this.transaccioningresoegreso.getId());	
				transaccioningresoegresoAux.setVersionRow(this.transaccioningresoegreso.getVersionRow());	
				transaccioningresoegresoAux.setid_empresa(this.transaccioningresoegreso.getid_empresa());	
				transaccioningresoegresoAux.setid_modulo(this.transaccioningresoegreso.getid_modulo());	
				transaccioningresoegresoAux.setid_transaccion(this.transaccioningresoegreso.getid_transaccion());	
				transaccioningresoegresoAux.setes_ingreso(this.transaccioningresoegreso.getes_ingreso());	
				
				if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transaccioningresoegresoAux.getId()>=0) {	
						this.transaccioningresoegresosEliminados.add(transaccioningresoegresoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.saveTransaccionIngresoEgresos();//WithConnection
						//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								transaccioningresoegresoLogic.saveTransaccionIngresoEgresoRelaciones(transaccioningresoegresoAux);//WithConnection
								//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
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
							if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(transaccioningresoegresoAux,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(transaccioningresoegresoAux,transaccioningresoegresos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().addAll(this.transaccioningresoegresosEliminados);
					
					transaccioningresoegresoLogic.saveTransaccionIngresoEgresos();//WithConnection
					//transaccioningresoegresoLogic.getSetVersionRowTransaccionIngresoEgresos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso();
				
				this.transaccioningresoegresosEliminados= new ArrayList<TransaccionIngresoEgreso>();		
			}
			
			if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transaccion Ingreso Egreso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transaccioningresoegreso=transaccioningresoegresoAux;
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
      		//this.finishProcessTransaccionIngresoEgreso();
      	}
		
	}	
	
	public void actualizarRelaciones(TransaccionIngresoEgreso transaccioningresoegresoLocal) throws Exception {
		
		if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransaccionIngresoEgreso transaccioningresoegresoLocal) throws Exception {	
		if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transaccioningresoegresoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				transaccioningresoegresoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				transaccioningresoegresoLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransaccionIngresoEgresoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transaccioningresoegresoValidator.getInvalidValues(this.transaccioningresoegreso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransaccionIngresoEgreso transaccioningresoegreso,List<TransaccionIngresoEgreso> transaccioningresoegresos) throws Exception {
		try	{		
			TransaccionIngresoEgresoConstantesFunciones.actualizarLista(transaccioningresoegreso,transaccioningresoegresos,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TransaccionIngresoEgreso transaccioningresoegreso,List<TransaccionIngresoEgreso> transaccioningresoegresos) throws Exception {
		try	{			
			TransaccionIngresoEgresoConstantesFunciones.actualizarSelectedLista(transaccioningresoegreso,transaccioningresoegresos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransaccionIngresoEgreso> transaccioningresoegresosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transaccioningresoegresosLocal=this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transaccioningresoegresosLocal=this.transaccioningresoegresos;
			}
			//ARCHITECTURE
		
			for(TransaccionIngresoEgreso transaccioningresoegresoLocal:transaccioningresoegresosLocal) {
				if(this.permiteMantenimiento(transaccioningresoegresoLocal) && transaccioningresoegresoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransaccionIngresoEgresoConstantesFunciones.getTransaccionIngresoEgresoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransaccionIngresoEgresoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_empresaTransaccionIngresoEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionIngresoEgresoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_moduloTransaccionIngresoEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionIngresoEgresoConstantesFunciones.IDTRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_transaccionTransaccionIngresoEgreso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransaccionIngresoEgresoConstantesFunciones.ESINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabeles_ingresoTransaccionIngresoEgreso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_empresaTransaccionIngresoEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_moduloTransaccionIngresoEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelid_transaccionTransaccionIngresoEgreso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabeles_ingresoTransaccionIngresoEgreso,"");
		
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
		this.iIdNuevoTransaccionIngresoEgreso--;	
		
		
		this.transaccioningresoegresoAux=new TransaccionIngresoEgreso();
		
		this.transaccioningresoegresoAux.setId(this.iIdNuevoTransaccionIngresoEgreso);
		this.transaccioningresoegresoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().add(this.transaccioningresoegresoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transaccioningresoegresos.add(this.transaccioningresoegresoAux);
		}
		//ARCHITECTURE
		
		this.transaccioningresoegreso=this.transaccioningresoegresoAux;
		
		if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegreso);
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionIngresoEgreso(this.transaccioningresoegreso);
		}
				
		//this.setDefaultControlesTransaccionIngresoEgreso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransaccionIngresoEgreso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransaccionIngresoEgreso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionIngresoEgreso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegresoBean,this.transaccioningresoegreso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
			classes=TransaccionIngresoEgresoConstantesFunciones.getClassesRelationshipsOfTransaccionIngresoEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.procesarEventosTransaccionIngresoEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this.transaccioningresoegreso,this.transaccioningresoegresoParameterGeneral,this.isEsNuevoTransaccionIngresoEgreso,classes);//this.transaccioningresoegresoLogic.getTransaccionIngresoEgreso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral,this.transaccioningresoegresoBean,false);
		
		if(this.transaccioningresoegresoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso());
		}
		
		if(this.transaccioningresoegresoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso(),classes);//this.transaccioningresoegresoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransaccionIngresoEgreso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransaccionIngresoEgreso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.RecargarFormTransaccionIngresoEgreso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
						
			if(transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();
			}
			
			this.actualizarVisualTableDatosTransaccionIngresoEgreso();
			
			this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(this.getIndiceNuevoTransaccionIngresoEgreso(), this.getIndiceNuevoTransaccionIngresoEgreso());
			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
						
			this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransaccionIngresoEgreso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setEnabled(isHabilitar && this.transaccioningresoegresoConstantesFunciones.activares_ingresoTransaccionIngresoEgreso);	
		//
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setEnabled(isHabilitar && this.transaccioningresoegresoConstantesFunciones.activarid_empresaTransaccionIngresoEgreso);//
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setEnabled(isHabilitar && this.transaccioningresoegresoConstantesFunciones.activarid_moduloTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setEnabled(isHabilitar && this.transaccioningresoegresoConstantesFunciones.activarid_transaccionTransaccionIngresoEgreso);
	};
	
	public void setDefaultControlesTransaccionIngresoEgreso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransaccionIngresoEgreso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(true);			
			this.transaccioningresoegresoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.setVisible(true);
			
					
		} else {
			//this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(false);			
			this.transaccioningresoegresoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransaccionIngresoEgreso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				if(transaccioningresoegresoAux.getId().equals(this.iIdNuevoTransaccionIngresoEgreso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresos) {
				if(transaccioningresoegresoAux.getId().equals(this.iIdNuevoTransaccionIngresoEgreso)) {
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
	
	public int getIndiceActualTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				if(transaccioningresoegresoAux.getId().equals(transaccioningresoegreso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresos) {
				if(transaccioningresoegresoAux.getId().equals(transaccioningresoegreso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegresoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				if(transaccioningresoegresoAux.getTransaccionIngresoEgresoOriginal().getId().equals(transaccioningresoegresoOriginal.getId())) {
					existe=true;
					transaccioningresoegresoOriginal.setId(transaccioningresoegresoAux.getId());
					transaccioningresoegresoOriginal.setVersionRow(transaccioningresoegresoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresos) {
				if(transaccioningresoegresoAux.getTransaccionIngresoEgresoOriginal().getId().equals(transaccioningresoegresoOriginal.getId())) {
					existe=true;
					transaccioningresoegresoOriginal.setId(transaccioningresoegresoAux.getId());
					transaccioningresoegresoOriginal.setVersionRow(transaccioningresoegresoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransaccionIngresoEgreso(Boolean esParaCancelar) throws Exception {
		transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
		transaccioningresoegresoAux=new TransaccionIngresoEgreso();
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
					if(transaccioningresoegresoAux.getId()<0) {
						transaccioningresoegresosAux.add(transaccioningresoegresoAux);
					}		
				}
				this.iIdNuevoTransaccionIngresoEgreso=0L;
				this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().removeAll(transaccioningresoegresosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresos) {
					if(transaccioningresoegresoAux.getId()<0) {
						transaccioningresoegresosAux.add(transaccioningresoegresoAux);
					}		
				}
				this.iIdNuevoTransaccionIngresoEgreso=0L;
				this.transaccioningresoegresos.removeAll(transaccioningresoegresosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransaccionIngresoEgreso 
					&& this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()>0
					) {
					transaccioningresoegresoAux=this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().get(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size() - 1);
				
					if(transaccioningresoegresoAux.getId()<0) {
						this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().remove(transaccioningresoegresoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransaccionIngresoEgreso && this.transaccioningresoegresos.size()>0) {
					transaccioningresoegresoAux=this.transaccioningresoegresos.get(this.transaccioningresoegresos.size() - 1);
				
					if(transaccioningresoegresoAux.getId()<0) {
						this.transaccioningresoegresos.remove(transaccioningresoegresoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransaccionIngresoEgreso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transaccioningresoegreso.getId()<0) {
				this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().remove(this.transaccioningresoegreso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transaccioningresoegreso.getId()<0) {
				this.transaccioningresoegresos.remove(this.transaccioningresoegreso);
			}
		}			
	}
	
	public void setEstadosInicialesTransaccionIngresoEgreso(List<TransaccionIngresoEgreso> transaccioningresoegresosAux) throws Exception {
		TransaccionIngresoEgresoConstantesFunciones.setEstadosInicialesTransaccionIngresoEgreso(transaccioningresoegresosAux);
	}
	
	public void setEstadosInicialesTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegresoAux) throws Exception {
		TransaccionIngresoEgresoConstantesFunciones.setEstadosInicialesTransaccionIngresoEgreso(transaccioningresoegresoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransaccionIngresoEgresoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransaccionIngresoEgresoActual()) {
				if(!this.isEsNuevoTransaccionIngresoEgreso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransaccionIngresoEgreso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransaccionIngresoEgresoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transaccion Ingreso Egreso ?", "MANTENIMIENTO DE Transaccion Ingreso Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransaccionIngresoEgreso transaccioningresoegreso) throws Exception {
		TransaccionIngresoEgresoConstantesFunciones.seleccionarAsignar(this.transaccioningresoegreso,transaccioningresoegreso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransaccionIngresoEgreso=this.isPermisoActualizarOriginalTransaccionIngresoEgreso;
			
			
			this.seleccionarAsignar(transaccioningresoegreso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransaccionIngresoEgresoConstantesFunciones.quitarEspaciosTransaccionIngresoEgreso(this.transaccioningresoegreso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transaccioningresoegresoSessionBean.setsFuncionBusquedaRapida(this.transaccioningresoegresoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransaccionIngresoEgreso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransaccionIngresoEgreso(esParaCancelar);				
				this.cancelarNuevoTransaccionIngresoEgreso(esParaCancelar);								
			}
			
			this.transaccioningresoegreso=new TransaccionIngresoEgreso();
			
			this.inicializarTransaccionIngresoEgreso();
			
			this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransaccionIngresoEgreso() throws Exception {
		try {
			TransaccionIngresoEgresoConstantesFunciones.inicializarTransaccionIngresoEgreso(this.transaccioningresoegreso);
			
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
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransaccionIngresoEgresos(String sAccionBusqueda,List<TransaccionIngresoEgreso> transaccioningresoegresosParaReportes) throws Exception {
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
					sPathReporteFinal="TransaccionIngresoEgreso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransaccionIngresoEgresoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransaccionIngresoEgresoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransaccionIngresoEgreso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transaccion Ingreso Egresoes");		
		parameters.put("busquedapor", TransaccionIngresoEgresoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransaccionIngresoEgreso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransaccionIngresoEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransaccionIngresoEgresoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransaccionIngresoEgreso=new JRBeanArrayDataSource(TransaccionIngresoEgresoJInternalFrame.TraerTransaccionIngresoEgresoBeans(transaccioningresoegresosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransaccionIngresoEgreso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransaccionIngresoEgresoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransaccionIngresoEgresoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransaccionIngresoEgresoBean.TraerTransaccionIngresoEgresoBeans(transaccioningresoegresosParaReportes).toArray()));
							
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
				this.generarExcelReporteTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgresoActionPerformed(null);
					//this.generarExcelReporteTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransaccionIngresoEgresos(sAccionBusqueda,sTipoArchivoReporte,transaccioningresoegresosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransaccionIngresoEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionIngresoEgreso> transaccioningresoegresosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionIngresoEgresos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionIngresoEgreso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransaccionIngresoEgreso transaccioningresoegreso : transaccioningresoegresosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransaccionIngresoEgresoConstantesFunciones.generarExcelReporteDataTransaccionIngresoEgreso("NORMAL",row,workbook,transaccioningresoegreso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransaccionIngresoEgreso(String sTipo,Row row,Workbook workbook) {
		
		TransaccionIngresoEgresoConstantesFunciones.generarExcelReporteHeaderTransaccionIngresoEgreso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransaccionIngresoEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionIngresoEgreso> transaccioningresoegresosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionIngresoEgresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransaccionIngresoEgreso transaccioningresoegreso : transaccioningresoegresosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.getTransaccionIngresoEgresoDescripcion(transaccioningresoegreso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioningresoegreso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioningresoegreso.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transaccioningresoegreso.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(transaccioningresoegreso.getes_ingreso()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransaccionIngresoEgresos(String sAccionBusqueda,String sTipoArchivoReporte,List<TransaccionIngresoEgreso> transaccioningresoegresosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransaccionIngresoEgreso> transaccioningresoegresosRespaldo=null;
		
		classes=TransaccionIngresoEgresoConstantesFunciones.getClassesRelationshipsOfTransaccionIngresoEgreso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transaccioningresoegresoLogic.setDatosCliente(this.datosCliente);
		this.transaccioningresoegresoLogic.setDatosDeep(this.datosDeep);
		this.transaccioningresoegresoLogic.setIsConDeep(true);
		
		transaccioningresoegresosRespaldo=this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos();
		
		this.transaccioningresoegresoLogic.setTransaccionIngresoEgresos(transaccioningresoegresosParaReportes);	
		this.transaccioningresoegresoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transaccioningresoegresosParaReportes=this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos();
		this.transaccioningresoegresoLogic.setTransaccionIngresoEgresos(transaccioningresoegresosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransaccionIngresoEgresos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransaccionIngresoEgreso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransaccionIngresoEgreso transaccioningresoegreso : transaccioningresoegresosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransaccionIngresoEgreso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransaccionIngresoEgresoConstantesFunciones.generarExcelReporteDataTransaccionIngresoEgreso("NORMAL",row,workbook,transaccioningresoegreso,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.getTransaccionIngresoEgresoDescripcion(transaccioningresoegreso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransaccionIngresoEgreso() throws Exception {		
		this.startProcessTransaccionIngresoEgreso(true);
	}
	
	public void startProcessTransaccionIngresoEgreso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransaccionIngresoEgreso ,this.jPanelParametrosReportesTransaccionIngresoEgreso, this.jScrollPanelDatosTransaccionIngresoEgreso,this.jPanelPaginacionTransaccionIngresoEgreso, this.jScrollPanelDatosEdicionTransaccionIngresoEgreso, this.jPanelAccionesTransaccionIngresoEgreso,this.jPanelAccionesFormularioTransaccionIngresoEgreso,this.jmenuBarTransaccionIngresoEgreso,this.jmenuBarDetalleTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionIngresoEgreso=this.jTabbedPaneBusquedasTransaccionIngresoEgreso; 
		
		final JPanel jPanelParametrosReportesTransaccionIngresoEgreso=this.jPanelParametrosReportesTransaccionIngresoEgreso;
		//final JScrollPane jScrollPanelDatosTransaccionIngresoEgreso=this.jScrollPanelDatosTransaccionIngresoEgreso;
		final JTable jTableDatosTransaccionIngresoEgreso=this.jTableDatosTransaccionIngresoEgreso;		
		final JPanel jPanelPaginacionTransaccionIngresoEgreso=this.jPanelPaginacionTransaccionIngresoEgreso;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionIngresoEgreso=this.jScrollPanelDatosEdicionTransaccionIngresoEgreso;
		final JPanel jPanelAccionesTransaccionIngresoEgreso=this.jPanelAccionesTransaccionIngresoEgreso;
		
		JPanel jPanelCamposAuxiliarTransaccionIngresoEgreso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			jPanelCamposAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelCamposTransaccionIngresoEgreso;
			jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelAccionesFormularioTransaccionIngresoEgreso;
		}
		
		final JPanel jPanelCamposTransaccionIngresoEgreso=jPanelCamposAuxiliarTransaccionIngresoEgreso;
		final JPanel jPanelAccionesFormularioTransaccionIngresoEgreso=jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso;
		
		
		final JMenuBar jmenuBarTransaccionIngresoEgreso=this.jmenuBarTransaccionIngresoEgreso;
		final JToolBar jTtoolBarTransaccionIngresoEgreso=this.jTtoolBarTransaccionIngresoEgreso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransaccionIngresoEgreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			jmenuBarDetalleAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jmenuBarDetalleTransaccionIngresoEgreso;
			jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTtoolBarDetalleTransaccionIngresoEgreso;
		}
		
		final JMenuBar jmenuBarDetalleTransaccionIngresoEgreso=jmenuBarDetalleAuxiliarTransaccionIngresoEgreso;
		final JToolBar jTtoolBarDetalleTransaccionIngresoEgreso=jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionIngresoEgreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionIngresoEgreso;
			processRunnable.jTableDatos=jTableDatosTransaccionIngresoEgreso;
			processRunnable.jPanelCampos=jPanelCamposTransaccionIngresoEgreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionIngresoEgreso;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionIngresoEgreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionIngresoEgreso;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionIngresoEgreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionIngresoEgreso;
			processRunnable.jTtoolBar=jTtoolBarTransaccionIngresoEgreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionIngresoEgreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionIngresoEgreso ,jPanelParametrosReportesTransaccionIngresoEgreso,jTableDatosTransaccionIngresoEgreso, /*jScrollPanelDatosTransaccionIngresoEgreso,*/jPanelCamposTransaccionIngresoEgreso,jPanelPaginacionTransaccionIngresoEgreso, /*jScrollPanelDatosEdicionTransaccionIngresoEgreso,*/ jPanelAccionesTransaccionIngresoEgreso,jPanelAccionesFormularioTransaccionIngresoEgreso,jmenuBarTransaccionIngresoEgreso,jmenuBarDetalleTransaccionIngresoEgreso,jTtoolBarTransaccionIngresoEgreso,jTtoolBarDetalleTransaccionIngresoEgreso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransaccionIngresoEgreso ,jPanelParametrosReportesTransaccionIngresoEgreso, jScrollPanelDatosTransaccionIngresoEgreso,jPanelPaginacionTransaccionIngresoEgreso, jScrollPanelDatosEdicionTransaccionIngresoEgreso, jPanelAccionesTransaccionIngresoEgreso,jPanelAccionesFormularioTransaccionIngresoEgreso,jmenuBarTransaccionIngresoEgreso,jmenuBarDetalleTransaccionIngresoEgreso,jTtoolBarTransaccionIngresoEgreso,jTtoolBarDetalleTransaccionIngresoEgreso);
						
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
	
	public void finishProcessTransaccionIngresoEgreso() {// throws Exception 
		this.finishProcessTransaccionIngresoEgreso(true);
	}
	
	public void finishProcessTransaccionIngresoEgreso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransaccionIngresoEgreso ,this.jPanelParametrosReportesTransaccionIngresoEgreso, this.jScrollPanelDatosTransaccionIngresoEgreso,this.jPanelPaginacionTransaccionIngresoEgreso, this.jScrollPanelDatosEdicionTransaccionIngresoEgreso, this.jPanelAccionesTransaccionIngresoEgreso,this.jPanelAccionesFormularioTransaccionIngresoEgreso,this.jmenuBarTransaccionIngresoEgreso,this.jmenuBarDetalleTransaccionIngresoEgreso,this.jTtoolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso);		
		
		final JTabbedPane jTabbedPaneBusquedasTransaccionIngresoEgreso=this.jTabbedPaneBusquedasTransaccionIngresoEgreso; 
		
		final JPanel jPanelParametrosReportesTransaccionIngresoEgreso=this.jPanelParametrosReportesTransaccionIngresoEgreso;
		//final JScrollPane jScrollPanelDatosTransaccionIngresoEgreso=this.jScrollPanelDatosTransaccionIngresoEgreso;
		final JTable jTableDatosTransaccionIngresoEgreso=this.jTableDatosTransaccionIngresoEgreso;		
		final JPanel jPanelPaginacionTransaccionIngresoEgreso=this.jPanelPaginacionTransaccionIngresoEgreso;
		//final JScrollPane jScrollPanelDatosEdicionTransaccionIngresoEgreso=this.jScrollPanelDatosEdicionTransaccionIngresoEgreso;
		final JPanel jPanelAccionesTransaccionIngresoEgreso=this.jPanelAccionesTransaccionIngresoEgreso;
		
		JPanel jPanelCamposAuxiliarTransaccionIngresoEgreso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			jPanelCamposAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelCamposTransaccionIngresoEgreso;
			jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelAccionesFormularioTransaccionIngresoEgreso;
		}
		
		final JPanel jPanelCamposTransaccionIngresoEgreso=jPanelCamposAuxiliarTransaccionIngresoEgreso;
		final JPanel jPanelAccionesFormularioTransaccionIngresoEgreso=jPanelAccionesFormularioAuxiliarTransaccionIngresoEgreso;
		
		
		final JMenuBar jmenuBarTransaccionIngresoEgreso=this.jmenuBarTransaccionIngresoEgreso;		
		final JToolBar jTtoolBarTransaccionIngresoEgreso=this.jTtoolBarTransaccionIngresoEgreso;
				
		JMenuBar jmenuBarDetalleAuxiliarTransaccionIngresoEgreso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			jmenuBarDetalleAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jmenuBarDetalleTransaccionIngresoEgreso;
			jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTtoolBarDetalleTransaccionIngresoEgreso;		
		}
		
		final JMenuBar jmenuBarDetalleTransaccionIngresoEgreso=jmenuBarDetalleAuxiliarTransaccionIngresoEgreso;
		final JToolBar jTtoolBarDetalleTransaccionIngresoEgreso=jTtoolBarDetalleAuxiliarTransaccionIngresoEgreso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransaccionIngresoEgreso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransaccionIngresoEgreso;
			processRunnable.jTableDatos=jTableDatosTransaccionIngresoEgreso;
			processRunnable.jPanelCampos=jPanelCamposTransaccionIngresoEgreso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransaccionIngresoEgreso;
			processRunnable.jPanelAcciones=jPanelAccionesTransaccionIngresoEgreso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransaccionIngresoEgreso;
			
			
			processRunnable.jmenuBar=jmenuBarTransaccionIngresoEgreso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransaccionIngresoEgreso;
			processRunnable.jTtoolBar=jTtoolBarTransaccionIngresoEgreso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransaccionIngresoEgreso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransaccionIngresoEgreso ,jPanelParametrosReportesTransaccionIngresoEgreso, jTableDatosTransaccionIngresoEgreso,/*jScrollPanelDatosTransaccionIngresoEgreso,*/jPanelCamposTransaccionIngresoEgreso,jPanelPaginacionTransaccionIngresoEgreso, /*jScrollPanelDatosEdicionTransaccionIngresoEgreso,*/ jPanelAccionesTransaccionIngresoEgreso,jPanelAccionesFormularioTransaccionIngresoEgreso,jmenuBarTransaccionIngresoEgreso,jmenuBarDetalleTransaccionIngresoEgreso,jTtoolBarTransaccionIngresoEgreso,jTtoolBarDetalleTransaccionIngresoEgreso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransaccionIngresoEgreso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransaccionIngresoEgreso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransaccionIngresoEgreso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransaccionIngresoEgreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransaccionIngresoEgreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransaccionIngresoEgreso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransaccionIngresoEgreso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransaccionIngresoEgreso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransaccionIngresoEgreso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transaccioningresoegresoConstantesFunciones.getsFinalQueryTransaccionIngresoEgreso();
		String  finalQueryPaginacionTodos=this.transaccioningresoegresoConstantesFunciones.getsFinalQueryTransaccionIngresoEgreso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransaccionIngresoEgresoConstantesFunciones.getArrayColumnasGlobalesNoTransaccionIngresoEgreso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransaccionIngresoEgresoConstantesFunciones.getArrayColumnasGlobalesTransaccionIngresoEgreso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransaccionIngresoEgresoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transaccioningresoegresosEliminados= new ArrayList<TransaccionIngresoEgreso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransaccionIngresoEgreso();
		
				///*TransaccionIngresoEgresoSessionBean*/this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
			
			if(this.transaccioningresoegresoSessionBean==null) {
				this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
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
					this.iNumeroPaginacion=TransaccionIngresoEgresoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransaccionIngresoEgresoConstantesFunciones.getClassesForeignKeysOfTransaccionIngresoEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transaccioningresoegreso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transaccioningresoegresosAux= new ArrayList<TransaccionIngresoEgreso>();
			
				
			transaccioningresoegresoLogic.setDatosCliente(this.datosCliente);
			transaccioningresoegresoLogic.setDatosDeep(this.datosDeep);
			transaccioningresoegresoLogic.setIsConDeep(true);
			
			
			transaccioningresoegresoLogic.getTransaccionIngresoEgresoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transaccioningresoegresoLogic.getTodosTransaccionIngresoEgresos(finalQueryGlobal,pagination);
					
					//transaccioningresoegresoLogic.getTodosTransaccionIngresoEgresosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transaccioningresoegresoLogic.getTransaccionIngresoEgresos()==null|| transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioningresoegresosAux= new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresosAux.addAll(transaccioningresoegresoLogic.getTransaccionIngresoEgresos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresosAux= new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresosAux.addAll(transaccioningresoegresos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioningresoegresoLogic.getTodosTransaccionIngresoEgresos(finalQueryGlobal+"",this.pagination);												
							
							//transaccioningresoegresoLogic.getTodosTransaccionIngresoEgresosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresoLogic.getTransaccionIngresoEgresos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transaccioningresoegresoLogic.setTransaccionIngresoEgresos(new ArrayList<TransaccionIngresoEgreso>());					
							transaccioningresoegresoLogic.getTransaccionIngresoEgresos().addAll(transaccioningresoegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresos.addAll(transaccioningresoegresosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransaccionIngresoEgreso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransaccionIngresoEgreso=this.idActual;
				
				} else if(this.idTransaccionIngresoEgresoActual!=null && this.idTransaccionIngresoEgresoActual!=0L) {
					idTransaccionIngresoEgreso=idTransaccionIngresoEgresoActual;
				}
				
					
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndicePorId(idTransaccionIngresoEgreso);
				
				this.transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transaccioningresoegresoLogic.getEntity(idTransaccionIngresoEgreso);
					
					//transaccioningresoegresoLogic.getEntityWithConnection(idTransaccionIngresoEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioningresoegresoLogic.setTransaccionIngresoEgresos(new ArrayList<TransaccionIngresoEgreso>());
					transaccioningresoegresoLogic.getTransaccionIngresoEgresos().add(transaccioningresoegresoLogic.getTransaccionIngresoEgreso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
					this.transaccioningresoegresos.add(transaccioningresoegreso);
				}
				
				if(transaccioningresoegresoLogic.getTransaccionIngresoEgreso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioningresoegresoLogic.getTransaccionIngresoEgresos()==null||transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioningresoegresos==null|| transaccioningresoegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
						transaccioningresoegresosAux.addAll(transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresosAux.addAll(transaccioningresoegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionIngresoEgresos("FK_IdEmpresa",transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionIngresoEgresos("FK_IdEmpresa",transaccioningresoegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.setTransaccionIngresoEgresos(new ArrayList<TransaccionIngresoEgreso>());
						transaccioningresoegresoLogic.getTransaccionIngresoEgresos().addAll(transaccioningresoegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresos.addAll(transaccioningresoegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioningresoegresoLogic.getTransaccionIngresoEgresos()==null||transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioningresoegresos==null|| transaccioningresoegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
						transaccioningresoegresosAux.addAll(transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresosAux.addAll(transaccioningresoegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionIngresoEgresos("FK_IdModulo",transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionIngresoEgresos("FK_IdModulo",transaccioningresoegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.setTransaccionIngresoEgresos(new ArrayList<TransaccionIngresoEgreso>());
						transaccioningresoegresoLogic.getTransaccionIngresoEgresos().addAll(transaccioningresoegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresos.addAll(transaccioningresoegresosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccion")) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transaccioningresoegresoLogic.getTransaccionIngresoEgresos()==null||transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transaccioningresoegresos==null|| transaccioningresoegresos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
						transaccioningresoegresosAux.addAll(transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresosAux=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresosAux.addAll(transaccioningresoegresos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransaccionIngresoEgresoConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransaccionIngresoEgresos("FK_IdTransaccion",transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransaccionIngresoEgresos("FK_IdTransaccion",transaccioningresoegresos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoLogic.setTransaccionIngresoEgresos(new ArrayList<TransaccionIngresoEgreso>());
						transaccioningresoegresoLogic.getTransaccionIngresoEgresos().addAll(transaccioningresoegresosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresos=new ArrayList<TransaccionIngresoEgreso>();
							transaccioningresoegresos.addAll(transaccioningresoegresosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransaccionIngresoEgreso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransaccionIngresoEgreso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioningresoegresos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioningresoegresos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransaccionIngresoEgreso transaccioningresoegreso) {
		Boolean permite=true;
		
		if(this.transaccioningresoegreso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransaccionIngresoEgresoConstantesFunciones.getOrderByListaTransaccionIngresoEgreso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransaccionIngresoEgresoConstantesFunciones.getOrderByListaTransaccionIngresoEgreso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				if(transaccioningresoegreso.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioningresoegresoTotales=transaccioningresoegreso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionIngresoEgreso transaccioningresoegreso:this.transaccioningresoegresos) {
				if(transaccioningresoegreso.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioningresoegresoTotales=transaccioningresoegreso;
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
			this.transaccioningresoegresoAux=new TransaccionIngresoEgreso();
			this.transaccioningresoegresoAux.setsType(Constantes2.S_TOTALES);
			this.transaccioningresoegresoAux.setIsNew(false);
			this.transaccioningresoegresoAux.setIsChanged(false);
			this.transaccioningresoegresoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransaccionIngresoEgresoConstantesFunciones.TotalizarValoresFilaTransaccionIngresoEgreso(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this.transaccioningresoegresoAux);
				
				this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().add(this.transaccioningresoegresoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransaccionIngresoEgresoConstantesFunciones.TotalizarValoresFilaTransaccionIngresoEgreso(this.transaccioningresoegresos,this.transaccioningresoegresoAux);
				
				this.transaccioningresoegresos.add(this.transaccioningresoegresoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transaccioningresoegresoTotales=new TransaccionIngresoEgreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().remove(transaccioningresoegresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transaccioningresoegresos.remove(transaccioningresoegresoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transaccioningresoegresoTotales=new TransaccionIngresoEgreso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				if(transaccioningresoegreso.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioningresoegresoTotales=transaccioningresoegreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionIngresoEgresoConstantesFunciones.TotalizarValoresFilaTransaccionIngresoEgreso(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),transaccioningresoegresoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransaccionIngresoEgreso transaccioningresoegreso:this.transaccioningresoegresos) {
				if(transaccioningresoegreso.getsType().equals(Constantes2.S_TOTALES)) {
					transaccioningresoegresoTotales=transaccioningresoegreso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransaccionIngresoEgresoConstantesFunciones.TotalizarValoresFilaTransaccionIngresoEgreso(this.transaccioningresoegresos,transaccioningresoegresoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransaccionIngresoEgresosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionIngresoEgresosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransaccionIngresoEgresosFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransaccionIngresoEgresosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionIngresoEgresosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransaccionIngresoEgresosFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioningresoegresoLogic.getTransaccionIngresoEgresosFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosTransaccionIngresoEgreso() {
		this.isPermisoTodoTransaccionIngresoEgreso=false;
		this.isPermisoNuevoTransaccionIngresoEgreso=false;
		this.isPermisoActualizarTransaccionIngresoEgreso=false;
		this.isPermisoActualizarOriginalTransaccionIngresoEgreso=false;
		this.isPermisoEliminarTransaccionIngresoEgreso=false;
		this.isPermisoGuardarCambiosTransaccionIngresoEgreso=false;
		this.isPermisoConsultaTransaccionIngresoEgreso=false;
		this.isPermisoBusquedaTransaccionIngresoEgreso=false;
		this.isPermisoReporteTransaccionIngresoEgreso=false;		
		this.isPermisoOrdenTransaccionIngresoEgreso=false;		
		this.isPermisoPaginacionMedioTransaccionIngresoEgreso=false;		
		this.isPermisoPaginacionAltoTransaccionIngresoEgreso=false;
		this.isPermisoPaginacionTodoTransaccionIngresoEgreso=false;
		this.isPermisoCopiarTransaccionIngresoEgreso=false;		
		this.isPermisoVerFormTransaccionIngresoEgreso=false;		
		this.isPermisoDuplicarTransaccionIngresoEgreso=false;		
		this.isPermisoOrdenTransaccionIngresoEgreso=false;		
	}
	
	public void setPermisosUsuarioTransaccionIngresoEgreso(Boolean isPermiso) {
		this.isPermisoTodoTransaccionIngresoEgreso=isPermiso;
		this.isPermisoNuevoTransaccionIngresoEgreso=isPermiso;
		this.isPermisoActualizarTransaccionIngresoEgreso=isPermiso;
		this.isPermisoActualizarOriginalTransaccionIngresoEgreso=isPermiso;
		this.isPermisoEliminarTransaccionIngresoEgreso=isPermiso;
		this.isPermisoGuardarCambiosTransaccionIngresoEgreso=isPermiso;
		this.isPermisoConsultaTransaccionIngresoEgreso=isPermiso;
		this.isPermisoBusquedaTransaccionIngresoEgreso=isPermiso;
		this.isPermisoReporteTransaccionIngresoEgreso=isPermiso;
		this.isPermisoOrdenTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoPaginacionMedioTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoPaginacionAltoTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoPaginacionTodoTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoCopiarTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoVerFormTransaccionIngresoEgreso=isPermiso;		
		this.isPermisoDuplicarTransaccionIngresoEgreso=isPermiso;
		this.isPermisoOrdenTransaccionIngresoEgreso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransaccionIngresoEgreso(Boolean isPermiso) {
		//this.isPermisoTodoTransaccionIngresoEgreso=isPermiso;
		this.isPermisoNuevoTransaccionIngresoEgreso=isPermiso;
		this.isPermisoActualizarTransaccionIngresoEgreso=isPermiso;
		this.isPermisoActualizarOriginalTransaccionIngresoEgreso=isPermiso;
		this.isPermisoEliminarTransaccionIngresoEgreso=isPermiso;
		this.isPermisoGuardarCambiosTransaccionIngresoEgreso=isPermiso;
		//this.isPermisoConsultaTransaccionIngresoEgreso=isPermiso;
		//this.isPermisoBusquedaTransaccionIngresoEgreso=isPermiso;
		//this.isPermisoReporteTransaccionIngresoEgreso=isPermiso;
		//this.isPermisoOrdenTransaccionIngresoEgreso=isPermiso;		
		//this.isPermisoPaginacionMedioTransaccionIngresoEgreso=isPermiso;		
		//this.isPermisoPaginacionAltoTransaccionIngresoEgreso=isPermiso;		
		//this.isPermisoPaginacionTodoTransaccionIngresoEgreso=isPermiso;		
		//this.isPermisoCopiarTransaccionIngresoEgreso=isPermiso;		
		//this.isPermisoDuplicarTransaccionIngresoEgreso=isPermiso;
		//this.isPermisoOrdenTransaccionIngresoEgreso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionIngresoEgresoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransaccionIngresoEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransaccionIngresoEgreso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransaccionIngresoEgresoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransaccionIngresoEgresoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransaccionIngresoEgresoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransaccionIngresoEgresoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransaccionIngresoEgreso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransaccionIngresoEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransaccionIngresoEgresoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransaccionIngresoEgreso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransaccionIngresoEgreso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransaccionIngresoEgreso=this.isPermisoActualizarTransaccionIngresoEgreso;
			this.isPermisoEliminarTransaccionIngresoEgreso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransaccionIngresoEgreso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransaccionIngresoEgreso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransaccionIngresoEgreso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransaccionIngresoEgreso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransaccionIngresoEgreso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionIngresoEgreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransaccionIngresoEgreso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransaccionIngresoEgreso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransaccionIngresoEgreso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransaccionIngresoEgreso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransaccionIngresoEgreso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransaccionIngresoEgreso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransaccionIngresoEgreso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransaccionIngresoEgreso.setToolTipText(this.jTableDatosTransaccionIngresoEgreso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransaccionIngresoEgreso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransaccionIngresoEgreso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransaccionIngresoEgreso() throws Exception {
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
	public void inicializarCombosForeignKeyTransaccionIngresoEgresoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransaccionIngresoEgresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransaccionIngresoEgresoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransaccionIngresoEgresoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTransaccionIngresoEgresoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoReturnGeneral=new TransaccionIngresoEgresoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.transaccioningresoegresoConstantesFunciones.cargarid_empresaTransaccionIngresoEgreso)
					 || (this.esRecargarFks && this.transaccioningresoegresoConstantesFunciones.cargarid_empresaTransaccionIngresoEgreso)) {

					if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+transaccioningresoegresoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.transaccioningresoegresoConstantesFunciones.cargarid_moduloTransaccionIngresoEgreso)
					 || (this.esRecargarFks && this.transaccioningresoegresoConstantesFunciones.cargarid_moduloTransaccionIngresoEgreso)) {

					if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+transaccioningresoegresoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTransaccion="";

				if(((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0) && this.transaccioningresoegresoConstantesFunciones.cargarid_transaccionTransaccionIngresoEgreso)
					 || (this.esRecargarFks && this.transaccioningresoegresoConstantesFunciones.cargarid_transaccionTransaccionIngresoEgreso)) {

					if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion, "");
						finalQueryGlobalTransaccion+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion=" WHERE " + ConstantesSql.ID + "="+transaccioningresoegresoSessionBean.getlidTransaccionActual();
					}
				} else {
					finalQueryGlobalTransaccion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.cargarCombosLoteForeignKeyTransaccionIngresoEgreso(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTransaccion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=transaccioningresoegresoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=transaccioningresoegresoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTransaccion.equals("NONE")) {
				this.transaccionsForeignKey=transaccioningresoegresoReturnGeneral.gettransaccionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransaccionIngresoEgreso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTransaccion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transaccioningresoegresoSessionBean==null) {
				this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
			}

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.transaccioningresoegresoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionIngresoEgreso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransaccionIngresoEgreso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransaccionIngresoEgreso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionIngresoEgreso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso)throws Exception {	
		try {
			
			this.setActualTransaccionForeignKey(transaccioningresoegreso.getid_transaccion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransaccionIngresoEgreso()throws Exception {	
		try {
			
			this.setActualTransaccionForeignKey(this.transaccioningresoegresoConstantesFunciones.getid_transaccion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransaccionIngresoEgreso()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransaccionIngresoEgreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransaccionIngresoEgreso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransaccionIngresoEgreso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransaccionIngresoEgreso()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransaccionIngresoEgreso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransaccionIngresoEgreso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TransaccionIngresoEgresoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransaccionIngresoEgresoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransaccionIngresoEgresoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean(); 
		this.transaccioningresoegresoConstantesFunciones=new TransaccionIngresoEgresoConstantesFunciones(); 
		this.transaccioningresoegresoBean=new TransaccionIngresoEgreso();//(this.transaccioningresoegresoConstantesFunciones); 		
		this.transaccioningresoegresoReturnGeneral=new TransaccionIngresoEgresoParameterReturnGeneral(); 
		
		this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioningresoegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransaccionIngresoEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransaccionIngresoEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransaccionIngresoEgresoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransaccionIngresoEgreso(true);
			
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
			
			this.transaccioningresoegresoConstantesFunciones=new TransaccionIngresoEgresoConstantesFunciones(); 
			this.transaccioningresoegresoBean=new TransaccionIngresoEgreso();//this.transaccioningresoegresoConstantesFunciones); 			
			this.transaccioningresoegresoReturnGeneral=new TransaccionIngresoEgresoParameterReturnGeneral(); 
		
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Ingreso Egreso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transaccioningresoegreso=new TransaccionIngresoEgreso();
			this.transaccioningresoegresos = new ArrayList<TransaccionIngresoEgreso>();
			this.transaccioningresoegresosAux = new ArrayList<TransaccionIngresoEgreso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic=new TransaccionIngresoEgresoLogic();
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			//this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transaccioningresoegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransaccionIngresoEgreso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso);	
					}
					
					if(this.jInternalFrameImportacionTransaccionIngresoEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionIngresoEgreso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransaccionIngresoEgreso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransaccionIngresoEgreso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionIngresoEgreso);
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setVisible(false);
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso);
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setVisible(false);
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransaccionIngresoEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionIngresoEgreso);
					this.jInternalFrameImportacionTransaccionIngresoEgreso.setVisible(false);
					this.jInternalFrameImportacionTransaccionIngresoEgreso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransaccionIngresoEgreso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionIngresoEgreso);
					this.jInternalFrameOrderByTransaccionIngresoEgreso.setVisible(false);
					this.jInternalFrameOrderByTransaccionIngresoEgreso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransaccionIngresoEgresoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransaccionIngresoEgresoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transaccioningresoegresoReturnGeneral=new TransaccionIngresoEgresoParameterReturnGeneral();
			
			this.transaccioningresoegresoParameterGeneral=new TransaccionIngresoEgresoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transaccioningresoegresoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionIngresoEgresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado(),this.transaccioningresoegresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransaccionIngresoEgresoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado(),this.transaccioningresoegresoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransaccionIngresoEgreso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransaccionIngresoEgreso(false);
			
			this.setPermisosUsuarioTransaccionIngresoEgreso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() 
				|| (this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() && this.transaccioningresoegresoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransaccionIngresoEgresoClasesRelacionadas();
			}
			
			if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransaccionIngresoEgresoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransaccionIngresoEgreso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransaccionIngresoEgreso();
			}
			
			if(!this.isPermisoBusquedaTransaccionIngresoEgreso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransaccionIngresoEgreso,this.isPermisoPaginacionMedioTransaccionIngresoEgreso,this.isPermisoPaginacionTodoTransaccionIngresoEgreso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransaccionIngresoEgresoConstantesFunciones.getTiposSeleccionarTransaccionIngresoEgreso());
				
				this.tiposColumnasSelect=TransaccionIngresoEgresoConstantesFunciones.getTiposSeleccionarTransaccionIngresoEgreso(true);
				
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
			//if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransaccionIngresoEgreso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTransaccionIngresoEgreso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTransaccionIngresoEgreso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionIngresoEgreso() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.transaccionLogic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transaccioningresoegresoImplementable= (TransaccionIngresoEgresoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionIngresoEgresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transaccioningresoegresoImplementableHome= (TransaccionIngresoEgresoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransaccionIngresoEgresoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transaccioningresoegresos= new ArrayList<TransaccionIngresoEgreso>();
			this.transaccioningresoegresosEliminados= new ArrayList<TransaccionIngresoEgreso>();
						
			this.isEsNuevoTransaccionIngresoEgreso=false;
			this.esParaAccionDesdeFormularioTransaccionIngresoEgreso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransaccionIngresoEgreso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransaccionIngresoEgreso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransaccionIngresoEgresoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransaccionIngresoEgreso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransaccionIngresoEgreso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransaccionIngresoEgreso();
			}
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransaccionIngresoEgreso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransaccionIngresoEgreso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransaccionIngresoEgreso() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransaccionIngresoEgreso")) {
				iIndex=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransaccionIngresoEgreso();	
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
	
	public void cargarCombosForeignKeyTransaccionIngresoEgreso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransaccionIngresoEgreso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransaccionIngresoEgreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransaccionIngresoEgresoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransaccionIngresoEgreso();
		
		this.cargarCombosFrameForeignKeyTransaccionIngresoEgreso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransaccionIngresoEgreso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransaccionIngresoEgreso();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransaccionIngresoEgresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			
			if(jTableDatosTransaccionIngresoEgreso.getRowCount()>=1) {
				jTableDatosTransaccionIngresoEgreso.removeRowSelectionInterval(0, jTableDatosTransaccionIngresoEgreso.getRowCount()-1);						
			}
			
			this.isEsNuevoTransaccionIngresoEgreso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransaccionIngresoEgreso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(true);			
			//this.transaccioningresoegreso=new TransaccionIngresoEgreso();
			//this.transaccioningresoegreso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso() ;
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionIngresoEgreso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transaccioningresoegreso);	
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);				
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransaccionIngresoEgreso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransaccionIngresoEgresoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransaccionIngresoEgreso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransaccionIngresoEgreso.getSelectedRows().length;			
			}
			
			transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransaccionIngresoEgreso--;			
				//TransaccionIngresoEgreso transaccioningresoegresoAux= new TransaccionIngresoEgreso();			
				//transaccioningresoegresoAux.setId(this.iIdNuevoTransaccionIngresoEgreso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransaccionIngresoEgreso transaccioningresoegresoOrigen=new TransaccionIngresoEgreso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransaccionIngresoEgreso transaccioningresoegresoOrigen : transaccioningresoegresosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transaccioningresoegresoOrigen =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transaccioningresoegresoOrigen =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransaccionIngresoEgreso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transaccioningresoegreso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransaccionIngresoEgreso(transaccioningresoegresoOrigen,this.transaccioningresoegreso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().add(this.transaccioningresoegresoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegresos.add(this.transaccioningresoegresoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
				
				this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(this.getIndiceNuevoTransaccionIngresoEgreso(), this.getIndiceNuevoTransaccionIngresoEgreso());
				
				int iLastRow =  this.jTableDatosTransaccionIngresoEgreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionIngresoEgreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionIngresoEgreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();									
		
			TransaccionIngresoEgreso transaccioningresoegresoOrigen=new TransaccionIngresoEgreso();
			TransaccionIngresoEgreso transaccioningresoegresoDestino=new TransaccionIngresoEgreso();
				
			transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransaccionIngresoEgreso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transaccioningresoegresosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransaccionIngresoEgreso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoOrigen =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioningresoegresoOrigen =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transaccioningresoegresoDestino =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transaccioningresoegresoDestino =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transaccioningresoegresoOrigen =transaccioningresoegresosSeleccionados.get(0);
				transaccioningresoegresoDestino =transaccioningresoegresosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransaccionIngresoEgreso(transaccioningresoegresoOrigen,transaccioningresoegresoDestino,true,false);
				
				transaccioningresoegresoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transaccioningresoegresoDestino,transaccioningresoegresoLogic.getTransaccionIngresoEgresos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transaccioningresoegresoDestino,transaccioningresoegresos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
				
				//this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(this.getIndiceNuevoTransaccionIngresoEgreso(), this.getIndiceNuevoTransaccionIngresoEgreso());
				
				int iLastRow =  this.jTableDatosTransaccionIngresoEgreso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransaccionIngresoEgreso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransaccionIngresoEgreso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransaccionIngresoEgreso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(!isVisible);
			this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(!isVisible);
			this.jPanelAccionesTransaccionIngresoEgreso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransaccionIngresoEgreso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransaccionIngresoEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransaccionIngresoEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransaccionIngresoEgreso();
			
			this.abrirFrameOrderByTransaccionIngresoEgreso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransaccionIngresoEgreso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransaccionIngresoEgreso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionIngresoEgreso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.isMaximum()) {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSize(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.iWidthFormulario,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransaccionIngresoEgreso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransaccionIngresoEgreso.isMaximum()) {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jContentPaneDetalleTransaccionIngresoEgreso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jContentPaneDetalleTransaccionIngresoEgreso.getWidth(),TransaccionIngresoEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jContentPaneDetalleTransaccionIngresoEgreso.getWidth(),TransaccionIngresoEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jContentPaneDetalleTransaccionIngresoEgreso.getWidth(),TransaccionIngresoEgresoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setVisible(true);
	        this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransaccionIngresoEgreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransaccionIngresoEgreso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransaccionIngresoEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionIngresoEgreso,false,this);
				} else {
					this.jInternalFrameOrderByTransaccionIngresoEgreso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionIngresoEgreso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransaccionIngresoEgreso);
				this.jInternalFrameOrderByTransaccionIngresoEgreso.setVisible(false);
				this.jInternalFrameOrderByTransaccionIngresoEgreso.setSelected(false);
				
				this.jInternalFrameOrderByTransaccionIngresoEgreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionIngresoEgreso"));
				
				this.inicializarActualizarBindingTablaOrderByTransaccionIngresoEgreso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransaccionIngresoEgreso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransaccionIngresoEgreso==null) {
				
				this.jInternalFrameImportacionTransaccionIngresoEgreso=new ImportacionJInternalFrame(TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransaccionIngresoEgreso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransaccionIngresoEgreso);
				this.jInternalFrameImportacionTransaccionIngresoEgreso.setVisible(false);
				this.jInternalFrameImportacionTransaccionIngresoEgreso.setSelected(false);


				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionIngresoEgreso"));
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionIngresoEgreso"));
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionIngresoEgreso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransaccionIngresoEgreso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso==null) {
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso=new ReporteDinamicoJInternalFrame(TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso);
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setVisible(false);
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionIngresoEgreso"));
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionIngresoEgreso"));
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionIngresoEgreso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionIngresoEgreso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransaccionIngresoEgreso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransaccionIngresoEgreso);
			
	       	this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setVisible(false);
	        this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.dispose();
			//this.jInternalFrameDetalleFormTransaccionIngresoEgreso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransaccionIngresoEgreso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransaccionIngresoEgreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransaccionIngresoEgreso.setVisible(true);
	        this.jInternalFrameImportacionTransaccionIngresoEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransaccionIngresoEgreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setVisible(true);
	        this.jInternalFrameOrderByTransaccionIngresoEgreso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransaccionIngresoEgreso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransaccionIngresoEgreso.setVisible(false);
	        this.jInternalFrameOrderByTransaccionIngresoEgreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransaccionIngresoEgreso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransaccionIngresoEgreso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransaccionIngresoEgreso.setVisible(false);
	        this.jInternalFrameImportacionTransaccionIngresoEgreso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransaccionIngresoEgreso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransaccionIngresoEgreso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(true);
			//this.isEsNuevoTransaccionIngresoEgreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false) ;
			
			if(transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionIngresoEgreso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransaccionIngresoEgresoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransaccionIngresoEgreso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(true);
			//this.isEsNuevoTransaccionIngresoEgreso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transaccioningresoegreso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false) ;
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransaccionIngresoEgreso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransaccionIngresoEgreso(false);
			
			//if(!this.isEsNuevoTransaccionIngresoEgreso) {								
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				
			}
			
			if(this.permiteMantenimiento(this.transaccioningresoegreso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransaccionIngresoEgreso=true;
					this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
					this.isEsNuevoTransaccionIngresoEgreso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransaccionIngresoEgreso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransaccionIngresoEgreso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(false);
				
				this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(false);
			
												
				
				if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransaccionIngresoEgreso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,transaccioningresoegresoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransaccionIngresoEgreso(this.transaccioningresoegreso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transaccioningresoegresoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transaccioningresoegreso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				this.transaccioningresoegreso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				this.transaccioningresoegreso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transaccioningresoegreso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransaccionIngresoEgresoModel) this.jTableDatosTransaccionIngresoEgreso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransaccionIngresoEgreso=true;
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
				this.isEsNuevoTransaccionIngresoEgreso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(false);
				
				this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(false);
				
				
				
				if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransaccionIngresoEgreso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransaccionIngresoEgreso.getRowCount()>=1) {
				jTableDatosTransaccionIngresoEgreso.removeRowSelectionInterval(0, jTableDatosTransaccionIngresoEgreso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransaccionIngresoEgreso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(false) ;
			
			this.isEsNuevoTransaccionIngresoEgreso=false;
			
			if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransaccionIngresoEgreso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				
				//SI ES MANUAL
				if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransaccionIngresoEgreso--;			
			//TransaccionIngresoEgreso transaccioningresoegresoAux= new TransaccionIngresoEgreso();			
			//transaccioningresoegresoAux.setId(this.iIdNuevoTransaccionIngresoEgreso);
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransaccionIngresoEgreso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
			
			this.transaccioningresoegreso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().add(this.transaccioningresoegresoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transaccioningresoegresos.add(this.transaccioningresoegresoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			
			this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(this.getIndiceNuevoTransaccionIngresoEgreso(), this.getIndiceNuevoTransaccionIngresoEgreso());
			
			int iLastRow =  this.jTableDatosTransaccionIngresoEgreso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransaccionIngresoEgreso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransaccionIngresoEgreso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
			
			//SI ES MANUAL
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();
			}
			
			//this.abrirFrameTreeTransaccionIngresoEgreso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Transaccion Ingreso EgresoES ?", "MANTENIMIENTO DE Transaccion Ingreso Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransaccionIngresoEgreso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransaccionIngresoEgreso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.procesarImportacionTransaccionIngresoEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transaccioningresoegresoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransaccionIngresoEgresoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransaccionIngresoEgreso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransaccionIngresoEgreso.setFileImportacion(this.jInternalFrameImportacionTransaccionIngresoEgreso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransaccionIngresoEgreso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransaccionIngresoEgreso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		

		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransaccionIngresoEgresoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransaccionIngresoEgresoBaseDesign.jrxml";
			
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
			
			this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ingreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ingreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ingreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ingreso_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoria="id_transaccion";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO:
					sNombreCampoCategoria="es_ingreso";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoriaValor="id_transaccion";
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO:
					sNombreCampoCategoriaValor="es_ingreso";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion");
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_ingreso");
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
	
	public void jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TransaccionIngresoEgresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioningresoegreso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioningresoegreso.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioningresoegreso.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO);
					iRow++;

					for(TransaccionIngresoEgreso transaccioningresoegreso:transaccioningresoegresosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transaccioningresoegreso.getes_ingreso());
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
			//	this.getFilaCabeceraExportarExcelTransaccionIngresoEgreso(row);				
			//	iRow++;
			//}				
			
			//for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransaccionIngresoEgreso(transaccioningresoegresoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
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
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
			
			//SI ES MANUAL
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
			
			//SI ES MANUAL
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
			
			//SI ES MANUAL
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransaccionIngresoEgreso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransaccionIngresoEgreso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransaccionIngresoEgreso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransaccionIngresoEgreso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransaccionIngresoEgreso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransaccionIngresoEgreso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransaccionIngresoEgreso.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransaccionIngresoEgreso.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransaccionIngresoEgreso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransaccionIngresoEgreso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransaccionIngresoEgreso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransaccionIngresoEgreso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransaccionIngresoEgreso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionIngresoEgreso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransaccionIngresoEgreso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransaccionIngresoEgreso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransaccionIngresoEgreso();
		
		this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionIngresoEgreso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionIngresoEgreso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionIngresoEgreso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionIngresoEgreso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransaccionIngresoEgreso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransaccionIngresoEgreso(Boolean esInicializar) throws Exception {
		try	{	
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransaccionIngresoEgreso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransaccionIngresoEgreso() throws Exception {
		try	{
			if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionIngresoEgreso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionIngresoEgreso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransaccionIngresoEgreso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransaccionIngresoEgreso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransaccionIngresoEgreso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransaccionIngresoEgreso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.addItem(reporte);
			}
			
			
			if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransaccionIngresoEgreso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransaccionIngresoEgreso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionIngresoEgreso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransaccionIngresoEgreso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransaccionIngresoEgreso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.getSelectedItem()!=null){this.id_transaccionFK_IdTransaccion=((Transaccion)this.jComboBoxid_transaccionFK_IdTransaccionTransaccionIngresoEgreso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransaccionIngresoEgreso(Boolean esInicializar) throws Exception {				
		if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransaccionIngresoEgreso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransaccionIngresoEgreso() throws Exception {
		this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransaccionIngresoEgreso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransaccionIngresoEgresoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgresoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransaccionIngresoEgreso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transaccioningresoegresos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransaccionIngresoEgreso.setModel(new TransaccionIngresoEgresoModel(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransaccionIngresoEgreso.setModel(new TransaccionIngresoEgresoModel(this.transaccioningresoegresos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransaccionIngresoEgreso!=null && this.jInternalFrameOrderByTransaccionIngresoEgreso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransaccionIngresoEgreso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,transaccioningresoegresoConstantesFunciones.resaltarSeleccionarTransaccionIngresoEgreso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO,transaccioningresoegresoConstantesFunciones.resaltarSeleccionarTransaccionIngresoEgreso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_ID));

		if(this.transaccioningresoegresoConstantesFunciones.mostraridTransaccionIngresoEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionIngresoEgresoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transaccioningresoegresoConstantesFunciones.resaltaridTransaccionIngresoEgreso,this.transaccioningresoegresoConstantesFunciones.activaridTransaccionIngresoEgreso,this,true,"idTransaccionIngresoEgreso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transaccioningresoegresoConstantesFunciones.resaltaridTransaccionIngresoEgreso,this.transaccioningresoegresoConstantesFunciones.activaridTransaccionIngresoEgreso,this,true,"idTransaccionIngresoEgreso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.transaccioningresoegresoConstantesFunciones.mostrarid_empresaTransaccionIngresoEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_empresaTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_empresaTransaccionIngresoEgreso));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_empresaTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_empresaTransaccionIngresoEgreso,false,"id_empresaTransaccionIngresoEgreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO));

		if(this.transaccioningresoegresoConstantesFunciones.mostrarid_moduloTransaccionIngresoEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_moduloTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_moduloTransaccionIngresoEgreso));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_moduloTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_moduloTransaccionIngresoEgreso,false,"id_moduloTransaccionIngresoEgreso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION));

		if(this.transaccioningresoegresoConstantesFunciones.mostrarid_transaccionTransaccionIngresoEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionsForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_transaccionTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_transaccionTransaccionIngresoEgreso));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionsForeignKey,this.transaccioningresoegresoConstantesFunciones.resaltarid_transaccionTransaccionIngresoEgreso,this,this.transaccioningresoegresoConstantesFunciones.activarid_transaccionTransaccionIngresoEgreso,true,"id_transaccionTransaccionIngresoEgreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO));

		if(this.transaccioningresoegresoConstantesFunciones.mostrares_ingresoTransaccionIngresoEgreso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.transaccioningresoegresoConstantesFunciones.resaltares_ingresoTransaccionIngresoEgreso,this.transaccioningresoegresoConstantesFunciones.activares_ingresoTransaccionIngresoEgreso));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.transaccioningresoegresoConstantesFunciones.resaltares_ingresoTransaccionIngresoEgreso,this.transaccioningresoegresoConstantesFunciones.activares_ingresoTransaccionIngresoEgreso,this,true,"es_ingresoTransaccionIngresoEgreso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransaccionIngresoEgresoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionIngresoEgreso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransaccionIngresoEgreso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransaccionIngresoEgreso.addColumn(tableColumn);
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
			
			this.jTableDatosTransaccionIngresoEgreso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransaccionIngresoEgreso.moveColumn(this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransaccionIngresoEgreso.moveColumn(this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransaccionIngresoEgreso.moveColumn(this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransaccionIngresoEgreso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransaccionIngresoEgreso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransaccionIngresoEgreso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransaccionIngresoEgreso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransaccionIngresoEgreso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransaccionIngresoEgreso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=transaccioningresoegresoLogic.getTransaccionIngresoEgresos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transaccioningresoegresos.size()-1;
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
		//this.jTableDatosTransaccionIngresoEgreso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransaccionIngresoEgreso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransaccionIngresoEgreso();
			
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
				
				//this.isEsNuevoTransaccionIngresoEgreso=false;
					
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
				if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionIngresoEgreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transaccioningresoegreso.getsType().equals("DUPLICADO")
				   || this.transaccioningresoegreso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransaccionIngresoEgreso=true;
				
				} else {
					this.isEsNuevoTransaccionIngresoEgreso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					if(this.transaccioningresoegreso.getId()>=0 && !this.transaccioningresoegreso.getIsNew()) {						
						this.isEsNuevoTransaccionIngresoEgreso=false;
						
					} else {
						this.isEsNuevoTransaccionIngresoEgreso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransaccionIngresoEgreso(esRelaciones);						
				
				this.seleccionarTransaccionIngresoEgreso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transaccioningresoegreso.getId()<0) {
					this.isEsNuevoTransaccionIngresoEgreso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransaccionIngresoEgreso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransaccionIngresoEgreso(evt,rowIndex);
				}	
				
				if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransaccionIngresoEgreso: " + this.dDif); 
					}
				}								
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransaccionIngresoEgreso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transaccioningresoegreso)) {
					if(this.transaccioningresoegreso.getId()>0) {
						this.transaccioningresoegreso.setIsDeleted(true);
						
						this.transaccioningresoegresosEliminados.add(this.transaccioningresoegreso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().remove(this.transaccioningresoegreso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegresos.remove(this.transaccioningresoegreso);				
					}
					
					
					((TransaccionIngresoEgresoModel) this.jTableDatosTransaccionIngresoEgreso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransaccionIngresoEgreso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransaccionIngresoEgreso) {
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransaccionIngresoEgreso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.transaccioningresoegresoConstantesFunciones.cargarid_empresaTransaccionIngresoEgreso || this.transaccioningresoegresoConstantesFunciones.event_dependid_empresaTransaccionIngresoEgreso) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.transaccioningresoegreso.getid_empresa());
									//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(transaccioningresoegreso.getEmpresa()!=null) {
							this.empresasForeignKey.add(transaccioningresoegreso.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.transaccioningresoegreso.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.transaccioningresoegresoConstantesFunciones.cargarid_moduloTransaccionIngresoEgreso || this.transaccioningresoegresoConstantesFunciones.event_dependid_moduloTransaccionIngresoEgreso) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.transaccioningresoegreso.getid_modulo());
									//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(transaccioningresoegreso.getModulo()!=null) {
							this.modulosForeignKey.add(transaccioningresoegreso.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.transaccioningresoegreso.getid_modulo(),false,"Formulario");

					//Transaccion
					if(!this.transaccioningresoegresoConstantesFunciones.cargarid_transaccionTransaccionIngresoEgreso || this.transaccioningresoegresoConstantesFunciones.event_dependid_transaccionTransaccionIngresoEgreso) {
						//this.cargarCombosTransaccionsForeignKeyLista(" where id="+this.transaccioningresoegreso.getid_transaccion());
									//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
						this.transaccionsForeignKey=new ArrayList<Transaccion>();

						if(transaccioningresoegreso.getTransaccion()!=null) {
							this.transaccionsForeignKey.add(transaccioningresoegreso.getTransaccion());
						}

						this.addItemDefectoCombosForeignKeyTransaccion();
						this.cargarCombosFrameTransaccionsForeignKey("Todos");
					}
					this.setActualTransaccionForeignKey(this.transaccioningresoegreso.getid_transaccion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransaccionIngresoEgreso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransaccionIngresoEgreso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransaccionIngresoEgreso(transaccioningresoegreso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(transaccioningresoegreso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransaccionIngresoEgreso(transaccioningresoegreso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransaccionIngresoEgreso(transaccioningresoegreso);
	}
	
	public void setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setText(transaccioningresoegreso.getId().toString());
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setSelected(transaccioningresoegreso.getes_ingreso());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransaccionIngresoEgreso transaccioningresoegresoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transaccioningresoegresoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransaccionIngresoEgreso transaccioningresoegresoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transaccioningresoegresoLocal=this.transaccioningresoegreso;
			} else {
				transaccioningresoegresoLocal=this.transaccioningresoegresoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transaccioningresoegresoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransaccionIngresoEgreso(transaccioningresoegresoLocal,true);
					
					if(transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transaccioningresoegresoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transaccioningresoegresoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(transaccioningresoegreso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(transaccioningresoegreso);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(transaccioningresoegreso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.getText()==null || this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.getText()=="" || this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.getText()=="Id") {
				this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setText("0");
			}

			if(conColumnasBase) {transaccioningresoegreso.setId(Long.parseLong(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionIngresoEgresoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelIdTransaccionIngresoEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transaccioningresoegreso.setes_ingreso(this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabeles_ingresoTransaccionIngresoEgreso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegresoBean,TransaccionIngresoEgreso transaccioningresoegreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && transaccioningresoegresoBean.getid_transaccion()!=null && !transaccioningresoegresoBean.getid_transaccion().equals(-1L))) {transaccioningresoegreso.setid_transaccion(transaccioningresoegresoBean.getid_transaccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegresoOrigen,TransaccionIngresoEgreso transaccioningresoegreso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioningresoegresoOrigen.getId()!=null && !transaccioningresoegresoOrigen.getId().equals(0L))) {transaccioningresoegreso.setId(transaccioningresoegresoOrigen.getId());}}
			if(conDefault || (!conDefault && transaccioningresoegresoOrigen.getid_transaccion()!=null && !transaccioningresoegresoOrigen.getid_transaccion().equals(-1L))) {transaccioningresoegreso.setid_transaccion(transaccioningresoegresoOrigen.getid_transaccion());}
			if(conDefault || (!conDefault && transaccioningresoegresoOrigen.getes_ingreso()!=null && !transaccioningresoegresoOrigen.getes_ingreso().equals(false))) {transaccioningresoegreso.setes_ingreso(transaccioningresoegresoOrigen.getes_ingreso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setText(transaccioningresoegreso.getId().toString());
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setSelected(transaccioningresoegreso.getes_ingreso());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransaccionIngresoEgreso(TransaccionIngresoEgresoBean transaccioningresoegresoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setText(transaccioningresoegresoBean.getId().toString());
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setSelected(transaccioningresoegresoBean.getes_ingreso());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransaccionIngresoEgreso(TransaccionIngresoEgresoParameterReturnGeneral transaccioningresoegresoReturnGeneral,TransaccionIngresoEgresoBean transaccioningresoegresoBean,Boolean conDefault) throws Exception { 
		try {
			TransaccionIngresoEgreso transaccioningresoegresoLocal=new TransaccionIngresoEgreso();
			
			transaccioningresoegresoLocal=transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transaccioningresoegresoLocal.getId()!=null && !transaccioningresoegresoLocal.getId().equals(0L))) {transaccioningresoegresoBean.setId(transaccioningresoegresoLocal.getId());}}
			if(conDefault || (!conDefault && transaccioningresoegresoLocal.getid_transaccion()!=null && !transaccioningresoegresoLocal.getid_transaccion().equals(-1L))) {transaccioningresoegresoBean.setid_transaccion(transaccioningresoegresoLocal.getid_transaccion());}
			if(conDefault || (!conDefault && transaccioningresoegresoLocal.getes_ingreso()!=null && !transaccioningresoegresoLocal.getes_ingreso().equals(false))) {transaccioningresoegresoBean.setes_ingreso(transaccioningresoegresoLocal.getes_ingreso());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransaccionIngresoEgresoGenerico(Long idTransaccionIngresoEgresoSeleccionado,JComboBox jComboBoxTransaccionIngresoEgreso,List<TransaccionIngresoEgreso> transaccioningresoegresosLocal)throws Exception {
		try {
			TransaccionIngresoEgreso  transaccioningresoegresoTemp=null;

			for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosLocal) {
				if(transaccioningresoegresoAux.getId()!=null && transaccioningresoegresoAux.getId().equals(idTransaccionIngresoEgresoSeleccionado)) {
					transaccioningresoegresoTemp=transaccioningresoegresoAux;
					break;
				}
			}

			jComboBoxTransaccionIngresoEgreso.setSelectedItem(transaccioningresoegresoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransaccionIngresoEgresoGenerico(JComboBox jComboBoxTransaccionIngresoEgreso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionIngresoEgreso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransaccionIngresoEgreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransaccionIngresoEgreso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransaccionIngresoEgreso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioningresoegreso=(TransaccionIngresoEgreso) transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioningresoegreso =(TransaccionIngresoEgreso) transaccioningresoegresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transaccioningresoegreso.getIsNew() && !transaccioningresoegreso.getIsChanged() && !transaccioningresoegreso.getIsDeleted()) {
				sDescripcion=transaccioningresoegreso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioningresoegreso.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!transaccioningresoegreso.getIsNew() && !transaccioningresoegreso.getIsChanged() && !transaccioningresoegreso.getIsDeleted()) {
				sDescripcion=transaccioningresoegreso.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioningresoegreso.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!transaccioningresoegreso.getIsNew() && !transaccioningresoegreso.getIsChanged() && !transaccioningresoegreso.getIsDeleted()) {
				sDescripcion=transaccioningresoegreso.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=transaccioningresoegreso.gettransaccion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransaccionIngresoEgreso transaccioningresoegresoRow=new TransaccionIngresoEgreso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioningresoegresoRow=(TransaccionIngresoEgreso) transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transaccioningresoegresoRow=(TransaccionIngresoEgreso) transaccioningresoegresos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));			
			this.jButtonDuplicarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso && this.isPermisoDuplicarTransaccionIngresoEgreso));			
			this.jButtonCopiarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso && this.isPermisoCopiarTransaccionIngresoEgreso));
			this.jButtonVerFormTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso && this.isPermisoVerFormTransaccionIngresoEgreso));
			
			this.jButtonAbrirOrderByTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));			
			
			this.jButtonNuevoRelacionesTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));			
			this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaModificarTransaccionIngresoEgreso && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso && this.isPermisoEliminarTransaccionIngresoEgreso));
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.setVisible(this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso);							
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));						
			this.jButtonDuplicarToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso && this.isPermisoDuplicarTransaccionIngresoEgreso));						
			this.jButtonCopiarToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso && this.isPermisoCopiarTransaccionIngresoEgreso));			
			this.jButtonVerFormToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso && this.isPermisoVerFormTransaccionIngresoEgreso));			
			this.jButtonAbrirOrderByToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));
			this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));			
			this.jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));			
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaModificarTransaccionIngresoEgreso && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso  && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso && this.isPermisoEliminarTransaccionIngresoEgreso));
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarToolBarTransaccionIngresoEgreso.setVisible(this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso);				
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));			
			this.jMenuItemDuplicarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso && this.isPermisoDuplicarTransaccionIngresoEgreso));			
			this.jMenuItemCopiarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso && this.isPermisoCopiarTransaccionIngresoEgreso));			
			this.jMenuItemVerFormTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso && this.isPermisoVerFormTransaccionIngresoEgreso));			
			this.jMenuItemAbrirOrderByTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));			
			//this.jMenuItemMostrarOcultarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));
			this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));			
			//this.jMenuItemDetalleMostrarOcultarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso && this.isPermisoOrdenTransaccionIngresoEgreso));			
			this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso));			
			this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso && this.isPermisoNuevoTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));									
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemModificarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaModificarTransaccionIngresoEgreso && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemActualizarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso && this.isPermisoActualizarTransaccionIngresoEgreso));	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemEliminarTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso && this.isPermisoEliminarTransaccionIngresoEgreso));
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemCancelarTransaccionIngresoEgreso.setVisible(this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso);				
			}
			
			this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));						
			this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=this.jButtonNuevoTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso=this.jButtonDuplicarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso=this.jButtonCopiarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso=this.jButtonVerFormTransaccionIngresoEgreso.isVisible();
			
			this.isVisibilidadCeldaOrdenTransaccionIngresoEgreso=this.jButtonAbrirOrderByTransaccionIngresoEgreso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=this.jButtonNuevoRelacionesTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=this.jButtonModificarTransaccionIngresoEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=this.jButtonNuevoToolBarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarToolBarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarToolBarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarToolBarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarToolBarTransaccionIngresoEgreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=this.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=this.jMenuItemNuevoTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso.isVisible();
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemModificarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemActualizarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemEliminarTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemCancelarTransaccionIngresoEgreso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransaccionIngresoEgreso(Boolean esInicializar) {
		if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
				//if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionIngresoEgreso();
			}
			
			this.inicializarActualizarBindingBotonesManualTransaccionIngresoEgreso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransaccionIngresoEgreso() {
		this.jButtonNuevoTransaccionIngresoEgreso.setVisible(this.isPermisoNuevoTransaccionIngresoEgreso);			
		this.jButtonDuplicarTransaccionIngresoEgreso.setVisible(this.isPermisoDuplicarTransaccionIngresoEgreso);			
		this.jButtonCopiarTransaccionIngresoEgreso.setVisible(this.isPermisoCopiarTransaccionIngresoEgreso);			
		this.jButtonVerFormTransaccionIngresoEgreso.setVisible(this.isPermisoVerFormTransaccionIngresoEgreso);			
		
		this.jButtonAbrirOrderByTransaccionIngresoEgreso.setVisible(this.isPermisoOrdenTransaccionIngresoEgreso);					
		
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.setVisible(this.isPermisoNuevoTransaccionIngresoEgreso);			
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarTransaccionIngresoEgreso.setVisible(this.isPermisoActualizarTransaccionIngresoEgreso);	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.setVisible(this.isPermisoActualizarTransaccionIngresoEgreso);	
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.setVisible(this.isPermisoEliminarTransaccionIngresoEgreso);
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.setVisible(this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso);						
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.setVisible(this.isPermisoGuardarCambiosTransaccionIngresoEgreso);							
		}
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setVisible(this.isPermisoActualizarTransaccionIngresoEgreso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionIngresoEgreso() {
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarTransaccionIngresoEgreso.setVisible(this.isPermisoActualizarTransaccionIngresoEgreso);	
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.setVisible(this.isPermisoActualizarTransaccionIngresoEgreso);	
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.setVisible(this.isPermisoEliminarTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.setVisible(this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso);							
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.setVisible((this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso && this.isPermisoGuardarCambiosTransaccionIngresoEgreso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransaccionIngresoEgreso() {
		if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransaccionIngresoEgreso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransaccionIngresoEgreso() {
	}
	
	public void jTableDatosTransaccionIngresoEgresoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransaccionIngresoEgreso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransaccionIngresoEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioningresoegreso==null) {
						this.transaccioningresoegreso = new TransaccionIngresoEgreso();
					}

					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}

				if(this.transaccioningresoegreso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transaccioningresoegreso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransaccionIngresoEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransaccionIngresoEgreso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionIngresoEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transaccioningresoegresoLogic.getConnexion());

				if(this.transaccioningresoegreso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transaccioningresoegreso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionIngresoEgreso=(TitledBorder)this.jScrollPanelDatosTransaccionIngresoEgreso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransaccionIngresoEgreso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransaccionIngresoEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioningresoegreso==null) {
						this.transaccioningresoegreso = new TransaccionIngresoEgreso();
					}

					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}

				if(this.transaccioningresoegreso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transaccioningresoegreso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTransaccionIngresoEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTransaccionIngresoEgreso(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionIngresoEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.transaccioningresoegresoLogic.getConnexion());

				if(this.transaccioningresoegreso.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.transaccioningresoegreso.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionIngresoEgreso=(TitledBorder)this.jScrollPanelDatosTransaccionIngresoEgreso.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTransaccionIngresoEgreso.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTransaccionIngresoEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioningresoegreso==null) {
						this.transaccioningresoegreso = new TransaccionIngresoEgreso();
					}

					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}

				if(this.transaccioningresoegreso.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.transaccioningresoegreso.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionTransaccionIngresoEgresoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebTransaccionIngresoEgreso(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransaccionIngresoEgreso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransaccionIngresoEgreso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transaccioningresoegresoLogic.getConnexion());

				if(this.transaccioningresoegreso.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.transaccioningresoegreso.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransaccionIngresoEgreso=(TitledBorder)this.jScrollPanelDatosTransaccionIngresoEgreso.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderTransaccionIngresoEgreso.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionTransaccionIngresoEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioningresoegreso==null) {
						this.transaccioningresoegreso = new TransaccionIngresoEgreso();
					}

					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}

				if(this.transaccioningresoegreso.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.transaccioningresoegreso.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_ingresoTransaccionIngresoEgresoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.gettransaccioningresoegreso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transaccioningresoegreso==null) {
						this.transaccioningresoegreso = new TransaccionIngresoEgreso();
					}

					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);
				}

				if(this.transaccioningresoegreso.getes_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_ingreso = "+this.transaccioningresoegreso.getes_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);

			this.getTransaccionIngresoEgresosFK_IdEmpresa();

			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);

			//if(TransaccionIngresoEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);

			this.getTransaccionIngresoEgresosFK_IdModulo();

			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);

			//if(TransaccionIngresoEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionTransaccionIngresoEgresoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);

			this.getTransaccionIngresoEgresosFK_IdTransaccion();

			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);

			//if(TransaccionIngresoEgresoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transaccioningresoegresoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransaccionIngresoEgreso() {
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.dispose();
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
			this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.dispose();
			this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso=null;
		}
		
		if(this.jInternalFrameImportacionTransaccionIngresoEgreso!=null) {
			this.jInternalFrameImportacionTransaccionIngresoEgreso.setVisible(false);	    			
			this.jInternalFrameImportacionTransaccionIngresoEgreso.dispose();
			this.jInternalFrameImportacionTransaccionIngresoEgreso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransaccionIngresoEgreso();
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransaccionIngresoEgreso")) {
				jButtonDuplicarTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransaccionIngresoEgreso")) {
				jButtonCopiarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransaccionIngresoEgreso")) {
				jButtonVerFormTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransaccionIngresoEgreso")) {
				jButtonDuplicarTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransaccionIngresoEgreso")) {
				jButtonDuplicarTransaccionIngresoEgresoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransaccionIngresoEgreso")) {
				jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransaccionIngresoEgreso")) {
				jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransaccionIngresoEgreso")) {
				jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransaccionIngresoEgreso")) {
				jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransaccionIngresoEgreso")) {
				jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransaccionIngresoEgreso")) {
				jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransaccionIngresoEgreso")) {
				jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransaccionIngresoEgreso")) {
				jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransaccionIngresoEgreso")) {
				jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransaccionIngresoEgreso")) {
				jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransaccionIngresoEgreso")) {
				jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransaccionIngresoEgreso")) {
				jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransaccionIngresoEgreso")) {
				jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransaccionIngresoEgreso")) {
				jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransaccionIngresoEgreso")) {
				jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransaccionIngresoEgreso")) {
				jButtonMostrarOcultarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransaccionIngresoEgreso")) {
				jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransaccionIngresoEgreso")) {
				jButtonCopiarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransaccionIngresoEgreso")) {
				jButtonVerFormTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransaccionIngresoEgreso")) {
				jButtonCopiarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransaccionIngresoEgreso")) {
				jButtonVerFormTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransaccionIngresoEgreso")) {
				jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransaccionIngresoEgreso")) {
				jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransaccionIngresoEgreso")) {
				jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransaccionIngresoEgreso")) {
				jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransaccionIngresoEgreso")) {
				jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransaccionIngresoEgreso")) {
				jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransaccionIngresoEgreso")) {
				jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransaccionIngresoEgreso")) {
				jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransaccionIngresoEgreso")) {
				jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransaccionIngresoEgreso") || sTipo.equals("MenuItemDetalleAbrirOrderByTransaccionIngresoEgreso")) {
				jButtonAbrirOrderByTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransaccionIngresoEgreso") || sTipo.equals("MenuItemDetalleMostrarOcultarTransaccionIngresoEgreso")) {
				jButtonMostrarOcultarTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionIngresoEgreso")) {
				jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransaccionIngresoEgreso")) {
				jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransaccionIngresoEgreso")) {
				jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransaccionIngresoEgreso")) {
				jButtonCerrarReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransaccionIngresoEgreso")) {
				jButtonGenerarReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransaccionIngresoEgreso")) {
				
				jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransaccionIngresoEgreso")) {
				jButtonCerrarImportacionTransaccionIngresoEgresoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransaccionIngresoEgreso")) {
				
				jButtonGenerarImportacionTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransaccionIngresoEgreso")) {
				
				jButtonAbrirImportacionTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransaccionIngresoEgreso")) {
				jComboBoxTiposAccionesTransaccionIngresoEgresoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransaccionIngresoEgreso")) {
				jComboBoxTiposRelacionesTransaccionIngresoEgresoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransaccionIngresoEgreso")) {
				jComboBoxTiposAccionesTransaccionIngresoEgresoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransaccionIngresoEgreso")) {
				
				jComboBoxTiposSeleccionarTransaccionIngresoEgresoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransaccionIngresoEgreso")) {
				jTextFieldValorCampoGeneralTransaccionIngresoEgresoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransaccionIngresoEgreso")) {
				jButtonAbrirOrderByTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransaccionIngresoEgreso")) {
				jButtonAbrirOrderByTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransaccionIngresoEgreso")) {
				jButtonCerrarOrderByTransaccionIngresoEgresoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionIngresoEgresoBusqueda")) {
				this.jButtonidTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_empresaTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_empresaTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_moduloTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_moduloTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_transaccionTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_transaccionTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_ingresoTransaccionIngresoEgresoBusqueda")) {
				this.jButtones_ingresoTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTransaccionTransaccionIngresoEgreso")) {
				this.jButtonFK_IdTransaccionTransaccionIngresoEgresoActionPerformed(evt);
			}
			
			;
			
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransaccionIngresoEgreso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransaccionIngresoEgreso transaccioningresoegresoLocal=null;
			
			if(!this.getEsControlTabla()) {
				transaccioningresoegresoLocal=this.transaccioningresoegreso;
			} else {
				transaccioningresoegresoLocal=this.transaccioningresoegresoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
							
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
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
			
			


			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
								
						
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
								
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
							
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
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
			
			


			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
								
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransaccionIngresoEgreso")) {
					jCheckBoxSeleccionarTodosTransaccionIngresoEgresoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransaccionIngresoEgreso")) {
					jCheckBoxSeleccionadosTransaccionIngresoEgresoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransaccionIngresoEgreso")) {
					
				}
				
				


				
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
												
				
				


				
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
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
			
			


			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transaccioningresoegreso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transaccioningresoegreso);
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
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
				
				


				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransaccionIngresoEgreso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransaccionIngresoEgreso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransaccionIngresoEgresoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transaccioningresoegresoAnterior =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransaccionIngresoEgreso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransaccionIngresoEgresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransaccionIngresoEgreso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transaccioningresoegreso =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transaccioningresoegreso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransaccionIngresoEgreso")) {
				
				}
				
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransaccionIngresoEgreso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransaccionIngresoEgreso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransaccionIngresoEgreso")) {
			
			}
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransaccionIngresoEgreso();
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			if(sTipo.equals("NuevoTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransaccionIngresoEgreso")) {
				jButtonDuplicarTransaccionIngresoEgresoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransaccionIngresoEgreso")) {
				jButtonCopiarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransaccionIngresoEgreso")) {
				jButtonVerFormTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransaccionIngresoEgreso")) {
				jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransaccionIngresoEgreso")) {
				jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransaccionIngresoEgreso")) {
				jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransaccionIngresoEgreso")) {
				jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransaccionIngresoEgreso")) {
				jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransaccionIngresoEgreso")) {
				jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransaccionIngresoEgreso")) {
				jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransaccionIngresoEgreso")) {
				jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransaccionIngresoEgreso")) {
				jButtonAbrirOrderByTransaccionIngresoEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransaccionIngresoEgreso")) {
				jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransaccionIngresoEgreso")) {
				jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransaccionIngresoEgreso")) {
				jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransaccionIngresoEgresoBusqueda")) {
				this.jButtonidTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_empresaTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_empresaTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_moduloTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_moduloTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionTransaccionIngresoEgresoUpdate")) {
				this.jButtonid_transaccionTransaccionIngresoEgresoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionTransaccionIngresoEgresoBusqueda")) {
				this.jButtonid_transaccionTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_ingresoTransaccionIngresoEgresoBusqueda")) {
				this.jButtones_ingresoTransaccionIngresoEgresoBusquedaActionPerformed(evt);
			}
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransaccionIngresoEgreso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransaccionIngresoEgreso")) {
				closingInternalFrameTransaccionIngresoEgreso();
				
			} else if(sTipo.equals("jButtonCancelarTransaccionIngresoEgreso")) {
				JInternalFrameBase jInternalFrameDetalleFormTransaccionIngresoEgreso = (JInternalFrameBase)evt.getSource();
	            	
	            TransaccionIngresoEgresoBeanSwingJInternalFrame jInternalFrameParent=(TransaccionIngresoEgresoBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionIngresoEgreso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransaccionIngresoEgresoActionPerformed(null);
			}
			
			TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transaccioningresoegreso,new Object(),this.transaccioningresoegresoParameterGeneral,this.transaccioningresoegresoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransaccionIngresoEgreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransaccionIngresoEgreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransaccionIngresoEgreso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transaccioningresoegreso)) {
			if(!esControlTabla) {
				if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);			
				}
				
				if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.procesarEventosTransaccionIngresoEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this.transaccioningresoegreso,this.transaccioningresoegresoParameterGeneral,this.isEsNuevoTransaccionIngresoEgreso,classes);//this.transaccioningresoegresoLogic.getTransaccionIngresoEgreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral,this.transaccioningresoegresoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionIngresoEgreso(classes,this.transaccioningresoegresoReturnGeneral,this.transaccioningresoegresoBean,false);
					}
						
					if(this.transaccioningresoegresoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso());	
					}
						
					if(this.transaccioningresoegresoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso(),classes);//this.transaccioningresoegresoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransaccionIngresoEgreso(this.transaccioningresoegreso,classes);//this.transaccioningresoegresoBean);									
				}
			
				if(TransaccionIngresoEgresoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransaccionIngresoEgreso(this.transaccioningresoegreso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransaccionIngresoEgreso(this.transaccioningresoegreso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transaccioningresoegresoAnterior!=null) {
						this.transaccioningresoegreso=this.transaccioningresoegresoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.procesarEventosTransaccionIngresoEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this.transaccioningresoegreso,this.transaccioningresoegresoParameterGeneral,this.isEsNuevoTransaccionIngresoEgreso,classes);//this.transaccioningresoegresoLogic.getTransaccionIngresoEgreso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso(),transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso(),this.transaccioningresoegresos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransaccionIngresoEgreso.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransaccionIngresoEgreso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransaccionIngresoEgreso();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransaccionIngresoEgreso() throws Exception {
		
		TransaccionIngresoEgresoModel transaccioningresoegresoModel=(TransaccionIngresoEgresoModel)this.jTableDatosTransaccionIngresoEgreso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transaccioningresoegresoModel.transaccioningresoegresos=this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transaccioningresoegresoModel.transaccioningresoegresos=this.transaccioningresoegresos;
		}
		
		
		((TransaccionIngresoEgresoModel) this.jTableDatosTransaccionIngresoEgreso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransaccionIngresoEgreso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransaccioningresoegresoAnterior(),this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransaccioningresoegresoAnterior(),this.transaccioningresoegresos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransaccionIngresoEgreso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
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
										
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioningresoegreso,new Object(),generalEntityParameterGeneral,this.transaccioningresoegresoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransaccionIngresoEgresoConstantesFunciones.getClassesRelationshipsOfTransaccionIngresoEgreso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransaccionIngresoEgresoConstantesFunciones.getClassesRelationshipsFromStringsOfTransaccionIngresoEgreso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransaccionIngresoEgreso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transaccioningresoegreso,new Object(),generalEntityParameterGeneral,this.transaccioningresoegresoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransaccionIngresoEgreso(TransaccionIngresoEgresoBean transaccioningresoegresoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransaccionIngresoEgreso(ArrayList<Classe> classes,TransaccionIngresoEgresoReturnGeneral transaccioningresoegresoReturnGeneral,TransaccionIngresoEgresoBean transaccioningresoegresoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transaccioningresoegreso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso = new TransaccionIngresoEgresoDetalleFormJInternalFrame(jDesktopPane,this.transaccioningresoegresoSessionBean.getConGuardarRelaciones(),this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setVisible(false);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.transaccioningresoegresoLogic=this.transaccioningresoegresoLogic;
		
		this.cargarCombosFrameForeignKeyTransaccionIngresoEgreso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransaccionIngresoEgreso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransaccionIngresoEgreso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransaccionIngresoEgreso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransaccionIngresoEgreso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionIngresoEgreso"));
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ModificarTransaccionIngresoEgreso"));

		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionIngresoEgreso"));
					
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemModificarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionIngresoEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionIngresoEgreso"));
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionIngresoEgreso"));
						
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemActualizarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionIngresoEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"EliminarTransaccionIngresoEgreso"));
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionIngresoEgreso"));
								
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemEliminarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionIngresoEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CancelarTransaccionIngresoEgreso"));
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionIngresoEgreso"));
					
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemCancelarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionIngresoEgreso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemDetalleCerrarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionIngresoEgreso"));		
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionIngresoEgreso"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionIngresoEgreso"));
		
		
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionIngresoEgreso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonidTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtones_ingresoTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"es_ingresoTransaccionIngresoEgresoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionIngresoEgreso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransaccionIngresoEgreso"));
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransaccionIngresoEgreso"));
		}
		
		this.jTableDatosTransaccionIngresoEgreso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransaccionIngresoEgreso"));
		
		this.jTableDatosTransaccionIngresoEgreso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransaccionIngresoEgreso"));
		
		this.jButtonNuevoTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"NuevoTransaccionIngresoEgreso"));
		
		this.jButtonDuplicarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"DuplicarTransaccionIngresoEgreso"));
		
		this.jButtonCopiarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"CopiarTransaccionIngresoEgreso"));
		
		this.jButtonVerFormTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"VerFormTransaccionIngresoEgreso"));
		
		
		this.jButtonNuevoToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransaccionIngresoEgreso"));
			
		this.jButtonDuplicarToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemNuevoTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransaccionIngresoEgreso"));
			
		this.jMenuItemDuplicarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransaccionIngresoEgreso"));		
		
		
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransaccionIngresoEgreso"));
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransaccionIngresoEgreso"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ModificarTransaccionIngresoEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonModificarToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransaccionIngresoEgreso"));
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemModificarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransaccionIngresoEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"ActualizarTransaccionIngresoEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonActualizarToolBarTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransaccionIngresoEgreso"));
				
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemActualizarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransaccionIngresoEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"EliminarTransaccionIngresoEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonEliminarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransaccionIngresoEgreso"));
						
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemEliminarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransaccionIngresoEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CancelarTransaccionIngresoEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonCancelarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransaccionIngresoEgreso"));
			
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemCancelarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransaccionIngresoEgreso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransaccionIngresoEgreso"));		
		
		
		this.jButtonCerrarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CerrarTransaccionIngresoEgreso"));
		
		
		this.jButtonCerrarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemCerrarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransaccionIngresoEgreso"));
			
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jMenuItemDetalleCerrarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransaccionIngresoEgreso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransaccionIngresoEgreso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransaccionIngresoEgreso"));
		}
		
		this.jButtonCopiarToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransaccionIngresoEgreso"));
			
		this.jButtonVerFormToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransaccionIngresoEgreso"));
		
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransaccionIngresoEgreso"));
			
		this.jMenuItemCopiarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransaccionIngresoEgreso"));		
		
		this.jMenuItemVerFormTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransaccionIngresoEgreso"));		
		
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionIngresoEgreso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransaccionIngresoEgreso"));		
		
		
		
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransaccionIngresoEgreso"));
					
		this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransaccionIngresoEgreso"));
		
		this.jMenuItemRecargarInformacionTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransaccionIngresoEgreso"));		
		
		
		
		this.jButtonAnterioresTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"AnterioresTransaccionIngresoEgreso"));
		
		
		this.jButtonAnterioresToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransaccionIngresoEgreso"));
		
		this.jMenuItemAnterioresTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransaccionIngresoEgreso"));		
		
		
		this.jButtonSiguientesTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"SiguientesTransaccionIngresoEgreso"));
		
		
		this.jButtonSiguientesToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemSiguientesTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransaccionIngresoEgreso"));
			
		this.jMenuItemAbrirOrderByTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransaccionIngresoEgreso"));
			
		this.jMenuItemMostrarOcultarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransaccionIngresoEgreso"));
			
		this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransaccionIngresoEgreso"));
			
		this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransaccionIngresoEgreso"));		
		
		
		this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransaccionIngresoEgreso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransaccionIngresoEgreso"));
			
		this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransaccionIngresoEgreso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransaccionIngresoEgreso"));

		this.jCheckBoxSeleccionadosTransaccionIngresoEgreso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransaccionIngresoEgreso"));
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransaccionIngresoEgreso"));
		}
		
		
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransaccionIngresoEgreso"));
			
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"TiposAccionesTransaccionIngresoEgreso"));
					
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransaccionIngresoEgreso"));
			
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransaccionIngresoEgreso"));		
		
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonidTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtones_ingresoTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"es_ingresoTransaccionIngresoEgresoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTransaccionTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionTransaccionIngresoEgreso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso!=null) {
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionIngresoEgreso"));
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionIngresoEgreso"));
				this.jInternalFrameReporteDinamicoTransaccionIngresoEgreso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionIngresoEgreso"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransaccionIngresoEgreso"));				
			//this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransaccionIngresoEgreso"));
			//this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransaccionIngresoEgreso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransaccionIngresoEgreso!=null) {
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransaccionIngresoEgreso"));
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransaccionIngresoEgreso"));
				this.jInternalFrameImportacionTransaccionIngresoEgreso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransaccionIngresoEgreso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransaccionIngresoEgreso"));
			
			this.jButtonAbrirOrderByToolBarTransaccionIngresoEgreso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransaccionIngresoEgreso"));			
			
			if(this.jInternalFrameOrderByTransaccionIngresoEgreso!=null) {
				this.jInternalFrameOrderByTransaccionIngresoEgreso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransaccionIngresoEgreso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jTabbedPaneRelacionesTransaccionIngresoEgreso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransaccionIngresoEgreso"));
		
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
            		closingInternalFrameTransaccionIngresoEgreso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransaccionIngresoEgreso = (JInternalFrameBase)event.getSource();
	            	
	            TransaccionIngresoEgresoBeanSwingJInternalFrame jInternalFrameParent=(TransaccionIngresoEgresoBeanSwingJInternalFrame)jInternalFrameDetalleFormTransaccionIngresoEgreso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransaccionIngresoEgresoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransaccionIngresoEgreso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransaccionIngresoEgresoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransaccionIngresoEgreso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransaccionIngresoEgreso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoRelacionesTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransaccionIngresoEgresoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransaccionIngresoEgreso";
		inputMap = this.jButtonModificarTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransaccionIngresoEgreso";
		inputMap = this.jButtonActualizarTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransaccionIngresoEgreso";
		inputMap = this.jButtonEliminarTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransaccionIngresoEgreso";
		inputMap = this.jButtonCancelarTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransaccionIngresoEgreso";
		inputMap = this.jButtonCerrarTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransaccionIngresoEgreso";
		inputMap = this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonGuardarCambiosTransaccionIngresoEgreso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransaccionIngresoEgreso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransaccionIngresoEgresoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransaccionIngresoEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransaccionIngresoEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransaccionIngresoEgresoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonidTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"idTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_empresaTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_moduloTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTransaccionIngresoEgresoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransaccionIngresoEgresoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jButtones_ingresoTransaccionIngresoEgresoBusqueda.addActionListener(new ButtonActionListener(this,"es_ingresoTransaccionIngresoEgresoBusqueda"));
		
		
		this.jButtonFK_IdTransaccionTransaccionIngresoEgreso.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionTransaccionIngresoEgreso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransaccionIngresoEgreso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransaccionIngresoEgresoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransaccionIngresoEgresoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransaccionIngresoEgreso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransaccionIngresoEgreso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
					transaccioningresoegresoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresos) {
					transaccioningresoegresoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransaccionIngresoEgresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
						transaccioningresoegresoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresos) {
						transaccioningresoegresoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
					
						if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO)) {
							existe=true;
							transaccioningresoegresoAux.setes_ingreso(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresos) {
						
						if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO)) {
							existe=true;
							transaccioningresoegresoAux.setes_ingreso(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionIngresoEgreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionIngresoEgreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransaccionIngresoEgresoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransaccionIngresoEgreso.getSelectedRows();
			
			TransaccionIngresoEgreso transaccioningresoegresoLocal=new TransaccionIngresoEgreso();
			
			//this.seleccionarTodosTransaccionIngresoEgreso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccioningresoegresoLocal =(TransaccionIngresoEgreso) this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos().toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transaccioningresoegresoLocal =(TransaccionIngresoEgreso) this.transaccioningresoegresos.toArray()[this.jTableDatosTransaccionIngresoEgreso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transaccioningresoegresoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
						transaccioningresoegresoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresos) {
						transaccioningresoegresoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransaccionIngresoEgreso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransaccionIngresoEgreso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransaccionIngresoEgreso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransaccionIngresoEgresoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransaccionIngresoEgresoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransaccionIngresoEgresoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransaccionIngresoEgreso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransaccionIngresoEgresoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransaccionIngresoEgreso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransaccionIngresoEgreso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransaccionIngresoEgreso) {				
					conSplash=true;//false;										
					
					//this.startProcessTransaccionIngresoEgreso(conSplash);
				
					this.generarReporteTransaccionIngresoEgresosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransaccionIngresoEgresosSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionIngresoEgresosSeleccionados(false);
				//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransaccionIngresoEgresosSeleccionados(true);
				//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionIngresoEgreso();
				
				this.exportarTransaccionIngresoEgresosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransaccionIngresoEgresos();
				//this.importarTransaccionIngresoEgresos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransaccionIngresoEgreso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransaccionIngresoEgresosSeleccionados();
				//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transaccion Ingreso Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransaccionIngresoEgreso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransaccionIngresoEgreso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransaccionIngresoEgreso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
				}	
			} 			
			else if(TransaccionIngresoEgresoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransaccionIngresoEgreso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransaccionIngresoEgreso(conSplash);
					
						//this.actualizarParametrosGeneralTransaccionIngresoEgreso();
						
						this.generarReporteProcesoAccionTransaccionIngresoEgresosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Transaccion Ingreso EgresoES SELECCIONADOS?", "MANTENIMIENTO DE Transaccion Ingreso Egreso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransaccionIngresoEgreso();
				
						this.actualizarParametrosGeneralTransaccionIngresoEgreso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transaccioningresoegresoReturnGeneral=transaccioningresoegresoLogic.procesarAccionTransaccionIngresoEgresosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos(),this.transaccioningresoegresoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransaccionIngresoEgresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransaccionIngresoEgreso();
					
					TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransaccionIngresoEgresoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransaccionIngresoEgreso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransaccionIngresoEgresoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransaccionIngresoEgreso();
			
			if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
			TransaccionIngresoEgreso transaccioningresoegreso=new TransaccionIngresoEgreso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransaccionIngresoEgreso.getSelectedItem();
			
			
			
			
			transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
			//this.sTipoAccion;
			
			if(transaccioningresoegresosSeleccionados.size()==1) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
					transaccioningresoegreso=transaccioningresoegresoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransaccionIngresoEgreso();
			
      		//this.finishProcessTransaccionIngresoEgreso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransaccionIngresoEgresoReturnGeneral() throws Exception {
		if(this.transaccioningresoegresoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transaccioningresoegresoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transaccioningresoegresoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transaccioningresoegresoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transaccioningresoegresoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transaccioningresoegresoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
		}
		
		if(this.transaccioningresoegresoReturnGeneral.getConRetornoLista() || this.transaccioningresoegresoReturnGeneral.getConRetornoObjeto()) {
			if(this.transaccioningresoegresoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioningresoegresoLogic.setTransaccionIngresoEgresos(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgresos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transaccioningresoegresoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transaccioningresoegresoLogic.setTransaccionIngresoEgreso(this.transaccioningresoegresoReturnGeneral.getTransaccionIngresoEgreso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransaccionIngresoEgreso(false);
		}
	}
	
	public void actualizarParametrosGeneralTransaccionIngresoEgreso() throws Exception {
		
		
	}
	
	public ArrayList<TransaccionIngresoEgreso> getTransaccionIngresoEgresosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransaccionIngresoEgreso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresoLogic.getTransaccionIngresoEgresos()) {
					if(transaccioningresoegresoAux.getIsSelected()) {
						transaccioningresoegresosSeleccionados.add(transaccioningresoegresoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransaccionIngresoEgreso transaccioningresoegresoAux:this.transaccioningresoegresos) {
					if(transaccioningresoegresoAux.getIsSelected()) {
						transaccioningresoegresosSeleccionados.add(transaccioningresoegresoAux);				
					}
				}
			}
			
			if(transaccioningresoegresosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transaccioningresoegresosSeleccionados.addAll(this.transaccioningresoegresoLogic.getTransaccionIngresoEgresos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transaccioningresoegresosSeleccionados.addAll(this.transaccioningresoegresos);				
					}
				}
			}
		} else {
			transaccioningresoegresosSeleccionados.add(this.transaccioningresoegreso);
		}
		
		return transaccioningresoegresosSeleccionados;
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
	
	public void generarReporteTransaccionIngresoEgresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransaccionIngresoEgresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransaccionIngresoEgresosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionIngresoEgresosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransaccionIngresoEgresosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transaccion Ingreso Egreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados);
		
	}	
	
	public void generarReporteNormalTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransaccionIngresoEgresosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransaccionIngresoEgreso();
		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransaccionIngresoEgreso();
		
		
		//this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados ,transaccioningresoegresoImplementable,transaccioningresoegresoImplementableHome);
	}
	
	public void mostrarImportacionTransaccionIngresoEgresos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransaccionIngresoEgreso();
		
		this.abrirFrameImportacionTransaccionIngresoEgreso();		
		
			
		//this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados ,transaccioningresoegresoImplementable,transaccioningresoegresoImplementableHome);
	}
	
	public void importarTransaccionIngresoEgresos() throws Exception {		
	
	}
	
	public void exportarTransaccionIngresoEgresosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransaccionIngresoEgresosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransaccionIngresoEgresosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransaccionIngresoEgresosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transaccion Ingreso Egreso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransaccionIngresoEgreso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransaccionIngresoEgreso(transaccioningresoegresoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transaccioningresoegresoAux.setsDetalleGeneralEntityReporte(transaccioningresoegresoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransaccionIngresoEgreso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transaccioningresoegreso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioningresoegreso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioningresoegreso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioningresoegreso.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioningresoegreso.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transaccioningresoegreso.getes_ingreso().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransaccionIngresoEgresos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransaccionIngresoEgreso(row);				
				iRow++;
			}				
			
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransaccionIngresoEgreso(transaccioningresoegresoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransaccionIngresoEgresosSeleccionados() throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();		
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transaccioningresoegreso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transaccioningresoegresos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transaccioningresoegreso");
			//elementRoot.appendChild(element);
		
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
				element = document.createElement("transaccioningresoegreso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransaccionIngresoEgreso(transaccioningresoegresoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transaccion Ingreso Egreso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransaccionIngresoEgreso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioningresoegreso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioningresoegreso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioningresoegreso.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioningresoegreso.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transaccioningresoegreso.getes_ingreso());				
	}
	
	public void setFilaDatosExportarXmlTransaccionIngresoEgreso(TransaccionIngresoEgreso transaccioningresoegreso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransaccionIngresoEgresoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transaccioningresoegreso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransaccionIngresoEgresoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transaccioningresoegreso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransaccionIngresoEgresoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transaccioningresoegreso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(TransaccionIngresoEgresoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(transaccioningresoegreso.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtransaccion_descripcion = document.createElement(TransaccionIngresoEgresoConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(transaccioningresoegreso.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementes_ingreso = document.createElement(TransaccionIngresoEgresoConstantesFunciones.ESINGRESO);
		elementes_ingreso.appendChild(document.createTextNode(transaccioningresoegreso.getes_ingreso().toString().trim()));
		element.appendChild(elementes_ingreso);
	}
	
	public void generarReporteGroupGenericoTransaccionIngresoEgresosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados=new ArrayList<TransaccionIngresoEgreso>();
		
		transaccioningresoegresosSeleccionados=this.getTransaccionIngresoEgresosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransaccionIngresoEgreso(transaccioningresoegresosSeleccionados);
		
		this.generarReporteTransaccionIngresoEgresos("Todos",transaccioningresoegresosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransaccionIngresoEgreso(ArrayList<TransaccionIngresoEgreso> transaccioningresoegresosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransaccionIngresoEgreso transaccioningresoegresoAux:transaccioningresoegresosSeleccionados) {
				transaccioningresoegresoAux.setsDetalleGeneralEntityReporte(transaccioningresoegresoAux.toString());
			
				if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transaccioningresoegresoAux.setsDescripcionGeneralEntityReporte1(transaccioningresoegresoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					transaccioningresoegresoAux.setsDescripcionGeneralEntityReporte1(transaccioningresoegresoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					transaccioningresoegresoAux.setsDescripcionGeneralEntityReporte1(transaccioningresoegresoAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO)) {
					existe=true;
					transaccioningresoegresoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(transaccioningresoegresoAux.getes_ingreso()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransaccionIngresoEgresoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransaccionIngresoEgreso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=true;
				this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=true;
				this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=true;
			}
			
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=true;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaModificarTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaCancelarTransaccionIngresoEgreso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				} else {
					this.isVisibilidadCeldaGuardarTransaccionIngresoEgreso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=true;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=true;
		} else {
			this.actualizarEstadoPanelsTransaccionIngresoEgreso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransaccionIngresoEgreso=false;
			//this.isVisibilidadCeldaVerFormTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaDuplicarTransaccionIngresoEgreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
		} else {
			this.isVisibilidadCeldaNuevoTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaGuardarCambiosTransaccionIngresoEgreso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			if(!transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;												
			}
			
			this.jButtonCerrarTransaccionIngresoEgreso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransaccionIngresoEgreso=false;
		}
		
		if(!this.permiteMantenimiento(this.transaccioningresoegreso)) {
			this.isVisibilidadCeldaActualizarTransaccionIngresoEgreso=false;
			this.isVisibilidadCeldaEliminarTransaccionIngresoEgreso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransaccionIngresoEgreso() {
	}
	
	public void actualizarEstadoPanelsTransaccionIngresoEgreso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransaccionIngresoEgreso!=null) {
				this.jScrollPanelDatosTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransaccionIngresoEgreso!=null) {
				this.jPanelPaginacionTransaccionIngresoEgreso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
					this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso!=null) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransaccionIngresoEgreso!=null) {
				this.jPanelParametrosReportesTransaccionIngresoEgreso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTransaccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasTransaccionIngresoEgreso.remove(jPanelFK_IdTransaccionTransaccionIngresoEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdTransaccion=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasTransaccionIngresoEgreso.remove(jPanelFK_IdTransaccionTransaccionIngresoEgreso);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadFK_IdTransaccion=isParaTransaccion;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasTransaccionIngresoEgreso.remove(jPanelFK_IdTransaccionTransaccionIngresoEgreso);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransaccionIngresoEgresoSessionBean transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		
		if(this.transaccioningresoegresoSessionBean==null) {
			this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		}
		
		this.transaccioningresoegresoSessionBean.setsUltimaBusquedaTransaccionIngresoEgreso(this.getsAccionBusqueda());
		this.transaccioningresoegresoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transaccioningresoegresoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			transaccioningresoegresoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			transaccioningresoegresoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
			transaccioningresoegresoSessionBean.setid_transaccion(this.getid_transaccionFK_IdTransaccion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransaccionIngresoEgresoSessionBean transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		
		if(this.transaccioningresoegresoSessionBean==null) {
			this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		}
		
		if(this.transaccioningresoegresoSessionBean.getsUltimaBusquedaTransaccionIngresoEgreso()!=null&&!this.transaccioningresoegresoSessionBean.getsUltimaBusquedaTransaccionIngresoEgreso().equals("")) {
			this.setsAccionBusqueda(transaccioningresoegresoSessionBean.getsUltimaBusquedaTransaccionIngresoEgreso());
			this.setiNumeroPaginacion(transaccioningresoegresoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transaccioningresoegresoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(transaccioningresoegresoSessionBean.getid_empresa());
				transaccioningresoegresoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(transaccioningresoegresoSessionBean.getid_modulo());
				transaccioningresoegresoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
				this.setid_transaccionFK_IdTransaccion(transaccioningresoegresoSessionBean.getid_transaccion());
				transaccioningresoegresoSessionBean.setid_transaccion(-1L);
			}
		}
		
		this.transaccioningresoegresoSessionBean.setsUltimaBusquedaTransaccionIngresoEgreso("");
		this.transaccioningresoegresoSessionBean.setiNumeroPaginacion(TransaccionIngresoEgresoConstantesFunciones.INUMEROPAGINACION);
		this.transaccioningresoegresoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransaccionIngresoEgreso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransaccionIngresoEgreso() {
		this.updateBorderResaltarBusquedasFormularioTransaccionIngresoEgreso();
		this.updateVisibilidadBusquedasFormularioTransaccionIngresoEgreso();
		this.updateHabilitarBusquedasFormularioTransaccionIngresoEgreso();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransaccionIngresoEgreso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponents().length>0) {
	

		if(this.transaccioningresoegresoConstantesFunciones.resaltarFK_IdTransaccionTransaccionIngresoEgreso!=null) {
			index= this.jTabbedPaneBusquedasTransaccionIngresoEgreso.indexOfComponent(this.jPanelFK_IdTransaccionTransaccionIngresoEgreso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponent(index);
				jPanel.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltarFK_IdTransaccionTransaccionIngresoEgreso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransaccionIngresoEgreso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionIngresoEgreso.indexOfComponent(this.jPanelFK_IdTransaccionTransaccionIngresoEgreso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarFK_IdTransaccionTransaccionIngresoEgreso);
			if(!this.transaccioningresoegresoConstantesFunciones.mostrarFK_IdTransaccionTransaccionIngresoEgreso && index>-1) {
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransaccionIngresoEgreso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransaccionIngresoEgreso.indexOfComponent(this.jPanelFK_IdTransaccionTransaccionIngresoEgreso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transaccioningresoegresoConstantesFunciones.activarFK_IdTransaccionTransaccionIngresoEgreso);
				this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setEnabledAt(index,this.transaccioningresoegresoConstantesFunciones.activarFK_IdTransaccionTransaccionIngresoEgreso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransaccionIngresoEgreso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTransaccion")) {
			index= this.jTabbedPaneBusquedasTransaccionIngresoEgreso.indexOfComponent(this.jPanelFK_IdTransaccionTransaccionIngresoEgreso);

			this.jTabbedPaneBusquedasTransaccionIngresoEgreso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransaccionIngresoEgreso.getComponent(index);

			this.transaccioningresoegresoConstantesFunciones.setResaltarFK_IdTransaccionTransaccionIngresoEgreso(resaltar);

			jPanel.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltarFK_IdTransaccionTransaccionIngresoEgreso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransaccionIngresoEgreso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransaccionIngresoEgreso() throws Exception {

		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransaccionIngresoEgreso();
		this.updateVisibilidadResaltarControlesFormularioTransaccionIngresoEgreso();
		this.updateHabilitarResaltarControlesFormularioTransaccionIngresoEgreso();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransaccionIngresoEgreso() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transaccioningresoegresoConstantesFunciones.resaltaridTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltaridTransaccionIngresoEgreso);}
		if(this.transaccioningresoegresoConstantesFunciones.resaltarid_empresaTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltarid_empresaTransaccionIngresoEgreso);}
		if(this.transaccioningresoegresoConstantesFunciones.resaltarid_moduloTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltarid_moduloTransaccionIngresoEgreso);}
		if(this.transaccioningresoegresoConstantesFunciones.resaltarid_transaccionTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltarid_transaccionTransaccionIngresoEgreso);}
		if(this.transaccioningresoegresoConstantesFunciones.resaltares_ingresoTransaccionIngresoEgreso!=null && this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setBorderPainted(true);this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setBorder(this.transaccioningresoegresoConstantesFunciones.resaltares_ingresoTransaccionIngresoEgreso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransaccionIngresoEgreso() throws Exception {		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
	
		//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostraridTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelidTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostraridTransaccionIngresoEgreso);
		//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_empresaTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelid_empresaTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_empresaTransaccionIngresoEgreso);
		//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_moduloTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelid_moduloTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_moduloTransaccionIngresoEgreso);
		//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_transaccionTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPanelid_transaccionTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrarid_transaccionTransaccionIngresoEgreso);
		//this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrares_ingresoTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jPaneles_ingresoTransaccionIngresoEgreso.setVisible(this.transaccioningresoegresoConstantesFunciones.mostrares_ingresoTransaccionIngresoEgreso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransaccionIngresoEgreso() throws Exception {
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransaccionIngresoEgreso!=null) {
	
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jLabelidTransaccionIngresoEgreso.setEnabled(this.transaccioningresoegresoConstantesFunciones.activaridTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_empresaTransaccionIngresoEgreso.setEnabled(this.transaccioningresoegresoConstantesFunciones.activarid_empresaTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_moduloTransaccionIngresoEgreso.setEnabled(this.transaccioningresoegresoConstantesFunciones.activarid_moduloTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jComboBoxid_transaccionTransaccionIngresoEgreso.setEnabled(this.transaccioningresoegresoConstantesFunciones.activarid_transaccionTransaccionIngresoEgreso);
		this.jInternalFrameDetalleFormTransaccionIngresoEgreso.jCheckBoxes_ingresoTransaccionIngresoEgreso.setEnabled(this.transaccioningresoegresoConstantesFunciones.activares_ingresoTransaccionIngresoEgreso);
		}
	}
	
		
}