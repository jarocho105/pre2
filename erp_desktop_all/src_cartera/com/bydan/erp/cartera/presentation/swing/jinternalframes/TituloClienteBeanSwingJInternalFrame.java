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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TituloClienteConstantesFunciones;
import com.bydan.erp.cartera.util.TituloClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TituloClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TituloClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TituloClienteBeanSwingJInternalFrame extends TituloClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TituloClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TituloCliente> tituloclienteValidator = new ClassValidator<TituloCliente>(TituloCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TituloCliente titulocliente;	
	public TituloCliente tituloclienteAux;
	public TituloCliente tituloclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TituloCliente tituloclienteTotales;
	public Long idTituloClienteActual;
	public Long iIdNuevoTituloCliente=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
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
	
	public Boolean isPermisoTodoTituloCliente;
	public Boolean isPermisoNuevoTituloCliente;
	public Boolean isPermisoActualizarTituloCliente;
	public Boolean isPermisoActualizarOriginalTituloCliente;
	public Boolean isPermisoEliminarTituloCliente;
	public Boolean isPermisoGuardarCambiosTituloCliente;
	public Boolean isPermisoConsultaTituloCliente;
	public Boolean isPermisoBusquedaTituloCliente;
	public Boolean isPermisoReporteTituloCliente;
	public Boolean isPermisoPaginacionMedioTituloCliente;
	public Boolean isPermisoPaginacionAltoTituloCliente;
	public Boolean isPermisoPaginacionTodoTituloCliente;
	public Boolean isPermisoCopiarTituloCliente;
	public Boolean isPermisoVerFormTituloCliente;
	public Boolean isPermisoDuplicarTituloCliente;
	public Boolean isPermisoOrdenTituloCliente;
	
	
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
	
	public TituloClienteParameterReturnGeneral tituloclienteReturnGeneral;
	public TituloClienteParameterReturnGeneral tituloclienteParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTituloCliente=false;
	public Boolean esParaAccionDesdeFormularioTituloCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TituloClienteSessionBeanAdditional tituloclienteSessionBeanAdditional=null;
	
	public TituloClienteSessionBeanAdditional getTituloClienteSessionBeanAdditional() {
		return this.tituloclienteSessionBeanAdditional;
	}
	
	public void setTituloClienteSessionBeanAdditional(TituloClienteSessionBeanAdditional tituloclienteSessionBeanAdditional) {
		try {
			this.tituloclienteSessionBeanAdditional=tituloclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TituloClienteBeanSwingJInternalFrameAdditional tituloclienteBeanSwingJInternalFrameAdditional=null;
	//public class TituloClienteBeanSwingJInternalFrame
	
	public TituloClienteBeanSwingJInternalFrameAdditional getTituloClienteBeanSwingJInternalFrameAdditional() {
		return this.tituloclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTituloClienteBeanSwingJInternalFrameAdditional(TituloClienteBeanSwingJInternalFrameAdditional tituloclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.tituloclienteBeanSwingJInternalFrameAdditional=tituloclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TituloClienteLogic tituloclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TituloCliente tituloclienteBean;
	public TituloClienteConstantesFunciones tituloclienteConstantesFunciones;
	//public TituloClienteParameterReturnGeneral tituloclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TituloCliente> tituloclientes;	
	//public List<TituloCliente> tituloclientesEliminados;
	//public List<TituloCliente> tituloclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTituloCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTituloCliente=true;
	public Boolean isVisibilidadCeldaCopiarTituloCliente=true;
	public Boolean isVisibilidadCeldaVerFormTituloCliente=true;
	public Boolean isVisibilidadCeldaOrdenTituloCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
	public Boolean isVisibilidadCeldaModificarTituloCliente=false;
	public Boolean isVisibilidadCeldaActualizarTituloCliente=false;
	public Boolean isVisibilidadCeldaEliminarTituloCliente=false;
	public Boolean isVisibilidadCeldaCancelarTituloCliente=false;
	public Boolean isVisibilidadCeldaGuardarTituloCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTituloCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSiglas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTituloCliente() {
		return this.iIdNuevoTituloCliente;
	}

	public void setiIdNuevoTituloCliente(Long iIdNuevoTituloCliente) {
		this.iIdNuevoTituloCliente = iIdNuevoTituloCliente;
	}
	
	public Long getidTituloClienteActual() {
		return this.idTituloClienteActual;
	}

	public void setidTituloClienteActual(Long idTituloClienteActual) {
		this.idTituloClienteActual = idTituloClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TituloCliente gettitulocliente() {
		return this.titulocliente;
	}

	public void settitulocliente(TituloCliente titulocliente) {
		this.titulocliente = titulocliente;
	}
	
	public TituloCliente gettituloclienteAux() {
		return this.tituloclienteAux;
	}

	public void settituloclienteAux(TituloCliente tituloclienteAux) {
		this.tituloclienteAux = tituloclienteAux;
	}				
	
	public TituloCliente gettituloclienteAnterior() {
		return this.tituloclienteAnterior;
	}

	public void settituloclienteAnterior(TituloCliente tituloclienteAnterior) {
		this.tituloclienteAnterior = tituloclienteAnterior;
	}	
	
	public TituloCliente gettituloclienteTotales() {
		return this.tituloclienteTotales;
	}

	public void settituloclienteTotales(TituloCliente tituloclienteTotales) {
		this.tituloclienteTotales = tituloclienteTotales;
	}	
	
	public TituloCliente gettituloclienteBean() {
		return this.tituloclienteBean;
	}

	public void settituloclienteBean(TituloCliente tituloclienteBean) {
		this.tituloclienteBean = tituloclienteBean;
	}	
	
	public TituloClienteParameterReturnGeneral gettituloclienteReturnGeneral() {
		return this.tituloclienteReturnGeneral;
	}

	public void settituloclienteReturnGeneral(TituloClienteParameterReturnGeneral tituloclienteReturnGeneral) {
		this.tituloclienteReturnGeneral = tituloclienteReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String siglasBusquedaPorSiglas="";

	public String getsiglasBusquedaPorSiglas() {
		return this.siglasBusquedaPorSiglas;
	}

	public void setsiglasBusquedaPorSiglas(String siglasBusquedaPorSiglas) {
		this.siglasBusquedaPorSiglas = siglasBusquedaPorSiglas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TituloClienteLogic getTituloClienteLogic()	{		
		return tituloclienteLogic;
	}

	public void setTituloClienteLogic(TituloClienteLogic tituloclienteLogic) {
		this.tituloclienteLogic = tituloclienteLogic;
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
	
	public Boolean getIsEsNuevoTituloCliente() {
		return isEsNuevoTituloCliente;
	}

	public void setIsEsNuevoTituloCliente(Boolean isEsNuevoTituloCliente) {
		this.isEsNuevoTituloCliente = isEsNuevoTituloCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTituloCliente() {
		return esParaAccionDesdeFormularioTituloCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTituloCliente(Boolean esParaAccionDesdeFormularioTituloCliente) {
		this.esParaAccionDesdeFormularioTituloCliente = esParaAccionDesdeFormularioTituloCliente;
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

			if(this.tituloclienteSessionBean==null) {
				this.tituloclienteSessionBean=new TituloClienteSessionBean();
			}

			if(!this.tituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tituloclienteSessionBean.getlidEmpresaActual());
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

					if(this.titulocliente!=null) {
						this.titulocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTituloCliente!=null) {
						this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTituloCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTituloCliente!=null) {
						if(this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTituloClienteGenerico)throws Exception
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
				jComboBoxid_empresaTituloClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTituloClienteGenerico!=null && jComboBoxid_empresaTituloClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTituloClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TituloCliente titulocliente,JComboBox jComboBoxid_empresaTituloClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTituloClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTituloClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				titulocliente.setid_empresa(empresaAux.getId());
				titulocliente.setempresa_descripcion(TituloClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				titulocliente.setEmpresa(empresaAux);			}
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

					if(!TituloClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTituloCliente!=null) { 
							this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTituloCliente!=null) { 
					}

					if(!TituloClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTituloCliente!=null) {
							this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTituloCliente!=null) {
							this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTituloCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TituloClienteConstantesFunciones.refrescarForeignKeysDescripcionesTituloCliente(this.tituloclienteLogic.getTituloClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TituloClienteConstantesFunciones.refrescarForeignKeysDescripcionesTituloCliente(this.tituloclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tituloclienteLogic.setTituloClientes(this.tituloclientes);
			tituloclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TituloClienteParameterReturnGeneral getTituloClienteParameterGeneral() {
		return this.tituloclienteParameterGeneral;
	}
	
	public void setTituloClienteParameterGeneral(TituloClienteParameterReturnGeneral tituloclienteParameterGeneral) {
		this.tituloclienteParameterGeneral = tituloclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTituloCliente() {
		return isPermisoTodoTituloCliente;
	}

	public void setIsPermisoTodoTituloCliente(Boolean isPermisoTodoTituloCliente) {
		this.isPermisoTodoTituloCliente = isPermisoTodoTituloCliente;
	}

	public Boolean getIsPermisoNuevoTituloCliente() {
		return isPermisoNuevoTituloCliente;
	}

	public void setIsPermisoNuevoTituloCliente(Boolean isPermisoNuevoTituloCliente) {
		this.isPermisoNuevoTituloCliente = isPermisoNuevoTituloCliente;
	}

	public Boolean getIsPermisoActualizarTituloCliente() {
		return isPermisoActualizarTituloCliente;
	}

	public void setIsPermisoActualizarTituloCliente(Boolean isPermisoActualizarTituloCliente) {
		this.isPermisoActualizarTituloCliente = isPermisoActualizarTituloCliente;
	}

	public Boolean getIsPermisoEliminarTituloCliente() {
		return isPermisoEliminarTituloCliente;
	}

	public void setIsPermisoEliminarTituloCliente(Boolean isPermisoEliminarTituloCliente) {
		this.isPermisoEliminarTituloCliente = isPermisoEliminarTituloCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTituloCliente() {
		return isPermisoGuardarCambiosTituloCliente;
	}

	public void setIsPermisoGuardarCambiosTituloCliente(Boolean isPermisoGuardarCambiosTituloCliente) {
		this.isPermisoGuardarCambiosTituloCliente = isPermisoGuardarCambiosTituloCliente;
	}
	
	public Boolean getIsPermisoConsultaTituloCliente() {
		return isPermisoConsultaTituloCliente;
	}

	public void setIsPermisoConsultaTituloCliente(Boolean isPermisoConsultaTituloCliente) {
		this.isPermisoConsultaTituloCliente = isPermisoConsultaTituloCliente;
	}

	public Boolean getIsPermisoBusquedaTituloCliente() {
		return isPermisoBusquedaTituloCliente;
	}

	public void setIsPermisoBusquedaTituloCliente(Boolean isPermisoBusquedaTituloCliente) {
		this.isPermisoBusquedaTituloCliente = isPermisoBusquedaTituloCliente;
	}

	public Boolean getIsPermisoReporteTituloCliente() {
		return isPermisoReporteTituloCliente;
	}

	public void setIsPermisoReporteTituloCliente(Boolean isPermisoReporteTituloCliente) {
		this.isPermisoReporteTituloCliente = isPermisoReporteTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTituloCliente() {
		return isPermisoPaginacionMedioTituloCliente;
	}

	public void setIsPermisoPaginacionMedioTituloCliente(Boolean isPermisoPaginacionMedioTituloCliente) {
		this.isPermisoPaginacionMedioTituloCliente = isPermisoPaginacionMedioTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTituloCliente() {
		return isPermisoPaginacionTodoTituloCliente;
	}

	public void setIsPermisoPaginacionTodoTituloCliente(Boolean isPermisoPaginacionTodoTituloCliente) {
		this.isPermisoPaginacionTodoTituloCliente = isPermisoPaginacionTodoTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTituloCliente() {
		return isPermisoPaginacionAltoTituloCliente;
	}

	public void setIsPermisoPaginacionAltoTituloCliente(Boolean isPermisoPaginacionAltoTituloCliente) {
		this.isPermisoPaginacionAltoTituloCliente = isPermisoPaginacionAltoTituloCliente;
	}
	
	public Boolean getIsPermisoCopiarTituloCliente() {
		return isPermisoCopiarTituloCliente;
	}

	public void setIsPermisoCopiarTituloCliente(Boolean isPermisoCopiarTituloCliente) {
		this.isPermisoCopiarTituloCliente = isPermisoCopiarTituloCliente;
	}
	
	public Boolean getIsPermisoVerFormTituloCliente() {
		return isPermisoVerFormTituloCliente;
	}

	public void setIsPermisoVerFormTituloCliente(Boolean isPermisoVerFormTituloCliente) {
		this.isPermisoVerFormTituloCliente = isPermisoVerFormTituloCliente;
	}
	
	public Boolean getIsPermisoDuplicarTituloCliente() {
		return isPermisoDuplicarTituloCliente;
	}

	public void setIsPermisoDuplicarTituloCliente(Boolean isPermisoDuplicarTituloCliente) {
		this.isPermisoDuplicarTituloCliente = isPermisoDuplicarTituloCliente;
	}
	
	public Boolean getIsPermisoOrdenTituloCliente() {
		return isPermisoOrdenTituloCliente;
	}

	public void setIsPermisoOrdenTituloCliente(Boolean isPermisoOrdenTituloCliente) {
		this.isPermisoOrdenTituloCliente = isPermisoOrdenTituloCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTituloCliente() {
		return isVisibilidadCeldaNuevoTituloCliente;
	}

	public void setIsVisibilidadCeldaNuevoTituloCliente(Boolean isVisibilidadCeldaNuevoTituloCliente) {
		this.isVisibilidadCeldaNuevoTituloCliente = isVisibilidadCeldaNuevoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTituloCliente() {
		return isVisibilidadCeldaDuplicarTituloCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTituloCliente(Boolean isVisibilidadCeldaDuplicarTituloCliente) {
		this.isVisibilidadCeldaDuplicarTituloCliente = isVisibilidadCeldaDuplicarTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTituloCliente() {
		return isVisibilidadCeldaCopiarTituloCliente;
	}

	public void setIsVisibilidadCeldaCopiarTituloCliente(Boolean isVisibilidadCeldaCopiarTituloCliente) {
		this.isVisibilidadCeldaCopiarTituloCliente = isVisibilidadCeldaCopiarTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTituloCliente() {
		return isVisibilidadCeldaVerFormTituloCliente;
	}

	public void setIsVisibilidadCeldaVerFormTituloCliente(Boolean isVisibilidadCeldaVerFormTituloCliente) {
		this.isVisibilidadCeldaVerFormTituloCliente = isVisibilidadCeldaVerFormTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTituloCliente() {
		return isVisibilidadCeldaOrdenTituloCliente;
	}

	public void setIsVisibilidadCeldaOrdenTituloCliente(Boolean isVisibilidadCeldaOrdenTituloCliente) {
		this.isVisibilidadCeldaOrdenTituloCliente = isVisibilidadCeldaOrdenTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTituloCliente() {
		return isVisibilidadCeldaNuevoRelacionesTituloCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTituloCliente(Boolean isVisibilidadCeldaNuevoRelacionesTituloCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTituloCliente = isVisibilidadCeldaNuevoRelacionesTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTituloCliente() {
		return isVisibilidadCeldaModificarTituloCliente;
	}

	public void setIsVisibilidadCeldaModificarTituloCliente(Boolean isVisibilidadCeldaModificarTituloCliente) {
		this.isVisibilidadCeldaModificarTituloCliente = isVisibilidadCeldaModificarTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTituloCliente() {
		return isVisibilidadCeldaActualizarTituloCliente;
	}

	public void setIsVisibilidadCeldaActualizarTituloCliente(Boolean isVisibilidadCeldaActualizarTituloCliente) {
		this.isVisibilidadCeldaActualizarTituloCliente = isVisibilidadCeldaActualizarTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTituloCliente() {
		return isVisibilidadCeldaEliminarTituloCliente;
	}

	public void setIsVisibilidadCeldaEliminarTituloCliente(Boolean isVisibilidadCeldaEliminarTituloCliente) {
		this.isVisibilidadCeldaEliminarTituloCliente = isVisibilidadCeldaEliminarTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTituloCliente() {
		return isVisibilidadCeldaCancelarTituloCliente;
	}

	public void setIsVisibilidadCeldaCancelarTituloCliente(Boolean isVisibilidadCeldaCancelarTituloCliente) {
		this.isVisibilidadCeldaCancelarTituloCliente = isVisibilidadCeldaCancelarTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTituloCliente() {
		return isVisibilidadCeldaGuardarTituloCliente;
	}

	public void setIsVisibilidadCeldaGuardarTituloCliente(Boolean isVisibilidadCeldaGuardarTituloCliente) {
		this.isVisibilidadCeldaGuardarTituloCliente = isVisibilidadCeldaGuardarTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTituloCliente() {
		return isVisibilidadCeldaGuardarCambiosTituloCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTituloCliente(Boolean isVisibilidadCeldaGuardarCambiosTituloCliente) {
		this.isVisibilidadCeldaGuardarCambiosTituloCliente = isVisibilidadCeldaGuardarCambiosTituloCliente;
	}
		
	public TituloClienteSessionBean gettituloclienteSessionBean() {
		return this.tituloclienteSessionBean;
	}
	
	public void settituloclienteSessionBean(TituloClienteSessionBean tituloclienteSessionBean) {
		this.tituloclienteSessionBean=tituloclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorSiglas() {
		return this.isVisibilidadBusquedaPorSiglas;
	}

	public void setisVisibilidadBusquedaPorSiglas(Boolean isVisibilidadBusquedaPorSiglas) {
		this.isVisibilidadBusquedaPorSiglas=isVisibilidadBusquedaPorSiglas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTituloCliente(TituloCliente titulocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(titulocliente,null);
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
	
	public void bugActualizarReferenciaActual(TituloCliente titulocliente,TituloCliente tituloclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTituloCliente(titulocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tituloclienteAux.setId(titulocliente.getId());
		tituloclienteAux.setVersionRow(titulocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTituloCliente();
		
			int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tituloclienteValidator.getInvalidValues(this.titulocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tituloclienteLogic.setDatosCliente(datosCliente);
			tituloclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tituloclienteAux=new  TituloCliente();
				
				tituloclienteAux.setIsNew(true);
				tituloclienteAux.setIsChanged(true);
				
				tituloclienteAux.setTituloClienteOriginal(this.titulocliente);
				
				tituloclienteAux.setId(this.titulocliente.getId());	
				tituloclienteAux.setVersionRow(this.titulocliente.getVersionRow());	
				tituloclienteAux.setid_empresa(this.titulocliente.getid_empresa());	
				tituloclienteAux.setcodigo(this.titulocliente.getcodigo());	
				tituloclienteAux.setnombre(this.titulocliente.getnombre());	
				tituloclienteAux.setsiglas(this.titulocliente.getsiglas());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tituloclienteAux,tituloclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.saveTituloClientes();//WithConnection
						//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);
					
					this.refrescarForeignKeysDescripcionesTituloCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tituloclienteLogic.saveTituloClienteRelaciones(tituloclienteAux,this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tituloclienteAux.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tituloclienteAux,tituloclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tituloclienteAux=new  TituloCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tituloclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tituloclienteSessionBean.getEsGuardarRelacionado() && this.titulocliente.getId()>=0)) {
						
					tituloclienteAux.setIsNew(false);
				}
				
				tituloclienteAux.setIsDeleted(false);
			
				tituloclienteAux.setId(this.titulocliente.getId());	
				tituloclienteAux.setVersionRow(this.titulocliente.getVersionRow());	
				tituloclienteAux.setid_empresa(this.titulocliente.getid_empresa());	
				tituloclienteAux.setcodigo(this.titulocliente.getcodigo());	
				tituloclienteAux.setnombre(this.titulocliente.getnombre());	
				tituloclienteAux.setsiglas(this.titulocliente.getsiglas());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tituloclienteAux,tituloclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.saveTituloClientes();//WithConnection
						//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);
					
					this.refrescarForeignKeysDescripcionesTituloCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tituloclienteLogic.saveTituloClienteRelaciones(tituloclienteAux,this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tituloclienteAux.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tituloclienteAux,tituloclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.titulocliente,tituloclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tituloclienteAux=new  TituloCliente();
				
				tituloclienteAux.setIsNew(false);
				tituloclienteAux.setIsChanged(false);
				
				tituloclienteAux.setIsDeleted(true);
				
				tituloclienteAux.setId(this.titulocliente.getId());	
				tituloclienteAux.setVersionRow(this.titulocliente.getVersionRow());	
				tituloclienteAux.setid_empresa(this.titulocliente.getid_empresa());	
				tituloclienteAux.setcodigo(this.titulocliente.getcodigo());	
				tituloclienteAux.setnombre(this.titulocliente.getnombre());	
				tituloclienteAux.setsiglas(this.titulocliente.getsiglas());	
				
				if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tituloclienteAux.getId()>=0) {	
						this.tituloclientesEliminados.add(tituloclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tituloclienteAux,tituloclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.saveTituloClientes();//WithConnection
						//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tituloclienteLogic.saveTituloClienteRelaciones(tituloclienteAux,this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tituloclienteAux.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tituloclienteAux,tituloclienteLogic.getTituloClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tituloclienteAux,tituloclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getTituloClientes().addAll(this.tituloclientesEliminados);
					
					tituloclienteLogic.saveTituloClientes();//WithConnection
					//tituloclienteLogic.getSetVersionRowTituloClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTituloCliente();
				
				this.tituloclientesEliminados= new ArrayList<TituloCliente>();		
			}
			
			if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Comercial Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.titulocliente=tituloclienteAux;
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
      		//this.finishProcessTituloCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TituloCliente tituloclienteLocal) throws Exception {
		
		if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tituloclienteLocal.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
			
			} else {
			
				tituloclienteLocal.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TituloCliente tituloclienteLocal) throws Exception {	
		if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tituloclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTituloClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tituloclienteValidator.getInvalidValues(this.titulocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TituloCliente titulocliente,List<TituloCliente> tituloclientes) throws Exception {
		try	{		
			TituloClienteConstantesFunciones.actualizarLista(titulocliente,tituloclientes,this.tituloclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TituloCliente titulocliente,List<TituloCliente> tituloclientes) throws Exception {
		try	{			
			TituloClienteConstantesFunciones.actualizarSelectedLista(titulocliente,tituloclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TituloCliente> tituloclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tituloclientesLocal=this.tituloclienteLogic.getTituloClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tituloclientesLocal=this.tituloclientes;
			}
			//ARCHITECTURE
		
			for(TituloCliente tituloclienteLocal:tituloclientesLocal) {
				if(this.permiteMantenimiento(tituloclienteLocal) && tituloclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TituloClienteConstantesFunciones.getTituloClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TituloClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelid_empresaTituloCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TituloClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelcodigoTituloCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TituloClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelnombreTituloCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TituloClienteConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelsiglasTituloCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTituloCliente.jLabelid_empresaTituloCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTituloCliente.jLabelcodigoTituloCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTituloCliente.jLabelnombreTituloCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTituloCliente.jLabelsiglasTituloCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.titulocliente==null) {
				this.titulocliente= new TituloCliente();
			}

			if(this.tituloclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTituloCliente
				this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);

				this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.getcliente().setTituloCliente(this.titulocliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTituloCliente--;	
		
		
		this.tituloclienteAux=new TituloCliente();
		
		this.tituloclienteAux.setId(this.iIdNuevoTituloCliente);
		this.tituloclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tituloclienteLogic.getTituloClientes().add(this.tituloclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tituloclientes.add(this.tituloclienteAux);
		}
		//ARCHITECTURE
		
		this.titulocliente=this.tituloclienteAux;
		
		if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTituloCliente(this.titulocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTituloCliente(this.titulocliente);
		}
				
		//this.setDefaultControlesTituloCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTituloCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTituloCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTituloCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTituloCliente(this.tituloclienteBean,this.titulocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TituloClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
			classes=TituloClienteConstantesFunciones.getClassesRelationshipsOfTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tituloclienteReturnGeneral=tituloclienteLogic.procesarEventosTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tituloclienteLogic.getTituloClientes(),this.titulocliente,this.tituloclienteParameterGeneral,this.isEsNuevoTituloCliente,classes);//this.tituloclienteLogic.getTituloCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTituloCliente(this.tituloclienteReturnGeneral,this.tituloclienteBean,false);
		
		if(this.tituloclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente());
		}
		
		if(this.tituloclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente(),classes);//this.tituloclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTituloCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTituloCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TituloClienteBeanSwingJInternalFrameAdditional.RecargarFormTituloCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTituloCliente(false);
						
			if(tituloclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTituloCliente();
			}
			
			this.actualizarVisualTableDatosTituloCliente();
			
			this.jTableDatosTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTituloCliente(), this.getIndiceNuevoTituloCliente());
			
			this.seleccionarFilaTablaTituloClienteActual();
						
			this.actualizarEstadoCeldasBotonesTituloCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTituloCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setEnabled(isHabilitar && this.tituloclienteConstantesFunciones.activarcodigoTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setEnabled(isHabilitar && this.tituloclienteConstantesFunciones.activarnombreTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setEnabled(isHabilitar && this.tituloclienteConstantesFunciones.activarsiglasTituloCliente);	
		//
		this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setEnabled(isHabilitar && this.tituloclienteConstantesFunciones.activarid_empresaTituloCliente);
	};
	
	public void setDefaultControlesTituloCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTituloCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tituloclienteSessionBean.setConGuardarRelaciones(true);			
			this.tituloclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tituloclienteSessionBean.setConGuardarRelaciones(false);			
			this.tituloclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTituloCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
				if(tituloclienteAux.getId().equals(this.iIdNuevoTituloCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TituloCliente tituloclienteAux:this.tituloclientes) {
				if(tituloclienteAux.getId().equals(this.iIdNuevoTituloCliente)) {
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
	
	public int getIndiceActualTituloCliente(TituloCliente titulocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
				if(tituloclienteAux.getId().equals(titulocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TituloCliente tituloclienteAux:this.tituloclientes) {
				if(tituloclienteAux.getId().equals(titulocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTituloCliente(TituloCliente tituloclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
				if(tituloclienteAux.getTituloClienteOriginal().getId().equals(tituloclienteOriginal.getId())) {
					existe=true;
					tituloclienteOriginal.setId(tituloclienteAux.getId());
					tituloclienteOriginal.setVersionRow(tituloclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TituloCliente tituloclienteAux:this.tituloclientes) {
				if(tituloclienteAux.getTituloClienteOriginal().getId().equals(tituloclienteOriginal.getId())) {
					existe=true;
					tituloclienteOriginal.setId(tituloclienteAux.getId());
					tituloclienteOriginal.setVersionRow(tituloclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTituloCliente(Boolean esParaCancelar) throws Exception {
		tituloclientesAux=new ArrayList<TituloCliente>();
		tituloclienteAux=new TituloCliente();
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
					if(tituloclienteAux.getId()<0) {
						tituloclientesAux.add(tituloclienteAux);
					}		
				}
				this.iIdNuevoTituloCliente=0L;
				this.tituloclienteLogic.getTituloClientes().removeAll(tituloclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TituloCliente tituloclienteAux:this.tituloclientes) {
					if(tituloclienteAux.getId()<0) {
						tituloclientesAux.add(tituloclienteAux);
					}		
				}
				this.iIdNuevoTituloCliente=0L;
				this.tituloclientes.removeAll(tituloclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTituloCliente 
					&& this.tituloclienteLogic.getTituloClientes().size()>0
					) {
					tituloclienteAux=this.tituloclienteLogic.getTituloClientes().get(this.tituloclienteLogic.getTituloClientes().size() - 1);
				
					if(tituloclienteAux.getId()<0) {
						this.tituloclienteLogic.getTituloClientes().remove(tituloclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTituloCliente && this.tituloclientes.size()>0) {
					tituloclienteAux=this.tituloclientes.get(this.tituloclientes.size() - 1);
				
					if(tituloclienteAux.getId()<0) {
						this.tituloclientes.remove(tituloclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTituloCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(titulocliente.getId()<0) {
				this.tituloclienteLogic.getTituloClientes().remove(this.titulocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(titulocliente.getId()<0) {
				this.tituloclientes.remove(this.titulocliente);
			}
		}			
	}
	
	public void setEstadosInicialesTituloCliente(List<TituloCliente> tituloclientesAux) throws Exception {
		TituloClienteConstantesFunciones.setEstadosInicialesTituloCliente(tituloclientesAux);
	}
	
	public void setEstadosInicialesTituloCliente(TituloCliente tituloclienteAux) throws Exception {
		TituloClienteConstantesFunciones.setEstadosInicialesTituloCliente(tituloclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTituloClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTituloClienteActual()) {
				if(!this.isEsNuevoTituloCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTituloCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTituloClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Comercial Cliente ?", "MANTENIMIENTO DE Tipo Comercial Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TituloCliente titulocliente) throws Exception {
		TituloClienteConstantesFunciones.seleccionarAsignar(this.titulocliente,titulocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTituloCliente=this.isPermisoActualizarOriginalTituloCliente;
			
			
			this.seleccionarAsignar(titulocliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TituloClienteConstantesFunciones.quitarEspaciosTituloCliente(this.titulocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tituloclienteSessionBean.setsFuncionBusquedaRapida(this.tituloclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTituloCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTituloCliente(esParaCancelar);				
				this.cancelarNuevoTituloCliente(esParaCancelar);								
			}
			
			this.titulocliente=new TituloCliente();
			
			this.inicializarTituloCliente();
			
			this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTituloCliente() throws Exception {
		try {
			TituloClienteConstantesFunciones.inicializarTituloCliente(this.titulocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tituloclienteLogic.getTituloClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTituloClientes(String sAccionBusqueda,List<TituloCliente> tituloclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TituloCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TituloClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TituloClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TituloCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Comercial Clientes");		
		parameters.put("busquedapor", TituloClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TituloClienteLogic tituloclienteLogicAuxiliar=new TituloClienteLogic();
					tituloclienteLogicAuxiliar.setDatosCliente(tituloclienteLogic.getDatosCliente());				
					tituloclienteLogicAuxiliar.setTituloClientes(tituloclientesParaReportes);
					
					tituloclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyTituloClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tituloclientesParaReportes=tituloclienteLogicAuxiliar.getTituloClientes();
					
					//tituloclienteLogic.getNewConnexionToDeep();
					
					//for (TituloCliente titulocliente:tituloclientesParaReportes) {
					//	tituloclienteLogic.deepLoad(titulocliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tituloclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tituloclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTituloCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTituloCliente=new JRBeanArrayDataSource(TituloClienteJInternalFrame.TraerTituloClienteBeans(tituloclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTituloCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TituloClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TituloClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TituloClienteBean.TraerTituloClienteBeans(tituloclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTituloClienteActionPerformed(null);
					//this.generarExcelReporteTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tituloclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TituloCliente> tituloclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TituloClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTituloCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TituloCliente titulocliente : tituloclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TituloClienteConstantesFunciones.generarExcelReporteDataTituloCliente("NORMAL",row,workbook,titulocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTituloCliente(String sTipo,Row row,Workbook workbook) {
		
		TituloClienteConstantesFunciones.generarExcelReporteHeaderTituloCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TituloCliente> tituloclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TituloClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TituloCliente titulocliente : tituloclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TituloClienteConstantesFunciones.getTituloClienteDescripcion(titulocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TituloClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TituloClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(titulocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TituloClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TituloClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(titulocliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TituloClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TituloClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(titulocliente.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TituloClienteConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TituloClienteConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(titulocliente.getsiglas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TituloCliente> tituloclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TituloCliente> tituloclientesRespaldo=null;
		
		classes=TituloClienteConstantesFunciones.getClassesRelationshipsOfTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tituloclienteLogic.setDatosCliente(this.datosCliente);
		this.tituloclienteLogic.setDatosDeep(this.datosDeep);
		this.tituloclienteLogic.setIsConDeep(true);
		
		tituloclientesRespaldo=this.tituloclienteLogic.getTituloClientes();
		
		this.tituloclienteLogic.setTituloClientes(tituloclientesParaReportes);	
		this.tituloclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tituloclientesParaReportes=this.tituloclienteLogic.getTituloClientes();
		this.tituloclienteLogic.setTituloClientes(tituloclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TituloClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTituloCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TituloCliente titulocliente : tituloclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTituloCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TituloClienteConstantesFunciones.generarExcelReporteDataTituloCliente("NORMAL",row,workbook,titulocliente,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(titulocliente.getClientes()!=null && titulocliente.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(titulocliente.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : titulocliente.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TituloClienteConstantesFunciones.getTituloClienteDescripcion(titulocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTituloCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTituloCliente() throws Exception {		
		this.startProcessTituloCliente(true);
	}
	
	public void startProcessTituloCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTituloCliente ,this.jPanelParametrosReportesTituloCliente, this.jScrollPanelDatosTituloCliente,this.jPanelPaginacionTituloCliente, this.jScrollPanelDatosEdicionTituloCliente, this.jPanelAccionesTituloCliente,this.jPanelAccionesFormularioTituloCliente,this.jmenuBarTituloCliente,this.jmenuBarDetalleTituloCliente,this.jTtoolBarTituloCliente,this.jTtoolBarDetalleTituloCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTituloCliente=this.jTabbedPaneBusquedasTituloCliente; 
		
		final JPanel jPanelParametrosReportesTituloCliente=this.jPanelParametrosReportesTituloCliente;
		//final JScrollPane jScrollPanelDatosTituloCliente=this.jScrollPanelDatosTituloCliente;
		final JTable jTableDatosTituloCliente=this.jTableDatosTituloCliente;		
		final JPanel jPanelPaginacionTituloCliente=this.jPanelPaginacionTituloCliente;
		//final JScrollPane jScrollPanelDatosEdicionTituloCliente=this.jScrollPanelDatosEdicionTituloCliente;
		final JPanel jPanelAccionesTituloCliente=this.jPanelAccionesTituloCliente;
		
		JPanel jPanelCamposAuxiliarTituloCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTituloCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			jPanelCamposAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jPanelCamposTituloCliente;
			jPanelAccionesFormularioAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jPanelAccionesFormularioTituloCliente;
		}
		
		final JPanel jPanelCamposTituloCliente=jPanelCamposAuxiliarTituloCliente;
		final JPanel jPanelAccionesFormularioTituloCliente=jPanelAccionesFormularioAuxiliarTituloCliente;
		
		
		final JMenuBar jmenuBarTituloCliente=this.jmenuBarTituloCliente;
		final JToolBar jTtoolBarTituloCliente=this.jTtoolBarTituloCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTituloCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTituloCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			jmenuBarDetalleAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jmenuBarDetalleTituloCliente;
			jTtoolBarDetalleAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jTtoolBarDetalleTituloCliente;
		}
		
		final JMenuBar jmenuBarDetalleTituloCliente=jmenuBarDetalleAuxiliarTituloCliente;
		final JToolBar jTtoolBarDetalleTituloCliente=jTtoolBarDetalleAuxiliarTituloCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTituloCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTituloCliente;
			processRunnable.jTableDatos=jTableDatosTituloCliente;
			processRunnable.jPanelCampos=jPanelCamposTituloCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTituloCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTituloCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTituloCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTituloCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTituloCliente;
			processRunnable.jTtoolBar=jTtoolBarTituloCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTituloCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTituloCliente ,jPanelParametrosReportesTituloCliente,jTableDatosTituloCliente, /*jScrollPanelDatosTituloCliente,*/jPanelCamposTituloCliente,jPanelPaginacionTituloCliente, /*jScrollPanelDatosEdicionTituloCliente,*/ jPanelAccionesTituloCliente,jPanelAccionesFormularioTituloCliente,jmenuBarTituloCliente,jmenuBarDetalleTituloCliente,jTtoolBarTituloCliente,jTtoolBarDetalleTituloCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTituloCliente ,jPanelParametrosReportesTituloCliente, jScrollPanelDatosTituloCliente,jPanelPaginacionTituloCliente, jScrollPanelDatosEdicionTituloCliente, jPanelAccionesTituloCliente,jPanelAccionesFormularioTituloCliente,jmenuBarTituloCliente,jmenuBarDetalleTituloCliente,jTtoolBarTituloCliente,jTtoolBarDetalleTituloCliente);
						
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
	
	public void finishProcessTituloCliente() {// throws Exception 
		this.finishProcessTituloCliente(true);
	}
	
	public void finishProcessTituloCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTituloCliente ,this.jPanelParametrosReportesTituloCliente, this.jScrollPanelDatosTituloCliente,this.jPanelPaginacionTituloCliente, this.jScrollPanelDatosEdicionTituloCliente, this.jPanelAccionesTituloCliente,this.jPanelAccionesFormularioTituloCliente,this.jmenuBarTituloCliente,this.jmenuBarDetalleTituloCliente,this.jTtoolBarTituloCliente,this.jTtoolBarDetalleTituloCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTituloCliente=this.jTabbedPaneBusquedasTituloCliente; 
		
		final JPanel jPanelParametrosReportesTituloCliente=this.jPanelParametrosReportesTituloCliente;
		//final JScrollPane jScrollPanelDatosTituloCliente=this.jScrollPanelDatosTituloCliente;
		final JTable jTableDatosTituloCliente=this.jTableDatosTituloCliente;		
		final JPanel jPanelPaginacionTituloCliente=this.jPanelPaginacionTituloCliente;
		//final JScrollPane jScrollPanelDatosEdicionTituloCliente=this.jScrollPanelDatosEdicionTituloCliente;
		final JPanel jPanelAccionesTituloCliente=this.jPanelAccionesTituloCliente;
		
		JPanel jPanelCamposAuxiliarTituloCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTituloCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			jPanelCamposAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jPanelCamposTituloCliente;
			jPanelAccionesFormularioAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jPanelAccionesFormularioTituloCliente;
		}
		
		final JPanel jPanelCamposTituloCliente=jPanelCamposAuxiliarTituloCliente;
		final JPanel jPanelAccionesFormularioTituloCliente=jPanelAccionesFormularioAuxiliarTituloCliente;
		
		
		final JMenuBar jmenuBarTituloCliente=this.jmenuBarTituloCliente;		
		final JToolBar jTtoolBarTituloCliente=this.jTtoolBarTituloCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTituloCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTituloCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			jmenuBarDetalleAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jmenuBarDetalleTituloCliente;
			jTtoolBarDetalleAuxiliarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jTtoolBarDetalleTituloCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTituloCliente=jmenuBarDetalleAuxiliarTituloCliente;
		final JToolBar jTtoolBarDetalleTituloCliente=jTtoolBarDetalleAuxiliarTituloCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTituloCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTituloCliente;
			processRunnable.jTableDatos=jTableDatosTituloCliente;
			processRunnable.jPanelCampos=jPanelCamposTituloCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTituloCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTituloCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTituloCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTituloCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTituloCliente;
			processRunnable.jTtoolBar=jTtoolBarTituloCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTituloCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTituloCliente ,jPanelParametrosReportesTituloCliente, jTableDatosTituloCliente,/*jScrollPanelDatosTituloCliente,*/jPanelCamposTituloCliente,jPanelPaginacionTituloCliente, /*jScrollPanelDatosEdicionTituloCliente,*/ jPanelAccionesTituloCliente,jPanelAccionesFormularioTituloCliente,jmenuBarTituloCliente,jmenuBarDetalleTituloCliente,jTtoolBarTituloCliente,jTtoolBarDetalleTituloCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTituloCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTituloCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTituloCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTituloCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTituloCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTituloCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tituloclienteConstantesFunciones.getsFinalQueryTituloCliente();
		String  finalQueryPaginacionTodos=this.tituloclienteConstantesFunciones.getsFinalQueryTituloCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TituloClienteConstantesFunciones.getArrayColumnasGlobalesNoTituloCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TituloClienteConstantesFunciones.getArrayColumnasGlobalesTituloCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TituloClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tituloclientesEliminados= new ArrayList<TituloCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTituloCliente();
		
				///*TituloClienteSessionBean*/this.tituloclienteSessionBean=new TituloClienteSessionBean();
			
			if(this.tituloclienteSessionBean==null) {
				this.tituloclienteSessionBean=new TituloClienteSessionBean();
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
					this.iNumeroPaginacion=TituloClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TituloClienteConstantesFunciones.getClassesForeignKeysOfTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/titulocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tituloclientesAux= new ArrayList<TituloCliente>();
			
				
			tituloclienteLogic.setDatosCliente(this.datosCliente);
			tituloclienteLogic.setDatosDeep(this.datosDeep);
			tituloclienteLogic.setIsConDeep(true);
			
			
			tituloclienteLogic.getTituloClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tituloclienteLogic.getTodosTituloClientes(finalQueryGlobal,pagination);
					
					//tituloclienteLogic.getTodosTituloClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tituloclienteLogic.getTituloClientes()==null|| tituloclienteLogic.getTituloClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tituloclientesAux= new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclienteLogic.getTituloClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientesAux= new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tituloclienteLogic.getTodosTituloClientes(finalQueryGlobal+"",this.pagination);												
							
							//tituloclienteLogic.getTodosTituloClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTituloClientes("Todos",tituloclienteLogic.getTituloClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());					
							tituloclienteLogic.getTituloClientes().addAll(tituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientes=new ArrayList<TituloCliente>();
							tituloclientes.addAll(tituloclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTituloCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTituloCliente=this.idActual;
				
				} else if(this.idTituloClienteActual!=null && this.idTituloClienteActual!=0L) {
					idTituloCliente=idTituloClienteActual;
				}
				
					
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndicePorId(idTituloCliente);
				
				this.tituloclientes=new ArrayList<TituloCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tituloclienteLogic.getEntity(idTituloCliente);
					
					//tituloclienteLogic.getEntityWithConnection(idTituloCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());
					tituloclienteLogic.getTituloClientes().add(tituloclienteLogic.getTituloCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tituloclientes=new ArrayList<TituloCliente>();
					this.tituloclientes.add(titulocliente);
				}
				
				if(tituloclienteLogic.getTituloCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tituloclienteLogic.getTituloClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tituloclienteLogic.getTituloClientes()==null||tituloclienteLogic.getTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tituloclientes==null|| tituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclientesAux=new ArrayList<TituloCliente>();
						tituloclientesAux.addAll(tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientesAux=new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tituloclienteLogic.getTituloClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTituloClientes("BusquedaPorCodigo",tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTituloClientes("BusquedaPorCodigo",tituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());
						tituloclienteLogic.getTituloClientes().addAll(tituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientes=new ArrayList<TituloCliente>();
							tituloclientes.addAll(tituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tituloclienteLogic.getTituloClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tituloclienteLogic.getTituloClientes()==null||tituloclienteLogic.getTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tituloclientes==null|| tituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclientesAux=new ArrayList<TituloCliente>();
						tituloclientesAux.addAll(tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientesAux=new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tituloclienteLogic.getTituloClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTituloClientes("BusquedaPorNombre",tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTituloClientes("BusquedaPorNombre",tituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());
						tituloclienteLogic.getTituloClientes().addAll(tituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientes=new ArrayList<TituloCliente>();
							tituloclientes.addAll(tituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSiglas")) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tituloclienteLogic.getTituloClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tituloclienteLogic.getTituloClientes()==null||tituloclienteLogic.getTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tituloclientes==null|| tituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclientesAux=new ArrayList<TituloCliente>();
						tituloclientesAux.addAll(tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientesAux=new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tituloclienteLogic.getTituloClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTituloClientes("BusquedaPorSiglas",tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTituloClientes("BusquedaPorSiglas",tituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());
						tituloclienteLogic.getTituloClientes().addAll(tituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientes=new ArrayList<TituloCliente>();
							tituloclientes.addAll(tituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tituloclienteLogic.getTituloClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tituloclienteLogic.getTituloClientes()==null||tituloclienteLogic.getTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tituloclientes==null|| tituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclientesAux=new ArrayList<TituloCliente>();
						tituloclientesAux.addAll(tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientesAux=new ArrayList<TituloCliente>();
							tituloclientesAux.addAll(tituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tituloclienteLogic.getTituloClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TituloClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTituloClientes("FK_IdEmpresa",tituloclienteLogic.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTituloClientes("FK_IdEmpresa",tituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteLogic.setTituloClientes(new ArrayList<TituloCliente>());
						tituloclienteLogic.getTituloClientes().addAll(tituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclientes=new ArrayList<TituloCliente>();
							tituloclientes.addAll(tituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTituloCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTituloCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tituloclienteLogic.getTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tituloclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tituloclienteLogic.getTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tituloclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TituloCliente titulocliente) {
		Boolean permite=true;
		
		if(this.titulocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TituloClienteConstantesFunciones.getOrderByListaTituloCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TituloClienteConstantesFunciones.getOrderByListaTituloCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TituloCliente titulocliente:tituloclienteLogic.getTituloClientes()) {
				if(titulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tituloclienteTotales=titulocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TituloCliente titulocliente:this.tituloclientes) {
				if(titulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tituloclienteTotales=titulocliente;
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
			this.tituloclienteAux=new TituloCliente();
			this.tituloclienteAux.setsType(Constantes2.S_TOTALES);
			this.tituloclienteAux.setIsNew(false);
			this.tituloclienteAux.setIsChanged(false);
			this.tituloclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TituloClienteConstantesFunciones.TotalizarValoresFilaTituloCliente(this.tituloclienteLogic.getTituloClientes(),this.tituloclienteAux);
				
				this.tituloclienteLogic.getTituloClientes().add(this.tituloclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TituloClienteConstantesFunciones.TotalizarValoresFilaTituloCliente(this.tituloclientes,this.tituloclienteAux);
				
				this.tituloclientes.add(this.tituloclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tituloclienteTotales=new TituloCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tituloclienteLogic.getTituloClientes().remove(tituloclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tituloclientes.remove(tituloclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tituloclienteTotales=new TituloCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TituloCliente titulocliente:tituloclienteLogic.getTituloClientes()) {
				if(titulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tituloclienteTotales=titulocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TituloClienteConstantesFunciones.TotalizarValoresFilaTituloCliente(this.tituloclienteLogic.getTituloClientes(),tituloclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TituloCliente titulocliente:this.tituloclientes) {
				if(titulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tituloclienteTotales=titulocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TituloClienteConstantesFunciones.TotalizarValoresFilaTituloCliente(this.tituloclientes,tituloclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTituloClientesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTituloClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTituloClientesBusquedaPorSiglas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSiglas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTituloClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTituloClientePorIdEmpresaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorIdEmpresaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTituloClientesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getTituloClientesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTituloClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getTituloClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTituloClientesBusquedaPorSiglas(String sFinalQuery,String siglas)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getTituloClientesBusquedaPorSiglas(sFinalQuery,this.pagination,siglas);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTituloClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getTituloClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTituloClientePorIdEmpresaPorCodigo(Long id_empresa,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLogic.getTituloClientePorIdEmpresaPorCodigo(id_empresa,codigo);
				
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
	
	public void inicializarPermisosTituloCliente() {
		this.isPermisoTodoTituloCliente=false;
		this.isPermisoNuevoTituloCliente=false;
		this.isPermisoActualizarTituloCliente=false;
		this.isPermisoActualizarOriginalTituloCliente=false;
		this.isPermisoEliminarTituloCliente=false;
		this.isPermisoGuardarCambiosTituloCliente=false;
		this.isPermisoConsultaTituloCliente=false;
		this.isPermisoBusquedaTituloCliente=false;
		this.isPermisoReporteTituloCliente=false;		
		this.isPermisoOrdenTituloCliente=false;		
		this.isPermisoPaginacionMedioTituloCliente=false;		
		this.isPermisoPaginacionAltoTituloCliente=false;
		this.isPermisoPaginacionTodoTituloCliente=false;
		this.isPermisoCopiarTituloCliente=false;		
		this.isPermisoVerFormTituloCliente=false;		
		this.isPermisoDuplicarTituloCliente=false;		
		this.isPermisoOrdenTituloCliente=false;		
	}
	
	public void setPermisosUsuarioTituloCliente(Boolean isPermiso) {
		this.isPermisoTodoTituloCliente=isPermiso;
		this.isPermisoNuevoTituloCliente=isPermiso;
		this.isPermisoActualizarTituloCliente=isPermiso;
		this.isPermisoActualizarOriginalTituloCliente=isPermiso;
		this.isPermisoEliminarTituloCliente=isPermiso;
		this.isPermisoGuardarCambiosTituloCliente=isPermiso;
		this.isPermisoConsultaTituloCliente=isPermiso;
		this.isPermisoBusquedaTituloCliente=isPermiso;
		this.isPermisoReporteTituloCliente=isPermiso;
		this.isPermisoOrdenTituloCliente=isPermiso;		
		this.isPermisoPaginacionMedioTituloCliente=isPermiso;		
		this.isPermisoPaginacionAltoTituloCliente=isPermiso;		
		this.isPermisoPaginacionTodoTituloCliente=isPermiso;		
		this.isPermisoCopiarTituloCliente=isPermiso;		
		this.isPermisoVerFormTituloCliente=isPermiso;		
		this.isPermisoDuplicarTituloCliente=isPermiso;
		this.isPermisoOrdenTituloCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTituloCliente(Boolean isPermiso) {
		//this.isPermisoTodoTituloCliente=isPermiso;
		this.isPermisoNuevoTituloCliente=isPermiso;
		this.isPermisoActualizarTituloCliente=isPermiso;
		this.isPermisoActualizarOriginalTituloCliente=isPermiso;
		this.isPermisoEliminarTituloCliente=isPermiso;
		this.isPermisoGuardarCambiosTituloCliente=isPermiso;
		//this.isPermisoConsultaTituloCliente=isPermiso;
		//this.isPermisoBusquedaTituloCliente=isPermiso;
		//this.isPermisoReporteTituloCliente=isPermiso;
		//this.isPermisoOrdenTituloCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTituloCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTituloCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTituloCliente=isPermiso;		
		//this.isPermisoCopiarTituloCliente=isPermiso;		
		//this.isPermisoDuplicarTituloCliente=isPermiso;
		//this.isPermisoOrdenTituloCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTituloClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
		if(TituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTituloClienteClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTituloCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTituloClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTituloClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTituloClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTituloClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.remove(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTituloCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TituloClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTituloCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTituloCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTituloCliente=this.isPermisoActualizarTituloCliente;
			this.isPermisoEliminarTituloCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTituloCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTituloCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTituloCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTituloCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTituloCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTituloCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTituloCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTituloCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTituloCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTituloCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTituloCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTituloCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTituloCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTituloCliente.setToolTipText(this.jTableDatosTituloCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTituloCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTituloCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTituloCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tituloclienteConstantesFunciones.mostrarClienteTituloCliente && !TituloClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTituloClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTituloClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TituloClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTituloClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTituloClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TituloClienteParameterReturnGeneral tituloclienteReturnGeneral=new TituloClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tituloclienteConstantesFunciones.cargarid_empresaTituloCliente)
					 || (this.esRecargarFks && this.tituloclienteConstantesFunciones.cargarid_empresaTituloCliente)) {

					if(!this.tituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tituloclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tituloclienteReturnGeneral=tituloclienteLogic.cargarCombosLoteForeignKeyTituloCliente(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tituloclienteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTituloCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tituloclienteSessionBean==null) {
				this.tituloclienteSessionBean=new TituloClienteSessionBean();
			}

			if(!this.tituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTituloCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTituloCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTituloCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTituloCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTituloCliente(TituloCliente titulocliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTituloCliente(TituloCliente titulocliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTituloCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTituloCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTituloCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTituloCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTituloCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTituloCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTituloCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTituloCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TituloClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TituloClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TituloClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tituloclienteSessionBean=new TituloClienteSessionBean(); 
		this.tituloclienteConstantesFunciones=new TituloClienteConstantesFunciones(); 
		this.tituloclienteBean=new TituloCliente();//(this.tituloclienteConstantesFunciones); 		
		this.tituloclienteReturnGeneral=new TituloClienteParameterReturnGeneral(); 
		
		this.tituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTituloCliente(true);
			
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
			
			this.tituloclienteConstantesFunciones=new TituloClienteConstantesFunciones(); 
			this.tituloclienteBean=new TituloCliente();//this.tituloclienteConstantesFunciones); 			
			this.tituloclienteReturnGeneral=new TituloClienteParameterReturnGeneral(); 
		
			TituloClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comercial Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.titulocliente=new TituloCliente();
			this.tituloclientes = new ArrayList<TituloCliente>();
			this.tituloclientesAux = new ArrayList<TituloCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic=new TituloClienteLogic();
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTituloCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTituloCliente);	
					}
					
					if(this.jInternalFrameImportacionTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTituloCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTituloCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTituloCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTituloCliente);
				this.jInternalFrameDetalleFormTituloCliente.setVisible(false);
				this.jInternalFrameDetalleFormTituloCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTituloCliente);
					this.jInternalFrameReporteDinamicoTituloCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTituloCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTituloCliente);
					this.jInternalFrameImportacionTituloCliente.setVisible(false);
					this.jInternalFrameImportacionTituloCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTituloCliente);
					this.jInternalFrameOrderByTituloCliente.setVisible(false);
					this.jInternalFrameOrderByTituloCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTituloClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TituloClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tituloclienteReturnGeneral=new TituloClienteParameterReturnGeneral();
			
			this.tituloclienteParameterGeneral=new TituloClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tituloclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TituloClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tituloclienteSessionBean.getEsGuardarRelacionado(),this.tituloclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TituloClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tituloclienteSessionBean.getEsGuardarRelacionado(),this.tituloclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaDuplicarTituloCliente=true;
			this.isVisibilidadCeldaCopiarTituloCliente=true;
			this.isVisibilidadCeldaVerFormTituloCliente=true;
			this.isVisibilidadCeldaOrdenTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=false;
			this.isVisibilidadCeldaGuardarTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSiglas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTituloCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTituloCliente(false);
			
			this.setPermisosUsuarioTituloCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tituloclienteSessionBean.getEsGuardarRelacionado() && this.tituloclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTituloClienteClasesRelacionadas();
			}
			
			if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTituloClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTituloCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTituloCliente();
			}
			
			if(!this.isPermisoBusquedaTituloCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTituloCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTituloCliente,this.isPermisoPaginacionMedioTituloCliente,this.isPermisoPaginacionTodoTituloCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TituloClienteConstantesFunciones.getTiposSeleccionarTituloCliente());
				
				this.tiposColumnasSelect=TituloClienteConstantesFunciones.getTiposSeleccionarTituloCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTituloCliente();				
				//this.tiposRelacionesSelect=TituloClienteConstantesFunciones.getTiposRelacionesTituloCliente(true);
				
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
			//if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTituloCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTituloCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTituloCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTituloCliente() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tituloclienteImplementable= (TituloClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TituloClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tituloclienteImplementableHome= (TituloClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TituloClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tituloclientes= new ArrayList<TituloCliente>();
			this.tituloclientesEliminados= new ArrayList<TituloCliente>();
						
			this.isEsNuevoTituloCliente=false;
			this.esParaAccionDesdeFormularioTituloCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTituloCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTituloCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TituloClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TituloClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTituloCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTituloCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTituloCliente();
			}
			
			TituloClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTituloCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTituloCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTituloCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTituloCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TituloCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTituloCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTituloCliente")) {
				iIndex=this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTituloCliente();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTituloCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTituloCliente.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTituloCliente.updateUI();
		//this.jTabbedPaneRelacionesTituloCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTituloCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTituloCliente.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tituloclienteConstantesFunciones.mostrarClienteTituloCliente && !TituloClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tituloclienteConstantesFunciones.resaltarClienteTituloCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tituloclienteConstantesFunciones.resaltarClienteTituloCliente);
						}

						jmenuItem.setEnabled(this.tituloclienteConstantesFunciones.activarClienteTituloCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTituloCliente.jmenuDetalleTituloCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTituloCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTituloCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTituloCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTituloClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTituloCliente();
		
		this.cargarCombosFrameForeignKeyTituloCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTituloCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTituloCliente();
		}
	}
	
	
	
	public void jButtonNuevoTituloClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			
			if(jTableDatosTituloCliente.getRowCount()>=1) {
				jTableDatosTituloCliente.removeRowSelectionInterval(0, jTableDatosTituloCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTituloCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTituloCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTituloCliente(true);			
			//this.titulocliente=new TituloCliente();
			//this.titulocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTituloCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTituloCliente() ;
			
			if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTituloCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.titulocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);				
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TituloCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTituloClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTituloCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTituloCliente.getSelectedRows().length;			
			}
			
			tituloclientesSeleccionados=this.getTituloClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTituloCliente--;			
				//TituloCliente tituloclienteAux= new TituloCliente();			
				//tituloclienteAux.setId(this.iIdNuevoTituloCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TituloCliente tituloclienteOrigen=new TituloCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TituloCliente tituloclienteOrigen : tituloclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tituloclienteOrigen =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tituloclienteOrigen =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTituloCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.titulocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTituloCliente(tituloclienteOrigen,this.titulocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tituloclienteLogic.getTituloClientes().add(this.tituloclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tituloclientes.add(this.tituloclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTituloCliente(false);
				
				this.jTableDatosTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTituloCliente(), this.getIndiceNuevoTituloCliente());
				
				int iLastRow =  this.jTableDatosTituloCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTituloCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTituloCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTituloCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();									
		
			TituloCliente tituloclienteOrigen=new TituloCliente();
			TituloCliente tituloclienteDestino=new TituloCliente();
				
			tituloclientesSeleccionados=this.getTituloClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTituloCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tituloclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTituloCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteOrigen =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tituloclienteOrigen =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tituloclienteDestino =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tituloclienteDestino =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tituloclienteOrigen =tituloclientesSeleccionados.get(0);
				tituloclienteDestino =tituloclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTituloCliente(tituloclienteOrigen,tituloclienteDestino,true,false);
				
				tituloclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tituloclienteDestino,tituloclienteLogic.getTituloClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tituloclienteDestino,tituloclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTituloCliente(false);
				
				//this.jTableDatosTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTituloCliente(), this.getIndiceNuevoTituloCliente());
				
				int iLastRow =  this.jTableDatosTituloCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTituloCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTituloCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTituloCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTituloCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTituloCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTituloCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTituloCliente.setVisible(!isVisible);
			this.jPanelPaginacionTituloCliente.setVisible(!isVisible);
			this.jPanelAccionesTituloCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTituloCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTituloCliente();
			
			this.abrirFrameOrderByTituloCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTituloCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTituloCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTituloCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTituloCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTituloCliente.setSize(this.jInternalFrameDetalleFormTituloCliente.iWidthFormulario,this.jInternalFrameDetalleFormTituloCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTituloCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTituloCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTituloCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTituloCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTituloCliente.jContentPaneDetalleTituloCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTituloCliente.jContentPaneDetalleTituloCliente.getWidth(),TituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTituloCliente.jContentPaneDetalleTituloCliente.getWidth(),TituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTituloCliente.jContentPaneDetalleTituloCliente.getWidth(),TituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTituloCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTituloCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTituloCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTituloCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTituloCliente,false,this);
				} else {
					this.jInternalFrameOrderByTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTituloCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTituloCliente);
				this.jInternalFrameOrderByTituloCliente.setVisible(false);
				this.jInternalFrameOrderByTituloCliente.setSelected(false);
				
				this.jInternalFrameOrderByTituloCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTituloCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTituloCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTituloCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTituloCliente==null) {
				
				this.jInternalFrameImportacionTituloCliente=new ImportacionJInternalFrame(TituloClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTituloCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTituloCliente);
				this.jInternalFrameImportacionTituloCliente.setVisible(false);
				this.jInternalFrameImportacionTituloCliente.setSelected(false);


				this.jInternalFrameImportacionTituloCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTituloCliente"));
				this.jInternalFrameImportacionTituloCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTituloCliente"));
				this.jInternalFrameImportacionTituloCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTituloCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTituloCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTituloCliente==null) {
				this.jInternalFrameReporteDinamicoTituloCliente=new ReporteDinamicoJInternalFrame(TituloClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTituloCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTituloCliente);
				this.jInternalFrameReporteDinamicoTituloCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTituloCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTituloCliente"));
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTituloCliente"));
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTituloCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTituloCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTituloCliente.jContentPaneDetalleTituloCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTituloCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTituloCliente);
			
	       	this.jInternalFrameDetalleFormTituloCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTituloCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTituloCliente.dispose();
			//this.jInternalFrameDetalleFormTituloCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTituloCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTituloCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTituloCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTituloCliente.setVisible(true);
	        this.jInternalFrameImportacionTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTituloCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTituloCliente.setVisible(true);
	        this.jInternalFrameOrderByTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTituloCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTituloCliente.setVisible(false);
	        this.jInternalFrameOrderByTituloCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTituloCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTituloCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTituloCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTituloCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTituloCliente.setVisible(false);
	        this.jInternalFrameImportacionTituloCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTituloCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTituloCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTituloCliente(true);
			//this.isEsNuevoTituloCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTituloCliente(false) ;
			
			if(tituloclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTituloCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTituloCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTituloClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTituloCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTituloCliente(true);
			//this.isEsNuevoTituloCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.titulocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTituloCliente(false) ;
			
			if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTituloCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTituloCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTituloCliente(false);
			
			//if(!this.isEsNuevoTituloCliente) {								
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				
			}
			
			if(this.permiteMantenimiento(this.titulocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTituloCliente=true;
					this.inicializarActualizarBindingTablaTituloCliente(false);
					this.isEsNuevoTituloCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTituloCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTituloCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTituloCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTituloCliente(false);
				
				this.habilitarDeshabilitarControlesTituloCliente(false);
			
												
				
				if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTituloCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTituloClienteActionPerformed(evt,tituloclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTituloCliente(this.titulocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTituloCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tituloclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.titulocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				this.titulocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				this.titulocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.titulocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TituloClienteModel) this.jTableDatosTituloCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTituloCliente=true;
				this.inicializarActualizarBindingTablaTituloCliente(false);
				this.isEsNuevoTituloCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTituloCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTituloCliente(false);
				
				this.habilitarDeshabilitarControlesTituloCliente(false);
				
				
				
				if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTituloCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTituloClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTituloCliente.getRowCount()>=1) {
				jTableDatosTituloCliente.removeRowSelectionInterval(0, jTableDatosTituloCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTituloCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTituloCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTituloCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTituloCliente(false) ;
			
			this.isEsNuevoTituloCliente=false;
			
			if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTituloCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTituloCliente(false);
				
				//SI ES MANUAL
				if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTituloCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTituloCliente--;			
			//TituloCliente tituloclienteAux= new TituloCliente();			
			//tituloclienteAux.setId(this.iIdNuevoTituloCliente);
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTituloCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
			
			this.titulocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tituloclienteLogic.getTituloClientes().add(this.tituloclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tituloclientes.add(this.tituloclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTituloCliente(false);
			
			this.jTableDatosTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTituloCliente(), this.getIndiceNuevoTituloCliente());
			
			int iLastRow =  this.jTableDatosTituloCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTituloCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTituloCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTituloCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTituloCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTituloCliente(false);
			
			//SI ES MANUAL
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTituloCliente();
			}
			
			//this.abrirFrameTreeTituloCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTituloClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Comercial ClienteS ?", "MANTENIMIENTO DE Tipo Comercial Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTituloCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTituloCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tituloclienteReturnGeneral=tituloclienteLogic.procesarImportacionTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tituloclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTituloClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTituloClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTituloCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTituloCliente.setFileImportacion(this.jInternalFrameImportacionTituloCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTituloCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTituloCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTituloCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTituloCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		

		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TituloClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TituloClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TituloClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TituloClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TituloClienteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TituloClienteConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTituloCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TituloClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TituloClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TituloClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TituloClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TituloClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TituloClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TituloClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TituloClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TituloClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TituloClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TituloClienteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TituloClienteConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
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
	
	public void jButtonGenerarExcelReporteDinamicoTituloClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TituloClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TituloClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TituloClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TituloCliente titulocliente:tituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(titulocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TituloClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TituloClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TituloCliente titulocliente:tituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(titulocliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TituloClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TituloClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TituloCliente titulocliente:tituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(titulocliente.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TituloClienteConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TituloClienteConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(TituloCliente titulocliente:tituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(titulocliente.getsiglas());
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
			//	this.getFilaCabeceraExportarExcelTituloCliente(row);				
			//	iRow++;
			//}				
			
			//for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTituloCliente(tituloclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTituloCliente(false);
			
			//SI ES MANUAL
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTituloCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTituloCliente(false);
			
			//SI ES MANUAL
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTituloCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTituloCliente(false);
			
			//SI ES MANUAL
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTituloCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTituloCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTituloCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTituloCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTituloCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTituloCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTituloCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTituloCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTituloCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTituloCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTituloCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTituloCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTituloCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTituloCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTituloCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTituloCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTituloCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TituloClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTituloCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTituloCliente();
		
		this.inicializarActualizarBindingBotonesManualTituloCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTituloCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTituloCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTituloCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTituloCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTituloCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTituloCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTituloCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTituloCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionNuevoTituloCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionSinCerrarTituloCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionSinMensajeTituloCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTituloCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTituloCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTituloCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTituloCliente!=null) {
				this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionNuevoTituloCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionSinCerrarTituloCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTituloCliente.jCheckBoxPostAccionSinMensajeTituloCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTituloCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTituloCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTituloCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTituloCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTituloCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTituloCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTituloCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTituloCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTituloCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTituloCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTituloCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTituloCliente() throws Exception {
		try	{
			if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTituloCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTituloCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTituloCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTituloCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTituloCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTituloCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTituloCliente.addItem(reporte);
			}
			
			
			if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTituloCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTituloCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTituloCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTituloCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTituloCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTituloCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTituloCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTituloCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTituloCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTituloCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTituloCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTituloCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTituloCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTituloCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTituloCliente.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTituloCliente.getText();
		this.siglasBusquedaPorSiglas=this.jTextFieldsiglasBusquedaPorSiglasTituloCliente.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTituloCliente(Boolean esInicializar) throws Exception {				
		if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTituloCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTituloCliente() throws Exception {
		this.inicializarActualizarBindingTablaTituloCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTituloCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTituloClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTituloCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tituloclienteLogic.getTituloClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tituloclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTituloCliente.setModel(new TituloClienteModel(this.tituloclienteLogic.getTituloClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTituloCliente.setModel(new TituloClienteModel(this.tituloclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTituloCliente!=null && this.jInternalFrameOrderByTituloCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTituloCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TituloClienteConstantesFunciones.SCLASSWEBTITULO,tituloclienteConstantesFunciones.resaltarSeleccionarTituloCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TituloClienteConstantesFunciones.SCLASSWEBTITULO,tituloclienteConstantesFunciones.resaltarSeleccionarTituloCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,TituloClienteConstantesFunciones.LABEL_ID));

		if(this.tituloclienteConstantesFunciones.mostraridTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TituloClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tituloclienteConstantesFunciones.resaltaridTituloCliente,this.tituloclienteConstantesFunciones.activaridTituloCliente,this,true,"idTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tituloclienteConstantesFunciones.resaltaridTituloCliente,this.tituloclienteConstantesFunciones.activaridTituloCliente,this,true,"idTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,TituloClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tituloclienteConstantesFunciones.mostrarid_empresaTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TituloClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tituloclienteConstantesFunciones.resaltarid_empresaTituloCliente,this,this.tituloclienteConstantesFunciones.activarid_empresaTituloCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tituloclienteConstantesFunciones.resaltarid_empresaTituloCliente,this,this.tituloclienteConstantesFunciones.activarid_empresaTituloCliente,false,"id_empresaTituloCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,TituloClienteConstantesFunciones.LABEL_CODIGO));

		if(this.tituloclienteConstantesFunciones.mostrarcodigoTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TituloClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tituloclienteConstantesFunciones.resaltarcodigoTituloCliente,this.tituloclienteConstantesFunciones.activarcodigoTituloCliente,this,true,"codigoTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tituloclienteConstantesFunciones.resaltarcodigoTituloCliente,this.tituloclienteConstantesFunciones.activarcodigoTituloCliente,this,true,"codigoTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,TituloClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.tituloclienteConstantesFunciones.mostrarnombreTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TituloClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tituloclienteConstantesFunciones.resaltarnombreTituloCliente,this.tituloclienteConstantesFunciones.activarnombreTituloCliente,this,true,"nombreTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tituloclienteConstantesFunciones.resaltarnombreTituloCliente,this.tituloclienteConstantesFunciones.activarnombreTituloCliente,this,true,"nombreTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,TituloClienteConstantesFunciones.LABEL_SIGLAS));

		if(this.tituloclienteConstantesFunciones.mostrarsiglasTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TituloClienteConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tituloclienteConstantesFunciones.resaltarsiglasTituloCliente,this.tituloclienteConstantesFunciones.activarsiglasTituloCliente,this,true,"siglasTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tituloclienteConstantesFunciones.resaltarsiglasTituloCliente,this.tituloclienteConstantesFunciones.activarsiglasTituloCliente,this,true,"siglasTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tituloclienteConstantesFunciones.mostrarClienteTituloCliente && !TituloClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tituloclienteConstantesFunciones.resaltarClienteTituloCliente,this,this.tituloclienteConstantesFunciones.activarClienteTituloCliente));
				tableColumn.setCellEditor(new ClienteTableCell(tituloclienteConstantesFunciones.resaltarClienteTituloCliente,this,this.tituloclienteConstantesFunciones.activarClienteTituloCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTituloCliente.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTituloCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTituloCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTituloCliente && this.isPermisoGuardarCambiosTituloCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tituloclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTituloCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tituloclienteSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTituloCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTituloCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTituloCliente && this.isPermisoGuardarCambiosTituloCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tituloclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTituloCliente && this.isPermisoGuardarCambiosTituloCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTituloCliente.moveColumn(this.jTableDatosTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTituloCliente.moveColumn(this.jTableDatosTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tituloclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTituloCliente.moveColumn(this.jTableDatosTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTituloCliente.moveColumn(this.jTableDatosTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTituloCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTituloCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTituloCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTituloCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTituloCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTituloCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTituloCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTituloCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tituloclienteLogic.getTituloClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tituloclientes.size()-1;
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
		//this.jTableDatosTituloCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTituloCliente();
			
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
				
				//this.isEsNuevoTituloCliente=false;
					
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
				if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTituloCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTituloCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTituloCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.titulocliente.getsType().equals("DUPLICADO")
				   || this.titulocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTituloCliente=true;
				
				} else {
					this.isEsNuevoTituloCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.titulocliente.getId()>=0 && !this.titulocliente.getIsNew()) {						
						this.isEsNuevoTituloCliente=false;
						
					} else {
						this.isEsNuevoTituloCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTituloCliente(esRelaciones);						
				
				this.seleccionarTituloCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.titulocliente.getId()<0) {
					this.isEsNuevoTituloCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTituloCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTituloCliente(evt,rowIndex);
				}	
				
				if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TituloCliente: " + this.dDif); 
					}
				}								
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTituloCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.titulocliente)) {
					if(this.titulocliente.getId()>0) {
						this.titulocliente.setIsDeleted(true);
						
						this.tituloclientesEliminados.add(this.titulocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tituloclienteLogic.getTituloClientes().remove(this.titulocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tituloclientes.remove(this.titulocliente);				
					}
					
					
					((TituloClienteModel) this.jTableDatosTituloCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTituloCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTituloCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTituloCliente) {
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTituloCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTituloCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTituloCliente(this.titulocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tituloclienteConstantesFunciones.cargarid_empresaTituloCliente || this.tituloclienteConstantesFunciones.event_dependid_empresaTituloCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.titulocliente.getid_empresa());
									//this.inicializarActualizarBindingTituloCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(titulocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(titulocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.titulocliente.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTituloCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTituloCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTituloCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTituloCliente(TituloCliente titulocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTituloCliente(titulocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTituloCliente(TituloCliente titulocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTituloCliente(titulocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTituloCliente(titulocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTituloCliente(titulocliente);
	}
	
	public void setVariablesObjetoActualToFormularioTituloCliente(TituloCliente titulocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setText(titulocliente.getId().toString());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setText(titulocliente.getcodigo());
			this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setText(titulocliente.getnombre());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setText(titulocliente.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TituloCliente tituloclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tituloclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TituloCliente tituloclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tituloclienteLocal=this.titulocliente;
			} else {
				tituloclienteLocal=this.tituloclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tituloclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTituloCliente(tituloclienteLocal,true);
					
					if(tituloclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tituloclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tituloclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTituloCliente(TituloCliente titulocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTituloCliente(titulocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(titulocliente);
	}
	
	public void setVariablesFormularioToObjetoActualTituloCliente(TituloCliente titulocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTituloCliente(titulocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTituloCliente(TituloCliente titulocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.getText()==null || this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.getText()=="" || this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setText("0");
			}

			if(conColumnasBase) {titulocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TituloClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelIdTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			titulocliente.setcodigo(this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TituloClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelcodigoTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			titulocliente.setnombre(this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TituloClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelnombreTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			titulocliente.setsiglas(this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TituloClienteConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTituloCliente.jLabelsiglasTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTituloCliente(TituloCliente tituloclienteBean,TituloCliente titulocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTituloCliente(TituloCliente tituloclienteOrigen,TituloCliente titulocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tituloclienteOrigen.getId()!=null && !tituloclienteOrigen.getId().equals(0L))) {titulocliente.setId(tituloclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tituloclienteOrigen.getcodigo()!=null && !tituloclienteOrigen.getcodigo().equals(""))) {titulocliente.setcodigo(tituloclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && tituloclienteOrigen.getnombre()!=null && !tituloclienteOrigen.getnombre().equals(""))) {titulocliente.setnombre(tituloclienteOrigen.getnombre());}
			if(conDefault || (!conDefault && tituloclienteOrigen.getsiglas()!=null && !tituloclienteOrigen.getsiglas().equals(""))) {titulocliente.setsiglas(tituloclienteOrigen.getsiglas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTituloCliente(TituloCliente titulocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setText(titulocliente.getId().toString());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setText(titulocliente.getcodigo());
			this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setText(titulocliente.getnombre());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setText(titulocliente.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTituloCliente(TituloClienteBean tituloclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setText(tituloclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setText(tituloclienteBean.getcodigo());
			this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setText(tituloclienteBean.getnombre());
			this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setText(tituloclienteBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTituloCliente(TituloClienteParameterReturnGeneral tituloclienteReturnGeneral,TituloClienteBean tituloclienteBean,Boolean conDefault) throws Exception { 
		try {
			TituloCliente tituloclienteLocal=new TituloCliente();
			
			tituloclienteLocal=tituloclienteReturnGeneral.getTituloCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tituloclienteLocal.getId()!=null && !tituloclienteLocal.getId().equals(0L))) {tituloclienteBean.setId(tituloclienteLocal.getId());}}
			if(conDefault || (!conDefault && tituloclienteLocal.getcodigo()!=null && !tituloclienteLocal.getcodigo().equals(""))) {tituloclienteBean.setcodigo(tituloclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && tituloclienteLocal.getnombre()!=null && !tituloclienteLocal.getnombre().equals(""))) {tituloclienteBean.setnombre(tituloclienteLocal.getnombre());}
			if(conDefault || (!conDefault && tituloclienteLocal.getsiglas()!=null && !tituloclienteLocal.getsiglas().equals(""))) {tituloclienteBean.setsiglas(tituloclienteLocal.getsiglas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTituloClienteGenerico(Long idTituloClienteSeleccionado,JComboBox jComboBoxTituloCliente,List<TituloCliente> tituloclientesLocal)throws Exception {
		try {
			TituloCliente  tituloclienteTemp=null;

			for(TituloCliente tituloclienteAux:tituloclientesLocal) {
				if(tituloclienteAux.getId()!=null && tituloclienteAux.getId().equals(idTituloClienteSeleccionado)) {
					tituloclienteTemp=tituloclienteAux;
					break;
				}
			}

			jComboBoxTituloCliente.setSelectedItem(tituloclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTituloClienteGenerico(JComboBox jComboBoxTituloCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTituloCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTituloCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTituloCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTituloCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			titulocliente=(TituloCliente) tituloclienteLogic.getTituloClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			titulocliente =(TituloCliente) tituloclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!titulocliente.getIsNew() && !titulocliente.getIsChanged() && !titulocliente.getIsDeleted()) {
				sDescripcion=titulocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=titulocliente.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TituloCliente tituloclienteRow=new TituloCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tituloclienteRow=(TituloCliente) tituloclienteLogic.getTituloClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tituloclienteRow=(TituloCliente) tituloclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TituloCliente titulocliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTituloCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente = (TituloCliente)this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.titulocliente = (TituloCliente)this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(titulocliente!=null) {
						this.titulocliente = titulocliente;
					} else {
						this.titulocliente = new TituloCliente();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.titulocliente)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame;
					}

					List<TituloCliente> tituloclientes=new ArrayList<TituloCliente>();
					tituloclientes.add(this.titulocliente);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTituloCliente.cargarClienteBeanSwingJInternalFrame(tituloclientes,this.titulocliente,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTituloCliente=(TitledBorder)this.jScrollPanelDatosTituloCliente.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTituloCliente.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tituloclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTituloCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente));			
			this.jButtonDuplicarTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTituloCliente && this.isPermisoDuplicarTituloCliente));			
			this.jButtonCopiarTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTituloCliente && this.isPermisoCopiarTituloCliente));
			this.jButtonVerFormTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTituloCliente && this.isPermisoVerFormTituloCliente));
			
			this.jButtonAbrirOrderByTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));			
			
			this.jButtonNuevoRelacionesTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTituloCliente && this.isPermisoNuevoTituloCliente));			
			this.jButtonNuevoGuardarCambiosTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente && this.isPermisoGuardarCambiosTituloCliente));
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonModificarTituloCliente.setVisible((this.isVisibilidadCeldaModificarTituloCliente && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTituloCliente && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTituloCliente && this.isPermisoEliminarTituloCliente));
			this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTituloCliente);							
			this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTituloCliente && this.isPermisoGuardarCambiosTituloCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTituloCliente && this.isPermisoGuardarCambiosTituloCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente));						
			this.jButtonDuplicarToolBarTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTituloCliente && this.isPermisoDuplicarTituloCliente));						
			this.jButtonCopiarToolBarTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTituloCliente && this.isPermisoCopiarTituloCliente));			
			this.jButtonVerFormToolBarTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTituloCliente && this.isPermisoVerFormTituloCliente));			
			this.jButtonAbrirOrderByToolBarTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));
			this.jButtonNuevoRelacionesToolBarTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTituloCliente && this.isPermisoNuevoTituloCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente && this.isPermisoGuardarCambiosTituloCliente));			
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonModificarToolBarTituloCliente.setVisible((this.isVisibilidadCeldaModificarTituloCliente && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarToolBarTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTituloCliente  && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarToolBarTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTituloCliente && this.isPermisoEliminarTituloCliente));
			this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarToolBarTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTituloCliente);				
			this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosToolBarTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTituloCliente && this.isPermisoGuardarCambiosTituloCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTituloCliente && this.isPermisoGuardarCambiosTituloCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente));			
			this.jMenuItemDuplicarTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTituloCliente && this.isPermisoDuplicarTituloCliente));			
			this.jMenuItemCopiarTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTituloCliente && this.isPermisoCopiarTituloCliente));			
			this.jMenuItemVerFormTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTituloCliente && this.isPermisoVerFormTituloCliente));			
			this.jMenuItemAbrirOrderByTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));			
			//this.jMenuItemMostrarOcultarTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));
			this.jMenuItemDetalleAbrirOrderByTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));			
			//this.jMenuItemDetalleMostrarOcultarTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTituloCliente && this.isPermisoOrdenTituloCliente));			
			this.jMenuItemNuevoRelacionesTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTituloCliente && this.isPermisoNuevoTituloCliente));			
			this.jMenuItemNuevoGuardarCambiosTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTituloCliente && this.isPermisoNuevoTituloCliente && this.isPermisoGuardarCambiosTituloCliente));									
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemModificarTituloCliente.setVisible((this.isVisibilidadCeldaModificarTituloCliente && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemActualizarTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTituloCliente && this.isPermisoActualizarTituloCliente));	
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemEliminarTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTituloCliente && this.isPermisoEliminarTituloCliente));
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemCancelarTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTituloCliente);				
			}
			
			this.jMenuItemGuardarCambiosTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTituloCliente && this.isPermisoGuardarCambiosTituloCliente));						
			this.jMenuItemGuardarCambiosTablaTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTituloCliente && this.isPermisoGuardarCambiosTituloCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTituloCliente=this.jButtonNuevoTituloCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTituloCliente=this.jButtonDuplicarTituloCliente.isVisible();
			this.isVisibilidadCeldaCopiarTituloCliente=this.jButtonCopiarTituloCliente.isVisible();
			this.isVisibilidadCeldaVerFormTituloCliente=this.jButtonVerFormTituloCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTituloCliente=this.jButtonAbrirOrderByTituloCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=this.jButtonNuevoRelacionesTituloCliente.isVisible();
			this.isVisibilidadCeldaModificarTituloCliente=this.jButtonModificarTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.isVisibilidadCeldaActualizarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=this.jButtonGuardarCambiosTablaTituloCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTituloCliente=this.jButtonNuevoToolBarTituloCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=this.jButtonNuevoRelacionesToolBarTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.isVisibilidadCeldaModificarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonModificarToolBarTituloCliente.isVisible();
			this.isVisibilidadCeldaActualizarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarToolBarTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarToolBarTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarToolBarTituloCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTituloCliente=this.jButtonGuardarCambiosToolBarTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=this.jButtonGuardarCambiosTablaToolBarTituloCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTituloCliente=this.jMenuItemNuevoTituloCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=this.jMenuItemNuevoRelacionesTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.isVisibilidadCeldaModificarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jMenuItemModificarTituloCliente.isVisible();
			this.isVisibilidadCeldaActualizarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jMenuItemActualizarTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jMenuItemEliminarTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTituloCliente=this.jInternalFrameDetalleFormTituloCliente.jMenuItemCancelarTituloCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTituloCliente=this.jMenuItemGuardarCambiosTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=this.jMenuItemGuardarCambiosTablaTituloCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTituloCliente(Boolean esInicializar) {
		if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTituloCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTituloCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTituloCliente() {
		this.jButtonNuevoTituloCliente.setVisible(this.isPermisoNuevoTituloCliente);			
		this.jButtonDuplicarTituloCliente.setVisible(this.isPermisoDuplicarTituloCliente);			
		this.jButtonCopiarTituloCliente.setVisible(this.isPermisoCopiarTituloCliente);			
		this.jButtonVerFormTituloCliente.setVisible(this.isPermisoVerFormTituloCliente);			
		
		this.jButtonAbrirOrderByTituloCliente.setVisible(this.isPermisoOrdenTituloCliente);					
		
		this.jButtonNuevoRelacionesTituloCliente.setVisible(this.isPermisoNuevoTituloCliente);			
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonModificarTituloCliente.setVisible(this.isPermisoActualizarTituloCliente);	
			this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.setVisible(this.isPermisoActualizarTituloCliente);	
			this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.setVisible(this.isPermisoEliminarTituloCliente);
			this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTituloCliente);						
			this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.setVisible(this.isPermisoGuardarCambiosTituloCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTituloCliente.setVisible(this.isPermisoActualizarTituloCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTituloCliente() {
		this.jInternalFrameDetalleFormTituloCliente.jButtonModificarTituloCliente.setVisible(this.isPermisoActualizarTituloCliente);	
		this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.setVisible(this.isPermisoActualizarTituloCliente);	
		this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.setVisible(this.isPermisoEliminarTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTituloCliente);							
		this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTituloCliente && this.isPermisoGuardarCambiosTituloCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTituloCliente() {
		if(TituloClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTituloCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTituloCliente() {
	}
	
	public void jTableDatosTituloClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTituloCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.titulocliente==null) {
						this.titulocliente = new TituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				}

				if(this.titulocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.titulocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTituloClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTituloCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTituloCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTituloCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tituloclienteLogic.getConnexion());

				if(this.titulocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.titulocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTituloCliente=(TitledBorder)this.jScrollPanelDatosTituloCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTituloCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.titulocliente==null) {
						this.titulocliente = new TituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				}

				if(this.titulocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.titulocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.titulocliente==null) {
						this.titulocliente = new TituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				}

				if(this.titulocliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.titulocliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.titulocliente==null) {
						this.titulocliente = new TituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				}

				if(this.titulocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.titulocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.gettitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.titulocliente==null) {
						this.titulocliente = new TituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);
				}

				if(this.titulocliente.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.titulocliente.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTituloCliente(false,false);

			this.getTituloClientesBusquedaPorCodigo();

			this.inicializarActualizarBindingTituloCliente(false);

			//if(TituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTituloCliente(false,false);

			this.getTituloClientesBusquedaPorNombre();

			this.inicializarActualizarBindingTituloCliente(false);

			//if(TituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglasTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTituloCliente(false,false);

			this.getTituloClientesBusquedaPorSiglas();

			this.inicializarActualizarBindingTituloCliente(false);

			//if(TituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTituloCliente(false,false);

			this.getTituloClientesFK_IdEmpresa();

			this.inicializarActualizarBindingTituloCliente(false);

			//if(TituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTituloCliente() {
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
		

		if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
			this.jInternalFrameDetalleFormTituloCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTituloCliente.dispose();
			this.jInternalFrameDetalleFormTituloCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
			this.jInternalFrameReporteDinamicoTituloCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTituloCliente.dispose();
			this.jInternalFrameReporteDinamicoTituloCliente=null;
		}
		
		if(this.jInternalFrameImportacionTituloCliente!=null) {
			this.jInternalFrameImportacionTituloCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTituloCliente.dispose();
			this.jInternalFrameImportacionTituloCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTituloCliente();
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTituloCliente")) {
				jButtonDuplicarTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTituloCliente")) {
				jButtonCopiarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTituloCliente")) {
				jButtonVerFormTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTituloCliente")) {
				jButtonDuplicarTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTituloCliente")) {
				jButtonDuplicarTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTituloCliente")) {
				jButtonModificarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTituloCliente")) {
				jButtonModificarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTituloCliente")) {
				jButtonModificarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTituloCliente")) {
				jButtonActualizarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTituloCliente")) {
				jButtonActualizarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTituloCliente")) {
				jButtonActualizarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTituloCliente")) {
				jButtonEliminarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTituloCliente")) {
				jButtonEliminarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTituloCliente")) {
				jButtonEliminarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTituloCliente")) {
				jButtonCancelarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTituloCliente")) {
				jButtonCancelarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTituloCliente")) {
				jButtonCancelarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTituloCliente")) {
				jButtonCerrarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTituloCliente")) {
				jButtonCerrarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTituloCliente")) {
				jButtonCerrarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTituloCliente")) {
				jButtonMostrarOcultarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTituloCliente")) {
				jButtonCancelarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTituloCliente")) {
				jButtonCopiarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTituloCliente")) {
				jButtonVerFormTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTituloCliente")) {
				jButtonCopiarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTituloCliente")) {
				jButtonVerFormTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTituloCliente")) {
				jButtonRecargarInformacionTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTituloCliente")) {
				jButtonRecargarInformacionTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTituloCliente")) {
				jButtonRecargarInformacionTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTituloCliente")) {
				jButtonAnterioresTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTituloCliente")) {
				jButtonAnterioresTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTituloCliente")) {
				jButtonAnterioresTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTituloCliente")) {
				jButtonSiguientesTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTituloCliente")) {
				jButtonSiguientesTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTituloCliente")) {
				jButtonSiguientesTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTituloCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTituloCliente")) {
				jButtonAbrirOrderByTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTituloCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTituloCliente")) {
				jButtonMostrarOcultarTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTituloCliente")) {
				jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTituloCliente")) {
				jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTituloCliente")) {
				jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTituloCliente")) {
				jButtonCerrarReporteDinamicoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTituloCliente")) {
				jButtonGenerarReporteDinamicoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTituloCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTituloCliente")) {
				jButtonCerrarImportacionTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTituloCliente")) {
				
				jButtonGenerarImportacionTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTituloCliente")) {
				
				jButtonAbrirImportacionTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTituloCliente")) {
				jComboBoxTiposAccionesTituloClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTituloCliente")) {
				jComboBoxTiposRelacionesTituloClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTituloCliente")) {
				jComboBoxTiposAccionesTituloClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTituloCliente")) {
				
				jComboBoxTiposSeleccionarTituloClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTituloCliente")) {
				jTextFieldValorCampoGeneralTituloClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTituloCliente")) {
				jButtonAbrirOrderByTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTituloCliente")) {
				jButtonAbrirOrderByTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTituloCliente")) {
				jButtonCerrarOrderByTituloClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTituloClienteBusqueda")) {
				this.jButtonidTituloClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTituloClienteUpdate")) {
				this.jButtonid_empresaTituloClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTituloClienteBusqueda")) {
				this.jButtonid_empresaTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTituloClienteBusqueda")) {
				this.jButtoncodigoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTituloClienteBusqueda")) {
				this.jButtonnombreTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTituloClienteBusqueda")) {
				this.jButtonsiglasTituloClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTituloCliente")) {
				this.jButtonBusquedaPorCodigoTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTituloCliente")) {
				this.jButtonBusquedaPorNombreTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglasTituloCliente")) {
				this.jButtonBusquedaPorSiglasTituloClienteActionPerformed(evt);
			}
			
			;
			
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTituloCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TituloCliente tituloclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tituloclienteLocal=this.titulocliente;
			} else {
				tituloclienteLocal=this.tituloclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
							
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
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
			
			


			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
								
						
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
								
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
							
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
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
			
			


			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
								
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTituloCliente")) {
					jCheckBoxSeleccionarTodosTituloClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTituloCliente")) {
					jCheckBoxSeleccionadosTituloClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTituloCliente")) {
					
				}
				
				


				
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
												
				
				


				
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
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
			
			


			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTituloClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.titulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.titulocliente);
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
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
				
				


				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TituloCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tituloclienteAnterior =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTituloCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTituloClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTituloCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.titulocliente =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.titulocliente =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.titulocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTituloCliente")) {
				
				}
				
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTituloCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTituloCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTituloCliente")) {
			
			}
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTituloCliente();
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTituloCliente")) {
				jButtonDuplicarTituloClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTituloCliente")) {
				jButtonCopiarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTituloCliente")) {
				jButtonVerFormTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTituloCliente")) {
				jButtonNuevoTituloClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTituloCliente")) {
				jButtonModificarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTituloCliente")) {
				jButtonActualizarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTituloCliente")) {
				jButtonEliminarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTituloCliente")) {
				jButtonCancelarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTituloCliente")) {
				jButtonCerrarTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTituloCliente")) {
				jButtonGuardarCambiosTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTituloCliente")) {
				jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTituloCliente")) {
				jButtonAbrirOrderByTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTituloCliente")) {
				jButtonRecargarInformacionTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTituloCliente")) {
				jButtonAnterioresTituloClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTituloCliente")) {
				jButtonSiguientesTituloClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTituloClienteBusqueda")) {
				this.jButtonidTituloClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTituloClienteUpdate")) {
				this.jButtonid_empresaTituloClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTituloClienteBusqueda")) {
				this.jButtonid_empresaTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTituloClienteBusqueda")) {
				this.jButtoncodigoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTituloClienteBusqueda")) {
				this.jButtonnombreTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTituloClienteBusqueda")) {
				this.jButtonsiglasTituloClienteBusquedaActionPerformed(evt);
			}
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTituloCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTituloCliente")) {
				closingInternalFrameTituloCliente();
				
			} else if(sTipo.equals("jButtonCancelarTituloCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTituloCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TituloClienteBeanSwingJInternalFrame jInternalFrameParent=(TituloClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTituloCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTituloClienteActionPerformed(null);
			}
			
			TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.titulocliente,new Object(),this.tituloclienteParameterGeneral,this.tituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTituloCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTituloCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTituloCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.titulocliente)) {
			if(!esControlTabla) {
				if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);			
				}
				
				if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTituloCliente(this.titulocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tituloclienteReturnGeneral=tituloclienteLogic.procesarEventosTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tituloclienteLogic.getTituloClientes(),this.titulocliente,this.tituloclienteParameterGeneral,this.isEsNuevoTituloCliente,classes);//this.tituloclienteLogic.getTituloCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTituloCliente(this.tituloclienteReturnGeneral,this.tituloclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTituloCliente(classes,this.tituloclienteReturnGeneral,this.tituloclienteBean,false);
					}
						
					if(this.tituloclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente());	
					}
						
					if(this.tituloclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente(),classes);//this.tituloclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTituloCliente(this.titulocliente,classes);//this.tituloclienteBean);									
				}
			
				if(TituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTituloCliente(this.titulocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTituloCliente(this.titulocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tituloclienteAnterior!=null) {
						this.titulocliente=this.tituloclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tituloclienteReturnGeneral=tituloclienteLogic.procesarEventosTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tituloclienteLogic.getTituloClientes(),this.titulocliente,this.tituloclienteParameterGeneral,this.isEsNuevoTituloCliente,classes);//this.tituloclienteLogic.getTituloCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tituloclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tituloclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tituloclienteReturnGeneral.getTituloCliente(),tituloclienteLogic.getTituloClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tituloclienteReturnGeneral.getTituloCliente(),this.tituloclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTituloCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTituloCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTituloCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTituloCliente() throws Exception {
		
		TituloClienteModel tituloclienteModel=(TituloClienteModel)this.jTableDatosTituloCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tituloclienteModel.tituloclientes=this.tituloclienteLogic.getTituloClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tituloclienteModel.tituloclientes=this.tituloclientes;
		}
		
		
		((TituloClienteModel) this.jTableDatosTituloCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTituloCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettituloclienteAnterior(),this.tituloclienteLogic.getTituloClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettituloclienteAnterior(),this.tituloclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTituloCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTituloCliente(TituloCliente titulocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(titulocliente.getClientes());
					this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
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
										
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.titulocliente,new Object(),generalEntityParameterGeneral,this.tituloclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TituloClienteConstantesFunciones.getClassesRelationshipsOfTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TituloClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTituloCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTituloCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.titulocliente,new Object(),generalEntityParameterGeneral,this.tituloclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTituloCliente(TituloClienteBean tituloclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(titulocliente.getClientes());
					this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTituloCliente(ArrayList<Classe> classes,TituloClienteReturnGeneral tituloclienteReturnGeneral,TituloClienteBean tituloclienteBean,Boolean conDefault) throws Exception {
		
			this.tituloclienteBean.setClientes(tituloclienteReturnGeneral.getTituloCliente().getClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTituloCliente(TituloCliente titulocliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					titulocliente.setClientes(this.jInternalFrameDetalleFormTituloCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.titulocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTituloCliente = new TituloClienteDetalleFormJInternalFrame(jDesktopPane,this.tituloclienteSessionBean.getConGuardarRelaciones(),this.tituloclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.setVisible(false);
		this.jInternalFrameDetalleFormTituloCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTituloCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTituloCliente.tituloclienteLogic=this.tituloclienteLogic;
		
		this.cargarCombosFrameForeignKeyTituloCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTituloCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTituloCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTituloCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTituloCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTituloCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTituloCliente"));
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonModificarTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarTituloCliente"));

		
		this.jInternalFrameDetalleFormTituloCliente.jButtonModificarToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTituloCliente"));
					
		this.jInternalFrameDetalleFormTituloCliente.jMenuItemModificarTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.addActionListener (new ButtonActionListener(this,"ActualizarTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTituloCliente"));
						
		this.jInternalFrameDetalleFormTituloCliente.jMenuItemActualizarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTituloCliente"));
								
		this.jInternalFrameDetalleFormTituloCliente.jMenuItemEliminarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTituloCliente"));
					
		this.jInternalFrameDetalleFormTituloCliente.jMenuItemCancelarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTituloCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jMenuItemDetalleCerrarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTituloCliente"));
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTituloCliente"));
		
		
		
		this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTituloCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonidTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtoncodigoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonnombreTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonsiglasTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTituloClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTituloCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTituloCliente"));
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTituloCliente"));
		}
		
		this.jTableDatosTituloCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTituloCliente"));
		
		this.jTableDatosTituloCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTituloCliente"));
		
		this.jButtonNuevoTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoTituloCliente"));
		
		this.jButtonDuplicarTituloCliente.addActionListener(new ButtonActionListener(this,"DuplicarTituloCliente"));
		
		this.jButtonCopiarTituloCliente.addActionListener(new ButtonActionListener(this,"CopiarTituloCliente"));
		
		this.jButtonVerFormTituloCliente.addActionListener(new ButtonActionListener(this,"VerFormTituloCliente"));
		
		
		this.jButtonNuevoToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTituloCliente"));
			
		this.jButtonDuplicarToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTituloCliente"));
			
		this.jMenuItemNuevoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTituloCliente"));
			
		this.jMenuItemDuplicarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTituloCliente"));		
		
		
		this.jButtonNuevoRelacionesTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTituloCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTituloCliente"));
			
		this.jMenuItemNuevoRelacionesTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTituloCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonModificarTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonModificarToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTituloCliente"));
			
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemModificarTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarTituloCliente.addActionListener (new ButtonActionListener(this,"ActualizarTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonActualizarToolBarTituloCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTituloCliente"));
				
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemActualizarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonEliminarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTituloCliente"));
						
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemEliminarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonCancelarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTituloCliente"));
			
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemCancelarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTituloCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTituloCliente"));		
		
		
		this.jButtonCerrarTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarTituloCliente"));
		
		
		this.jButtonCerrarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTituloCliente"));
			
		this.jMenuItemCerrarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTituloCliente"));
			
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jMenuItemDetalleCerrarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTituloCliente"));
		}
		
		this.jButtonCopiarToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTituloCliente"));
			
		this.jButtonVerFormToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTituloCliente"));
		
		this.jMenuItemGuardarCambiosTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTituloCliente"));
			
		this.jMenuItemCopiarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTituloCliente"));		
		
		this.jMenuItemVerFormTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTituloCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTituloCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTituloCliente"));
			
		this.jMenuItemGuardarCambiosTablaTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTituloCliente"));		
		
		
		
		this.jButtonRecargarInformacionTituloCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTituloCliente"));
					
		this.jButtonRecargarInformacionToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTituloCliente"));
		
		this.jMenuItemRecargarInformacionTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTituloCliente"));		
		
		
		
		this.jButtonAnterioresTituloCliente.addActionListener (new ButtonActionListener(this,"AnterioresTituloCliente"));
		
		
		this.jButtonAnterioresToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTituloCliente"));
		
		this.jMenuItemAnterioresTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTituloCliente"));		
		
		
		this.jButtonSiguientesTituloCliente.addActionListener (new ButtonActionListener(this,"SiguientesTituloCliente"));
		
		
		this.jButtonSiguientesToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTituloCliente"));
			
		this.jMenuItemSiguientesTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTituloCliente"));
			
		this.jMenuItemAbrirOrderByTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTituloCliente"));
			
		this.jMenuItemMostrarOcultarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTituloCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTituloCliente"));
			
		this.jMenuItemDetalleMostarOcultarTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTituloCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTituloCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTituloCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTituloCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTituloCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTituloCliente"));

		this.jCheckBoxSeleccionadosTituloCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTituloCliente"));
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTituloCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTituloCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTituloCliente"));
			
		this.jComboBoxTiposAccionesTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTituloCliente"));
					
		this.jComboBoxTiposSeleccionarTituloCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTituloCliente"));
			
		this.jTextFieldValorCampoGeneralTituloCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTituloCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonidTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtoncodigoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonnombreTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonsiglasTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTituloClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTituloCliente"));

			this.jButtonBusquedaPorNombreTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTituloCliente"));

			this.jButtonBusquedaPorSiglasTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTituloCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTituloCliente"));
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTituloCliente"));
				this.jInternalFrameReporteDinamicoTituloCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTituloCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTituloCliente"));				
			//this.jButtonGenerarReporteDinamicoTituloCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTituloCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTituloCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTituloCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTituloCliente!=null) {
				this.jInternalFrameImportacionTituloCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTituloCliente"));
				this.jInternalFrameImportacionTituloCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTituloCliente"));
				this.jInternalFrameImportacionTituloCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTituloCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTituloCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTituloCliente"));
			
			this.jButtonAbrirOrderByToolBarTituloCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTituloCliente"));			
			
			if(this.jInternalFrameOrderByTituloCliente!=null) {
				this.jInternalFrameOrderByTituloCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTituloCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTituloCliente.jTabbedPaneRelacionesTituloCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTituloCliente"));
		
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
            		closingInternalFrameTituloCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTituloCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTituloCliente = (JInternalFrameBase)event.getSource();
	            	
	            TituloClienteBeanSwingJInternalFrame jInternalFrameParent=(TituloClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTituloCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTituloClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTituloCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTituloClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTituloCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTituloCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTituloCliente";
		inputMap = this.jButtonNuevoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTituloClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTituloCliente";
		inputMap = this.jButtonNuevoRelacionesTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTituloClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTituloCliente";
		inputMap = this.jButtonModificarTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTituloCliente";
		inputMap = this.jButtonActualizarTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTituloCliente";
		inputMap = this.jButtonEliminarTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTituloCliente";
		inputMap = this.jButtonCancelarTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTituloCliente";
		inputMap = this.jButtonCerrarTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTituloCliente";
		inputMap = this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTituloCliente.jButtonGuardarCambiosTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTituloCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTituloClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonidTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonid_empresaTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtoncodigoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonnombreTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTituloCliente.jButtonsiglasTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTituloClienteBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTituloCliente"));

		this.jButtonBusquedaPorNombreTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTituloCliente"));

		this.jButtonBusquedaPorSiglasTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTituloCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTituloClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTituloCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTituloCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
					tituloclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TituloCliente tituloclienteAux:tituloclientes) {
					tituloclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTituloClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTituloCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
						tituloclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TituloCliente tituloclienteAux:tituloclientes) {
						tituloclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TituloCliente tituloclienteAux:tituloclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTituloCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTituloCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTituloCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTituloClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTituloCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTituloCliente.getSelectedRows();
			
			TituloCliente tituloclienteLocal=new TituloCliente();
			
			//this.seleccionarTodosTituloCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tituloclienteLocal =(TituloCliente) this.tituloclienteLogic.getTituloClientes().toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tituloclienteLocal =(TituloCliente) this.tituloclientes.toArray()[this.jTableDatosTituloCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tituloclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
						tituloclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TituloCliente tituloclienteAux:tituloclientes) {
						tituloclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTituloCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTituloCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTituloCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTituloCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTituloClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTituloClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTituloClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTituloCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTituloCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TituloCliente tituloclienteAux:this.tituloclienteLogic.getTituloClientes()) {
				
						if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tituloclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tituloclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tituloclienteAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TituloCliente tituloclienteAux:tituloclientes) {
					
						if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tituloclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tituloclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tituloclienteAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTituloCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTituloClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTituloCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTituloCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTituloCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTituloCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTituloCliente(conSplash);
				
					this.generarReporteTituloClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTituloClientesSeleccionados();
				//this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTituloClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTituloClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTituloCliente();
				
				this.exportarTituloClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTituloClientes();
				//this.importarTituloClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTituloCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTituloClientesSeleccionados();
				//this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Comercial Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTituloCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTituloCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTituloCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(TituloClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTituloCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTituloCliente(conSplash);
					
						//this.actualizarParametrosGeneralTituloCliente();
						
						this.generarReporteProcesoAccionTituloClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TituloClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Comercial ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Comercial Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTituloCliente();
				
						this.actualizarParametrosGeneralTituloCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tituloclienteReturnGeneral=tituloclienteLogic.procesarAccionTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tituloclienteLogic.getTituloClientes(),this.tituloclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTituloClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTituloCliente();
					
					TituloClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTituloClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTituloCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTituloCliente.jComboBoxTiposAccionesFormularioTituloCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTituloCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTituloClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTituloCliente();
			
			if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
			TituloCliente titulocliente=new TituloCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTituloCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTituloCliente.getSelectedItem();
			
			
			
			
			tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tituloclientesSeleccionados.size()==1) {
				for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
					titulocliente=tituloclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,titulocliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTituloCliente();
			
      		//this.finishProcessTituloCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTituloClienteReturnGeneral() throws Exception {
		if(this.tituloclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tituloclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tituloclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tituloclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tituloclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tituloclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTituloCliente(false);
		}
		
		if(this.tituloclienteReturnGeneral.getConRetornoLista() || this.tituloclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tituloclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tituloclienteLogic.setTituloClientes(this.tituloclienteReturnGeneral.getTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tituloclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tituloclienteLogic.setTituloCliente(this.tituloclienteReturnGeneral.getTituloCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTituloCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTituloCliente() throws Exception {
		
		
	}
	
	public ArrayList<TituloCliente> getTituloClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTituloCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TituloCliente tituloclienteAux:tituloclienteLogic.getTituloClientes()) {
					if(tituloclienteAux.getIsSelected()) {
						tituloclientesSeleccionados.add(tituloclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TituloCliente tituloclienteAux:this.tituloclientes) {
					if(tituloclienteAux.getIsSelected()) {
						tituloclientesSeleccionados.add(tituloclienteAux);				
					}
				}
			}
			
			if(tituloclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tituloclientesSeleccionados.addAll(this.tituloclienteLogic.getTituloClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tituloclientesSeleccionados.addAll(this.tituloclientes);				
					}
				}
			}
		} else {
			tituloclientesSeleccionados.add(this.titulocliente);
		}
		
		return tituloclientesSeleccionados;
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
	
	public void generarReporteTituloClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTituloClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTituloClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTituloClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTituloClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTituloClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Comercial Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTituloClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTituloCliente();
		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTituloCliente();
		
		
		//this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados ,tituloclienteImplementable,tituloclienteImplementableHome);
	}
	
	public void mostrarImportacionTituloClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTituloCliente();
		
		this.abrirFrameImportacionTituloCliente();		
		
			
		//this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados ,tituloclienteImplementable,tituloclienteImplementableHome);
	}
	
	public void importarTituloClientes() throws Exception {		
	
	}
	
	public void exportarTituloClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTituloClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTituloClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTituloClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Comercial Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTituloCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTituloCliente(tituloclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tituloclienteAux.setsDetalleGeneralEntityReporte(tituloclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTituloCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TituloClienteConstantesFunciones.LABEL_SIGLAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTituloCliente(TituloCliente titulocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=titulocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=titulocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=titulocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=titulocliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=titulocliente.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=titulocliente.getsiglas();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TituloClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTituloCliente(row);				
				iRow++;
			}				
			
			for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTituloCliente(tituloclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTituloClientesSeleccionados() throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();		
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"titulocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tituloclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("titulocliente");
			//elementRoot.appendChild(element);
		
			for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
				element = document.createElement("titulocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTituloCliente(tituloclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comercial Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTituloCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TituloClienteConstantesFunciones.LABEL_SIGLAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTituloCliente(TituloCliente titulocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(titulocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(titulocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(titulocliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(titulocliente.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(titulocliente.getsiglas());				
	}
	
	public void setFilaDatosExportarXmlTituloCliente(TituloCliente titulocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TituloClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(titulocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TituloClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(titulocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TituloClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(titulocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TituloClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(titulocliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TituloClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(titulocliente.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(TituloClienteConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(titulocliente.getsiglas().trim()));
		element.appendChild(elementsiglas);
	}
	
	public void generarReporteGroupGenericoTituloClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TituloCliente> tituloclientesSeleccionados=new ArrayList<TituloCliente>();
		
		tituloclientesSeleccionados=this.getTituloClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTituloCliente(tituloclientesSeleccionados);
		
		this.generarReporteTituloClientes("Todos",tituloclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTituloCliente(ArrayList<TituloCliente> tituloclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TituloCliente tituloclienteAux:tituloclientesSeleccionados) {
				tituloclienteAux.setsDetalleGeneralEntityReporte(tituloclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tituloclienteAux.setsDescripcionGeneralEntityReporte1(tituloclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tituloclienteAux.setsDescripcionGeneralEntityReporte1(tituloclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tituloclienteAux.setsDescripcionGeneralEntityReporte1(tituloclienteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TituloClienteConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					tituloclienteAux.setsDescripcionGeneralEntityReporte1(tituloclienteAux.getsiglas());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTituloCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTituloCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTituloCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTituloCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=true;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=true;
			this.isVisibilidadCeldaEliminarTituloCliente=true;
			this.isVisibilidadCeldaCancelarTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=true;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=true;
			this.isVisibilidadCeldaModificarTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
			this.isVisibilidadCeldaModificarTituloCliente=true;
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
			this.isVisibilidadCeldaCancelarTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTituloCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TituloClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=true;
		} else {
			this.actualizarEstadoPanelsTituloCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTituloCliente=false;
			//this.isVisibilidadCeldaVerFormTituloCliente=false;
			this.isVisibilidadCeldaDuplicarTituloCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tituloclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tituloclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;												
			}
			
			this.jButtonCerrarTituloCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTituloCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.titulocliente)) {
			this.isVisibilidadCeldaActualizarTituloCliente=false;
			this.isVisibilidadCeldaEliminarTituloCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTituloCliente() {
		this.isVisibilidadCeldaNuevoTituloCliente=false;
		this.isVisibilidadCeldaGuardarCambiosTituloCliente=false;
	}
	
	public void actualizarEstadoPanelsTituloCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTituloCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTituloCliente!=null) {
				this.jScrollPanelDatosTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTituloCliente!=null) {
				this.jPanelPaginacionTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTituloCliente!=null) {
					this.jTabbedPaneBusquedasTituloCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTituloCliente!=null) {
				this.jTabbedPaneBusquedasTituloCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTituloCliente!=null) {
				this.jPanelParametrosReportesTituloCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTituloCliente.remove(jPanelBusquedaPorCodigoTituloCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTituloCliente.remove(jPanelBusquedaPorNombreTituloCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasTituloCliente.remove(jPanelBusquedaPorSiglasTituloCliente);}
		}
		
	}
	
	

	public String registrarSesionTituloClienteParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tituloclienteSessionBean==null) {
				this.tituloclienteSessionBean=new TituloClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setsPathNavegacionActual(tituloclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TituloClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTituloCliente(true);
			this.jInternalFrameDetalleFormTituloCliente.clienteSessionBean.setlidTituloClienteActual(this.idTituloClienteActual);

			tituloclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTituloCliente(true);
			tituloclienteSessionBean.setlIdTituloClienteActualForeignKey(this.idTituloClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TituloClienteSessionBean tituloclienteSessionBean=new TituloClienteSessionBean();
		
		if(this.tituloclienteSessionBean==null) {
			this.tituloclienteSessionBean=new TituloClienteSessionBean();
		}
		
		this.tituloclienteSessionBean.setsUltimaBusquedaTituloCliente(this.getsAccionBusqueda());
		this.tituloclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tituloclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tituloclienteSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tituloclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
			tituloclienteSessionBean.setsiglas(this.getsiglasBusquedaPorSiglas());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tituloclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TituloClienteSessionBean tituloclienteSessionBean=new TituloClienteSessionBean();
		
		if(this.tituloclienteSessionBean==null) {
			this.tituloclienteSessionBean=new TituloClienteSessionBean();
		}
		
		if(this.tituloclienteSessionBean.getsUltimaBusquedaTituloCliente()!=null&&!this.tituloclienteSessionBean.getsUltimaBusquedaTituloCliente().equals("")) {
			this.setsAccionBusqueda(tituloclienteSessionBean.getsUltimaBusquedaTituloCliente());
			this.setiNumeroPaginacion(tituloclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tituloclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tituloclienteSessionBean.getcodigo());
				tituloclienteSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tituloclienteSessionBean.getnombre());
				tituloclienteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
				this.setsiglasBusquedaPorSiglas(tituloclienteSessionBean.getsiglas());
				tituloclienteSessionBean.setsiglas("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tituloclienteSessionBean.getid_empresa());
				tituloclienteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tituloclienteSessionBean.setsUltimaBusquedaTituloCliente("");
		this.tituloclienteSessionBean.setiNumeroPaginacion(TituloClienteConstantesFunciones.INUMEROPAGINACION);
		this.tituloclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTituloCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTituloCliente() {
		this.updateBorderResaltarBusquedasFormularioTituloCliente();
		this.updateVisibilidadBusquedasFormularioTituloCliente();
		this.updateHabilitarBusquedasFormularioTituloCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTituloCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTituloCliente.getComponents().length>0) {
	

		if(this.tituloclienteConstantesFunciones.resaltarBusquedaPorCodigoTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorCodigoTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorCodigoTituloCliente);
			}
		}

		if(this.tituloclienteConstantesFunciones.resaltarBusquedaPorNombreTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorNombreTituloCliente);
			}
		}

		if(this.tituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTituloCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTituloCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTituloCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorCodigoTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tituloclienteConstantesFunciones.mostrarBusquedaPorCodigoTituloCliente);
			if(!this.tituloclienteConstantesFunciones.mostrarBusquedaPorCodigoTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTituloCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tituloclienteConstantesFunciones.mostrarBusquedaPorNombreTituloCliente);
			if(!this.tituloclienteConstantesFunciones.mostrarBusquedaPorNombreTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTituloCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tituloclienteConstantesFunciones.mostrarBusquedaPorSiglasTituloCliente);
			if(!this.tituloclienteConstantesFunciones.mostrarBusquedaPorSiglasTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTituloCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTituloCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTituloCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorCodigoTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tituloclienteConstantesFunciones.activarBusquedaPorCodigoTituloCliente);
				this.jTabbedPaneBusquedasTituloCliente.setEnabledAt(index,this.tituloclienteConstantesFunciones.activarBusquedaPorCodigoTituloCliente);
			}

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tituloclienteConstantesFunciones.activarBusquedaPorNombreTituloCliente);
				this.jTabbedPaneBusquedasTituloCliente.setEnabledAt(index,this.tituloclienteConstantesFunciones.activarBusquedaPorNombreTituloCliente);
			}

			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tituloclienteConstantesFunciones.activarBusquedaPorSiglasTituloCliente);
				this.jTabbedPaneBusquedasTituloCliente.setEnabledAt(index,this.tituloclienteConstantesFunciones.activarBusquedaPorSiglasTituloCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTituloCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorCodigoTituloCliente);

			this.jTabbedPaneBusquedasTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);

			this.tituloclienteConstantesFunciones.setResaltarBusquedaPorCodigoTituloCliente(resaltar);

			jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorCodigoTituloCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTituloCliente);

			this.jTabbedPaneBusquedasTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);

			this.tituloclienteConstantesFunciones.setResaltarBusquedaPorNombreTituloCliente(resaltar);

			jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorNombreTituloCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSiglas")) {
			index= this.jTabbedPaneBusquedasTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTituloCliente);

			this.jTabbedPaneBusquedasTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTituloCliente.getComponent(index);

			this.tituloclienteConstantesFunciones.setResaltarBusquedaPorSiglasTituloCliente(resaltar);

			jPanel.setBorder(this.tituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTituloCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTituloCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTituloCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTituloCliente();
		this.updateVisibilidadResaltarControlesFormularioTituloCliente();
		this.updateHabilitarResaltarControlesFormularioTituloCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTituloCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tituloclienteConstantesFunciones.resaltaridTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente!=null) {this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setBorder(this.tituloclienteConstantesFunciones.resaltaridTituloCliente);}
		if(this.tituloclienteConstantesFunciones.resaltarid_empresaTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente!=null) {this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setBorder(this.tituloclienteConstantesFunciones.resaltarid_empresaTituloCliente);}
		if(this.tituloclienteConstantesFunciones.resaltarcodigoTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente!=null) {this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setBorder(this.tituloclienteConstantesFunciones.resaltarcodigoTituloCliente);}
		if(this.tituloclienteConstantesFunciones.resaltarnombreTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente!=null) {this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setBorder(this.tituloclienteConstantesFunciones.resaltarnombreTituloCliente);}
		if(this.tituloclienteConstantesFunciones.resaltarsiglasTituloCliente!=null && this.jInternalFrameDetalleFormTituloCliente!=null) {this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setBorder(this.tituloclienteConstantesFunciones.resaltarsiglasTituloCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTituloCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
	
		//this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostraridTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jPanelidTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostraridTituloCliente);
		//this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarid_empresaTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jPanelid_empresaTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarid_empresaTituloCliente);
		//this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarcodigoTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jPanelcodigoTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarcodigoTituloCliente);
		//this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarnombreTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jPanelnombreTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarnombreTituloCliente);
		//this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarsiglasTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jPanelsiglasTituloCliente.setVisible(this.tituloclienteConstantesFunciones.mostrarsiglasTituloCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTituloCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTituloCliente!=null) {
	
		this.jInternalFrameDetalleFormTituloCliente.jLabelidTituloCliente.setEnabled(this.tituloclienteConstantesFunciones.activaridTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jComboBoxid_empresaTituloCliente.setEnabled(this.tituloclienteConstantesFunciones.activarid_empresaTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jTextFieldcodigoTituloCliente.setEnabled(this.tituloclienteConstantesFunciones.activarcodigoTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jTextAreanombreTituloCliente.setEnabled(this.tituloclienteConstantesFunciones.activarnombreTituloCliente);
		this.jInternalFrameDetalleFormTituloCliente.jTextFieldsiglasTituloCliente.setEnabled(this.tituloclienteConstantesFunciones.activarsiglasTituloCliente);
		}
	}
	
		
}