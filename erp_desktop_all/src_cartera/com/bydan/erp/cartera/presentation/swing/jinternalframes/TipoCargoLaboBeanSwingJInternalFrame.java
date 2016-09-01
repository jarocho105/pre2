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

import com.bydan.erp.cartera.util.TipoCargoLaboConstantesFunciones;
import com.bydan.erp.cartera.util.TipoCargoLaboParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoCargoLaboParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoCargoLaboBean;
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
public class TipoCargoLaboBeanSwingJInternalFrame extends TipoCargoLaboJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCargoLaboBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCargoLabo> tipocargolaboValidator = new ClassValidator<TipoCargoLabo>(TipoCargoLabo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCargoLabo tipocargolabo;	
	public TipoCargoLabo tipocargolaboAux;
	public TipoCargoLabo tipocargolaboAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCargoLabo tipocargolaboTotales;
	public Long idTipoCargoLaboActual;
	public Long iIdNuevoTipoCargoLabo=0L;
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
	
	public Boolean isPermisoTodoTipoCargoLabo;
	public Boolean isPermisoNuevoTipoCargoLabo;
	public Boolean isPermisoActualizarTipoCargoLabo;
	public Boolean isPermisoActualizarOriginalTipoCargoLabo;
	public Boolean isPermisoEliminarTipoCargoLabo;
	public Boolean isPermisoGuardarCambiosTipoCargoLabo;
	public Boolean isPermisoConsultaTipoCargoLabo;
	public Boolean isPermisoBusquedaTipoCargoLabo;
	public Boolean isPermisoReporteTipoCargoLabo;
	public Boolean isPermisoPaginacionMedioTipoCargoLabo;
	public Boolean isPermisoPaginacionAltoTipoCargoLabo;
	public Boolean isPermisoPaginacionTodoTipoCargoLabo;
	public Boolean isPermisoCopiarTipoCargoLabo;
	public Boolean isPermisoVerFormTipoCargoLabo;
	public Boolean isPermisoDuplicarTipoCargoLabo;
	public Boolean isPermisoOrdenTipoCargoLabo;
	
	
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
	
	public TipoCargoLaboParameterReturnGeneral tipocargolaboReturnGeneral;
	public TipoCargoLaboParameterReturnGeneral tipocargolaboParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCargoLabo=false;
	public Boolean esParaAccionDesdeFormularioTipoCargoLabo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCargoLaboLogic tipocargolaboLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCargoLabo tipocargolaboBean;
	public TipoCargoLaboConstantesFunciones tipocargolaboConstantesFunciones;
	//public TipoCargoLaboParameterReturnGeneral tipocargolaboReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCargoLabo> tipocargolabos;	
	//public List<TipoCargoLabo> tipocargolabosEliminados;
	//public List<TipoCargoLabo> tipocargolabosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCargoLabo=true;
	public Boolean isVisibilidadCeldaCopiarTipoCargoLabo=true;
	public Boolean isVisibilidadCeldaVerFormTipoCargoLabo=true;
	public Boolean isVisibilidadCeldaOrdenTipoCargoLabo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaModificarTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaActualizarTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaEliminarTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaCancelarTipoCargoLabo=false;
	public Boolean isVisibilidadCeldaGuardarTipoCargoLabo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCargoLabo() {
		return this.iIdNuevoTipoCargoLabo;
	}

	public void setiIdNuevoTipoCargoLabo(Long iIdNuevoTipoCargoLabo) {
		this.iIdNuevoTipoCargoLabo = iIdNuevoTipoCargoLabo;
	}
	
	public Long getidTipoCargoLaboActual() {
		return this.idTipoCargoLaboActual;
	}

	public void setidTipoCargoLaboActual(Long idTipoCargoLaboActual) {
		this.idTipoCargoLaboActual = idTipoCargoLaboActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCargoLabo gettipocargolabo() {
		return this.tipocargolabo;
	}

	public void settipocargolabo(TipoCargoLabo tipocargolabo) {
		this.tipocargolabo = tipocargolabo;
	}
	
	public TipoCargoLabo gettipocargolaboAux() {
		return this.tipocargolaboAux;
	}

	public void settipocargolaboAux(TipoCargoLabo tipocargolaboAux) {
		this.tipocargolaboAux = tipocargolaboAux;
	}				
	
	public TipoCargoLabo gettipocargolaboAnterior() {
		return this.tipocargolaboAnterior;
	}

	public void settipocargolaboAnterior(TipoCargoLabo tipocargolaboAnterior) {
		this.tipocargolaboAnterior = tipocargolaboAnterior;
	}	
	
	public TipoCargoLabo gettipocargolaboTotales() {
		return this.tipocargolaboTotales;
	}

	public void settipocargolaboTotales(TipoCargoLabo tipocargolaboTotales) {
		this.tipocargolaboTotales = tipocargolaboTotales;
	}	
	
	public TipoCargoLabo gettipocargolaboBean() {
		return this.tipocargolaboBean;
	}

	public void settipocargolaboBean(TipoCargoLabo tipocargolaboBean) {
		this.tipocargolaboBean = tipocargolaboBean;
	}	
	
	public TipoCargoLaboParameterReturnGeneral gettipocargolaboReturnGeneral() {
		return this.tipocargolaboReturnGeneral;
	}

	public void settipocargolaboReturnGeneral(TipoCargoLaboParameterReturnGeneral tipocargolaboReturnGeneral) {
		this.tipocargolaboReturnGeneral = tipocargolaboReturnGeneral;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCargoLaboLogic getTipoCargoLaboLogic()	{		
		return tipocargolaboLogic;
	}

	public void setTipoCargoLaboLogic(TipoCargoLaboLogic tipocargolaboLogic) {
		this.tipocargolaboLogic = tipocargolaboLogic;
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
	
	public Boolean getIsEsNuevoTipoCargoLabo() {
		return isEsNuevoTipoCargoLabo;
	}

	public void setIsEsNuevoTipoCargoLabo(Boolean isEsNuevoTipoCargoLabo) {
		this.isEsNuevoTipoCargoLabo = isEsNuevoTipoCargoLabo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCargoLabo() {
		return esParaAccionDesdeFormularioTipoCargoLabo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCargoLabo(Boolean esParaAccionDesdeFormularioTipoCargoLabo) {
		this.esParaAccionDesdeFormularioTipoCargoLabo = esParaAccionDesdeFormularioTipoCargoLabo;
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

			if(this.tipocargolaboSessionBean==null) {
				this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
			}

			if(!this.tipocargolaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocargolaboSessionBean.getlidEmpresaActual());
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

					if(this.tipocargolabo!=null) {
						this.tipocargolabo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
						this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCargoLabo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
						if(this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCargoLaboGenerico)throws Exception
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
				jComboBoxid_empresaTipoCargoLaboGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCargoLaboGenerico!=null && jComboBoxid_empresaTipoCargoLaboGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCargoLaboGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCargoLabo tipocargolabo,JComboBox jComboBoxid_empresaTipoCargoLaboGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCargoLaboGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCargoLaboGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocargolabo.setid_empresa(empresaAux.getId());
				tipocargolabo.setempresa_descripcion(TipoCargoLaboConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocargolabo.setEmpresa(empresaAux);			}
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

					if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { 
							this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { 
					}

					if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
							this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
							this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCargoLabo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCargoLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoCargoLabo(this.tipocargolaboLogic.getTipoCargoLabos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCargoLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoCargoLabo(this.tipocargolabos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocargolaboLogic.setTipoCargoLabos(this.tipocargolabos);
			tipocargolaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCargoLaboParameterReturnGeneral getTipoCargoLaboParameterGeneral() {
		return this.tipocargolaboParameterGeneral;
	}
	
	public void setTipoCargoLaboParameterGeneral(TipoCargoLaboParameterReturnGeneral tipocargolaboParameterGeneral) {
		this.tipocargolaboParameterGeneral = tipocargolaboParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCargoLabo() {
		return isPermisoTodoTipoCargoLabo;
	}

	public void setIsPermisoTodoTipoCargoLabo(Boolean isPermisoTodoTipoCargoLabo) {
		this.isPermisoTodoTipoCargoLabo = isPermisoTodoTipoCargoLabo;
	}

	public Boolean getIsPermisoNuevoTipoCargoLabo() {
		return isPermisoNuevoTipoCargoLabo;
	}

	public void setIsPermisoNuevoTipoCargoLabo(Boolean isPermisoNuevoTipoCargoLabo) {
		this.isPermisoNuevoTipoCargoLabo = isPermisoNuevoTipoCargoLabo;
	}

	public Boolean getIsPermisoActualizarTipoCargoLabo() {
		return isPermisoActualizarTipoCargoLabo;
	}

	public void setIsPermisoActualizarTipoCargoLabo(Boolean isPermisoActualizarTipoCargoLabo) {
		this.isPermisoActualizarTipoCargoLabo = isPermisoActualizarTipoCargoLabo;
	}

	public Boolean getIsPermisoEliminarTipoCargoLabo() {
		return isPermisoEliminarTipoCargoLabo;
	}

	public void setIsPermisoEliminarTipoCargoLabo(Boolean isPermisoEliminarTipoCargoLabo) {
		this.isPermisoEliminarTipoCargoLabo = isPermisoEliminarTipoCargoLabo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCargoLabo() {
		return isPermisoGuardarCambiosTipoCargoLabo;
	}

	public void setIsPermisoGuardarCambiosTipoCargoLabo(Boolean isPermisoGuardarCambiosTipoCargoLabo) {
		this.isPermisoGuardarCambiosTipoCargoLabo = isPermisoGuardarCambiosTipoCargoLabo;
	}
	
	public Boolean getIsPermisoConsultaTipoCargoLabo() {
		return isPermisoConsultaTipoCargoLabo;
	}

	public void setIsPermisoConsultaTipoCargoLabo(Boolean isPermisoConsultaTipoCargoLabo) {
		this.isPermisoConsultaTipoCargoLabo = isPermisoConsultaTipoCargoLabo;
	}

	public Boolean getIsPermisoBusquedaTipoCargoLabo() {
		return isPermisoBusquedaTipoCargoLabo;
	}

	public void setIsPermisoBusquedaTipoCargoLabo(Boolean isPermisoBusquedaTipoCargoLabo) {
		this.isPermisoBusquedaTipoCargoLabo = isPermisoBusquedaTipoCargoLabo;
	}

	public Boolean getIsPermisoReporteTipoCargoLabo() {
		return isPermisoReporteTipoCargoLabo;
	}

	public void setIsPermisoReporteTipoCargoLabo(Boolean isPermisoReporteTipoCargoLabo) {
		this.isPermisoReporteTipoCargoLabo = isPermisoReporteTipoCargoLabo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCargoLabo() {
		return isPermisoPaginacionMedioTipoCargoLabo;
	}

	public void setIsPermisoPaginacionMedioTipoCargoLabo(Boolean isPermisoPaginacionMedioTipoCargoLabo) {
		this.isPermisoPaginacionMedioTipoCargoLabo = isPermisoPaginacionMedioTipoCargoLabo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCargoLabo() {
		return isPermisoPaginacionTodoTipoCargoLabo;
	}

	public void setIsPermisoPaginacionTodoTipoCargoLabo(Boolean isPermisoPaginacionTodoTipoCargoLabo) {
		this.isPermisoPaginacionTodoTipoCargoLabo = isPermisoPaginacionTodoTipoCargoLabo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCargoLabo() {
		return isPermisoPaginacionAltoTipoCargoLabo;
	}

	public void setIsPermisoPaginacionAltoTipoCargoLabo(Boolean isPermisoPaginacionAltoTipoCargoLabo) {
		this.isPermisoPaginacionAltoTipoCargoLabo = isPermisoPaginacionAltoTipoCargoLabo;
	}
	
	public Boolean getIsPermisoCopiarTipoCargoLabo() {
		return isPermisoCopiarTipoCargoLabo;
	}

	public void setIsPermisoCopiarTipoCargoLabo(Boolean isPermisoCopiarTipoCargoLabo) {
		this.isPermisoCopiarTipoCargoLabo = isPermisoCopiarTipoCargoLabo;
	}
	
	public Boolean getIsPermisoVerFormTipoCargoLabo() {
		return isPermisoVerFormTipoCargoLabo;
	}

	public void setIsPermisoVerFormTipoCargoLabo(Boolean isPermisoVerFormTipoCargoLabo) {
		this.isPermisoVerFormTipoCargoLabo = isPermisoVerFormTipoCargoLabo;
	}
	
	public Boolean getIsPermisoDuplicarTipoCargoLabo() {
		return isPermisoDuplicarTipoCargoLabo;
	}

	public void setIsPermisoDuplicarTipoCargoLabo(Boolean isPermisoDuplicarTipoCargoLabo) {
		this.isPermisoDuplicarTipoCargoLabo = isPermisoDuplicarTipoCargoLabo;
	}
	
	public Boolean getIsPermisoOrdenTipoCargoLabo() {
		return isPermisoOrdenTipoCargoLabo;
	}

	public void setIsPermisoOrdenTipoCargoLabo(Boolean isPermisoOrdenTipoCargoLabo) {
		this.isPermisoOrdenTipoCargoLabo = isPermisoOrdenTipoCargoLabo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCargoLabo() {
		return isVisibilidadCeldaNuevoTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaNuevoTipoCargoLabo(Boolean isVisibilidadCeldaNuevoTipoCargoLabo) {
		this.isVisibilidadCeldaNuevoTipoCargoLabo = isVisibilidadCeldaNuevoTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCargoLabo() {
		return isVisibilidadCeldaDuplicarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCargoLabo(Boolean isVisibilidadCeldaDuplicarTipoCargoLabo) {
		this.isVisibilidadCeldaDuplicarTipoCargoLabo = isVisibilidadCeldaDuplicarTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCargoLabo() {
		return isVisibilidadCeldaCopiarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaCopiarTipoCargoLabo(Boolean isVisibilidadCeldaCopiarTipoCargoLabo) {
		this.isVisibilidadCeldaCopiarTipoCargoLabo = isVisibilidadCeldaCopiarTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCargoLabo() {
		return isVisibilidadCeldaVerFormTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaVerFormTipoCargoLabo(Boolean isVisibilidadCeldaVerFormTipoCargoLabo) {
		this.isVisibilidadCeldaVerFormTipoCargoLabo = isVisibilidadCeldaVerFormTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCargoLabo() {
		return isVisibilidadCeldaOrdenTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaOrdenTipoCargoLabo(Boolean isVisibilidadCeldaOrdenTipoCargoLabo) {
		this.isVisibilidadCeldaOrdenTipoCargoLabo = isVisibilidadCeldaOrdenTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCargoLabo() {
		return isVisibilidadCeldaNuevoRelacionesTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCargoLabo(Boolean isVisibilidadCeldaNuevoRelacionesTipoCargoLabo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo = isVisibilidadCeldaNuevoRelacionesTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCargoLabo() {
		return isVisibilidadCeldaModificarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaModificarTipoCargoLabo(Boolean isVisibilidadCeldaModificarTipoCargoLabo) {
		this.isVisibilidadCeldaModificarTipoCargoLabo = isVisibilidadCeldaModificarTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCargoLabo() {
		return isVisibilidadCeldaActualizarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaActualizarTipoCargoLabo(Boolean isVisibilidadCeldaActualizarTipoCargoLabo) {
		this.isVisibilidadCeldaActualizarTipoCargoLabo = isVisibilidadCeldaActualizarTipoCargoLabo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCargoLabo() {
		return isVisibilidadCeldaEliminarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaEliminarTipoCargoLabo(Boolean isVisibilidadCeldaEliminarTipoCargoLabo) {
		this.isVisibilidadCeldaEliminarTipoCargoLabo = isVisibilidadCeldaEliminarTipoCargoLabo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCargoLabo() {
		return isVisibilidadCeldaCancelarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaCancelarTipoCargoLabo(Boolean isVisibilidadCeldaCancelarTipoCargoLabo) {
		this.isVisibilidadCeldaCancelarTipoCargoLabo = isVisibilidadCeldaCancelarTipoCargoLabo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCargoLabo() {
		return isVisibilidadCeldaGuardarTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaGuardarTipoCargoLabo(Boolean isVisibilidadCeldaGuardarTipoCargoLabo) {
		this.isVisibilidadCeldaGuardarTipoCargoLabo = isVisibilidadCeldaGuardarTipoCargoLabo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCargoLabo() {
		return isVisibilidadCeldaGuardarCambiosTipoCargoLabo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCargoLabo(Boolean isVisibilidadCeldaGuardarCambiosTipoCargoLabo) {
		this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo = isVisibilidadCeldaGuardarCambiosTipoCargoLabo;
	}
		
	public TipoCargoLaboSessionBean gettipocargolaboSessionBean() {
		return this.tipocargolaboSessionBean;
	}
	
	public void settipocargolaboSessionBean(TipoCargoLaboSessionBean tipocargolaboSessionBean) {
		this.tipocargolaboSessionBean=tipocargolaboSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(TipoCargoLabo tipocargolabo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocargolabo,null);
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
	
	public void bugActualizarReferenciaActual(TipoCargoLabo tipocargolabo,TipoCargoLabo tipocargolaboAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCargoLabo(tipocargolabo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocargolaboAux.setId(tipocargolabo.getId());
		tipocargolaboAux.setVersionRow(tipocargolabo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCargoLabo();
		
			int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocargolaboValidator.getInvalidValues(this.tipocargolabo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocargolaboLogic.setDatosCliente(datosCliente);
			tipocargolaboLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocargolaboAux=new  TipoCargoLabo();
				
				tipocargolaboAux.setIsNew(true);
				tipocargolaboAux.setIsChanged(true);
				
				tipocargolaboAux.setTipoCargoLaboOriginal(this.tipocargolabo);
				
				tipocargolaboAux.setId(this.tipocargolabo.getId());	
				tipocargolaboAux.setVersionRow(this.tipocargolabo.getVersionRow());	
				tipocargolaboAux.setid_empresa(this.tipocargolabo.getid_empresa());	
				tipocargolaboAux.setcodigo(this.tipocargolabo.getcodigo());	
				tipocargolaboAux.setnombre(this.tipocargolabo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocargolaboAux,tipocargolaboLogic.getTipoCargoLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargolaboAux,tipocargolabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.saveTipoCargoLabos();//WithConnection
						//tipocargolaboLogic.getSetVersionRowTipoCargoLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocargolabo,tipocargolaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoCargoLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocargolaboAux=new  TipoCargoLabo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocargolaboSessionBean.getEsGuardarRelacionado() && this.tipocargolabo.getId()>=0)) {
						
					tipocargolaboAux.setIsNew(false);
				}
				
				tipocargolaboAux.setIsDeleted(false);
			
				tipocargolaboAux.setId(this.tipocargolabo.getId());	
				tipocargolaboAux.setVersionRow(this.tipocargolabo.getVersionRow());	
				tipocargolaboAux.setid_empresa(this.tipocargolabo.getid_empresa());	
				tipocargolaboAux.setcodigo(this.tipocargolabo.getcodigo());	
				tipocargolaboAux.setnombre(this.tipocargolabo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocargolaboAux,tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargolaboAux,tipocargolabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.saveTipoCargoLabos();//WithConnection
						//tipocargolaboLogic.getSetVersionRowTipoCargoLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocargolabo,tipocargolaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoCargoLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocargolaboAux=new  TipoCargoLabo();
				
				tipocargolaboAux.setIsNew(false);
				tipocargolaboAux.setIsChanged(false);
				
				tipocargolaboAux.setIsDeleted(true);
				
				tipocargolaboAux.setId(this.tipocargolabo.getId());	
				tipocargolaboAux.setVersionRow(this.tipocargolabo.getVersionRow());	
				tipocargolaboAux.setid_empresa(this.tipocargolabo.getid_empresa());	
				tipocargolaboAux.setcodigo(this.tipocargolabo.getcodigo());	
				tipocargolaboAux.setnombre(this.tipocargolabo.getnombre());	
				
				if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocargolaboAux.getId()>=0) {	
						this.tipocargolabosEliminados.add(tipocargolaboAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocargolaboAux,tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargolaboAux,tipocargolabos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.saveTipoCargoLabos();//WithConnection
						//tipocargolaboLogic.getSetVersionRowTipoCargoLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargolaboAux.setClientes(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocargolaboAux,tipocargolaboLogic.getTipoCargoLabos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocargolaboAux,tipocargolabos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getTipoCargoLabos().addAll(this.tipocargolabosEliminados);
					
					tipocargolaboLogic.saveTipoCargoLabos();//WithConnection
					//tipocargolaboLogic.getSetVersionRowTipoCargoLabos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCargoLabo();
				
				this.tipocargolabosEliminados= new ArrayList<TipoCargoLabo>();		
			}
			
			if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cargo Laboral GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocargolabo=tipocargolaboAux;
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
      		//this.finishProcessTipoCargoLabo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCargoLabo tipocargolaboLocal) throws Exception {
		
		if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocargolaboLocal.setClientes(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
			
			} else {
			
				tipocargolaboLocal.setClientes(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCargoLabo tipocargolaboLocal) throws Exception {	
		if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocargolaboLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCargoLaboActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocargolaboValidator.getInvalidValues(this.tipocargolabo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCargoLabo tipocargolabo,List<TipoCargoLabo> tipocargolabos) throws Exception {
		try	{		
			TipoCargoLaboConstantesFunciones.actualizarLista(tipocargolabo,tipocargolabos,this.tipocargolaboSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCargoLabo tipocargolabo,List<TipoCargoLabo> tipocargolabos) throws Exception {
		try	{			
			TipoCargoLaboConstantesFunciones.actualizarSelectedLista(tipocargolabo,tipocargolabos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCargoLabo> tipocargolabosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocargolabosLocal=this.tipocargolaboLogic.getTipoCargoLabos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocargolabosLocal=this.tipocargolabos;
			}
			//ARCHITECTURE
		
			for(TipoCargoLabo tipocargolaboLocal:tipocargolabosLocal) {
				if(this.permiteMantenimiento(tipocargolaboLocal) && tipocargolaboLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCargoLaboConstantesFunciones.getTipoCargoLaboLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCargoLaboConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelid_empresaTipoCargoLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCargoLaboConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelcodigoTipoCargoLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCargoLaboConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelnombreTipoCargoLabo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelid_empresaTipoCargoLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelcodigoTipoCargoLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelnombreTipoCargoLabo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.tipocargolabo==null) {
				this.tipocargolabo= new TipoCargoLabo();
			}

			if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCargoLabo
				this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);

				this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.getcliente().setTipoCargoLabo(this.tipocargolabo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCargoLabo--;	
		
		
		this.tipocargolaboAux=new TipoCargoLabo();
		
		this.tipocargolaboAux.setId(this.iIdNuevoTipoCargoLabo);
		this.tipocargolaboAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocargolaboLogic.getTipoCargoLabos().add(this.tipocargolaboAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocargolabos.add(this.tipocargolaboAux);
		}
		//ARCHITECTURE
		
		this.tipocargolabo=this.tipocargolaboAux;
		
		if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCargoLabo(this.tipocargolabo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCargoLabo(this.tipocargolabo);
		}
				
		//this.setDefaultControlesTipoCargoLabo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCargoLabo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCargoLabo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargoLabo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCargoLabo(this.tipocargolaboBean,this.tipocargolabo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCargoLaboConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
			classes=TipoCargoLaboConstantesFunciones.getClassesRelationshipsOfTipoCargoLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocargolaboReturnGeneral=tipocargolaboLogic.procesarEventosTipoCargoLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargolaboLogic.getTipoCargoLabos(),this.tipocargolabo,this.tipocargolaboParameterGeneral,this.isEsNuevoTipoCargoLabo,classes);//this.tipocargolaboLogic.getTipoCargoLabo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCargoLabo(this.tipocargolaboReturnGeneral,this.tipocargolaboBean,false);
		
		if(this.tipocargolaboReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo());
		}
		
		if(this.tipocargolaboReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo(),classes);//this.tipocargolaboBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCargoLabo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCargoLabo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCargoLabo(false);
						
			if(tipocargolaboSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargoLabo();
			}
			
			this.actualizarVisualTableDatosTipoCargoLabo();
			
			this.jTableDatosTipoCargoLabo.setRowSelectionInterval(this.getIndiceNuevoTipoCargoLabo(), this.getIndiceNuevoTipoCargoLabo());
			
			this.seleccionarFilaTablaTipoCargoLaboActual();
						
			this.actualizarEstadoCeldasBotonesTipoCargoLabo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCargoLabo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setEnabled(isHabilitar && this.tipocargolaboConstantesFunciones.activarcodigoTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setEnabled(isHabilitar && this.tipocargolaboConstantesFunciones.activarnombreTipoCargoLabo);	
		//
		this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setEnabled(isHabilitar && this.tipocargolaboConstantesFunciones.activarid_empresaTipoCargoLabo);
	};
	
	public void setDefaultControlesTipoCargoLabo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCargoLabo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocargolaboSessionBean.setConGuardarRelaciones(true);			
			this.tipocargolaboSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocargolaboSessionBean.setConGuardarRelaciones(false);			
			this.tipocargolaboSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCargoLabo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
				if(tipocargolaboAux.getId().equals(this.iIdNuevoTipoCargoLabo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolabos) {
				if(tipocargolaboAux.getId().equals(this.iIdNuevoTipoCargoLabo)) {
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
	
	public int getIndiceActualTipoCargoLabo(TipoCargoLabo tipocargolabo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
				if(tipocargolaboAux.getId().equals(tipocargolabo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolabos) {
				if(tipocargolaboAux.getId().equals(tipocargolabo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCargoLabo(TipoCargoLabo tipocargolaboOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
				if(tipocargolaboAux.getTipoCargoLaboOriginal().getId().equals(tipocargolaboOriginal.getId())) {
					existe=true;
					tipocargolaboOriginal.setId(tipocargolaboAux.getId());
					tipocargolaboOriginal.setVersionRow(tipocargolaboAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargoLabo tipocargolaboAux:this.tipocargolabos) {
				if(tipocargolaboAux.getTipoCargoLaboOriginal().getId().equals(tipocargolaboOriginal.getId())) {
					existe=true;
					tipocargolaboOriginal.setId(tipocargolaboAux.getId());
					tipocargolaboOriginal.setVersionRow(tipocargolaboAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCargoLabo(Boolean esParaCancelar) throws Exception {
		tipocargolabosAux=new ArrayList<TipoCargoLabo>();
		tipocargolaboAux=new TipoCargoLabo();
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
					if(tipocargolaboAux.getId()<0) {
						tipocargolabosAux.add(tipocargolaboAux);
					}		
				}
				this.iIdNuevoTipoCargoLabo=0L;
				this.tipocargolaboLogic.getTipoCargoLabos().removeAll(tipocargolabosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargoLabo tipocargolaboAux:this.tipocargolabos) {
					if(tipocargolaboAux.getId()<0) {
						tipocargolabosAux.add(tipocargolaboAux);
					}		
				}
				this.iIdNuevoTipoCargoLabo=0L;
				this.tipocargolabos.removeAll(tipocargolabosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCargoLabo 
					&& this.tipocargolaboLogic.getTipoCargoLabos().size()>0
					) {
					tipocargolaboAux=this.tipocargolaboLogic.getTipoCargoLabos().get(this.tipocargolaboLogic.getTipoCargoLabos().size() - 1);
				
					if(tipocargolaboAux.getId()<0) {
						this.tipocargolaboLogic.getTipoCargoLabos().remove(tipocargolaboAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCargoLabo && this.tipocargolabos.size()>0) {
					tipocargolaboAux=this.tipocargolabos.get(this.tipocargolabos.size() - 1);
				
					if(tipocargolaboAux.getId()<0) {
						this.tipocargolabos.remove(tipocargolaboAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCargoLabo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocargolabo.getId()<0) {
				this.tipocargolaboLogic.getTipoCargoLabos().remove(this.tipocargolabo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocargolabo.getId()<0) {
				this.tipocargolabos.remove(this.tipocargolabo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCargoLabo(List<TipoCargoLabo> tipocargolabosAux) throws Exception {
		TipoCargoLaboConstantesFunciones.setEstadosInicialesTipoCargoLabo(tipocargolabosAux);
	}
	
	public void setEstadosInicialesTipoCargoLabo(TipoCargoLabo tipocargolaboAux) throws Exception {
		TipoCargoLaboConstantesFunciones.setEstadosInicialesTipoCargoLabo(tipocargolaboAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCargoLaboActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCargoLaboActual()) {
				if(!this.isEsNuevoTipoCargoLabo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCargoLabo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCargoLaboActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cargo Laboral ?", "MANTENIMIENTO DE Tipo Cargo Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCargoLabo tipocargolabo) throws Exception {
		TipoCargoLaboConstantesFunciones.seleccionarAsignar(this.tipocargolabo,tipocargolabo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCargoLabo=this.isPermisoActualizarOriginalTipoCargoLabo;
			
			
			this.seleccionarAsignar(tipocargolabo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCargoLaboConstantesFunciones.quitarEspaciosTipoCargoLabo(this.tipocargolabo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCargoLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocargolaboSessionBean.setsFuncionBusquedaRapida(this.tipocargolaboSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCargoLabo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCargoLabo(esParaCancelar);				
				this.cancelarNuevoTipoCargoLabo(esParaCancelar);								
			}
			
			this.tipocargolabo=new TipoCargoLabo();
			
			this.inicializarTipoCargoLabo();
			
			this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCargoLabo() throws Exception {
		try {
			TipoCargoLaboConstantesFunciones.inicializarTipoCargoLabo(this.tipocargolabo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocargolaboLogic.getTipoCargoLabos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCargoLabos(String sAccionBusqueda,List<TipoCargoLabo> tipocargolabosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCargoLabo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCargoLaboMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCargoLaboMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCargoLabo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cargo Laborals");		
		parameters.put("busquedapor", TipoCargoLaboConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoCargoLaboLogic tipocargolaboLogicAuxiliar=new TipoCargoLaboLogic();
					tipocargolaboLogicAuxiliar.setDatosCliente(tipocargolaboLogic.getDatosCliente());				
					tipocargolaboLogicAuxiliar.setTipoCargoLabos(tipocargolabosParaReportes);
					
					tipocargolaboLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCargoLaboWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocargolabosParaReportes=tipocargolaboLogicAuxiliar.getTipoCargoLabos();
					
					//tipocargolaboLogic.getNewConnexionToDeep();
					
					//for (TipoCargoLabo tipocargolabo:tipocargolabosParaReportes) {
					//	tipocargolaboLogic.deepLoad(tipocargolabo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocargolaboLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocargolaboLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCargoLabo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCargoLaboConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCargoLaboConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCargoLabo=new JRBeanArrayDataSource(TipoCargoLaboJInternalFrame.TraerTipoCargoLaboBeans(tipocargolabosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCargoLabo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCargoLaboConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCargoLaboConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCargoLaboBean.TraerTipoCargoLaboBeans(tipocargolabosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCargoLaboActionPerformed(null);
					//this.generarExcelReporteTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCargoLabos(sAccionBusqueda,sTipoArchivoReporte,tipocargolabosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCargoLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargoLabo> tipocargolabosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargoLabos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCargoLabo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCargoLabo tipocargolabo : tipocargolabosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCargoLaboConstantesFunciones.generarExcelReporteDataTipoCargoLabo("NORMAL",row,workbook,tipocargolabo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCargoLabo(String sTipo,Row row,Workbook workbook) {
		
		TipoCargoLaboConstantesFunciones.generarExcelReporteHeaderTipoCargoLabo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCargoLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargoLabo> tipocargolabosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargoLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCargoLabo tipocargolabo : tipocargolabosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCargoLaboConstantesFunciones.getTipoCargoLaboDescripcion(tipocargolabo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocargolabo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCargoLaboConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocargolabo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocargolabo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCargoLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargoLabo> tipocargolabosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCargoLabo> tipocargolabosRespaldo=null;
		
		classes=TipoCargoLaboConstantesFunciones.getClassesRelationshipsOfTipoCargoLabo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocargolaboLogic.setDatosCliente(this.datosCliente);
		this.tipocargolaboLogic.setDatosDeep(this.datosDeep);
		this.tipocargolaboLogic.setIsConDeep(true);
		
		tipocargolabosRespaldo=this.tipocargolaboLogic.getTipoCargoLabos();
		
		this.tipocargolaboLogic.setTipoCargoLabos(tipocargolabosParaReportes);	
		this.tipocargolaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocargolabosParaReportes=this.tipocargolaboLogic.getTipoCargoLabos();
		this.tipocargolaboLogic.setTipoCargoLabos(tipocargolabosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargoLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCargoLabo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCargoLabo tipocargolabo : tipocargolabosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCargoLabo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCargoLaboConstantesFunciones.generarExcelReporteDataTipoCargoLabo("NORMAL",row,workbook,tipocargolabo,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocargolabo.getClientes()!=null && tipocargolabo.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tipocargolabo.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tipocargolabo.getClientes()) {
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
		cell.setCellValue(TipoCargoLaboConstantesFunciones.getTipoCargoLaboDescripcion(tipocargolabo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCargoLabo() throws Exception {		
		this.startProcessTipoCargoLabo(true);
	}
	
	public void startProcessTipoCargoLabo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCargoLabo ,this.jPanelParametrosReportesTipoCargoLabo, this.jScrollPanelDatosTipoCargoLabo,this.jPanelPaginacionTipoCargoLabo, this.jScrollPanelDatosEdicionTipoCargoLabo, this.jPanelAccionesTipoCargoLabo,this.jPanelAccionesFormularioTipoCargoLabo,this.jmenuBarTipoCargoLabo,this.jmenuBarDetalleTipoCargoLabo,this.jTtoolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCargoLabo=this.jTabbedPaneBusquedasTipoCargoLabo; 
		
		final JPanel jPanelParametrosReportesTipoCargoLabo=this.jPanelParametrosReportesTipoCargoLabo;
		//final JScrollPane jScrollPanelDatosTipoCargoLabo=this.jScrollPanelDatosTipoCargoLabo;
		final JTable jTableDatosTipoCargoLabo=this.jTableDatosTipoCargoLabo;		
		final JPanel jPanelPaginacionTipoCargoLabo=this.jPanelPaginacionTipoCargoLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCargoLabo=this.jScrollPanelDatosEdicionTipoCargoLabo;
		final JPanel jPanelAccionesTipoCargoLabo=this.jPanelAccionesTipoCargoLabo;
		
		JPanel jPanelCamposAuxiliarTipoCargoLabo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCargoLabo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			jPanelCamposAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jPanelCamposTipoCargoLabo;
			jPanelAccionesFormularioAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jPanelAccionesFormularioTipoCargoLabo;
		}
		
		final JPanel jPanelCamposTipoCargoLabo=jPanelCamposAuxiliarTipoCargoLabo;
		final JPanel jPanelAccionesFormularioTipoCargoLabo=jPanelAccionesFormularioAuxiliarTipoCargoLabo;
		
		
		final JMenuBar jmenuBarTipoCargoLabo=this.jmenuBarTipoCargoLabo;
		final JToolBar jTtoolBarTipoCargoLabo=this.jTtoolBarTipoCargoLabo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCargoLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCargoLabo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			jmenuBarDetalleAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jmenuBarDetalleTipoCargoLabo;
			jTtoolBarDetalleAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jTtoolBarDetalleTipoCargoLabo;
		}
		
		final JMenuBar jmenuBarDetalleTipoCargoLabo=jmenuBarDetalleAuxiliarTipoCargoLabo;
		final JToolBar jTtoolBarDetalleTipoCargoLabo=jTtoolBarDetalleAuxiliarTipoCargoLabo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCargoLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCargoLabo;
			processRunnable.jTableDatos=jTableDatosTipoCargoLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoCargoLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCargoLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCargoLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCargoLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCargoLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCargoLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoCargoLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCargoLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCargoLabo ,jPanelParametrosReportesTipoCargoLabo,jTableDatosTipoCargoLabo, /*jScrollPanelDatosTipoCargoLabo,*/jPanelCamposTipoCargoLabo,jPanelPaginacionTipoCargoLabo, /*jScrollPanelDatosEdicionTipoCargoLabo,*/ jPanelAccionesTipoCargoLabo,jPanelAccionesFormularioTipoCargoLabo,jmenuBarTipoCargoLabo,jmenuBarDetalleTipoCargoLabo,jTtoolBarTipoCargoLabo,jTtoolBarDetalleTipoCargoLabo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCargoLabo ,jPanelParametrosReportesTipoCargoLabo, jScrollPanelDatosTipoCargoLabo,jPanelPaginacionTipoCargoLabo, jScrollPanelDatosEdicionTipoCargoLabo, jPanelAccionesTipoCargoLabo,jPanelAccionesFormularioTipoCargoLabo,jmenuBarTipoCargoLabo,jmenuBarDetalleTipoCargoLabo,jTtoolBarTipoCargoLabo,jTtoolBarDetalleTipoCargoLabo);
						
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
	
	public void finishProcessTipoCargoLabo() {// throws Exception 
		this.finishProcessTipoCargoLabo(true);
	}
	
	public void finishProcessTipoCargoLabo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCargoLabo ,this.jPanelParametrosReportesTipoCargoLabo, this.jScrollPanelDatosTipoCargoLabo,this.jPanelPaginacionTipoCargoLabo, this.jScrollPanelDatosEdicionTipoCargoLabo, this.jPanelAccionesTipoCargoLabo,this.jPanelAccionesFormularioTipoCargoLabo,this.jmenuBarTipoCargoLabo,this.jmenuBarDetalleTipoCargoLabo,this.jTtoolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCargoLabo=this.jTabbedPaneBusquedasTipoCargoLabo; 
		
		final JPanel jPanelParametrosReportesTipoCargoLabo=this.jPanelParametrosReportesTipoCargoLabo;
		//final JScrollPane jScrollPanelDatosTipoCargoLabo=this.jScrollPanelDatosTipoCargoLabo;
		final JTable jTableDatosTipoCargoLabo=this.jTableDatosTipoCargoLabo;		
		final JPanel jPanelPaginacionTipoCargoLabo=this.jPanelPaginacionTipoCargoLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCargoLabo=this.jScrollPanelDatosEdicionTipoCargoLabo;
		final JPanel jPanelAccionesTipoCargoLabo=this.jPanelAccionesTipoCargoLabo;
		
		JPanel jPanelCamposAuxiliarTipoCargoLabo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCargoLabo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			jPanelCamposAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jPanelCamposTipoCargoLabo;
			jPanelAccionesFormularioAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jPanelAccionesFormularioTipoCargoLabo;
		}
		
		final JPanel jPanelCamposTipoCargoLabo=jPanelCamposAuxiliarTipoCargoLabo;
		final JPanel jPanelAccionesFormularioTipoCargoLabo=jPanelAccionesFormularioAuxiliarTipoCargoLabo;
		
		
		final JMenuBar jmenuBarTipoCargoLabo=this.jmenuBarTipoCargoLabo;		
		final JToolBar jTtoolBarTipoCargoLabo=this.jTtoolBarTipoCargoLabo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCargoLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCargoLabo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			jmenuBarDetalleAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jmenuBarDetalleTipoCargoLabo;
			jTtoolBarDetalleAuxiliarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jTtoolBarDetalleTipoCargoLabo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCargoLabo=jmenuBarDetalleAuxiliarTipoCargoLabo;
		final JToolBar jTtoolBarDetalleTipoCargoLabo=jTtoolBarDetalleAuxiliarTipoCargoLabo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCargoLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCargoLabo;
			processRunnable.jTableDatos=jTableDatosTipoCargoLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoCargoLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCargoLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCargoLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCargoLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCargoLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCargoLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoCargoLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCargoLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCargoLabo ,jPanelParametrosReportesTipoCargoLabo, jTableDatosTipoCargoLabo,/*jScrollPanelDatosTipoCargoLabo,*/jPanelCamposTipoCargoLabo,jPanelPaginacionTipoCargoLabo, /*jScrollPanelDatosEdicionTipoCargoLabo,*/ jPanelAccionesTipoCargoLabo,jPanelAccionesFormularioTipoCargoLabo,jmenuBarTipoCargoLabo,jmenuBarDetalleTipoCargoLabo,jTtoolBarTipoCargoLabo,jTtoolBarDetalleTipoCargoLabo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCargoLabo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCargoLabo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCargoLabo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCargoLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCargoLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCargoLabo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCargoLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCargoLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCargoLabo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocargolaboConstantesFunciones.getsFinalQueryTipoCargoLabo();
		String  finalQueryPaginacionTodos=this.tipocargolaboConstantesFunciones.getsFinalQueryTipoCargoLabo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCargoLaboConstantesFunciones.getArrayColumnasGlobalesNoTipoCargoLabo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCargoLaboConstantesFunciones.getArrayColumnasGlobalesTipoCargoLabo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCargoLaboConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocargolabosEliminados= new ArrayList<TipoCargoLabo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCargoLabo();
		
				///*TipoCargoLaboSessionBean*/this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
			
			if(this.tipocargolaboSessionBean==null) {
				this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
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
					this.iNumeroPaginacion=TipoCargoLaboConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCargoLaboConstantesFunciones.getClassesForeignKeysOfTipoCargoLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocargolabo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocargolabosAux= new ArrayList<TipoCargoLabo>();
			
				
			tipocargolaboLogic.setDatosCliente(this.datosCliente);
			tipocargolaboLogic.setDatosDeep(this.datosDeep);
			tipocargolaboLogic.setIsConDeep(true);
			
			
			tipocargolaboLogic.getTipoCargoLaboDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocargolaboLogic.getTodosTipoCargoLabos(finalQueryGlobal,pagination);
					
					//tipocargolaboLogic.getTodosTipoCargoLabosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocargolaboLogic.getTipoCargoLabos()==null|| tipocargolaboLogic.getTipoCargoLabos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargolabosAux= new ArrayList<TipoCargoLabo>();
							tipocargolabosAux.addAll(tipocargolaboLogic.getTipoCargoLabos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabosAux= new ArrayList<TipoCargoLabo>();
							tipocargolabosAux.addAll(tipocargolabos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargolaboLogic.getTodosTipoCargoLabos(finalQueryGlobal+"",this.pagination);												
							
							//tipocargolaboLogic.getTodosTipoCargoLabosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCargoLabos("Todos",tipocargolaboLogic.getTipoCargoLabos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargolaboLogic.setTipoCargoLabos(new ArrayList<TipoCargoLabo>());					
							tipocargolaboLogic.getTipoCargoLabos().addAll(tipocargolabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabos=new ArrayList<TipoCargoLabo>();
							tipocargolabos.addAll(tipocargolabosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCargoLabo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCargoLabo=this.idActual;
				
				} else if(this.idTipoCargoLaboActual!=null && this.idTipoCargoLaboActual!=0L) {
					idTipoCargoLabo=idTipoCargoLaboActual;
				}
				
					
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndicePorId(idTipoCargoLabo);
				
				this.tipocargolabos=new ArrayList<TipoCargoLabo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocargolaboLogic.getEntity(idTipoCargoLabo);
					
					//tipocargolaboLogic.getEntityWithConnection(idTipoCargoLabo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.setTipoCargoLabos(new ArrayList<TipoCargoLabo>());
					tipocargolaboLogic.getTipoCargoLabos().add(tipocargolaboLogic.getTipoCargoLabo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocargolabos=new ArrayList<TipoCargoLabo>();
					this.tipocargolabos.add(tipocargolabo);
				}
				
				if(tipocargolaboLogic.getTipoCargoLabo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocargolaboLogic.getTipoCargoLabosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocargolaboLogic.getTipoCargoLabos()==null||tipocargolaboLogic.getTipoCargoLabos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocargolabos==null|| tipocargolabos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolabosAux=new ArrayList<TipoCargoLabo>();
						tipocargolabosAux.addAll(tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabosAux=new ArrayList<TipoCargoLabo>();
							tipocargolabosAux.addAll(tipocargolabos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocargolaboLogic.getTipoCargoLabosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCargoLabos("BusquedaPorCodigo",tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCargoLabos("BusquedaPorCodigo",tipocargolabos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.setTipoCargoLabos(new ArrayList<TipoCargoLabo>());
						tipocargolaboLogic.getTipoCargoLabos().addAll(tipocargolabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabos=new ArrayList<TipoCargoLabo>();
							tipocargolabos.addAll(tipocargolabosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocargolaboLogic.getTipoCargoLabosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocargolaboLogic.getTipoCargoLabos()==null||tipocargolaboLogic.getTipoCargoLabos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocargolabos==null|| tipocargolabos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolabosAux=new ArrayList<TipoCargoLabo>();
						tipocargolabosAux.addAll(tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabosAux=new ArrayList<TipoCargoLabo>();
							tipocargolabosAux.addAll(tipocargolabos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocargolaboLogic.getTipoCargoLabosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCargoLabos("BusquedaPorNombre",tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCargoLabos("BusquedaPorNombre",tipocargolabos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.setTipoCargoLabos(new ArrayList<TipoCargoLabo>());
						tipocargolaboLogic.getTipoCargoLabos().addAll(tipocargolabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabos=new ArrayList<TipoCargoLabo>();
							tipocargolabos.addAll(tipocargolabosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocargolaboLogic.getTipoCargoLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocargolaboLogic.getTipoCargoLabos()==null||tipocargolaboLogic.getTipoCargoLabos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocargolabos==null|| tipocargolabos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolabosAux=new ArrayList<TipoCargoLabo>();
						tipocargolabosAux.addAll(tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabosAux=new ArrayList<TipoCargoLabo>();
							tipocargolabosAux.addAll(tipocargolabos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocargolaboLogic.getTipoCargoLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCargoLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCargoLabos("FK_IdEmpresa",tipocargolaboLogic.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCargoLabos("FK_IdEmpresa",tipocargolabos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboLogic.setTipoCargoLabos(new ArrayList<TipoCargoLabo>());
						tipocargolaboLogic.getTipoCargoLabos().addAll(tipocargolabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolabos=new ArrayList<TipoCargoLabo>();
							tipocargolabos.addAll(tipocargolabosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCargoLabo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCargoLabo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocargolaboLogic.getTipoCargoLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargolabos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocargolaboLogic.getTipoCargoLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargolabos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCargoLabo tipocargolabo) {
		Boolean permite=true;
		
		if(this.tipocargolabo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCargoLaboConstantesFunciones.getOrderByListaTipoCargoLabo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCargoLaboConstantesFunciones.getOrderByListaTipoCargoLabo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargoLabo tipocargolabo:tipocargolaboLogic.getTipoCargoLabos()) {
				if(tipocargolabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargolaboTotales=tipocargolabo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargoLabo tipocargolabo:this.tipocargolabos) {
				if(tipocargolabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargolaboTotales=tipocargolabo;
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
			this.tipocargolaboAux=new TipoCargoLabo();
			this.tipocargolaboAux.setsType(Constantes2.S_TOTALES);
			this.tipocargolaboAux.setIsNew(false);
			this.tipocargolaboAux.setIsChanged(false);
			this.tipocargolaboAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCargoLaboConstantesFunciones.TotalizarValoresFilaTipoCargoLabo(this.tipocargolaboLogic.getTipoCargoLabos(),this.tipocargolaboAux);
				
				this.tipocargolaboLogic.getTipoCargoLabos().add(this.tipocargolaboAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCargoLaboConstantesFunciones.TotalizarValoresFilaTipoCargoLabo(this.tipocargolabos,this.tipocargolaboAux);
				
				this.tipocargolabos.add(this.tipocargolaboAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocargolaboTotales=new TipoCargoLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocargolaboLogic.getTipoCargoLabos().remove(tipocargolaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocargolabos.remove(tipocargolaboTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocargolaboTotales=new TipoCargoLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargoLabo tipocargolabo:tipocargolaboLogic.getTipoCargoLabos()) {
				if(tipocargolabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargolaboTotales=tipocargolabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCargoLaboConstantesFunciones.TotalizarValoresFilaTipoCargoLabo(this.tipocargolaboLogic.getTipoCargoLabos(),tipocargolaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargoLabo tipocargolabo:this.tipocargolabos) {
				if(tipocargolabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargolaboTotales=tipocargolabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCargoLaboConstantesFunciones.TotalizarValoresFilaTipoCargoLabo(this.tipocargolabos,tipocargolaboTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCargoLabosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCargoLabosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCargoLabosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCargoLabosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.getTipoCargoLabosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCargoLabosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.getTipoCargoLabosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCargoLabosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLogic.getTipoCargoLabosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCargoLabo() {
		this.isPermisoTodoTipoCargoLabo=false;
		this.isPermisoNuevoTipoCargoLabo=false;
		this.isPermisoActualizarTipoCargoLabo=false;
		this.isPermisoActualizarOriginalTipoCargoLabo=false;
		this.isPermisoEliminarTipoCargoLabo=false;
		this.isPermisoGuardarCambiosTipoCargoLabo=false;
		this.isPermisoConsultaTipoCargoLabo=false;
		this.isPermisoBusquedaTipoCargoLabo=false;
		this.isPermisoReporteTipoCargoLabo=false;		
		this.isPermisoOrdenTipoCargoLabo=false;		
		this.isPermisoPaginacionMedioTipoCargoLabo=false;		
		this.isPermisoPaginacionAltoTipoCargoLabo=false;
		this.isPermisoPaginacionTodoTipoCargoLabo=false;
		this.isPermisoCopiarTipoCargoLabo=false;		
		this.isPermisoVerFormTipoCargoLabo=false;		
		this.isPermisoDuplicarTipoCargoLabo=false;		
		this.isPermisoOrdenTipoCargoLabo=false;		
	}
	
	public void setPermisosUsuarioTipoCargoLabo(Boolean isPermiso) {
		this.isPermisoTodoTipoCargoLabo=isPermiso;
		this.isPermisoNuevoTipoCargoLabo=isPermiso;
		this.isPermisoActualizarTipoCargoLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoCargoLabo=isPermiso;
		this.isPermisoEliminarTipoCargoLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoCargoLabo=isPermiso;
		this.isPermisoConsultaTipoCargoLabo=isPermiso;
		this.isPermisoBusquedaTipoCargoLabo=isPermiso;
		this.isPermisoReporteTipoCargoLabo=isPermiso;
		this.isPermisoOrdenTipoCargoLabo=isPermiso;		
		this.isPermisoPaginacionMedioTipoCargoLabo=isPermiso;		
		this.isPermisoPaginacionAltoTipoCargoLabo=isPermiso;		
		this.isPermisoPaginacionTodoTipoCargoLabo=isPermiso;		
		this.isPermisoCopiarTipoCargoLabo=isPermiso;		
		this.isPermisoVerFormTipoCargoLabo=isPermiso;		
		this.isPermisoDuplicarTipoCargoLabo=isPermiso;
		this.isPermisoOrdenTipoCargoLabo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCargoLabo(Boolean isPermiso) {
		//this.isPermisoTodoTipoCargoLabo=isPermiso;
		this.isPermisoNuevoTipoCargoLabo=isPermiso;
		this.isPermisoActualizarTipoCargoLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoCargoLabo=isPermiso;
		this.isPermisoEliminarTipoCargoLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoCargoLabo=isPermiso;
		//this.isPermisoConsultaTipoCargoLabo=isPermiso;
		//this.isPermisoBusquedaTipoCargoLabo=isPermiso;
		//this.isPermisoReporteTipoCargoLabo=isPermiso;
		//this.isPermisoOrdenTipoCargoLabo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCargoLabo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCargoLabo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCargoLabo=isPermiso;		
		//this.isPermisoCopiarTipoCargoLabo=isPermiso;		
		//this.isPermisoDuplicarTipoCargoLabo=isPermiso;
		//this.isPermisoOrdenTipoCargoLabo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCargoLaboClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCargoLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoCargoLaboClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCargoLabo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCargoLaboClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCargoLaboClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCargoLaboClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCargoLaboClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.remove(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCargoLabo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCargoLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCargoLaboConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCargoLabo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCargoLabo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCargoLabo=this.isPermisoActualizarTipoCargoLabo;
			this.isPermisoEliminarTipoCargoLabo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCargoLabo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCargoLabo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCargoLabo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCargoLabo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCargoLabo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCargoLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCargoLabo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCargoLabo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCargoLabo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCargoLabo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCargoLabo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCargoLabo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCargoLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCargoLabo.setToolTipText(this.jTableDatosTipoCargoLabo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCargoLabo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCargoLabo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCargoLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCargoLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCargoLabo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tipocargolaboConstantesFunciones.mostrarClienteTipoCargoLabo && !TipoCargoLaboConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTipoCargoLaboListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCargoLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCargoLaboJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCargoLaboListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCargoLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCargoLaboParameterReturnGeneral tipocargolaboReturnGeneral=new TipoCargoLaboParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocargolaboConstantesFunciones.cargarid_empresaTipoCargoLabo)
					 || (this.esRecargarFks && this.tipocargolaboConstantesFunciones.cargarid_empresaTipoCargoLabo)) {

					if(!this.tipocargolaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocargolaboSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocargolaboReturnGeneral=tipocargolaboLogic.cargarCombosLoteForeignKeyTipoCargoLabo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocargolaboReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCargoLabo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocargolaboSessionBean==null) {
				this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
			}

			if(!this.tipocargolaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCargoLabo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCargoLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCargoLabo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargoLabo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCargoLabo(TipoCargoLabo tipocargolabo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCargoLabo(TipoCargoLabo tipocargolabo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCargoLabo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargoLabo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCargoLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCargoLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCargoLabo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCargoLabo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCargoLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCargoLabo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCargoLaboBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCargoLaboBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCargoLaboBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean(); 
		this.tipocargolaboConstantesFunciones=new TipoCargoLaboConstantesFunciones(); 
		this.tipocargolaboBean=new TipoCargoLabo();//(this.tipocargolaboConstantesFunciones); 		
		this.tipocargolaboReturnGeneral=new TipoCargoLaboParameterReturnGeneral(); 
		
		this.tipocargolaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargolaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCargoLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCargoLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCargoLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCargoLabo(true);
			
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
			
			this.tipocargolaboConstantesFunciones=new TipoCargoLaboConstantesFunciones(); 
			this.tipocargolaboBean=new TipoCargoLabo();//this.tipocargolaboConstantesFunciones); 			
			this.tipocargolaboReturnGeneral=new TipoCargoLaboParameterReturnGeneral(); 
		
			TipoCargoLaboBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cargo Laboral Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocargolabo=new TipoCargoLabo();
			this.tipocargolabos = new ArrayList<TipoCargoLabo>();
			this.tipocargolabosAux = new ArrayList<TipoCargoLabo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic=new TipoCargoLaboLogic();
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocargolaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocargolaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCargoLabo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCargoLabo);	
					}
					
					if(this.jInternalFrameImportacionTipoCargoLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCargoLabo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCargoLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCargoLabo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCargoLabo);
				this.jInternalFrameDetalleFormTipoCargoLabo.setVisible(false);
				this.jInternalFrameDetalleFormTipoCargoLabo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCargoLabo);
					this.jInternalFrameReporteDinamicoTipoCargoLabo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCargoLabo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCargoLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCargoLabo);
					this.jInternalFrameImportacionTipoCargoLabo.setVisible(false);
					this.jInternalFrameImportacionTipoCargoLabo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCargoLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCargoLabo);
					this.jInternalFrameOrderByTipoCargoLabo.setVisible(false);
					this.jInternalFrameOrderByTipoCargoLabo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCargoLaboActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCargoLaboConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocargolaboReturnGeneral=new TipoCargoLaboParameterReturnGeneral();
			
			this.tipocargolaboParameterGeneral=new TipoCargoLaboParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocargolaboLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCargoLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCargoLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocargolaboSessionBean.getEsGuardarRelacionado(),this.tipocargolaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCargoLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocargolaboSessionBean.getEsGuardarRelacionado(),this.tipocargolaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaDuplicarTipoCargoLabo=true;
			this.isVisibilidadCeldaCopiarTipoCargoLabo=true;
			this.isVisibilidadCeldaVerFormTipoCargoLabo=true;
			this.isVisibilidadCeldaOrdenTipoCargoLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCargoLabo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCargoLabo(false);
			
			this.setPermisosUsuarioTipoCargoLabo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocargolaboSessionBean.getEsGuardarRelacionado() && this.tipocargolaboSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCargoLaboClasesRelacionadas();
			}
			
			if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCargoLaboClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCargoLabo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCargoLabo();
			}
			
			if(!this.isPermisoBusquedaTipoCargoLabo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCargoLabo,this.isPermisoPaginacionMedioTipoCargoLabo,this.isPermisoPaginacionTodoTipoCargoLabo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCargoLaboConstantesFunciones.getTiposSeleccionarTipoCargoLabo());
				
				this.tiposColumnasSelect=TipoCargoLaboConstantesFunciones.getTiposSeleccionarTipoCargoLabo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCargoLabo();				
				//this.tiposRelacionesSelect=TipoCargoLaboConstantesFunciones.getTiposRelacionesTipoCargoLabo(true);
				
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
			//if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCargoLabo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCargoLabo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCargoLabo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargoLabo() ;
			
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
				tipocargolaboImplementable= (TipoCargoLaboImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCargoLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocargolaboImplementableHome= (TipoCargoLaboImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCargoLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocargolabos= new ArrayList<TipoCargoLabo>();
			this.tipocargolabosEliminados= new ArrayList<TipoCargoLabo>();
						
			this.isEsNuevoTipoCargoLabo=false;
			this.esParaAccionDesdeFormularioTipoCargoLabo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCargoLabo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCargoLabo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCargoLaboConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCargoLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCargoLabo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCargoLabo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCargoLabo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCargoLabo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCargoLabo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCargoLabo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCargoLabo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCargoLabo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCargoLabo() {
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
			if(sTipo.equals("RelacionesTipoCargoLabo")) {
				iIndex=this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCargoLabo();

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
				this.finishProcessTipoCargoLabo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCargoLabo.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoCargoLabo.updateUI();
		//this.jTabbedPaneRelacionesTipoCargoLabo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCargoLabo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoCargoLabo.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tipocargolaboConstantesFunciones.mostrarClienteTipoCargoLabo && !TipoCargoLaboConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tipocargolaboConstantesFunciones.resaltarClienteTipoCargoLabo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocargolaboConstantesFunciones.resaltarClienteTipoCargoLabo);
						}

						jmenuItem.setEnabled(this.tipocargolaboConstantesFunciones.activarClienteTipoCargoLabo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoCargoLabo.jmenuDetalleTipoCargoLabo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCargoLabo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCargoLabo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCargoLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCargoLaboListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCargoLabo();
		
		this.cargarCombosFrameForeignKeyTipoCargoLabo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCargoLabo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCargoLabo();
		}
	}
	
	
	
	public void jButtonNuevoTipoCargoLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			
			if(jTableDatosTipoCargoLabo.getRowCount()>=1) {
				jTableDatosTipoCargoLabo.removeRowSelectionInterval(0, jTableDatosTipoCargoLabo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCargoLabo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCargoLabo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCargoLabo(true);			
			//this.tipocargolabo=new TipoCargoLabo();
			//this.tipocargolabo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargoLabo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargoLabo() ;
			
			if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargoLabo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocargolabo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);				
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCargoLabo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCargoLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCargoLabo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCargoLabo.getSelectedRows().length;			
			}
			
			tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCargoLabo--;			
				//TipoCargoLabo tipocargolaboAux= new TipoCargoLabo();			
				//tipocargolaboAux.setId(this.iIdNuevoTipoCargoLabo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCargoLabo tipocargolaboOrigen=new TipoCargoLabo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCargoLabo tipocargolaboOrigen : tipocargolabosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocargolaboOrigen =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargolaboOrigen =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCargoLabo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocargolabo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCargoLabo(tipocargolaboOrigen,this.tipocargolabo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocargolaboLogic.getTipoCargoLabos().add(this.tipocargolaboAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocargolabos.add(this.tipocargolaboAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
				
				this.jTableDatosTipoCargoLabo.setRowSelectionInterval(this.getIndiceNuevoTipoCargoLabo(), this.getIndiceNuevoTipoCargoLabo());
				
				int iLastRow =  this.jTableDatosTipoCargoLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCargoLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCargoLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargoLabo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();									
		
			TipoCargoLabo tipocargolaboOrigen=new TipoCargoLabo();
			TipoCargoLabo tipocargolaboDestino=new TipoCargoLabo();
				
			tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCargoLabo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocargolabosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCargoLabo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboOrigen =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocargolaboOrigen =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargolaboDestino =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocargolaboDestino =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocargolaboOrigen =tipocargolabosSeleccionados.get(0);
				tipocargolaboDestino =tipocargolabosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCargoLabo(tipocargolaboOrigen,tipocargolaboDestino,true,false);
				
				tipocargolaboDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocargolaboDestino,tipocargolaboLogic.getTipoCargoLabos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargolaboDestino,tipocargolabos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
				
				//this.jTableDatosTipoCargoLabo.setRowSelectionInterval(this.getIndiceNuevoTipoCargoLabo(), this.getIndiceNuevoTipoCargoLabo());
				
				int iLastRow =  this.jTableDatosTipoCargoLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCargoLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCargoLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargoLabo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCargoLabo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCargoLabo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCargoLabo.setVisible(!isVisible);
			this.jPanelPaginacionTipoCargoLabo.setVisible(!isVisible);
			this.jPanelAccionesTipoCargoLabo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCargoLabo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCargoLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCargoLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCargoLabo();
			
			this.abrirFrameOrderByTipoCargoLabo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCargoLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCargoLabo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCargoLabo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCargoLabo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCargoLabo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCargoLabo.setSize(this.jInternalFrameDetalleFormTipoCargoLabo.iWidthFormulario,this.jInternalFrameDetalleFormTipoCargoLabo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCargoLabo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCargoLabo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCargoLabo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCargoLabo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCargoLabo.jContentPaneDetalleTipoCargoLabo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCargoLabo.jContentPaneDetalleTipoCargoLabo.getWidth(),TipoCargoLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCargoLabo.jContentPaneDetalleTipoCargoLabo.getWidth(),TipoCargoLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCargoLabo.jContentPaneDetalleTipoCargoLabo.getWidth(),TipoCargoLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCargoLabo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCargoLabo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCargoLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCargoLabo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCargoLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargoLabo,false,this);
				} else {
					this.jInternalFrameOrderByTipoCargoLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargoLabo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCargoLabo);
				this.jInternalFrameOrderByTipoCargoLabo.setVisible(false);
				this.jInternalFrameOrderByTipoCargoLabo.setSelected(false);
				
				this.jInternalFrameOrderByTipoCargoLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCargoLabo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCargoLabo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCargoLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCargoLabo==null) {
				
				this.jInternalFrameImportacionTipoCargoLabo=new ImportacionJInternalFrame(TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCargoLabo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCargoLabo);
				this.jInternalFrameImportacionTipoCargoLabo.setVisible(false);
				this.jInternalFrameImportacionTipoCargoLabo.setSelected(false);


				this.jInternalFrameImportacionTipoCargoLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCargoLabo"));
				this.jInternalFrameImportacionTipoCargoLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCargoLabo"));
				this.jInternalFrameImportacionTipoCargoLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCargoLabo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCargoLabo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCargoLabo==null) {
				this.jInternalFrameReporteDinamicoTipoCargoLabo=new ReporteDinamicoJInternalFrame(TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCargoLabo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCargoLabo);
				this.jInternalFrameReporteDinamicoTipoCargoLabo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCargoLabo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargoLabo"));
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargoLabo"));
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargoLabo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargoLabo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCargoLabo.jContentPaneDetalleTipoCargoLabo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCargoLabo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCargoLabo);
			
	       	this.jInternalFrameDetalleFormTipoCargoLabo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCargoLabo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCargoLabo.dispose();
			//this.jInternalFrameDetalleFormTipoCargoLabo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCargoLabo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCargoLabo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCargoLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCargoLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCargoLabo.setVisible(true);
	        this.jInternalFrameImportacionTipoCargoLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCargoLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCargoLabo.setVisible(true);
	        this.jInternalFrameOrderByTipoCargoLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCargoLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCargoLabo.setVisible(false);
	        this.jInternalFrameOrderByTipoCargoLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCargoLabo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCargoLabo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCargoLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCargoLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCargoLabo.setVisible(false);
	        this.jInternalFrameImportacionTipoCargoLabo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCargoLabo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCargoLabo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCargoLabo(true);
			//this.isEsNuevoTipoCargoLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCargoLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargoLabo(false) ;
			
			if(tipocargolaboSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargoLabo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargoLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCargoLaboActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCargoLabo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCargoLabo(true);
			//this.isEsNuevoTipoCargoLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocargolabo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCargoLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCargoLabo(false) ;
			
			if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargoLabo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargoLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCargoLabo(false);
			
			//if(!this.isEsNuevoTipoCargoLabo) {								
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				
			}
			
			if(this.permiteMantenimiento(this.tipocargolabo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCargoLabo=true;
					this.inicializarActualizarBindingTablaTipoCargoLabo(false);
					this.isEsNuevoTipoCargoLabo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCargoLabo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCargoLabo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCargoLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargoLabo(false);
				
				this.habilitarDeshabilitarControlesTipoCargoLabo(false);
			
												
				
				if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCargoLabo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCargoLaboActionPerformed(evt,tipocargolaboSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCargoLabo(this.tipocargolabo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCargoLabo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocargolaboSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocargolabo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				this.tipocargolabo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				this.tipocargolabo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocargolabo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCargoLaboModel) this.jTableDatosTipoCargoLabo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCargoLabo=true;
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
				this.isEsNuevoTipoCargoLabo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCargoLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargoLabo(false);
				
				this.habilitarDeshabilitarControlesTipoCargoLabo(false);
				
				
				
				if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCargoLabo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCargoLabo.getRowCount()>=1) {
				jTableDatosTipoCargoLabo.removeRowSelectionInterval(0, jTableDatosTipoCargoLabo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCargoLabo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargoLabo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargoLabo(false) ;
			
			this.isEsNuevoTipoCargoLabo=false;
			
			if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCargoLabo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCargoLabo(false);
				
				//SI ES MANUAL
				if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCargoLabo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCargoLabo--;			
			//TipoCargoLabo tipocargolaboAux= new TipoCargoLabo();			
			//tipocargolaboAux.setId(this.iIdNuevoTipoCargoLabo);
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCargoLabo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
			
			this.tipocargolabo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocargolaboLogic.getTipoCargoLabos().add(this.tipocargolaboAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocargolabos.add(this.tipocargolaboAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			
			this.jTableDatosTipoCargoLabo.setRowSelectionInterval(this.getIndiceNuevoTipoCargoLabo(), this.getIndiceNuevoTipoCargoLabo());
			
			int iLastRow =  this.jTableDatosTipoCargoLabo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCargoLabo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCargoLabo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargoLabo(false);
			
			//SI ES MANUAL
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargoLabo();
			}
			
			//this.abrirFrameTreeTipoCargoLabo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cargo LaboralS ?", "MANTENIMIENTO DE Tipo Cargo Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCargoLabo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCargoLabo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocargolaboReturnGeneral=tipocargolaboLogic.procesarImportacionTipoCargoLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocargolaboParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCargoLaboReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCargoLabo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCargoLabo.setFileImportacion(this.jInternalFrameImportacionTipoCargoLabo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCargoLabo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCargoLabo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCargoLabo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCargoLabo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		

		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCargoLaboBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCargoLaboBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCargoLaboConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCargoLaboConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoCargoLabo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCargoLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCargoLabo tipocargolabo:tipocargolabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocargolabo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCargoLabo tipocargolabo:tipocargolabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocargolabo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCargoLaboConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCargoLabo tipocargolabo:tipocargolabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocargolabo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCargoLabo(row);				
			//	iRow++;
			//}				
			
			//for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCargoLabo(tipocargolaboAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargoLabo(false);
			
			//SI ES MANUAL
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargoLabo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargoLabo(false);
			
			//SI ES MANUAL
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCargoLabo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargoLabo(false);
			
			//SI ES MANUAL
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCargoLabo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCargoLabo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCargoLabo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCargoLabo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCargoLabo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCargoLabo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCargoLabo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCargoLabo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCargoLabo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCargoLabo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCargoLabo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCargoLabo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCargoLabo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCargoLabo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCargoLabo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargoLabo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCargoLabo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCargoLabo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCargoLabo();
		
		this.inicializarActualizarBindingBotonesManualTipoCargoLabo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCargoLabo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargoLabo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargoLabo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargoLabo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCargoLabo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCargoLabo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCargoLabo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionNuevoTipoCargoLabo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionSinCerrarTipoCargoLabo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionSinMensajeTipoCargoLabo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCargoLabo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCargoLabo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCargoLabo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
				this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionNuevoTipoCargoLabo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionSinCerrarTipoCargoLabo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCargoLabo.jCheckBoxPostAccionSinMensajeTipoCargoLabo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCargoLabo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCargoLabo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCargoLabo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCargoLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCargoLabo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCargoLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCargoLabo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCargoLabo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCargoLabo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCargoLabo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargoLabo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargoLabo() throws Exception {
		try	{
			if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCargoLabo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCargoLabo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCargoLabo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCargoLabo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCargoLabo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCargoLabo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCargoLabo.addItem(reporte);
			}
			
			
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCargoLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCargoLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCargoLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCargoLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCargoLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCargoLabo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCargoLabo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargoLabo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargoLabo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCargoLabo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCargoLabo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoCargoLabo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCargoLabo(Boolean esInicializar) throws Exception {				
		if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCargoLabo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCargoLabo() throws Exception {
		this.inicializarActualizarBindingTablaTipoCargoLabo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCargoLabo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCargoLaboOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLaboOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCargoLabo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocargolaboLogic.getTipoCargoLabos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocargolabos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCargoLabo.setModel(new TipoCargoLaboModel(this.tipocargolaboLogic.getTipoCargoLabos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCargoLabo.setModel(new TipoCargoLaboModel(this.tipocargolabos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCargoLabo!=null && this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCargoLabo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,tipocargolaboConstantesFunciones.resaltarSeleccionarTipoCargoLabo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,tipocargolaboConstantesFunciones.resaltarSeleccionarTipoCargoLabo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,TipoCargoLaboConstantesFunciones.LABEL_ID));

		if(this.tipocargolaboConstantesFunciones.mostraridTipoCargoLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargoLaboConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocargolaboConstantesFunciones.resaltaridTipoCargoLabo,this.tipocargolaboConstantesFunciones.activaridTipoCargoLabo,this,true,"idTipoCargoLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargolaboConstantesFunciones.resaltaridTipoCargoLabo,this.tipocargolaboConstantesFunciones.activaridTipoCargoLabo,this,true,"idTipoCargoLabo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocargolaboConstantesFunciones.mostrarid_empresaTipoCargoLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocargolaboConstantesFunciones.resaltarid_empresaTipoCargoLabo,this,this.tipocargolaboConstantesFunciones.activarid_empresaTipoCargoLabo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocargolaboConstantesFunciones.resaltarid_empresaTipoCargoLabo,this,this.tipocargolaboConstantesFunciones.activarid_empresaTipoCargoLabo,false,"id_empresaTipoCargoLabo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,TipoCargoLaboConstantesFunciones.LABEL_CODIGO));

		if(this.tipocargolaboConstantesFunciones.mostrarcodigoTipoCargoLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargoLaboConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocargolaboConstantesFunciones.resaltarcodigoTipoCargoLabo,this.tipocargolaboConstantesFunciones.activarcodigoTipoCargoLabo,this,true,"codigoTipoCargoLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargolaboConstantesFunciones.resaltarcodigoTipoCargoLabo,this.tipocargolaboConstantesFunciones.activarcodigoTipoCargoLabo,this,true,"codigoTipoCargoLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,TipoCargoLaboConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocargolaboConstantesFunciones.mostrarnombreTipoCargoLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargoLaboConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocargolaboConstantesFunciones.resaltarnombreTipoCargoLabo,this.tipocargolaboConstantesFunciones.activarnombreTipoCargoLabo,this,true,"nombreTipoCargoLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargolaboConstantesFunciones.resaltarnombreTipoCargoLabo,this.tipocargolaboConstantesFunciones.activarnombreTipoCargoLabo,this,true,"nombreTipoCargoLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCargoLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tipocargolaboConstantesFunciones.mostrarClienteTipoCargoLabo && !TipoCargoLaboConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tipocargolaboConstantesFunciones.resaltarClienteTipoCargoLabo,this,this.tipocargolaboConstantesFunciones.activarClienteTipoCargoLabo));
				tableColumn.setCellEditor(new ClienteTableCell(tipocargolaboConstantesFunciones.resaltarClienteTipoCargoLabo,this,this.tipocargolaboConstantesFunciones.activarClienteTipoCargoLabo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCargoLabo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCargoLabo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCargoLabo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocargolaboSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCargoLabo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCargoLabo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCargoLabo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocargolaboSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCargoLabo.moveColumn(this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCargoLabo.moveColumn(this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocargolaboSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCargoLabo.moveColumn(this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCargoLabo.moveColumn(this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCargoLabo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCargoLabo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCargoLabo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCargoLabo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCargoLabo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCargoLabo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocargolaboLogic.getTipoCargoLabos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocargolabos.size()-1;
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
		//this.jTableDatosTipoCargoLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCargoLabo();
			
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
				
				//this.isEsNuevoTipoCargoLabo=false;
					
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
				if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCargoLabo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCargoLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCargoLabo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocargolabo.getsType().equals("DUPLICADO")
				   || this.tipocargolabo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCargoLabo=true;
				
				} else {
					this.isEsNuevoTipoCargoLabo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocargolabo.getId()>=0 && !this.tipocargolabo.getIsNew()) {						
						this.isEsNuevoTipoCargoLabo=false;
						
					} else {
						this.isEsNuevoTipoCargoLabo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCargoLabo(esRelaciones);						
				
				this.seleccionarTipoCargoLabo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocargolabo.getId()<0) {
					this.isEsNuevoTipoCargoLabo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCargoLabo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCargoLabo(evt,rowIndex);
				}	
				
				if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCargoLabo: " + this.dDif); 
					}
				}								
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCargoLabo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocargolabo)) {
					if(this.tipocargolabo.getId()>0) {
						this.tipocargolabo.setIsDeleted(true);
						
						this.tipocargolabosEliminados.add(this.tipocargolabo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocargolaboLogic.getTipoCargoLabos().remove(this.tipocargolabo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocargolabos.remove(this.tipocargolabo);				
					}
					
					
					((TipoCargoLaboModel) this.jTableDatosTipoCargoLabo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargoLabo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCargoLabo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCargoLabo) {
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCargoLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCargoLabo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCargoLabo(this.tipocargolabo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocargolaboConstantesFunciones.cargarid_empresaTipoCargoLabo || this.tipocargolaboConstantesFunciones.event_dependid_empresaTipoCargoLabo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocargolabo.getid_empresa());
									//this.inicializarActualizarBindingTipoCargoLabo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocargolabo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocargolabo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocargolabo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCargoLabo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCargoLabo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargoLabo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCargoLabo(TipoCargoLabo tipocargolabo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCargoLabo(tipocargolabo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCargoLabo(TipoCargoLabo tipocargolabo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCargoLabo(tipocargolabo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCargoLabo(tipocargolabo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCargoLabo(tipocargolabo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCargoLabo(TipoCargoLabo tipocargolabo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setText(tipocargolabo.getId().toString());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setText(tipocargolabo.getcodigo());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setText(tipocargolabo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCargoLabo tipocargolaboLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocargolaboLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCargoLabo tipocargolaboLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocargolaboLocal=this.tipocargolabo;
			} else {
				tipocargolaboLocal=this.tipocargolaboAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocargolaboLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCargoLabo(tipocargolaboLocal,true);
					
					if(tipocargolaboSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocargolaboLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocargolaboLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCargoLabo(TipoCargoLabo tipocargolabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCargoLabo(tipocargolabo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(tipocargolabo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCargoLabo(TipoCargoLabo tipocargolabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCargoLabo(tipocargolabo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCargoLabo(TipoCargoLabo tipocargolabo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.getText()==null || this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.getText()=="" || this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setText("0");
			}

			if(conColumnasBase) {tipocargolabo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargoLaboConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelIdTipoCargoLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocargolabo.setcodigo(this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargoLaboConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelcodigoTipoCargoLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocargolabo.setnombre(this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargoLaboConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargoLabo.jLabelnombreTipoCargoLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCargoLabo(TipoCargoLabo tipocargolaboBean,TipoCargoLabo tipocargolabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCargoLabo(TipoCargoLabo tipocargolaboOrigen,TipoCargoLabo tipocargolabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocargolaboOrigen.getId()!=null && !tipocargolaboOrigen.getId().equals(0L))) {tipocargolabo.setId(tipocargolaboOrigen.getId());}}
			if(conDefault || (!conDefault && tipocargolaboOrigen.getcodigo()!=null && !tipocargolaboOrigen.getcodigo().equals(""))) {tipocargolabo.setcodigo(tipocargolaboOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocargolaboOrigen.getnombre()!=null && !tipocargolaboOrigen.getnombre().equals(""))) {tipocargolabo.setnombre(tipocargolaboOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCargoLabo(TipoCargoLabo tipocargolabo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setText(tipocargolabo.getId().toString());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setText(tipocargolabo.getcodigo());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setText(tipocargolabo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCargoLabo(TipoCargoLaboBean tipocargolaboBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setText(tipocargolaboBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setText(tipocargolaboBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setText(tipocargolaboBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCargoLabo(TipoCargoLaboParameterReturnGeneral tipocargolaboReturnGeneral,TipoCargoLaboBean tipocargolaboBean,Boolean conDefault) throws Exception { 
		try {
			TipoCargoLabo tipocargolaboLocal=new TipoCargoLabo();
			
			tipocargolaboLocal=tipocargolaboReturnGeneral.getTipoCargoLabo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocargolaboLocal.getId()!=null && !tipocargolaboLocal.getId().equals(0L))) {tipocargolaboBean.setId(tipocargolaboLocal.getId());}}
			if(conDefault || (!conDefault && tipocargolaboLocal.getcodigo()!=null && !tipocargolaboLocal.getcodigo().equals(""))) {tipocargolaboBean.setcodigo(tipocargolaboLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocargolaboLocal.getnombre()!=null && !tipocargolaboLocal.getnombre().equals(""))) {tipocargolaboBean.setnombre(tipocargolaboLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCargoLaboGenerico(Long idTipoCargoLaboSeleccionado,JComboBox jComboBoxTipoCargoLabo,List<TipoCargoLabo> tipocargolabosLocal)throws Exception {
		try {
			TipoCargoLabo  tipocargolaboTemp=null;

			for(TipoCargoLabo tipocargolaboAux:tipocargolabosLocal) {
				if(tipocargolaboAux.getId()!=null && tipocargolaboAux.getId().equals(idTipoCargoLaboSeleccionado)) {
					tipocargolaboTemp=tipocargolaboAux;
					break;
				}
			}

			jComboBoxTipoCargoLabo.setSelectedItem(tipocargolaboTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCargoLaboGenerico(JComboBox jComboBoxTipoCargoLabo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCargoLabo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCargoLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCargoLabo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCargoLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargolabo=(TipoCargoLabo) tipocargolaboLogic.getTipoCargoLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocargolabo =(TipoCargoLabo) tipocargolabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocargolabo.getIsNew() && !tipocargolabo.getIsChanged() && !tipocargolabo.getIsDeleted()) {
				sDescripcion=tipocargolabo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocargolabo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCargoLabo tipocargolaboRow=new TipoCargoLabo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargolaboRow=(TipoCargoLabo) tipocargolaboLogic.getTipoCargoLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocargolaboRow=(TipoCargoLabo) tipocargolabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCargoLabo tipocargolabo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCargoLabo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolabo = (TipoCargoLabo)this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocargolabo = (TipoCargoLabo)this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocargolabo!=null) {
						this.tipocargolabo = tipocargolabo;
					} else {
						this.tipocargolabo = new TipoCargoLabo();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tipocargolabo)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame;
					}

					List<TipoCargoLabo> tipocargolabos=new ArrayList<TipoCargoLabo>();
					tipocargolabos.add(this.tipocargolabo);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCargoLabo.cargarClienteBeanSwingJInternalFrame(tipocargolabos,this.tipocargolabo,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCargoLabo=(TitledBorder)this.jScrollPanelDatosTipoCargoLabo.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoCargoLabo.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCargoLabo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));			
			this.jButtonDuplicarTipoCargoLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoCargoLabo && this.isPermisoDuplicarTipoCargoLabo));			
			this.jButtonCopiarTipoCargoLabo.setVisible((this.isVisibilidadCeldaCopiarTipoCargoLabo && this.isPermisoCopiarTipoCargoLabo));
			this.jButtonVerFormTipoCargoLabo.setVisible((this.isVisibilidadCeldaVerFormTipoCargoLabo && this.isPermisoVerFormTipoCargoLabo));
			
			this.jButtonAbrirOrderByTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));			
			
			this.jButtonNuevoRelacionesTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));			
			this.jButtonNuevoGuardarCambiosTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarTipoCargoLabo.setVisible((this.isVisibilidadCeldaModificarTipoCargoLabo && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.setVisible((this.isVisibilidadCeldaActualizarTipoCargoLabo && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.setVisible((this.isVisibilidadCeldaEliminarTipoCargoLabo && this.isPermisoEliminarTipoCargoLabo));
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.setVisible(this.isVisibilidadCeldaCancelarTipoCargoLabo);							
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));						
			this.jButtonDuplicarToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoCargoLabo && this.isPermisoDuplicarTipoCargoLabo));						
			this.jButtonCopiarToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaCopiarTipoCargoLabo && this.isPermisoCopiarTipoCargoLabo));			
			this.jButtonVerFormToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaVerFormTipoCargoLabo && this.isPermisoVerFormTipoCargoLabo));			
			this.jButtonAbrirOrderByToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));
			this.jButtonNuevoRelacionesToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));			
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaModificarTipoCargoLabo && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaActualizarTipoCargoLabo  && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaEliminarTipoCargoLabo && this.isPermisoEliminarTipoCargoLabo));
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarToolBarTipoCargoLabo.setVisible(this.isVisibilidadCeldaCancelarTipoCargoLabo);				
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));			
			this.jMenuItemDuplicarTipoCargoLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoCargoLabo && this.isPermisoDuplicarTipoCargoLabo));			
			this.jMenuItemCopiarTipoCargoLabo.setVisible((this.isVisibilidadCeldaCopiarTipoCargoLabo && this.isPermisoCopiarTipoCargoLabo));			
			this.jMenuItemVerFormTipoCargoLabo.setVisible((this.isVisibilidadCeldaVerFormTipoCargoLabo && this.isPermisoVerFormTipoCargoLabo));			
			this.jMenuItemAbrirOrderByTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));			
			//this.jMenuItemMostrarOcultarTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));
			this.jMenuItemDetalleAbrirOrderByTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));			
			//this.jMenuItemDetalleMostrarOcultarTipoCargoLabo.setVisible((this.isVisibilidadCeldaOrdenTipoCargoLabo && this.isPermisoOrdenTipoCargoLabo));			
			this.jMenuItemNuevoRelacionesTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo));			
			this.jMenuItemNuevoGuardarCambiosTipoCargoLabo.setVisible((this.isVisibilidadCeldaNuevoTipoCargoLabo && this.isPermisoNuevoTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));									
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemModificarTipoCargoLabo.setVisible((this.isVisibilidadCeldaModificarTipoCargoLabo && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemActualizarTipoCargoLabo.setVisible((this.isVisibilidadCeldaActualizarTipoCargoLabo && this.isPermisoActualizarTipoCargoLabo));	
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemEliminarTipoCargoLabo.setVisible((this.isVisibilidadCeldaEliminarTipoCargoLabo && this.isPermisoEliminarTipoCargoLabo));
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemCancelarTipoCargoLabo.setVisible(this.isVisibilidadCeldaCancelarTipoCargoLabo);				
			}
			
			this.jMenuItemGuardarCambiosTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));						
			this.jMenuItemGuardarCambiosTablaTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=this.jButtonNuevoTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCargoLabo=this.jButtonDuplicarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaCopiarTipoCargoLabo=this.jButtonCopiarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaVerFormTipoCargoLabo=this.jButtonVerFormTipoCargoLabo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCargoLabo=this.jButtonAbrirOrderByTipoCargoLabo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=this.jButtonNuevoRelacionesTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaModificarTipoCargoLabo=this.jButtonModificarTipoCargoLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.isVisibilidadCeldaActualizarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaGuardarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=this.jButtonGuardarCambiosTablaTipoCargoLabo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCargoLabo=this.jButtonNuevoToolBarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=this.jButtonNuevoRelacionesToolBarTipoCargoLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.isVisibilidadCeldaModificarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarToolBarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarToolBarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarToolBarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarToolBarTipoCargoLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCargoLabo=this.jButtonGuardarCambiosToolBarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCargoLabo=this.jMenuItemNuevoTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=this.jMenuItemNuevoRelacionesTipoCargoLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.isVisibilidadCeldaModificarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemModificarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemActualizarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemEliminarTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargoLabo=this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemCancelarTipoCargoLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCargoLabo=this.jMenuItemGuardarCambiosTipoCargoLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=this.jMenuItemGuardarCambiosTablaTipoCargoLabo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCargoLabo(Boolean esInicializar) {
		if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCargoLabo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCargoLabo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCargoLabo() {
		this.jButtonNuevoTipoCargoLabo.setVisible(this.isPermisoNuevoTipoCargoLabo);			
		this.jButtonDuplicarTipoCargoLabo.setVisible(this.isPermisoDuplicarTipoCargoLabo);			
		this.jButtonCopiarTipoCargoLabo.setVisible(this.isPermisoCopiarTipoCargoLabo);			
		this.jButtonVerFormTipoCargoLabo.setVisible(this.isPermisoVerFormTipoCargoLabo);			
		
		this.jButtonAbrirOrderByTipoCargoLabo.setVisible(this.isPermisoOrdenTipoCargoLabo);					
		
		this.jButtonNuevoRelacionesTipoCargoLabo.setVisible(this.isPermisoNuevoTipoCargoLabo);			
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarTipoCargoLabo.setVisible(this.isPermisoActualizarTipoCargoLabo);	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.setVisible(this.isPermisoActualizarTipoCargoLabo);	
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.setVisible(this.isPermisoEliminarTipoCargoLabo);
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.setVisible(this.isVisibilidadCeldaCancelarTipoCargoLabo);						
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.setVisible(this.isPermisoGuardarCambiosTipoCargoLabo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.setVisible(this.isPermisoActualizarTipoCargoLabo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCargoLabo() {
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarTipoCargoLabo.setVisible(this.isPermisoActualizarTipoCargoLabo);	
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.setVisible(this.isPermisoActualizarTipoCargoLabo);	
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.setVisible(this.isPermisoEliminarTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.setVisible(this.isVisibilidadCeldaCancelarTipoCargoLabo);							
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.setVisible((this.isVisibilidadCeldaGuardarTipoCargoLabo && this.isPermisoGuardarCambiosTipoCargoLabo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCargoLabo() {
		if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCargoLabo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCargoLabo() {
	}
	
	public void jTableDatosTipoCargoLaboListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCargoLabo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCargoLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.gettipocargolabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargolabo==null) {
						this.tipocargolabo = new TipoCargoLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				}

				if(this.tipocargolabo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocargolabo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargoLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCargoLaboUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCargoLabo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCargoLabo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCargoLabo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.gettipocargolabo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocargolaboLogic.getConnexion());

				if(this.tipocargolabo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocargolabo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCargoLabo=(TitledBorder)this.jScrollPanelDatosTipoCargoLabo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCargoLabo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCargoLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.gettipocargolabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargolabo==null) {
						this.tipocargolabo = new TipoCargoLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				}

				if(this.tipocargolabo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocargolabo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargoLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCargoLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.gettipocargolabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargolabo==null) {
						this.tipocargolabo = new TipoCargoLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				}

				if(this.tipocargolabo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocargolabo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargoLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCargoLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.gettipocargolabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargolabo==null) {
						this.tipocargolabo = new TipoCargoLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);
				}

				if(this.tipocargolabo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocargolabo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargoLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCargoLabo(false,false);

			this.getTipoCargoLabosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoCargoLabo(false);

			//if(TipoCargoLaboBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCargoLabo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCargoLabo(false,false);

			this.getTipoCargoLabosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoCargoLabo(false);

			//if(TipoCargoLaboBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCargoLabo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoCargoLaboActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCargoLabo(false,false);

			this.getTipoCargoLabosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCargoLabo(false);

			//if(TipoCargoLaboBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCargoLabo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargolaboLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCargoLabo() {
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
			this.jInternalFrameDetalleFormTipoCargoLabo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCargoLabo.dispose();
			this.jInternalFrameDetalleFormTipoCargoLabo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
			this.jInternalFrameReporteDinamicoTipoCargoLabo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCargoLabo.dispose();
			this.jInternalFrameReporteDinamicoTipoCargoLabo=null;
		}
		
		if(this.jInternalFrameImportacionTipoCargoLabo!=null) {
			this.jInternalFrameImportacionTipoCargoLabo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCargoLabo.dispose();
			this.jInternalFrameImportacionTipoCargoLabo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCargoLabo();
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCargoLabo")) {
				jButtonDuplicarTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCargoLabo")) {
				jButtonCopiarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCargoLabo")) {
				jButtonVerFormTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCargoLabo")) {
				jButtonDuplicarTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCargoLabo")) {
				jButtonDuplicarTipoCargoLaboActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCargoLabo")) {
				jButtonModificarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCargoLabo")) {
				jButtonModificarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCargoLabo")) {
				jButtonModificarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCargoLabo")) {
				jButtonActualizarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCargoLabo")) {
				jButtonActualizarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCargoLabo")) {
				jButtonActualizarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCargoLabo")) {
				jButtonEliminarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCargoLabo")) {
				jButtonEliminarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCargoLabo")) {
				jButtonEliminarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCargoLabo")) {
				jButtonCancelarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCargoLabo")) {
				jButtonCancelarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCargoLabo")) {
				jButtonCancelarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCargoLabo")) {
				jButtonCerrarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCargoLabo")) {
				jButtonCerrarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCargoLabo")) {
				jButtonCerrarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCargoLabo")) {
				jButtonMostrarOcultarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCargoLabo")) {
				jButtonCancelarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCargoLabo")) {
				jButtonCopiarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCargoLabo")) {
				jButtonVerFormTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCargoLabo")) {
				jButtonCopiarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCargoLabo")) {
				jButtonVerFormTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCargoLabo")) {
				jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCargoLabo")) {
				jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCargoLabo")) {
				jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCargoLabo")) {
				jButtonAnterioresTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCargoLabo")) {
				jButtonAnterioresTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCargoLabo")) {
				jButtonAnterioresTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCargoLabo")) {
				jButtonSiguientesTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCargoLabo")) {
				jButtonSiguientesTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCargoLabo")) {
				jButtonSiguientesTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCargoLabo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCargoLabo")) {
				jButtonAbrirOrderByTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCargoLabo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCargoLabo")) {
				jButtonMostrarOcultarTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCargoLabo")) {
				jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCargoLabo")) {
				jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCargoLabo")) {
				jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCargoLabo")) {
				jButtonCerrarReporteDinamicoTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCargoLabo")) {
				jButtonGenerarReporteDinamicoTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCargoLabo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCargoLabo")) {
				jButtonCerrarImportacionTipoCargoLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCargoLabo")) {
				
				jButtonGenerarImportacionTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCargoLabo")) {
				
				jButtonAbrirImportacionTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCargoLabo")) {
				jComboBoxTiposAccionesTipoCargoLaboActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCargoLabo")) {
				jComboBoxTiposRelacionesTipoCargoLaboActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCargoLabo")) {
				jComboBoxTiposAccionesTipoCargoLaboActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCargoLabo")) {
				
				jComboBoxTiposSeleccionarTipoCargoLaboActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCargoLabo")) {
				jTextFieldValorCampoGeneralTipoCargoLaboActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCargoLabo")) {
				jButtonAbrirOrderByTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCargoLabo")) {
				jButtonAbrirOrderByTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCargoLabo")) {
				jButtonCerrarOrderByTipoCargoLaboActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCargoLaboBusqueda")) {
				this.jButtonidTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCargoLaboUpdate")) {
				this.jButtonid_empresaTipoCargoLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCargoLaboBusqueda")) {
				this.jButtonid_empresaTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCargoLaboBusqueda")) {
				this.jButtoncodigoTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCargoLaboBusqueda")) {
				this.jButtonnombreTipoCargoLaboBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoCargoLabo")) {
				this.jButtonBusquedaPorCodigoTipoCargoLaboActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoCargoLabo")) {
				this.jButtonBusquedaPorNombreTipoCargoLaboActionPerformed(evt);
			}
			
			;
			
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCargoLabo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCargoLabo tipocargolaboLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocargolaboLocal=this.tipocargolabo;
			} else {
				tipocargolaboLocal=this.tipocargolaboAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
							
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
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
			
			


			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
								
						
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
								
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
							
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
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
			
			


			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
								
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCargoLabo")) {
					jCheckBoxSeleccionarTodosTipoCargoLaboItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCargoLabo")) {
					jCheckBoxSeleccionadosTipoCargoLaboItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCargoLabo")) {
					
				}
				
				


				
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
												
				
				


				
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
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
			
			


			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargoLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargolabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargolabo);
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
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
				
				


				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargoLabo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargoLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargoLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargolaboAnterior =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCargoLabo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCargoLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCargoLabo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocargolabo =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocargolabo =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocargolabo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCargoLabo")) {
				
				}
				
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCargoLabo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCargoLabo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCargoLabo")) {
			
			}
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCargoLabo();
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCargoLabo")) {
				jButtonDuplicarTipoCargoLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCargoLabo")) {
				jButtonCopiarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCargoLabo")) {
				jButtonVerFormTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCargoLabo")) {
				jButtonNuevoTipoCargoLaboActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCargoLabo")) {
				jButtonModificarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCargoLabo")) {
				jButtonActualizarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCargoLabo")) {
				jButtonEliminarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCargoLabo")) {
				jButtonCancelarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCargoLabo")) {
				jButtonCerrarTipoCargoLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCargoLabo")) {
				jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCargoLabo")) {
				jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCargoLabo")) {
				jButtonAbrirOrderByTipoCargoLaboActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCargoLabo")) {
				jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCargoLabo")) {
				jButtonAnterioresTipoCargoLaboActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCargoLabo")) {
				jButtonSiguientesTipoCargoLaboActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCargoLaboBusqueda")) {
				this.jButtonidTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCargoLaboUpdate")) {
				this.jButtonid_empresaTipoCargoLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCargoLaboBusqueda")) {
				this.jButtonid_empresaTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCargoLaboBusqueda")) {
				this.jButtoncodigoTipoCargoLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCargoLaboBusqueda")) {
				this.jButtonnombreTipoCargoLaboBusquedaActionPerformed(evt);
			}
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCargoLabo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCargoLabo")) {
				closingInternalFrameTipoCargoLabo();
				
			} else if(sTipo.equals("jButtonCancelarTipoCargoLabo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCargoLabo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCargoLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoCargoLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCargoLabo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCargoLaboActionPerformed(null);
			}
			
			TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocargolabo,new Object(),this.tipocargolaboParameterGeneral,this.tipocargolaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCargoLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCargoLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCargoLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocargolabo)) {
			if(!esControlTabla) {
				if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);			
				}
				
				if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCargoLabo(this.tipocargolabo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocargolaboReturnGeneral=tipocargolaboLogic.procesarEventosTipoCargoLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargolaboLogic.getTipoCargoLabos(),this.tipocargolabo,this.tipocargolaboParameterGeneral,this.isEsNuevoTipoCargoLabo,classes);//this.tipocargolaboLogic.getTipoCargoLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCargoLabo(this.tipocargolaboReturnGeneral,this.tipocargolaboBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCargoLabo(classes,this.tipocargolaboReturnGeneral,this.tipocargolaboBean,false);
					}
						
					if(this.tipocargolaboReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo());	
					}
						
					if(this.tipocargolaboReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo(),classes);//this.tipocargolaboBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCargoLabo(this.tipocargolabo,classes);//this.tipocargolaboBean);									
				}
			
				if(TipoCargoLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCargoLabo(this.tipocargolabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargoLabo(this.tipocargolabo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocargolaboAnterior!=null) {
						this.tipocargolabo=this.tipocargolaboAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocargolaboReturnGeneral=tipocargolaboLogic.procesarEventosTipoCargoLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargolaboLogic.getTipoCargoLabos(),this.tipocargolabo,this.tipocargolaboParameterGeneral,this.isEsNuevoTipoCargoLabo,classes);//this.tipocargolaboLogic.getTipoCargoLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocargolaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocargolaboReturnGeneral.getTipoCargoLabo(),tipocargolaboLogic.getTipoCargoLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocargolaboReturnGeneral.getTipoCargoLabo(),this.tipocargolabos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCargoLabo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCargoLabo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCargoLabo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCargoLabo() throws Exception {
		
		TipoCargoLaboModel tipocargolaboModel=(TipoCargoLaboModel)this.jTableDatosTipoCargoLabo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargolaboModel.tipocargolabos=this.tipocargolaboLogic.getTipoCargoLabos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocargolaboModel.tipocargolabos=this.tipocargolabos;
		}
		
		
		((TipoCargoLaboModel) this.jTableDatosTipoCargoLabo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCargoLabo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocargolaboAnterior(),this.tipocargolaboLogic.getTipoCargoLabos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocargolaboAnterior(),this.tipocargolabos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCargoLabo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCargoLabo(TipoCargoLabo tipocargolabo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipocargolabo.getClientes());
					this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
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
										
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargolabo,new Object(),generalEntityParameterGeneral,this.tipocargolaboReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCargoLaboConstantesFunciones.getClassesRelationshipsOfTipoCargoLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCargoLaboConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCargoLabo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCargoLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCargoLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargolabo,new Object(),generalEntityParameterGeneral,this.tipocargolaboReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCargoLabo(TipoCargoLaboBean tipocargolaboBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipocargolabo.getClientes());
					this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCargoLabo(ArrayList<Classe> classes,TipoCargoLaboReturnGeneral tipocargolaboReturnGeneral,TipoCargoLaboBean tipocargolaboBean,Boolean conDefault) throws Exception {
		
			this.tipocargolaboBean.setClientes(tipocargolaboReturnGeneral.getTipoCargoLabo().getClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCargoLabo(TipoCargoLabo tipocargolabo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tipocargolabo.setClientes(this.jInternalFrameDetalleFormTipoCargoLabo.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocargolabo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCargoLabo = new TipoCargoLaboDetalleFormJInternalFrame(jDesktopPane,this.tipocargolaboSessionBean.getConGuardarRelaciones(),this.tipocargolaboSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.setVisible(false);
		this.jInternalFrameDetalleFormTipoCargoLabo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCargoLabo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCargoLabo.tipocargolaboLogic=this.tipocargolaboLogic;
		
		this.cargarCombosFrameForeignKeyTipoCargoLabo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCargoLabo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCargoLabo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCargoLabo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCargoLabo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCargoLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCargoLabo"));
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoCargoLabo"));

		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCargoLabo"));
					
		this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemModificarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCargoLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCargoLabo"));
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCargoLabo"));
						
		this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemActualizarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCargoLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoCargoLabo"));
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCargoLabo"));
								
		this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemEliminarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCargoLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoCargoLabo"));
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCargoLabo"));
					
		this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemCancelarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCargoLabo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemDetalleCerrarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCargoLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargoLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargoLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCargoLabo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonidTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargoLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtoncodigoTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonnombreTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargoLaboBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCargoLabo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCargoLabo"));
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCargoLabo"));
		}
		
		this.jTableDatosTipoCargoLabo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCargoLabo"));
		
		this.jTableDatosTipoCargoLabo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCargoLabo"));
		
		this.jButtonNuevoTipoCargoLabo.addActionListener(new ButtonActionListener(this,"NuevoTipoCargoLabo"));
		
		this.jButtonDuplicarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"DuplicarTipoCargoLabo"));
		
		this.jButtonCopiarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"CopiarTipoCargoLabo"));
		
		this.jButtonVerFormTipoCargoLabo.addActionListener(new ButtonActionListener(this,"VerFormTipoCargoLabo"));
		
		
		this.jButtonNuevoToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCargoLabo"));
			
		this.jButtonDuplicarToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCargoLabo"));
			
		this.jMenuItemNuevoTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCargoLabo"));
			
		this.jMenuItemDuplicarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCargoLabo"));		
		
		
		this.jButtonNuevoRelacionesTipoCargoLabo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCargoLabo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCargoLabo"));
			
		this.jMenuItemNuevoRelacionesTipoCargoLabo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCargoLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoCargoLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonModificarToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCargoLabo"));
			
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemModificarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCargoLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCargoLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonActualizarToolBarTipoCargoLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCargoLabo"));
				
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemActualizarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCargoLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoCargoLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonEliminarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCargoLabo"));
						
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemEliminarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCargoLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoCargoLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonCancelarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCargoLabo"));
			
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemCancelarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCargoLabo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCargoLabo"));		
		
		
		this.jButtonCerrarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CerrarTipoCargoLabo"));
		
		
		this.jButtonCerrarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCargoLabo"));
			
		this.jMenuItemCerrarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCargoLabo"));
			
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jMenuItemDetalleCerrarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCargoLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCargoLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargoLabo"));
		}
		
		this.jButtonCopiarToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCargoLabo"));
			
		this.jButtonVerFormToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCargoLabo"));
		
		this.jMenuItemGuardarCambiosTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCargoLabo"));
			
		this.jMenuItemCopiarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCargoLabo"));		
		
		this.jMenuItemVerFormTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCargoLabo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCargoLabo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCargoLabo"));
			
		this.jMenuItemGuardarCambiosTablaTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCargoLabo"));		
		
		
		
		this.jButtonRecargarInformacionTipoCargoLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCargoLabo"));
					
		this.jButtonRecargarInformacionToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCargoLabo"));
		
		this.jMenuItemRecargarInformacionTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCargoLabo"));		
		
		
		
		this.jButtonAnterioresTipoCargoLabo.addActionListener (new ButtonActionListener(this,"AnterioresTipoCargoLabo"));
		
		
		this.jButtonAnterioresToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCargoLabo"));
		
		this.jMenuItemAnterioresTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCargoLabo"));		
		
		
		this.jButtonSiguientesTipoCargoLabo.addActionListener (new ButtonActionListener(this,"SiguientesTipoCargoLabo"));
		
		
		this.jButtonSiguientesToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCargoLabo"));
			
		this.jMenuItemSiguientesTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCargoLabo"));
			
		this.jMenuItemAbrirOrderByTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCargoLabo"));
			
		this.jMenuItemMostrarOcultarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCargoLabo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCargoLabo"));
			
		this.jMenuItemDetalleMostarOcultarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCargoLabo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCargoLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCargoLabo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCargoLabo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCargoLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCargoLabo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCargoLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCargoLabo"));

		this.jCheckBoxSeleccionadosTipoCargoLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCargoLabo"));
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCargoLabo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCargoLabo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCargoLabo"));
			
		this.jComboBoxTiposAccionesTipoCargoLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCargoLabo"));
					
		this.jComboBoxTiposSeleccionarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCargoLabo"));
			
		this.jTextFieldValorCampoGeneralTipoCargoLabo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCargoLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonidTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargoLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtoncodigoTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonnombreTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargoLaboBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoCargoLabo.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCargoLabo"));

			this.jButtonBusquedaPorNombreTipoCargoLabo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCargoLabo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCargoLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargoLabo"));
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargoLabo"));
				this.jInternalFrameReporteDinamicoTipoCargoLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargoLabo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCargoLabo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargoLabo"));				
			//this.jButtonGenerarReporteDinamicoTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargoLabo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargoLabo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCargoLabo!=null) {
				this.jInternalFrameImportacionTipoCargoLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCargoLabo"));
				this.jInternalFrameImportacionTipoCargoLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCargoLabo"));
				this.jInternalFrameImportacionTipoCargoLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCargoLabo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCargoLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCargoLabo"));
			
			this.jButtonAbrirOrderByToolBarTipoCargoLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCargoLabo"));			
			
			if(this.jInternalFrameOrderByTipoCargoLabo!=null) {
				this.jInternalFrameOrderByTipoCargoLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCargoLabo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargoLabo.jTabbedPaneRelacionesTipoCargoLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCargoLabo"));
		
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
            		closingInternalFrameTipoCargoLabo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCargoLabo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCargoLabo = (JInternalFrameBase)event.getSource();
	            	
	            TipoCargoLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoCargoLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCargoLabo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCargoLaboActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCargoLabo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCargoLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCargoLabo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCargoLabo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCargoLabo";
		inputMap = this.jButtonNuevoTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCargoLaboActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargoLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCargoLabo";
		inputMap = this.jButtonNuevoRelacionesTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCargoLaboActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCargoLabo";
		inputMap = this.jButtonModificarTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCargoLabo";
		inputMap = this.jButtonActualizarTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCargoLabo";
		inputMap = this.jButtonEliminarTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCargoLabo";
		inputMap = this.jButtonCancelarTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCargoLabo";
		inputMap = this.jButtonCerrarTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCargoLabo";
		inputMap = this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonGuardarCambiosTipoCargoLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCargoLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCargoLabo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCargoLaboItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCargoLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCargoLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCargoLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCargoLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCargoLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCargoLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonidTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargoLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonid_empresaTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtoncodigoTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargoLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargoLabo.jButtonnombreTipoCargoLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargoLaboBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoCargoLabo.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCargoLabo"));

		this.jButtonBusquedaPorNombreTipoCargoLabo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCargoLabo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCargoLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCargoLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCargoLaboActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCargoLabo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCargoLabo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
					tipocargolaboAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargoLabo tipocargolaboAux:tipocargolabos) {
					tipocargolaboAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCargoLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
						tipocargolaboAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargoLabo tipocargolaboAux:tipocargolabos) {
						tipocargolaboAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargoLabo tipocargolaboAux:tipocargolabos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCargoLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCargoLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCargoLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCargoLabo.getSelectedRows();
			
			TipoCargoLabo tipocargolaboLocal=new TipoCargoLabo();
			
			//this.seleccionarTodosTipoCargoLabo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargolaboLocal =(TipoCargoLabo) this.tipocargolaboLogic.getTipoCargoLabos().toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocargolaboLocal =(TipoCargoLabo) this.tipocargolabos.toArray()[this.jTableDatosTipoCargoLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocargolaboLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
						tipocargolaboAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargoLabo tipocargolaboAux:tipocargolabos) {
						tipocargolaboAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCargoLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCargoLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCargoLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCargoLaboItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCargoLaboParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCargoLaboActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCargoLabo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCargoLabo tipocargolaboAux:this.tipocargolaboLogic.getTipoCargoLabos()) {
				
						if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocargolaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocargolaboAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargoLabo tipocargolaboAux:tipocargolabos) {
					
						if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocargolaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocargolaboAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCargoLaboActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCargoLabo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCargoLabo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCargoLabo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCargoLabo(conSplash);
				
					this.generarReporteTipoCargoLabosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCargoLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCargoLabosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCargoLabosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCargoLabo();
				
				this.exportarTipoCargoLabosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCargoLabos();
				//this.importarTipoCargoLabos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCargoLabo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCargoLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cargo Laboral", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCargoLabo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCargoLabo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCargoLabo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargoLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxTiposAccionesFormularioTipoCargoLabo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCargoLabo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCargoLabo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCargoLaboActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCargoLabo();
			
			if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
			TipoCargoLabo tipocargolabo=new TipoCargoLabo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCargoLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCargoLabo.getSelectedItem();
			
			
			
			
			tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocargolabosSeleccionados.size()==1) {
				for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
					tipocargolabo=tipocargolaboAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tipocargolabo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCargoLabo();
			
      		//this.finishProcessTipoCargoLabo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCargoLaboReturnGeneral() throws Exception {
		if(this.tipocargolaboReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocargolaboReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocargolaboReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocargolaboReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocargolaboReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocargolaboReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCargoLabo(false);
		}
		
		if(this.tipocargolaboReturnGeneral.getConRetornoLista() || this.tipocargolaboReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocargolaboReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocargolaboLogic.setTipoCargoLabos(this.tipocargolaboReturnGeneral.getTipoCargoLabos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocargolaboReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocargolaboLogic.setTipoCargoLabo(this.tipocargolaboReturnGeneral.getTipoCargoLabo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCargoLabo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCargoLabo() throws Exception {
		
		
	}
	
	public ArrayList<TipoCargoLabo> getTipoCargoLabosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCargoLabo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCargoLabo tipocargolaboAux:tipocargolaboLogic.getTipoCargoLabos()) {
					if(tipocargolaboAux.getIsSelected()) {
						tipocargolabosSeleccionados.add(tipocargolaboAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargoLabo tipocargolaboAux:this.tipocargolabos) {
					if(tipocargolaboAux.getIsSelected()) {
						tipocargolabosSeleccionados.add(tipocargolaboAux);				
					}
				}
			}
			
			if(tipocargolabosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocargolabosSeleccionados.addAll(this.tipocargolaboLogic.getTipoCargoLabos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocargolabosSeleccionados.addAll(this.tipocargolabos);				
					}
				}
			}
		} else {
			tipocargolabosSeleccionados.add(this.tipocargolabo);
		}
		
		return tipocargolabosSeleccionados;
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
	
	public void generarReporteTipoCargoLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCargoLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCargoLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCargoLabosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCargoLabosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCargoLabosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cargo Laboral",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCargoLabosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCargoLabo();
		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCargoLabo();
		
		
		//this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados ,tipocargolaboImplementable,tipocargolaboImplementableHome);
	}
	
	public void mostrarImportacionTipoCargoLabos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCargoLabo();
		
		this.abrirFrameImportacionTipoCargoLabo();		
		
			
		//this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados ,tipocargolaboImplementable,tipocargolaboImplementableHome);
	}
	
	public void importarTipoCargoLabos() throws Exception {		
	
	}
	
	public void exportarTipoCargoLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCargoLabosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCargoLabosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCargoLabosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cargo Laboral",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCargoLabo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCargoLabo(tipocargolaboAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocargolaboAux.setsDetalleGeneralEntityReporte(tipocargolaboAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCargoLabo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCargoLaboConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargoLaboConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargoLaboConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargoLaboConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCargoLabo(TipoCargoLabo tipocargolabo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocargolabo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargolabo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargolabo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargolabo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargolabo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCargoLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCargoLabo(row);				
				iRow++;
			}				
			
			for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCargoLabo(tipocargolaboAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCargoLabosSeleccionados() throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();		
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargolabo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocargolabos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocargolabo");
			//elementRoot.appendChild(element);
		
			for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
				element = document.createElement("tipocargolabo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCargoLabo(tipocargolaboAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cargo Laboral",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCargoLabo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCargoLabo(TipoCargoLabo tipocargolabo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargolabo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargolabo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargolabo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargolabo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCargoLabo(TipoCargoLabo tipocargolabo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCargoLaboConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocargolabo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCargoLaboConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocargolabo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCargoLaboConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocargolabo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCargoLaboConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocargolabo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCargoLaboConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocargolabo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCargoLabosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCargoLabo> tipocargolabosSeleccionados=new ArrayList<TipoCargoLabo>();
		
		tipocargolabosSeleccionados=this.getTipoCargoLabosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCargoLabo(tipocargolabosSeleccionados);
		
		this.generarReporteTipoCargoLabos("Todos",tipocargolabosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCargoLabo(ArrayList<TipoCargoLabo> tipocargolabosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCargoLabo tipocargolaboAux:tipocargolabosSeleccionados) {
				tipocargolaboAux.setsDetalleGeneralEntityReporte(tipocargolaboAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocargolaboAux.setsDescripcionGeneralEntityReporte1(tipocargolaboAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocargolaboAux.setsDescripcionGeneralEntityReporte1(tipocargolaboAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocargolaboAux.setsDescripcionGeneralEntityReporte1(tipocargolaboAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargoLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCargoLabo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCargoLabo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=true;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=true;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=true;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=true;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=true;
			this.isVisibilidadCeldaModificarTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
			this.isVisibilidadCeldaModificarTipoCargoLabo=true;
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
			this.isVisibilidadCeldaCancelarTipoCargoLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargoLabo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCargoLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=true;
		} else {
			this.actualizarEstadoPanelsTipoCargoLabo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCargoLabo=false;
			//this.isVisibilidadCeldaVerFormTipoCargoLabo=false;
			this.isVisibilidadCeldaDuplicarTipoCargoLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocargolaboSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			if(!tipocargolaboSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;												
			}
			
			this.jButtonCerrarTipoCargoLabo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCargoLabo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocargolabo)) {
			this.isVisibilidadCeldaActualizarTipoCargoLabo=false;
			this.isVisibilidadCeldaEliminarTipoCargoLabo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCargoLabo() {
		this.isVisibilidadCeldaNuevoTipoCargoLabo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCargoLabo=false;
	}
	
	public void actualizarEstadoPanelsTipoCargoLabo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCargoLabo!=null) {
				this.jScrollPanelDatosEdicionTipoCargoLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargoLabo!=null) {
				this.jScrollPanelDatosTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargoLabo!=null) {
				this.jPanelPaginacionTipoCargoLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
					this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCargoLabo!=null) {
				this.jTabbedPaneBusquedasTipoCargoLabo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCargoLabo!=null) {
				this.jPanelParametrosReportesTipoCargoLabo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoCargoLabo.remove(jPanelBusquedaPorCodigoTipoCargoLabo);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoCargoLabo.remove(jPanelBusquedaPorNombreTipoCargoLabo);}
		}
		
	}
	
	

	public String registrarSesionTipoCargoLaboParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tipocargolaboSessionBean==null) {
				this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setsPathNavegacionActual(tipocargolaboSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoCargoLaboConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargoLabo(true);
			this.jInternalFrameDetalleFormTipoCargoLabo.clienteSessionBean.setlidTipoCargoLaboActual(this.idTipoCargoLaboActual);

			tipocargolaboSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCargoLabo(true);
			tipocargolaboSessionBean.setlIdTipoCargoLaboActualForeignKey(this.idTipoCargoLaboActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCargoLaboSessionBean tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		
		if(this.tipocargolaboSessionBean==null) {
			this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		}
		
		this.tipocargolaboSessionBean.setsUltimaBusquedaTipoCargoLabo(this.getsAccionBusqueda());
		this.tipocargolaboSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocargolaboSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipocargolaboSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocargolaboSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocargolaboSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCargoLaboSessionBean tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		
		if(this.tipocargolaboSessionBean==null) {
			this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		}
		
		if(this.tipocargolaboSessionBean.getsUltimaBusquedaTipoCargoLabo()!=null&&!this.tipocargolaboSessionBean.getsUltimaBusquedaTipoCargoLabo().equals("")) {
			this.setsAccionBusqueda(tipocargolaboSessionBean.getsUltimaBusquedaTipoCargoLabo());
			this.setiNumeroPaginacion(tipocargolaboSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocargolaboSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipocargolaboSessionBean.getcodigo());
				tipocargolaboSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocargolaboSessionBean.getnombre());
				tipocargolaboSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocargolaboSessionBean.getid_empresa());
				tipocargolaboSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocargolaboSessionBean.setsUltimaBusquedaTipoCargoLabo("");
		this.tipocargolaboSessionBean.setiNumeroPaginacion(TipoCargoLaboConstantesFunciones.INUMEROPAGINACION);
		this.tipocargolaboSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCargoLabo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCargoLabo() {
		this.updateBorderResaltarBusquedasFormularioTipoCargoLabo();
		this.updateVisibilidadBusquedasFormularioTipoCargoLabo();
		this.updateHabilitarBusquedasFormularioTipoCargoLabo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCargoLabo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCargoLabo.getComponents().length>0) {
	

		if(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorCodigoTipoCargoLabo!=null) {
			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCargoLabo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
				jPanel.setBorder(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorCodigoTipoCargoLabo);
			}
		}

		if(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorNombreTipoCargoLabo!=null) {
			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCargoLabo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
				jPanel.setBorder(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorNombreTipoCargoLabo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCargoLabo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCargoLabo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCargoLabo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocargolaboConstantesFunciones.mostrarBusquedaPorCodigoTipoCargoLabo);
			if(!this.tipocargolaboConstantesFunciones.mostrarBusquedaPorCodigoTipoCargoLabo && index>-1) {
				this.jTabbedPaneBusquedasTipoCargoLabo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCargoLabo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocargolaboConstantesFunciones.mostrarBusquedaPorNombreTipoCargoLabo);
			if(!this.tipocargolaboConstantesFunciones.mostrarBusquedaPorNombreTipoCargoLabo && index>-1) {
				this.jTabbedPaneBusquedasTipoCargoLabo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCargoLabo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCargoLabo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCargoLabo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocargolaboConstantesFunciones.activarBusquedaPorCodigoTipoCargoLabo);
				this.jTabbedPaneBusquedasTipoCargoLabo.setEnabledAt(index,this.tipocargolaboConstantesFunciones.activarBusquedaPorCodigoTipoCargoLabo);
			}

			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCargoLabo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocargolaboConstantesFunciones.activarBusquedaPorNombreTipoCargoLabo);
				this.jTabbedPaneBusquedasTipoCargoLabo.setEnabledAt(index,this.tipocargolaboConstantesFunciones.activarBusquedaPorNombreTipoCargoLabo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCargoLabo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCargoLabo);

			this.jTabbedPaneBusquedasTipoCargoLabo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);

			this.tipocargolaboConstantesFunciones.setResaltarBusquedaPorCodigoTipoCargoLabo(resaltar);

			jPanel.setBorder(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorCodigoTipoCargoLabo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoCargoLabo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCargoLabo);

			this.jTabbedPaneBusquedasTipoCargoLabo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCargoLabo.getComponent(index);

			this.tipocargolaboConstantesFunciones.setResaltarBusquedaPorNombreTipoCargoLabo(resaltar);

			jPanel.setBorder(this.tipocargolaboConstantesFunciones.resaltarBusquedaPorNombreTipoCargoLabo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCargoLabo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCargoLabo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCargoLabo();
		this.updateVisibilidadResaltarControlesFormularioTipoCargoLabo();
		this.updateHabilitarResaltarControlesFormularioTipoCargoLabo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCargoLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocargolaboConstantesFunciones.resaltaridTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo!=null) {this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setBorder(this.tipocargolaboConstantesFunciones.resaltaridTipoCargoLabo);}
		if(this.tipocargolaboConstantesFunciones.resaltarid_empresaTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo!=null) {this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setBorder(this.tipocargolaboConstantesFunciones.resaltarid_empresaTipoCargoLabo);}
		if(this.tipocargolaboConstantesFunciones.resaltarcodigoTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo!=null) {this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setBorder(this.tipocargolaboConstantesFunciones.resaltarcodigoTipoCargoLabo);}
		if(this.tipocargolaboConstantesFunciones.resaltarnombreTipoCargoLabo!=null && this.jInternalFrameDetalleFormTipoCargoLabo!=null) {this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setBorder(this.tipocargolaboConstantesFunciones.resaltarnombreTipoCargoLabo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCargoLabo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
	
		//this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostraridTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jPanelidTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostraridTipoCargoLabo);
		//this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarid_empresaTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jPanelid_empresaTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarid_empresaTipoCargoLabo);
		//this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarcodigoTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jPanelcodigoTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarcodigoTipoCargoLabo);
		//this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarnombreTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jPanelnombreTipoCargoLabo.setVisible(this.tipocargolaboConstantesFunciones.mostrarnombreTipoCargoLabo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCargoLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCargoLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCargoLabo!=null) {
	
		this.jInternalFrameDetalleFormTipoCargoLabo.jLabelidTipoCargoLabo.setEnabled(this.tipocargolaboConstantesFunciones.activaridTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jComboBoxid_empresaTipoCargoLabo.setEnabled(this.tipocargolaboConstantesFunciones.activarid_empresaTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jTextFieldcodigoTipoCargoLabo.setEnabled(this.tipocargolaboConstantesFunciones.activarcodigoTipoCargoLabo);
		this.jInternalFrameDetalleFormTipoCargoLabo.jTextAreanombreTipoCargoLabo.setEnabled(this.tipocargolaboConstantesFunciones.activarnombreTipoCargoLabo);
		}
	}
	
		
}