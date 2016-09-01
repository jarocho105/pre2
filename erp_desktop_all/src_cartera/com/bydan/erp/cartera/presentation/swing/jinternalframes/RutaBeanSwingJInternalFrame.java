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

import com.bydan.erp.cartera.util.RutaConstantesFunciones;
import com.bydan.erp.cartera.util.RutaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RutaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RutaBean;
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
public class RutaBeanSwingJInternalFrame extends RutaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RutaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Ruta> rutaValidator = new ClassValidator<Ruta>(Ruta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Ruta ruta;	
	public Ruta rutaAux;
	public Ruta rutaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Ruta rutaTotales;
	public Long idRutaActual;
	public Long iIdNuevoRuta=0L;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

	public String sFinalQueryComboSectorOrigen="";

	public List<Sector> sectororigensForeignKey;

	public List<Sector> getsectororigensForeignKey() {
		return sectororigensForeignKey;
	}

	public void setsectororigensForeignKey(List<Sector> sectororigensForeignKey) {
		this.sectororigensForeignKey = sectororigensForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sector sectororigenForeignKey;

	public Sector getsectororigenForeignKey() {
		return sectororigenForeignKey;
	}

	public void setsectororigenForeignKey(Sector sectororigenForeignKey) {
		this.sectororigenForeignKey = sectororigenForeignKey;
	}

	public String sFinalQueryComboSectorDestino="";

	public List<Sector> sectordestinosForeignKey;

	public List<Sector> getsectordestinosForeignKey() {
		return sectordestinosForeignKey;
	}

	public void setsectordestinosForeignKey(List<Sector> sectordestinosForeignKey) {
		this.sectordestinosForeignKey = sectordestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sector sectordestinoForeignKey;

	public Sector getsectordestinoForeignKey() {
		return sectordestinoForeignKey;
	}

	public void setsectordestinoForeignKey(Sector sectordestinoForeignKey) {
		this.sectordestinoForeignKey = sectordestinoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
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
	
	public Boolean isPermisoTodoRuta;
	public Boolean isPermisoNuevoRuta;
	public Boolean isPermisoActualizarRuta;
	public Boolean isPermisoActualizarOriginalRuta;
	public Boolean isPermisoEliminarRuta;
	public Boolean isPermisoGuardarCambiosRuta;
	public Boolean isPermisoConsultaRuta;
	public Boolean isPermisoBusquedaRuta;
	public Boolean isPermisoReporteRuta;
	public Boolean isPermisoPaginacionMedioRuta;
	public Boolean isPermisoPaginacionAltoRuta;
	public Boolean isPermisoPaginacionTodoRuta;
	public Boolean isPermisoCopiarRuta;
	public Boolean isPermisoVerFormRuta;
	public Boolean isPermisoDuplicarRuta;
	public Boolean isPermisoOrdenRuta;
	
	
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
	
	public RutaParameterReturnGeneral rutaReturnGeneral;
	public RutaParameterReturnGeneral rutaParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRuta=false;
	public Boolean esParaAccionDesdeFormularioRuta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RutaSessionBeanAdditional rutaSessionBeanAdditional=null;
	
	public RutaSessionBeanAdditional getRutaSessionBeanAdditional() {
		return this.rutaSessionBeanAdditional;
	}
	
	public void setRutaSessionBeanAdditional(RutaSessionBeanAdditional rutaSessionBeanAdditional) {
		try {
			this.rutaSessionBeanAdditional=rutaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RutaBeanSwingJInternalFrameAdditional rutaBeanSwingJInternalFrameAdditional=null;
	//public class RutaBeanSwingJInternalFrame
	
	public RutaBeanSwingJInternalFrameAdditional getRutaBeanSwingJInternalFrameAdditional() {
		return this.rutaBeanSwingJInternalFrameAdditional;
	}
	
	public void setRutaBeanSwingJInternalFrameAdditional(RutaBeanSwingJInternalFrameAdditional rutaBeanSwingJInternalFrameAdditional) {
		try {
			this.rutaBeanSwingJInternalFrameAdditional=rutaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RutaLogic rutaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Ruta rutaBean;
	public RutaConstantesFunciones rutaConstantesFunciones;
	//public RutaParameterReturnGeneral rutaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	public SectorLogic sectororigenLogic;
	public SectorLogic sectordestinoLogic;
	
	//PARAMETROS
	
	
	//public List<Ruta> rutas;	
	//public List<Ruta> rutasEliminados;
	//public List<Ruta> rutasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRuta=false;
	public Boolean isVisibilidadCeldaDuplicarRuta=true;
	public Boolean isVisibilidadCeldaCopiarRuta=true;
	public Boolean isVisibilidadCeldaVerFormRuta=true;
	public Boolean isVisibilidadCeldaOrdenRuta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRuta=false;
	public Boolean isVisibilidadCeldaModificarRuta=false;
	public Boolean isVisibilidadCeldaActualizarRuta=false;
	public Boolean isVisibilidadCeldaEliminarRuta=false;
	public Boolean isVisibilidadCeldaCancelarRuta=false;
	public Boolean isVisibilidadCeldaGuardarRuta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRuta=false;	
	
	
	public Boolean isVisibilidadBusquedaPorDestino=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorOrigen=false;
	public Boolean isVisibilidadBusquedaPorPrecio=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdSectorDestino=false;
	public Boolean isVisibilidadFK_IdSectorOrigen=false;
	
	public Long getiIdNuevoRuta() {
		return this.iIdNuevoRuta;
	}

	public void setiIdNuevoRuta(Long iIdNuevoRuta) {
		this.iIdNuevoRuta = iIdNuevoRuta;
	}
	
	public Long getidRutaActual() {
		return this.idRutaActual;
	}

	public void setidRutaActual(Long idRutaActual) {
		this.idRutaActual = idRutaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Ruta getruta() {
		return this.ruta;
	}

	public void setruta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	public Ruta getrutaAux() {
		return this.rutaAux;
	}

	public void setrutaAux(Ruta rutaAux) {
		this.rutaAux = rutaAux;
	}				
	
	public Ruta getrutaAnterior() {
		return this.rutaAnterior;
	}

	public void setrutaAnterior(Ruta rutaAnterior) {
		this.rutaAnterior = rutaAnterior;
	}	
	
	public Ruta getrutaTotales() {
		return this.rutaTotales;
	}

	public void setrutaTotales(Ruta rutaTotales) {
		this.rutaTotales = rutaTotales;
	}	
	
	public Ruta getrutaBean() {
		return this.rutaBean;
	}

	public void setrutaBean(Ruta rutaBean) {
		this.rutaBean = rutaBean;
	}	
	
	public RutaParameterReturnGeneral getrutaReturnGeneral() {
		return this.rutaReturnGeneral;
	}

	public void setrutaReturnGeneral(RutaParameterReturnGeneral rutaReturnGeneral) {
		this.rutaReturnGeneral = rutaReturnGeneral;
	}	
	
	
	public String destinoBusquedaPorDestino="";

	public String getdestinoBusquedaPorDestino() {
		return this.destinoBusquedaPorDestino;
	}

	public void setdestinoBusquedaPorDestino(String destinoBusquedaPorDestino) {
		this.destinoBusquedaPorDestino = destinoBusquedaPorDestino;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String origenBusquedaPorOrigen="";

	public String getorigenBusquedaPorOrigen() {
		return this.origenBusquedaPorOrigen;
	}

	public void setorigenBusquedaPorOrigen(String origenBusquedaPorOrigen) {
		this.origenBusquedaPorOrigen = origenBusquedaPorOrigen;
	}

	public Double precioBusquedaPorPrecio=0.0;

	public Double getprecioBusquedaPorPrecio() {
		return this.precioBusquedaPorPrecio;
	}

	public void setprecioBusquedaPorPrecio(Double precioBusquedaPorPrecio) {
		this.precioBusquedaPorPrecio = precioBusquedaPorPrecio;
	}

	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_sector_destinoFK_IdSectorDestino=-1L;

	public Long getid_sector_destinoFK_IdSectorDestino() {
		return this.id_sector_destinoFK_IdSectorDestino;
	}

	public void setid_sector_destinoFK_IdSectorDestino(Long id_sector_destinoFK_IdSectorDestino) {
		this.id_sector_destinoFK_IdSectorDestino = id_sector_destinoFK_IdSectorDestino;
	}

	public Long id_sector_origenFK_IdSectorOrigen=-1L;

	public Long getid_sector_origenFK_IdSectorOrigen() {
		return this.id_sector_origenFK_IdSectorOrigen;
	}

	public void setid_sector_origenFK_IdSectorOrigen(Long id_sector_origenFK_IdSectorOrigen) {
		this.id_sector_origenFK_IdSectorOrigen = id_sector_origenFK_IdSectorOrigen;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RutaLogic getRutaLogic()	{		
		return rutaLogic;
	}

	public void setRutaLogic(RutaLogic rutaLogic) {
		this.rutaLogic = rutaLogic;
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
	
	public Boolean getIsEsNuevoRuta() {
		return isEsNuevoRuta;
	}

	public void setIsEsNuevoRuta(Boolean isEsNuevoRuta) {
		this.isEsNuevoRuta = isEsNuevoRuta;
	}

	public Boolean getEsParaAccionDesdeFormularioRuta() {
		return esParaAccionDesdeFormularioRuta;
	}
	
	public void setEsParaAccionDesdeFormularioRuta(Boolean esParaAccionDesdeFormularioRuta) {
		this.esParaAccionDesdeFormularioRuta = esParaAccionDesdeFormularioRuta;
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

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rutaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(rutaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(rutaSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

	public void cargarCombosSectorOrigensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sectororigensForeignKey=new ArrayList<Sector>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SectorLogic sectorLogic=new SectorLogic();

			//sectorLogic.getSectorDataAccess().setIsForForeingKeyData(true);

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorOrigen()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sectororigenLogic.getSectorDataAccess().setIsForForeingKeyData(true);

					sectorLogic.getTodosSectorsWithConnection(sFinalQuery,new Pagination());

					this.sectororigensForeignKey=sectorLogic.getSectors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSectorOrigen(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.getEntityWithConnection(rutaSessionBean.getlidSectorOrigenActual());
					this.sectororigensForeignKey.add(sectorLogic.getSector());
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

	public void cargarCombosSectorDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sectordestinosForeignKey=new ArrayList<Sector>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SectorLogic sectorLogic=new SectorLogic();

			//sectorLogic.getSectorDataAccess().setIsForForeingKeyData(true);

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sectordestinoLogic.getSectorDataAccess().setIsForForeingKeyData(true);

					sectorLogic.getTodosSectorsWithConnection(sFinalQuery,new Pagination());

					this.sectordestinosForeignKey=sectorLogic.getSectors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSectorDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.getEntityWithConnection(rutaSessionBean.getlidSectorDestinoActual());
					this.sectordestinosForeignKey.add(sectorLogic.getSector());
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

					if(this.ruta!=null) {
						this.ruta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRuta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRuta!=null) {
						if(this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRutaGenerico)throws Exception
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
				jComboBoxid_empresaRutaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRutaGenerico!=null && jComboBoxid_empresaRutaGenerico.getItemCount()>0) {
					jComboBoxid_empresaRutaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.ruta!=null) {
						this.ruta.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisRuta.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormRuta!=null) {
						if(this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisRuta!=null) {
						jComboBoxid_paisFK_IdPaisRuta.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisRuta!=null) {
							//jComboBoxid_paisFK_IdPaisRuta.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisRuta.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisRuta.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisRutaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisRutaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisRutaGenerico!=null && jComboBoxid_paisRutaGenerico.getItemCount()>0) {
					jComboBoxid_paisRutaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.ruta!=null) {
						this.ruta.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadRuta.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormRuta!=null) {
						if(this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadRutaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadRutaGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadRutaGenerico!=null && jComboBoxid_ciudadRutaGenerico.getItemCount()>0) {
					jComboBoxid_ciudadRutaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSectorOrigenForeignKey(Long idSectorOrigenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sector  sectororigenTemp=null;

			for(Sector sectororigenAux:sectororigensForeignKey) {
				if(sectororigenAux.getId()!=null && sectororigenAux.getId().equals(idSectorOrigenSeleccionado)) {
					sectororigenTemp=sectororigenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sectororigenTemp!=null) {

					if(this.ruta!=null) {
						this.ruta.setSectorOrigen(sectororigenTemp);
					}

					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setSelectedItem(sectororigenTemp);
					}
				} else {
					//jComboBoxid_sector_origenRuta.setSelectedItem(sectororigenTemp);
					if(this.jInternalFrameDetalleFormRuta!=null) {
						if(this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSectorOrigen") || sFormularioTipoBusqueda.equals("Todos")){
					if(sectororigenTemp!=null && jComboBoxid_sector_origenFK_IdSectorOrigenRuta!=null) {
						jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setSelectedItem(sectororigenTemp);
					} else {
						if(jComboBoxid_sector_origenFK_IdSectorOrigenRuta!=null) {
							//jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setSelectedItem(sectororigenTemp);
							if(jComboBoxid_sector_origenFK_IdSectorOrigenRuta.getItemCount()>0) {
								jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setSelectedIndex(0);
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

	public String getActualSectorOrigenForeignKeyDescripcion(Long idSectorOrigenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sector  sectororigenTemp=null;

			for(Sector sectororigenAux:sectororigensForeignKey) {
				if(sectororigenAux.getId()!=null && sectororigenAux.getId().equals(idSectorOrigenSeleccionado)) {
					sectororigenTemp=sectororigenAux;
					break;
				}
			}


			sDescripcion=SectorConstantesFunciones.getSectorDescripcion(sectororigenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSectorOrigenForeignKeyGenerico(Long idSectorOrigenSeleccionado,JComboBox jComboBoxid_sector_origenRutaGenerico)throws Exception
	{
		try
		{
			Sector  sectororigenTemp=null;

			for(Sector sectororigenAux:sectororigensForeignKey) {
				if(sectororigenAux.getId()!=null && sectororigenAux.getId().equals(idSectorOrigenSeleccionado)) {
					sectororigenTemp=sectororigenAux;
					break;
				}
			}

			if(sectororigenTemp!=null) {
				jComboBoxid_sector_origenRutaGenerico.setSelectedItem(sectororigenTemp);
			} else {
				if(jComboBoxid_sector_origenRutaGenerico!=null && jComboBoxid_sector_origenRutaGenerico.getItemCount()>0) {
					jComboBoxid_sector_origenRutaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSectorDestinoForeignKey(Long idSectorDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sector  sectordestinoTemp=null;

			for(Sector sectordestinoAux:sectordestinosForeignKey) {
				if(sectordestinoAux.getId()!=null && sectordestinoAux.getId().equals(idSectorDestinoSeleccionado)) {
					sectordestinoTemp=sectordestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sectordestinoTemp!=null) {

					if(this.ruta!=null) {
						this.ruta.setSectorDestino(sectordestinoTemp);
					}

					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setSelectedItem(sectordestinoTemp);
					}
				} else {
					//jComboBoxid_sector_destinoRuta.setSelectedItem(sectordestinoTemp);
					if(this.jInternalFrameDetalleFormRuta!=null) {
						if(this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSectorDestino") || sFormularioTipoBusqueda.equals("Todos")){
					if(sectordestinoTemp!=null && jComboBoxid_sector_destinoFK_IdSectorDestinoRuta!=null) {
						jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setSelectedItem(sectordestinoTemp);
					} else {
						if(jComboBoxid_sector_destinoFK_IdSectorDestinoRuta!=null) {
							//jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setSelectedItem(sectordestinoTemp);
							if(jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.getItemCount()>0) {
								jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setSelectedIndex(0);
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

	public String getActualSectorDestinoForeignKeyDescripcion(Long idSectorDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sector  sectordestinoTemp=null;

			for(Sector sectordestinoAux:sectordestinosForeignKey) {
				if(sectordestinoAux.getId()!=null && sectordestinoAux.getId().equals(idSectorDestinoSeleccionado)) {
					sectordestinoTemp=sectordestinoAux;
					break;
				}
			}


			sDescripcion=SectorConstantesFunciones.getSectorDescripcion(sectordestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSectorDestinoForeignKeyGenerico(Long idSectorDestinoSeleccionado,JComboBox jComboBoxid_sector_destinoRutaGenerico)throws Exception
	{
		try
		{
			Sector  sectordestinoTemp=null;

			for(Sector sectordestinoAux:sectordestinosForeignKey) {
				if(sectordestinoAux.getId()!=null && sectordestinoAux.getId().equals(idSectorDestinoSeleccionado)) {
					sectordestinoTemp=sectordestinoAux;
					break;
				}
			}

			if(sectordestinoTemp!=null) {
				jComboBoxid_sector_destinoRutaGenerico.setSelectedItem(sectordestinoTemp);
			} else {
				if(jComboBoxid_sector_destinoRutaGenerico!=null && jComboBoxid_sector_destinoRutaGenerico.getItemCount()>0) {
					jComboBoxid_sector_destinoRutaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Ruta ruta,JComboBox jComboBoxid_empresaRutaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRutaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRutaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ruta.setid_empresa(empresaAux.getId());
				ruta.setempresa_descripcion(RutaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ruta.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Ruta ruta,JComboBox jComboBoxid_paisRutaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisRutaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisRutaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				ruta.setid_pais(paisAux.getId());
				ruta.setpais_descripcion(RutaConstantesFunciones.getPaisDescripcion(paisAux));
				ruta.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Ruta ruta,JComboBox jComboBoxid_ciudadRutaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadRutaGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadRutaGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				ruta.setid_ciudad(ciudadAux.getId());
				ruta.setciudad_descripcion(RutaConstantesFunciones.getCiudadDescripcion(ciudadAux));
				ruta.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSectorOrigenForeignKey(Ruta ruta,JComboBox jComboBoxid_sector_origenRutaGenerico)throws Exception
	{
		try
		{
			Sector  sectorAux=new Sector();

			if(jComboBoxid_sector_origenRutaGenerico==null) {
				sectorAux=(Sector)this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.getSelectedItem();
			} else {
				sectorAux=(Sector)jComboBoxid_sector_origenRutaGenerico.getSelectedItem();
			}

			if(sectorAux!=null && sectorAux.getId()!=null) {
				ruta.setid_sector_origen(sectorAux.getId());
				ruta.setsectororigen_descripcion(RutaConstantesFunciones.getSectorOrigenDescripcion(sectorAux));
				ruta.setSectorOrigen(sectorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSectorDestinoForeignKey(Ruta ruta,JComboBox jComboBoxid_sector_destinoRutaGenerico)throws Exception
	{
		try
		{
			Sector  sectorAux=new Sector();

			if(jComboBoxid_sector_destinoRutaGenerico==null) {
				sectorAux=(Sector)this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.getSelectedItem();
			} else {
				sectorAux=(Sector)jComboBoxid_sector_destinoRutaGenerico.getSelectedItem();
			}

			if(sectorAux!=null && sectorAux.getId()!=null) {
				ruta.setid_sector_destino(sectorAux.getId());
				ruta.setsectordestino_descripcion(RutaConstantesFunciones.getSectorDestinoDescripcion(sectorAux));
				ruta.setSectorDestino(sectorAux);			}
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

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) { 
							this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRuta!=null) { 
					}

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) { 
							this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRuta!=null) { 
					}

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisRuta.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisRuta.addItem(pais);
							}
						}

						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) { 
							this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRuta!=null) { 
					}

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSectorOrigensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSector=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) { 
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.removeAllItems();

							for(Sector sectororigen:this.sectororigensForeignKey) {
								this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.addItem(sectororigen);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRuta!=null) { 
					}

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSectorOrigen") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.removeAllItems();

							for(Sector sectororigen:this.sectororigensForeignKey) {
								this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.addItem(sectororigen);
							}
						}

						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSectorDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSector=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) { 
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.removeAllItems();

							for(Sector sectordestino:this.sectordestinosForeignKey) {
								this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.addItem(sectordestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRuta!=null) { 
					}

					if(!RutaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSectorDestino") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.removeAllItems();

							for(Sector sectordestino:this.sectordestinosForeignKey) {
								this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.addItem(sectordestino);
							}
						}

						if(!RutaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisRuta.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisRuta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSectorOrigenForeignKey(Sector sectororigen,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setSelectedItem(sectororigen);
						}
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setSelectedItem(sectororigen);
						} else {
							this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSectorDestinoForeignKey(Sector sectordestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setSelectedItem(sectordestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormRuta!=null) {
							this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setSelectedItem(sectordestino);
						} else {
							this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRuta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RutaConstantesFunciones.refrescarForeignKeysDescripcionesRuta(this.rutaLogic.getRutas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RutaConstantesFunciones.refrescarForeignKeysDescripcionesRuta(this.rutas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
		classes.add(new Classe(Sector.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rutaLogic.setRutas(this.rutas);
			rutaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RutaParameterReturnGeneral getRutaParameterGeneral() {
		return this.rutaParameterGeneral;
	}
	
	public void setRutaParameterGeneral(RutaParameterReturnGeneral rutaParameterGeneral) {
		this.rutaParameterGeneral = rutaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRuta() {
		return isPermisoTodoRuta;
	}

	public void setIsPermisoTodoRuta(Boolean isPermisoTodoRuta) {
		this.isPermisoTodoRuta = isPermisoTodoRuta;
	}

	public Boolean getIsPermisoNuevoRuta() {
		return isPermisoNuevoRuta;
	}

	public void setIsPermisoNuevoRuta(Boolean isPermisoNuevoRuta) {
		this.isPermisoNuevoRuta = isPermisoNuevoRuta;
	}

	public Boolean getIsPermisoActualizarRuta() {
		return isPermisoActualizarRuta;
	}

	public void setIsPermisoActualizarRuta(Boolean isPermisoActualizarRuta) {
		this.isPermisoActualizarRuta = isPermisoActualizarRuta;
	}

	public Boolean getIsPermisoEliminarRuta() {
		return isPermisoEliminarRuta;
	}

	public void setIsPermisoEliminarRuta(Boolean isPermisoEliminarRuta) {
		this.isPermisoEliminarRuta = isPermisoEliminarRuta;
	}

	public Boolean getIsPermisoGuardarCambiosRuta() {
		return isPermisoGuardarCambiosRuta;
	}

	public void setIsPermisoGuardarCambiosRuta(Boolean isPermisoGuardarCambiosRuta) {
		this.isPermisoGuardarCambiosRuta = isPermisoGuardarCambiosRuta;
	}
	
	public Boolean getIsPermisoConsultaRuta() {
		return isPermisoConsultaRuta;
	}

	public void setIsPermisoConsultaRuta(Boolean isPermisoConsultaRuta) {
		this.isPermisoConsultaRuta = isPermisoConsultaRuta;
	}

	public Boolean getIsPermisoBusquedaRuta() {
		return isPermisoBusquedaRuta;
	}

	public void setIsPermisoBusquedaRuta(Boolean isPermisoBusquedaRuta) {
		this.isPermisoBusquedaRuta = isPermisoBusquedaRuta;
	}

	public Boolean getIsPermisoReporteRuta() {
		return isPermisoReporteRuta;
	}

	public void setIsPermisoReporteRuta(Boolean isPermisoReporteRuta) {
		this.isPermisoReporteRuta = isPermisoReporteRuta;
	}
	
	public Boolean getIsPermisoPaginacionMedioRuta() {
		return isPermisoPaginacionMedioRuta;
	}

	public void setIsPermisoPaginacionMedioRuta(Boolean isPermisoPaginacionMedioRuta) {
		this.isPermisoPaginacionMedioRuta = isPermisoPaginacionMedioRuta;
	}
	
	public Boolean getIsPermisoPaginacionTodoRuta() {
		return isPermisoPaginacionTodoRuta;
	}

	public void setIsPermisoPaginacionTodoRuta(Boolean isPermisoPaginacionTodoRuta) {
		this.isPermisoPaginacionTodoRuta = isPermisoPaginacionTodoRuta;
	}
	
	public Boolean getIsPermisoPaginacionAltoRuta() {
		return isPermisoPaginacionAltoRuta;
	}

	public void setIsPermisoPaginacionAltoRuta(Boolean isPermisoPaginacionAltoRuta) {
		this.isPermisoPaginacionAltoRuta = isPermisoPaginacionAltoRuta;
	}
	
	public Boolean getIsPermisoCopiarRuta() {
		return isPermisoCopiarRuta;
	}

	public void setIsPermisoCopiarRuta(Boolean isPermisoCopiarRuta) {
		this.isPermisoCopiarRuta = isPermisoCopiarRuta;
	}
	
	public Boolean getIsPermisoVerFormRuta() {
		return isPermisoVerFormRuta;
	}

	public void setIsPermisoVerFormRuta(Boolean isPermisoVerFormRuta) {
		this.isPermisoVerFormRuta = isPermisoVerFormRuta;
	}
	
	public Boolean getIsPermisoDuplicarRuta() {
		return isPermisoDuplicarRuta;
	}

	public void setIsPermisoDuplicarRuta(Boolean isPermisoDuplicarRuta) {
		this.isPermisoDuplicarRuta = isPermisoDuplicarRuta;
	}
	
	public Boolean getIsPermisoOrdenRuta() {
		return isPermisoOrdenRuta;
	}

	public void setIsPermisoOrdenRuta(Boolean isPermisoOrdenRuta) {
		this.isPermisoOrdenRuta = isPermisoOrdenRuta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRuta() {
		return isVisibilidadCeldaNuevoRuta;
	}

	public void setIsVisibilidadCeldaNuevoRuta(Boolean isVisibilidadCeldaNuevoRuta) {
		this.isVisibilidadCeldaNuevoRuta = isVisibilidadCeldaNuevoRuta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRuta() {
		return isVisibilidadCeldaDuplicarRuta;
	}

	public void setIsVisibilidadCeldaDuplicarRuta(Boolean isVisibilidadCeldaDuplicarRuta) {
		this.isVisibilidadCeldaDuplicarRuta = isVisibilidadCeldaDuplicarRuta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRuta() {
		return isVisibilidadCeldaCopiarRuta;
	}

	public void setIsVisibilidadCeldaCopiarRuta(Boolean isVisibilidadCeldaCopiarRuta) {
		this.isVisibilidadCeldaCopiarRuta = isVisibilidadCeldaCopiarRuta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRuta() {
		return isVisibilidadCeldaVerFormRuta;
	}

	public void setIsVisibilidadCeldaVerFormRuta(Boolean isVisibilidadCeldaVerFormRuta) {
		this.isVisibilidadCeldaVerFormRuta = isVisibilidadCeldaVerFormRuta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRuta() {
		return isVisibilidadCeldaOrdenRuta;
	}

	public void setIsVisibilidadCeldaOrdenRuta(Boolean isVisibilidadCeldaOrdenRuta) {
		this.isVisibilidadCeldaOrdenRuta = isVisibilidadCeldaOrdenRuta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRuta() {
		return isVisibilidadCeldaNuevoRelacionesRuta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRuta(Boolean isVisibilidadCeldaNuevoRelacionesRuta) {
		this.isVisibilidadCeldaNuevoRelacionesRuta = isVisibilidadCeldaNuevoRelacionesRuta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRuta() {
		return isVisibilidadCeldaModificarRuta;
	}

	public void setIsVisibilidadCeldaModificarRuta(Boolean isVisibilidadCeldaModificarRuta) {
		this.isVisibilidadCeldaModificarRuta = isVisibilidadCeldaModificarRuta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRuta() {
		return isVisibilidadCeldaActualizarRuta;
	}

	public void setIsVisibilidadCeldaActualizarRuta(Boolean isVisibilidadCeldaActualizarRuta) {
		this.isVisibilidadCeldaActualizarRuta = isVisibilidadCeldaActualizarRuta;
	}

	public Boolean getIsVisibilidadCeldaEliminarRuta() {
		return isVisibilidadCeldaEliminarRuta;
	}

	public void setIsVisibilidadCeldaEliminarRuta(Boolean isVisibilidadCeldaEliminarRuta) {
		this.isVisibilidadCeldaEliminarRuta = isVisibilidadCeldaEliminarRuta;
	}

	public Boolean getIsVisibilidadCeldaCancelarRuta() {
		return isVisibilidadCeldaCancelarRuta;
	}

	public void setIsVisibilidadCeldaCancelarRuta(Boolean isVisibilidadCeldaCancelarRuta) {
		this.isVisibilidadCeldaCancelarRuta = isVisibilidadCeldaCancelarRuta;
	}

	public Boolean getIsVisibilidadCeldaGuardarRuta() {
		return isVisibilidadCeldaGuardarRuta;
	}

	public void setIsVisibilidadCeldaGuardarRuta(Boolean isVisibilidadCeldaGuardarRuta) {
		this.isVisibilidadCeldaGuardarRuta = isVisibilidadCeldaGuardarRuta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRuta() {
		return isVisibilidadCeldaGuardarCambiosRuta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRuta(Boolean isVisibilidadCeldaGuardarCambiosRuta) {
		this.isVisibilidadCeldaGuardarCambiosRuta = isVisibilidadCeldaGuardarCambiosRuta;
	}
		
	public RutaSessionBean getrutaSessionBean() {
		return this.rutaSessionBean;
	}
	
	public void setrutaSessionBean(RutaSessionBean rutaSessionBean) {
		this.rutaSessionBean=rutaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorDestino() {
		return this.isVisibilidadBusquedaPorDestino;
	}

	public void setisVisibilidadBusquedaPorDestino(Boolean isVisibilidadBusquedaPorDestino) {
		this.isVisibilidadBusquedaPorDestino=isVisibilidadBusquedaPorDestino;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorOrigen() {
		return this.isVisibilidadBusquedaPorOrigen;
	}

	public void setisVisibilidadBusquedaPorOrigen(Boolean isVisibilidadBusquedaPorOrigen) {
		this.isVisibilidadBusquedaPorOrigen=isVisibilidadBusquedaPorOrigen;
	}

	public Boolean getisVisibilidadBusquedaPorPrecio() {
		return this.isVisibilidadBusquedaPorPrecio;
	}

	public void setisVisibilidadBusquedaPorPrecio(Boolean isVisibilidadBusquedaPorPrecio) {
		this.isVisibilidadBusquedaPorPrecio=isVisibilidadBusquedaPorPrecio;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdSectorDestino() {
		return this.isVisibilidadFK_IdSectorDestino;
	}

	public void setisVisibilidadFK_IdSectorDestino(Boolean isVisibilidadFK_IdSectorDestino) {
		this.isVisibilidadFK_IdSectorDestino=isVisibilidadFK_IdSectorDestino;
	}

	public Boolean getisVisibilidadFK_IdSectorOrigen() {
		return this.isVisibilidadFK_IdSectorOrigen;
	}

	public void setisVisibilidadFK_IdSectorOrigen(Boolean isVisibilidadFK_IdSectorOrigen) {
		this.isVisibilidadFK_IdSectorOrigen=isVisibilidadFK_IdSectorOrigen;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRuta(Ruta ruta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ruta,null);
				this.setActualParaGuardarPaisForeignKey(ruta,null);
				this.setActualParaGuardarCiudadForeignKey(ruta,null);
				this.setActualParaGuardarSectorOrigenForeignKey(ruta,null);
				this.setActualParaGuardarSectorDestinoForeignKey(ruta,null);
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
	
	public void bugActualizarReferenciaActual(Ruta ruta,Ruta rutaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRuta(ruta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rutaAux.setId(ruta.getId());
		rutaAux.setVersionRow(ruta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRuta();
		
			int intSelectedRow = this.jTableDatosRuta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rutaValidator.getInvalidValues(this.ruta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rutaLogic.setDatosCliente(datosCliente);
			rutaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rutaAux=new  Ruta();
				
				rutaAux.setIsNew(true);
				rutaAux.setIsChanged(true);
				
				rutaAux.setRutaOriginal(this.ruta);
				
				rutaAux.setId(this.ruta.getId());	
				rutaAux.setVersionRow(this.ruta.getVersionRow());	
				rutaAux.setid_empresa(this.ruta.getid_empresa());	
				rutaAux.setid_pais(this.ruta.getid_pais());	
				rutaAux.setid_ciudad(this.ruta.getid_ciudad());	
				rutaAux.setid_sector_origen(this.ruta.getid_sector_origen());	
				rutaAux.setid_sector_destino(this.ruta.getid_sector_destino());	
				rutaAux.setnombre(this.ruta.getnombre());	
				rutaAux.setorigen(this.ruta.getorigen());	
				rutaAux.setdestino(this.ruta.getdestino());	
				rutaAux.setprecio(this.ruta.getprecio());	
				rutaAux.setdireccion(this.ruta.getdireccion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rutaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rutaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rutaAux,rutaLogic.getRutas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutaAux,rutas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rutaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.saveRutas();//WithConnection
						//rutaLogic.getSetVersionRowRutas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ruta,rutaAux);
					
					this.refrescarForeignKeysDescripcionesRuta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutaLogic.saveRutaRelaciones(rutaAux,this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//rutaLogic.getSetVersionRowRutas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ruta,rutaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rutaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rutaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rutaAux,rutaLogic.getRutas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rutaAux,rutas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ruta,rutaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rutaAux=new  Ruta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rutaSessionBean.getEsGuardarRelacionado() 
					|| (this.rutaSessionBean.getEsGuardarRelacionado() && this.ruta.getId()>=0)) {
						
					rutaAux.setIsNew(false);
				}
				
				rutaAux.setIsDeleted(false);
			
				rutaAux.setId(this.ruta.getId());	
				rutaAux.setVersionRow(this.ruta.getVersionRow());	
				rutaAux.setid_empresa(this.ruta.getid_empresa());	
				rutaAux.setid_pais(this.ruta.getid_pais());	
				rutaAux.setid_ciudad(this.ruta.getid_ciudad());	
				rutaAux.setid_sector_origen(this.ruta.getid_sector_origen());	
				rutaAux.setid_sector_destino(this.ruta.getid_sector_destino());	
				rutaAux.setnombre(this.ruta.getnombre());	
				rutaAux.setorigen(this.ruta.getorigen());	
				rutaAux.setdestino(this.ruta.getdestino());	
				rutaAux.setprecio(this.ruta.getprecio());	
				rutaAux.setdireccion(this.ruta.getdireccion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rutaAux,rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutaAux,rutas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rutaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.saveRutas();//WithConnection
						//rutaLogic.getSetVersionRowRutas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ruta,rutaAux);
					
					this.refrescarForeignKeysDescripcionesRuta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutaLogic.saveRutaRelaciones(rutaAux,this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//rutaLogic.getSetVersionRowRutas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ruta,rutaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rutaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rutaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rutaAux,rutaLogic.getRutas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rutaAux,rutas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ruta,rutaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rutaAux=new  Ruta();
				
				rutaAux.setIsNew(false);
				rutaAux.setIsChanged(false);
				
				rutaAux.setIsDeleted(true);
				
				rutaAux.setId(this.ruta.getId());	
				rutaAux.setVersionRow(this.ruta.getVersionRow());	
				rutaAux.setid_empresa(this.ruta.getid_empresa());	
				rutaAux.setid_pais(this.ruta.getid_pais());	
				rutaAux.setid_ciudad(this.ruta.getid_ciudad());	
				rutaAux.setid_sector_origen(this.ruta.getid_sector_origen());	
				rutaAux.setid_sector_destino(this.ruta.getid_sector_destino());	
				rutaAux.setnombre(this.ruta.getnombre());	
				rutaAux.setorigen(this.ruta.getorigen());	
				rutaAux.setdestino(this.ruta.getdestino());	
				rutaAux.setprecio(this.ruta.getprecio());	
				rutaAux.setdireccion(this.ruta.getdireccion());	
				
				if(this.rutaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rutaAux.getId()>=0) {	
						this.rutasEliminados.add(rutaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rutaAux,rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutaAux,rutas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rutaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.saveRutas();//WithConnection
						//rutaLogic.getSetVersionRowRutas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutaLogic.saveRutaRelaciones(rutaAux,this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//rutaLogic.getSetVersionRowRutas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.rutaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rutaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rutaAux,rutaLogic.getRutas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rutaAux,rutas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getRutas().addAll(this.rutasEliminados);
					
					rutaLogic.saveRutas();//WithConnection
					//rutaLogic.getSetVersionRowRutas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRuta();
				
				this.rutasEliminados= new ArrayList<Ruta>();		
			}
			
			if(this.rutaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ruta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ruta=rutaAux;
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
      		//this.finishProcessRuta();
      	}
		
	}	
	
	public void actualizarRelaciones(Ruta rutaLocal) throws Exception {
		
		if(this.rutaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				rutaLocal.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				rutaLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				rutaLocal.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clientes);
				rutaLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Ruta rutaLocal) throws Exception {	
		if(this.rutaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rutaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				rutaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				rutaLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SectorDetalleFormJInternalFrame.class)) {
				SectorBeanSwingJInternalFrame sectororigenBeanSwingJInternalFrameLocal=(SectorBeanSwingJInternalFrame) ((SectorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sectororigenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSector(sectororigenBeanSwingJInternalFrameLocal.getsector(),true);
				sectororigenBeanSwingJInternalFrameLocal.actualizarLista(sectororigenBeanSwingJInternalFrameLocal.sector,this.sectororigensForeignKey);

				sectororigenBeanSwingJInternalFrameLocal.actualizarRelaciones(sectororigenBeanSwingJInternalFrameLocal.sector);

				rutaLocal.setSectorOrigen(sectororigenBeanSwingJInternalFrameLocal.sector);

				this.addItemDefectoCombosForeignKeySectorOrigen();
				this.cargarCombosFrameSectorOrigensForeignKey("Formulario");
				this.setActualSectorOrigenForeignKey(sectororigenBeanSwingJInternalFrameLocal.sector.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SectorDetalleFormJInternalFrame.class)) {
				SectorBeanSwingJInternalFrame sectordestinoBeanSwingJInternalFrameLocal=(SectorBeanSwingJInternalFrame) ((SectorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sectordestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSector(sectordestinoBeanSwingJInternalFrameLocal.getsector(),true);
				sectordestinoBeanSwingJInternalFrameLocal.actualizarLista(sectordestinoBeanSwingJInternalFrameLocal.sector,this.sectordestinosForeignKey);

				sectordestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(sectordestinoBeanSwingJInternalFrameLocal.sector);

				rutaLocal.setSectorDestino(sectordestinoBeanSwingJInternalFrameLocal.sector);

				this.addItemDefectoCombosForeignKeySectorDestino();
				this.cargarCombosFrameSectorDestinosForeignKey("Formulario");
				this.setActualSectorDestinoForeignKey(sectordestinoBeanSwingJInternalFrameLocal.sector.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRutaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRuta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rutaValidator.getInvalidValues(this.ruta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Ruta ruta,List<Ruta> rutas) throws Exception {
		try	{		
			RutaConstantesFunciones.actualizarLista(ruta,rutas,this.rutaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Ruta ruta,List<Ruta> rutas) throws Exception {
		try	{			
			RutaConstantesFunciones.actualizarSelectedLista(ruta,rutas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Ruta> rutasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rutasLocal=this.rutaLogic.getRutas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rutasLocal=this.rutas;
			}
			//ARCHITECTURE
		
			for(Ruta rutaLocal:rutasLocal) {
				if(this.permiteMantenimiento(rutaLocal) && rutaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RutaConstantesFunciones.getRutaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelid_empresaRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelid_paisRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelid_ciudadRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.IDSECTORORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelid_sector_origenRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.IDSECTORDESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelid_sector_destinoRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelnombreRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.ORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelorigenRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.DESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabeldestinoRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelprecioRuta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabeldireccionRuta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelid_empresaRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelid_paisRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelid_ciudadRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelid_sector_origenRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelid_sector_destinoRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelnombreRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelorigenRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabeldestinoRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabelprecioRuta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRuta.jLabeldireccionRuta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.ruta==null) {
				this.ruta= new Ruta();
			}

			if(this.rutaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRuta
				this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.getcliente().setRuta(this.ruta);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.ruta==null) {
				this.ruta= new Ruta();
			}

			if(this.rutaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRuta
				this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setRuta(this.ruta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRuta--;	
		
		
		this.rutaAux=new Ruta();
		
		this.rutaAux.setId(this.iIdNuevoRuta);
		this.rutaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rutaLogic.getRutas().add(this.rutaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rutas.add(this.rutaAux);
		}
		//ARCHITECTURE
		
		this.ruta=this.rutaAux;
		
		if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRuta(this.ruta);
			this.setVariablesObjetoActualToFormularioForeignKeyRuta(this.ruta);
		}
				
		//this.setDefaultControlesRuta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRuta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRuta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRuta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRuta(this.rutaBean,this.ruta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RutaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rutaSessionBean.getConGuardarRelaciones()) {
			classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rutaReturnGeneral=rutaLogic.procesarEventosRutasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rutaLogic.getRutas(),this.ruta,this.rutaParameterGeneral,this.isEsNuevoRuta,classes);//this.rutaLogic.getRuta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRuta(this.rutaReturnGeneral,this.rutaBean,false);
		
		if(this.rutaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRuta(this.rutaReturnGeneral.getRuta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRuta(this.rutaReturnGeneral.getRuta());
		}
		
		if(this.rutaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRuta(this.rutaReturnGeneral.getRuta(),classes);//this.rutaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRuta(this.ruta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRuta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRuta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RutaBeanSwingJInternalFrameAdditional.RecargarFormRuta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRuta(false);
						
			if(rutaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRuta();
			}
			
			this.actualizarVisualTableDatosRuta();
			
			this.jTableDatosRuta.setRowSelectionInterval(this.getIndiceNuevoRuta(), this.getIndiceNuevoRuta());
			
			this.seleccionarFilaTablaRutaActual();
						
			this.actualizarEstadoCeldasBotonesRuta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRuta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarnombreRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarorigenRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activardestinoRuta);
		this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarprecioRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activardireccionRuta);	
		//
		this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarid_empresaRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarid_paisRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarid_ciudadRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarid_sector_origenRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setEnabled(isHabilitar && this.rutaConstantesFunciones.activarid_sector_destinoRuta);
	};
	
	public void setDefaultControlesRuta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRuta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rutaSessionBean.setConGuardarRelaciones(true);			
			this.rutaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.rutaSessionBean.setConGuardarRelaciones(false);			
			this.rutaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRuta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ruta rutaAux:this.rutaLogic.getRutas()) {
				if(rutaAux.getId().equals(this.iIdNuevoRuta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ruta rutaAux:this.rutas) {
				if(rutaAux.getId().equals(this.iIdNuevoRuta)) {
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
	
	public int getIndiceActualRuta(Ruta ruta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ruta rutaAux:this.rutaLogic.getRutas()) {
				if(rutaAux.getId().equals(ruta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ruta rutaAux:this.rutas) {
				if(rutaAux.getId().equals(ruta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRuta(Ruta rutaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ruta rutaAux:this.rutaLogic.getRutas()) {
				if(rutaAux.getRutaOriginal().getId().equals(rutaOriginal.getId())) {
					existe=true;
					rutaOriginal.setId(rutaAux.getId());
					rutaOriginal.setVersionRow(rutaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ruta rutaAux:this.rutas) {
				if(rutaAux.getRutaOriginal().getId().equals(rutaOriginal.getId())) {
					existe=true;
					rutaOriginal.setId(rutaAux.getId());
					rutaOriginal.setVersionRow(rutaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRuta(Boolean esParaCancelar) throws Exception {
		rutasAux=new ArrayList<Ruta>();
		rutaAux=new Ruta();
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ruta rutaAux:this.rutaLogic.getRutas()) {
					if(rutaAux.getId()<0) {
						rutasAux.add(rutaAux);
					}		
				}
				this.iIdNuevoRuta=0L;
				this.rutaLogic.getRutas().removeAll(rutasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ruta rutaAux:this.rutas) {
					if(rutaAux.getId()<0) {
						rutasAux.add(rutaAux);
					}		
				}
				this.iIdNuevoRuta=0L;
				this.rutas.removeAll(rutasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRuta 
					&& this.rutaLogic.getRutas().size()>0
					) {
					rutaAux=this.rutaLogic.getRutas().get(this.rutaLogic.getRutas().size() - 1);
				
					if(rutaAux.getId()<0) {
						this.rutaLogic.getRutas().remove(rutaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRuta && this.rutas.size()>0) {
					rutaAux=this.rutas.get(this.rutas.size() - 1);
				
					if(rutaAux.getId()<0) {
						this.rutas.remove(rutaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRuta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ruta.getId()<0) {
				this.rutaLogic.getRutas().remove(this.ruta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ruta.getId()<0) {
				this.rutas.remove(this.ruta);
			}
		}			
	}
	
	public void setEstadosInicialesRuta(List<Ruta> rutasAux) throws Exception {
		RutaConstantesFunciones.setEstadosInicialesRuta(rutasAux);
	}
	
	public void setEstadosInicialesRuta(Ruta rutaAux) throws Exception {
		RutaConstantesFunciones.setEstadosInicialesRuta(rutaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRutaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRutaActual()) {
				if(!this.isEsNuevoRuta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRuta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRutaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ruta ?", "MANTENIMIENTO DE Ruta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Ruta ruta) throws Exception {
		RutaConstantesFunciones.seleccionarAsignar(this.ruta,ruta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRuta=this.isPermisoActualizarOriginalRuta;
			
			
			this.seleccionarAsignar(ruta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RutaConstantesFunciones.quitarEspaciosRuta(this.ruta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRuta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rutaSessionBean.setsFuncionBusquedaRapida(this.rutaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRuta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRuta(esParaCancelar);				
				this.cancelarNuevoRuta(esParaCancelar);								
			}
			
			this.ruta=new Ruta();
			
			this.inicializarRuta();
			
			this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRuta() throws Exception {
		try {
			RutaConstantesFunciones.inicializarRuta(this.ruta);
			
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
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rutaLogic.getRutas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRutas(String sAccionBusqueda,List<Ruta> rutasParaReportes) throws Exception {
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
					sPathReporteFinal="Ruta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RutaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RutaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Ruta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rutas");		
		parameters.put("busquedapor", RutaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RutaLogic rutaLogicAuxiliar=new RutaLogic();
					rutaLogicAuxiliar.setDatosCliente(rutaLogic.getDatosCliente());				
					rutaLogicAuxiliar.setRutas(rutasParaReportes);
					
					rutaLogicAuxiliar.cargarRelacionesLoteForeignKeyRutaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					rutasParaReportes=rutaLogicAuxiliar.getRutas();
					
					//rutaLogic.getNewConnexionToDeep();
					
					//for (Ruta ruta:rutasParaReportes) {
					//	rutaLogic.deepLoad(ruta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//rutaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//rutaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRuta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RutaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RutaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRuta=new JRBeanArrayDataSource(RutaJInternalFrame.TraerRutaBeans(rutasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRuta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RutaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RutaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RutaBean.TraerRutaBeans(rutasParaReportes).toArray()));
							
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
				this.generarExcelReporteRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRutaActionPerformed(null);
					//this.generarExcelReporteRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRutas(sAccionBusqueda,sTipoArchivoReporte,rutasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRutas(String sAccionBusqueda,String sTipoArchivoReporte,List<Ruta> rutasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Rutas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRuta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Ruta ruta : rutasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RutaConstantesFunciones.generarExcelReporteDataRuta("NORMAL",row,workbook,ruta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRuta(String sTipo,Row row,Workbook workbook) {
		
		RutaConstantesFunciones.generarExcelReporteHeaderRuta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRutas(String sAccionBusqueda,String sTipoArchivoReporte,List<Ruta> rutasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Rutas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Ruta ruta : rutasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RutaConstantesFunciones.getRutaDescripcion(ruta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_IDSECTORORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getsectororigen_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_IDSECTORDESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORDESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getsectordestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_ORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_ORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getorigen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_DESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_DESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getdestino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ruta.getdireccion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRutas(String sAccionBusqueda,String sTipoArchivoReporte,List<Ruta> rutasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Ruta> rutasRespaldo=null;
		
		classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rutaLogic.setDatosCliente(this.datosCliente);
		this.rutaLogic.setDatosDeep(this.datosDeep);
		this.rutaLogic.setIsConDeep(true);
		
		rutasRespaldo=this.rutaLogic.getRutas();
		
		this.rutaLogic.setRutas(rutasParaReportes);	
		this.rutaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rutasParaReportes=this.rutaLogic.getRutas();
		this.rutaLogic.setRutas(rutasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Rutas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRuta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Ruta ruta : rutasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRuta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RutaConstantesFunciones.generarExcelReporteDataRuta("NORMAL",row,workbook,ruta,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(ruta.getClientes()!=null && ruta.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(ruta.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : ruta.getClientes()) {
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


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(ruta.getParametroCarteraDefectos()!=null && ruta.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(ruta.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : ruta.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(RutaConstantesFunciones.getRutaDescripcion(ruta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRuta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRuta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRuta() throws Exception {		
		this.startProcessRuta(true);
	}
	
	public void startProcessRuta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRuta ,this.jPanelParametrosReportesRuta, this.jScrollPanelDatosRuta,this.jPanelPaginacionRuta, this.jScrollPanelDatosEdicionRuta, this.jPanelAccionesRuta,this.jPanelAccionesFormularioRuta,this.jmenuBarRuta,this.jmenuBarDetalleRuta,this.jTtoolBarRuta,this.jTtoolBarDetalleRuta);		
		
		final JTabbedPane jTabbedPaneBusquedasRuta=this.jTabbedPaneBusquedasRuta; 
		
		final JPanel jPanelParametrosReportesRuta=this.jPanelParametrosReportesRuta;
		//final JScrollPane jScrollPanelDatosRuta=this.jScrollPanelDatosRuta;
		final JTable jTableDatosRuta=this.jTableDatosRuta;		
		final JPanel jPanelPaginacionRuta=this.jPanelPaginacionRuta;
		//final JScrollPane jScrollPanelDatosEdicionRuta=this.jScrollPanelDatosEdicionRuta;
		final JPanel jPanelAccionesRuta=this.jPanelAccionesRuta;
		
		JPanel jPanelCamposAuxiliarRuta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRuta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
			jPanelCamposAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jPanelCamposRuta;
			jPanelAccionesFormularioAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jPanelAccionesFormularioRuta;
		}
		
		final JPanel jPanelCamposRuta=jPanelCamposAuxiliarRuta;
		final JPanel jPanelAccionesFormularioRuta=jPanelAccionesFormularioAuxiliarRuta;
		
		
		final JMenuBar jmenuBarRuta=this.jmenuBarRuta;
		final JToolBar jTtoolBarRuta=this.jTtoolBarRuta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRuta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRuta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
			jmenuBarDetalleAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jmenuBarDetalleRuta;
			jTtoolBarDetalleAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jTtoolBarDetalleRuta;
		}
		
		final JMenuBar jmenuBarDetalleRuta=jmenuBarDetalleAuxiliarRuta;
		final JToolBar jTtoolBarDetalleRuta=jTtoolBarDetalleAuxiliarRuta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRuta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRuta;
			processRunnable.jTableDatos=jTableDatosRuta;
			processRunnable.jPanelCampos=jPanelCamposRuta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRuta;
			processRunnable.jPanelAcciones=jPanelAccionesRuta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRuta;
			
			
			processRunnable.jmenuBar=jmenuBarRuta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRuta;
			processRunnable.jTtoolBar=jTtoolBarRuta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRuta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRuta ,jPanelParametrosReportesRuta,jTableDatosRuta, /*jScrollPanelDatosRuta,*/jPanelCamposRuta,jPanelPaginacionRuta, /*jScrollPanelDatosEdicionRuta,*/ jPanelAccionesRuta,jPanelAccionesFormularioRuta,jmenuBarRuta,jmenuBarDetalleRuta,jTtoolBarRuta,jTtoolBarDetalleRuta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRuta ,jPanelParametrosReportesRuta, jScrollPanelDatosRuta,jPanelPaginacionRuta, jScrollPanelDatosEdicionRuta, jPanelAccionesRuta,jPanelAccionesFormularioRuta,jmenuBarRuta,jmenuBarDetalleRuta,jTtoolBarRuta,jTtoolBarDetalleRuta);
						
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
	
	public void finishProcessRuta() {// throws Exception 
		this.finishProcessRuta(true);
	}
	
	public void finishProcessRuta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRuta ,this.jPanelParametrosReportesRuta, this.jScrollPanelDatosRuta,this.jPanelPaginacionRuta, this.jScrollPanelDatosEdicionRuta, this.jPanelAccionesRuta,this.jPanelAccionesFormularioRuta,this.jmenuBarRuta,this.jmenuBarDetalleRuta,this.jTtoolBarRuta,this.jTtoolBarDetalleRuta);		
		
		final JTabbedPane jTabbedPaneBusquedasRuta=this.jTabbedPaneBusquedasRuta; 
		
		final JPanel jPanelParametrosReportesRuta=this.jPanelParametrosReportesRuta;
		//final JScrollPane jScrollPanelDatosRuta=this.jScrollPanelDatosRuta;
		final JTable jTableDatosRuta=this.jTableDatosRuta;		
		final JPanel jPanelPaginacionRuta=this.jPanelPaginacionRuta;
		//final JScrollPane jScrollPanelDatosEdicionRuta=this.jScrollPanelDatosEdicionRuta;
		final JPanel jPanelAccionesRuta=this.jPanelAccionesRuta;
		
		JPanel jPanelCamposAuxiliarRuta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRuta=new JPanel();
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
			jPanelCamposAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jPanelCamposRuta;
			jPanelAccionesFormularioAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jPanelAccionesFormularioRuta;
		}
		
		final JPanel jPanelCamposRuta=jPanelCamposAuxiliarRuta;
		final JPanel jPanelAccionesFormularioRuta=jPanelAccionesFormularioAuxiliarRuta;
		
		
		final JMenuBar jmenuBarRuta=this.jmenuBarRuta;		
		final JToolBar jTtoolBarRuta=this.jTtoolBarRuta;
				
		JMenuBar jmenuBarDetalleAuxiliarRuta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRuta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
			jmenuBarDetalleAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jmenuBarDetalleRuta;
			jTtoolBarDetalleAuxiliarRuta=this.jInternalFrameDetalleFormRuta.jTtoolBarDetalleRuta;		
		}
		
		final JMenuBar jmenuBarDetalleRuta=jmenuBarDetalleAuxiliarRuta;
		final JToolBar jTtoolBarDetalleRuta=jTtoolBarDetalleAuxiliarRuta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRuta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRuta;
			processRunnable.jTableDatos=jTableDatosRuta;
			processRunnable.jPanelCampos=jPanelCamposRuta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRuta;
			processRunnable.jPanelAcciones=jPanelAccionesRuta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRuta;
			
			
			processRunnable.jmenuBar=jmenuBarRuta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRuta;
			processRunnable.jTtoolBar=jTtoolBarRuta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRuta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRuta ,jPanelParametrosReportesRuta, jTableDatosRuta,/*jScrollPanelDatosRuta,*/jPanelCamposRuta,jPanelPaginacionRuta, /*jScrollPanelDatosEdicionRuta,*/ jPanelAccionesRuta,jPanelAccionesFormularioRuta,jmenuBarRuta,jmenuBarDetalleRuta,jTtoolBarRuta,jTtoolBarDetalleRuta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRuta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRuta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRuta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRuta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRuta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRuta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRuta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRuta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRuta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rutaConstantesFunciones.getsFinalQueryRuta();
		String  finalQueryPaginacionTodos=this.rutaConstantesFunciones.getsFinalQueryRuta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RutaConstantesFunciones.getArrayColumnasGlobalesNoRuta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RutaConstantesFunciones.getArrayColumnasGlobalesRuta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RutaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rutasEliminados= new ArrayList<Ruta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRuta();
		
				///*RutaSessionBean*/this.rutaSessionBean=new RutaSessionBean();
			
			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
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
					this.iNumeroPaginacion=RutaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RutaConstantesFunciones.getClassesForeignKeysOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ruta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rutasAux= new ArrayList<Ruta>();
			
				
			rutaLogic.setDatosCliente(this.datosCliente);
			rutaLogic.setDatosDeep(this.datosDeep);
			rutaLogic.setIsConDeep(true);
			
			
			rutaLogic.getRutaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rutaLogic.getTodosRutas(finalQueryGlobal,pagination);
					
					//rutaLogic.getTodosRutasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rutaLogic.getRutas()==null|| rutaLogic.getRutas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutasAux= new ArrayList<Ruta>();
							rutasAux.addAll(rutaLogic.getRutas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux= new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutaLogic.getTodosRutas(finalQueryGlobal+"",this.pagination);												
							
							//rutaLogic.getTodosRutasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRutas("Todos",rutaLogic.getRutas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutaLogic.setRutas(new ArrayList<Ruta>());					
							rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRuta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRuta=this.idActual;
				
				} else if(this.idRutaActual!=null && this.idRutaActual!=0L) {
					idRuta=idRutaActual;
				}
				
					
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndicePorId(idRuta);
				
				this.rutas=new ArrayList<Ruta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rutaLogic.getEntity(idRuta);
					
					//rutaLogic.getEntityWithConnection(idRuta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.setRutas(new ArrayList<Ruta>());
					rutaLogic.getRutas().add(rutaLogic.getRuta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rutas=new ArrayList<Ruta>();
					this.rutas.add(ruta);
				}
				
				if(rutaLogic.getRuta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorDestino")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasBusquedaPorDestino(finalQueryGlobal,pagination,destinoBusquedaPorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasBusquedaPorDestino(finalQueryGlobal,pagination,destinoBusquedaPorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("BusquedaPorDestino",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("BusquedaPorDestino",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("BusquedaPorNombre",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("BusquedaPorNombre",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorOrigen")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasBusquedaPorOrigen(finalQueryGlobal,pagination,origenBusquedaPorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasBusquedaPorOrigen(finalQueryGlobal,pagination,origenBusquedaPorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("BusquedaPorOrigen",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("BusquedaPorOrigen",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorPrecio")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorPrecio(precioBusquedaPorPrecio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasBusquedaPorPrecio(finalQueryGlobal,pagination,precioBusquedaPorPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorPrecio(precioBusquedaPorPrecio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorPrecio(precioBusquedaPorPrecio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasBusquedaPorPrecio(finalQueryGlobal,pagination,precioBusquedaPorPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorPrecio(precioBusquedaPorPrecio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceBusquedaPorPrecio(precioBusquedaPorPrecio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("BusquedaPorPrecio",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("BusquedaPorPrecio",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("FK_IdEmpresa",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("FK_IdEmpresa",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("FK_IdPais",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("FK_IdPais",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSectorDestino")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorDestino(id_sector_destinoFK_IdSectorDestino);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasFK_IdSectorDestino(finalQueryGlobal,pagination,id_sector_destinoFK_IdSectorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorDestino(id_sector_destinoFK_IdSectorDestino);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorDestino(id_sector_destinoFK_IdSectorDestino);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasFK_IdSectorDestino(finalQueryGlobal,pagination,id_sector_destinoFK_IdSectorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorDestino(id_sector_destinoFK_IdSectorDestino);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorDestino(id_sector_destinoFK_IdSectorDestino);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("FK_IdSectorDestino",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("FK_IdSectorDestino",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSectorOrigen")) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorOrigen(id_sector_origenFK_IdSectorOrigen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutaLogic.getRutasFK_IdSectorOrigen(finalQueryGlobal,pagination,id_sector_origenFK_IdSectorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorOrigen(id_sector_origenFK_IdSectorOrigen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorOrigen(id_sector_origenFK_IdSectorOrigen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutaLogic.getRutas()==null||rutaLogic.getRutas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutas==null|| rutas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutasAux=new ArrayList<Ruta>();
						rutasAux.addAll(rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutasAux=new ArrayList<Ruta>();
							rutasAux.addAll(rutas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutaLogic.getRutasFK_IdSectorOrigen(finalQueryGlobal,pagination,id_sector_origenFK_IdSectorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorOrigen(id_sector_origenFK_IdSectorOrigen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaConstantesFunciones.getDetalleIndiceFK_IdSectorOrigen(id_sector_origenFK_IdSectorOrigen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutas("FK_IdSectorOrigen",rutaLogic.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutas("FK_IdSectorOrigen",rutas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaLogic.setRutas(new ArrayList<Ruta>());
						rutaLogic.getRutas().addAll(rutasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutas=new ArrayList<Ruta>();
							rutas.addAll(rutasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRuta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRuta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rutaLogic.getRutas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rutaLogic.getRutas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Ruta ruta) {
		Boolean permite=true;
		
		if(this.ruta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RutaConstantesFunciones.getOrderByListaRuta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RutaConstantesFunciones.getOrderByListaRuta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ruta ruta:rutaLogic.getRutas()) {
				if(ruta.getsType().equals(Constantes2.S_TOTALES)) {
					rutaTotales=ruta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ruta ruta:this.rutas) {
				if(ruta.getsType().equals(Constantes2.S_TOTALES)) {
					rutaTotales=ruta;
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
			this.rutaAux=new Ruta();
			this.rutaAux.setsType(Constantes2.S_TOTALES);
			this.rutaAux.setIsNew(false);
			this.rutaAux.setIsChanged(false);
			this.rutaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RutaConstantesFunciones.TotalizarValoresFilaRuta(this.rutaLogic.getRutas(),this.rutaAux);
				
				this.rutaLogic.getRutas().add(this.rutaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RutaConstantesFunciones.TotalizarValoresFilaRuta(this.rutas,this.rutaAux);
				
				this.rutas.add(this.rutaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rutaTotales=new Ruta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rutaLogic.getRutas().remove(rutaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rutas.remove(rutaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rutaTotales=new Ruta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ruta ruta:rutaLogic.getRutas()) {
				if(ruta.getsType().equals(Constantes2.S_TOTALES)) {
					rutaTotales=ruta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RutaConstantesFunciones.TotalizarValoresFilaRuta(this.rutaLogic.getRutas(),rutaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ruta ruta:this.rutas) {
				if(ruta.getsType().equals(Constantes2.S_TOTALES)) {
					rutaTotales=ruta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RutaConstantesFunciones.TotalizarValoresFilaRuta(this.rutas,rutaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRutasBusquedaPorDestino()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasBusquedaPorOrigen()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorOrigen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasBusquedaPorPrecio()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasFK_IdSectorDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdSectorDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutasFK_IdSectorOrigen()throws Exception {
		try {
			sAccionBusqueda="FK_IdSectorOrigen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRutasBusquedaPorDestino(String sFinalQuery,String destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasBusquedaPorDestino(sFinalQuery,this.pagination,destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasBusquedaPorOrigen(String sFinalQuery,String origen)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasBusquedaPorOrigen(sFinalQuery,this.pagination,origen);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasBusquedaPorPrecio(String sFinalQuery,Double precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasBusquedaPorPrecio(sFinalQuery,this.pagination,precio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasFK_IdSectorDestino(String sFinalQuery,Long id_sector_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasFK_IdSectorDestino(sFinalQuery,this.pagination,id_sector_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutasFK_IdSectorOrigen(String sFinalQuery,Long id_sector_origen)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLogic.getRutasFK_IdSectorOrigen(sFinalQuery,this.pagination,id_sector_origen);
				
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
	
	public void inicializarPermisosRuta() {
		this.isPermisoTodoRuta=false;
		this.isPermisoNuevoRuta=false;
		this.isPermisoActualizarRuta=false;
		this.isPermisoActualizarOriginalRuta=false;
		this.isPermisoEliminarRuta=false;
		this.isPermisoGuardarCambiosRuta=false;
		this.isPermisoConsultaRuta=false;
		this.isPermisoBusquedaRuta=false;
		this.isPermisoReporteRuta=false;		
		this.isPermisoOrdenRuta=false;		
		this.isPermisoPaginacionMedioRuta=false;		
		this.isPermisoPaginacionAltoRuta=false;
		this.isPermisoPaginacionTodoRuta=false;
		this.isPermisoCopiarRuta=false;		
		this.isPermisoVerFormRuta=false;		
		this.isPermisoDuplicarRuta=false;		
		this.isPermisoOrdenRuta=false;		
	}
	
	public void setPermisosUsuarioRuta(Boolean isPermiso) {
		this.isPermisoTodoRuta=isPermiso;
		this.isPermisoNuevoRuta=isPermiso;
		this.isPermisoActualizarRuta=isPermiso;
		this.isPermisoActualizarOriginalRuta=isPermiso;
		this.isPermisoEliminarRuta=isPermiso;
		this.isPermisoGuardarCambiosRuta=isPermiso;
		this.isPermisoConsultaRuta=isPermiso;
		this.isPermisoBusquedaRuta=isPermiso;
		this.isPermisoReporteRuta=isPermiso;
		this.isPermisoOrdenRuta=isPermiso;		
		this.isPermisoPaginacionMedioRuta=isPermiso;		
		this.isPermisoPaginacionAltoRuta=isPermiso;		
		this.isPermisoPaginacionTodoRuta=isPermiso;		
		this.isPermisoCopiarRuta=isPermiso;		
		this.isPermisoVerFormRuta=isPermiso;		
		this.isPermisoDuplicarRuta=isPermiso;
		this.isPermisoOrdenRuta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRuta(Boolean isPermiso) {
		//this.isPermisoTodoRuta=isPermiso;
		this.isPermisoNuevoRuta=isPermiso;
		this.isPermisoActualizarRuta=isPermiso;
		this.isPermisoActualizarOriginalRuta=isPermiso;
		this.isPermisoEliminarRuta=isPermiso;
		this.isPermisoGuardarCambiosRuta=isPermiso;
		//this.isPermisoConsultaRuta=isPermiso;
		//this.isPermisoBusquedaRuta=isPermiso;
		//this.isPermisoReporteRuta=isPermiso;
		//this.isPermisoOrdenRuta=isPermiso;		
		//this.isPermisoPaginacionMedioRuta=isPermiso;		
		//this.isPermisoPaginacionAltoRuta=isPermiso;		
		//this.isPermisoPaginacionTodoRuta=isPermiso;		
		//this.isPermisoCopiarRuta=isPermiso;		
		//this.isPermisoDuplicarRuta=isPermiso;
		//this.isPermisoOrdenRuta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRutaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(RutaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionRutaClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionRutaClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRuta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRutaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRutaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRutaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRutaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormRuta!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.remove(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormRuta!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.remove(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRuta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RutaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rutaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RutaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRuta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRuta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRuta=this.isPermisoActualizarRuta;
			this.isPermisoEliminarRuta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRuta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRuta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRuta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRuta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRuta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRuta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRuta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRuta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRuta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRuta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRuta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRuta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRuta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rutaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRuta.setToolTipText(this.jTableDatosRuta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRuta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRuta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RutaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RutaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRuta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.rutaConstantesFunciones.mostrarClienteRuta && !RutaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.rutaConstantesFunciones.mostrarParametroCarteraDefectoRuta && !RutaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	public void inicializarCombosForeignKeyRutaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.sectororigensForeignKey=new ArrayList();
				this.sectordestinosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRutaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RutaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRutaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySectorOrigenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySectorDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySectorOrigenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sectororigensForeignKey==null||this.sectororigensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SectorConstantesFunciones.SFINALQUERY;

				this.cargarCombosSectorOrigensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySectorDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sectordestinosForeignKey==null||this.sectordestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SectorConstantesFunciones.SFINALQUERY;

				this.cargarCombosSectorDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRutaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RutaParameterReturnGeneral rutaReturnGeneral=new RutaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rutaConstantesFunciones.cargarid_empresaRuta)
					 || (this.esRecargarFks && this.rutaConstantesFunciones.cargarid_empresaRuta)) {

					if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rutaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.rutaConstantesFunciones.cargarid_paisRuta)
					 || (this.esRecargarFks && this.rutaConstantesFunciones.cargarid_paisRuta)) {

					if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+rutaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.rutaConstantesFunciones.cargarid_ciudadRuta)
					 || (this.esRecargarFks && this.rutaConstantesFunciones.cargarid_ciudadRuta)) {

					if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+rutaSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}


				String finalQueryGlobalSectorOrigen="";

				if(((this.sectororigensForeignKey==null||this.sectororigensForeignKey.size()<=0) && this.rutaConstantesFunciones.cargarid_sector_origenRuta)
					 || (this.esRecargarFks && this.rutaConstantesFunciones.cargarid_sector_origenRuta)) {

					if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorOrigen()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSectorOrigen=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

						finalQueryGlobalSectorOrigen=Funciones.GetFinalQueryAppend(finalQueryGlobalSectorOrigen, "");
						finalQueryGlobalSectorOrigen+=SectorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSectorOrigensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSectorOrigen=" WHERE " + ConstantesSql.ID + "="+rutaSessionBean.getlidSectorOrigenActual();
					}
				} else {
					finalQueryGlobalSectorOrigen="NONE";
				}


				String finalQueryGlobalSectorDestino="";

				if(((this.sectordestinosForeignKey==null||this.sectordestinosForeignKey.size()<=0) && this.rutaConstantesFunciones.cargarid_sector_destinoRuta)
					 || (this.esRecargarFks && this.rutaConstantesFunciones.cargarid_sector_destinoRuta)) {

					if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorDestino()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSectorDestino=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

						finalQueryGlobalSectorDestino=Funciones.GetFinalQueryAppend(finalQueryGlobalSectorDestino, "");
						finalQueryGlobalSectorDestino+=SectorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSectorDestinosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSectorDestino=" WHERE " + ConstantesSql.ID + "="+rutaSessionBean.getlidSectorDestinoActual();
					}
				} else {
					finalQueryGlobalSectorDestino="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rutaReturnGeneral=rutaLogic.cargarCombosLoteForeignKeyRuta(finalQueryGlobalEmpresa,finalQueryGlobalPais,finalQueryGlobalCiudad,finalQueryGlobalSectorOrigen,finalQueryGlobalSectorDestino);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rutaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=rutaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=rutaReturnGeneral.getciudadsForeignKey();
			}

			if(!finalQueryGlobalSectorOrigen.equals("NONE")) {
				this.sectororigensForeignKey=rutaReturnGeneral.getsectororigensForeignKey();
			}

			if(!finalQueryGlobalSectorDestino.equals("NONE")) {
				this.sectordestinosForeignKey=rutaReturnGeneral.getsectordestinosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRuta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeySectorOrigen();
			this.addItemDefectoCombosForeignKeySectorDestino();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySectorOrigen()throws Exception {
		try {

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorOrigen()) {
				Sector sectororigen=new Sector();
				SectorConstantesFunciones.setSectorDescripcion(sectororigen,Constantes.SMENSAJE_ESCOJA_OPCION);
				sectororigen.setId(null);

				if(!SectorConstantesFunciones.ExisteEnLista(this.sectororigensForeignKey,sectororigen,true)) {

					this.sectororigensForeignKey.add(0,sectororigen);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySectorDestino()throws Exception {
		try {

			if(!this.rutaSessionBean.getisBusquedaDesdeForeignKeySesionSectorDestino()) {
				Sector sectordestino=new Sector();
				SectorConstantesFunciones.setSectorDescripcion(sectordestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				sectordestino.setId(null);

				if(!SectorConstantesFunciones.ExisteEnLista(this.sectordestinosForeignKey,sectordestino,true)) {

					this.sectordestinosForeignKey.add(0,sectordestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRuta()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRuta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.addItemListener(new ComboBoxItemListener(this,"id_paisRuta"));
						this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.addFocusListener(new ComboBoxFocusListener(this,"id_paisRuta"));
					}
				} else {
					if(this.jInternalFrameDetalleFormRuta!=null) {
						this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.addActionListener(new ComboBoxActionListener(this,"id_paisRuta"));
						this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.addFocusListener(new ComboBoxFocusListener(this,"id_paisRuta"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisRuta.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisRuta"));

						this.jComboBoxid_paisFK_IdPaisRuta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisRuta"));

					} else {
						this.jComboBoxid_paisFK_IdPaisRuta.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisRuta"));

						this.jComboBoxid_paisFK_IdPaisRuta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisRuta"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyRuta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRuta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRuta(Ruta ruta)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(ruta.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(ruta.getid_ciudad(),false,"Formulario");
			this.setActualSectorOrigenForeignKey(ruta.getid_sector_origen(),false,"Formulario");
			this.setActualSectorDestinoForeignKey(ruta.getid_sector_destino(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRuta(Ruta ruta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRuta()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.rutaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.rutaConstantesFunciones.getid_ciudad(),false,"Formulario");
			this.setActualSectorOrigenForeignKey(this.rutaConstantesFunciones.getid_sector_origen(),false,"Formulario");
			this.setActualSectorDestinoForeignKey(this.rutaConstantesFunciones.getid_sector_destino(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRuta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRuta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRuta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRuta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRuta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameSectorOrigensForeignKey("Todos");
			this.cargarCombosFrameSectorDestinosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRuta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSectorOrigensForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSectorDestinosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRuta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta!=null && this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta!=null && this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta!=null && this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta!=null && this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta!=null && this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormRutaPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormRutaid_ciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}






	
	



	public void recargarFormRutaid_ciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.ruta,jComboBoxGenericoCiudad);
			}

			if(this.ruta.getid_pais()!=null && this.ruta.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.ruta.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.ruta.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public RutaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RutaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RutaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rutaSessionBean=new RutaSessionBean(); 
		this.rutaConstantesFunciones=new RutaConstantesFunciones(); 
		this.rutaBean=new Ruta();//(this.rutaConstantesFunciones); 		
		this.rutaReturnGeneral=new RutaParameterReturnGeneral(); 
		
		this.rutaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RutaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RutaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RutaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRuta(true);
			
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
			
			this.rutaConstantesFunciones=new RutaConstantesFunciones(); 
			this.rutaBean=new Ruta();//this.rutaConstantesFunciones); 			
			this.rutaReturnGeneral=new RutaParameterReturnGeneral(); 
		
			RutaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ruta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ruta=new Ruta();
			this.rutas = new ArrayList<Ruta>();
			this.rutasAux = new ArrayList<Ruta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic=new RutaLogic();
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			//this.rutaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rutaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRuta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRuta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRuta);	
					}
					
					if(this.jInternalFrameImportacionRuta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRuta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRuta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRuta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRuta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRuta);
				this.jInternalFrameDetalleFormRuta.setVisible(false);
				this.jInternalFrameDetalleFormRuta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRuta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRuta);
					this.jInternalFrameReporteDinamicoRuta.setVisible(false);
					this.jInternalFrameReporteDinamicoRuta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRuta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRuta);
					this.jInternalFrameImportacionRuta.setVisible(false);
					this.jInternalFrameImportacionRuta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRuta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRuta);
					this.jInternalFrameOrderByRuta.setVisible(false);
					this.jInternalFrameOrderByRuta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRutaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RutaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rutaReturnGeneral=new RutaParameterReturnGeneral();
			
			this.rutaParameterGeneral=new RutaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rutaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RutaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rutaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RutaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rutaSessionBean.getEsGuardarRelacionado(),this.rutaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RutaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rutaSessionBean.getEsGuardarRelacionado(),this.rutaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaDuplicarRuta=true;
			this.isVisibilidadCeldaCopiarRuta=true;
			this.isVisibilidadCeldaVerFormRuta=true;
			this.isVisibilidadCeldaOrdenRuta=true;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=false;
			this.isVisibilidadCeldaGuardarRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			
			
			this.isVisibilidadBusquedaPorDestino=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorOrigen=true;
			this.isVisibilidadBusquedaPorPrecio=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdSectorDestino=true;
			this.isVisibilidadFK_IdSectorOrigen=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRuta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRuta(false);
			
			this.setPermisosUsuarioRuta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutaSessionBean.getEsGuardarRelacionado() 
				|| (this.rutaSessionBean.getEsGuardarRelacionado() && this.rutaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRutaClasesRelacionadas();
			}
			
			if(this.rutaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRutaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RutaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRuta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRuta();
			}
			
			if(!this.isPermisoBusquedaRuta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRuta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRuta,this.isPermisoPaginacionMedioRuta,this.isPermisoPaginacionTodoRuta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RutaConstantesFunciones.getTiposSeleccionarRuta());
				
				this.tiposColumnasSelect=RutaConstantesFunciones.getTiposSeleccionarRuta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRuta();				
				//this.tiposRelacionesSelect=RutaConstantesFunciones.getTiposRelacionesRuta(true);
				
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
			//if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRuta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRuta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRuta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRuta() ;
			
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
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			this.sectororigenLogic=new SectorLogic();
			this.sectordestinoLogic=new SectorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rutaImplementable= (RutaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RutaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rutaImplementableHome= (RutaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RutaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rutas= new ArrayList<Ruta>();
			this.rutasEliminados= new ArrayList<Ruta>();
						
			this.isEsNuevoRuta=false;
			this.esParaAccionDesdeFormularioRuta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.sectororigensForeignKey=new ArrayList<Sector>() ;
			this.sectordestinosForeignKey=new ArrayList<Sector>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRuta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRuta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RutaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RutaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRuta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRuta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRuta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRuta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRuta();
			}
			
			RutaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRuta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRuta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRuta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRuta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Ruta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRuta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRuta")) {
				iIndex=this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRuta.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRuta();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRuta();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRuta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRuta.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesRuta.updateUI();
		//this.jTabbedPaneRelacionesRuta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRuta.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRuta.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesRuta.updateUI();
		//this.jTabbedPaneRelacionesRuta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRuta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosRuta.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosRuta.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.rutaConstantesFunciones.mostrarClienteRuta && !RutaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(rutaConstantesFunciones.resaltarClienteRuta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rutaConstantesFunciones.resaltarClienteRuta);
						}

						jmenuItem.setEnabled(this.rutaConstantesFunciones.activarClienteRuta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormRuta.jmenuDetalleRuta.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.rutaConstantesFunciones.mostrarParametroCarteraDefectoRuta && !RutaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(rutaConstantesFunciones.resaltarParametroCarteraDefectoRuta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rutaConstantesFunciones.resaltarParametroCarteraDefectoRuta);
						}

						jmenuItem.setEnabled(this.rutaConstantesFunciones.activarParametroCarteraDefectoRuta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormRuta.jmenuDetalleRuta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRuta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRuta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRuta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRutaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRuta();
		
		this.cargarCombosFrameForeignKeyRuta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRuta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRuta();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySectorOrigen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySectorOrigenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySectorOrigen();
				this.cargarCombosFrameSectorOrigensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaSectorOrigen(this.sectororigensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySectorDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySectorDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySectorDestino();
				this.cargarCombosFrameSectorDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaSectorDestino(this.sectordestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRutaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rutaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			
			if(jTableDatosRuta.getRowCount()>=1) {
				jTableDatosRuta.removeRowSelectionInterval(0, jTableDatosRuta.getRowCount()-1);						
			}
			
			this.isEsNuevoRuta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRuta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRuta(true);			
			//this.ruta=new Ruta();
			//this.ruta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRuta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRuta() ;
			
			if(RutaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRuta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ruta);	
			this.actualizarInformacion("INFO_PADRE",false,this.ruta);				
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			if(this.rutaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Ruta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRutaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRuta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRuta.getSelectedRows().length;			
			}
			
			rutasSeleccionados=this.getRutasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRuta--;			
				//Ruta rutaAux= new Ruta();			
				//rutaAux.setId(this.iIdNuevoRuta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Ruta rutaOrigen=new Ruta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Ruta rutaOrigen : rutasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRuta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rutaOrigen =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutaOrigen =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRuta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ruta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRuta(rutaOrigen,this.ruta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rutaLogic.getRutas().add(this.rutaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rutas.add(this.rutaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRuta(false);
				
				this.jTableDatosRuta.setRowSelectionInterval(this.getIndiceNuevoRuta(), this.getIndiceNuevoRuta());
				
				int iLastRow =  this.jTableDatosRuta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRuta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRuta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRuta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();									
		
			Ruta rutaOrigen=new Ruta();
			Ruta rutaDestino=new Ruta();
				
			rutasSeleccionados=this.getRutasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRuta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rutasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRuta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaOrigen =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rutaOrigen =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutaDestino =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rutaDestino =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rutaOrigen =rutasSeleccionados.get(0);
				rutaDestino =rutasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRuta(rutaOrigen,rutaDestino,true,false);
				
				rutaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rutaDestino,rutaLogic.getRutas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutaDestino,rutas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRuta(false);
				
				//this.jTableDatosRuta.setRowSelectionInterval(this.getIndiceNuevoRuta(), this.getIndiceNuevoRuta());
				
				int iLastRow =  this.jTableDatosRuta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRuta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRuta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRuta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRuta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRuta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRuta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRuta.setVisible(!isVisible);
			this.jPanelPaginacionRuta.setVisible(!isVisible);
			this.jPanelAccionesRuta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRuta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRuta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRuta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRuta();
			
			this.abrirFrameOrderByRuta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRuta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRuta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRuta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRuta.isMaximum()) {
					this.jInternalFrameDetalleFormRuta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRuta.setSize(this.jInternalFrameDetalleFormRuta.iWidthFormulario,this.jInternalFrameDetalleFormRuta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRuta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRuta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRuta.isMaximum()) {
						this.jInternalFrameDetalleFormRuta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth(),RutaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth(),RutaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth(),RutaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRuta.setVisible(true);
	        this.jInternalFrameDetalleFormRuta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRuta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRuta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRuta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRuta,false,this);
				} else {
					this.jInternalFrameOrderByRuta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRuta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRuta);
				this.jInternalFrameOrderByRuta.setVisible(false);
				this.jInternalFrameOrderByRuta.setSelected(false);
				
				this.jInternalFrameOrderByRuta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRuta"));
				
				this.inicializarActualizarBindingTablaOrderByRuta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRuta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRuta==null) {
				
				this.jInternalFrameImportacionRuta=new ImportacionJInternalFrame(RutaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRuta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRuta);
				this.jInternalFrameImportacionRuta.setVisible(false);
				this.jInternalFrameImportacionRuta.setSelected(false);


				this.jInternalFrameImportacionRuta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRuta"));
				this.jInternalFrameImportacionRuta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRuta"));
				this.jInternalFrameImportacionRuta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRuta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRuta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRuta==null) {
				this.jInternalFrameReporteDinamicoRuta=new ReporteDinamicoJInternalFrame(RutaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRuta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRuta);
				this.jInternalFrameReporteDinamicoRuta.setVisible(false);
				this.jInternalFrameReporteDinamicoRuta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRuta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRuta"));
				this.jInternalFrameReporteDinamicoRuta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRuta"));
				this.jInternalFrameReporteDinamicoRuta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRuta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRuta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRuta.jContentPaneDetalleRuta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRuta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRuta);
			
	       	this.jInternalFrameDetalleFormRuta.setVisible(false);
	        this.jInternalFrameDetalleFormRuta.setSelected(false);
			
			//this.jInternalFrameDetalleFormRuta.dispose();
			//this.jInternalFrameDetalleFormRuta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRuta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRuta.setVisible(true);
	        this.jInternalFrameReporteDinamicoRuta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRuta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRuta.setVisible(true);
	        this.jInternalFrameImportacionRuta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRuta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRuta.setVisible(true);
	        this.jInternalFrameOrderByRuta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRuta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRuta.setVisible(false);
	        this.jInternalFrameOrderByRuta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRuta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRuta.setVisible(false);
	        this.jInternalFrameReporteDinamicoRuta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRuta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRuta.setVisible(false);
	        this.jInternalFrameImportacionRuta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRuta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRuta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRuta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRuta(true);
			//this.isEsNuevoRuta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRuta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRuta(false) ;
			
			if(rutaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RutaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRuta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRuta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRutaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRuta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRuta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRuta(true);
			//this.isEsNuevoRuta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ruta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRuta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRuta(false) ;
			
			if(RutaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRuta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRuta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRuta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRuta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSectorOrigen(List<Sector> sectororigensForeignKey)throws Exception{
		TableColumn tableColumnSectorOrigen=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDSECTORORIGEN));
		TableCellEditor tableCellEditorSectorOrigen =tableColumnSectorOrigen.getCellEditor();

		SectorTableCell sectorTableCellFk=(SectorTableCell)tableCellEditorSectorOrigen;

		if(sectorTableCellFk!=null) {
			sectorTableCellFk.setsectorsForeignKey(sectororigensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRuta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sectorTableCellFk.setRowActual(intSelectedRow);
			//sectorTableCellFk.setsectorsForeignKeyActual(sectororigensForeignKey);
		//}


		if(sectorTableCellFk!=null) {
			sectorTableCellFk.RecargarSectorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaSectorDestino(List<Sector> sectordestinosForeignKey)throws Exception{
		TableColumn tableColumnSectorDestino=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDSECTORDESTINO));
		TableCellEditor tableCellEditorSectorDestino =tableColumnSectorDestino.getCellEditor();

		SectorTableCell sectorTableCellFk=(SectorTableCell)tableCellEditorSectorDestino;

		if(sectorTableCellFk!=null) {
			sectorTableCellFk.setsectorsForeignKey(sectordestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRuta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sectorTableCellFk.setRowActual(intSelectedRow);
			//sectorTableCellFk.setsectorsForeignKeyActual(sectordestinosForeignKey);
		//}


		if(sectorTableCellFk!=null) {
			sectorTableCellFk.RecargarSectorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRuta(false);
			
			//if(!this.isEsNuevoRuta) {								
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				
			}
			
			if(this.permiteMantenimiento(this.ruta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rutaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRuta=true;
					this.inicializarActualizarBindingTablaRuta(false);
					this.isEsNuevoRuta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRuta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRuta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRuta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRuta(false);
				
				this.habilitarDeshabilitarControlesRuta(false);
			
												
				
				if(RutaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRuta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRutaActionPerformed(evt,rutaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRuta(this.ruta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRuta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rutaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ruta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRutaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRuta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				this.ruta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				this.ruta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ruta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rutaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RutaModel) this.jTableDatosRuta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRuta=true;
				this.inicializarActualizarBindingTablaRuta(false);
				this.isEsNuevoRuta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRuta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRuta(false);
				
				this.habilitarDeshabilitarControlesRuta(false);
				
				
				
				if(RutaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRuta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRutaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRuta.getRowCount()>=1) {
				jTableDatosRuta.removeRowSelectionInterval(0, jTableDatosRuta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRuta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRuta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRuta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRuta(false) ;
			
			this.isEsNuevoRuta=false;
			
			if(RutaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRuta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRutaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRuta(false);
				
				//SI ES MANUAL
				if(RutaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRuta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRutaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRuta--;			
			//Ruta rutaAux= new Ruta();			
			//rutaAux.setId(this.iIdNuevoRuta);
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRuta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
			
			this.ruta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rutaLogic.getRutas().add(this.rutaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rutas.add(this.rutaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRuta(false);
			
			this.jTableDatosRuta.setRowSelectionInterval(this.getIndiceNuevoRuta(), this.getIndiceNuevoRuta());
			
			int iLastRow =  this.jTableDatosRuta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRuta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRuta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRuta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRutaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRuta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRuta(false);
			
			//SI ES MANUAL
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRuta();
			}
			
			//this.abrirFrameTreeRuta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRutaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE RutaS ?", "MANTENIMIENTO DE Ruta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRuta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRuta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rutaReturnGeneral=rutaLogic.procesarImportacionRutasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rutaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRutaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRutaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRuta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRuta.setFileImportacion(this.jInternalFrameImportacionRuta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRuta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRuta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRuta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRuta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRutaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		

		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RutaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RutaBaseDesign.jrxml";
			
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
			
			this.generarReporteRutas("Todos",rutasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RutaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_IDSECTORORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SectorOrigen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SectorOrigen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SectorOrigen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SectorOrigen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_IDSECTORDESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SectorDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SectorDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SectorDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SectorDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_ORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_igen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_igen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_igen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_igen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_DESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRuta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RutaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RutaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case RutaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORORIGEN:
					sNombreCampoCategoria="id_sector_origen";
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORDESTINO:
					sNombreCampoCategoria="id_sector_destino";
					break;

				case RutaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case RutaConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoria="origen";
					break;

				case RutaConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoria="destino";
					break;

				case RutaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case RutaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RutaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RutaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case RutaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORORIGEN:
					sNombreCampoCategoriaValor="id_sector_origen";
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORDESTINO:
					sNombreCampoCategoriaValor="id_sector_destino";
					break;

				case RutaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case RutaConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoriaValor="origen";
					break;

				case RutaConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoriaValor="destino";
					break;

				case RutaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case RutaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRuta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRuta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RutaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RutaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case RutaConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sector Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sector_origen");
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORDESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sector Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sector_destino");
					break;

				case RutaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case RutaConstantesFunciones.LABEL_ORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"origen");
					break;

				case RutaConstantesFunciones.LABEL_DESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"destino");
					break;

				case RutaConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case RutaConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
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
	
	public void jButtonGenerarExcelReporteDinamicoRutaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Rutas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RutaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORORIGEN);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getsectororigen_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_IDSECTORDESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORDESTINO);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getsectordestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_ORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_ORIGEN);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getorigen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_DESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_DESTINO);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getdestino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Ruta ruta:rutasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ruta.getdireccion());
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
			//	this.getFilaCabeceraExportarExcelRuta(row);				
			//	iRow++;
			//}				
			
			//for(Ruta rutaAux:rutasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRuta(rutaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
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
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRuta(false);
			
			//SI ES MANUAL
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRuta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRutaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRuta(false);
			
			//SI ES MANUAL
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRuta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRutaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRuta(false);
			
			//SI ES MANUAL
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRuta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRuta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRuta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRuta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRuta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRuta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRuta.setMinimumSize(dimensionMinimum);
		this.jTableDatosRuta.setMaximumSize(dimensionMaximum);
		this.jTableDatosRuta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRuta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRuta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRuta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRuta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRuta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRuta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRuta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRuta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RutaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RutaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRuta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRuta();
		
		this.inicializarActualizarBindingBotonesManualRuta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRuta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRuta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRuta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRuta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRuta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRuta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRuta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRuta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionNuevoRuta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionSinCerrarRuta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionSinMensajeRuta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRuta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRuta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRuta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRuta!=null) {
				this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionNuevoRuta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionSinCerrarRuta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRuta.jCheckBoxPostAccionSinMensajeRuta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRuta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRuta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRuta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRuta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRuta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRuta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRuta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRuta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRuta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRuta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRuta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRuta(Boolean esInicializar) throws Exception {
		try	{	
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRuta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRuta() throws Exception {
		try	{
			if(RutaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRuta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRuta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRuta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRuta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRuta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRuta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRuta.addItem(reporte);
			}
			
			
			if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRuta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRuta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRuta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRuta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRuta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRuta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRuta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRuta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRuta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRuta!=null) {
				this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRuta!=null) {
				this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRuta!=null) {
				
				if(this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRuta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRuta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRuta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RutaConstantesFunciones.getTiposSeleccionarRuta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RutaConstantesFunciones.getTiposSeleccionarRuta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRuta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRuta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RutaConstantesFunciones.getTiposSeleccionarRuta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRuta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRuta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRuta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.destinoBusquedaPorDestino=this.jTextAreadestinoBusquedaPorDestinoRuta.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreRuta.getText();
		this.origenBusquedaPorOrigen=this.jTextAreaorigenBusquedaPorOrigenRuta.getText();
		this.precioBusquedaPorPrecio=Double.parseDouble(this.jTextFieldprecioBusquedaPorPrecioRuta.getText());
		if(this.jComboBoxid_paisFK_IdPaisRuta.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisRuta.getSelectedItem()).getId();}
		if(this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.getSelectedItem()!=null){this.id_sector_destinoFK_IdSectorDestino=((Sector)this.jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.getSelectedItem()).getId();}
		if(this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.getSelectedItem()!=null){this.id_sector_origenFK_IdSectorOrigen=((Sector)this.jComboBoxid_sector_origenFK_IdSectorOrigenRuta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRuta(Boolean esInicializar) throws Exception {				
		if(RutaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRuta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRuta() throws Exception {
		this.inicializarActualizarBindingTablaRuta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRuta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRuta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRuta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRutaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRuta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRuta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rutaLogic.getRutas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rutas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRuta.setModel(new RutaModel(this.rutaLogic.getRutas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRuta.setModel(new RutaModel(this.rutas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRuta!=null && this.jInternalFrameOrderByRuta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRuta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RutaConstantesFunciones.SCLASSWEBTITULO,rutaConstantesFunciones.resaltarSeleccionarRuta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RutaConstantesFunciones.SCLASSWEBTITULO,rutaConstantesFunciones.resaltarSeleccionarRuta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_ID));

		if(this.rutaConstantesFunciones.mostraridRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rutaConstantesFunciones.resaltaridRuta,this.rutaConstantesFunciones.activaridRuta,iSizeTabla,this,true,"idRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltaridRuta,this.rutaConstantesFunciones.activaridRuta,this,true,"idRuta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rutaConstantesFunciones.mostrarid_empresaRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rutaConstantesFunciones.resaltarid_empresaRuta,this,this.rutaConstantesFunciones.activarid_empresaRuta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rutaConstantesFunciones.resaltarid_empresaRuta,this,this.rutaConstantesFunciones.activarid_empresaRuta,false,"id_empresaRuta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDPAIS));

		if(this.rutaConstantesFunciones.mostrarid_paisRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.rutaConstantesFunciones.resaltarid_paisRuta,this,this.rutaConstantesFunciones.activarid_paisRuta,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.rutaConstantesFunciones.resaltarid_paisRuta,this,this.rutaConstantesFunciones.activarid_paisRuta,true,"id_paisRuta","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDCIUDAD));

		if(this.rutaConstantesFunciones.mostrarid_ciudadRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.rutaConstantesFunciones.resaltarid_ciudadRuta,this,this.rutaConstantesFunciones.activarid_ciudadRuta,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.rutaConstantesFunciones.resaltarid_ciudadRuta,this,this.rutaConstantesFunciones.activarid_ciudadRuta,true,"id_ciudadRuta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDSECTORORIGEN));

		if(this.rutaConstantesFunciones.mostrarid_sector_origenRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_IDSECTORORIGEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SectorTableCell(this.sectororigensForeignKey,this.rutaConstantesFunciones.resaltarid_sector_origenRuta,this,this.rutaConstantesFunciones.activarid_sector_origenRuta,iSizeTabla));
			tableColumn.setCellEditor(new SectorTableCell(this.sectororigensForeignKey,this.rutaConstantesFunciones.resaltarid_sector_origenRuta,this,this.rutaConstantesFunciones.activarid_sector_origenRuta,true,"id_sector_origenRuta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_IDSECTORDESTINO));

		if(this.rutaConstantesFunciones.mostrarid_sector_destinoRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_IDSECTORDESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SectorTableCell(this.sectordestinosForeignKey,this.rutaConstantesFunciones.resaltarid_sector_destinoRuta,this,this.rutaConstantesFunciones.activarid_sector_destinoRuta,iSizeTabla));
			tableColumn.setCellEditor(new SectorTableCell(this.sectordestinosForeignKey,this.rutaConstantesFunciones.resaltarid_sector_destinoRuta,this,this.rutaConstantesFunciones.activarid_sector_destinoRuta,true,"id_sector_destinoRuta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_NOMBRE));

		if(this.rutaConstantesFunciones.mostrarnombreRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutaConstantesFunciones.resaltarnombreRuta,this.rutaConstantesFunciones.activarnombreRuta,iSizeTabla,this,true,"nombreRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltarnombreRuta,this.rutaConstantesFunciones.activarnombreRuta,this,true,"nombreRuta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_ORIGEN));

		if(this.rutaConstantesFunciones.mostrarorigenRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_ORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutaConstantesFunciones.resaltarorigenRuta,this.rutaConstantesFunciones.activarorigenRuta,iSizeTabla,this,true,"origenRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltarorigenRuta,this.rutaConstantesFunciones.activarorigenRuta,this,true,"origenRuta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_DESTINO));

		if(this.rutaConstantesFunciones.mostrardestinoRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_DESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutaConstantesFunciones.resaltardestinoRuta,this.rutaConstantesFunciones.activardestinoRuta,iSizeTabla,this,true,"destinoRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltardestinoRuta,this.rutaConstantesFunciones.activardestinoRuta,this,true,"destinoRuta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_PRECIO));

		if(this.rutaConstantesFunciones.mostrarprecioRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rutaConstantesFunciones.resaltarprecioRuta,this.rutaConstantesFunciones.activarprecioRuta,iSizeTabla,this,true,"precioRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltarprecioRuta,this.rutaConstantesFunciones.activarprecioRuta,this,true,"precioRuta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRuta,RutaConstantesFunciones.LABEL_DIRECCION));

		if(this.rutaConstantesFunciones.mostrardireccionRuta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutaConstantesFunciones.resaltardireccionRuta,this.rutaConstantesFunciones.activardireccionRuta,iSizeTabla,this,true,"direccionRuta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutaConstantesFunciones.resaltardireccionRuta,this.rutaConstantesFunciones.activardireccionRuta,this,true,"direccionRuta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rutaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.rutaConstantesFunciones.mostrarClienteRuta && !RutaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(rutaConstantesFunciones.resaltarClienteRuta,this,this.rutaConstantesFunciones.activarClienteRuta));
				tableColumn.setCellEditor(new ClienteTableCell(rutaConstantesFunciones.resaltarClienteRuta,this,this.rutaConstantesFunciones.activarClienteRuta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRuta.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.rutaConstantesFunciones.mostrarParametroCarteraDefectoRuta && !RutaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(rutaConstantesFunciones.resaltarParametroCarteraDefectoRuta,this,this.rutaConstantesFunciones.activarParametroCarteraDefectoRuta));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(rutaConstantesFunciones.resaltarParametroCarteraDefectoRuta,this,this.rutaConstantesFunciones.activarParametroCarteraDefectoRuta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRuta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRuta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRuta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRuta && this.isPermisoGuardarCambiosRuta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rutaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRuta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.rutaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosRuta.addColumn(tableColumn);
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
			
			this.jTableDatosRuta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRuta && this.isPermisoGuardarCambiosRuta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rutaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRuta && this.isPermisoGuardarCambiosRuta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRuta.moveColumn(this.jTableDatosRuta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRuta.moveColumn(this.jTableDatosRuta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rutaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRuta.moveColumn(this.jTableDatosRuta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRuta.moveColumn(this.jTableDatosRuta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRuta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRuta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRuta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRuta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRuta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRuta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRuta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRuta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rutaLogic.getRutas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rutas.size()-1;
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
		//this.jTableDatosRuta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRuta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRuta();
			
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
				
				//this.isEsNuevoRuta=false;
					
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRuta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRuta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRuta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ruta.getsType().equals("DUPLICADO")
				   || this.ruta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRuta=true;
				
				} else {
					this.isEsNuevoRuta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
					if(this.ruta.getId()>=0 && !this.ruta.getIsNew()) {						
						this.isEsNuevoRuta=false;
						
					} else {
						this.isEsNuevoRuta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRuta(esRelaciones);						
				
				this.seleccionarRuta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ruta.getId()<0) {
					this.isEsNuevoRuta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRuta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRuta(evt,rowIndex);
				}	
				
				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Ruta: " + this.dDif); 
					}
				}								
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRuta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ruta)) {
					if(this.ruta.getId()>0) {
						this.ruta.setIsDeleted(true);
						
						this.rutasEliminados.add(this.ruta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rutaLogic.getRutas().remove(this.ruta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rutas.remove(this.ruta);				
					}
					
					
					((RutaModel) this.jTableDatosRuta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRuta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRuta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRuta) {
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRuta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRuta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRuta(this.ruta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rutaConstantesFunciones.cargarid_empresaRuta || this.rutaConstantesFunciones.event_dependid_empresaRuta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ruta.getid_empresa());
									//this.inicializarActualizarBindingRuta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ruta.getEmpresa()!=null) {
							this.empresasForeignKey.add(ruta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ruta.getid_empresa(),false,"Formulario");

					//Pais
					if(!this.rutaConstantesFunciones.cargarid_paisRuta || this.rutaConstantesFunciones.event_dependid_paisRuta) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.ruta.getid_pais());
									//this.inicializarActualizarBindingRuta(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(ruta.getPais()!=null) {
							this.paissForeignKey.add(ruta.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.ruta.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.rutaConstantesFunciones.cargarid_ciudadRuta || this.rutaConstantesFunciones.event_dependid_ciudadRuta) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.ruta.getid_ciudad());
									//this.inicializarActualizarBindingRuta(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(ruta.getCiudad()!=null) {
							this.ciudadsForeignKey.add(ruta.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.ruta.getid_ciudad(),false,"Formulario");

					//SectorOrigen
					if(!this.rutaConstantesFunciones.cargarid_sector_origenRuta || this.rutaConstantesFunciones.event_dependid_sector_origenRuta) {
						//this.cargarCombosSectorOrigensForeignKeyLista(" where id="+this.ruta.getid_sector_origen());
									//this.inicializarActualizarBindingRuta(false,false);
						this.sectororigensForeignKey=new ArrayList<Sector>();

						if(ruta.getSectorOrigen()!=null) {
							this.sectororigensForeignKey.add(ruta.getSectorOrigen());
						}

						this.addItemDefectoCombosForeignKeySectorOrigen();
						this.cargarCombosFrameSectorOrigensForeignKey("Todos");
					}
					this.setActualSectorOrigenForeignKey(this.ruta.getid_sector_origen(),false,"Formulario");

					//SectorDestino
					if(!this.rutaConstantesFunciones.cargarid_sector_destinoRuta || this.rutaConstantesFunciones.event_dependid_sector_destinoRuta) {
						//this.cargarCombosSectorDestinosForeignKeyLista(" where id="+this.ruta.getid_sector_destino());
									//this.inicializarActualizarBindingRuta(false,false);
						this.sectordestinosForeignKey=new ArrayList<Sector>();

						if(ruta.getSectorDestino()!=null) {
							this.sectordestinosForeignKey.add(ruta.getSectorDestino());
						}

						this.addItemDefectoCombosForeignKeySectorDestino();
						this.cargarCombosFrameSectorDestinosForeignKey("Todos");
					}
					this.setActualSectorDestinoForeignKey(this.ruta.getid_sector_destino(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRuta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRuta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRuta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRuta(Ruta ruta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRuta(ruta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRuta(Ruta ruta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRuta(ruta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRuta(ruta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRuta(ruta);
	}
	
	public void setVariablesObjetoActualToFormularioRuta(Ruta ruta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRuta.jLabelidRuta.setText(ruta.getId().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setText(ruta.getnombre());
			this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setText(ruta.getorigen());
			this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setText(ruta.getdestino());
			this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setText(ruta.getprecio().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setText(ruta.getdireccion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Ruta rutaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rutaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Ruta rutaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rutaLocal=this.ruta;
			} else {
				rutaLocal=this.rutaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rutaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRuta(rutaLocal,true);
					
					if(rutaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rutaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rutaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rutaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRuta(Ruta ruta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRuta(ruta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRuta(ruta);
	}
	
	public void setVariablesFormularioToObjetoActualRuta(Ruta ruta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRuta(ruta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRuta(Ruta ruta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRuta.jLabelidRuta.getText()==null || this.jInternalFrameDetalleFormRuta.jLabelidRuta.getText()=="" || this.jInternalFrameDetalleFormRuta.jLabelidRuta.getText()=="Id") {
				this.jInternalFrameDetalleFormRuta.jLabelidRuta.setText("0");
			}

			if(conColumnasBase) {ruta.setId(Long.parseLong(this.jInternalFrameDetalleFormRuta.jLabelidRuta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelIdRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ruta.setnombre(this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelnombreRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ruta.setorigen(this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_ORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelorigenRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ruta.setdestino(this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_DESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabeldestinoRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ruta.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabelprecioRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ruta.setdireccion(this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRuta.jLabeldireccionRuta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRuta(Ruta rutaBean,Ruta ruta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rutaBean.getid_pais()!=null && !rutaBean.getid_pais().equals(-1L))) {ruta.setid_pais(rutaBean.getid_pais());}
			if(conDefault || (!conDefault && rutaBean.getid_ciudad()!=null && !rutaBean.getid_ciudad().equals(-1L))) {ruta.setid_ciudad(rutaBean.getid_ciudad());}
			if(conDefault || (!conDefault && rutaBean.getid_sector_origen()!=null && !rutaBean.getid_sector_origen().equals(-1L))) {ruta.setid_sector_origen(rutaBean.getid_sector_origen());}
			if(conDefault || (!conDefault && rutaBean.getid_sector_destino()!=null && !rutaBean.getid_sector_destino().equals(-1L))) {ruta.setid_sector_destino(rutaBean.getid_sector_destino());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRuta(Ruta rutaOrigen,Ruta ruta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rutaOrigen.getId()!=null && !rutaOrigen.getId().equals(0L))) {ruta.setId(rutaOrigen.getId());}}
			if(conDefault || (!conDefault && rutaOrigen.getid_pais()!=null && !rutaOrigen.getid_pais().equals(-1L))) {ruta.setid_pais(rutaOrigen.getid_pais());}
			if(conDefault || (!conDefault && rutaOrigen.getid_ciudad()!=null && !rutaOrigen.getid_ciudad().equals(-1L))) {ruta.setid_ciudad(rutaOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && rutaOrigen.getid_sector_origen()!=null && !rutaOrigen.getid_sector_origen().equals(-1L))) {ruta.setid_sector_origen(rutaOrigen.getid_sector_origen());}
			if(conDefault || (!conDefault && rutaOrigen.getid_sector_destino()!=null && !rutaOrigen.getid_sector_destino().equals(-1L))) {ruta.setid_sector_destino(rutaOrigen.getid_sector_destino());}
			if(conDefault || (!conDefault && rutaOrigen.getnombre()!=null && !rutaOrigen.getnombre().equals(""))) {ruta.setnombre(rutaOrigen.getnombre());}
			if(conDefault || (!conDefault && rutaOrigen.getorigen()!=null && !rutaOrigen.getorigen().equals(""))) {ruta.setorigen(rutaOrigen.getorigen());}
			if(conDefault || (!conDefault && rutaOrigen.getdestino()!=null && !rutaOrigen.getdestino().equals(""))) {ruta.setdestino(rutaOrigen.getdestino());}
			if(conDefault || (!conDefault && rutaOrigen.getprecio()!=null && !rutaOrigen.getprecio().equals(0.0))) {ruta.setprecio(rutaOrigen.getprecio());}
			if(conDefault || (!conDefault && rutaOrigen.getdireccion()!=null && !rutaOrigen.getdireccion().equals(""))) {ruta.setdireccion(rutaOrigen.getdireccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRuta(Ruta ruta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRuta.jLabelidRuta.setText(ruta.getId().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setText(ruta.getnombre());
			this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setText(ruta.getorigen());
			this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setText(ruta.getdestino());
			this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setText(ruta.getprecio().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setText(ruta.getdireccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRuta(RutaBean rutaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRuta.jLabelidRuta.setText(rutaBean.getId().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setText(rutaBean.getnombre());
			this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setText(rutaBean.getorigen());
			this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setText(rutaBean.getdestino());
			this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setText(rutaBean.getprecio().toString());
			this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setText(rutaBean.getdireccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRuta(RutaParameterReturnGeneral rutaReturnGeneral,RutaBean rutaBean,Boolean conDefault) throws Exception { 
		try {
			Ruta rutaLocal=new Ruta();
			
			rutaLocal=rutaReturnGeneral.getRuta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rutaLocal.getId()!=null && !rutaLocal.getId().equals(0L))) {rutaBean.setId(rutaLocal.getId());}}
			if(conDefault || (!conDefault && rutaLocal.getid_pais()!=null && !rutaLocal.getid_pais().equals(-1L))) {rutaBean.setid_pais(rutaLocal.getid_pais());}
			if(conDefault || (!conDefault && rutaLocal.getid_ciudad()!=null && !rutaLocal.getid_ciudad().equals(-1L))) {rutaBean.setid_ciudad(rutaLocal.getid_ciudad());}
			if(conDefault || (!conDefault && rutaLocal.getid_sector_origen()!=null && !rutaLocal.getid_sector_origen().equals(-1L))) {rutaBean.setid_sector_origen(rutaLocal.getid_sector_origen());}
			if(conDefault || (!conDefault && rutaLocal.getid_sector_destino()!=null && !rutaLocal.getid_sector_destino().equals(-1L))) {rutaBean.setid_sector_destino(rutaLocal.getid_sector_destino());}
			if(conDefault || (!conDefault && rutaLocal.getnombre()!=null && !rutaLocal.getnombre().equals(""))) {rutaBean.setnombre(rutaLocal.getnombre());}
			if(conDefault || (!conDefault && rutaLocal.getorigen()!=null && !rutaLocal.getorigen().equals(""))) {rutaBean.setorigen(rutaLocal.getorigen());}
			if(conDefault || (!conDefault && rutaLocal.getdestino()!=null && !rutaLocal.getdestino().equals(""))) {rutaBean.setdestino(rutaLocal.getdestino());}
			if(conDefault || (!conDefault && rutaLocal.getprecio()!=null && !rutaLocal.getprecio().equals(0.0))) {rutaBean.setprecio(rutaLocal.getprecio());}
			if(conDefault || (!conDefault && rutaLocal.getdireccion()!=null && !rutaLocal.getdireccion().equals(""))) {rutaBean.setdireccion(rutaLocal.getdireccion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRutaGenerico(Long idRutaSeleccionado,JComboBox jComboBoxRuta,List<Ruta> rutasLocal)throws Exception {
		try {
			Ruta  rutaTemp=null;

			for(Ruta rutaAux:rutasLocal) {
				if(rutaAux.getId()!=null && rutaAux.getId().equals(idRutaSeleccionado)) {
					rutaTemp=rutaAux;
					break;
				}
			}

			jComboBoxRuta.setSelectedItem(rutaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRutaGenerico(JComboBox jComboBoxRuta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRuta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRuta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRuta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRuta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRuta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRuta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ruta=(Ruta) rutaLogic.getRutas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ruta =(Ruta) rutas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ruta.getIsNew() && !ruta.getIsChanged() && !ruta.getIsDeleted()) {
				sDescripcion=ruta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ruta.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!ruta.getIsNew() && !ruta.getIsChanged() && !ruta.getIsDeleted()) {
				sDescripcion=ruta.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=ruta.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!ruta.getIsNew() && !ruta.getIsChanged() && !ruta.getIsDeleted()) {
				sDescripcion=ruta.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=ruta.getciudad_descripcion();
			}
		}

		if(sTipo.equals("SectorOrigen")) {
			//sDescripcion=this.getActualSectorOrigenForeignKeyDescripcion((Long)value);
			if(!ruta.getIsNew() && !ruta.getIsChanged() && !ruta.getIsDeleted()) {
				sDescripcion=ruta.getsectororigen_descripcion();
			} else {
				//sDescripcion=this.getActualSectorOrigenForeignKeyDescripcion((Long)value);
				sDescripcion=ruta.getsectororigen_descripcion();
			}
		}

		if(sTipo.equals("SectorDestino")) {
			//sDescripcion=this.getActualSectorDestinoForeignKeyDescripcion((Long)value);
			if(!ruta.getIsNew() && !ruta.getIsChanged() && !ruta.getIsDeleted()) {
				sDescripcion=ruta.getsectordestino_descripcion();
			} else {
				//sDescripcion=this.getActualSectorDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=ruta.getsectordestino_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Ruta rutaRow=new Ruta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rutaRow=(Ruta) rutaLogic.getRutas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rutaRow=(Ruta) rutas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Ruta ruta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRuta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta = (Ruta)this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.ruta = (Ruta)this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(ruta!=null) {
						this.ruta = ruta;
					} else {
						this.ruta = new Ruta();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.ruta)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame;
					}

					List<Ruta> rutas=new ArrayList<Ruta>();
					rutas.add(this.ruta);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRuta.cargarClienteBeanSwingJInternalFrame(rutas,this.ruta,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderRuta.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rutaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Ruta ruta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRuta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta = (Ruta)this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.ruta = (Ruta)this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(ruta!=null) {
						this.ruta = ruta;
					} else {
						this.ruta = new Ruta();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.ruta)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<Ruta> rutas=new ArrayList<Ruta>();
					rutas.add(this.ruta);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRuta.cargarParametroCarteraDefectoBeanSwingJInternalFrame(rutas,this.ruta,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderRuta.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rutaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRuta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta));			
			this.jButtonDuplicarRuta.setVisible((this.isVisibilidadCeldaDuplicarRuta && this.isPermisoDuplicarRuta));			
			this.jButtonCopiarRuta.setVisible((this.isVisibilidadCeldaCopiarRuta && this.isPermisoCopiarRuta));
			this.jButtonVerFormRuta.setVisible((this.isVisibilidadCeldaVerFormRuta && this.isPermisoVerFormRuta));
			
			this.jButtonAbrirOrderByRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));			
			
			this.jButtonNuevoRelacionesRuta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRuta && this.isPermisoNuevoRuta));			
			this.jButtonNuevoGuardarCambiosRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta && this.isPermisoGuardarCambiosRuta));
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.jInternalFrameDetalleFormRuta.jButtonModificarRuta.setVisible((this.isVisibilidadCeldaModificarRuta && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.setVisible((this.isVisibilidadCeldaActualizarRuta && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.setVisible((this.isVisibilidadCeldaEliminarRuta && this.isPermisoEliminarRuta));
			this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.setVisible(this.isVisibilidadCeldaCancelarRuta);							
			this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.setVisible((this.isVisibilidadCeldaGuardarRuta && this.isPermisoGuardarCambiosRuta));			
			
			}
						
			this.jButtonGuardarCambiosTablaRuta.setVisible((this.isVisibilidadCeldaGuardarCambiosRuta && this.isPermisoGuardarCambiosRuta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta));						
			this.jButtonDuplicarToolBarRuta.setVisible((this.isVisibilidadCeldaDuplicarRuta && this.isPermisoDuplicarRuta));						
			this.jButtonCopiarToolBarRuta.setVisible((this.isVisibilidadCeldaCopiarRuta && this.isPermisoCopiarRuta));			
			this.jButtonVerFormToolBarRuta.setVisible((this.isVisibilidadCeldaVerFormRuta && this.isPermisoVerFormRuta));			
			this.jButtonAbrirOrderByToolBarRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));
			this.jButtonNuevoRelacionesToolBarRuta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRuta && this.isPermisoNuevoRuta));			
			this.jButtonNuevoGuardarCambiosToolBarRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta && this.isPermisoGuardarCambiosRuta));			
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.jInternalFrameDetalleFormRuta.jButtonModificarToolBarRuta.setVisible((this.isVisibilidadCeldaModificarRuta && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jButtonActualizarToolBarRuta.setVisible((this.isVisibilidadCeldaActualizarRuta  && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jButtonEliminarToolBarRuta.setVisible((this.isVisibilidadCeldaEliminarRuta && this.isPermisoEliminarRuta));
			this.jInternalFrameDetalleFormRuta.jButtonCancelarToolBarRuta.setVisible(this.isVisibilidadCeldaCancelarRuta);				
			this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosToolBarRuta.setVisible((this.isVisibilidadCeldaGuardarRuta && this.isPermisoGuardarCambiosRuta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRuta.setVisible((this.isVisibilidadCeldaGuardarCambiosRuta && this.isPermisoGuardarCambiosRuta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta));			
			this.jMenuItemDuplicarRuta.setVisible((this.isVisibilidadCeldaDuplicarRuta && this.isPermisoDuplicarRuta));			
			this.jMenuItemCopiarRuta.setVisible((this.isVisibilidadCeldaCopiarRuta && this.isPermisoCopiarRuta));			
			this.jMenuItemVerFormRuta.setVisible((this.isVisibilidadCeldaVerFormRuta && this.isPermisoVerFormRuta));			
			this.jMenuItemAbrirOrderByRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));			
			//this.jMenuItemMostrarOcultarRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));
			this.jMenuItemDetalleAbrirOrderByRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));			
			//this.jMenuItemDetalleMostrarOcultarRuta.setVisible((this.isVisibilidadCeldaOrdenRuta && this.isPermisoOrdenRuta));			
			this.jMenuItemNuevoRelacionesRuta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRuta && this.isPermisoNuevoRuta));			
			this.jMenuItemNuevoGuardarCambiosRuta.setVisible((this.isVisibilidadCeldaNuevoRuta && this.isPermisoNuevoRuta && this.isPermisoGuardarCambiosRuta));									
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.jInternalFrameDetalleFormRuta.jMenuItemModificarRuta.setVisible((this.isVisibilidadCeldaModificarRuta && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jMenuItemActualizarRuta.setVisible((this.isVisibilidadCeldaActualizarRuta && this.isPermisoActualizarRuta));	
			this.jInternalFrameDetalleFormRuta.jMenuItemEliminarRuta.setVisible((this.isVisibilidadCeldaEliminarRuta && this.isPermisoEliminarRuta));
			this.jInternalFrameDetalleFormRuta.jMenuItemCancelarRuta.setVisible(this.isVisibilidadCeldaCancelarRuta);				
			}
			
			this.jMenuItemGuardarCambiosRuta.setVisible((this.isVisibilidadCeldaGuardarRuta && this.isPermisoGuardarCambiosRuta));						
			this.jMenuItemGuardarCambiosTablaRuta.setVisible((this.isVisibilidadCeldaGuardarCambiosRuta && this.isPermisoGuardarCambiosRuta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRuta=this.jButtonNuevoRuta.isVisible();
			this.isVisibilidadCeldaDuplicarRuta=this.jButtonDuplicarRuta.isVisible();
			this.isVisibilidadCeldaCopiarRuta=this.jButtonCopiarRuta.isVisible();
			this.isVisibilidadCeldaVerFormRuta=this.jButtonVerFormRuta.isVisible();
			
			this.isVisibilidadCeldaOrdenRuta=this.jButtonAbrirOrderByRuta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRuta=this.jButtonNuevoRelacionesRuta.isVisible();
			this.isVisibilidadCeldaModificarRuta=this.jButtonModificarRuta.isVisible();
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.isVisibilidadCeldaActualizarRuta=this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.isVisible();
			this.isVisibilidadCeldaEliminarRuta=this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.isVisible();
			this.isVisibilidadCeldaCancelarRuta=this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.isVisible();
			this.isVisibilidadCeldaGuardarRuta=this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRuta=this.jButtonGuardarCambiosTablaRuta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRuta=this.jButtonNuevoToolBarRuta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRuta=this.jButtonNuevoRelacionesToolBarRuta.isVisible();
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.isVisibilidadCeldaModificarRuta=this.jInternalFrameDetalleFormRuta.jButtonModificarToolBarRuta.isVisible();
			this.isVisibilidadCeldaActualizarRuta=this.jInternalFrameDetalleFormRuta.jButtonActualizarToolBarRuta.isVisible();
			this.isVisibilidadCeldaEliminarRuta=this.jInternalFrameDetalleFormRuta.jButtonEliminarToolBarRuta.isVisible();
			this.isVisibilidadCeldaCancelarRuta=this.jInternalFrameDetalleFormRuta.jButtonCancelarToolBarRuta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRuta=this.jButtonGuardarCambiosToolBarRuta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRuta=this.jButtonGuardarCambiosTablaToolBarRuta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRuta=this.jMenuItemNuevoRuta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRuta=this.jMenuItemNuevoRelacionesRuta.isVisible();
			
			if(this.jInternalFrameDetalleFormRuta!=null) {
			this.isVisibilidadCeldaModificarRuta=this.jInternalFrameDetalleFormRuta.jMenuItemModificarRuta.isVisible();
			this.isVisibilidadCeldaActualizarRuta=this.jInternalFrameDetalleFormRuta.jMenuItemActualizarRuta.isVisible();
			this.isVisibilidadCeldaEliminarRuta=this.jInternalFrameDetalleFormRuta.jMenuItemEliminarRuta.isVisible();
			this.isVisibilidadCeldaCancelarRuta=this.jInternalFrameDetalleFormRuta.jMenuItemCancelarRuta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRuta=this.jMenuItemGuardarCambiosRuta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRuta=this.jMenuItemGuardarCambiosTablaRuta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRuta(Boolean esInicializar) {
		if(RutaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rutaSessionBean.getConGuardarRelaciones()) {
				//if(this.rutaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRuta();
			}
			
			this.inicializarActualizarBindingBotonesManualRuta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRuta() {
		this.jButtonNuevoRuta.setVisible(this.isPermisoNuevoRuta);			
		this.jButtonDuplicarRuta.setVisible(this.isPermisoDuplicarRuta);			
		this.jButtonCopiarRuta.setVisible(this.isPermisoCopiarRuta);			
		this.jButtonVerFormRuta.setVisible(this.isPermisoVerFormRuta);			
		
		this.jButtonAbrirOrderByRuta.setVisible(this.isPermisoOrdenRuta);					
		
		this.jButtonNuevoRelacionesRuta.setVisible(this.isPermisoNuevoRuta);			
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonModificarRuta.setVisible(this.isPermisoActualizarRuta);	
			this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.setVisible(this.isPermisoActualizarRuta);	
			this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.setVisible(this.isPermisoEliminarRuta);
			this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.setVisible(this.isVisibilidadCeldaCancelarRuta);						
			this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.setVisible(this.isPermisoGuardarCambiosRuta);							
		}
		
		this.jButtonGuardarCambiosTablaRuta.setVisible(this.isPermisoActualizarRuta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRuta() {
		this.jInternalFrameDetalleFormRuta.jButtonModificarRuta.setVisible(this.isPermisoActualizarRuta);	
		this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.setVisible(this.isPermisoActualizarRuta);	
		this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.setVisible(this.isPermisoEliminarRuta);
		this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.setVisible(this.isVisibilidadCeldaCancelarRuta);							
		this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.setVisible((this.isVisibilidadCeldaGuardarRuta && this.isPermisoGuardarCambiosRuta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRuta() {
		if(RutaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRuta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRuta() {
	}
	
	public void jTableDatosRutaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRuta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ruta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRutaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRuta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRuta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRuta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rutaLogic.getConnexion());

				if(this.ruta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ruta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRuta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ruta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisRutaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebRuta(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRuta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRuta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.rutaLogic.getConnexion());

				if(this.ruta.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.ruta.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderRuta.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.ruta.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadRutaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebRuta(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRuta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRuta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.rutaLogic.getConnexion());

				if(this.ruta.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.ruta.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderRuta.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.ruta.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sector_origenRutaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosectororigen=true;

			idTienePermisosectororigen=this.tienePermisosUsuarioEnPaginaWebRuta(SectorConstantesFunciones.CLASSNAME);

			if(idTienePermisosectororigen) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRuta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRuta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.sectororigenBeanSwingJInternalFrame=new SectorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sectororigenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sectororigenBeanSwingJInternalFrame.getSectorLogic().setConnexion(this.rutaLogic.getConnexion());

				if(this.ruta.getid_sector_origen()!=null) {
					this.sectororigenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sectororigenBeanSwingJInternalFrame.setIdActual(this.ruta.getid_sector_origen());
					this.sectororigenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sectororigenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sectororigenBeanSwingJInternalFrame.inicializarActualizarBindingTablaSector();
				}

				JInternalFrameBase jinternalFrame =this.sectororigenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
				TitledBorder titledBordersectororigen=(TitledBorder)this.sectororigenBeanSwingJInternalFrame.jScrollPanelDatosSector.getBorder();

				titledBordersectororigen.setTitle(titledBorderRuta.getTitle() + " -> Sector");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sector_origenRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getid_sector_origen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sector_origen = "+this.ruta.getid_sector_origen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sector_destinoRutaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosectordestino=true;

			idTienePermisosectordestino=this.tienePermisosUsuarioEnPaginaWebRuta(SectorConstantesFunciones.CLASSNAME);

			if(idTienePermisosectordestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRuta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRuta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);

				this.sectordestinoBeanSwingJInternalFrame=new SectorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sectordestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sectordestinoBeanSwingJInternalFrame.getSectorLogic().setConnexion(this.rutaLogic.getConnexion());

				if(this.ruta.getid_sector_destino()!=null) {
					this.sectordestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sectordestinoBeanSwingJInternalFrame.setIdActual(this.ruta.getid_sector_destino());
					this.sectordestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sectordestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sectordestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSector();
				}

				JInternalFrameBase jinternalFrame =this.sectordestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRuta=(TitledBorder)this.jScrollPanelDatosRuta.getBorder();
				TitledBorder titledBordersectordestino=(TitledBorder)this.sectordestinoBeanSwingJInternalFrame.jScrollPanelDatosSector.getBorder();

				titledBordersectordestino.setTitle(titledBorderRuta.getTitle() + " -> Sector");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sector_destinoRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getid_sector_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sector_destino = "+this.ruta.getid_sector_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.ruta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorigenRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getorigen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where origen like '%"+this.ruta.getorigen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondestinoRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getdestino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where destino like '%"+this.ruta.getdestino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.ruta.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionRutaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRuta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRuta(this.getruta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ruta==null) {
						this.ruta = new Ruta();
					}

					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);
				}

				if(this.ruta.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.ruta.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRuta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorDestinoRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasBusquedaPorDestino();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasBusquedaPorNombre();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorOrigenRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasBusquedaPorOrigen();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorPrecioRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasBusquedaPorPrecio();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasFK_IdCiudad();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasFK_IdEmpresa();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasFK_IdPais();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSectorDestinoRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasFK_IdSectorDestino();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSectorOrigenRutaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRuta(false,false);

			this.getRutasFK_IdSectorOrigen();

			this.inicializarActualizarBindingRuta(false);

			//if(RutaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRuta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRuta() {
		if(this.jInternalFrameDetalleFormRuta!=null) {
		

		if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
			this.jInternalFrameDetalleFormRuta.setVisible(false);	    			
			this.jInternalFrameDetalleFormRuta.dispose();
			this.jInternalFrameDetalleFormRuta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRuta!=null) {
			this.jInternalFrameReporteDinamicoRuta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRuta.dispose();
			this.jInternalFrameReporteDinamicoRuta=null;
		}
		
		if(this.jInternalFrameImportacionRuta!=null) {
			this.jInternalFrameImportacionRuta.setVisible(false);	    			
			this.jInternalFrameImportacionRuta.dispose();
			this.jInternalFrameImportacionRuta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRuta();
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			
			if(sTipo.equals("NuevoRuta")) {
				jButtonNuevoRutaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRuta")) {
				jButtonDuplicarRutaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRuta")) {
				jButtonCopiarRutaActionPerformed(evt);
			} else if(sTipo.equals("VerFormRuta")) {
				jButtonVerFormRutaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRuta")) {
				jButtonNuevoRutaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRuta")) {
				jButtonDuplicarRutaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRuta")) {
				jButtonNuevoRutaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRuta")) {
				jButtonDuplicarRutaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRuta")) {
				jButtonNuevoRutaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRuta")) {
				jButtonNuevoRutaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRuta")) {
				jButtonNuevoRutaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRuta")) {
				jButtonModificarRutaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRuta")) {
				jButtonModificarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRuta")) {
				jButtonModificarRutaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRuta")) {
				jButtonActualizarRutaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRuta")) {
				jButtonActualizarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRuta")) {
				jButtonActualizarRutaActionPerformed(evt);
			} else if(sTipo.equals("EliminarRuta")) {
				jButtonEliminarRutaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRuta")) {
				jButtonEliminarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRuta")) {
				jButtonEliminarRutaActionPerformed(evt);
			} else if(sTipo.equals("CancelarRuta")) {
				jButtonCancelarRutaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRuta")) {
				jButtonCancelarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRuta")) {
				jButtonCancelarRutaActionPerformed(evt);
			} else if(sTipo.equals("CerrarRuta")) {
				jButtonCerrarRutaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRuta")) {
				jButtonCerrarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRuta")) {
				jButtonCerrarRutaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRuta")) {
				jButtonMostrarOcultarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRuta")) {
				jButtonCancelarRutaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRuta")) {
				jButtonCopiarRutaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRuta")) {
				jButtonVerFormRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRuta")) {
				jButtonCopiarRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRuta")) {
				jButtonVerFormRutaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRuta")) {
				jButtonRecargarInformacionRutaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRuta")) {
				jButtonRecargarInformacionRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRuta")) {
				jButtonRecargarInformacionRutaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRuta")) {
				jButtonAnterioresRutaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRuta")) {
				jButtonAnterioresRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRuta")) {
				jButtonAnterioresRutaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRuta")) {
				jButtonSiguientesRutaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRuta")) {
				jButtonSiguientesRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRuta")) {
				jButtonSiguientesRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRuta") || sTipo.equals("MenuItemDetalleAbrirOrderByRuta")) {
				jButtonAbrirOrderByRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRuta") || sTipo.equals("MenuItemDetalleMostrarOcultarRuta")) {
				jButtonMostrarOcultarRutaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRuta")) {
				jButtonNuevoGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRuta")) {
				jButtonNuevoGuardarCambiosRutaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRuta")) {
				jButtonNuevoGuardarCambiosRutaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRuta")) {
				jButtonCerrarReporteDinamicoRutaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRuta")) {
				jButtonGenerarReporteDinamicoRutaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRuta")) {
				
				jButtonGenerarExcelReporteDinamicoRutaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRuta")) {
				jButtonCerrarImportacionRutaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRuta")) {
				
				jButtonGenerarImportacionRutaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRuta")) {
				
				jButtonAbrirImportacionRutaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRuta")) {
				jComboBoxTiposAccionesRutaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRuta")) {
				jComboBoxTiposRelacionesRutaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRuta")) {
				jComboBoxTiposAccionesRutaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRuta")) {
				
				jComboBoxTiposSeleccionarRutaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRuta")) {
				jTextFieldValorCampoGeneralRutaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRuta")) {
				jButtonAbrirOrderByRutaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRuta")) {
				jButtonAbrirOrderByRutaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRuta")) {
				jButtonCerrarOrderByRutaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRutaBusqueda")) {
				this.jButtonidRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRutaUpdate")) {
				this.jButtonid_empresaRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRutaBusqueda")) {
				this.jButtonid_empresaRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRutaUpdate")) {
				this.jButtonid_paisRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRutaBusqueda")) {
				this.jButtonid_paisRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadRutaUpdate")) {
				this.jButtonid_ciudadRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadRutaBusqueda")) {
				this.jButtonid_ciudadRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sector_origenRutaUpdate")) {
				this.jButtonid_sector_origenRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sector_origenRutaBusqueda")) {
				this.jButtonid_sector_origenRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sector_destinoRutaUpdate")) {
				this.jButtonid_sector_destinoRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sector_destinoRutaBusqueda")) {
				this.jButtonid_sector_destinoRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRutaBusqueda")) {
				this.jButtonnombreRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenRutaBusqueda")) {
				this.jButtonorigenRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoRutaBusqueda")) {
				this.jButtondestinoRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioRutaBusqueda")) {
				this.jButtonprecioRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionRutaBusqueda")) {
				this.jButtondireccionRutaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorDestinoRuta")) {
				this.jButtonBusquedaPorDestinoRutaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreRuta")) {
				this.jButtonBusquedaPorNombreRutaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorOrigenRuta")) {
				this.jButtonBusquedaPorOrigenRutaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorPrecioRuta")) {
				this.jButtonBusquedaPorPrecioRutaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisRuta")) {
				this.jButtonFK_IdPaisRutaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSectorDestinoRuta")) {
				this.jButtonFK_IdSectorDestinoRutaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSectorOrigenRuta")) {
				this.jButtonFK_IdSectorOrigenRutaActionPerformed(evt);
			}
			
			;
			
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRuta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Ruta rutaLocal=null;
			
			if(!this.getEsControlTabla()) {
				rutaLocal=this.ruta;
			} else {
				rutaLocal=this.rutaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
							
				
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
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
			
			


			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
								
						
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
								
				
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
							
				
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
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
			
			


			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
								
				
				


				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRuta")) {
					jCheckBoxSeleccionarTodosRutaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRuta")) {
					jCheckBoxSeleccionadosRutaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRuta")) {
					
				}
				
				


				
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
												
				
				


				
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisRuta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta;
				}

				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					//classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRuta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRuta")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
				//recargarFormRutaPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
			}
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisRuta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta;
				}

				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					//classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRuta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRuta")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
				//recargarFormRutaPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
			}
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ruta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ruta);
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisRuta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta;
				}

				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					//classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormRuta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisRuta")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
				//recargarFormRutaPais(jComboBoxid_paisFK_IdPaisRuta,"FK_IdPais");
			}
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ruta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ruta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutaAnterior =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutaAnterior =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRuta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRutaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRuta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ruta =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ruta =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ruta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRuta")) {
				
				}
				
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRuta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRuta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRuta")) {
			
			}
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRuta();
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			if(sTipo.equals("NuevoRuta")) {
				jButtonNuevoRutaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRuta")) {
				jButtonDuplicarRutaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRuta")) {
				jButtonCopiarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRuta")) {
				jButtonVerFormRutaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRuta")) {
				jButtonNuevoRutaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRuta")) {
				jButtonModificarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRuta")) {
				jButtonActualizarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRuta")) {
				jButtonEliminarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRuta")) {
				jButtonCancelarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRuta")) {
				jButtonCerrarRutaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRuta")) {
				jButtonGuardarCambiosRutaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRuta")) {
				jButtonNuevoGuardarCambiosRutaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRuta")) {
				jButtonAbrirOrderByRutaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRuta")) {
				jButtonRecargarInformacionRutaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRuta")) {
				jButtonAnterioresRutaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRuta")) {
				jButtonSiguientesRutaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRutaBusqueda")) {
				this.jButtonidRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRutaUpdate")) {
				this.jButtonid_empresaRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRutaBusqueda")) {
				this.jButtonid_empresaRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRutaUpdate")) {
				this.jButtonid_paisRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRutaBusqueda")) {
				this.jButtonid_paisRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadRutaUpdate")) {
				this.jButtonid_ciudadRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadRutaBusqueda")) {
				this.jButtonid_ciudadRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sector_origenRutaUpdate")) {
				this.jButtonid_sector_origenRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sector_origenRutaBusqueda")) {
				this.jButtonid_sector_origenRutaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sector_destinoRutaUpdate")) {
				this.jButtonid_sector_destinoRutaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sector_destinoRutaBusqueda")) {
				this.jButtonid_sector_destinoRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRutaBusqueda")) {
				this.jButtonnombreRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenRutaBusqueda")) {
				this.jButtonorigenRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoRutaBusqueda")) {
				this.jButtondestinoRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioRutaBusqueda")) {
				this.jButtonprecioRutaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionRutaBusqueda")) {
				this.jButtondireccionRutaBusquedaActionPerformed(evt);
			}
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRuta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRuta")) {
				closingInternalFrameRuta();
				
			} else if(sTipo.equals("jButtonCancelarRuta")) {
				JInternalFrameBase jInternalFrameDetalleFormRuta = (JInternalFrameBase)evt.getSource();
	            	
	            RutaBeanSwingJInternalFrame jInternalFrameParent=(RutaBeanSwingJInternalFrame)jInternalFrameDetalleFormRuta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRutaActionPerformed(null);
			}
			
			RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ruta,new Object(),this.rutaParameterGeneral,this.rutaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRuta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRuta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRuta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ruta)) {
			if(!esControlTabla) {
				if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);			
				}
				
				if(this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRuta(this.ruta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rutaReturnGeneral=rutaLogic.procesarEventosRutasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutaLogic.getRutas(),this.ruta,this.rutaParameterGeneral,this.isEsNuevoRuta,classes);//this.rutaLogic.getRuta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRuta(this.rutaReturnGeneral,this.rutaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rutaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRuta(classes,this.rutaReturnGeneral,this.rutaBean,false);
					}
						
					if(this.rutaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRuta(this.rutaReturnGeneral.getRuta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRuta(this.rutaReturnGeneral.getRuta());	
					}
						
					if(this.rutaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRuta(this.rutaReturnGeneral.getRuta(),classes);//this.rutaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRuta(this.ruta,classes);//this.rutaBean);									
				}
			
				if(RutaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRuta(this.ruta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRuta(this.ruta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rutaAnterior!=null) {
						this.ruta=this.rutaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rutaReturnGeneral=rutaLogic.procesarEventosRutasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutaLogic.getRutas(),this.ruta,this.rutaParameterGeneral,this.isEsNuevoRuta,classes);//this.rutaLogic.getRuta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rutaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rutaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rutaReturnGeneral.getRuta(),rutaLogic.getRutas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rutaReturnGeneral.getRuta(),this.rutas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRuta.repaint();
				
				//((AbstractTableModel) this.jTableDatosRuta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRuta();
			}
		}
	}
	
	public void actualizarVisualTableDatosRuta() throws Exception {
		
		RutaModel rutaModel=(RutaModel)this.jTableDatosRuta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rutaModel.rutas=this.rutaLogic.getRutas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rutaModel.rutas=this.rutas;
		}
		
		
		((RutaModel) this.jTableDatosRuta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRuta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrutaAnterior(),this.rutaLogic.getRutas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrutaAnterior(),this.rutas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRuta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRuta(Ruta ruta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(ruta.getClientes());
					this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(ruta.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
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
										
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ruta,new Object(),generalEntityParameterGeneral,this.rutaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rutaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RutaConstantesFunciones.getClassesRelationshipsOfRuta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RutaConstantesFunciones.getClassesRelationshipsFromStringsOfRuta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRuta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RutaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ruta,new Object(),generalEntityParameterGeneral,this.rutaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRuta(RutaBean rutaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(ruta.getClientes());
					this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(ruta.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRuta(ArrayList<Classe> classes,RutaReturnGeneral rutaReturnGeneral,RutaBean rutaBean,Boolean conDefault) throws Exception {
		
			this.rutaBean.setClientes(rutaReturnGeneral.getRuta().getClientes());
			this.rutaBean.setParametroCarteraDefectos(rutaReturnGeneral.getRuta().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRuta(Ruta ruta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					ruta.setClientes(this.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					ruta.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.ruta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRuta = new RutaDetalleFormJInternalFrame(jDesktopPane,this.rutaSessionBean.getConGuardarRelaciones(),this.rutaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRuta);
		this.jInternalFrameDetalleFormRuta.setVisible(false);
		this.jInternalFrameDetalleFormRuta.setSelected(false);						
		
		this.jInternalFrameDetalleFormRuta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRuta.rutaLogic=this.rutaLogic;
		
		this.cargarCombosFrameForeignKeyRuta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRuta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRuta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRuta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRuta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRuta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRuta"));
		
		this.jInternalFrameDetalleFormRuta.jButtonModificarRuta.addActionListener(new ButtonActionListener(this,"ModificarRuta"));

		
		this.jInternalFrameDetalleFormRuta.jButtonModificarToolBarRuta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRuta"));
					
		this.jInternalFrameDetalleFormRuta.jMenuItemModificarRuta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRuta"));		
		
		
		
		this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.addActionListener (new ButtonActionListener(this,"ActualizarRuta"));
		
		
		this.jInternalFrameDetalleFormRuta.jButtonActualizarToolBarRuta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRuta"));
						
		this.jInternalFrameDetalleFormRuta.jMenuItemActualizarRuta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRuta"));		
		
		
		
		this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.addActionListener (new ButtonActionListener(this,"EliminarRuta"));
		
		
		this.jInternalFrameDetalleFormRuta.jButtonEliminarToolBarRuta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRuta"));
								
		this.jInternalFrameDetalleFormRuta.jMenuItemEliminarRuta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRuta"));		
		
		
		
		this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.addActionListener (new ButtonActionListener(this,"CancelarRuta"));
		
		
		this.jInternalFrameDetalleFormRuta.jButtonCancelarToolBarRuta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRuta"));
					
		this.jInternalFrameDetalleFormRuta.jMenuItemCancelarRuta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRuta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRuta.jMenuItemDetalleCerrarRuta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRuta"));		
		
		
		
		this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosToolBarRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRuta"));
		
		
		
		this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosToolBarRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRuta"));
		
		
		
		this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRuta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonidRutaBusqueda.addActionListener(new ButtonActionListener(this,"idRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaUpdate.addActionListener(new ButtonActionListener(this,"id_paisRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonnombreRutaBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonorigenRutaBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondestinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonprecioRutaBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondireccionRutaBusqueda.addActionListener(new ButtonActionListener(this,"direccionRutaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRuta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRuta"));
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRuta"));
		}
		
		this.jTableDatosRuta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRuta"));
		
		this.jTableDatosRuta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRuta"));
		
		this.jButtonNuevoRuta.addActionListener(new ButtonActionListener(this,"NuevoRuta"));
		
		this.jButtonDuplicarRuta.addActionListener(new ButtonActionListener(this,"DuplicarRuta"));
		
		this.jButtonCopiarRuta.addActionListener(new ButtonActionListener(this,"CopiarRuta"));
		
		this.jButtonVerFormRuta.addActionListener(new ButtonActionListener(this,"VerFormRuta"));
		
		
		this.jButtonNuevoToolBarRuta.addActionListener(new ButtonActionListener(this,"NuevoToolBarRuta"));
			
		this.jButtonDuplicarToolBarRuta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRuta"));
			
		this.jMenuItemNuevoRuta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRuta"));
			
		this.jMenuItemDuplicarRuta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRuta"));		
		
		
		this.jButtonNuevoRelacionesRuta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRuta"));
		
		
		this.jButtonNuevoRelacionesToolBarRuta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRuta"));
			
		this.jMenuItemNuevoRelacionesRuta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRuta"));		
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonModificarRuta.addActionListener(new ButtonActionListener(this,"ModificarRuta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonModificarToolBarRuta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRuta"));
			
			this.jInternalFrameDetalleFormRuta.jMenuItemModificarRuta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRuta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRuta.jButtonActualizarRuta.addActionListener (new ButtonActionListener(this,"ActualizarRuta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonActualizarToolBarRuta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRuta"));
				
			this.jInternalFrameDetalleFormRuta.jMenuItemActualizarRuta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRuta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonEliminarRuta.addActionListener (new ButtonActionListener(this,"EliminarRuta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonEliminarToolBarRuta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRuta"));
						
			this.jInternalFrameDetalleFormRuta.jMenuItemEliminarRuta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRuta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonCancelarRuta.addActionListener (new ButtonActionListener(this,"CancelarRuta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonCancelarToolBarRuta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRuta"));
			
			this.jInternalFrameDetalleFormRuta.jMenuItemCancelarRuta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRuta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRuta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRuta"));		
		
		
		this.jButtonCerrarRuta.addActionListener (new ButtonActionListener(this,"CerrarRuta"));
		
		
		this.jButtonCerrarToolBarRuta.addActionListener (new ButtonActionListener(this,"CerrarToolBarRuta"));
			
		this.jMenuItemCerrarRuta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRuta"));
			
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jMenuItemDetalleCerrarRuta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRuta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosRuta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosToolBarRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRuta"));
		}
		
		this.jButtonCopiarToolBarRuta.addActionListener (new ButtonActionListener(this,"CopiarToolBarRuta"));
			
		this.jButtonVerFormToolBarRuta.addActionListener (new ButtonActionListener(this,"VerFormToolBarRuta"));
		
		this.jMenuItemGuardarCambiosRuta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRuta"));
			
		this.jMenuItemCopiarRuta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRuta"));		
		
		this.jMenuItemVerFormRuta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRuta"));		
		
		
		this.jButtonGuardarCambiosTablaRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRuta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRuta"));
			
		this.jMenuItemGuardarCambiosTablaRuta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRuta"));		
		
		
		
		this.jButtonRecargarInformacionRuta.addActionListener (new ButtonActionListener(this,"RecargarInformacionRuta"));
					
		this.jButtonRecargarInformacionToolBarRuta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRuta"));
		
		this.jMenuItemRecargarInformacionRuta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRuta"));		
		
		
		
		this.jButtonAnterioresRuta.addActionListener (new ButtonActionListener(this,"AnterioresRuta"));
		
		
		this.jButtonAnterioresToolBarRuta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRuta"));
		
		this.jMenuItemAnterioresRuta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRuta"));		
		
		
		this.jButtonSiguientesRuta.addActionListener (new ButtonActionListener(this,"SiguientesRuta"));
		
		
		this.jButtonSiguientesToolBarRuta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRuta"));
			
		this.jMenuItemSiguientesRuta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRuta"));
			
		this.jMenuItemAbrirOrderByRuta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRuta"));
			
		this.jMenuItemMostrarOcultarRuta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRuta"));
			
		this.jMenuItemDetalleAbrirOrderByRuta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRuta"));
			
		this.jMenuItemDetalleMostarOcultarRuta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRuta"));		
		
		
		this.jButtonNuevoGuardarCambiosRuta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRuta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRuta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRuta"));
			
		this.jMenuItemNuevoGuardarCambiosRuta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRuta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRuta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRuta"));

		this.jCheckBoxSeleccionadosRuta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRuta"));
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRuta"));
		}
		
		
		this.jComboBoxTiposRelacionesRuta.addActionListener (new ButtonActionListener(this,"TiposRelacionesRuta"));
			
		this.jComboBoxTiposAccionesRuta.addActionListener (new ButtonActionListener(this,"TiposAccionesRuta"));
					
		this.jComboBoxTiposSeleccionarRuta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRuta"));
			
		this.jTextFieldValorCampoGeneralRuta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRuta"));		
		
		
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonidRutaBusqueda.addActionListener(new ButtonActionListener(this,"idRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaUpdate.addActionListener(new ButtonActionListener(this,"id_paisRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonnombreRutaBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonorigenRutaBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondestinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonprecioRutaBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondireccionRutaBusqueda.addActionListener(new ButtonActionListener(this,"direccionRutaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorDestinoRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorDestinoRuta"));

			this.jButtonBusquedaPorNombreRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRuta"));

			this.jButtonBusquedaPorOrigenRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorOrigenRuta"));

			this.jButtonBusquedaPorPrecioRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorPrecioRuta"));

			this.jButtonFK_IdPaisRuta.addActionListener(new ButtonActionListener(this,"FK_IdPaisRuta"));

			this.jButtonFK_IdSectorDestinoRuta.addActionListener(new ButtonActionListener(this,"FK_IdSectorDestinoRuta"));

			this.jButtonFK_IdSectorOrigenRuta.addActionListener(new ButtonActionListener(this,"FK_IdSectorOrigenRuta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRuta!=null) {
				this.jInternalFrameReporteDinamicoRuta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRuta"));
				this.jInternalFrameReporteDinamicoRuta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRuta"));
				this.jInternalFrameReporteDinamicoRuta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRuta"));
			}
			
			//this.jButtonCerrarReporteDinamicoRuta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRuta"));				
			//this.jButtonGenerarReporteDinamicoRuta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRuta"));
			//this.jButtonGenerarExcelReporteDinamicoRuta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRuta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRuta!=null) {
				this.jInternalFrameImportacionRuta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRuta"));
				this.jInternalFrameImportacionRuta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRuta"));
				this.jInternalFrameImportacionRuta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRuta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRuta.addActionListener (new ButtonActionListener(this,"AbrirOrderByRuta"));
			
			this.jButtonAbrirOrderByToolBarRuta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRuta"));			
			
			if(this.jInternalFrameOrderByRuta!=null) {
				this.jInternalFrameOrderByRuta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRuta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRuta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRuta.jTabbedPaneRelacionesRuta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRuta"));
		
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
            		closingInternalFrameRuta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRuta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRuta = (JInternalFrameBase)event.getSource();
	            	
	            RutaBeanSwingJInternalFrame jInternalFrameParent=(RutaBeanSwingJInternalFrame)jInternalFrameDetalleFormRuta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRutaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRuta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRutaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRuta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRuta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRuta";
		inputMap = this.jButtonNuevoRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRutaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRuta";
		inputMap = this.jButtonNuevoRelacionesRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRutaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRuta";
		inputMap = this.jButtonModificarRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRuta";
		inputMap = this.jButtonActualizarRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRuta";
		inputMap = this.jButtonEliminarRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRuta";
		inputMap = this.jButtonCancelarRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRuta";
		inputMap = this.jButtonCerrarRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRuta";
		inputMap = this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRuta.jButtonGuardarCambiosRuta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRutaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRuta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRutaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRuta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRutaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRuta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRutaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRuta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRutaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonidRutaBusqueda.addActionListener(new ButtonActionListener(this,"idRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_empresaRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaUpdate.addActionListener(new ButtonActionListener(this,"id_paisRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_paisRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_ciudadRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_origenRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_origenRutaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaUpdate.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonid_sector_destinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"id_sector_destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonnombreRutaBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonorigenRutaBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondestinoRutaBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtonprecioRutaBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRuta.jButtondireccionRutaBusqueda.addActionListener(new ButtonActionListener(this,"direccionRutaBusqueda"));
		
		
		this.jButtonBusquedaPorDestinoRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorDestinoRuta"));

		this.jButtonBusquedaPorNombreRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRuta"));

		this.jButtonBusquedaPorOrigenRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorOrigenRuta"));

		this.jButtonBusquedaPorPrecioRuta.addActionListener(new ButtonActionListener(this,"BusquedaPorPrecioRuta"));

		this.jButtonFK_IdPaisRuta.addActionListener(new ButtonActionListener(this,"FK_IdPaisRuta"));

		this.jButtonFK_IdSectorDestinoRuta.addActionListener(new ButtonActionListener(this,"FK_IdSectorDestinoRuta"));

		this.jButtonFK_IdSectorOrigenRuta.addActionListener(new ButtonActionListener(this,"FK_IdSectorOrigenRuta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRuta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRutaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRutaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRuta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRuta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Ruta rutaAux:this.rutaLogic.getRutas()) {
					rutaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ruta rutaAux:rutas) {
					rutaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRutaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRuta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ruta rutaAux:this.rutaLogic.getRutas()) {
						rutaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ruta rutaAux:rutas) {
						rutaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Ruta rutaAux:this.rutaLogic.getRutas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ruta rutaAux:rutas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRuta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRuta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRuta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRuta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRutaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRuta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRuta.getSelectedRows();
			
			Ruta rutaLocal=new Ruta();
			
			//this.seleccionarTodosRuta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutaLocal =(Ruta) this.rutaLogic.getRutas().toArray()[this.jTableDatosRuta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rutaLocal =(Ruta) this.rutas.toArray()[this.jTableDatosRuta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rutaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ruta rutaAux:this.rutaLogic.getRutas()) {
						rutaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ruta rutaAux:rutas) {
						rutaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRuta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRuta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRuta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRuta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRutaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRutaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRutaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRuta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRuta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ruta rutaAux:this.rutaLogic.getRutas()) {
				
						if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rutaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							rutaAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							rutaAux.setdestino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							rutaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							rutaAux.setdireccion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ruta rutaAux:rutas) {
					
						if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rutaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							rutaAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							rutaAux.setdestino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							rutaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							rutaAux.setdireccion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRuta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRutaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRuta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRuta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRuta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRuta) {				
					conSplash=true;//false;										
					
					//this.startProcessRuta(conSplash);
				
					this.generarReporteRutasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRutasSeleccionados();
				//this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRutasSeleccionados(false);
				//this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRutasSeleccionados(true);
				//this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRuta();
				
				this.exportarRutasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRutas();
				//this.importarRutas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRuta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRutasSeleccionados();
				//this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ruta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRuta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRuta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRuta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
				}	
			} 			
			else if(RutaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRuta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRuta(conSplash);
					
						//this.actualizarParametrosGeneralRuta();
						
						this.generarReporteProcesoAccionRutasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RutaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO RutaS SELECCIONADOS?", "MANTENIMIENTO DE Ruta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRuta();
				
						this.actualizarParametrosGeneralRuta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rutaReturnGeneral=rutaLogic.procesarAccionRutasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rutaLogic.getRutas(),this.rutaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRutaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRuta();
					
					RutaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRutaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRuta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRuta.jComboBoxTiposAccionesFormularioRuta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRuta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRutaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRuta();
			
			if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
			Ruta ruta=new Ruta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRuta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRuta.getSelectedItem();
			
			
			
			
			rutasSeleccionados=this.getRutasSeleccionados(true);
			//this.sTipoAccion;
			
			if(rutasSeleccionados.size()==1) {
				for(Ruta rutaAux:rutasSeleccionados) {
					ruta=rutaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,ruta);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,ruta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRuta();
			
      		//this.finishProcessRuta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRutaReturnGeneral() throws Exception {
		if(this.rutaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rutaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rutaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rutaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rutaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rutaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRuta(false);
		}
		
		if(this.rutaReturnGeneral.getConRetornoLista() || this.rutaReturnGeneral.getConRetornoObjeto()) {
			if(this.rutaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rutaLogic.setRutas(this.rutaReturnGeneral.getRutas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rutaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rutaLogic.setRuta(this.rutaReturnGeneral.getRuta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRuta(false);
		}
	}
	
	public void actualizarParametrosGeneralRuta() throws Exception {
		
		
	}
	
	public ArrayList<Ruta> getRutasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRuta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Ruta rutaAux:rutaLogic.getRutas()) {
					if(rutaAux.getIsSelected()) {
						rutasSeleccionados.add(rutaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ruta rutaAux:this.rutas) {
					if(rutaAux.getIsSelected()) {
						rutasSeleccionados.add(rutaAux);				
					}
				}
			}
			
			if(rutasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rutasSeleccionados.addAll(this.rutaLogic.getRutas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rutasSeleccionados.addAll(this.rutas);				
					}
				}
			}
		} else {
			rutasSeleccionados.add(this.ruta);
		}
		
		return rutasSeleccionados;
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
	
	public void generarReporteRutasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRutasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRutasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRutasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRutasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRutasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ruta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRutas("Todos",rutasSeleccionados);
		
	}	
	
	public void generarReporteNormalRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRutas("Todos",rutasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRutasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRutas("Todos",rutasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRuta();
		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRuta();
		
		
		//this.generarReporteRutas("Todos",rutasSeleccionados ,rutaImplementable,rutaImplementableHome);
	}
	
	public void mostrarImportacionRutas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRuta();
		
		this.abrirFrameImportacionRuta();		
		
			
		//this.generarReporteRutas("Todos",rutasSeleccionados ,rutaImplementable,rutaImplementableHome);
	}
	
	public void importarRutas() throws Exception {		
	
	}
	
	public void exportarRutasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRutasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRutasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRutasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ruta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRuta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Ruta rutaAux:rutasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRuta(rutaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rutaAux.setsDetalleGeneralEntityReporte(rutaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRuta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RutaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_IDSECTORORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_IDSECTORDESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_ORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_DESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaConstantesFunciones.LABEL_DIRECCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRuta(Ruta ruta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ruta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getsectororigen_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getsectordestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getorigen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getdestino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ruta.getdireccion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Rutas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRuta(row);				
				iRow++;
			}				
			
			for(Ruta rutaAux:rutasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRuta(rutaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRutasSeleccionados() throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();		
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ruta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rutas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ruta");
			//elementRoot.appendChild(element);
		
			for(Ruta rutaAux:rutasSeleccionados) {
				element = document.createElement("ruta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRuta(rutaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRuta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_IDSECTORDESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_ORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_DESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaConstantesFunciones.LABEL_DIRECCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRuta(Ruta ruta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getsectororigen_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getsectordestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getorigen());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getdestino());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(ruta.getdireccion());				
	}
	
	public void setFilaDatosExportarXmlRuta(Ruta ruta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RutaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ruta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RutaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ruta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RutaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ruta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementpais_descripcion = document.createElement(RutaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(ruta.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(RutaConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(ruta.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementsectororigen_descripcion = document.createElement(RutaConstantesFunciones.IDSECTORORIGEN);
		elementsectororigen_descripcion.appendChild(document.createTextNode(ruta.getsectororigen_descripcion()));
		element.appendChild(elementsectororigen_descripcion);

		Element elementsectordestino_descripcion = document.createElement(RutaConstantesFunciones.IDSECTORDESTINO);
		elementsectordestino_descripcion.appendChild(document.createTextNode(ruta.getsectordestino_descripcion()));
		element.appendChild(elementsectordestino_descripcion);

		Element elementnombre = document.createElement(RutaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(ruta.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementorigen = document.createElement(RutaConstantesFunciones.ORIGEN);
		elementorigen.appendChild(document.createTextNode(ruta.getorigen().trim()));
		element.appendChild(elementorigen);

		Element elementdestino = document.createElement(RutaConstantesFunciones.DESTINO);
		elementdestino.appendChild(document.createTextNode(ruta.getdestino().trim()));
		element.appendChild(elementdestino);

		Element elementprecio = document.createElement(RutaConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(ruta.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdireccion = document.createElement(RutaConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(ruta.getdireccion().trim()));
		element.appendChild(elementdireccion);
	}
	
	public void generarReporteGroupGenericoRutasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Ruta> rutasSeleccionados=new ArrayList<Ruta>();
		
		rutasSeleccionados=this.getRutasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRuta(rutasSeleccionados);
		
		this.generarReporteRutas("Todos",rutasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRuta(ArrayList<Ruta> rutasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Ruta rutaAux:rutasSeleccionados) {
				rutaAux.setsDetalleGeneralEntityReporte(rutaAux.toString());
			
				if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_IDSECTORORIGEN)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getsectororigen_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_IDSECTORDESTINO)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getsectordestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_ORIGEN)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getorigen());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DESTINO)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getdestino());
				}
				 else if(sTipoSeleccionar.equals(RutaConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					rutaAux.setsDescripcionGeneralEntityReporte1(rutaAux.getdireccion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRuta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRuta=true;
				this.isVisibilidadCeldaNuevoRelacionesRuta=true;
				this.isVisibilidadCeldaGuardarCambiosRuta=true;
			}
			
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=true;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=true;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=true;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=true;
			this.isVisibilidadCeldaEliminarRuta=true;
			this.isVisibilidadCeldaCancelarRuta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=true;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=true;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=false;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRuta=true;
			this.isVisibilidadCeldaNuevoRelacionesRuta=true;
			this.isVisibilidadCeldaGuardarCambiosRuta=true;
			this.isVisibilidadCeldaModificarRuta=false;
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=true;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=false;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
			this.isVisibilidadCeldaModificarRuta=true;
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
			this.isVisibilidadCeldaCancelarRuta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRuta=false;
				} else {
					this.isVisibilidadCeldaGuardarRuta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RutaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRuta=true;
			this.isVisibilidadCeldaNuevoRelacionesRuta=true;
			this.isVisibilidadCeldaGuardarCambiosRuta=true;
		} else {
			this.actualizarEstadoPanelsRuta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRuta=false;
			//this.isVisibilidadCeldaVerFormRuta=false;
			this.isVisibilidadCeldaDuplicarRuta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rutaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
		} else {
			this.isVisibilidadCeldaNuevoRuta=false;
			this.isVisibilidadCeldaGuardarCambiosRuta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rutaSessionBean.getEsGuardarRelacionado()) {
			if(!rutaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRuta=false;												
			}
			
			this.jButtonCerrarRuta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRuta=false;
		}
		
		if(!this.permiteMantenimiento(this.ruta)) {
			this.isVisibilidadCeldaActualizarRuta=false;
			this.isVisibilidadCeldaEliminarRuta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRuta() {
		this.isVisibilidadCeldaNuevoRuta=false;
		this.isVisibilidadCeldaGuardarCambiosRuta=false;
	}
	
	public void actualizarEstadoPanelsRuta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRuta!=null) {
				this.jScrollPanelDatosEdicionRuta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRuta!=null) {
				this.jScrollPanelDatosRuta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRuta!=null) {
				this.jPanelPaginacionRuta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rutaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRuta!=null) {
					this.jTabbedPaneBusquedasRuta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rutaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRuta!=null) {
				this.jTabbedPaneBusquedasRuta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRuta!=null) {
				this.jPanelParametrosReportesRuta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorDestino=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorDestinoRuta);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorNombreRuta);}

			this.isVisibilidadBusquedaPorOrigen=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorOrigenRuta);}

			this.isVisibilidadBusquedaPorPrecio=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorPrecio) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorPrecioRuta);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdPaisRuta);}

			this.isVisibilidadFK_IdSectorDestino=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSectorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorDestinoRuta);}

			this.isVisibilidadFK_IdSectorOrigen=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSectorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorOrigenRuta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorDestino=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorDestinoRuta);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorNombreRuta);}

			this.isVisibilidadBusquedaPorOrigen=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorOrigenRuta);}

			this.isVisibilidadBusquedaPorPrecio=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorPrecio) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorPrecioRuta);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdPaisRuta);}

			this.isVisibilidadFK_IdSectorDestino=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdSectorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorDestinoRuta);}

			this.isVisibilidadFK_IdSectorOrigen=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdSectorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorOrigenRuta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaPorDestino=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorDestinoRuta);}

			this.isVisibilidadBusquedaPorNombre=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorNombreRuta);}

			this.isVisibilidadBusquedaPorOrigen=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorOrigenRuta);}

			this.isVisibilidadBusquedaPorPrecio=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorPrecio) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorPrecioRuta);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdPaisRuta);}

			this.isVisibilidadFK_IdSectorDestino=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdSectorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorDestinoRuta);}

			this.isVisibilidadFK_IdSectorOrigen=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdSectorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorOrigenRuta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSectorOrigen(Boolean isParaSectorOrigen){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSectorOrigenNegation=!isParaSectorOrigen;

			this.isVisibilidadBusquedaPorDestino=isParaSectorOrigenNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorDestinoRuta);}

			this.isVisibilidadBusquedaPorNombre=isParaSectorOrigenNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorNombreRuta);}

			this.isVisibilidadBusquedaPorOrigen=isParaSectorOrigenNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorOrigenRuta);}

			this.isVisibilidadBusquedaPorPrecio=isParaSectorOrigenNegation;
			if(!this.isVisibilidadBusquedaPorPrecio) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorPrecioRuta);}

			this.isVisibilidadFK_IdPais=isParaSectorOrigenNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdPaisRuta);}

			this.isVisibilidadFK_IdSectorDestino=isParaSectorOrigenNegation;
			if(!this.isVisibilidadFK_IdSectorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorDestinoRuta);}

			this.isVisibilidadFK_IdSectorOrigen=isParaSectorOrigen;
			if(!this.isVisibilidadFK_IdSectorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorOrigenRuta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSectorDestino(Boolean isParaSectorDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSectorDestinoNegation=!isParaSectorDestino;

			this.isVisibilidadBusquedaPorDestino=isParaSectorDestinoNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorDestinoRuta);}

			this.isVisibilidadBusquedaPorNombre=isParaSectorDestinoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorNombreRuta);}

			this.isVisibilidadBusquedaPorOrigen=isParaSectorDestinoNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorOrigenRuta);}

			this.isVisibilidadBusquedaPorPrecio=isParaSectorDestinoNegation;
			if(!this.isVisibilidadBusquedaPorPrecio) {this.jTabbedPaneBusquedasRuta.remove(jPanelBusquedaPorPrecioRuta);}

			this.isVisibilidadFK_IdPais=isParaSectorDestinoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdPaisRuta);}

			this.isVisibilidadFK_IdSectorDestino=isParaSectorDestino;
			if(!this.isVisibilidadFK_IdSectorDestino) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorDestinoRuta);}

			this.isVisibilidadFK_IdSectorOrigen=isParaSectorDestinoNegation;
			if(!this.isVisibilidadFK_IdSectorOrigen) {this.jTabbedPaneBusquedasRuta.remove(jPanelFK_IdSectorOrigenRuta);}
		}
		
	}
	
	

	public String registrarSesionRutaParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(this.jInternalFrameDetalleFormRuta.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormRuta.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setsPathNavegacionActual(rutaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormRuta.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(RutaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setisBusquedaDesdeForeignKeySesionRuta(true);
			this.jInternalFrameDetalleFormRuta.clienteSessionBean.setlidRutaActual(this.idRutaActual);

			rutaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRuta(true);
			rutaSessionBean.setlIdRutaActualForeignKey(this.idRutaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRutaParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.rutaSessionBean==null) {
				this.rutaSessionBean=new RutaSessionBean();
			}

			if(this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setsPathNavegacionActual(rutaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(RutaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionRuta(true);
			this.jInternalFrameDetalleFormRuta.parametrocarteradefectoSessionBean.setlidRutaActual(this.idRutaActual);

			rutaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRuta(true);
			rutaSessionBean.setlIdRutaActualForeignKey(this.idRutaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RutaSessionBean rutaSessionBean=new RutaSessionBean();
		
		if(this.rutaSessionBean==null) {
			this.rutaSessionBean=new RutaSessionBean();
		}
		
		this.rutaSessionBean.setsUltimaBusquedaRuta(this.getsAccionBusqueda());
		this.rutaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rutaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorDestino")) {
			rutaSessionBean.setdestino(this.getdestinoBusquedaPorDestino());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			rutaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorOrigen")) {
			rutaSessionBean.setorigen(this.getorigenBusquedaPorOrigen());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorPrecio")) {
			rutaSessionBean.setprecio(this.getprecioBusquedaPorPrecio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rutaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			rutaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSectorDestino")) {
			rutaSessionBean.setid_sector_destino(this.getid_sector_destinoFK_IdSectorDestino());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSectorOrigen")) {
			rutaSessionBean.setid_sector_origen(this.getid_sector_origenFK_IdSectorOrigen());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RutaSessionBean rutaSessionBean=new RutaSessionBean();
		
		if(this.rutaSessionBean==null) {
			this.rutaSessionBean=new RutaSessionBean();
		}
		
		if(this.rutaSessionBean.getsUltimaBusquedaRuta()!=null&&!this.rutaSessionBean.getsUltimaBusquedaRuta().equals("")) {
			this.setsAccionBusqueda(rutaSessionBean.getsUltimaBusquedaRuta());
			this.setiNumeroPaginacion(rutaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rutaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorDestino")) {
				this.setdestinoBusquedaPorDestino(rutaSessionBean.getdestino());
				rutaSessionBean.setdestino("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(rutaSessionBean.getnombre());
				rutaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorOrigen")) {
				this.setorigenBusquedaPorOrigen(rutaSessionBean.getorigen());
				rutaSessionBean.setorigen("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorPrecio")) {
				this.setprecioBusquedaPorPrecio(rutaSessionBean.getprecio());
				rutaSessionBean.setprecio(0.0);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rutaSessionBean.getid_empresa());
				rutaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(rutaSessionBean.getid_pais());
				rutaSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSectorDestino")) {
				this.setid_sector_destinoFK_IdSectorDestino(rutaSessionBean.getid_sector_destino());
				rutaSessionBean.setid_sector_destino(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSectorOrigen")) {
				this.setid_sector_origenFK_IdSectorOrigen(rutaSessionBean.getid_sector_origen());
				rutaSessionBean.setid_sector_origen(-1L);
			}
		}
		
		this.rutaSessionBean.setsUltimaBusquedaRuta("");
		this.rutaSessionBean.setiNumeroPaginacion(RutaConstantesFunciones.INUMEROPAGINACION);
		this.rutaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRuta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRuta() {
		this.updateBorderResaltarBusquedasFormularioRuta();
		this.updateVisibilidadBusquedasFormularioRuta();
		this.updateHabilitarBusquedasFormularioRuta();
	}
	
	public void updateBorderResaltarBusquedasFormularioRuta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRuta.getComponents().length>0) {
	

		if(this.rutaConstantesFunciones.resaltarBusquedaPorDestinoRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorDestinoRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorDestinoRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarBusquedaPorNombreRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorNombreRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorNombreRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarBusquedaPorOrigenRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorOrigenRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorOrigenRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarBusquedaPorPrecioRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorPrecioRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorPrecioRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarFK_IdPaisRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdPaisRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdPaisRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarFK_IdSectorDestinoRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorDestinoRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdSectorDestinoRuta);
			}
		}

		if(this.rutaConstantesFunciones.resaltarFK_IdSectorOrigenRuta!=null) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorOrigenRuta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdSectorOrigenRuta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRuta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRuta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorDestinoRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarBusquedaPorDestinoRuta);
			if(!this.rutaConstantesFunciones.mostrarBusquedaPorDestinoRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorNombreRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarBusquedaPorNombreRuta);
			if(!this.rutaConstantesFunciones.mostrarBusquedaPorNombreRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorOrigenRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarBusquedaPorOrigenRuta);
			if(!this.rutaConstantesFunciones.mostrarBusquedaPorOrigenRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorPrecioRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarBusquedaPorPrecioRuta);
			if(!this.rutaConstantesFunciones.mostrarBusquedaPorPrecioRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdPaisRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarFK_IdPaisRuta);
			if(!this.rutaConstantesFunciones.mostrarFK_IdPaisRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorDestinoRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarFK_IdSectorDestinoRuta);
			if(!this.rutaConstantesFunciones.mostrarFK_IdSectorDestinoRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorOrigenRuta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutaConstantesFunciones.mostrarFK_IdSectorOrigenRuta);
			if(!this.rutaConstantesFunciones.mostrarFK_IdSectorOrigenRuta && index>-1) {
				this.jTabbedPaneBusquedasRuta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRuta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRuta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorDestinoRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarBusquedaPorDestinoRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarBusquedaPorDestinoRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorNombreRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarBusquedaPorNombreRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarBusquedaPorNombreRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorOrigenRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarBusquedaPorOrigenRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarBusquedaPorOrigenRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorPrecioRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarBusquedaPorPrecioRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarBusquedaPorPrecioRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdPaisRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarFK_IdPaisRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarFK_IdPaisRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorDestinoRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarFK_IdSectorDestinoRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarFK_IdSectorDestinoRuta);
			}

			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorOrigenRuta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutaConstantesFunciones.activarFK_IdSectorOrigenRuta);
				this.jTabbedPaneBusquedasRuta.setEnabledAt(index,this.rutaConstantesFunciones.activarFK_IdSectorOrigenRuta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRuta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorDestino")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorDestinoRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarBusquedaPorDestinoRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorDestinoRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorNombreRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarBusquedaPorNombreRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorNombreRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorOrigen")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorOrigenRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarBusquedaPorOrigenRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorOrigenRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorPrecio")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelBusquedaPorPrecioRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarBusquedaPorPrecioRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarBusquedaPorPrecioRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdPaisRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarFK_IdPaisRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdPaisRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSectorDestino")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorDestinoRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarFK_IdSectorDestinoRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdSectorDestinoRuta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSectorOrigen")) {
			index= this.jTabbedPaneBusquedasRuta.indexOfComponent(this.jPanelFK_IdSectorOrigenRuta);

			this.jTabbedPaneBusquedasRuta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRuta.getComponent(index);

			this.rutaConstantesFunciones.setResaltarFK_IdSectorOrigenRuta(resaltar);

			jPanel.setBorder(this.rutaConstantesFunciones.resaltarFK_IdSectorOrigenRuta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRuta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRuta() throws Exception {

		if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRuta();
		this.updateVisibilidadResaltarControlesFormularioRuta();
		this.updateHabilitarResaltarControlesFormularioRuta();
		
	}
	
	public void updateBorderResaltarControlesFormularioRuta() throws Exception {
		if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rutaConstantesFunciones.resaltaridRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jLabelidRuta.setBorder(this.rutaConstantesFunciones.resaltaridRuta);}
		if(this.rutaConstantesFunciones.resaltarid_empresaRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setBorder(this.rutaConstantesFunciones.resaltarid_empresaRuta);}
		if(this.rutaConstantesFunciones.resaltarid_paisRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setBorder(this.rutaConstantesFunciones.resaltarid_paisRuta);}
		if(this.rutaConstantesFunciones.resaltarid_ciudadRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setBorder(this.rutaConstantesFunciones.resaltarid_ciudadRuta);}
		if(this.rutaConstantesFunciones.resaltarid_sector_origenRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setBorder(this.rutaConstantesFunciones.resaltarid_sector_origenRuta);}
		if(this.rutaConstantesFunciones.resaltarid_sector_destinoRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setBorder(this.rutaConstantesFunciones.resaltarid_sector_destinoRuta);}
		if(this.rutaConstantesFunciones.resaltarnombreRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setBorder(this.rutaConstantesFunciones.resaltarnombreRuta);}
		if(this.rutaConstantesFunciones.resaltarorigenRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setBorder(this.rutaConstantesFunciones.resaltarorigenRuta);}
		if(this.rutaConstantesFunciones.resaltardestinoRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setBorder(this.rutaConstantesFunciones.resaltardestinoRuta);}
		if(this.rutaConstantesFunciones.resaltarprecioRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setBorder(this.rutaConstantesFunciones.resaltarprecioRuta);}
		if(this.rutaConstantesFunciones.resaltardireccionRuta!=null && this.jInternalFrameDetalleFormRuta!=null) {this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setBorder(this.rutaConstantesFunciones.resaltardireccionRuta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRuta() throws Exception {		
		if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
	
		//this.jInternalFrameDetalleFormRuta.jLabelidRuta.setVisible(this.rutaConstantesFunciones.mostraridRuta);
		this.jInternalFrameDetalleFormRuta.jPanelidRuta.setVisible(this.rutaConstantesFunciones.mostraridRuta);
		//this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setVisible(this.rutaConstantesFunciones.mostrarid_empresaRuta);
		this.jInternalFrameDetalleFormRuta.jPanelid_empresaRuta.setVisible(this.rutaConstantesFunciones.mostrarid_empresaRuta);
		//this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setVisible(this.rutaConstantesFunciones.mostrarid_paisRuta);
		this.jInternalFrameDetalleFormRuta.jPanelid_paisRuta.setVisible(this.rutaConstantesFunciones.mostrarid_paisRuta);
		//this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setVisible(this.rutaConstantesFunciones.mostrarid_ciudadRuta);
		this.jInternalFrameDetalleFormRuta.jPanelid_ciudadRuta.setVisible(this.rutaConstantesFunciones.mostrarid_ciudadRuta);
		//this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setVisible(this.rutaConstantesFunciones.mostrarid_sector_origenRuta);
		this.jInternalFrameDetalleFormRuta.jPanelid_sector_origenRuta.setVisible(this.rutaConstantesFunciones.mostrarid_sector_origenRuta);
		//this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setVisible(this.rutaConstantesFunciones.mostrarid_sector_destinoRuta);
		this.jInternalFrameDetalleFormRuta.jPanelid_sector_destinoRuta.setVisible(this.rutaConstantesFunciones.mostrarid_sector_destinoRuta);
		//this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setVisible(this.rutaConstantesFunciones.mostrarnombreRuta);
		this.jInternalFrameDetalleFormRuta.jPanelnombreRuta.setVisible(this.rutaConstantesFunciones.mostrarnombreRuta);
		//this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setVisible(this.rutaConstantesFunciones.mostrarorigenRuta);
		this.jInternalFrameDetalleFormRuta.jPanelorigenRuta.setVisible(this.rutaConstantesFunciones.mostrarorigenRuta);
		//this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setVisible(this.rutaConstantesFunciones.mostrardestinoRuta);
		this.jInternalFrameDetalleFormRuta.jPaneldestinoRuta.setVisible(this.rutaConstantesFunciones.mostrardestinoRuta);
		//this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setVisible(this.rutaConstantesFunciones.mostrarprecioRuta);
		this.jInternalFrameDetalleFormRuta.jPanelprecioRuta.setVisible(this.rutaConstantesFunciones.mostrarprecioRuta);
		//this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setVisible(this.rutaConstantesFunciones.mostrardireccionRuta);
		this.jInternalFrameDetalleFormRuta.jPaneldireccionRuta.setVisible(this.rutaConstantesFunciones.mostrardireccionRuta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRuta() throws Exception {
		if(this.jInternalFrameDetalleFormRuta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRuta!=null) {
	
		this.jInternalFrameDetalleFormRuta.jLabelidRuta.setEnabled(this.rutaConstantesFunciones.activaridRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_empresaRuta.setEnabled(this.rutaConstantesFunciones.activarid_empresaRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_paisRuta.setEnabled(this.rutaConstantesFunciones.activarid_paisRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_ciudadRuta.setEnabled(this.rutaConstantesFunciones.activarid_ciudadRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_origenRuta.setEnabled(this.rutaConstantesFunciones.activarid_sector_origenRuta);
		this.jInternalFrameDetalleFormRuta.jComboBoxid_sector_destinoRuta.setEnabled(this.rutaConstantesFunciones.activarid_sector_destinoRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreanombreRuta.setEnabled(this.rutaConstantesFunciones.activarnombreRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreaorigenRuta.setEnabled(this.rutaConstantesFunciones.activarorigenRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreadestinoRuta.setEnabled(this.rutaConstantesFunciones.activardestinoRuta);
		this.jInternalFrameDetalleFormRuta.jTextFieldprecioRuta.setEnabled(this.rutaConstantesFunciones.activarprecioRuta);
		this.jInternalFrameDetalleFormRuta.jTextAreadireccionRuta.setEnabled(this.rutaConstantesFunciones.activardireccionRuta);
		}
	}
	
		
}