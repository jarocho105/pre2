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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.SriComprasConstantesFunciones;
import com.bydan.erp.sris.util.report.SriComprasParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriComprasParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.SriComprasBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SriComprasBeanSwingJInternalFrame extends SriComprasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SriComprasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SriCompras> sricomprasValidator = new ClassValidator<SriCompras>(SriCompras.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SriCompras sricompras;	
	public SriCompras sricomprasAux;
	public SriCompras sricomprasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SriCompras sricomprasTotales;
	public Long idSriComprasActual;
	public Long iIdNuevoSriCompras=0L;
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

	public String sFinalQueryComboPeriodoDeclara="";

	public List<PeriodoDeclara> periododeclarasForeignKey;

	public List<PeriodoDeclara> getperiododeclarasForeignKey() {
		return periododeclarasForeignKey;
	}

	public void setperiododeclarasForeignKey(List<PeriodoDeclara> periododeclarasForeignKey) {
		this.periododeclarasForeignKey = periododeclarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PeriodoDeclara periododeclaraForeignKey;

	public PeriodoDeclara getperiododeclaraForeignKey() {
		return periododeclaraForeignKey;
	}

	public void setperiododeclaraForeignKey(PeriodoDeclara periododeclaraForeignKey) {
		this.periododeclaraForeignKey = periododeclaraForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoIva="";

	public List<TipoIva> tipoivasForeignKey;

	public List<TipoIva> gettipoivasForeignKey() {
		return tipoivasForeignKey;
	}

	public void settipoivasForeignKey(List<TipoIva> tipoivasForeignKey) {
		this.tipoivasForeignKey = tipoivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIva tipoivaForeignKey;

	public TipoIva gettipoivaForeignKey() {
		return tipoivaForeignKey;
	}

	public void settipoivaForeignKey(TipoIva tipoivaForeignKey) {
		this.tipoivaForeignKey = tipoivaForeignKey;
	}

	public String sFinalQueryComboTipoRetencionIva="";

	public List<TipoRetencion> tiporetencionivasForeignKey;

	public List<TipoRetencion> gettiporetencionivasForeignKey() {
		return tiporetencionivasForeignKey;
	}

	public void settiporetencionivasForeignKey(List<TipoRetencion> tiporetencionivasForeignKey) {
		this.tiporetencionivasForeignKey = tiporetencionivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionivaForeignKey;

	public TipoRetencion gettiporetencionivaForeignKey() {
		return tiporetencionivaForeignKey;
	}

	public void settiporetencionivaForeignKey(TipoRetencion tiporetencionivaForeignKey) {
		this.tiporetencionivaForeignKey = tiporetencionivaForeignKey;
	}

	public String sFinalQueryComboTipoRetencionIvaPresta="";

	public List<TipoRetencion> tiporetencionivaprestasForeignKey;

	public List<TipoRetencion> gettiporetencionivaprestasForeignKey() {
		return tiporetencionivaprestasForeignKey;
	}

	public void settiporetencionivaprestasForeignKey(List<TipoRetencion> tiporetencionivaprestasForeignKey) {
		this.tiporetencionivaprestasForeignKey = tiporetencionivaprestasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionivaprestaForeignKey;

	public TipoRetencion gettiporetencionivaprestaForeignKey() {
		return tiporetencionivaprestaForeignKey;
	}

	public void settiporetencionivaprestaForeignKey(TipoRetencion tiporetencionivaprestaForeignKey) {
		this.tiporetencionivaprestaForeignKey = tiporetencionivaprestaForeignKey;
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
	
	public Boolean isPermisoTodoSriCompras;
	public Boolean isPermisoNuevoSriCompras;
	public Boolean isPermisoActualizarSriCompras;
	public Boolean isPermisoActualizarOriginalSriCompras;
	public Boolean isPermisoEliminarSriCompras;
	public Boolean isPermisoGuardarCambiosSriCompras;
	public Boolean isPermisoConsultaSriCompras;
	public Boolean isPermisoBusquedaSriCompras;
	public Boolean isPermisoReporteSriCompras;
	public Boolean isPermisoPaginacionMedioSriCompras;
	public Boolean isPermisoPaginacionAltoSriCompras;
	public Boolean isPermisoPaginacionTodoSriCompras;
	public Boolean isPermisoCopiarSriCompras;
	public Boolean isPermisoVerFormSriCompras;
	public Boolean isPermisoDuplicarSriCompras;
	public Boolean isPermisoOrdenSriCompras;
	
	
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
	
	public SriComprasParameterReturnGeneral sricomprasReturnGeneral;
	public SriComprasParameterReturnGeneral sricomprasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSriCompras=false;
	public Boolean esParaAccionDesdeFormularioSriCompras=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SriComprasSessionBeanAdditional sricomprasSessionBeanAdditional=null;
	
	public SriComprasSessionBeanAdditional getSriComprasSessionBeanAdditional() {
		return this.sricomprasSessionBeanAdditional;
	}
	
	public void setSriComprasSessionBeanAdditional(SriComprasSessionBeanAdditional sricomprasSessionBeanAdditional) {
		try {
			this.sricomprasSessionBeanAdditional=sricomprasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SriComprasBeanSwingJInternalFrameAdditional sricomprasBeanSwingJInternalFrameAdditional=null;
	//public class SriComprasBeanSwingJInternalFrame
	
	public SriComprasBeanSwingJInternalFrameAdditional getSriComprasBeanSwingJInternalFrameAdditional() {
		return this.sricomprasBeanSwingJInternalFrameAdditional;
	}
	
	public void setSriComprasBeanSwingJInternalFrameAdditional(SriComprasBeanSwingJInternalFrameAdditional sricomprasBeanSwingJInternalFrameAdditional) {
		try {
			this.sricomprasBeanSwingJInternalFrameAdditional=sricomprasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SriComprasLogic sricomprasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SriCompras sricomprasBean;
	public SriComprasConstantesFunciones sricomprasConstantesFunciones;
	//public SriComprasParameterReturnGeneral sricomprasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PeriodoDeclaraLogic periododeclaraLogic;
	public ClienteLogic clienteLogic;
	public TipoIvaLogic tipoivaLogic;
	public TipoRetencionLogic tiporetencionivaLogic;
	public TipoRetencionLogic tiporetencionivaprestaLogic;
	
	//PARAMETROS
	
	
	//public List<SriCompras> sricomprass;	
	//public List<SriCompras> sricomprassEliminados;
	//public List<SriCompras> sricomprassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSriCompras=false;
	public Boolean isVisibilidadCeldaDuplicarSriCompras=true;
	public Boolean isVisibilidadCeldaCopiarSriCompras=true;
	public Boolean isVisibilidadCeldaVerFormSriCompras=true;
	public Boolean isVisibilidadCeldaOrdenSriCompras=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSriCompras=false;
	public Boolean isVisibilidadCeldaModificarSriCompras=false;
	public Boolean isVisibilidadCeldaActualizarSriCompras=false;
	public Boolean isVisibilidadCeldaEliminarSriCompras=false;
	public Boolean isVisibilidadCeldaCancelarSriCompras=false;
	public Boolean isVisibilidadCeldaGuardarSriCompras=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSriCompras=false;	
	
	
	public Boolean isVisibilidadBusquedaSriCompras=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	public Boolean isVisibilidadFK_IdTipoIva=false;
	public Boolean isVisibilidadFK_IdTipoRetencionIva=false;
	public Boolean isVisibilidadFK_IdTipoRetencionIvaPresta=false;
	
	public Long getiIdNuevoSriCompras() {
		return this.iIdNuevoSriCompras;
	}

	public void setiIdNuevoSriCompras(Long iIdNuevoSriCompras) {
		this.iIdNuevoSriCompras = iIdNuevoSriCompras;
	}
	
	public Long getidSriComprasActual() {
		return this.idSriComprasActual;
	}

	public void setidSriComprasActual(Long idSriComprasActual) {
		this.idSriComprasActual = idSriComprasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SriCompras getsricompras() {
		return this.sricompras;
	}

	public void setsricompras(SriCompras sricompras) {
		this.sricompras = sricompras;
	}
	
	public SriCompras getsricomprasAux() {
		return this.sricomprasAux;
	}

	public void setsricomprasAux(SriCompras sricomprasAux) {
		this.sricomprasAux = sricomprasAux;
	}				
	
	public SriCompras getsricomprasAnterior() {
		return this.sricomprasAnterior;
	}

	public void setsricomprasAnterior(SriCompras sricomprasAnterior) {
		this.sricomprasAnterior = sricomprasAnterior;
	}	
	
	public SriCompras getsricomprasTotales() {
		return this.sricomprasTotales;
	}

	public void setsricomprasTotales(SriCompras sricomprasTotales) {
		this.sricomprasTotales = sricomprasTotales;
	}	
	
	public SriCompras getsricomprasBean() {
		return this.sricomprasBean;
	}

	public void setsricomprasBean(SriCompras sricomprasBean) {
		this.sricomprasBean = sricomprasBean;
	}	
	
	public SriComprasParameterReturnGeneral getsricomprasReturnGeneral() {
		return this.sricomprasReturnGeneral;
	}

	public void setsricomprasReturnGeneral(SriComprasParameterReturnGeneral sricomprasReturnGeneral) {
		this.sricomprasReturnGeneral = sricomprasReturnGeneral;
	}	
	
	
	public Long id_periodo_declaraBusquedaSriCompras=-1L;

	public Long getid_periodo_declaraBusquedaSriCompras() {
		return this.id_periodo_declaraBusquedaSriCompras;
	}

	public void setid_periodo_declaraBusquedaSriCompras(Long id_periodo_declaraBusquedaSriCompras) {
		this.id_periodo_declaraBusquedaSriCompras = id_periodo_declaraBusquedaSriCompras;
	}

;
	public Long id_clienteBusquedaSriCompras=-1L;

	public Long getid_clienteBusquedaSriCompras() {
		return this.id_clienteBusquedaSriCompras;
	}

	public void setid_clienteBusquedaSriCompras(Long id_clienteBusquedaSriCompras) {
		this.id_clienteBusquedaSriCompras = id_clienteBusquedaSriCompras;
	}

;
	public String rucBusquedaSriCompras="";

	public String getrucBusquedaSriCompras() {
		return this.rucBusquedaSriCompras;
	}

	public void setrucBusquedaSriCompras(String rucBusquedaSriCompras) {
		this.rucBusquedaSriCompras = rucBusquedaSriCompras;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public Long id_tipo_ivaFK_IdTipoIva=-1L;

	public Long getid_tipo_ivaFK_IdTipoIva() {
		return this.id_tipo_ivaFK_IdTipoIva;
	}

	public void setid_tipo_ivaFK_IdTipoIva(Long id_tipo_ivaFK_IdTipoIva) {
		this.id_tipo_ivaFK_IdTipoIva = id_tipo_ivaFK_IdTipoIva;
	}

	public Long id_tipo_retencion_ivaFK_IdTipoRetencionIva=-1L;

	public Long getid_tipo_retencion_ivaFK_IdTipoRetencionIva() {
		return this.id_tipo_retencion_ivaFK_IdTipoRetencionIva;
	}

	public void setid_tipo_retencion_ivaFK_IdTipoRetencionIva(Long id_tipo_retencion_ivaFK_IdTipoRetencionIva) {
		this.id_tipo_retencion_ivaFK_IdTipoRetencionIva = id_tipo_retencion_ivaFK_IdTipoRetencionIva;
	}

	public Long id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta=-1L;

	public Long getid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta() {
		return this.id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta;
	}

	public void setid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta(Long id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta) {
		this.id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta = id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SriComprasLogic getSriComprasLogic()	{		
		return sricomprasLogic;
	}

	public void setSriComprasLogic(SriComprasLogic sricomprasLogic) {
		this.sricomprasLogic = sricomprasLogic;
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
	
	public Boolean getIsEsNuevoSriCompras() {
		return isEsNuevoSriCompras;
	}

	public void setIsEsNuevoSriCompras(Boolean isEsNuevoSriCompras) {
		this.isEsNuevoSriCompras = isEsNuevoSriCompras;
	}

	public Boolean getEsParaAccionDesdeFormularioSriCompras() {
		return esParaAccionDesdeFormularioSriCompras;
	}
	
	public void setEsParaAccionDesdeFormularioSriCompras(Boolean esParaAccionDesdeFormularioSriCompras) {
		this.esParaAccionDesdeFormularioSriCompras = esParaAccionDesdeFormularioSriCompras;
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

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(sricomprasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosPeriodoDeclarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();

			//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

					periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(sFinalQuery,new Pagination());

					this.periododeclarasForeignKey=periododeclaraLogic.getPeriodoDeclaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodoDeclara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getEntityWithConnection(sricomprasSessionBean.getlidPeriodoDeclaraActual());
					this.periododeclarasForeignKey.add(periododeclaraLogic.getPeriodoDeclara());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(sricomprasSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoivasForeignKey=new ArrayList<TipoIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIvaLogic tipoivaLogic=new TipoIvaLogic();

			//tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

					tipoivaLogic.getTodosTipoIvasWithConnection(sFinalQuery,new Pagination());

					this.tipoivasForeignKey=tipoivaLogic.getTipoIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.getEntityWithConnection(sricomprasSessionBean.getlidTipoIvaActual());
					this.tipoivasForeignKey.add(tipoivaLogic.getTipoIva());
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

	public void cargarCombosTipoRetencionIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionivaLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionivasForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencionIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(sricomprasSessionBean.getlidTipoRetencionIvaActual());
					this.tiporetencionivasForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

	public void cargarCombosTipoRetencionIvaPrestasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionivaprestaLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionivaprestasForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencionIvaPresta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(sricomprasSessionBean.getlidTipoRetencionIvaPrestaActual());
					this.tiporetencionivaprestasForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

					if(this.sricompras!=null) {
						this.sricompras.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSriCompras.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSriComprasGenerico)throws Exception
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
				jComboBoxid_empresaSriComprasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSriComprasGenerico!=null && jComboBoxid_empresaSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_empresaSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoDeclaraForeignKey(Long idPeriodoDeclaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periododeclaraTemp!=null) {

					if(this.sricompras!=null) {
						this.sricompras.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraSriCompras.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras!=null) {
						jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras!=null) {
							//jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.getItemCount()>0) {
								jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setSelectedIndex(0);
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

	public String getActualPeriodoDeclaraForeignKeyDescripcion(Long idPeriodoDeclaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}


			sDescripcion=PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraSriComprasGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(periododeclaraTemp!=null) {
				jComboBoxid_periodo_declaraSriComprasGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraSriComprasGenerico!=null && jComboBoxid_periodo_declaraSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.sricompras!=null) {
						this.sricompras.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteSriCompras.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriCompras") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaSriComprasSriCompras!=null) {
						jComboBoxid_clienteBusquedaSriComprasSriCompras.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaSriComprasSriCompras!=null) {
							//jComboBoxid_clienteBusquedaSriComprasSriCompras.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaSriComprasSriCompras.getItemCount()>0) {
								jComboBoxid_clienteBusquedaSriComprasSriCompras.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteSriComprasGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteSriComprasGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteSriComprasGenerico!=null && jComboBoxid_clienteSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_clienteSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIvaForeignKey(Long idTipoIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoivaTemp!=null) {

					if(this.sricompras!=null) {
						this.sricompras.setTipoIva(tipoivaTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setSelectedItem(tipoivaTemp);
					}
				} else {
					//jComboBoxid_tipo_ivaSriCompras.setSelectedItem(tipoivaTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setSelectedIndex(0);
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

	public String getActualTipoIvaForeignKeyDescripcion(Long idTipoIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}


			sDescripcion=TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIvaForeignKeyGenerico(Long idTipoIvaSeleccionado,JComboBox jComboBoxid_tipo_ivaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(tipoivaTemp!=null) {
				jComboBoxid_tipo_ivaSriComprasGenerico.setSelectedItem(tipoivaTemp);
			} else {
				if(jComboBoxid_tipo_ivaSriComprasGenerico!=null && jComboBoxid_tipo_ivaSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_ivaSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionIvaForeignKey(Long idTipoRetencionIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionivaTemp!=null) {

					if(this.sricompras!=null) {
						this.sricompras.setTipoRetencionIva(tiporetencionivaTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedItem(tiporetencionivaTemp);
					}
				} else {
					//jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedItem(tiporetencionivaTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedIndex(0);
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

	public String getActualTipoRetencionIvaForeignKeyDescripcion(Long idTipoRetencionIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionIvaForeignKeyGenerico(Long idTipoRetencionIvaSeleccionado,JComboBox jComboBoxid_tipo_retencion_ivaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}

			if(tiporetencionivaTemp!=null) {
				jComboBoxid_tipo_retencion_ivaSriComprasGenerico.setSelectedItem(tiporetencionivaTemp);
			} else {
				if(jComboBoxid_tipo_retencion_ivaSriComprasGenerico!=null && jComboBoxid_tipo_retencion_ivaSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencion_ivaSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionIvaPrestaForeignKey(Long idTipoRetencionIvaPrestaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionivaprestaTemp!=null) {

					if(this.sricompras!=null) {
						this.sricompras.setTipoRetencionIvaPresta(tiporetencionivaprestaTemp);
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedItem(tiporetencionivaprestaTemp);
					}
				} else {
					//jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedItem(tiporetencionivaprestaTemp);
					if(this.jInternalFrameDetalleFormSriCompras!=null) {
						if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedIndex(0);
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

	public String getActualTipoRetencionIvaPrestaForeignKeyDescripcion(Long idTipoRetencionIvaPrestaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionivaprestaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionIvaPrestaForeignKeyGenerico(Long idTipoRetencionIvaPrestaSeleccionado,JComboBox jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}

			if(tiporetencionivaprestaTemp!=null) {
				jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico.setSelectedItem(tiporetencionivaprestaTemp);
			} else {
				if(jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico!=null && jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SriCompras sricompras,JComboBox jComboBoxid_empresaSriComprasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSriComprasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSriComprasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				sricompras.setid_empresa(empresaAux.getId());
				sricompras.setempresa_descripcion(SriComprasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				sricompras.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(SriCompras sricompras,JComboBox jComboBoxid_periodo_declaraSriComprasGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraSriComprasGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraSriComprasGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				sricompras.setid_periodo_declara(periododeclaraAux.getId());
				sricompras.setperiododeclara_descripcion(SriComprasConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				sricompras.setPeriodoDeclara(periododeclaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(SriCompras sricompras,JComboBox jComboBoxid_clienteSriComprasGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteSriComprasGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteSriComprasGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				sricompras.setid_cliente(clienteAux.getId());
				sricompras.setcliente_descripcion(SriComprasConstantesFunciones.getClienteDescripcion(clienteAux));
				sricompras.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIvaForeignKey(SriCompras sricompras,JComboBox jComboBoxid_tipo_ivaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaAux=new TipoIva();

			if(jComboBoxid_tipo_ivaSriComprasGenerico==null) {
				tipoivaAux=(TipoIva)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.getSelectedItem();
			} else {
				tipoivaAux=(TipoIva)jComboBoxid_tipo_ivaSriComprasGenerico.getSelectedItem();
			}

			if(tipoivaAux!=null && tipoivaAux.getId()!=null) {
				sricompras.setid_tipo_iva(tipoivaAux.getId());
				sricompras.settipoiva_descripcion(SriComprasConstantesFunciones.getTipoIvaDescripcion(tipoivaAux));
				sricompras.setTipoIva(tipoivaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionIvaForeignKey(SriCompras sricompras,JComboBox jComboBoxid_tipo_retencion_ivaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencion_ivaSriComprasGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencion_ivaSriComprasGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				sricompras.setid_tipo_retencion_iva(tiporetencionAux.getId());
				sricompras.settiporetencioniva_descripcion(SriComprasConstantesFunciones.getTipoRetencionIvaDescripcion(tiporetencionAux));
				sricompras.setTipoRetencionIva(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionIvaPrestaForeignKey(SriCompras sricompras,JComboBox jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencion_iva_prestaSriComprasGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				sricompras.setid_tipo_retencion_iva_presta(tiporetencionAux.getId());
				sricompras.settiporetencionivapresta_descripcion(SriComprasConstantesFunciones.getTipoRetencionIvaPrestaDescripcion(tiporetencionAux));
				sricompras.setTipoRetencionIvaPresta(tiporetencionAux);			}
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

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.addItem(periododeclara);
							}
						}

						if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriCompras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaSriComprasSriCompras.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaSriComprasSriCompras.addItem(cliente);
							}
						}

						if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.removeAllItems();

							for(TipoIva tipoiva:this.tipoivasForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.addItem(tipoiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.removeAllItems();

							for(TipoRetencion tiporetencioniva:this.tiporetencionivasForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.addItem(tiporetencioniva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionIvaPrestasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) { 
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.removeAllItems();

							for(TipoRetencion tiporetencionivapresta:this.tiporetencionivaprestasForeignKey) {
								this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.addItem(tiporetencionivapresta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriCompras!=null) { 
					}

					if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaSriComprasSriCompras.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaSriComprasSriCompras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIvaForeignKey(TipoIva tipoiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setSelectedItem(tipoiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRetencionIvaForeignKey(TipoRetencion tiporetencioniva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedItem(tiporetencioniva);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRetencionIvaPrestaForeignKey(TipoRetencion tiporetencionivapresta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedItem(tiporetencionivapresta);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriCompras!=null) {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSriCompras() throws Exception {
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
		
	public SriComprasParameterReturnGeneral getSriComprasParameterGeneral() {
		return this.sricomprasParameterGeneral;
	}
	
	public void setSriComprasParameterGeneral(SriComprasParameterReturnGeneral sricomprasParameterGeneral) {
		this.sricomprasParameterGeneral = sricomprasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSriCompras() {
		return isPermisoTodoSriCompras;
	}

	public void setIsPermisoTodoSriCompras(Boolean isPermisoTodoSriCompras) {
		this.isPermisoTodoSriCompras = isPermisoTodoSriCompras;
	}

	public Boolean getIsPermisoNuevoSriCompras() {
		return isPermisoNuevoSriCompras;
	}

	public void setIsPermisoNuevoSriCompras(Boolean isPermisoNuevoSriCompras) {
		this.isPermisoNuevoSriCompras = isPermisoNuevoSriCompras;
	}

	public Boolean getIsPermisoActualizarSriCompras() {
		return isPermisoActualizarSriCompras;
	}

	public void setIsPermisoActualizarSriCompras(Boolean isPermisoActualizarSriCompras) {
		this.isPermisoActualizarSriCompras = isPermisoActualizarSriCompras;
	}

	public Boolean getIsPermisoEliminarSriCompras() {
		return isPermisoEliminarSriCompras;
	}

	public void setIsPermisoEliminarSriCompras(Boolean isPermisoEliminarSriCompras) {
		this.isPermisoEliminarSriCompras = isPermisoEliminarSriCompras;
	}

	public Boolean getIsPermisoGuardarCambiosSriCompras() {
		return isPermisoGuardarCambiosSriCompras;
	}

	public void setIsPermisoGuardarCambiosSriCompras(Boolean isPermisoGuardarCambiosSriCompras) {
		this.isPermisoGuardarCambiosSriCompras = isPermisoGuardarCambiosSriCompras;
	}
	
	public Boolean getIsPermisoConsultaSriCompras() {
		return isPermisoConsultaSriCompras;
	}

	public void setIsPermisoConsultaSriCompras(Boolean isPermisoConsultaSriCompras) {
		this.isPermisoConsultaSriCompras = isPermisoConsultaSriCompras;
	}

	public Boolean getIsPermisoBusquedaSriCompras() {
		return isPermisoBusquedaSriCompras;
	}

	public void setIsPermisoBusquedaSriCompras(Boolean isPermisoBusquedaSriCompras) {
		this.isPermisoBusquedaSriCompras = isPermisoBusquedaSriCompras;
	}

	public Boolean getIsPermisoReporteSriCompras() {
		return isPermisoReporteSriCompras;
	}

	public void setIsPermisoReporteSriCompras(Boolean isPermisoReporteSriCompras) {
		this.isPermisoReporteSriCompras = isPermisoReporteSriCompras;
	}
	
	public Boolean getIsPermisoPaginacionMedioSriCompras() {
		return isPermisoPaginacionMedioSriCompras;
	}

	public void setIsPermisoPaginacionMedioSriCompras(Boolean isPermisoPaginacionMedioSriCompras) {
		this.isPermisoPaginacionMedioSriCompras = isPermisoPaginacionMedioSriCompras;
	}
	
	public Boolean getIsPermisoPaginacionTodoSriCompras() {
		return isPermisoPaginacionTodoSriCompras;
	}

	public void setIsPermisoPaginacionTodoSriCompras(Boolean isPermisoPaginacionTodoSriCompras) {
		this.isPermisoPaginacionTodoSriCompras = isPermisoPaginacionTodoSriCompras;
	}
	
	public Boolean getIsPermisoPaginacionAltoSriCompras() {
		return isPermisoPaginacionAltoSriCompras;
	}

	public void setIsPermisoPaginacionAltoSriCompras(Boolean isPermisoPaginacionAltoSriCompras) {
		this.isPermisoPaginacionAltoSriCompras = isPermisoPaginacionAltoSriCompras;
	}
	
	public Boolean getIsPermisoCopiarSriCompras() {
		return isPermisoCopiarSriCompras;
	}

	public void setIsPermisoCopiarSriCompras(Boolean isPermisoCopiarSriCompras) {
		this.isPermisoCopiarSriCompras = isPermisoCopiarSriCompras;
	}
	
	public Boolean getIsPermisoVerFormSriCompras() {
		return isPermisoVerFormSriCompras;
	}

	public void setIsPermisoVerFormSriCompras(Boolean isPermisoVerFormSriCompras) {
		this.isPermisoVerFormSriCompras = isPermisoVerFormSriCompras;
	}
	
	public Boolean getIsPermisoDuplicarSriCompras() {
		return isPermisoDuplicarSriCompras;
	}

	public void setIsPermisoDuplicarSriCompras(Boolean isPermisoDuplicarSriCompras) {
		this.isPermisoDuplicarSriCompras = isPermisoDuplicarSriCompras;
	}
	
	public Boolean getIsPermisoOrdenSriCompras() {
		return isPermisoOrdenSriCompras;
	}

	public void setIsPermisoOrdenSriCompras(Boolean isPermisoOrdenSriCompras) {
		this.isPermisoOrdenSriCompras = isPermisoOrdenSriCompras;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSriCompras() {
		return isVisibilidadCeldaNuevoSriCompras;
	}

	public void setIsVisibilidadCeldaNuevoSriCompras(Boolean isVisibilidadCeldaNuevoSriCompras) {
		this.isVisibilidadCeldaNuevoSriCompras = isVisibilidadCeldaNuevoSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSriCompras() {
		return isVisibilidadCeldaDuplicarSriCompras;
	}

	public void setIsVisibilidadCeldaDuplicarSriCompras(Boolean isVisibilidadCeldaDuplicarSriCompras) {
		this.isVisibilidadCeldaDuplicarSriCompras = isVisibilidadCeldaDuplicarSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSriCompras() {
		return isVisibilidadCeldaCopiarSriCompras;
	}

	public void setIsVisibilidadCeldaCopiarSriCompras(Boolean isVisibilidadCeldaCopiarSriCompras) {
		this.isVisibilidadCeldaCopiarSriCompras = isVisibilidadCeldaCopiarSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSriCompras() {
		return isVisibilidadCeldaVerFormSriCompras;
	}

	public void setIsVisibilidadCeldaVerFormSriCompras(Boolean isVisibilidadCeldaVerFormSriCompras) {
		this.isVisibilidadCeldaVerFormSriCompras = isVisibilidadCeldaVerFormSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSriCompras() {
		return isVisibilidadCeldaOrdenSriCompras;
	}

	public void setIsVisibilidadCeldaOrdenSriCompras(Boolean isVisibilidadCeldaOrdenSriCompras) {
		this.isVisibilidadCeldaOrdenSriCompras = isVisibilidadCeldaOrdenSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSriCompras() {
		return isVisibilidadCeldaNuevoRelacionesSriCompras;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSriCompras(Boolean isVisibilidadCeldaNuevoRelacionesSriCompras) {
		this.isVisibilidadCeldaNuevoRelacionesSriCompras = isVisibilidadCeldaNuevoRelacionesSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSriCompras() {
		return isVisibilidadCeldaModificarSriCompras;
	}

	public void setIsVisibilidadCeldaModificarSriCompras(Boolean isVisibilidadCeldaModificarSriCompras) {
		this.isVisibilidadCeldaModificarSriCompras = isVisibilidadCeldaModificarSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSriCompras() {
		return isVisibilidadCeldaActualizarSriCompras;
	}

	public void setIsVisibilidadCeldaActualizarSriCompras(Boolean isVisibilidadCeldaActualizarSriCompras) {
		this.isVisibilidadCeldaActualizarSriCompras = isVisibilidadCeldaActualizarSriCompras;
	}

	public Boolean getIsVisibilidadCeldaEliminarSriCompras() {
		return isVisibilidadCeldaEliminarSriCompras;
	}

	public void setIsVisibilidadCeldaEliminarSriCompras(Boolean isVisibilidadCeldaEliminarSriCompras) {
		this.isVisibilidadCeldaEliminarSriCompras = isVisibilidadCeldaEliminarSriCompras;
	}

	public Boolean getIsVisibilidadCeldaCancelarSriCompras() {
		return isVisibilidadCeldaCancelarSriCompras;
	}

	public void setIsVisibilidadCeldaCancelarSriCompras(Boolean isVisibilidadCeldaCancelarSriCompras) {
		this.isVisibilidadCeldaCancelarSriCompras = isVisibilidadCeldaCancelarSriCompras;
	}

	public Boolean getIsVisibilidadCeldaGuardarSriCompras() {
		return isVisibilidadCeldaGuardarSriCompras;
	}

	public void setIsVisibilidadCeldaGuardarSriCompras(Boolean isVisibilidadCeldaGuardarSriCompras) {
		this.isVisibilidadCeldaGuardarSriCompras = isVisibilidadCeldaGuardarSriCompras;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSriCompras() {
		return isVisibilidadCeldaGuardarCambiosSriCompras;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSriCompras(Boolean isVisibilidadCeldaGuardarCambiosSriCompras) {
		this.isVisibilidadCeldaGuardarCambiosSriCompras = isVisibilidadCeldaGuardarCambiosSriCompras;
	}
		
	public SriComprasSessionBean getsricomprasSessionBean() {
		return this.sricomprasSessionBean;
	}
	
	public void setsricomprasSessionBean(SriComprasSessionBean sricomprasSessionBean) {
		this.sricomprasSessionBean=sricomprasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSriCompras() {
		return this.isVisibilidadBusquedaSriCompras;
	}

	public void setisVisibilidadBusquedaSriCompras(Boolean isVisibilidadBusquedaSriCompras) {
		this.isVisibilidadBusquedaSriCompras=isVisibilidadBusquedaSriCompras;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	public Boolean getisVisibilidadFK_IdTipoIva() {
		return this.isVisibilidadFK_IdTipoIva;
	}

	public void setisVisibilidadFK_IdTipoIva(Boolean isVisibilidadFK_IdTipoIva) {
		this.isVisibilidadFK_IdTipoIva=isVisibilidadFK_IdTipoIva;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencionIva() {
		return this.isVisibilidadFK_IdTipoRetencionIva;
	}

	public void setisVisibilidadFK_IdTipoRetencionIva(Boolean isVisibilidadFK_IdTipoRetencionIva) {
		this.isVisibilidadFK_IdTipoRetencionIva=isVisibilidadFK_IdTipoRetencionIva;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencionIvaPresta() {
		return this.isVisibilidadFK_IdTipoRetencionIvaPresta;
	}

	public void setisVisibilidadFK_IdTipoRetencionIvaPresta(Boolean isVisibilidadFK_IdTipoRetencionIvaPresta) {
		this.isVisibilidadFK_IdTipoRetencionIvaPresta=isVisibilidadFK_IdTipoRetencionIvaPresta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSriCompras(SriCompras sricompras)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(sricompras,null);
				this.setActualParaGuardarPeriodoDeclaraForeignKey(sricompras,null);
				this.setActualParaGuardarClienteForeignKey(sricompras,null);
				this.setActualParaGuardarTipoIvaForeignKey(sricompras,null);
				this.setActualParaGuardarTipoRetencionIvaForeignKey(sricompras,null);
				this.setActualParaGuardarTipoRetencionIvaPrestaForeignKey(sricompras,null);
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
	
	public void bugActualizarReferenciaActual(SriCompras sricompras,SriCompras sricomprasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSriCompras(sricompras);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sricomprasAux.setId(sricompras.getId());
		sricomprasAux.setVersionRow(sricompras.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SriCompras sricomprasLocal) throws Exception {
		
		if(this.sricomprasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SriCompras sricomprasLocal) throws Exception {	
		if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				sricomprasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				sricomprasLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				sricomprasLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIvaDetalleFormJInternalFrame.class)) {
				TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrameLocal=(TipoIvaBeanSwingJInternalFrame) ((TipoIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIva(tipoivaBeanSwingJInternalFrameLocal.gettipoiva(),true);
				tipoivaBeanSwingJInternalFrameLocal.actualizarLista(tipoivaBeanSwingJInternalFrameLocal.tipoiva,this.tipoivasForeignKey);

				tipoivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				sricomprasLocal.setTipoIva(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey("Formulario");
				this.setActualTipoIvaForeignKey(tipoivaBeanSwingJInternalFrameLocal.tipoiva.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionivaBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionivaBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionivasForeignKey);

				tiporetencionivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion);

				sricomprasLocal.setTipoRetencionIva(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencionIva();
				this.cargarCombosFrameTipoRetencionIvasForeignKey("Formulario");
				this.setActualTipoRetencionIvaForeignKey(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionivaprestaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionivaprestaBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionivaprestaBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionivaprestasForeignKey);

				tiporetencionivaprestaBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion);

				sricomprasLocal.setTipoRetencionIvaPresta(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
				this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Formulario");
				this.setActualTipoRetencionIvaPrestaForeignKey(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSriComprasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sricomprasValidator.getInvalidValues(this.sricompras);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SriCompras sricompras,List<SriCompras> sricomprass) throws Exception {
	}		
	
	public void actualizarSelectedLista(SriCompras sricompras,List<SriCompras> sricomprass) throws Exception {
		try	{			
			SriComprasConstantesFunciones.actualizarSelectedLista(sricompras,sricomprass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SriCompras> sricomprassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sricomprassLocal=this.sricomprasLogic.getSriComprass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sricomprassLocal=this.sricomprass;
			}
			//ARCHITECTURE
		
			for(SriCompras sricomprasLocal:sricomprassLocal) {
				if(this.permiteMantenimiento(sricomprasLocal) && sricomprasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SriComprasConstantesFunciones.getSriComprasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NOMBRETIPOCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_tipo_comprobanteSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_completo_clienteSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.RUCDATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelruc_datoSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documentoSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_emisionSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.FECHAREGISTROCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_registro_contableSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_serieSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_autorizacionSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.BIENESIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.SERVICIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelservicion_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.BIENESSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_sin_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.SERVICIOSSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelservicios_sin_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_sin_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.IDTIPOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.MONTOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.MONTOICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_iceSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.TRANSFEIVARETENER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenerSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.IDTIPORETENCIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_retencion_ivaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.TRANSFEIVARETENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenidoSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.PRESTAIVARETENER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenerSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.IDTIPORETENCIONIVAPRESTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_retencion_iva_prestaSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.PRESTAIVARETENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenidoSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.FECHACADUCIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_caducidadSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.CODIGOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelcodigo_asiento_contableSriCompras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriComprasConstantesFunciones.NUMERODOCUMENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documento_contableSriCompras,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_tipo_comprobanteSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_completo_clienteSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelruc_datoSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documentoSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_emisionSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_registro_contableSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_serieSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_autorizacionSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelservicion_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_sin_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelservicios_sin_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_sin_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_iceSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenerSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_retencion_ivaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenidoSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenerSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelid_tipo_retencion_iva_prestaSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenidoSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_caducidadSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelcodigo_asiento_contableSriCompras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documento_contableSriCompras,"");
		
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
		this.iIdNuevoSriCompras--;	
		
		
		this.sricomprasAux=new SriCompras();
		
		this.sricomprasAux.setId(this.iIdNuevoSriCompras);
		this.sricomprasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sricomprasLogic.getSriComprass().add(this.sricomprasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sricomprass.add(this.sricomprasAux);
		}
		//ARCHITECTURE
		
		this.sricompras=this.sricomprasAux;
		
		if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSriCompras(this.sricompras);
			this.setVariablesObjetoActualToFormularioForeignKeySriCompras(this.sricompras);
		}
				
		//this.setDefaultControlesSriCompras();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySriCompras();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySriCompras();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySriCompras();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriCompras(this.sricomprasBean,this.sricompras,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSriCompras(this.sricomprasReturnGeneral,this.sricomprasBean,false);
		
		if(this.sricomprasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySriCompras(this.sricomprasReturnGeneral.getSriCompras());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSriCompras(this.sricomprasReturnGeneral.getSriCompras());
		}
		
		if(this.sricomprasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSriCompras(this.sricomprasReturnGeneral.getSriCompras(),classes);//this.sricomprasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySriCompras();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySriCompras();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SriComprasBeanSwingJInternalFrameAdditional.RecargarFormSriCompras(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSriCompras(false);
						
			if(sricomprasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriCompras();
			}
			
			this.actualizarVisualTableDatosSriCompras();
			
			this.jTableDatosSriCompras.setRowSelectionInterval(this.getIndiceNuevoSriCompras(), this.getIndiceNuevoSriCompras());
			
			this.seleccionarFilaTablaSriComprasActual();
						
			this.actualizarEstadoCeldasBotonesSriCompras("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSriCompras(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSriCompras.jTextFieldrucSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarrucSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnombre_tipo_comprobanteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnombre_completo_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarruc_datoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnumero_documentoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarfecha_emisionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarfecha_registro_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnumero_serieSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnumero_autorizacionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarbienes_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarservicion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activartotal_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarbienes_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarservicios_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activartotal_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarmonto_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarmonto_iceSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activartransfe_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activartransfe_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarpresta_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarpresta_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarfecha_caducidadSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarcodigo_asiento_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarnumero_documento_contableSriCompras);	
		//
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_empresaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_periodo_declaraSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_tipo_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_tipo_retencion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setEnabled(isHabilitar && this.sricomprasConstantesFunciones.activarid_tipo_retencion_iva_prestaSriCompras);
	};
	
	public void setDefaultControlesSriCompras() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSriCompras(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sricomprasSessionBean.setConGuardarRelaciones(true);			
			this.sricomprasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.setVisible(true);
			
					
		} else {
			//this.sricomprasSessionBean.setConGuardarRelaciones(false);			
			this.sricomprasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSriCompras() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
				if(sricomprasAux.getId().equals(this.iIdNuevoSriCompras)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriCompras sricomprasAux:this.sricomprass) {
				if(sricomprasAux.getId().equals(this.iIdNuevoSriCompras)) {
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
	
	public int getIndiceActualSriCompras(SriCompras sricompras,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
				if(sricomprasAux.getId().equals(sricompras.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriCompras sricomprasAux:this.sricomprass) {
				if(sricomprasAux.getId().equals(sricompras.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSriCompras(SriCompras sricomprasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
				if(sricomprasAux.getSriComprasOriginal().getId().equals(sricomprasOriginal.getId())) {
					existe=true;
					sricomprasOriginal.setId(sricomprasAux.getId());
					sricomprasOriginal.setVersionRow(sricomprasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriCompras sricomprasAux:this.sricomprass) {
				if(sricomprasAux.getSriComprasOriginal().getId().equals(sricomprasOriginal.getId())) {
					existe=true;
					sricomprasOriginal.setId(sricomprasAux.getId());
					sricomprasOriginal.setVersionRow(sricomprasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSriCompras(Boolean esParaCancelar) throws Exception {
		sricomprassAux=new ArrayList<SriCompras>();
		sricomprasAux=new SriCompras();
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
					if(sricomprasAux.getId()<0) {
						sricomprassAux.add(sricomprasAux);
					}		
				}
				this.iIdNuevoSriCompras=0L;
				this.sricomprasLogic.getSriComprass().removeAll(sricomprassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriCompras sricomprasAux:this.sricomprass) {
					if(sricomprasAux.getId()<0) {
						sricomprassAux.add(sricomprasAux);
					}		
				}
				this.iIdNuevoSriCompras=0L;
				this.sricomprass.removeAll(sricomprassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSriCompras 
					&& this.sricomprasLogic.getSriComprass().size()>0
					) {
					sricomprasAux=this.sricomprasLogic.getSriComprass().get(this.sricomprasLogic.getSriComprass().size() - 1);
				
					if(sricomprasAux.getId()<0) {
						this.sricomprasLogic.getSriComprass().remove(sricomprasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSriCompras && this.sricomprass.size()>0) {
					sricomprasAux=this.sricomprass.get(this.sricomprass.size() - 1);
				
					if(sricomprasAux.getId()<0) {
						this.sricomprass.remove(sricomprasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSriCompras(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sricompras.getId()<0) {
				this.sricomprasLogic.getSriComprass().remove(this.sricompras);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sricompras.getId()<0) {
				this.sricomprass.remove(this.sricompras);
			}
		}			
	}
	
	public void setEstadosInicialesSriCompras(List<SriCompras> sricomprassAux) throws Exception {
		SriComprasConstantesFunciones.setEstadosInicialesSriCompras(sricomprassAux);
	}
	
	public void setEstadosInicialesSriCompras(SriCompras sricomprasAux) throws Exception {
		SriComprasConstantesFunciones.setEstadosInicialesSriCompras(sricomprasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSriComprasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSriComprasActual()) {
				if(!this.isEsNuevoSriCompras) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSriCompras=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSriComprasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sri Compras ?", "MANTENIMIENTO DE Sri Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SriCompras sricompras) throws Exception {
		SriComprasConstantesFunciones.seleccionarAsignar(this.sricompras,sricompras);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSriCompras=this.isPermisoActualizarOriginalSriCompras;
			
			
			this.seleccionarAsignar(sricompras);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSriCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sricomprasSessionBean.setsFuncionBusquedaRapida(this.sricomprasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSriCompras) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSriCompras(esParaCancelar);				
				this.cancelarNuevoSriCompras(esParaCancelar);								
			}
			
			this.sricompras=new SriCompras();
			
			this.inicializarSriCompras();
			
			this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSriCompras() throws Exception {
		try {
			SriComprasConstantesFunciones.inicializarSriCompras(this.sricompras);
			
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
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sricomprasLogic.getSriComprass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSriComprass(String sAccionBusqueda,List<SriCompras> sricomprassParaReportes) throws Exception {
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
					sPathReporteFinal="SriCompras"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SriComprasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SriComprasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SriCompras"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sri Comprases");		
		parameters.put("busquedapor", SriComprasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSriCompras=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SriComprasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SriComprasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSriCompras=new JRBeanArrayDataSource(SriComprasJInternalFrame.TraerSriComprasBeans(sricomprassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSriCompras);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SriComprasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SriComprasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SriComprasBean.TraerSriComprasBeans(sricomprassParaReportes).toArray()));
							
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
				this.generarExcelReporteSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSriComprasActionPerformed(null);
					//this.generarExcelReporteSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSriComprass(sAccionBusqueda,sTipoArchivoReporte,sricomprassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSriComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<SriCompras> sricomprassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriComprass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriCompras("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SriCompras sricompras : sricomprassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SriComprasConstantesFunciones.generarExcelReporteDataSriCompras("NORMAL",row,workbook,sricompras,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSriCompras(String sTipo,Row row,Workbook workbook) {
		
		SriComprasConstantesFunciones.generarExcelReporteHeaderSriCompras(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSriComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<SriCompras> sricomprassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SriCompras sricompras : sricomprassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SriComprasConstantesFunciones.getSriComprasDescripcion(sricompras));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnombre_tipo_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_RUCDATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUCDATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getruc_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getfecha_registro_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_BIENESIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getbienes_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_SERVICIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getservicion_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_BIENESSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getbienes_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getservicios_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDTIPOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettipoiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_MONTOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getmonto_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_MONTOICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getmonto_ice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettransfe_iva_retener());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettiporetencioniva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettransfe_iva_retenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getpresta_iva_retener());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.gettiporetencionivapresta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getpresta_iva_retenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getfecha_caducidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getcodigo_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sricompras.getnumero_documento_contable());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSriComprass(String sAccionBusqueda,String sTipoArchivoReporte,List<SriCompras> sricomprassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SriCompras> sricomprassRespaldo=null;
		
		classes=SriComprasConstantesFunciones.getClassesRelationshipsOfSriCompras(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sricomprasLogic.setDatosCliente(this.datosCliente);
		this.sricomprasLogic.setDatosDeep(this.datosDeep);
		this.sricomprasLogic.setIsConDeep(true);
		
		sricomprassRespaldo=this.sricomprasLogic.getSriComprass();
		
		this.sricomprasLogic.setSriComprass(sricomprassParaReportes);	
		this.sricomprasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sricomprassParaReportes=this.sricomprasLogic.getSriComprass();
		this.sricomprasLogic.setSriComprass(sricomprassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriComprass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriCompras("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SriCompras sricompras : sricomprassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSriCompras("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SriComprasConstantesFunciones.generarExcelReporteDataSriCompras("NORMAL",row,workbook,sricompras,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SriComprasConstantesFunciones.getSriComprasDescripcion(sricompras));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriCompras.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSriCompras() throws Exception {		
		this.startProcessSriCompras(true);
	}
	
	public void startProcessSriCompras(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSriCompras ,this.jPanelParametrosReportesSriCompras, this.jScrollPanelDatosSriCompras,this.jPanelPaginacionSriCompras, this.jScrollPanelDatosEdicionSriCompras, this.jPanelAccionesSriCompras,this.jPanelAccionesFormularioSriCompras,this.jmenuBarSriCompras,this.jmenuBarDetalleSriCompras,this.jTtoolBarSriCompras,this.jTtoolBarDetalleSriCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasSriCompras=this.jTabbedPaneBusquedasSriCompras; 
		
		final JPanel jPanelParametrosReportesSriCompras=this.jPanelParametrosReportesSriCompras;
		//final JScrollPane jScrollPanelDatosSriCompras=this.jScrollPanelDatosSriCompras;
		final JTable jTableDatosSriCompras=this.jTableDatosSriCompras;		
		final JPanel jPanelPaginacionSriCompras=this.jPanelPaginacionSriCompras;
		//final JScrollPane jScrollPanelDatosEdicionSriCompras=this.jScrollPanelDatosEdicionSriCompras;
		final JPanel jPanelAccionesSriCompras=this.jPanelAccionesSriCompras;
		
		JPanel jPanelCamposAuxiliarSriCompras=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSriCompras=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			jPanelCamposAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jPanelCamposSriCompras;
			jPanelAccionesFormularioAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jPanelAccionesFormularioSriCompras;
		}
		
		final JPanel jPanelCamposSriCompras=jPanelCamposAuxiliarSriCompras;
		final JPanel jPanelAccionesFormularioSriCompras=jPanelAccionesFormularioAuxiliarSriCompras;
		
		
		final JMenuBar jmenuBarSriCompras=this.jmenuBarSriCompras;
		final JToolBar jTtoolBarSriCompras=this.jTtoolBarSriCompras;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSriCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriCompras=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			jmenuBarDetalleAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jmenuBarDetalleSriCompras;
			jTtoolBarDetalleAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jTtoolBarDetalleSriCompras;
		}
		
		final JMenuBar jmenuBarDetalleSriCompras=jmenuBarDetalleAuxiliarSriCompras;
		final JToolBar jTtoolBarDetalleSriCompras=jTtoolBarDetalleAuxiliarSriCompras;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriCompras;
			processRunnable.jTableDatos=jTableDatosSriCompras;
			processRunnable.jPanelCampos=jPanelCamposSriCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriCompras;
			processRunnable.jPanelAcciones=jPanelAccionesSriCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriCompras;
			
			
			processRunnable.jmenuBar=jmenuBarSriCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriCompras;
			processRunnable.jTtoolBar=jTtoolBarSriCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriCompras ,jPanelParametrosReportesSriCompras,jTableDatosSriCompras, /*jScrollPanelDatosSriCompras,*/jPanelCamposSriCompras,jPanelPaginacionSriCompras, /*jScrollPanelDatosEdicionSriCompras,*/ jPanelAccionesSriCompras,jPanelAccionesFormularioSriCompras,jmenuBarSriCompras,jmenuBarDetalleSriCompras,jTtoolBarSriCompras,jTtoolBarDetalleSriCompras);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriCompras ,jPanelParametrosReportesSriCompras, jScrollPanelDatosSriCompras,jPanelPaginacionSriCompras, jScrollPanelDatosEdicionSriCompras, jPanelAccionesSriCompras,jPanelAccionesFormularioSriCompras,jmenuBarSriCompras,jmenuBarDetalleSriCompras,jTtoolBarSriCompras,jTtoolBarDetalleSriCompras);
						
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
	
	public void finishProcessSriCompras() {// throws Exception 
		this.finishProcessSriCompras(true);
	}
	
	public void finishProcessSriCompras(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSriCompras ,this.jPanelParametrosReportesSriCompras, this.jScrollPanelDatosSriCompras,this.jPanelPaginacionSriCompras, this.jScrollPanelDatosEdicionSriCompras, this.jPanelAccionesSriCompras,this.jPanelAccionesFormularioSriCompras,this.jmenuBarSriCompras,this.jmenuBarDetalleSriCompras,this.jTtoolBarSriCompras,this.jTtoolBarDetalleSriCompras);		
		
		final JTabbedPane jTabbedPaneBusquedasSriCompras=this.jTabbedPaneBusquedasSriCompras; 
		
		final JPanel jPanelParametrosReportesSriCompras=this.jPanelParametrosReportesSriCompras;
		//final JScrollPane jScrollPanelDatosSriCompras=this.jScrollPanelDatosSriCompras;
		final JTable jTableDatosSriCompras=this.jTableDatosSriCompras;		
		final JPanel jPanelPaginacionSriCompras=this.jPanelPaginacionSriCompras;
		//final JScrollPane jScrollPanelDatosEdicionSriCompras=this.jScrollPanelDatosEdicionSriCompras;
		final JPanel jPanelAccionesSriCompras=this.jPanelAccionesSriCompras;
		
		JPanel jPanelCamposAuxiliarSriCompras=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSriCompras=new JPanel();
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			jPanelCamposAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jPanelCamposSriCompras;
			jPanelAccionesFormularioAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jPanelAccionesFormularioSriCompras;
		}
		
		final JPanel jPanelCamposSriCompras=jPanelCamposAuxiliarSriCompras;
		final JPanel jPanelAccionesFormularioSriCompras=jPanelAccionesFormularioAuxiliarSriCompras;
		
		
		final JMenuBar jmenuBarSriCompras=this.jmenuBarSriCompras;		
		final JToolBar jTtoolBarSriCompras=this.jTtoolBarSriCompras;
				
		JMenuBar jmenuBarDetalleAuxiliarSriCompras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriCompras=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			jmenuBarDetalleAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jmenuBarDetalleSriCompras;
			jTtoolBarDetalleAuxiliarSriCompras=this.jInternalFrameDetalleFormSriCompras.jTtoolBarDetalleSriCompras;		
		}
		
		final JMenuBar jmenuBarDetalleSriCompras=jmenuBarDetalleAuxiliarSriCompras;
		final JToolBar jTtoolBarDetalleSriCompras=jTtoolBarDetalleAuxiliarSriCompras;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriCompras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriCompras;
			processRunnable.jTableDatos=jTableDatosSriCompras;
			processRunnable.jPanelCampos=jPanelCamposSriCompras;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriCompras;
			processRunnable.jPanelAcciones=jPanelAccionesSriCompras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriCompras;
			
			
			processRunnable.jmenuBar=jmenuBarSriCompras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriCompras;
			processRunnable.jTtoolBar=jTtoolBarSriCompras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriCompras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSriCompras ,jPanelParametrosReportesSriCompras, jTableDatosSriCompras,/*jScrollPanelDatosSriCompras,*/jPanelCamposSriCompras,jPanelPaginacionSriCompras, /*jScrollPanelDatosEdicionSriCompras,*/ jPanelAccionesSriCompras,jPanelAccionesFormularioSriCompras,jmenuBarSriCompras,jmenuBarDetalleSriCompras,jTtoolBarSriCompras,jTtoolBarDetalleSriCompras));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSriCompras(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSriCompras(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSriCompras(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSriCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSriCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSriCompras,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSriCompras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSriCompras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSriCompras,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sricomprasConstantesFunciones.getsFinalQuerySriCompras();
		String  finalQueryPaginacionTodos=this.sricomprasConstantesFunciones.getsFinalQuerySriCompras();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SriComprasConstantesFunciones.getArrayColumnasGlobalesNoSriCompras(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SriComprasConstantesFunciones.getArrayColumnasGlobalesSriCompras(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SriComprasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sricomprassEliminados= new ArrayList<SriCompras>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSriCompras();
		
				///*SriComprasSessionBean*/this.sricomprasSessionBean=new SriComprasSessionBean();
			
			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
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
					this.iNumeroPaginacion=SriComprasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SriComprasConstantesFunciones.getClassesForeignKeysOfSriCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sricompras."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sricomprassAux= new ArrayList<SriCompras>();
			
				
			sricomprasLogic.setDatosCliente(this.datosCliente);
			sricomprasLogic.setDatosDeep(this.datosDeep);
			sricomprasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSriCompras")) {
				this.sDetalleReporte=SriComprasConstantesFunciones.getDetalleIndiceBusquedaSriCompras(id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sricomprasLogic.getSriComprassBusquedaSriCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriComprasConstantesFunciones.getDetalleIndiceBusquedaSriCompras(id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriComprasConstantesFunciones.getDetalleIndiceBusquedaSriCompras(id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sricomprasLogic.getSriComprass()==null||sricomprasLogic.getSriComprass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sricomprass==null|| sricomprass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sricomprassAux=new ArrayList<SriCompras>();
						sricomprassAux.addAll(sricomprasLogic.getSriComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sricomprassAux=new ArrayList<SriCompras>();
							sricomprassAux.addAll(sricomprass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sricomprasLogic.getSriComprassBusquedaSriCompras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriComprasConstantesFunciones.getDetalleIndiceBusquedaSriCompras(id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriComprasConstantesFunciones.getDetalleIndiceBusquedaSriCompras(id_periodo_declaraBusquedaSriCompras,id_clienteBusquedaSriCompras,rucBusquedaSriCompras);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSriComprass("BusquedaSriCompras",sricomprasLogic.getSriComprass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSriComprass("BusquedaSriCompras",sricomprass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sricomprasLogic.setSriComprass(new ArrayList<SriCompras>());
						sricomprasLogic.getSriComprass().addAll(sricomprassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sricomprass=new ArrayList<SriCompras>();
							sricomprass.addAll(sricomprassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSriCompras();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSriCompras();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sricomprasLogic.getSriComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sricomprass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sricomprasLogic.getSriComprass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sricomprass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SriCompras sricompras) {
		Boolean permite=true;
		
		if(this.sricompras.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SriComprasConstantesFunciones.getOrderByListaSriCompras();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SriComprasConstantesFunciones.getOrderByListaSriCompras();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriCompras sricompras:sricomprasLogic.getSriComprass()) {
				if(sricompras.getsType().equals(Constantes2.S_TOTALES)) {
					sricomprasTotales=sricompras;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriCompras sricompras:this.sricomprass) {
				if(sricompras.getsType().equals(Constantes2.S_TOTALES)) {
					sricomprasTotales=sricompras;
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
			this.sricomprasAux=new SriCompras();
			this.sricomprasAux.setsType(Constantes2.S_TOTALES);
			this.sricomprasAux.setIsNew(false);
			this.sricomprasAux.setIsChanged(false);
			this.sricomprasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SriComprasConstantesFunciones.TotalizarValoresFilaSriCompras(this.sricomprasLogic.getSriComprass(),this.sricomprasAux);
				
				//this.sricomprasLogic.getSriComprass().add(this.sricomprasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SriComprasConstantesFunciones.TotalizarValoresFilaSriCompras(this.sricomprass,this.sricomprasAux);
				
				this.sricomprass.add(this.sricomprasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sricomprasTotales=new SriCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sricomprasLogic.getSriComprass().remove(sricomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sricomprass.remove(sricomprasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sricomprasTotales=new SriCompras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriCompras sricompras:sricomprasLogic.getSriComprass()) {
				if(sricompras.getsType().equals(Constantes2.S_TOTALES)) {
					sricomprasTotales=sricompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriComprasConstantesFunciones.TotalizarValoresFilaSriCompras(this.sricomprasLogic.getSriComprass(),sricomprasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriCompras sricompras:this.sricomprass) {
				if(sricompras.getsType().equals(Constantes2.S_TOTALES)) {
					sricomprasTotales=sricompras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriComprasConstantesFunciones.TotalizarValoresFilaSriCompras(this.sricomprass,sricomprasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSriComprassBusquedaSriCompras()throws Exception {
		try {
			sAccionBusqueda="BusquedaSriCompras";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdTipoIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdTipoRetencionIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencionIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriComprassFK_IdTipoRetencionIvaPresta()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencionIvaPresta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSriComprassBusquedaSriCompras(String sFinalQuery,Long id_periodo_declara,Long id_cliente,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassBusquedaSriCompras(sFinalQuery,this.pagination,id_periodo_declara,id_cliente,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdTipoIva(String sFinalQuery,Long id_tipo_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdTipoIva(sFinalQuery,this.pagination,id_tipo_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdTipoRetencionIva(String sFinalQuery,Long id_tipo_retencion_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdTipoRetencionIva(sFinalQuery,this.pagination,id_tipo_retencion_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriComprassFK_IdTipoRetencionIvaPresta(String sFinalQuery,Long id_tipo_retencion_iva_presta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sricomprasLogic.getSriComprassFK_IdTipoRetencionIvaPresta(sFinalQuery,this.pagination,id_tipo_retencion_iva_presta);
				
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
	
	public void inicializarPermisosSriCompras() {
		this.isPermisoTodoSriCompras=false;
		this.isPermisoNuevoSriCompras=false;
		this.isPermisoActualizarSriCompras=false;
		this.isPermisoActualizarOriginalSriCompras=false;
		this.isPermisoEliminarSriCompras=false;
		this.isPermisoGuardarCambiosSriCompras=false;
		this.isPermisoConsultaSriCompras=true;
		this.isPermisoBusquedaSriCompras=true;
		this.isPermisoReporteSriCompras=true;
		this.isPermisoOrdenSriCompras=false;		
		this.isPermisoPaginacionMedioSriCompras=false;		
		this.isPermisoPaginacionAltoSriCompras=false;		
		this.isPermisoPaginacionTodoSriCompras=false;		
		this.isPermisoCopiarSriCompras=false;		
		this.isPermisoVerFormSriCompras=false;		
		this.isPermisoDuplicarSriCompras=false;
		this.isPermisoOrdenSriCompras=false;
	}
	
	public void setPermisosUsuarioSriCompras(Boolean isPermiso) {
		this.isPermisoTodoSriCompras=isPermiso;
		this.isPermisoNuevoSriCompras=isPermiso;
		this.isPermisoActualizarSriCompras=isPermiso;
		this.isPermisoActualizarOriginalSriCompras=isPermiso;
		this.isPermisoEliminarSriCompras=isPermiso;
		this.isPermisoGuardarCambiosSriCompras=isPermiso;
		this.isPermisoConsultaSriCompras=isPermiso;
		this.isPermisoBusquedaSriCompras=isPermiso;
		this.isPermisoReporteSriCompras=isPermiso;
		this.isPermisoOrdenSriCompras=isPermiso;		
		this.isPermisoPaginacionMedioSriCompras=isPermiso;		
		this.isPermisoPaginacionAltoSriCompras=isPermiso;		
		this.isPermisoPaginacionTodoSriCompras=isPermiso;		
		this.isPermisoCopiarSriCompras=isPermiso;		
		this.isPermisoVerFormSriCompras=isPermiso;		
		this.isPermisoDuplicarSriCompras=isPermiso;
		this.isPermisoOrdenSriCompras=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSriCompras(Boolean isPermiso) {
		//this.isPermisoTodoSriCompras=isPermiso;
		this.isPermisoNuevoSriCompras=isPermiso;
		this.isPermisoActualizarSriCompras=isPermiso;
		this.isPermisoActualizarOriginalSriCompras=isPermiso;
		this.isPermisoEliminarSriCompras=isPermiso;
		this.isPermisoGuardarCambiosSriCompras=isPermiso;
		//this.isPermisoConsultaSriCompras=isPermiso;
		//this.isPermisoBusquedaSriCompras=isPermiso;
		//this.isPermisoReporteSriCompras=isPermiso;
		//this.isPermisoOrdenSriCompras=isPermiso;		
		//this.isPermisoPaginacionMedioSriCompras=isPermiso;		
		//this.isPermisoPaginacionAltoSriCompras=isPermiso;		
		//this.isPermisoPaginacionTodoSriCompras=isPermiso;		
		//this.isPermisoCopiarSriCompras=isPermiso;		
		//this.isPermisoDuplicarSriCompras=isPermiso;
		//this.isPermisoOrdenSriCompras=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSriComprasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SriComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSriCompras(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSriComprasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSriComprasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSriComprasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSriComprasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSriCompras() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SriComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SriComprasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSriCompras=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSriCompras=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSriCompras=this.isPermisoActualizarSriCompras;
			this.isPermisoEliminarSriCompras=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSriCompras=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSriCompras=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSriCompras=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSriCompras=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSriCompras=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSriCompras=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSriCompras=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSriCompras=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSriCompras=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSriCompras=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSriCompras=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriCompras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSriCompras.setToolTipText(this.jTableDatosSriCompras.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSriCompras(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSriCompras(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SriComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SriComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSriCompras() throws Exception {
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
	public void inicializarCombosForeignKeySriComprasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.periododeclarasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipoivasForeignKey=new ArrayList();
				this.tiporetencionivasForeignKey=new ArrayList();
				this.tiporetencionivaprestasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySriComprasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SriComprasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionIvaPrestaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoivasForeignKey==null||this.tipoivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIvaConstantesFunciones.getArrayColumnasGlobalesTipoIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionivasForeignKey==null||this.tiporetencionivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaPrestaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionivaprestasForeignKey==null||this.tiporetencionivaprestasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionIvaPrestasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeySriCompras()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoIva();
			this.addItemDefectoCombosForeignKeyTipoRetencionIva();
			this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.sricomprasSessionBean==null) {
				this.sricomprasSessionBean=new SriComprasSessionBean();
			}

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				PeriodoDeclara periododeclara=new PeriodoDeclara();
				PeriodoDeclaraConstantesFunciones.setPeriodoDeclaraDescripcion(periododeclara,Constantes.SMENSAJE_ESCOJA_OPCION);
				periododeclara.setId(null);

				if(!PeriodoDeclaraConstantesFunciones.ExisteEnLista(this.periododeclarasForeignKey,periododeclara,true)) {

					this.periododeclarasForeignKey.add(0,periododeclara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIva()throws Exception {
		try {

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				TipoIva tipoiva=new TipoIva();
				TipoIvaConstantesFunciones.setTipoIvaDescripcion(tipoiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoiva.setId(null);

				if(!TipoIvaConstantesFunciones.ExisteEnLista(this.tipoivasForeignKey,tipoiva,true)) {

					this.tipoivasForeignKey.add(0,tipoiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencionIva()throws Exception {
		try {

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIva()) {
				TipoRetencion tiporetencioniva=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencioniva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencioniva.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionivasForeignKey,tiporetencioniva,true)) {

					this.tiporetencionivasForeignKey.add(0,tiporetencioniva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencionIvaPresta()throws Exception {
		try {

			if(!this.sricomprasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta()) {
				TipoRetencion tiporetencionivapresta=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencionivapresta,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencionivapresta.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionivaprestasForeignKey,tiporetencionivapresta,true)) {

					this.tiporetencionivaprestasForeignKey.add(0,tiporetencionivapresta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySriCompras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySriCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySriCompras()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySriCompras();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySriCompras(SriCompras sricompras)throws Exception {	
		try {
			
			this.setActualTipoIvaForeignKey(sricompras.getid_tipo_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaForeignKey(sricompras.getid_tipo_retencion_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaPrestaForeignKey(sricompras.getid_tipo_retencion_iva_presta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySriCompras(SriCompras sricompras,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySriCompras()throws Exception {	
		try {
			
			this.setActualTipoIvaForeignKey(this.sricomprasConstantesFunciones.getid_tipo_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaForeignKey(this.sricomprasConstantesFunciones.getid_tipo_retencion_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaPrestaForeignKey(this.sricomprasConstantesFunciones.getid_tipo_retencion_iva_presta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySriCompras()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySriCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySriCompras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSriCompras()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySriCompras()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoIvasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionIvasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySriCompras(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySriCompras()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public SriComprasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SriComprasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SriComprasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sricomprasSessionBean=new SriComprasSessionBean(); 
		this.sricomprasConstantesFunciones=new SriComprasConstantesFunciones(); 
		this.sricomprasBean=new SriCompras();//(this.sricomprasConstantesFunciones); 		
		this.sricomprasReturnGeneral=new SriComprasParameterReturnGeneral(); 
		
		this.sricomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sricomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SriComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SriComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SriComprasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSriCompras(true);
			
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
			
			this.sricomprasConstantesFunciones=new SriComprasConstantesFunciones(); 
			this.sricomprasBean=new SriCompras();//this.sricomprasConstantesFunciones); 			
			this.sricomprasReturnGeneral=new SriComprasParameterReturnGeneral(); 
		
			SriComprasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Compras Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.sricompras=new SriCompras();
			this.sricomprass = new ArrayList<SriCompras>();
			this.sricomprassAux = new ArrayList<SriCompras>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic=new SriComprasLogic();
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.sricomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sricomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSriCompras);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriCompras);	
					}
					
					if(this.jInternalFrameImportacionSriCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriCompras);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySriCompras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySriCompras);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSriCompras!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSriCompras);
				this.jInternalFrameDetalleFormSriCompras.setVisible(false);
				this.jInternalFrameDetalleFormSriCompras.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriCompras);
					this.jInternalFrameReporteDinamicoSriCompras.setVisible(false);
					this.jInternalFrameReporteDinamicoSriCompras.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSriCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSriCompras);
					this.jInternalFrameImportacionSriCompras.setVisible(false);
					this.jInternalFrameImportacionSriCompras.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySriCompras!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySriCompras);
					this.jInternalFrameOrderBySriCompras.setVisible(false);
					this.jInternalFrameOrderBySriCompras.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSriComprasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SriComprasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sricomprasReturnGeneral=new SriComprasParameterReturnGeneral();
			
			this.sricomprasParameterGeneral=new SriComprasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sricomprasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SriComprasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sricomprasSessionBean.getEsGuardarRelacionado(),this.sricomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriComprasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sricomprasSessionBean.getEsGuardarRelacionado(),this.sricomprasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaDuplicarSriCompras=true;
			this.isVisibilidadCeldaCopiarSriCompras=true;
			this.isVisibilidadCeldaVerFormSriCompras=true;
			this.isVisibilidadCeldaOrdenSriCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=false;
			this.isVisibilidadCeldaGuardarSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			
			
			this.isVisibilidadBusquedaSriCompras=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			this.isVisibilidadFK_IdTipoIva=true;
			this.isVisibilidadFK_IdTipoRetencionIva=true;
			this.isVisibilidadFK_IdTipoRetencionIvaPresta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSriCompras();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSriCompras(false);
			
			this.setPermisosUsuarioSriCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado() 
				|| (this.sricomprasSessionBean.getEsGuardarRelacionado() && this.sricomprasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSriComprasClasesRelacionadas();
			}
			
			if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSriComprasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SriComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSriCompras();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSriCompras();
			}
			
			if(!this.isPermisoBusquedaSriCompras) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSriCompras.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SriComprasConstantesFunciones.getTiposSeleccionarSriCompras());
				
				this.tiposColumnasSelect=SriComprasConstantesFunciones.getTiposSeleccionarSriCompras(true);
				
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
			//if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSriCompras();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSriCompras(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSriCompras(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSriCompras() ;
			
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
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			this.clienteLogic=new ClienteLogic();
			this.tipoivaLogic=new TipoIvaLogic();
			this.tiporetencionivaLogic=new TipoRetencionLogic();
			this.tiporetencionivaprestaLogic=new TipoRetencionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sricomprasImplementable= (SriComprasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sricomprasImplementableHome= (SriComprasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriComprasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sricomprass= new ArrayList<SriCompras>();
			this.sricomprassEliminados= new ArrayList<SriCompras>();
						
			this.isEsNuevoSriCompras=false;
			this.esParaAccionDesdeFormularioSriCompras=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoivasForeignKey=new ArrayList<TipoIva>() ;
			this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>() ;
			this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySriCompras(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSriCompras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SriComprasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SriComprasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSriCompras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSriCompras(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSriCompras!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSriCompras();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSriCompras();
			}
			
			SriComprasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSriCompras.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSriCompras.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSriCompras.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSriCompras(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SriCompras: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSriCompras() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSriCompras")) {
				iIndex=this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSriCompras();	
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
	
	public void cargarCombosForeignKeySriCompras(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySriCompras(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySriCompras(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySriComprasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySriCompras();
		
		this.cargarCombosFrameForeignKeySriCompras();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySriCompras();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySriCompras();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodoDeclara(this.periododeclarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIva(this.tipoivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencionIva();
				this.cargarCombosFrameTipoRetencionIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencionIva(this.tiporetencionivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaPresta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionIvaPrestaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
				this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencionIvaPresta(this.tiporetencionivaprestasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSriComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			
			if(jTableDatosSriCompras.getRowCount()>=1) {
				jTableDatosSriCompras.removeRowSelectionInterval(0, jTableDatosSriCompras.getRowCount()-1);						
			}
			
			this.isEsNuevoSriCompras=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSriCompras(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSriCompras(true);			
			//this.sricompras=new SriCompras();
			//this.sricompras.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriCompras(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriCompras() ;
			
			if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriCompras(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sricompras);	
			this.actualizarInformacion("INFO_PADRE",false,this.sricompras);				
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SriCompras: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSriComprasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSriCompras.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSriCompras.getSelectedRows().length;			
			}
			
			sricomprassSeleccionados=this.getSriComprassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSriCompras--;			
				//SriCompras sricomprasAux= new SriCompras();			
				//sricomprasAux.setId(this.iIdNuevoSriCompras);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SriCompras sricomprasOrigen=new SriCompras();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SriCompras sricomprasOrigen : sricomprassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sricomprasOrigen =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sricomprasOrigen =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSriCompras();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sricompras.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSriCompras(sricomprasOrigen,this.sricompras,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sricomprasLogic.getSriComprass().add(this.sricomprasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sricomprass.add(this.sricomprasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSriCompras(false);
				
				this.jTableDatosSriCompras.setRowSelectionInterval(this.getIndiceNuevoSriCompras(), this.getIndiceNuevoSriCompras());
				
				int iLastRow =  this.jTableDatosSriCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriCompras(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();									
		
			SriCompras sricomprasOrigen=new SriCompras();
			SriCompras sricomprasDestino=new SriCompras();
				
			sricomprassSeleccionados=this.getSriComprassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSriCompras.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sricomprassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSriCompras.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sricomprasOrigen =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sricomprasOrigen =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sricomprasDestino =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sricomprasDestino =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sricomprasOrigen =sricomprassSeleccionados.get(0);
				sricomprasDestino =sricomprassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSriCompras(sricomprasOrigen,sricomprasDestino,true,false);
				
				sricomprasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sricomprasDestino,sricomprasLogic.getSriComprass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sricomprasDestino,sricomprass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSriCompras(false);
				
				//this.jTableDatosSriCompras.setRowSelectionInterval(this.getIndiceNuevoSriCompras(), this.getIndiceNuevoSriCompras());
				
				int iLastRow =  this.jTableDatosSriCompras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriCompras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriCompras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriCompras(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSriCompras.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSriCompras.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSriCompras.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSriCompras.setVisible(!isVisible);
			this.jPanelPaginacionSriCompras.setVisible(!isVisible);
			this.jPanelAccionesSriCompras.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSriCompras();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSriCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSriCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySriCompras();
			
			this.abrirFrameOrderBySriCompras();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySriCompras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSriCompras(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriCompras);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSriCompras.isMaximum()) {
					this.jInternalFrameDetalleFormSriCompras.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSriCompras.setSize(this.jInternalFrameDetalleFormSriCompras.iWidthFormulario,this.jInternalFrameDetalleFormSriCompras.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSriCompras.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSriCompras.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSriCompras.isMaximum()) {
						this.jInternalFrameDetalleFormSriCompras.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSriCompras.jContentPaneDetalleSriCompras.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSriCompras.jContentPaneDetalleSriCompras.getWidth(),SriComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSriCompras.jContentPaneDetalleSriCompras.getWidth(),SriComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSriCompras.jContentPaneDetalleSriCompras.getWidth(),SriComprasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSriCompras.setVisible(true);
	        this.jInternalFrameDetalleFormSriCompras.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySriCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySriCompras==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySriCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriCompras,false,this);
				} else {
					this.jInternalFrameOrderBySriCompras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriCompras,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySriCompras);
				this.jInternalFrameOrderBySriCompras.setVisible(false);
				this.jInternalFrameOrderBySriCompras.setSelected(false);
				
				this.jInternalFrameOrderBySriCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriCompras"));
				
				this.inicializarActualizarBindingTablaOrderBySriCompras();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSriCompras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSriCompras==null) {
				
				this.jInternalFrameImportacionSriCompras=new ImportacionJInternalFrame(SriComprasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriCompras);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSriCompras);
				this.jInternalFrameImportacionSriCompras.setVisible(false);
				this.jInternalFrameImportacionSriCompras.setSelected(false);


				this.jInternalFrameImportacionSriCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriCompras"));
				this.jInternalFrameImportacionSriCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriCompras"));
				this.jInternalFrameImportacionSriCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriCompras"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSriCompras() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSriCompras==null) {
				this.jInternalFrameReporteDinamicoSriCompras=new ReporteDinamicoJInternalFrame(SriComprasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriCompras);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriCompras);
				this.jInternalFrameReporteDinamicoSriCompras.setVisible(false);
				this.jInternalFrameReporteDinamicoSriCompras.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriCompras"));
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriCompras"));
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriCompras"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriCompras();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSriCompras() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriCompras);
			
	       	this.jInternalFrameDetalleFormSriCompras.setVisible(false);
	        this.jInternalFrameDetalleFormSriCompras.setSelected(false);
			
			//this.jInternalFrameDetalleFormSriCompras.dispose();
			//this.jInternalFrameDetalleFormSriCompras=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSriCompras() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSriCompras.setVisible(true);
	        this.jInternalFrameReporteDinamicoSriCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSriCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSriCompras.setVisible(true);
	        this.jInternalFrameImportacionSriCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySriCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySriCompras.setVisible(true);
	        this.jInternalFrameOrderBySriCompras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySriCompras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySriCompras.setVisible(false);
	        this.jInternalFrameOrderBySriCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSriCompras() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSriCompras.setVisible(false);
	        this.jInternalFrameReporteDinamicoSriCompras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSriCompras() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSriCompras.setVisible(false);
	        this.jInternalFrameImportacionSriCompras.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSriCompras(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSriCompras(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSriCompras(true);
			//this.isEsNuevoSriCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSriCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriCompras(false) ;
			
			if(sricomprasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriCompras(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSriComprasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSriCompras(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSriCompras(true);
			//this.isEsNuevoSriCompras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sricompras.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSriCompras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSriCompras(false) ;
			
			if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriCompras(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriCompras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIva(List<TipoIva> tipoivasForeignKey)throws Exception{
		TableColumn tableColumnTipoIva=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPOIVA));
		TableCellEditor tableCellEditorTipoIva =tableColumnTipoIva.getCellEditor();

		TipoIvaTableCell tipoivaTableCellFk=(TipoIvaTableCell)tableCellEditorTipoIva;

		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.settipoivasForeignKey(tipoivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoivaTableCellFk.setRowActual(intSelectedRow);
			//tipoivaTableCellFk.settipoivasForeignKeyActual(tipoivasForeignKey);
		//}


		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.RecargarTipoIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencionIva(List<TipoRetencion> tiporetencionivasForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencionIva=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA));
		TableCellEditor tableCellEditorTipoRetencionIva =tableColumnTipoRetencionIva.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencionIva;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionivasForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencionIvaPresta(List<TipoRetencion> tiporetencionivaprestasForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencionIvaPresta=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA));
		TableCellEditor tableCellEditorTipoRetencionIvaPresta =tableColumnTipoRetencionIvaPresta.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencionIvaPresta;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionivaprestasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionivaprestasForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSriCompras(false);
			
			//if(!this.isEsNuevoSriCompras) {								
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				
			}
			
			if(this.permiteMantenimiento(this.sricompras)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSriCompras=true;
					this.inicializarActualizarBindingTablaSriCompras(false);
					this.isEsNuevoSriCompras=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSriCompras=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSriCompras=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriCompras(false);
				
				this.habilitarDeshabilitarControlesSriCompras(false);
			
												
				
				if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSriCompras();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSriComprasActionPerformed(evt,sricomprasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSriCompras(this.sricompras,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sricomprasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sricompras.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSriComprasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				this.sricompras.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				this.sricompras.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sricompras)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SriComprasModel) this.jTableDatosSriCompras.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSriCompras=true;
				this.inicializarActualizarBindingTablaSriCompras(false);
				this.isEsNuevoSriCompras=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriCompras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriCompras(false);
				
				this.habilitarDeshabilitarControlesSriCompras(false);
				
				
				
				if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSriCompras();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSriComprasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSriCompras.getRowCount()>=1) {
				jTableDatosSriCompras.removeRowSelectionInterval(0, jTableDatosSriCompras.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSriCompras(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSriCompras(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriCompras(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriCompras(false) ;
			
			this.isEsNuevoSriCompras=false;
			
			if(SriComprasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSriCompras();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSriCompras(false);
				
				//SI ES MANUAL
				if(SriComprasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSriCompras();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSriCompras--;			
			//SriCompras sricomprasAux= new SriCompras();			
			//sricomprasAux.setId(this.iIdNuevoSriCompras);
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSriCompras();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
			
			this.sricompras.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sricomprasLogic.getSriComprass().add(this.sricomprasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sricomprass.add(this.sricomprasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSriCompras(false);
			
			this.jTableDatosSriCompras.setRowSelectionInterval(this.getIndiceNuevoSriCompras(), this.getIndiceNuevoSriCompras());
			
			int iLastRow =  this.jTableDatosSriCompras.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSriCompras.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSriCompras.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSriCompras(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSriCompras(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriCompras(false);
			
			//SI ES MANUAL
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriCompras();
			}
			
			//this.abrirFrameTreeSriCompras();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSriComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSriComprasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSriCompras.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSriCompras.setFileImportacion(this.jInternalFrameImportacionSriCompras.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSriCompras.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSriCompras.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSriCompras.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSriCompras.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		

		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SriComprasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SriComprasBaseDesign.jrxml";
			
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
			
			this.generarReporteSriComprass("Todos",sricomprassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_RUCDATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaRegistroContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaRegistroContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaRegistroContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaRegistroContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_BIENESIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_enesIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_enesIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_enesIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_enesIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIONIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rvicionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rvicionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rvicionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rvicionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_BIENESSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_enesSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_enesSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_enesSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_enesSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rviciosSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rviciosSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rviciosSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rviciosSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_MONTOIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_MONTOICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoIce_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoIce_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoIce_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoIce_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ansfeIvaRetener_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ansfeIvaRetener_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ansfeIvaRetener_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ansfeIvaRetener_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ansfeIvaRetenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ansfeIvaRetenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ansfeIvaRetenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ansfeIvaRetenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_estaIvaRetener_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_estaIvaRetener_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_estaIvaRetener_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_estaIvaRetener_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencionIvaPresta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencionIvaPresta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencionIvaPresta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencionIvaPresta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_estaIvaRetenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_estaIvaRetenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_estaIvaRetenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_estaIvaRetenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCaducidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCaducidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCaducidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCaducidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumentoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumentoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumentoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumentoContable_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSriCompras.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoria="nombre_tipo_comprobante";
					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case SriComprasConstantesFunciones.LABEL_RUCDATO:
					sNombreCampoCategoria="ruc_dato";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoria="fecha_registro_contable";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESIVA:
					sNombreCampoCategoria="bienes_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIONIVA:
					sNombreCampoCategoria="servicion_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESSINIVA:
					sNombreCampoCategoria="bienes_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA:
					sNombreCampoCategoria="servicios_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoria="id_tipo_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoria="monto_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOICE:
					sNombreCampoCategoria="monto_ice";
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER:
					sNombreCampoCategoria="transfe_iva_retener";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					sNombreCampoCategoria="id_tipo_retencion_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					sNombreCampoCategoria="transfe_iva_retenido";
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER:
					sNombreCampoCategoria="presta_iva_retener";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					sNombreCampoCategoria="id_tipo_retencion_iva_presta";
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					sNombreCampoCategoria="presta_iva_retenido";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoria="fecha_caducidad";
					break;

				case SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoria="codigo_asiento_contable";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					sNombreCampoCategoria="numero_documento_contable";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoriaValor="nombre_tipo_comprobante";
					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case SriComprasConstantesFunciones.LABEL_RUCDATO:
					sNombreCampoCategoriaValor="ruc_dato";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoriaValor="fecha_registro_contable";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESIVA:
					sNombreCampoCategoriaValor="bienes_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIONIVA:
					sNombreCampoCategoriaValor="servicion_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESSINIVA:
					sNombreCampoCategoriaValor="bienes_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA:
					sNombreCampoCategoriaValor="servicios_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoriaValor="id_tipo_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoriaValor="monto_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOICE:
					sNombreCampoCategoriaValor="monto_ice";
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER:
					sNombreCampoCategoriaValor="transfe_iva_retener";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					sNombreCampoCategoriaValor="id_tipo_retencion_iva";
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					sNombreCampoCategoriaValor="transfe_iva_retenido";
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER:
					sNombreCampoCategoriaValor="presta_iva_retener";
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					sNombreCampoCategoriaValor="id_tipo_retencion_iva_presta";
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					sNombreCampoCategoriaValor="presta_iva_retenido";
					break;

				case SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoriaValor="fecha_caducidad";
					break;

				case SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="codigo_asiento_contable";
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					sNombreCampoCategoriaValor="numero_documento_contable";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_comprobante");
					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case SriComprasConstantesFunciones.LABEL_RUCDATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_dato");
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Registro Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_registro_contable");
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bienes Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"bienes_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Servicion Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"servicion_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bienes Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"bienes_sin_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Servicios Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"servicios_sin_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_ice");
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transfe Iva Retener",sNombreCampoCategoria,sNombreCampoCategoriaValor,"transfe_iva_retener");
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion_iva");
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transfe Iva Reteno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"transfe_iva_retenido");
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presta Iva Retener",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presta_iva_retener");
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion Iva Presta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion_iva_presta");
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presta Iva Reteno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presta_iva_retenido");
					break;

				case SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Caducad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_caducidad");
					break;

				case SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento_contable");
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento_contable");
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
	
	public void jButtonGenerarExcelReporteDinamicoSriComprasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SriComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SriComprasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUC);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnombre_tipo_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_RUCDATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUCDATO);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getruc_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getfecha_registro_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getbienes_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIONIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getservicion_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_BIENESSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESSINIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getbienes_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getservicios_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPOIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettipoiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getmonto_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_MONTOICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOICE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getmonto_ice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettransfe_iva_retener());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettiporetencioniva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettransfe_iva_retenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getpresta_iva_retener());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.gettiporetencionivapresta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getpresta_iva_retenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getfecha_caducidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getcodigo_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
					iRow++;

					for(SriCompras sricompras:sricomprassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sricompras.getnumero_documento_contable());
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
			//	this.getFilaCabeceraExportarExcelSriCompras(row);				
			//	iRow++;
			//}				
			
			//for(SriCompras sricomprasAux:sricomprassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSriCompras(sricomprasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
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
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriCompras(false);
			
			//SI ES MANUAL
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriCompras();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriCompras(false);
			
			//SI ES MANUAL
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriCompras();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSriComprasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriCompras(false);
			
			//SI ES MANUAL
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriCompras();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSriCompras() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSriCompras.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSriCompras.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSriCompras.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSriCompras.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSriCompras.setMinimumSize(dimensionMinimum);
		this.jTableDatosSriCompras.setMaximumSize(dimensionMaximum);
		this.jTableDatosSriCompras.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSriCompras(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSriCompras(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSriCompras(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSriCompras(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSriCompras(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSriCompras(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriCompras(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSriCompras(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SriComprasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSriCompras() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSriCompras();
		
		this.inicializarActualizarBindingBotonesManualSriCompras(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSriCompras();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriCompras() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSriCompras(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSriCompras(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSriCompras.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSriCompras.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSriCompras.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSriCompras!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionNuevoSriCompras.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionSinCerrarSriCompras.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionSinMensajeSriCompras.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSriCompras.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSriCompras.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSriCompras.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSriCompras!=null) {
				this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionNuevoSriCompras.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionSinCerrarSriCompras.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSriCompras.jCheckBoxPostAccionSinMensajeSriCompras.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSriCompras.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSriCompras.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSriCompras.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSriCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSriCompras.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSriCompras.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSriCompras.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSriCompras.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSriCompras.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSriCompras(Boolean esInicializar) throws Exception {
		try	{	
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSriCompras(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSriCompras() throws Exception {
		try	{
			if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSriCompras();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriCompras() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSriCompras() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSriCompras.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSriCompras.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSriCompras.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSriCompras.addItem(reporte);
			}
			
			
			if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSriCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSriCompras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSriCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSriCompras.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSriCompras.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSriCompras.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSriCompras.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriCompras();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriCompras() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
				this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
				this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
				
				if(this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSriCompras.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriCompras.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SriComprasConstantesFunciones.getTiposSeleccionarSriCompras(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SriComprasConstantesFunciones.getTiposSeleccionarSriCompras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SriComprasConstantesFunciones.getTiposSeleccionarSriCompras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriCompras.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSriCompras.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSriCompras()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.getSelectedItem()!=null){this.id_periodo_declaraBusquedaSriCompras=((PeriodoDeclara)this.jComboBoxid_periodo_declaraBusquedaSriComprasSriCompras.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteBusquedaSriComprasSriCompras.getSelectedItem()!=null){this.id_clienteBusquedaSriCompras=((Cliente)this.jComboBoxid_clienteBusquedaSriComprasSriCompras.getSelectedItem()).getId();}
		this.rucBusquedaSriCompras=this.jTextFieldrucBusquedaSriComprasSriCompras.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSriCompras(Boolean esInicializar) throws Exception {				
		if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSriCompras();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSriCompras() throws Exception {
		this.inicializarActualizarBindingTablaSriCompras(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySriCompras() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSriComprasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriComprasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSriCompras(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sricomprasLogic.getSriComprass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sricomprass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSriCompras.setModel(new SriComprasModel(this.sricomprasLogic.getSriComprass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSriCompras.setModel(new SriComprasModel(this.sricomprass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySriCompras!=null && this.jInternalFrameOrderBySriCompras.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySriCompras();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SriComprasConstantesFunciones.SCLASSWEBTITULO,sricomprasConstantesFunciones.resaltarSeleccionarSriCompras,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SriComprasConstantesFunciones.SCLASSWEBTITULO,sricomprasConstantesFunciones.resaltarSeleccionarSriCompras,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_ID));

		if(this.sricomprasConstantesFunciones.mostraridSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltaridSriCompras,this.sricomprasConstantesFunciones.activaridSriCompras,iSizeTabla,this,true,"idSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltaridSriCompras,this.sricomprasConstantesFunciones.activaridSriCompras,this,true,"idSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE));

		if(this.sricomprasConstantesFunciones.mostrarnombre_tipo_comprobanteSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnombre_tipo_comprobanteSriCompras,this.sricomprasConstantesFunciones.activarnombre_tipo_comprobanteSriCompras,iSizeTabla,this,true,"nombre_tipo_comprobanteSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnombre_tipo_comprobanteSriCompras,this.sricomprasConstantesFunciones.activarnombre_tipo_comprobanteSriCompras,this,true,"nombre_tipo_comprobanteSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.sricomprasConstantesFunciones.mostrarnombre_completo_clienteSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnombre_completo_clienteSriCompras,this.sricomprasConstantesFunciones.activarnombre_completo_clienteSriCompras,iSizeTabla,this,true,"nombre_completo_clienteSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnombre_completo_clienteSriCompras,this.sricomprasConstantesFunciones.activarnombre_completo_clienteSriCompras,this,true,"nombre_completo_clienteSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_RUCDATO));

		if(this.sricomprasConstantesFunciones.mostrarruc_datoSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_RUCDATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarruc_datoSriCompras,this.sricomprasConstantesFunciones.activarruc_datoSriCompras,iSizeTabla,this,true,"ruc_datoSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarruc_datoSriCompras,this.sricomprasConstantesFunciones.activarruc_datoSriCompras,this,true,"ruc_datoSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.sricomprasConstantesFunciones.mostrarnumero_documentoSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnumero_documentoSriCompras,this.sricomprasConstantesFunciones.activarnumero_documentoSriCompras,iSizeTabla,this,true,"numero_documentoSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnumero_documentoSriCompras,this.sricomprasConstantesFunciones.activarnumero_documentoSriCompras,this,true,"numero_documentoSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.sricomprasConstantesFunciones.mostrarfecha_emisionSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sricomprasConstantesFunciones.resaltarfecha_emisionSriCompras,this.sricomprasConstantesFunciones.activarfecha_emisionSriCompras,iSizeTabla,this,true,"fecha_emisionSriCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sricomprasConstantesFunciones.resaltarfecha_emisionSriCompras,this.sricomprasConstantesFunciones.activarfecha_emisionSriCompras,this,true,"fecha_emisionSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE));

		if(this.sricomprasConstantesFunciones.mostrarfecha_registro_contableSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sricomprasConstantesFunciones.resaltarfecha_registro_contableSriCompras,this.sricomprasConstantesFunciones.activarfecha_registro_contableSriCompras,iSizeTabla,this,true,"fecha_registro_contableSriCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sricomprasConstantesFunciones.resaltarfecha_registro_contableSriCompras,this.sricomprasConstantesFunciones.activarfecha_registro_contableSriCompras,this,true,"fecha_registro_contableSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.sricomprasConstantesFunciones.mostrarnumero_serieSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnumero_serieSriCompras,this.sricomprasConstantesFunciones.activarnumero_serieSriCompras,iSizeTabla,this,true,"numero_serieSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnumero_serieSriCompras,this.sricomprasConstantesFunciones.activarnumero_serieSriCompras,this,true,"numero_serieSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.sricomprasConstantesFunciones.mostrarnumero_autorizacionSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnumero_autorizacionSriCompras,this.sricomprasConstantesFunciones.activarnumero_autorizacionSriCompras,iSizeTabla,this,true,"numero_autorizacionSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnumero_autorizacionSriCompras,this.sricomprasConstantesFunciones.activarnumero_autorizacionSriCompras,this,true,"numero_autorizacionSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_BIENESIVA));

		if(this.sricomprasConstantesFunciones.mostrarbienes_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_BIENESIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarbienes_ivaSriCompras,this.sricomprasConstantesFunciones.activarbienes_ivaSriCompras,iSizeTabla,this,true,"bienes_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarbienes_ivaSriCompras,this.sricomprasConstantesFunciones.activarbienes_ivaSriCompras,this,true,"bienes_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_SERVICIONIVA));

		if(this.sricomprasConstantesFunciones.mostrarservicion_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_SERVICIONIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarservicion_ivaSriCompras,this.sricomprasConstantesFunciones.activarservicion_ivaSriCompras,iSizeTabla,this,true,"servicion_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarservicion_ivaSriCompras,this.sricomprasConstantesFunciones.activarservicion_ivaSriCompras,this,true,"servicion_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_TOTALIVA));

		if(this.sricomprasConstantesFunciones.mostrartotal_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltartotal_ivaSriCompras,this.sricomprasConstantesFunciones.activartotal_ivaSriCompras,iSizeTabla,this,true,"total_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltartotal_ivaSriCompras,this.sricomprasConstantesFunciones.activartotal_ivaSriCompras,this,true,"total_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_BIENESSINIVA));

		if(this.sricomprasConstantesFunciones.mostrarbienes_sin_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_BIENESSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarbienes_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activarbienes_sin_ivaSriCompras,iSizeTabla,this,true,"bienes_sin_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarbienes_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activarbienes_sin_ivaSriCompras,this,true,"bienes_sin_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA));

		if(this.sricomprasConstantesFunciones.mostrarservicios_sin_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarservicios_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activarservicios_sin_ivaSriCompras,iSizeTabla,this,true,"servicios_sin_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarservicios_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activarservicios_sin_ivaSriCompras,this,true,"servicios_sin_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.sricomprasConstantesFunciones.mostrartotal_sin_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltartotal_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activartotal_sin_ivaSriCompras,iSizeTabla,this,true,"total_sin_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltartotal_sin_ivaSriCompras,this.sricomprasConstantesFunciones.activartotal_sin_ivaSriCompras,this,true,"total_sin_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPOIVA));

		if(this.sricomprasConstantesFunciones.mostrarid_tipo_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_IDTIPOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIvaTableCell(this.tipoivasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_ivaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_ivaSriCompras,iSizeTabla));
			tableColumn.setCellEditor(new TipoIvaTableCell(this.tipoivasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_ivaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_ivaSriCompras,true,"id_tipo_ivaSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_MONTOIVA));

		if(this.sricomprasConstantesFunciones.mostrarmonto_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_MONTOIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarmonto_ivaSriCompras,this.sricomprasConstantesFunciones.activarmonto_ivaSriCompras,iSizeTabla,this,true,"monto_ivaSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarmonto_ivaSriCompras,this.sricomprasConstantesFunciones.activarmonto_ivaSriCompras,this,true,"monto_ivaSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_MONTOICE));

		if(this.sricomprasConstantesFunciones.mostrarmonto_iceSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_MONTOICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarmonto_iceSriCompras,this.sricomprasConstantesFunciones.activarmonto_iceSriCompras,iSizeTabla,this,true,"monto_iceSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarmonto_iceSriCompras,this.sricomprasConstantesFunciones.activarmonto_iceSriCompras,this,true,"monto_iceSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER));

		if(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenerSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenerSriCompras,this.sricomprasConstantesFunciones.activartransfe_iva_retenerSriCompras,iSizeTabla,this,true,"transfe_iva_retenerSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenerSriCompras,this.sricomprasConstantesFunciones.activartransfe_iva_retenerSriCompras,this,true,"transfe_iva_retenerSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA));

		if(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_ivaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionivasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_ivaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_retencion_ivaSriCompras,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionivasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_ivaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_retencion_ivaSriCompras,true,"id_tipo_retencion_ivaSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO));

		if(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenidoSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenidoSriCompras,this.sricomprasConstantesFunciones.activartransfe_iva_retenidoSriCompras,iSizeTabla,this,true,"transfe_iva_retenidoSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenidoSriCompras,this.sricomprasConstantesFunciones.activartransfe_iva_retenidoSriCompras,this,true,"transfe_iva_retenidoSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER));

		if(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenerSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenerSriCompras,this.sricomprasConstantesFunciones.activarpresta_iva_retenerSriCompras,iSizeTabla,this,true,"presta_iva_retenerSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenerSriCompras,this.sricomprasConstantesFunciones.activarpresta_iva_retenerSriCompras,this,true,"presta_iva_retenerSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA));

		if(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionivaprestasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_retencion_iva_prestaSriCompras,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionivaprestasForeignKey,this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriCompras,this,this.sricomprasConstantesFunciones.activarid_tipo_retencion_iva_prestaSriCompras,true,"id_tipo_retencion_iva_prestaSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO));

		if(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenidoSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenidoSriCompras,this.sricomprasConstantesFunciones.activarpresta_iva_retenidoSriCompras,iSizeTabla,this,true,"presta_iva_retenidoSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenidoSriCompras,this.sricomprasConstantesFunciones.activarpresta_iva_retenidoSriCompras,this,true,"presta_iva_retenidoSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD));

		if(this.sricomprasConstantesFunciones.mostrarfecha_caducidadSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sricomprasConstantesFunciones.resaltarfecha_caducidadSriCompras,this.sricomprasConstantesFunciones.activarfecha_caducidadSriCompras,iSizeTabla,this,true,"fecha_caducidadSriCompras","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sricomprasConstantesFunciones.resaltarfecha_caducidadSriCompras,this.sricomprasConstantesFunciones.activarfecha_caducidadSriCompras,this,true,"fecha_caducidadSriCompras","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE));

		if(this.sricomprasConstantesFunciones.mostrarcodigo_asiento_contableSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarcodigo_asiento_contableSriCompras,this.sricomprasConstantesFunciones.activarcodigo_asiento_contableSriCompras,iSizeTabla,this,true,"codigo_asiento_contableSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarcodigo_asiento_contableSriCompras,this.sricomprasConstantesFunciones.activarcodigo_asiento_contableSriCompras,this,true,"codigo_asiento_contableSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE));

		if(this.sricomprasConstantesFunciones.mostrarnumero_documento_contableSriCompras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sricomprasConstantesFunciones.resaltarnumero_documento_contableSriCompras,this.sricomprasConstantesFunciones.activarnumero_documento_contableSriCompras,iSizeTabla,this,true,"numero_documento_contableSriCompras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sricomprasConstantesFunciones.resaltarnumero_documento_contableSriCompras,this.sricomprasConstantesFunciones.activarnumero_documento_contableSriCompras,this,true,"numero_documento_contableSriCompras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriComprasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriCompras.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriCompras.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSriCompras && this.isPermisoGuardarCambiosSriCompras) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sricomprasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSriCompras.addColumn(tableColumn);
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
			
			this.jTableDatosSriCompras.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriCompras && this.isPermisoGuardarCambiosSriCompras) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriCompras && this.isPermisoGuardarCambiosSriCompras) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSriCompras.moveColumn(this.jTableDatosSriCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSriCompras.moveColumn(this.jTableDatosSriCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSriCompras.moveColumn(this.jTableDatosSriCompras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSriCompras.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSriCompras.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSriCompras,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSriCompras.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSriCompras.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSriCompras.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSriCompras.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSriCompras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=sricomprasLogic.getSriComprass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sricomprass.size()-1;
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
		//this.jTableDatosSriCompras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSriCompras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSriCompras();
			
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
				
				//this.isEsNuevoSriCompras=false;
					
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
				if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSriCompras==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sricompras.getsType().equals("DUPLICADO")
				   || this.sricompras.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSriCompras=true;
				
				} else {
					this.isEsNuevoSriCompras=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
					if(this.sricompras.getId()>=0 && !this.sricompras.getIsNew()) {						
						this.isEsNuevoSriCompras=false;
						
					} else {
						this.isEsNuevoSriCompras=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSriCompras(esRelaciones);						
				
				this.seleccionarSriCompras(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sricompras.getId()<0) {
					this.isEsNuevoSriCompras=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSriCompras(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSriCompras(evt,rowIndex);
				}	
				
				if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SriCompras: " + this.dDif); 
					}
				}								
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSriCompras(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sricompras)) {
					if(this.sricompras.getId()>0) {
						this.sricompras.setIsDeleted(true);
						
						this.sricomprassEliminados.add(this.sricompras);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sricomprasLogic.getSriComprass().remove(this.sricompras);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sricomprass.remove(this.sricompras);				
					}
					
					
					((SriComprasModel) this.jTableDatosSriCompras.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSriCompras(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSriCompras(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSriCompras) {
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriCompras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriCompras.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSriCompras(this.sricompras);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoIva
					if(!this.sricomprasConstantesFunciones.cargarid_tipo_ivaSriCompras || this.sricomprasConstantesFunciones.event_dependid_tipo_ivaSriCompras) {
						//this.cargarCombosTipoIvasForeignKeyLista(" where id="+this.sricompras.getid_tipo_iva());
									//this.inicializarActualizarBindingSriCompras(false,false);
						this.tipoivasForeignKey=new ArrayList<TipoIva>();

						if(sricompras.getTipoIva()!=null) {
							this.tipoivasForeignKey.add(sricompras.getTipoIva());
						}

						this.addItemDefectoCombosForeignKeyTipoIva();
						this.cargarCombosFrameTipoIvasForeignKey("Todos");
					}
					this.setActualTipoIvaForeignKey(this.sricompras.getid_tipo_iva(),false,"Formulario");

					//TipoRetencionIva
					if(!this.sricomprasConstantesFunciones.cargarid_tipo_retencion_ivaSriCompras || this.sricomprasConstantesFunciones.event_dependid_tipo_retencion_ivaSriCompras) {
						//this.cargarCombosTipoRetencionIvasForeignKeyLista(" where id="+this.sricompras.getid_tipo_retencion_iva());
									//this.inicializarActualizarBindingSriCompras(false,false);
						this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>();

						if(sricompras.getTipoRetencionIva()!=null) {
							this.tiporetencionivasForeignKey.add(sricompras.getTipoRetencionIva());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencionIva();
						this.cargarCombosFrameTipoRetencionIvasForeignKey("Todos");
					}
					this.setActualTipoRetencionIvaForeignKey(this.sricompras.getid_tipo_retencion_iva(),false,"Formulario");

					//TipoRetencionIvaPresta
					if(!this.sricomprasConstantesFunciones.cargarid_tipo_retencion_iva_prestaSriCompras || this.sricomprasConstantesFunciones.event_dependid_tipo_retencion_iva_prestaSriCompras) {
						//this.cargarCombosTipoRetencionIvaPrestasForeignKeyLista(" where id="+this.sricompras.getid_tipo_retencion_iva_presta());
									//this.inicializarActualizarBindingSriCompras(false,false);
						this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>();

						if(sricompras.getTipoRetencionIvaPresta()!=null) {
							this.tiporetencionivaprestasForeignKey.add(sricompras.getTipoRetencionIvaPresta());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
						this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Todos");
					}
					this.setActualTipoRetencionIvaPrestaForeignKey(this.sricompras.getid_tipo_retencion_iva_presta(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSriCompras("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSriCompras(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriCompras() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriCompras(SriCompras sricompras) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSriCompras(sricompras,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriCompras(SriCompras sricompras,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSriCompras(sricompras);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySriCompras(sricompras,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySriCompras(sricompras);
	}
	
	public void setVariablesObjetoActualToFormularioSriCompras(SriCompras sricompras) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setText(sricompras.getId().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setText(sricompras.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setText(sricompras.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setText(sricompras.getruc_dato());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setText(sricompras.getnumero_documento());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setDate(sricompras.getfecha_emision());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setDate(sricompras.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setText(sricompras.getnumero_serie());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setText(sricompras.getnumero_autorizacion());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setText(sricompras.getbienes_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setText(sricompras.getservicion_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setText(sricompras.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setText(sricompras.getbienes_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setText(sricompras.getservicios_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setText(sricompras.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setText(sricompras.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setText(sricompras.getmonto_ice().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setText(sricompras.gettransfe_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setText(sricompras.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setText(sricompras.getpresta_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setText(sricompras.getpresta_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setDate(sricompras.getfecha_caducidad());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setText(sricompras.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setText(sricompras.getnumero_documento_contable());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SriCompras sricomprasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sricomprasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SriCompras sricomprasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sricomprasLocal=this.sricompras;
			} else {
				sricomprasLocal=this.sricomprasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sricomprasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSriCompras(sricomprasLocal,true);
					
					if(sricomprasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sricomprasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sricomprasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSriCompras(SriCompras sricompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriCompras(sricompras,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(sricompras);
	}
	
	public void setVariablesFormularioToObjetoActualSriCompras(SriCompras sricompras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriCompras(sricompras,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSriCompras(SriCompras sricompras,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.getText()==null || this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.getText()=="" || this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.getText()=="Id") {
				this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setText("0");
			}

			if(conColumnasBase) {sricompras.setId(Long.parseLong(this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelIdSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnombre_tipo_comprobante(this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_tipo_comprobanteSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnombre_completo_cliente(this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnombre_completo_clienteSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setruc_dato(this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_RUCDATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelruc_datoSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnumero_documento(this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documentoSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setfecha_emision(this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_emisionSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setfecha_registro_contable(this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_registro_contableSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnumero_serie(this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_serieSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnumero_autorizacion(this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_autorizacionSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setbienes_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_BIENESIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setservicion_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_SERVICIONIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelservicion_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setbienes_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_BIENESSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelbienes_sin_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setservicios_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelservicios_sin_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltotal_sin_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setmonto_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_MONTOIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_ivaSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setmonto_ice(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_MONTOICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelmonto_iceSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.settransfe_iva_retener(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenerSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.settransfe_iva_retenido(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabeltransfe_iva_retenidoSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setpresta_iva_retener(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenerSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setpresta_iva_retenido(Double.parseDouble(this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelpresta_iva_retenidoSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setfecha_caducidad(this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelfecha_caducidadSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setcodigo_asiento_contable(this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelcodigo_asiento_contableSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sricompras.setnumero_documento_contable(this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriCompras.jLabelnumero_documento_contableSriCompras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriCompras(SriCompras sricomprasBean,SriCompras sricompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && sricomprasBean.getid_tipo_iva()!=null && !sricomprasBean.getid_tipo_iva().equals(-1L))) {sricompras.setid_tipo_iva(sricomprasBean.getid_tipo_iva());}
			if(conDefault || (!conDefault && sricomprasBean.getid_tipo_retencion_iva()!=null && !sricomprasBean.getid_tipo_retencion_iva().equals(-1L))) {sricompras.setid_tipo_retencion_iva(sricomprasBean.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sricomprasBean.getid_tipo_retencion_iva_presta()!=null && !sricomprasBean.getid_tipo_retencion_iva_presta().equals(-1L))) {sricompras.setid_tipo_retencion_iva_presta(sricomprasBean.getid_tipo_retencion_iva_presta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSriCompras(SriCompras sricomprasOrigen,SriCompras sricompras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sricomprasOrigen.getId()!=null && !sricomprasOrigen.getId().equals(0L))) {sricompras.setId(sricomprasOrigen.getId());}}
			if(conDefault || (!conDefault && sricomprasOrigen.getruc()!=null && !sricomprasOrigen.getruc().equals(""))) {sricompras.setruc(sricomprasOrigen.getruc());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnombre_tipo_comprobante()!=null && !sricomprasOrigen.getnombre_tipo_comprobante().equals(""))) {sricompras.setnombre_tipo_comprobante(sricomprasOrigen.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnombre_completo_cliente()!=null && !sricomprasOrigen.getnombre_completo_cliente().equals(""))) {sricompras.setnombre_completo_cliente(sricomprasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && sricomprasOrigen.getruc_dato()!=null && !sricomprasOrigen.getruc_dato().equals(""))) {sricompras.setruc_dato(sricomprasOrigen.getruc_dato());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnumero_documento()!=null && !sricomprasOrigen.getnumero_documento().equals(""))) {sricompras.setnumero_documento(sricomprasOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && sricomprasOrigen.getfecha_emision()!=null && !sricomprasOrigen.getfecha_emision().equals(new Date()))) {sricompras.setfecha_emision(sricomprasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && sricomprasOrigen.getfecha_registro_contable()!=null && !sricomprasOrigen.getfecha_registro_contable().equals(new Date()))) {sricompras.setfecha_registro_contable(sricomprasOrigen.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnumero_serie()!=null && !sricomprasOrigen.getnumero_serie().equals(""))) {sricompras.setnumero_serie(sricomprasOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnumero_autorizacion()!=null && !sricomprasOrigen.getnumero_autorizacion().equals(""))) {sricompras.setnumero_autorizacion(sricomprasOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && sricomprasOrigen.getbienes_iva()!=null && !sricomprasOrigen.getbienes_iva().equals(0.0))) {sricompras.setbienes_iva(sricomprasOrigen.getbienes_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getservicion_iva()!=null && !sricomprasOrigen.getservicion_iva().equals(0.0))) {sricompras.setservicion_iva(sricomprasOrigen.getservicion_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.gettotal_iva()!=null && !sricomprasOrigen.gettotal_iva().equals(0.0))) {sricompras.settotal_iva(sricomprasOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getbienes_sin_iva()!=null && !sricomprasOrigen.getbienes_sin_iva().equals(0.0))) {sricompras.setbienes_sin_iva(sricomprasOrigen.getbienes_sin_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getservicios_sin_iva()!=null && !sricomprasOrigen.getservicios_sin_iva().equals(0.0))) {sricompras.setservicios_sin_iva(sricomprasOrigen.getservicios_sin_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.gettotal_sin_iva()!=null && !sricomprasOrigen.gettotal_sin_iva().equals(0.0))) {sricompras.settotal_sin_iva(sricomprasOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getid_tipo_iva()!=null && !sricomprasOrigen.getid_tipo_iva().equals(-1L))) {sricompras.setid_tipo_iva(sricomprasOrigen.getid_tipo_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getmonto_iva()!=null && !sricomprasOrigen.getmonto_iva().equals(0.0))) {sricompras.setmonto_iva(sricomprasOrigen.getmonto_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.getmonto_ice()!=null && !sricomprasOrigen.getmonto_ice().equals(0.0))) {sricompras.setmonto_ice(sricomprasOrigen.getmonto_ice());}
			if(conDefault || (!conDefault && sricomprasOrigen.gettransfe_iva_retener()!=null && !sricomprasOrigen.gettransfe_iva_retener().equals(0.0))) {sricompras.settransfe_iva_retener(sricomprasOrigen.gettransfe_iva_retener());}
			if(conDefault || (!conDefault && sricomprasOrigen.getid_tipo_retencion_iva()!=null && !sricomprasOrigen.getid_tipo_retencion_iva().equals(-1L))) {sricompras.setid_tipo_retencion_iva(sricomprasOrigen.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sricomprasOrigen.gettransfe_iva_retenido()!=null && !sricomprasOrigen.gettransfe_iva_retenido().equals(0.0))) {sricompras.settransfe_iva_retenido(sricomprasOrigen.gettransfe_iva_retenido());}
			if(conDefault || (!conDefault && sricomprasOrigen.getpresta_iva_retener()!=null && !sricomprasOrigen.getpresta_iva_retener().equals(0.0))) {sricompras.setpresta_iva_retener(sricomprasOrigen.getpresta_iva_retener());}
			if(conDefault || (!conDefault && sricomprasOrigen.getid_tipo_retencion_iva_presta()!=null && !sricomprasOrigen.getid_tipo_retencion_iva_presta().equals(-1L))) {sricompras.setid_tipo_retencion_iva_presta(sricomprasOrigen.getid_tipo_retencion_iva_presta());}
			if(conDefault || (!conDefault && sricomprasOrigen.getpresta_iva_retenido()!=null && !sricomprasOrigen.getpresta_iva_retenido().equals(0.0))) {sricompras.setpresta_iva_retenido(sricomprasOrigen.getpresta_iva_retenido());}
			if(conDefault || (!conDefault && sricomprasOrigen.getfecha_caducidad()!=null && !sricomprasOrigen.getfecha_caducidad().equals(new Date()))) {sricompras.setfecha_caducidad(sricomprasOrigen.getfecha_caducidad());}
			if(conDefault || (!conDefault && sricomprasOrigen.getcodigo_asiento_contable()!=null && !sricomprasOrigen.getcodigo_asiento_contable().equals(""))) {sricompras.setcodigo_asiento_contable(sricomprasOrigen.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && sricomprasOrigen.getnumero_documento_contable()!=null && !sricomprasOrigen.getnumero_documento_contable().equals(""))) {sricompras.setnumero_documento_contable(sricomprasOrigen.getnumero_documento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriCompras(SriCompras sricompras) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setText(sricompras.getId().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setText(sricompras.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setText(sricompras.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setText(sricompras.getruc_dato());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setText(sricompras.getnumero_documento());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setDate(sricompras.getfecha_emision());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setDate(sricompras.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setText(sricompras.getnumero_serie());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setText(sricompras.getnumero_autorizacion());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setText(sricompras.getbienes_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setText(sricompras.getservicion_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setText(sricompras.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setText(sricompras.getbienes_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setText(sricompras.getservicios_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setText(sricompras.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setText(sricompras.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setText(sricompras.getmonto_ice().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setText(sricompras.gettransfe_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setText(sricompras.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setText(sricompras.getpresta_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setText(sricompras.getpresta_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setDate(sricompras.getfecha_caducidad());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setText(sricompras.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setText(sricompras.getnumero_documento_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriCompras(SriComprasBean sricomprasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setText(sricomprasBean.getId().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setText(sricomprasBean.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setText(sricomprasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setText(sricomprasBean.getruc_dato());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setText(sricomprasBean.getnumero_documento());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setDate(sricomprasBean.getfecha_emision());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setDate(sricomprasBean.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setText(sricomprasBean.getnumero_serie());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setText(sricomprasBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setText(sricomprasBean.getbienes_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setText(sricomprasBean.getservicion_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setText(sricomprasBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setText(sricomprasBean.getbienes_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setText(sricomprasBean.getservicios_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setText(sricomprasBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setText(sricomprasBean.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setText(sricomprasBean.getmonto_ice().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setText(sricomprasBean.gettransfe_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setText(sricomprasBean.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setText(sricomprasBean.getpresta_iva_retener().toString());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setText(sricomprasBean.getpresta_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setDate(sricomprasBean.getfecha_caducidad());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setText(sricomprasBean.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setText(sricomprasBean.getnumero_documento_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSriCompras(SriComprasParameterReturnGeneral sricomprasReturnGeneral,SriComprasBean sricomprasBean,Boolean conDefault) throws Exception { 
		try {
			SriCompras sricomprasLocal=new SriCompras();
			
			sricomprasLocal=sricomprasReturnGeneral.getSriCompras();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sricomprasLocal.getId()!=null && !sricomprasLocal.getId().equals(0L))) {sricomprasBean.setId(sricomprasLocal.getId());}}
			if(conDefault || (!conDefault && sricomprasLocal.getnombre_tipo_comprobante()!=null && !sricomprasLocal.getnombre_tipo_comprobante().equals(""))) {sricomprasBean.setnombre_tipo_comprobante(sricomprasLocal.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sricomprasLocal.getnombre_completo_cliente()!=null && !sricomprasLocal.getnombre_completo_cliente().equals(""))) {sricomprasBean.setnombre_completo_cliente(sricomprasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && sricomprasLocal.getruc_dato()!=null && !sricomprasLocal.getruc_dato().equals(""))) {sricomprasBean.setruc_dato(sricomprasLocal.getruc_dato());}
			if(conDefault || (!conDefault && sricomprasLocal.getnumero_documento()!=null && !sricomprasLocal.getnumero_documento().equals(""))) {sricomprasBean.setnumero_documento(sricomprasLocal.getnumero_documento());}
			if(conDefault || (!conDefault && sricomprasLocal.getfecha_emision()!=null && !sricomprasLocal.getfecha_emision().equals(new Date()))) {sricomprasBean.setfecha_emision(sricomprasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && sricomprasLocal.getfecha_registro_contable()!=null && !sricomprasLocal.getfecha_registro_contable().equals(new Date()))) {sricomprasBean.setfecha_registro_contable(sricomprasLocal.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sricomprasLocal.getnumero_serie()!=null && !sricomprasLocal.getnumero_serie().equals(""))) {sricomprasBean.setnumero_serie(sricomprasLocal.getnumero_serie());}
			if(conDefault || (!conDefault && sricomprasLocal.getnumero_autorizacion()!=null && !sricomprasLocal.getnumero_autorizacion().equals(""))) {sricomprasBean.setnumero_autorizacion(sricomprasLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && sricomprasLocal.getbienes_iva()!=null && !sricomprasLocal.getbienes_iva().equals(0.0))) {sricomprasBean.setbienes_iva(sricomprasLocal.getbienes_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getservicion_iva()!=null && !sricomprasLocal.getservicion_iva().equals(0.0))) {sricomprasBean.setservicion_iva(sricomprasLocal.getservicion_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.gettotal_iva()!=null && !sricomprasLocal.gettotal_iva().equals(0.0))) {sricomprasBean.settotal_iva(sricomprasLocal.gettotal_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getbienes_sin_iva()!=null && !sricomprasLocal.getbienes_sin_iva().equals(0.0))) {sricomprasBean.setbienes_sin_iva(sricomprasLocal.getbienes_sin_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getservicios_sin_iva()!=null && !sricomprasLocal.getservicios_sin_iva().equals(0.0))) {sricomprasBean.setservicios_sin_iva(sricomprasLocal.getservicios_sin_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.gettotal_sin_iva()!=null && !sricomprasLocal.gettotal_sin_iva().equals(0.0))) {sricomprasBean.settotal_sin_iva(sricomprasLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getid_tipo_iva()!=null && !sricomprasLocal.getid_tipo_iva().equals(-1L))) {sricomprasBean.setid_tipo_iva(sricomprasLocal.getid_tipo_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getmonto_iva()!=null && !sricomprasLocal.getmonto_iva().equals(0.0))) {sricomprasBean.setmonto_iva(sricomprasLocal.getmonto_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.getmonto_ice()!=null && !sricomprasLocal.getmonto_ice().equals(0.0))) {sricomprasBean.setmonto_ice(sricomprasLocal.getmonto_ice());}
			if(conDefault || (!conDefault && sricomprasLocal.gettransfe_iva_retener()!=null && !sricomprasLocal.gettransfe_iva_retener().equals(0.0))) {sricomprasBean.settransfe_iva_retener(sricomprasLocal.gettransfe_iva_retener());}
			if(conDefault || (!conDefault && sricomprasLocal.getid_tipo_retencion_iva()!=null && !sricomprasLocal.getid_tipo_retencion_iva().equals(-1L))) {sricomprasBean.setid_tipo_retencion_iva(sricomprasLocal.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sricomprasLocal.gettransfe_iva_retenido()!=null && !sricomprasLocal.gettransfe_iva_retenido().equals(0.0))) {sricomprasBean.settransfe_iva_retenido(sricomprasLocal.gettransfe_iva_retenido());}
			if(conDefault || (!conDefault && sricomprasLocal.getpresta_iva_retener()!=null && !sricomprasLocal.getpresta_iva_retener().equals(0.0))) {sricomprasBean.setpresta_iva_retener(sricomprasLocal.getpresta_iva_retener());}
			if(conDefault || (!conDefault && sricomprasLocal.getid_tipo_retencion_iva_presta()!=null && !sricomprasLocal.getid_tipo_retencion_iva_presta().equals(-1L))) {sricomprasBean.setid_tipo_retencion_iva_presta(sricomprasLocal.getid_tipo_retencion_iva_presta());}
			if(conDefault || (!conDefault && sricomprasLocal.getpresta_iva_retenido()!=null && !sricomprasLocal.getpresta_iva_retenido().equals(0.0))) {sricomprasBean.setpresta_iva_retenido(sricomprasLocal.getpresta_iva_retenido());}
			if(conDefault || (!conDefault && sricomprasLocal.getfecha_caducidad()!=null && !sricomprasLocal.getfecha_caducidad().equals(new Date()))) {sricomprasBean.setfecha_caducidad(sricomprasLocal.getfecha_caducidad());}
			if(conDefault || (!conDefault && sricomprasLocal.getcodigo_asiento_contable()!=null && !sricomprasLocal.getcodigo_asiento_contable().equals(""))) {sricomprasBean.setcodigo_asiento_contable(sricomprasLocal.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && sricomprasLocal.getnumero_documento_contable()!=null && !sricomprasLocal.getnumero_documento_contable().equals(""))) {sricomprasBean.setnumero_documento_contable(sricomprasLocal.getnumero_documento_contable());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSriComprasGenerico(Long idSriComprasSeleccionado,JComboBox jComboBoxSriCompras,List<SriCompras> sricomprassLocal)throws Exception {
		try {
			SriCompras  sricomprasTemp=null;

			for(SriCompras sricomprasAux:sricomprassLocal) {
				if(sricomprasAux.getId()!=null && sricomprasAux.getId().equals(idSriComprasSeleccionado)) {
					sricomprasTemp=sricomprasAux;
					break;
				}
			}

			jComboBoxSriCompras.setSelectedItem(sricomprasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSriComprasGenerico(JComboBox jComboBoxSriCompras,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriCompras.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSriCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriCompras.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSriCompras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sricompras=(SriCompras) sricomprasLogic.getSriComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sricompras =(SriCompras) sricomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.getempresa_descripcion();
			}
		}

		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.getperiododeclara_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoIva")) {
			//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.gettipoiva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.gettipoiva_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencionIva")) {
			//sDescripcion=this.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.gettiporetencioniva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.gettiporetencioniva_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencionIvaPresta")) {
			//sDescripcion=this.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value);
			if(!sricompras.getIsNew() && !sricompras.getIsChanged() && !sricompras.getIsDeleted()) {
				sDescripcion=sricompras.gettiporetencionivapresta_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value);
				sDescripcion=sricompras.gettiporetencionivapresta_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SriCompras sricomprasRow=new SriCompras();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sricomprasRow=(SriCompras) sricomprasLogic.getSriComprass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sricomprasRow=(SriCompras) sricomprass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSriCompras(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras));			
			this.jButtonDuplicarSriCompras.setVisible((this.isVisibilidadCeldaDuplicarSriCompras && this.isPermisoDuplicarSriCompras));			
			this.jButtonCopiarSriCompras.setVisible((this.isVisibilidadCeldaCopiarSriCompras && this.isPermisoCopiarSriCompras));
			this.jButtonVerFormSriCompras.setVisible((this.isVisibilidadCeldaVerFormSriCompras && this.isPermisoVerFormSriCompras));
			
			this.jButtonAbrirOrderBySriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));			
			
			this.jButtonNuevoRelacionesSriCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriCompras && this.isPermisoNuevoSriCompras));			
			this.jButtonNuevoGuardarCambiosSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras && this.isPermisoGuardarCambiosSriCompras));
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.jInternalFrameDetalleFormSriCompras.jButtonModificarSriCompras.setVisible((this.isVisibilidadCeldaModificarSriCompras && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.setVisible((this.isVisibilidadCeldaActualizarSriCompras && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.setVisible((this.isVisibilidadCeldaEliminarSriCompras && this.isPermisoEliminarSriCompras));
			this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.setVisible(this.isVisibilidadCeldaCancelarSriCompras);							
			this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.setVisible((this.isVisibilidadCeldaGuardarSriCompras && this.isPermisoGuardarCambiosSriCompras));			
			
			}
						
			this.jButtonGuardarCambiosTablaSriCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosSriCompras && this.isPermisoGuardarCambiosSriCompras));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras));						
			this.jButtonDuplicarToolBarSriCompras.setVisible((this.isVisibilidadCeldaDuplicarSriCompras && this.isPermisoDuplicarSriCompras));						
			this.jButtonCopiarToolBarSriCompras.setVisible((this.isVisibilidadCeldaCopiarSriCompras && this.isPermisoCopiarSriCompras));			
			this.jButtonVerFormToolBarSriCompras.setVisible((this.isVisibilidadCeldaVerFormSriCompras && this.isPermisoVerFormSriCompras));			
			this.jButtonAbrirOrderByToolBarSriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));
			this.jButtonNuevoRelacionesToolBarSriCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriCompras && this.isPermisoNuevoSriCompras));			
			this.jButtonNuevoGuardarCambiosToolBarSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras && this.isPermisoGuardarCambiosSriCompras));			
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.jInternalFrameDetalleFormSriCompras.jButtonModificarToolBarSriCompras.setVisible((this.isVisibilidadCeldaModificarSriCompras && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jButtonActualizarToolBarSriCompras.setVisible((this.isVisibilidadCeldaActualizarSriCompras  && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jButtonEliminarToolBarSriCompras.setVisible((this.isVisibilidadCeldaEliminarSriCompras && this.isPermisoEliminarSriCompras));
			this.jInternalFrameDetalleFormSriCompras.jButtonCancelarToolBarSriCompras.setVisible(this.isVisibilidadCeldaCancelarSriCompras);				
			this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosToolBarSriCompras.setVisible((this.isVisibilidadCeldaGuardarSriCompras && this.isPermisoGuardarCambiosSriCompras));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSriCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosSriCompras && this.isPermisoGuardarCambiosSriCompras));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras));			
			this.jMenuItemDuplicarSriCompras.setVisible((this.isVisibilidadCeldaDuplicarSriCompras && this.isPermisoDuplicarSriCompras));			
			this.jMenuItemCopiarSriCompras.setVisible((this.isVisibilidadCeldaCopiarSriCompras && this.isPermisoCopiarSriCompras));			
			this.jMenuItemVerFormSriCompras.setVisible((this.isVisibilidadCeldaVerFormSriCompras && this.isPermisoVerFormSriCompras));			
			this.jMenuItemAbrirOrderBySriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));			
			//this.jMenuItemMostrarOcultarSriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));
			this.jMenuItemDetalleAbrirOrderBySriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));			
			//this.jMenuItemDetalleMostrarOcultarSriCompras.setVisible((this.isVisibilidadCeldaOrdenSriCompras && this.isPermisoOrdenSriCompras));			
			this.jMenuItemNuevoRelacionesSriCompras.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriCompras && this.isPermisoNuevoSriCompras));			
			this.jMenuItemNuevoGuardarCambiosSriCompras.setVisible((this.isVisibilidadCeldaNuevoSriCompras && this.isPermisoNuevoSriCompras && this.isPermisoGuardarCambiosSriCompras));									
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.jInternalFrameDetalleFormSriCompras.jMenuItemModificarSriCompras.setVisible((this.isVisibilidadCeldaModificarSriCompras && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jMenuItemActualizarSriCompras.setVisible((this.isVisibilidadCeldaActualizarSriCompras && this.isPermisoActualizarSriCompras));	
			this.jInternalFrameDetalleFormSriCompras.jMenuItemEliminarSriCompras.setVisible((this.isVisibilidadCeldaEliminarSriCompras && this.isPermisoEliminarSriCompras));
			this.jInternalFrameDetalleFormSriCompras.jMenuItemCancelarSriCompras.setVisible(this.isVisibilidadCeldaCancelarSriCompras);				
			}
			
			this.jMenuItemGuardarCambiosSriCompras.setVisible((this.isVisibilidadCeldaGuardarSriCompras && this.isPermisoGuardarCambiosSriCompras));						
			this.jMenuItemGuardarCambiosTablaSriCompras.setVisible((this.isVisibilidadCeldaGuardarCambiosSriCompras && this.isPermisoGuardarCambiosSriCompras));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSriCompras=this.jButtonNuevoSriCompras.isVisible();
			this.isVisibilidadCeldaDuplicarSriCompras=this.jButtonDuplicarSriCompras.isVisible();
			this.isVisibilidadCeldaCopiarSriCompras=this.jButtonCopiarSriCompras.isVisible();
			this.isVisibilidadCeldaVerFormSriCompras=this.jButtonVerFormSriCompras.isVisible();
			
			this.isVisibilidadCeldaOrdenSriCompras=this.jButtonAbrirOrderBySriCompras.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=this.jButtonNuevoRelacionesSriCompras.isVisible();
			this.isVisibilidadCeldaModificarSriCompras=this.jButtonModificarSriCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.isVisibilidadCeldaActualizarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.isVisible();
			this.isVisibilidadCeldaEliminarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.isVisible();
			this.isVisibilidadCeldaCancelarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.isVisible();
			this.isVisibilidadCeldaGuardarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSriCompras=this.jButtonGuardarCambiosTablaSriCompras.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSriCompras=this.jButtonNuevoToolBarSriCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=this.jButtonNuevoRelacionesToolBarSriCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.isVisibilidadCeldaModificarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonModificarToolBarSriCompras.isVisible();
			this.isVisibilidadCeldaActualizarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonActualizarToolBarSriCompras.isVisible();
			this.isVisibilidadCeldaEliminarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonEliminarToolBarSriCompras.isVisible();
			this.isVisibilidadCeldaCancelarSriCompras=this.jInternalFrameDetalleFormSriCompras.jButtonCancelarToolBarSriCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriCompras=this.jButtonGuardarCambiosToolBarSriCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriCompras=this.jButtonGuardarCambiosTablaToolBarSriCompras.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSriCompras=this.jMenuItemNuevoSriCompras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=this.jMenuItemNuevoRelacionesSriCompras.isVisible();
			
			if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.isVisibilidadCeldaModificarSriCompras=this.jInternalFrameDetalleFormSriCompras.jMenuItemModificarSriCompras.isVisible();
			this.isVisibilidadCeldaActualizarSriCompras=this.jInternalFrameDetalleFormSriCompras.jMenuItemActualizarSriCompras.isVisible();
			this.isVisibilidadCeldaEliminarSriCompras=this.jInternalFrameDetalleFormSriCompras.jMenuItemEliminarSriCompras.isVisible();
			this.isVisibilidadCeldaCancelarSriCompras=this.jInternalFrameDetalleFormSriCompras.jMenuItemCancelarSriCompras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriCompras=this.jMenuItemGuardarCambiosSriCompras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriCompras=this.jMenuItemGuardarCambiosTablaSriCompras.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSriCompras(Boolean esInicializar) {
		if(SriComprasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
				//if(this.sricomprasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSriCompras();
			}
			
			this.inicializarActualizarBindingBotonesManualSriCompras(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSriCompras() {
		this.jButtonNuevoSriCompras.setVisible(this.isPermisoNuevoSriCompras);			
		this.jButtonDuplicarSriCompras.setVisible(this.isPermisoDuplicarSriCompras);			
		this.jButtonCopiarSriCompras.setVisible(this.isPermisoCopiarSriCompras);			
		this.jButtonVerFormSriCompras.setVisible(this.isPermisoVerFormSriCompras);			
		
		this.jButtonAbrirOrderBySriCompras.setVisible(this.isPermisoOrdenSriCompras);					
		
		this.jButtonNuevoRelacionesSriCompras.setVisible(this.isPermisoNuevoSriCompras);			
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonModificarSriCompras.setVisible(this.isPermisoActualizarSriCompras);	
			this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.setVisible(this.isPermisoActualizarSriCompras);	
			this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.setVisible(this.isPermisoEliminarSriCompras);
			this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.setVisible(this.isVisibilidadCeldaCancelarSriCompras);						
			this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.setVisible(this.isPermisoGuardarCambiosSriCompras);							
		}
		
		this.jButtonGuardarCambiosTablaSriCompras.setVisible(this.isPermisoActualizarSriCompras);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSriCompras() {
		this.jInternalFrameDetalleFormSriCompras.jButtonModificarSriCompras.setVisible(this.isPermisoActualizarSriCompras);	
		this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.setVisible(this.isPermisoActualizarSriCompras);	
		this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.setVisible(this.isPermisoEliminarSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.setVisible(this.isVisibilidadCeldaCancelarSriCompras);							
		this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.setVisible((this.isVisibilidadCeldaGuardarSriCompras && this.isPermisoGuardarCambiosSriCompras));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSriCompras() {
		if(SriComprasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSriCompras();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSriCompras() {
	}
	
	public void jTableDatosSriComprasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSriCompras(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sricompras.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSriCompras(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSriCompras.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.sricompras.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebSriCompras(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderSriCompras.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.sricompras.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebSriCompras(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderSriCompras.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.sricompras.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.sricompras.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_comprobanteSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnombre_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_comprobante like '%"+this.sricompras.getnombre_tipo_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.sricompras.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_datoSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getruc_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_dato like '%"+this.sricompras.getruc_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.sricompras.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.sricompras.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_registro_contableSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getfecha_registro_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_registro_contable = '"+Funciones2.getStringPostgresDate(this.sricompras.getfecha_registro_contable())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie like '%"+this.sricompras.getnumero_serie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.sricompras.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbienes_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getbienes_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where bienes_iva = "+this.sricompras.getbienes_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonservicion_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getservicion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where servicion_iva = "+this.sricompras.getservicion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.sricompras.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbienes_sin_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getbienes_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where bienes_sin_iva = "+this.sricompras.getbienes_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonservicios_sin_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getservicios_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where servicios_sin_iva = "+this.sricompras.getservicios_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.sricompras.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_ivaSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoiva=true;

			idTienePermisotipoiva=this.tienePermisosUsuarioEnPaginaWebSriCompras(TipoIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.tipoivaBeanSwingJInternalFrame=new TipoIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoivaBeanSwingJInternalFrame.getTipoIvaLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_tipo_iva()!=null) {
					this.tipoivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoivaBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_tipo_iva());
					this.tipoivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIva();
				}

				JInternalFrameBase jinternalFrame =this.tipoivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBordertipoiva=(TitledBorder)this.tipoivaBeanSwingJInternalFrame.jScrollPanelDatosTipoIva.getBorder();

				titledBordertipoiva.setTitle(titledBorderSriCompras.getTitle() + " -> Tipo Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_tipo_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_iva = "+this.sricompras.getid_tipo_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getmonto_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_iva = "+this.sricompras.getmonto_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_iceSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getmonto_ice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_ice = "+this.sricompras.getmonto_ice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontransfe_iva_retenerSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.gettransfe_iva_retener()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where transfe_iva_retener = "+this.sricompras.gettransfe_iva_retener().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencion_ivaSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencioniva=true;

			idTienePermisotiporetencioniva=this.tienePermisosUsuarioEnPaginaWebSriCompras(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencioniva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.tiporetencionivaBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionivaBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_tipo_retencion_iva()!=null) {
					this.tiporetencionivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionivaBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_tipo_retencion_iva());
					this.tiporetencionivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBordertiporetencioniva=(TitledBorder)this.tiporetencionivaBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencioniva.setTitle(titledBorderSriCompras.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencion_ivaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_tipo_retencion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion_iva = "+this.sricompras.getid_tipo_retencion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontransfe_iva_retenidoSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.gettransfe_iva_retenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where transfe_iva_retenido = "+this.sricompras.gettransfe_iva_retenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpresta_iva_retenerSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getpresta_iva_retener()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presta_iva_retener = "+this.sricompras.getpresta_iva_retener().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencion_iva_prestaSriComprasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencionivapresta=true;

			idTienePermisotiporetencionivapresta=this.tienePermisosUsuarioEnPaginaWebSriCompras(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencionivapresta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriCompras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriCompras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);

				this.tiporetencionivaprestaBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionivaprestaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionivaprestaBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.sricomprasLogic.getConnexion());

				if(this.sricompras.getid_tipo_retencion_iva_presta()!=null) {
					this.tiporetencionivaprestaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionivaprestaBeanSwingJInternalFrame.setIdActual(this.sricompras.getid_tipo_retencion_iva_presta());
					this.tiporetencionivaprestaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionivaprestaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionivaprestaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionivaprestaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriCompras=(TitledBorder)this.jScrollPanelDatosSriCompras.getBorder();
				TitledBorder titledBordertiporetencionivapresta=(TitledBorder)this.tiporetencionivaprestaBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencionivapresta.setTitle(titledBorderSriCompras.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencion_iva_prestaSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getid_tipo_retencion_iva_presta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion_iva_presta = "+this.sricompras.getid_tipo_retencion_iva_presta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpresta_iva_retenidoSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getpresta_iva_retenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presta_iva_retenido = "+this.sricompras.getpresta_iva_retenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_caducidadSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getfecha_caducidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_caducidad = '"+Funciones2.getStringPostgresDate(this.sricompras.getfecha_caducidad())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asiento_contableSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getcodigo_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento_contable like '%"+this.sricompras.getcodigo_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documento_contableSriComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.getsricompras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sricompras==null) {
						this.sricompras = new SriCompras();
					}

					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);
				}

				if(this.sricompras.getnumero_documento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento_contable like '%"+this.sricompras.getnumero_documento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriCompras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSriComprasSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassBusquedaSriCompras();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdCliente();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdEmpresa();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoIvaSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdTipoIva();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionIvaSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdTipoRetencionIva();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionIvaPrestaSriComprasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriCompras(false,false);

			this.getSriComprassFK_IdTipoRetencionIvaPresta();

			this.inicializarActualizarBindingSriCompras(false);

			//if(SriComprasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriCompras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sricomprasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSriCompras() {
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
			this.jInternalFrameDetalleFormSriCompras.setVisible(false);	    			
			this.jInternalFrameDetalleFormSriCompras.dispose();
			this.jInternalFrameDetalleFormSriCompras=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
			this.jInternalFrameReporteDinamicoSriCompras.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSriCompras.dispose();
			this.jInternalFrameReporteDinamicoSriCompras=null;
		}
		
		if(this.jInternalFrameImportacionSriCompras!=null) {
			this.jInternalFrameImportacionSriCompras.setVisible(false);	    			
			this.jInternalFrameImportacionSriCompras.dispose();
			this.jInternalFrameImportacionSriCompras=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSriCompras();
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			
			if(sTipo.equals("NuevoSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSriCompras")) {
				jButtonDuplicarSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSriCompras")) {
				jButtonCopiarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormSriCompras")) {
				jButtonVerFormSriComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSriCompras")) {
				jButtonDuplicarSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSriCompras")) {
				jButtonDuplicarSriComprasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSriCompras")) {
				jButtonModificarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSriCompras")) {
				jButtonModificarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSriCompras")) {
				jButtonModificarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSriCompras")) {
				jButtonActualizarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSriCompras")) {
				jButtonActualizarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSriCompras")) {
				jButtonActualizarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarSriCompras")) {
				jButtonEliminarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSriCompras")) {
				jButtonEliminarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSriCompras")) {
				jButtonEliminarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarSriCompras")) {
				jButtonCancelarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSriCompras")) {
				jButtonCancelarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSriCompras")) {
				jButtonCancelarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarSriCompras")) {
				jButtonCerrarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSriCompras")) {
				jButtonCerrarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSriCompras")) {
				jButtonCerrarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSriCompras")) {
				jButtonMostrarOcultarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSriCompras")) {
				jButtonCancelarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSriCompras")) {
				jButtonCopiarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSriCompras")) {
				jButtonVerFormSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSriCompras")) {
				jButtonCopiarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSriCompras")) {
				jButtonVerFormSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSriCompras")) {
				jButtonRecargarInformacionSriComprasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSriCompras")) {
				jButtonRecargarInformacionSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSriCompras")) {
				jButtonRecargarInformacionSriComprasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSriCompras")) {
				jButtonAnterioresSriComprasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSriCompras")) {
				jButtonAnterioresSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSriCompras")) {
				jButtonAnterioresSriComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSriCompras")) {
				jButtonSiguientesSriComprasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSriCompras")) {
				jButtonSiguientesSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSriCompras")) {
				jButtonSiguientesSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySriCompras") || sTipo.equals("MenuItemDetalleAbrirOrderBySriCompras")) {
				jButtonAbrirOrderBySriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSriCompras") || sTipo.equals("MenuItemDetalleMostrarOcultarSriCompras")) {
				jButtonMostrarOcultarSriComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSriCompras")) {
				jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSriCompras")) {
				jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSriCompras")) {
				jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSriCompras")) {
				jButtonCerrarReporteDinamicoSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSriCompras")) {
				jButtonGenerarReporteDinamicoSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSriCompras")) {
				
				jButtonGenerarExcelReporteDinamicoSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSriCompras")) {
				jButtonCerrarImportacionSriComprasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSriCompras")) {
				
				jButtonGenerarImportacionSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSriCompras")) {
				
				jButtonAbrirImportacionSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSriCompras")) {
				jComboBoxTiposAccionesSriComprasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSriCompras")) {
				jComboBoxTiposRelacionesSriComprasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSriCompras")) {
				jComboBoxTiposAccionesSriComprasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSriCompras")) {
				
				jComboBoxTiposSeleccionarSriComprasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSriCompras")) {
				jTextFieldValorCampoGeneralSriComprasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySriCompras")) {
				jButtonAbrirOrderBySriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSriCompras")) {
				jButtonAbrirOrderBySriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySriCompras")) {
				jButtonCerrarOrderBySriComprasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriComprasBusqueda")) {
				this.jButtonidSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriComprasUpdate")) {
				this.jButtonid_empresaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriComprasBusqueda")) {
				this.jButtonid_empresaSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriComprasUpdate")) {
				this.jButtonid_periodo_declaraSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriComprasBusqueda")) {
				this.jButtonid_periodo_declaraSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSriComprasUpdate")) {
				this.jButtonid_clienteSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSriComprasBusqueda")) {
				this.jButtonid_clienteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriComprasBusqueda")) {
				this.jButtonrucSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriComprasBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteSriComprasBusqueda")) {
				this.jButtonnombre_completo_clienteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_datoSriComprasBusqueda")) {
				this.jButtonruc_datoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriComprasBusqueda")) {
				this.jButtonnumero_documentoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriComprasBusqueda")) {
				this.jButtonfecha_emisionSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriComprasBusqueda")) {
				this.jButtonfecha_registro_contableSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriComprasBusqueda")) {
				this.jButtonnumero_serieSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionSriComprasBusqueda")) {
				this.jButtonnumero_autorizacionSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bienes_ivaSriComprasBusqueda")) {
				this.jButtonbienes_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("servicion_ivaSriComprasBusqueda")) {
				this.jButtonservicion_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriComprasBusqueda")) {
				this.jButtontotal_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bienes_sin_ivaSriComprasBusqueda")) {
				this.jButtonbienes_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("servicios_sin_ivaSriComprasBusqueda")) {
				this.jButtonservicios_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaSriComprasBusqueda")) {
				this.jButtontotal_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaSriComprasUpdate")) {
				this.jButtonid_tipo_ivaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaSriComprasBusqueda")) {
				this.jButtonid_tipo_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaSriComprasBusqueda")) {
				this.jButtonmonto_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_iceSriComprasBusqueda")) {
				this.jButtonmonto_iceSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenerSriComprasBusqueda")) {
				this.jButtontransfe_iva_retenerSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriComprasUpdate")) {
				this.jButtonid_tipo_retencion_ivaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriComprasBusqueda")) {
				this.jButtonid_tipo_retencion_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenidoSriComprasBusqueda")) {
				this.jButtontransfe_iva_retenidoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenerSriComprasBusqueda")) {
				this.jButtonpresta_iva_retenerSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriComprasUpdate")) {
				this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriComprasBusqueda")) {
				this.jButtonid_tipo_retencion_iva_prestaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenidoSriComprasBusqueda")) {
				this.jButtonpresta_iva_retenidoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadSriComprasBusqueda")) {
				this.jButtonfecha_caducidadSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableSriComprasBusqueda")) {
				this.jButtoncodigo_asiento_contableSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documento_contableSriComprasBusqueda")) {
				this.jButtonnumero_documento_contableSriComprasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSriComprasSriCompras")) {
				this.jButtonBusquedaSriComprasSriComprasActionPerformed(evt);
			}
			
			;
			
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSriCompras();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SriCompras sricomprasLocal=null;
			
			if(!this.getEsControlTabla()) {
				sricomprasLocal=this.sricompras;
			} else {
				sricomprasLocal=this.sricomprasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
							
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
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
			
			


			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
								
						
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
								
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
							
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
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
			
			


			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
								
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSriCompras")) {
					jCheckBoxSeleccionarTodosSriComprasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSriCompras")) {
					jCheckBoxSeleccionadosSriComprasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSriCompras")) {
					
				}
				
				


				
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
												
				
				


				
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
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
			
			


			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriComprasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sricompras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sricompras);
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
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
				
				


				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriCompras.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriCompras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriComprasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sricomprasAnterior =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sricomprasAnterior =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSriCompras")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSriComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSriCompras.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sricompras =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sricompras =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sricompras);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSriCompras")) {
				
				}
				
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSriCompras")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSriCompras.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSriCompras")) {
			
			}
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSriCompras();
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			if(sTipo.equals("NuevoSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSriCompras")) {
				jButtonDuplicarSriComprasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSriCompras")) {
				jButtonCopiarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSriCompras")) {
				jButtonVerFormSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSriCompras")) {
				jButtonNuevoSriComprasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSriCompras")) {
				jButtonModificarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSriCompras")) {
				jButtonActualizarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSriCompras")) {
				jButtonEliminarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSriCompras")) {
				jButtonCancelarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSriCompras")) {
				jButtonCerrarSriComprasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSriCompras")) {
				jButtonGuardarCambiosSriComprasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSriCompras")) {
				jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySriCompras")) {
				jButtonAbrirOrderBySriComprasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSriCompras")) {
				jButtonRecargarInformacionSriComprasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSriCompras")) {
				jButtonAnterioresSriComprasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSriCompras")) {
				jButtonSiguientesSriComprasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriComprasBusqueda")) {
				this.jButtonidSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriComprasUpdate")) {
				this.jButtonid_empresaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriComprasBusqueda")) {
				this.jButtonid_empresaSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriComprasUpdate")) {
				this.jButtonid_periodo_declaraSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriComprasBusqueda")) {
				this.jButtonid_periodo_declaraSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteSriComprasUpdate")) {
				this.jButtonid_clienteSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteSriComprasBusqueda")) {
				this.jButtonid_clienteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriComprasBusqueda")) {
				this.jButtonrucSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriComprasBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteSriComprasBusqueda")) {
				this.jButtonnombre_completo_clienteSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_datoSriComprasBusqueda")) {
				this.jButtonruc_datoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriComprasBusqueda")) {
				this.jButtonnumero_documentoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriComprasBusqueda")) {
				this.jButtonfecha_emisionSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriComprasBusqueda")) {
				this.jButtonfecha_registro_contableSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriComprasBusqueda")) {
				this.jButtonnumero_serieSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionSriComprasBusqueda")) {
				this.jButtonnumero_autorizacionSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bienes_ivaSriComprasBusqueda")) {
				this.jButtonbienes_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("servicion_ivaSriComprasBusqueda")) {
				this.jButtonservicion_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriComprasBusqueda")) {
				this.jButtontotal_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bienes_sin_ivaSriComprasBusqueda")) {
				this.jButtonbienes_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("servicios_sin_ivaSriComprasBusqueda")) {
				this.jButtonservicios_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaSriComprasBusqueda")) {
				this.jButtontotal_sin_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaSriComprasUpdate")) {
				this.jButtonid_tipo_ivaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaSriComprasBusqueda")) {
				this.jButtonid_tipo_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaSriComprasBusqueda")) {
				this.jButtonmonto_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_iceSriComprasBusqueda")) {
				this.jButtonmonto_iceSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenerSriComprasBusqueda")) {
				this.jButtontransfe_iva_retenerSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriComprasUpdate")) {
				this.jButtonid_tipo_retencion_ivaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriComprasBusqueda")) {
				this.jButtonid_tipo_retencion_ivaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenidoSriComprasBusqueda")) {
				this.jButtontransfe_iva_retenidoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenerSriComprasBusqueda")) {
				this.jButtonpresta_iva_retenerSriComprasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriComprasUpdate")) {
				this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriComprasBusqueda")) {
				this.jButtonid_tipo_retencion_iva_prestaSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenidoSriComprasBusqueda")) {
				this.jButtonpresta_iva_retenidoSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadSriComprasBusqueda")) {
				this.jButtonfecha_caducidadSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableSriComprasBusqueda")) {
				this.jButtoncodigo_asiento_contableSriComprasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documento_contableSriComprasBusqueda")) {
				this.jButtonnumero_documento_contableSriComprasBusquedaActionPerformed(evt);
			}
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSriCompras();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSriCompras")) {
				closingInternalFrameSriCompras();
				
			} else if(sTipo.equals("jButtonCancelarSriCompras")) {
				JInternalFrameBase jInternalFrameDetalleFormSriCompras = (JInternalFrameBase)evt.getSource();
	            	
	            SriComprasBeanSwingJInternalFrame jInternalFrameParent=(SriComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormSriCompras.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSriComprasActionPerformed(null);
			}
			
			SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sricompras,new Object(),this.sricomprasParameterGeneral,this.sricomprasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSriCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSriCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSriCompras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sricompras)) {
			if(!esControlTabla) {
				if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);			
				}
				
				if(this.sricomprasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSriCompras(this.sricompras,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSriCompras(this.sricomprasReturnGeneral,this.sricomprasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sricomprasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSriCompras(classes,this.sricomprasReturnGeneral,this.sricomprasBean,false);
					}
						
					if(this.sricomprasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySriCompras(this.sricomprasReturnGeneral.getSriCompras());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSriCompras(this.sricomprasReturnGeneral.getSriCompras());	
					}
						
					if(this.sricomprasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSriCompras(this.sricomprasReturnGeneral.getSriCompras(),classes);//this.sricomprasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSriCompras(this.sricompras,classes);//this.sricomprasBean);									
				}
			
				if(SriComprasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSriCompras(this.sricompras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriCompras(this.sricompras);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sricomprasAnterior!=null) {
						this.sricompras=this.sricomprasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sricomprasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sricomprasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sricomprasReturnGeneral.getSriCompras(),sricomprasLogic.getSriComprass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sricomprasReturnGeneral.getSriCompras(),this.sricomprass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSriCompras.repaint();
				
				//((AbstractTableModel) this.jTableDatosSriCompras.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSriCompras();
			}
		}
	}
	
	public void actualizarVisualTableDatosSriCompras() throws Exception {
		
		SriComprasModel sricomprasModel=(SriComprasModel)this.jTableDatosSriCompras.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sricomprasModel.sricomprass=this.sricomprasLogic.getSriComprass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sricomprasModel.sricomprass=this.sricomprass;
		}
		
		
		((SriComprasModel) this.jTableDatosSriCompras.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSriCompras() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsricomprasAnterior(),this.sricomprasLogic.getSriComprass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsricomprasAnterior(),this.sricomprass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSriCompras();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSriCompras(SriCompras sricompras,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
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
										
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sricompras,new Object(),generalEntityParameterGeneral,this.sricomprasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SriComprasConstantesFunciones.getClassesRelationshipsOfSriCompras(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SriComprasConstantesFunciones.getClassesRelationshipsFromStringsOfSriCompras(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSriCompras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SriComprasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sricompras,new Object(),generalEntityParameterGeneral,this.sricomprasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSriCompras(SriComprasBean sricomprasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSriCompras(ArrayList<Classe> classes,SriComprasReturnGeneral sricomprasReturnGeneral,SriComprasBean sricomprasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSriCompras(SriCompras sricompras,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sricompras)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSriCompras = new SriComprasDetalleFormJInternalFrame(jDesktopPane,this.sricomprasSessionBean.getConGuardarRelaciones(),this.sricomprasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSriCompras);
		this.jInternalFrameDetalleFormSriCompras.setVisible(false);
		this.jInternalFrameDetalleFormSriCompras.setSelected(false);						
		
		this.jInternalFrameDetalleFormSriCompras.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSriCompras.sricomprasLogic=this.sricomprasLogic;
		
		this.cargarCombosFrameForeignKeySriCompras("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSriCompras();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriCompras();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySriCompras("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySriCompras();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSriCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriCompras"));
		
		this.jInternalFrameDetalleFormSriCompras.jButtonModificarSriCompras.addActionListener(new ButtonActionListener(this,"ModificarSriCompras"));

		
		this.jInternalFrameDetalleFormSriCompras.jButtonModificarToolBarSriCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriCompras"));
					
		this.jInternalFrameDetalleFormSriCompras.jMenuItemModificarSriCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriCompras"));		
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.addActionListener (new ButtonActionListener(this,"ActualizarSriCompras"));
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonActualizarToolBarSriCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriCompras"));
						
		this.jInternalFrameDetalleFormSriCompras.jMenuItemActualizarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriCompras"));		
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.addActionListener (new ButtonActionListener(this,"EliminarSriCompras"));
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonEliminarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriCompras"));
								
		this.jInternalFrameDetalleFormSriCompras.jMenuItemEliminarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriCompras"));		
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.addActionListener (new ButtonActionListener(this,"CancelarSriCompras"));
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonCancelarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriCompras"));
					
		this.jInternalFrameDetalleFormSriCompras.jMenuItemCancelarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriCompras"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jMenuItemDetalleCerrarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriCompras"));		
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosToolBarSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriCompras"));
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosToolBarSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriCompras"));
		
		
		
		this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriCompras"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonidSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"idSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonrucSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"rucSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_tipo_comprobanteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_completo_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonruc_datoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documentoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_emisionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_registro_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_serieSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_autorizacionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicios_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicios_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_iceSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_iceSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_caducidadSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtoncodigo_asiento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriComprasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriCompras"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSriCompras"));
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriCompras"));
		}
		
		this.jTableDatosSriCompras.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSriCompras"));
		
		this.jTableDatosSriCompras.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSriCompras"));
		
		this.jButtonNuevoSriCompras.addActionListener(new ButtonActionListener(this,"NuevoSriCompras"));
		
		this.jButtonDuplicarSriCompras.addActionListener(new ButtonActionListener(this,"DuplicarSriCompras"));
		
		this.jButtonCopiarSriCompras.addActionListener(new ButtonActionListener(this,"CopiarSriCompras"));
		
		this.jButtonVerFormSriCompras.addActionListener(new ButtonActionListener(this,"VerFormSriCompras"));
		
		
		this.jButtonNuevoToolBarSriCompras.addActionListener(new ButtonActionListener(this,"NuevoToolBarSriCompras"));
			
		this.jButtonDuplicarToolBarSriCompras.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSriCompras"));
			
		this.jMenuItemNuevoSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSriCompras"));
			
		this.jMenuItemDuplicarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSriCompras"));		
		
		
		this.jButtonNuevoRelacionesSriCompras.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSriCompras"));
		
		
		this.jButtonNuevoRelacionesToolBarSriCompras.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSriCompras"));
			
		this.jMenuItemNuevoRelacionesSriCompras.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSriCompras"));		
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonModificarSriCompras.addActionListener(new ButtonActionListener(this,"ModificarSriCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonModificarToolBarSriCompras.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriCompras"));
			
			this.jInternalFrameDetalleFormSriCompras.jMenuItemModificarSriCompras.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSriCompras.jButtonActualizarSriCompras.addActionListener (new ButtonActionListener(this,"ActualizarSriCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonActualizarToolBarSriCompras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriCompras"));
				
			this.jInternalFrameDetalleFormSriCompras.jMenuItemActualizarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonEliminarSriCompras.addActionListener (new ButtonActionListener(this,"EliminarSriCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonEliminarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriCompras"));
						
			this.jInternalFrameDetalleFormSriCompras.jMenuItemEliminarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonCancelarSriCompras.addActionListener (new ButtonActionListener(this,"CancelarSriCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonCancelarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriCompras"));
			
			this.jInternalFrameDetalleFormSriCompras.jMenuItemCancelarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriCompras"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSriCompras.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSriCompras"));		
		
		
		this.jButtonCerrarSriCompras.addActionListener (new ButtonActionListener(this,"CerrarSriCompras"));
		
		
		this.jButtonCerrarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"CerrarToolBarSriCompras"));
			
		this.jMenuItemCerrarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSriCompras"));
			
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jMenuItemDetalleCerrarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriCompras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosSriCompras"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosToolBarSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriCompras"));
		}
		
		this.jButtonCopiarToolBarSriCompras.addActionListener (new ButtonActionListener(this,"CopiarToolBarSriCompras"));
			
		this.jButtonVerFormToolBarSriCompras.addActionListener (new ButtonActionListener(this,"VerFormToolBarSriCompras"));
		
		this.jMenuItemGuardarCambiosSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSriCompras"));
			
		this.jMenuItemCopiarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSriCompras"));		
		
		this.jMenuItemVerFormSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSriCompras"));		
		
		
		this.jButtonGuardarCambiosTablaSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriCompras"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSriCompras"));
			
		this.jMenuItemGuardarCambiosTablaSriCompras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriCompras"));		
		
		
		
		this.jButtonRecargarInformacionSriCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionSriCompras"));
					
		this.jButtonRecargarInformacionToolBarSriCompras.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSriCompras"));
		
		this.jMenuItemRecargarInformacionSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSriCompras"));		
		
		
		
		this.jButtonAnterioresSriCompras.addActionListener (new ButtonActionListener(this,"AnterioresSriCompras"));
		
		
		this.jButtonAnterioresToolBarSriCompras.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSriCompras"));
		
		this.jMenuItemAnterioresSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSriCompras"));		
		
		
		this.jButtonSiguientesSriCompras.addActionListener (new ButtonActionListener(this,"SiguientesSriCompras"));
		
		
		this.jButtonSiguientesToolBarSriCompras.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSriCompras"));
			
		this.jMenuItemSiguientesSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSriCompras"));
			
		this.jMenuItemAbrirOrderBySriCompras.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySriCompras"));
			
		this.jMenuItemMostrarOcultarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSriCompras"));
			
		this.jMenuItemDetalleAbrirOrderBySriCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySriCompras"));
			
		this.jMenuItemDetalleMostarOcultarSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSriCompras"));		
		
		
		this.jButtonNuevoGuardarCambiosSriCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSriCompras"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriCompras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSriCompras"));
			
		this.jMenuItemNuevoGuardarCambiosSriCompras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSriCompras"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSriCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSriCompras"));

		this.jCheckBoxSeleccionadosSriCompras.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSriCompras"));
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriCompras"));
		}
		
		
		this.jComboBoxTiposRelacionesSriCompras.addActionListener (new ButtonActionListener(this,"TiposRelacionesSriCompras"));
			
		this.jComboBoxTiposAccionesSriCompras.addActionListener (new ButtonActionListener(this,"TiposAccionesSriCompras"));
					
		this.jComboBoxTiposSeleccionarSriCompras.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSriCompras"));
			
		this.jTextFieldValorCampoGeneralSriCompras.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSriCompras"));		
		
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonidSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"idSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonrucSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"rucSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_tipo_comprobanteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_completo_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonruc_datoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documentoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_emisionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_registro_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_serieSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_autorizacionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicios_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicios_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_iceSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_iceSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_caducidadSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtoncodigo_asiento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriComprasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSriComprasSriCompras.addActionListener(new ButtonActionListener(this,"BusquedaSriComprasSriCompras"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSriCompras!=null) {
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriCompras"));
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriCompras"));
				this.jInternalFrameReporteDinamicoSriCompras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriCompras"));
			}
			
			//this.jButtonCerrarReporteDinamicoSriCompras.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriCompras"));				
			//this.jButtonGenerarReporteDinamicoSriCompras.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriCompras"));
			//this.jButtonGenerarExcelReporteDinamicoSriCompras.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriCompras"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSriCompras!=null) {
				this.jInternalFrameImportacionSriCompras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriCompras"));
				this.jInternalFrameImportacionSriCompras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriCompras"));
				this.jInternalFrameImportacionSriCompras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriCompras"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySriCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderBySriCompras"));
			
			this.jButtonAbrirOrderByToolBarSriCompras.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSriCompras"));			
			
			if(this.jInternalFrameOrderBySriCompras!=null) {
				this.jInternalFrameOrderBySriCompras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriCompras"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSriCompras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriCompras.jTabbedPaneRelacionesSriCompras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriCompras"));
		
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
            		closingInternalFrameSriCompras();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSriCompras.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSriCompras = (JInternalFrameBase)event.getSource();
	            	
	            SriComprasBeanSwingJInternalFrame jInternalFrameParent=(SriComprasBeanSwingJInternalFrame)jInternalFrameDetalleFormSriCompras.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSriComprasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSriCompras.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSriComprasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSriCompras.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSriCompras.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSriCompras";
		inputMap = this.jButtonNuevoSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriComprasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriComprasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSriCompras";
		inputMap = this.jButtonNuevoRelacionesSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriComprasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSriCompras";
		inputMap = this.jButtonModificarSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSriCompras";
		inputMap = this.jButtonActualizarSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSriCompras";
		inputMap = this.jButtonEliminarSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSriCompras";
		inputMap = this.jButtonCancelarSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSriCompras";
		inputMap = this.jButtonCerrarSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSriCompras";
		inputMap = this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSriCompras.jButtonGuardarCambiosSriCompras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSriComprasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSriCompras.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSriComprasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSriCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSriComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSriCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSriComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSriCompras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSriComprasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonidSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"idSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_empresaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_periodo_declaraSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonrucSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"rucSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_tipo_comprobanteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnombre_completo_clienteSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonruc_datoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documentoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_emisionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_registro_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_serieSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_autorizacionSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonbienes_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"bienes_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonservicios_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"servicios_sin_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontotal_sin_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonmonto_iceSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"monto_iceSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_ivaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtontransfe_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenerSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenerSriComprasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonpresta_iva_retenidoSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonfecha_caducidadSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtoncodigo_asiento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriComprasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriCompras.jButtonnumero_documento_contableSriComprasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriComprasBusqueda"));
		
		
		this.jButtonBusquedaSriComprasSriCompras.addActionListener(new ButtonActionListener(this,"BusquedaSriComprasSriCompras"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSriCompras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSriComprasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSriComprasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSriCompras.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSriCompras(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
					sricomprasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriCompras sricomprasAux:sricomprass) {
					sricomprasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSriComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
						sricomprasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriCompras sricomprasAux:sricomprass) {
						sricomprasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriCompras sricomprasAux:sricomprass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSriCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSriComprasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriCompras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSriCompras.getSelectedRows();
			
			SriCompras sricomprasLocal=new SriCompras();
			
			//this.seleccionarTodosSriCompras(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sricomprasLocal =(SriCompras) this.sricomprasLogic.getSriComprass().toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sricomprasLocal =(SriCompras) this.sricomprass.toArray()[this.jTableDatosSriCompras.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sricomprasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
						sricomprasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriCompras sricomprasAux:sricomprass) {
						sricomprasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSriCompras(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriCompras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriCompras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriCompras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSriComprasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSriComprasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSriComprasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSriCompras(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSriCompras.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriCompras sricomprasAux:this.sricomprasLogic.getSriComprass()) {
				
						if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sricomprasAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sricomprasAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							sricomprasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUCDATO)) {
							existe=true;
							sricomprasAux.setruc_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sricomprasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sricomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sricomprasAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sricomprasAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							sricomprasAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_BIENESIVA)) {
							existe=true;
							sricomprasAux.setbienes_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_SERVICIONIVA)) {
							existe=true;
							sricomprasAux.setservicion_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sricomprasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_BIENESSINIVA)) {
							existe=true;
							sricomprasAux.setbienes_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA)) {
							existe=true;
							sricomprasAux.setservicios_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							sricomprasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							sricomprasAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_MONTOICE)) {
							existe=true;
							sricomprasAux.setmonto_ice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER)) {
							existe=true;
							sricomprasAux.settransfe_iva_retener(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO)) {
							existe=true;
							sricomprasAux.settransfe_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER)) {
							existe=true;
							sricomprasAux.setpresta_iva_retener(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO)) {
							existe=true;
							sricomprasAux.setpresta_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							sricomprasAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							sricomprasAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
							existe=true;
							sricomprasAux.setnumero_documento_contable(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriCompras sricomprasAux:sricomprass) {
					
						if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sricomprasAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sricomprasAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							sricomprasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUCDATO)) {
							existe=true;
							sricomprasAux.setruc_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sricomprasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sricomprasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sricomprasAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sricomprasAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							sricomprasAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_BIENESIVA)) {
							existe=true;
							sricomprasAux.setbienes_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_SERVICIONIVA)) {
							existe=true;
							sricomprasAux.setservicion_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sricomprasAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_BIENESSINIVA)) {
							existe=true;
							sricomprasAux.setbienes_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA)) {
							existe=true;
							sricomprasAux.setservicios_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							sricomprasAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							sricomprasAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_MONTOICE)) {
							existe=true;
							sricomprasAux.setmonto_ice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER)) {
							existe=true;
							sricomprasAux.settransfe_iva_retener(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO)) {
							existe=true;
							sricomprasAux.settransfe_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER)) {
							existe=true;
							sricomprasAux.setpresta_iva_retener(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO)) {
							existe=true;
							sricomprasAux.setpresta_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							sricomprasAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							sricomprasAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
							existe=true;
							sricomprasAux.setnumero_documento_contable(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSriCompras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSriComprasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSriCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSriCompras=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSriCompras.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSriCompras) {				
					conSplash=true;//false;										
					
					//this.startProcessSriCompras(conSplash);
				
					this.generarReporteSriComprassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSriComprassSeleccionados();
				//this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriComprassSeleccionados(false);
				//this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriComprassSeleccionados(true);
				//this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriCompras();
				
				this.exportarSriComprassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSriComprass();
				//this.importarSriComprass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriCompras();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSriComprassSeleccionados();
				//this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sri Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSriCompras();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSriCompras)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySriCompras(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
				}	
			} 			
			else if(SriComprasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSriCompras) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSriCompras(conSplash);
					
						//this.actualizarParametrosGeneralSriCompras();
						
						this.generarReporteProcesoAccionSriComprassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SriComprasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sri ComprasES SELECCIONADOS?", "MANTENIMIENTO DE Sri Compras", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSriCompras();
				
						this.actualizarParametrosGeneralSriCompras();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sricomprasReturnGeneral=sricomprasLogic.procesarAccionSriComprassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sricomprasLogic.getSriComprass(),this.sricomprasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSriComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSriCompras();
					
					SriComprasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSriComprasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriCompras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriCompras.jComboBoxTiposAccionesFormularioSriCompras.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSriCompras(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSriComprasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSriCompras();
			
			if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
			SriCompras sricompras=new SriCompras();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSriCompras(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSriCompras.getSelectedItem();
			
			
			
			
			sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
			//this.sTipoAccion;
			
			if(sricomprassSeleccionados.size()==1) {
				for(SriCompras sricomprasAux:sricomprassSeleccionados) {
					sricompras=sricomprasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSriCompras();
			
      		//this.finishProcessSriCompras(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSriComprasReturnGeneral() throws Exception {
		if(this.sricomprasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sricomprasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sricomprasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sricomprasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sricomprasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sricomprasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSriCompras(false);
		}
		
		if(this.sricomprasReturnGeneral.getConRetornoLista() || this.sricomprasReturnGeneral.getConRetornoObjeto()) {
			if(this.sricomprasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sricomprasLogic.setSriComprass(this.sricomprasReturnGeneral.getSriComprass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSriCompras(false);
		}
	}
	
	public void actualizarParametrosGeneralSriCompras() throws Exception {
		
		
	}
	
	public ArrayList<SriCompras> getSriComprassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSriCompras) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SriCompras sricomprasAux:sricomprasLogic.getSriComprass()) {
					if(sricomprasAux.getIsSelected()) {
						sricomprassSeleccionados.add(sricomprasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriCompras sricomprasAux:this.sricomprass) {
					if(sricomprasAux.getIsSelected()) {
						sricomprassSeleccionados.add(sricomprasAux);				
					}
				}
			}
			
			if(sricomprassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sricomprassSeleccionados.addAll(this.sricomprasLogic.getSriComprass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sricomprassSeleccionados.addAll(this.sricomprass);				
					}
				}
			}
		} else {
			sricomprassSeleccionados.add(this.sricompras);
		}
		
		return sricomprassSeleccionados;
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
	
	public void generarReporteSriComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSriComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSriComprassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriComprassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriComprassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sri Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSriComprass("Todos",sricomprassSeleccionados);
		
	}	
	
	public void generarReporteNormalSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSriComprass("Todos",sricomprassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSriComprassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSriComprass("Todos",sricomprassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSriCompras();
		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSriCompras();
		
		
		//this.generarReporteSriComprass("Todos",sricomprassSeleccionados ,sricomprasImplementable,sricomprasImplementableHome);
	}
	
	public void mostrarImportacionSriComprass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSriCompras();
		
		this.abrirFrameImportacionSriCompras();		
		
			
		//this.generarReporteSriComprass("Todos",sricomprassSeleccionados ,sricomprasImplementable,sricomprasImplementableHome);
	}
	
	public void importarSriComprass() throws Exception {		
	
	}
	
	public void exportarSriComprassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSriComprassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSriComprassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSriComprassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sri Compras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSriCompras(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SriCompras sricomprasAux:sricomprassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSriCompras(sricomprasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sricomprasAux.setsDetalleGeneralEntityReporte(sricomprasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSriCompras(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_RUCDATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_BIENESIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_SERVICIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_BIENESSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDTIPOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_MONTOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_MONTOICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSriCompras(SriCompras sricompras,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sricompras.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnombre_tipo_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getruc_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getfecha_registro_contable().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnumero_serie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getbienes_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getservicion_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getbienes_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getservicios_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettipoiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getmonto_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getmonto_ice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettransfe_iva_retener().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettiporetencioniva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettransfe_iva_retenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getpresta_iva_retener().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.gettiporetencionivapresta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getpresta_iva_retenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getfecha_caducidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getcodigo_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sricompras.getnumero_documento_contable();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SriComprass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSriCompras(row);				
				iRow++;
			}				
			
			for(SriCompras sricomprasAux:sricomprassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSriCompras(sricomprasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSriComprassSeleccionados() throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();		
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sricompras.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sricomprass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sricompras");
			//elementRoot.appendChild(element);
		
			for(SriCompras sricomprasAux:sricomprassSeleccionados) {
				element = document.createElement("sricompras");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSriCompras(sricomprasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Compras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSriCompras(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_RUCDATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_BIENESSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_MONTOICE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSriCompras(SriCompras sricompras,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnombre_tipo_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getruc_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getfecha_registro_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getbienes_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getservicion_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getbienes_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getservicios_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettipoiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getmonto_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getmonto_ice());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettransfe_iva_retener());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettiporetencioniva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettransfe_iva_retenido());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getpresta_iva_retener());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.gettiporetencionivapresta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getpresta_iva_retenido());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getfecha_caducidad());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getcodigo_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(sricompras.getnumero_documento_contable());				
	}
	
	public void setFilaDatosExportarXmlSriCompras(SriCompras sricompras,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SriComprasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sricompras.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SriComprasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sricompras.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SriComprasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(sricompras.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementperiododeclara_descripcion = document.createElement(SriComprasConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(sricompras.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementcliente_descripcion = document.createElement(SriComprasConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(sricompras.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementruc = document.createElement(SriComprasConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(sricompras.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_tipo_comprobante = document.createElement(SriComprasConstantesFunciones.NOMBRETIPOCOMPROBANTE);
		elementnombre_tipo_comprobante.appendChild(document.createTextNode(sricompras.getnombre_tipo_comprobante().trim()));
		element.appendChild(elementnombre_tipo_comprobante);

		Element elementnombre_completo_cliente = document.createElement(SriComprasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(sricompras.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementruc_dato = document.createElement(SriComprasConstantesFunciones.RUCDATO);
		elementruc_dato.appendChild(document.createTextNode(sricompras.getruc_dato().trim()));
		element.appendChild(elementruc_dato);

		Element elementnumero_documento = document.createElement(SriComprasConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(sricompras.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementfecha_emision = document.createElement(SriComprasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(sricompras.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_registro_contable = document.createElement(SriComprasConstantesFunciones.FECHAREGISTROCONTABLE);
		elementfecha_registro_contable.appendChild(document.createTextNode(sricompras.getfecha_registro_contable().toString().trim()));
		element.appendChild(elementfecha_registro_contable);

		Element elementnumero_serie = document.createElement(SriComprasConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(sricompras.getnumero_serie().trim()));
		element.appendChild(elementnumero_serie);

		Element elementnumero_autorizacion = document.createElement(SriComprasConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(sricompras.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementbienes_iva = document.createElement(SriComprasConstantesFunciones.BIENESIVA);
		elementbienes_iva.appendChild(document.createTextNode(sricompras.getbienes_iva().toString().trim()));
		element.appendChild(elementbienes_iva);

		Element elementservicion_iva = document.createElement(SriComprasConstantesFunciones.SERVICIONIVA);
		elementservicion_iva.appendChild(document.createTextNode(sricompras.getservicion_iva().toString().trim()));
		element.appendChild(elementservicion_iva);

		Element elementtotal_iva = document.createElement(SriComprasConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(sricompras.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementbienes_sin_iva = document.createElement(SriComprasConstantesFunciones.BIENESSINIVA);
		elementbienes_sin_iva.appendChild(document.createTextNode(sricompras.getbienes_sin_iva().toString().trim()));
		element.appendChild(elementbienes_sin_iva);

		Element elementservicios_sin_iva = document.createElement(SriComprasConstantesFunciones.SERVICIOSSINIVA);
		elementservicios_sin_iva.appendChild(document.createTextNode(sricompras.getservicios_sin_iva().toString().trim()));
		element.appendChild(elementservicios_sin_iva);

		Element elementtotal_sin_iva = document.createElement(SriComprasConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(sricompras.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementtipoiva_descripcion = document.createElement(SriComprasConstantesFunciones.IDTIPOIVA);
		elementtipoiva_descripcion.appendChild(document.createTextNode(sricompras.gettipoiva_descripcion()));
		element.appendChild(elementtipoiva_descripcion);

		Element elementmonto_iva = document.createElement(SriComprasConstantesFunciones.MONTOIVA);
		elementmonto_iva.appendChild(document.createTextNode(sricompras.getmonto_iva().toString().trim()));
		element.appendChild(elementmonto_iva);

		Element elementmonto_ice = document.createElement(SriComprasConstantesFunciones.MONTOICE);
		elementmonto_ice.appendChild(document.createTextNode(sricompras.getmonto_ice().toString().trim()));
		element.appendChild(elementmonto_ice);

		Element elementtransfe_iva_retener = document.createElement(SriComprasConstantesFunciones.TRANSFEIVARETENER);
		elementtransfe_iva_retener.appendChild(document.createTextNode(sricompras.gettransfe_iva_retener().toString().trim()));
		element.appendChild(elementtransfe_iva_retener);

		Element elementtiporetencioniva_descripcion = document.createElement(SriComprasConstantesFunciones.IDTIPORETENCIONIVA);
		elementtiporetencioniva_descripcion.appendChild(document.createTextNode(sricompras.gettiporetencioniva_descripcion()));
		element.appendChild(elementtiporetencioniva_descripcion);

		Element elementtransfe_iva_retenido = document.createElement(SriComprasConstantesFunciones.TRANSFEIVARETENIDO);
		elementtransfe_iva_retenido.appendChild(document.createTextNode(sricompras.gettransfe_iva_retenido().toString().trim()));
		element.appendChild(elementtransfe_iva_retenido);

		Element elementpresta_iva_retener = document.createElement(SriComprasConstantesFunciones.PRESTAIVARETENER);
		elementpresta_iva_retener.appendChild(document.createTextNode(sricompras.getpresta_iva_retener().toString().trim()));
		element.appendChild(elementpresta_iva_retener);

		Element elementtiporetencionivapresta_descripcion = document.createElement(SriComprasConstantesFunciones.IDTIPORETENCIONIVAPRESTA);
		elementtiporetencionivapresta_descripcion.appendChild(document.createTextNode(sricompras.gettiporetencionivapresta_descripcion()));
		element.appendChild(elementtiporetencionivapresta_descripcion);

		Element elementpresta_iva_retenido = document.createElement(SriComprasConstantesFunciones.PRESTAIVARETENIDO);
		elementpresta_iva_retenido.appendChild(document.createTextNode(sricompras.getpresta_iva_retenido().toString().trim()));
		element.appendChild(elementpresta_iva_retenido);

		Element elementfecha_caducidad = document.createElement(SriComprasConstantesFunciones.FECHACADUCIDAD);
		elementfecha_caducidad.appendChild(document.createTextNode(sricompras.getfecha_caducidad().toString().trim()));
		element.appendChild(elementfecha_caducidad);

		Element elementcodigo_asiento_contable = document.createElement(SriComprasConstantesFunciones.CODIGOASIENTOCONTABLE);
		elementcodigo_asiento_contable.appendChild(document.createTextNode(sricompras.getcodigo_asiento_contable().trim()));
		element.appendChild(elementcodigo_asiento_contable);

		Element elementnumero_documento_contable = document.createElement(SriComprasConstantesFunciones.NUMERODOCUMENTOCONTABLE);
		elementnumero_documento_contable.appendChild(document.createTextNode(sricompras.getnumero_documento_contable().trim()));
		element.appendChild(elementnumero_documento_contable);
	}
	
	public void generarReporteGroupGenericoSriComprassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SriCompras> sricomprassSeleccionados=new ArrayList<SriCompras>();
		
		sricomprassSeleccionados=this.getSriComprassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSriCompras(sricomprassSeleccionados);
		
		this.generarReporteSriComprass("Todos",sricomprassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSriCompras(ArrayList<SriCompras> sricomprassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SriCompras sricomprasAux:sricomprassSeleccionados) {
				sricomprasAux.setsDetalleGeneralEntityReporte(sricomprasAux.toString());
			
				if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUC)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnombre_tipo_comprobante());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_RUCDATO)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getruc_dato());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sricomprasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sricomprasAux.getfecha_registro_contable()));
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnumero_serie());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDTIPOIVA)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.gettipoiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.gettiporetencioniva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.gettiporetencionivapresta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sricomprasAux.getfecha_caducidad()));
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getcodigo_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
					existe=true;
					sricomprasAux.setsDescripcionGeneralEntityReporte1(sricomprasAux.getnumero_documento_contable());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriComprasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSriCompras(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSriCompras=true;
				this.isVisibilidadCeldaNuevoRelacionesSriCompras=true;
				this.isVisibilidadCeldaGuardarCambiosSriCompras=true;
			}
			
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=true;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=true;
			this.isVisibilidadCeldaEliminarSriCompras=true;
			this.isVisibilidadCeldaCancelarSriCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=true;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSriCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=true;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=true;
			this.isVisibilidadCeldaModificarSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=true;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
			this.isVisibilidadCeldaModificarSriCompras=true;
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
			this.isVisibilidadCeldaCancelarSriCompras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				} else {
					this.isVisibilidadCeldaGuardarSriCompras=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SriComprasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSriCompras=true;
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=true;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=true;
		} else {
			this.actualizarEstadoPanelsSriCompras(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSriCompras=false;
			//this.isVisibilidadCeldaVerFormSriCompras=false;
			this.isVisibilidadCeldaDuplicarSriCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sricomprasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
		} else {
			this.isVisibilidadCeldaNuevoSriCompras=false;
			this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sricomprasSessionBean.getEsGuardarRelacionado()) {
			if(!sricomprasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;												
			}
			
			this.jButtonCerrarSriCompras.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
		}
		
		if(!this.permiteMantenimiento(this.sricompras)) {
			this.isVisibilidadCeldaActualizarSriCompras=false;
			this.isVisibilidadCeldaEliminarSriCompras=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSriCompras=false;
		this.isVisibilidadCeldaNuevoRelacionesSriCompras=false;
		this.isVisibilidadCeldaGuardarCambiosSriCompras=false;
		//this.isVisibilidadCeldaModificarSriCompras=true;
		this.isVisibilidadCeldaActualizarSriCompras=false;
		this.isVisibilidadCeldaEliminarSriCompras=false;
		//this.isVisibilidadCeldaCancelarSriCompras=true;			
		this.isVisibilidadCeldaGuardarSriCompras=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSriCompras() {
	}
	
	public void actualizarEstadoPanelsSriCompras(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSriCompras!=null) {
				this.jScrollPanelDatosEdicionSriCompras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriCompras!=null) {
				this.jScrollPanelDatosSriCompras.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriCompras!=null) {
				this.jPanelPaginacionSriCompras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSriCompras!=null) {
					this.jTabbedPaneBusquedasSriCompras.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriCompras!=null) {
				this.jTabbedPaneBusquedasSriCompras.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSriCompras!=null) {
				this.jPanelParametrosReportesSriCompras.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSriCompras=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadBusquedaSriCompras=isParaPeriodoDeclara;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaSriCompras=isParaCliente;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIva(Boolean isParaTipoIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIvaNegation=!isParaTipoIva;

			this.isVisibilidadBusquedaSriCompras=isParaTipoIvaNegation;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencionIva(Boolean isParaTipoRetencionIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionIvaNegation=!isParaTipoRetencionIva;

			this.isVisibilidadBusquedaSriCompras=isParaTipoRetencionIvaNegation;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencionIvaPresta(Boolean isParaTipoRetencionIvaPresta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionIvaPrestaNegation=!isParaTipoRetencionIvaPresta;

			this.isVisibilidadBusquedaSriCompras=isParaTipoRetencionIvaPrestaNegation;
			if(!this.isVisibilidadBusquedaSriCompras) {this.jTabbedPaneBusquedasSriCompras.remove(jPanelBusquedaSriComprasSriCompras);}
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
			
			this.inicializarActualizarBindingTablaSriCompras(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSriCompras() {
		this.updateBorderResaltarBusquedasFormularioSriCompras();
		this.updateVisibilidadBusquedasFormularioSriCompras();
		this.updateHabilitarBusquedasFormularioSriCompras();
	}
	
	public void updateBorderResaltarBusquedasFormularioSriCompras() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSriCompras.getComponents().length>0) {
	

		if(this.sricomprasConstantesFunciones.resaltarBusquedaSriComprasSriCompras!=null) {
			index= this.jTabbedPaneBusquedasSriCompras.indexOfComponent(this.jPanelBusquedaSriComprasSriCompras);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriCompras.getComponent(index);
				jPanel.setBorder(this.sricomprasConstantesFunciones.resaltarBusquedaSriComprasSriCompras);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSriCompras() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSriCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriCompras.indexOfComponent(this.jPanelBusquedaSriComprasSriCompras);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSriCompras.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sricomprasConstantesFunciones.mostrarBusquedaSriComprasSriCompras);
			if(!this.sricomprasConstantesFunciones.mostrarBusquedaSriComprasSriCompras && index>-1) {
				this.jTabbedPaneBusquedasSriCompras.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSriCompras() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSriCompras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriCompras.indexOfComponent(this.jPanelBusquedaSriComprasSriCompras);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSriCompras.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sricomprasConstantesFunciones.activarBusquedaSriComprasSriCompras);
				this.jTabbedPaneBusquedasSriCompras.setEnabledAt(index,this.sricomprasConstantesFunciones.activarBusquedaSriComprasSriCompras);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSriCompras(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSriCompras")) {
			index= this.jTabbedPaneBusquedasSriCompras.indexOfComponent(this.jPanelBusquedaSriComprasSriCompras);

			this.jTabbedPaneBusquedasSriCompras.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriCompras.getComponent(index);

			this.sricomprasConstantesFunciones.setResaltarBusquedaSriComprasSriCompras(resaltar);

			jPanel.setBorder(this.sricomprasConstantesFunciones.resaltarBusquedaSriComprasSriCompras);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSriCompras.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSriCompras() throws Exception {

		if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSriCompras();
		this.updateVisibilidadResaltarControlesFormularioSriCompras();
		this.updateHabilitarResaltarControlesFormularioSriCompras();
		
	}
	
	public void updateBorderResaltarControlesFormularioSriCompras() throws Exception {
		if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sricomprasConstantesFunciones.resaltaridSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltaridSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_empresaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_empresaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_periodo_declaraSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_periodo_declaraSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_clienteSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_clienteSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarrucSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldrucSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarrucSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnombre_tipo_comprobanteSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnombre_tipo_comprobanteSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnombre_completo_clienteSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnombre_completo_clienteSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarruc_datoSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarruc_datoSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnumero_documentoSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnumero_documentoSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarfecha_emisionSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarfecha_emisionSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarfecha_registro_contableSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarfecha_registro_contableSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnumero_serieSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnumero_serieSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnumero_autorizacionSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnumero_autorizacionSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarbienes_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarbienes_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarservicion_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarservicion_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltartotal_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltartotal_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarbienes_sin_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarbienes_sin_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarservicios_sin_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarservicios_sin_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltartotal_sin_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltartotal_sin_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_tipo_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_tipo_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarmonto_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarmonto_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarmonto_iceSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarmonto_iceSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenerSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenerSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_ivaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_ivaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenidoSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltartransfe_iva_retenidoSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenerSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenerSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenidoSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarpresta_iva_retenidoSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarfecha_caducidadSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarfecha_caducidadSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarcodigo_asiento_contableSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarcodigo_asiento_contableSriCompras);}
		if(this.sricomprasConstantesFunciones.resaltarnumero_documento_contableSriCompras!=null && this.jInternalFrameDetalleFormSriCompras!=null) {this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setBorder(this.sricomprasConstantesFunciones.resaltarnumero_documento_contableSriCompras);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSriCompras() throws Exception {		
		if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
	
		//this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setVisible(this.sricomprasConstantesFunciones.mostraridSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelidSriCompras.setVisible(this.sricomprasConstantesFunciones.mostraridSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_empresaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_empresaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_empresaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_periodo_declaraSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_periodo_declaraSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_periodo_declaraSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_clienteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_clienteSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldrucSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarrucSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelrucSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarrucSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnombre_tipo_comprobanteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnombre_tipo_comprobanteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnombre_tipo_comprobanteSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnombre_completo_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnombre_completo_clienteSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnombre_completo_clienteSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarruc_datoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelruc_datoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarruc_datoSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_documentoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnumero_documentoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_documentoSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_emisionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelfecha_emisionSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_emisionSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_registro_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelfecha_registro_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_registro_contableSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_serieSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnumero_serieSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_serieSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_autorizacionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnumero_autorizacionSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_autorizacionSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarbienes_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelbienes_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarbienes_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarservicion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelservicion_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarservicion_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartotal_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPaneltotal_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartotal_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarbienes_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelbienes_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarbienes_sin_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarservicios_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelservicios_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarservicios_sin_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartotal_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPaneltotal_sin_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartotal_sin_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_tipo_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarmonto_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelmonto_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarmonto_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarmonto_iceSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelmonto_iceSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarmonto_iceSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPaneltransfe_iva_retenerSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenerSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_tipo_retencion_ivaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_ivaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPaneltransfe_iva_retenidoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrartransfe_iva_retenidoSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelpresta_iva_retenerSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenerSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelid_tipo_retencion_iva_prestaSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelpresta_iva_retenidoSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarpresta_iva_retenidoSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_caducidadSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelfecha_caducidadSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarfecha_caducidadSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarcodigo_asiento_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelcodigo_asiento_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarcodigo_asiento_contableSriCompras);
		//this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_documento_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jPanelnumero_documento_contableSriCompras.setVisible(this.sricomprasConstantesFunciones.mostrarnumero_documento_contableSriCompras);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSriCompras() throws Exception {
		if(this.jInternalFrameDetalleFormSriCompras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriCompras!=null) {
	
		this.jInternalFrameDetalleFormSriCompras.jLabelidSriCompras.setEnabled(this.sricomprasConstantesFunciones.activaridSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_empresaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_empresaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_periodo_declaraSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_periodo_declaraSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_clienteSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldrucSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarrucSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_tipo_comprobanteSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnombre_tipo_comprobanteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextAreanombre_completo_clienteSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnombre_completo_clienteSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldruc_datoSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarruc_datoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documentoSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnumero_documentoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_emisionSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarfecha_emisionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_registro_contableSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarfecha_registro_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_serieSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnumero_serieSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_autorizacionSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnumero_autorizacionSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarbienes_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldservicion_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarservicion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activartotal_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldbienes_sin_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarbienes_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldservicios_sin_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarservicios_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtotal_sin_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activartotal_sin_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_tipo_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarmonto_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldmonto_iceSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarmonto_iceSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenerSriCompras.setEnabled(this.sricomprasConstantesFunciones.activartransfe_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_ivaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_tipo_retencion_ivaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldtransfe_iva_retenidoSriCompras.setEnabled(this.sricomprasConstantesFunciones.activartransfe_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenerSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarpresta_iva_retenerSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jComboBoxid_tipo_retencion_iva_prestaSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarid_tipo_retencion_iva_prestaSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldpresta_iva_retenidoSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarpresta_iva_retenidoSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jDateChooserfecha_caducidadSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarfecha_caducidadSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldcodigo_asiento_contableSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarcodigo_asiento_contableSriCompras);
		this.jInternalFrameDetalleFormSriCompras.jTextFieldnumero_documento_contableSriCompras.setEnabled(this.sricomprasConstantesFunciones.activarnumero_documento_contableSriCompras);
		}
	}
	
		
}